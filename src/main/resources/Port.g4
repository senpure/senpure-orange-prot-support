grammar Port;
protocol    :
    entity*EOF
    ;
entity:bean|message;
bean:
    entityComment*
    beanName '{'
    field+
    '}';
message:
    entityComment*
    messageName'('port ','command')' '{'
        request?
        response?
    '}';
request:'req'('{'
field*
'}')?
;

response:'res'('{'
field*
'}')?
;
messageName:MessageName;
beanName:BeanName;
port:Number;
command:Number;
field
    :fieldType fieldList? fieldName ';'fieldComment?
    ;

fieldList:'['']';
fieldName:Identifier|'p_'|'msg_'|'req'|'res';
entityComment:LINE_COMMENT;
fieldComment:LINE_COMMENT;
fieldType
    :'int'
    |'int8'
    |'short'
    |'int16'
    |'int32'
    |'int64'
    |'long'
    |'float'
    |'double'
    |'boolean'
    |'bool'
    |'String'
    |'string'
    |BeanName
    ;
Number:[0-9]+;
fragment Letter:	[a-zA-Z_] ;
fragment LetterOrDigit:	[a-zA-Z0-9_] ;
BeanName:'p_' Letter LetterOrDigit*;
MessageName:'msg_' Letter LetterOrDigit*;
Identifier:	Letter LetterOrDigit* ;

WS      :  [ \t\r\n]+ -> skip ;
COMMENT :   '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~[\r\n]*;