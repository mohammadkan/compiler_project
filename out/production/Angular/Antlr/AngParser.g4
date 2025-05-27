parser grammar AngParser;

options { tokenVocab=AngLexer; }

app : (importR | variable | function | exports | enum | interfaceCode)*  ;
importR: IMPORT OPEN_BRACE (((ID) COMMA?)* SIGNAL? COMMA? ((ID) COMMA?)*) CLOSE_BRACE FROM SingleLineString SIME;

exports : decorater* EXPORT CLASS ID ((IMPLEMENT | EXTEND) ID)? OPEN_BRACE classBody CLOSE_BRACE;

classBody: (constructor | variable | function | interfaceCode)* ;

decorater
  : AT COMPONENT OPEN_PAREN componentConfig CLOSE_PAREN
  | AT DIRECTIVE OPEN_PAREN directiveConfig CLOSE_PAREN
  | AT INJECTABLE OPEN_PAREN injectableConfig CLOSE_PAREN
  ;
componentConfig: OPEN_BRACE selector COMMA (templateUrl | template) (COMMA styleUrls)? CLOSE_BRACE ;
directiveConfig: OPEN_BRACE selector CLOSE_BRACE ;
injectableConfig: OPEN_BRACE PROVIDEDIN COLON (PROVIDED_IN_ROOT | PROVIDED_IN_PLATFORM | PROVIDED_IN_ANY | SingleLineString) CLOSE_BRACE ;

selector: SELECTOR COLON SingleLineString ;
templateUrl: TEMPLATEURL COLON SingleLineString ;
template: TEMPLATE COLON  (SingleLineString | value) ;
styleUrls: (STYLES | STYLE) COLON array ;

map: OPEN_BRACE (((ID) COLON value) COMMA?)* CLOSE_BRACE ;

value: subValue | array | B_C html B_C; // html body is third choice
array: OPEN_SQUARE (subValue COMMA?)* CLOSE_SQUARE ;

subValue: SingleLineString | ID | DECIMEL | B_C cssCode+ B_C ;


variable: (LET | VAR | CONST)? (PRIVATE | PUBLIC)? ID (COLON (DATATYPE_? | vv | OPEN_SQUARE (dd COMMA?)* CLOSE_SQUARE) (OPEN_SQUARE CLOSE_SQUARE)?)? EQUAL variableValue SIME;

variableValue: NEW? (SingleLineString | DECIMEL | ID | array | map | thisCall | function2 | NEW? callFun | function) (OPEN_PAREN vv* CLOSE_PAREN)? ;

constructor : CONSTRUCTOR OPEN_PAREN ((PRIVATE | PUBLIC)? vv (COLON (DATATYPE_ | ID))? COMMA?)* CLOSE_PAREN OPEN_BRACE functionBody CLOSE_BRACE;

vv: ID ;

function: FUNCTION? ID? OPEN_PAREN functionParams* CLOSE_PAREN (COLON (DATATYPE_ | vv | OPEN_SQUARE (dd COMMA?)* CLOSE_SQUARE) (OPEN_SQUARE CLOSE_SQUARE)?)? OPEN_BRACE functionBody returnStatement? CLOSE_BRACE;
function2: OPEN_PAREN functionParams* CLOSE_PAREN (COLON (DATATYPE_ | vv | OPEN_SQUARE (dd COMMA?)* CLOSE_SQUARE) (OPEN_SQUARE CLOSE_SQUARE)?)? ARROW OPEN_BRACE? functionBody returnStatement? CLOSE_BRACE?;
dd : DATATYPE_ ;
functionParams: vv (COLON (DATATYPE_ | ID))? COMMA?;

functionBody: (variable | thisCall | print | callFun)* ;

thisCall: (THIS | ID) (DOT ID DOT?)* (variableValue | dotdot* | PLPL) SIME?;

dotdot: ((DOT ID)? (OPEN_PAREN ((vv | SingleLineString | function2) COMMA?)* CLOSE_PAREN)) ;

print: CONSOLE_ DOT LOG_ OPEN_PAREN (SingleLineString | thisCall) CLOSE_PAREN SIME ;

returnStatement: RETURN? (thisCall | SingleLineString | DECIMEL | ID | array) SIME?;

// -------------------------------------------------------------------------------------
//**
/************************************* this is html and any new **************************************/





html:(html_open ((html)* |  ((SingleLineString COLON? | ID COLON?)* OPEN_BRACE OPEN_BRACE (thisCall)?  CLOSE_BRACE CLOSE_BRACE) DOLLAR?)  html_close) | (html_single_line)    ;
html_open: JSX_OPEN SYNTAX (htmlClass | ngFor | ngIf | click)*  JSX_CLOSE;
html_close: JSX_OPEN JSX_SLASH SYNTAX  JSX_CLOSE;
html_single_line:JSX_OPEN SYNTAX (htmlClass | src)* JSX_SLASH JSX_CLOSE;
ngIf:MULTI NGIF EQUAL SingleLineString ;
ngFor:MULTI NGFOR EQUAL SingleLineString  ;
src:OPEN_SQUARE SRC CLOSE_SQUARE EQUAL  SingleLineString;
htmlClass : ((SingleLineString | CLASS) EQUAL OPEN_BRACE? value2 CLOSE_BRACE?) ; // here class => SingleLineString
click:OPEN_PAREN CLICKK CLOSE_PAREN EQUAL SingleLineString;


htmlDot :OPEN_BRACE? ID DOT ID CLOSE_BRACE?;
htmlVar :OPEN_BRACE? ID CLOSE_BRACE?;
htmlinside : sy? (htmlID | htmlClass)* ;
htmlID : (MULTI? (ID) EQUAL OPEN_BRACE? value2 CLOSE_BRACE?) ;
/************************************* this is html and any new **************************************/



sy : ID  ;

value2 : (onClick | attributeValue | ID DOT ID ) ;

onClick: OPEN_BRACE (function2) CLOSE_BRACE | OPEN_BRACE (ID) CLOSE_BRACE ;

attributeValue: SingleLineString
              | NUMBER
              | ID;

htmlBody : OPEN_BRACE (mapMethod2 | hh) CLOSE_BRACE;

hh : ID AND OPEN_PAREN html CLOSE_PAREN;

mapMethod2 : (ID DOT)* MAP_ OPEN_PAREN OPEN_PAREN mapParam?  CLOSE_PAREN ARROW  OPEN_PAREN html CLOSE_PAREN CLOSE_PAREN ;
mapParam : (ID COMMA?)* ;

callFun: AWAIT? (ID | ID DOT ID) OPEN_PAREN ((ID | SingleLineString | map | callFun) COMMA?)* CLOSE_PAREN SIME ;

// -----------------------------------------------------------------------------------------------

cssCode : ((DOT | SQ)? cssKey)* OPEN_BRACE cssInner* CLOSE_BRACE ;

cssKey :  (sy (MINUS sy)+) | ID | WIDTH | SYNTAX;

cssInner: cssKey COLON (ID | (NUMBER PX?)+ | (NUMBER HUN) | callFun) SIME? ;

// -----------------------------------------------------------------------------------------------

enum: ENUM sy OPEN_BRACE (ID COMMA?)* CLOSE_BRACE ;
interfaceCode: INTERFACE sy OPEN_BRACE (ID COLON (DATATYPE_ | vv) SIME)* CLOSE_BRACE ;