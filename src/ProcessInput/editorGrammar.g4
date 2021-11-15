grammar editorGrammar;

// Lexing rules (Must be upper case)
ALPHA: [a-zA-Z]+;
NUMERIC: [0-9]+;
ALPHANUMERIC: [a-zA-Z0-9]+;
WHITESPACE: [ \n\t\r]+ -> skip;

COLON: ':';          SEMICOLON: ';';
LB_SQUARE: '[';      RB_SQUARE: ']';
LB_SHARP: '<';       RB_SHARP: '>';
LB_CURLY: '{';       RB_CURLY: '}';
LB_ROUND: '(';       RB_ROUND: ')';
QUOTES: '"';         UNDERSCORE: '_';
COMMA: ',';          DOT: '.';
PLUS: '+';           Minus: '-';

// Can convert some of these to parsing rules
INT: NUMERIC;
FLOAT: NUMERIC DOT NUMERIC | DOT NUMERIC;
NUMBER: INT | FLOAT;
STRING: QUOTES (~('"'))* QUOTES;
BOOL: 'TRUE' | 'FALSE';
VAR: NUMBER | STRING | BOOL;
AND: 'AND' | '&&';
OR: 'OR' | '||';
NOT: 'NOT' | '!';

ID: LB_SHARP ALPHANUMERIC RB_SHARP;
FLAG: UNDERSCORE ALPHANUMERIC;
VALUE: LB_ROUND ALPHANUMERIC COLON VAR RB_ROUND;

OBJECT_TAG: LB_SQUARE 'object' RB_SQUARE;
ROOM_TAG: LB_SQUARE 'room' RB_SQUARE;
ACTION_TAG: LB_SQUARE 'action' RB_SQUARE;
COND_TAG: '_COND_';
EFFECT_TAG: '_EFF_';

ID_KEY: 'ID' COLON;
LOC_KEY: 'LOCATION' COLON;
NAME_KEY: 'NAME' COLON;
DESC_KEY: 'DESC' COLON;
FLAGS_KEY: 'FLAGS' COLON;
VALUES_KEY: 'VALUES' COLON;
DIR_KEY: 'N' COLON | 'S' COLON | 'E' COLON | 'W' COLON | 'U' COLON | 'D' COLON;
ACTION_KEY: 'ACTION' COLON;

// Condition type keys
PRSA_COND: 'PRSA' COLON;
PRSO_COND: 'PRSO' COLON;
PRSI_COND: 'PRSI' COLON;
HERE_COND: 'HERE' COLON;
ANDFLAGS_COND: 'ANDFLAGS' COLON;
ORFLAGS_COND: 'ORFLAGS' COLON;
HAVEITEM_COND: 'HAVEITEM' COLON;
HAVEITEMS_COND: 'HAVEITEMS' COLON;
EQUALS_COND: 'EQUALS' COLON;
GT_COND: 'GT' COLON;
LT_COND: 'LT' COLON;

// Effect type keys
TELL_EFF: 'TELL' COLON;
GOTO_EFF: 'GOTO' COLON;
SETFLAG_EFF: 'SETFLAG' COLON;
REMFLAG_EFF: 'REMFLAG' COLON;
TAKE_EFF: 'TAKE' COLON;
PLACE_EFF: 'PLACE' COLON;
SET_EFF: 'SET' COLON;

// Parsing rules (Must be lower case)
id_entry: ID_KEY ID SEMICOLON;
loc_entry: LOC_KEY ID SEMICOLON;
name_entry: NAME_KEY STRING SEMICOLON;
desc_entry: DESC_KEY STRING SEMICOLON | /* epsilon */;
flags_entry: FLAGS_KEY FLAG (COMMA FLAG)* SEMICOLON | /* epsilon */;
values_entry: VALUES_KEY value (COMMA value)* SEMICOLON| /* epsilon */;
dir_entry: DIR_KEY ID SEMICOLON (DIR_KEY ID SEMICOLON)*;
action_entry: ACTION_KEY action_block SEMICOLON;

value: LB_ROUND ALPHANUMERIC COLON VAR RB_ROUND;

object: OBJECT_TAG LB_CURLY
            id_entry
            loc_entry
            name_entry
            desc_entry
            flags_entry
            values_entry
            RB_CURLY;

// May want to add conditions to directions
room: ROOM_TAG LB_CURLY
            id_entry
            dir_entry
            name_entry
            desc_entry
            RB_CURLY;

action: ACTION_TAG LB_CURLY
        id_entry
        action_entry
        RB_CURLY;
action_block: effects
              | effects action_block
              | conditional
              | conditional action_block;
conditional: COND_TAG LB_SHARP conditions RB_SHARP LB_CURLY action_block RB_CURLY;
conditions: condition_aux
            | condition_aux AND conditions
            | condition_aux OR conditions;
effects: effect_aux
         | effect_aux effects;
effect_aux: EFFECT_TAG LB_SHARP effect RB_SHARP;
condition_aux: condition
               | NOT condition;

// condition bodies
prsa_cond: PRSA_COND ALPHA (COMMA ALPHA)*;
prso_cond: PRSO_COND ID (COMMA ID)*;
prsi_cond: PRSI_COND ID (COMMA ID)*;
here_cond: HERE_COND ID (COMMA ID)*;
andflags_cond: ANDFLAGS_COND FLAG (COMMA FLAG)*;
orflags_cond: ORFLAGS_COND FLAG (COMMA FLAG)*;
haveitem_cond: HAVEITEM_COND ID (COMMA ID)*;
haveitems_cond: HAVEITEMS_COND ID (COMMA ID)*;
equals_cond: EQUALS_COND ALPHANUMERIC COMMA VALUE
             | EQUALS_COND ALPHANUMERIC COMMA ALPHANUMERIC;
gt_cond: GT_COND ALPHANUMERIC COMMA VALUE
         | GT_COND ALPHANUMERIC COMMA ALPHANUMERIC;
lt_cond: LT_COND ALPHANUMERIC COMMA VALUE
         | LT_COND ALPHANUMERIC COMMA ALPHANUMERIC;

condition: prsa_cond|prso_cond|prsi_cond|here_cond|andflags_cond|orflags_cond|haveitem_cond|haveitems_cond|equals_cond|gt_cond|lt_cond;

// effect bodies
tell_eff: TELL_EFF STRING;
goto_eff: GOTO_EFF ID;
setflag_eff: SETFLAG_EFF FLAG;
remflag_eff: REMFLAG_EFF FLAG;
take_eff: TAKE_EFF ID;
place_eff: PLACE_EFF ID COMMA ID;
set_eff: SET_EFF ALPHANUMERIC COMMA VAR;

effect: tell_eff|goto_eff|setflag_eff|remflag_eff|take_eff|place_eff|set_eff;

// Entry point
game_grammar: room (room | object | action)*;
