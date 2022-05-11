grammar Gramatyka;

prog: ( stat? NEWLINE )*
;

stat:	WRITE ID		        #write
	    | ID EQ someValues		#assign
        | READ ID   		    #read
        | wrongStatement        #wrongStat
        | typeArray ID EQ '[' arrayDeclaration ']'     #declareArray
        |WRITE ID '[' INT ']'   #writeArrayAt
        | 'string' ID EQ STRING #newString
        | WRITE STRING          #writeString
        ;

wrongStatement: ID
                | EQ
                | ADD
                | SUB
                | MUL
                | DIV
                | FLOAT
                | INT
;

someValues: someValues2                     #somevaluesDefault
            | someValues2 ADD someValues   #somevaluesAdd
            | someValues2 SUB someValues   #somevaluesSub
;

someValues2: value                     #somevalues2Default
        | value MUL someValues2       #somevaluesMul
        | value DIV someValues2       #somevaluesDiv
;

value: INT                  #valueInt
       | FLOAT              #valueFloat
       | ID                 #valueID
       | '(' someValues ')' #valueBrackets
;

typeArray: 'intArray'   #intArray
        | 'floatArray'  #floatArray
 ;

arrayDeclaration: INT (',' INT )*       #arrayValueInt
| FLOAT (',' FLOAT )*                    #arrayValueFloat
;



WRITE:	'write'
;

READ:	'read'
;

STRING: '"'[a-zA-Z ]*'"'
;

ID:   ('a'..'z'|'A'..'Z')+
;

NEWLINE:	'\r'? '\n'
;

WS: (' '|'\t')+ -> skip
;

EQ: '='
;

DIV: ':'
;

MUL: '*'
;

ADD: '+'
;

SUB: '-'
;

FLOAT: '-'?'0'..'9'+'.''0'..'9'+
;

INT: '-'?'0'..'9'+
;