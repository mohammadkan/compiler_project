lexer grammar AngLexer;

@members {
    private boolean CheckNotOpenBrace() {
        if (this._input.LA(1) == '{') {
            return false;
        }
        return true;
    }
}
NGIF: 'ngIf';
NGFOR: 'ngFor';
COMMA: ',';
OPEN_SQUARE: '[';
CLOSE_SQUARE: ']';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_PAREN: '(' ;
CLOSE_PAREN: ')';
AT : '@';
THIS : 'this';
COLON: ':';
DOT: '.';
ARROW: '=>';
EQUAL: '=';
MINUS: '-';
NEQUAL: '=!';
NOT: '!';
OR: '||';
AND: '&&';
PLUS: '+';
PLE: '+=';
PLPL: '++';
QUESTION: '?';
SIME: ';';
DOLLAR: '$';
MULTI: '*';
SQ: '#';
S_C: '\'' ;
D_C : '"';
B_C : '`';
PX : 'px';
HUN : '%';
SRC:'src';
EXPENSES:'expenses';
ENUM:'enum';
COMPONENT : 'Component';
DIRECTIVE:'Directive';
CONST: 'const';
FUNCTION: 'function';
RETURN: 'return';
PRIVATE: 'private';
PUBLIC: 'public';
INJECTABLE : 'Injectable' ;
IF: 'if';
ELSE: 'else';
NEW: 'new';
FOR: 'for';
WHILE: 'while';
CLASS: 'class';
VAR: 'var';
NULL : 'null' ;
LET: 'let';
EXPORT: 'export' ;
DEFAULT: 'default';
IMPORT: 'import';
DOCUMNET: 'document';
FROM: 'from';
ASYNC : 'async' ;
AWAIT : 'await' ;

JSX_OPEN: '<';
JSX_CLOSE: '>';
JSX_SLASH: '/';

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]*;

TYPE: 'type';
INTERFACE: 'interface';
DATATYPE_:'string' |'number' | 'boolean' | 'any' | 'void' ;
SIGNAL : 'Signal' ;
RESOURCE : 'Resource';
//IMPORTS : 'imports';
IMPLEMENT  : 'implements ';
EXTEND : 'extend';
//TEMPLATE : 'template';
STYLE : 'styles' ;
TEMPLATE: 'template';
TEMPLATEURL: 'templateUrl';
STYLES: 'styleUrls';
SELECTOR: 'selector';
PROVIDEDIN: 'providedIn';
PROVIDED_IN_ROOT: '\'root\'';
PROVIDED_IN_PLATFORM: '\'platform\'';
PROVIDED_IN_ANY: '\'any\'';
STYLEURL : 'styleUrl' ;
CONSTRUCTOR : 'constructor' ;
CONSOLE_:'console';
LOG_:'log';
INPUT_:'input';
ONCHANGE_:'onChange';
VALUE_:'value';
PLACEHOLDER_:'placeholder';
DISABLED_:'disabled ';
ONFOCUS_:'onFocus';
ONCLICK_:'onclick';
CLICKK: 'click';
HEIGHT: 'height';
WIDTH: 'width';
BUTTON_:'button';
MAP_:'map';
//CLASS_NAME:'className';

OPERATION:PLUS|MINUS|PLPL|'--'|PLE|'-='|MULTI|'==';
SYNTAX : 'div' |'li' |'p' |'ul' |SIZE_FONT | 'main' | 'BrowserRouter' | 'Switch' | 'Route' | 'img';
//FUNCTION_NAME : WORD+  ;
NUMBER:DIGIT+;
STRING: '\'' (~["])* '\'';
HEX_NUMBER : '0x' HEX_DIGIT+ | '0X' HEX_DIGIT+ ;
DECIMEL : '0' .. '9';



fragment WORD: LETTER | '_' | DIGIT  ;
fragment LETTER : 'a' .. 'z' | 'A' .. 'Z'  ;
fragment DIGIT : '0' .. '9' ;
SingleLineString : StringDQ | StringSQ | 'r\'' (~('\'' | '\n' | '\r'))* '\'' | 'r"' (~('"' | '\n' | '\r'))* '"' ;
MultiLineString : '"""' StringContentTDQ*? '"""' | '\'\'\'' StringContentTSQ*? '\'\'\'' | 'r"""' (~'"' | '"' ~'"' | '""' ~'"')* '"""' | 'r\'\'\'' (~'\'' | '\'' ~'\'' | '\'\'' ~'\'')* '\'\'\'' ;
fragment StringDQ : '"' StringContentDQ*? '"' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$')
                         | '\\' ~('\n' | '\r')
                         | '${' StringContentDQ*? '}'
                         | '$' { CheckNotOpenBrace() }? ;

fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$')
                         | '\\' ~('\n' | '\r')
                         | '${' StringContentSQ*? '}'
                         | '$' { CheckNotOpenBrace() }? ;
fragment StringContentTDQ : ~('\\' | '"') | '"' ~'"' | '""' ~'"' ;
fragment StringContentTSQ : '\'' ~'\'' | '\'\'' ~'\'' | . ;
fragment HEX_DIGIT : 'a' .. 'f' | 'A' .. 'F' | DIGIT ;
fragment SIZE_FONT : 'h1'|'h2'|'h3'|'h4'|'h5'|'h6' ;
fragment NEWLINE : '\n' | '\r' | '\r\n' ;
fragment TEXT:WORD+;
ID: [a-zA-Z_][a-zA-Z0-9_]*;