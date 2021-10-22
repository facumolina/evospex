// Define the Expressions Grammar
grammar ExprGrammar;

parse
  :  expr EOF
  ;

expr:
  qt_expr
  | expr num_binary_op expr
  | expr compare_op expr
  | '('expr')'  binary_op '('expr')'
  | expr binary_op expr
  | unary_op '(' expr ')'
  | '('set_expr')' set_binary_op '('set_expr')'
  | '('expr')'
  | set_expr
  | name
  | number
  ;

qt_expr:
  quantifier name ':' set_expr ':' expr
  | quantifier name ':' collection ':' expr
  ;

set_expr:
  name '.' closure_op '(' closure_field ')'
  | name '.' closure_op '(' closure_field ').' name
  ;

collection:
  name
  ;

num_binary_op:
  '+'
  | '-'
  | '*'
  | '/'
  | '%'
  ;

binary_op:
  '||'
  | 'or'
  | '&&'
  | 'and'
  | 'implies'
  | '=>'
  | 'iff'
  | 'xor'
  ;

set_binary_op:
  '&'
  ;

compare_op:
  '='
  | '!='
  | 'in'
  | 'not in'
  | '<'
  | '>'
  | '<='
  | '>='
  ;

unary_op:
  '!'
  | 'not'
  | 'no'
  | '#'
  ;

closure_op:
  '*'
  | '^'
  ;

quantifier:
  'all'
  | 'some'
  | 'lone'
  | 'one'
  | 'no'
  ;

name:
  ID
  | ID '.' name
  ;

closure_field:
  ID
  | ID '+' closure_field
  ;

UNSIGNED_NUMBER:  ('0' .. '9') + ('.' ('0' .. '9') +)?;

ID
  : ID_START ID_CHAR*
  ;

ID_START:
  [A-Z] 
  | [a-z]
  | '_'
  ;

ID_CHAR: 
  ID_START 
  | [0-9]
  ;

number:
  '-' UNSIGNED_NUMBER
  | UNSIGNED_NUMBER
  ;



WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
