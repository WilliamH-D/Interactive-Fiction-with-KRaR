grammar EditorGrammar;

// Lexing rules (Must be upper case)
COLON: ':';          SEMICOLON: ';';
LB_SQUARE: '[';      RB_SQUARE: ']';
LB_SHARP: '<';       RB_SHARP: '>';
LB_CURLY: '{';       RB_CURLY: '}';
LB_ROUND: '(';       RB_ROUND: ')';
QUOTES: '"';         UNDERSCORE: '_';
COMMA: ',';          DOT: '.';
PLUS: '+';           MINUS: '-';
BAR: '|';             ANDPERSAND: '&';

TRUE: 'TRUE';        FALSE: 'FALSE';
AND: ANDPERSAND ANDPERSAND;
OR: BAR BAR;
NOT:'!';

COND_TAG: 'COND';
EFFECT_TAG: 'EFF';

ALPHA: [a-zA-Z]+;
NUMERIC: [0-9]+;
ALPHANUMERIC: [a-zA-Z0-9]+;
WHITESPACE: [ \n\t\r]+ -> skip;

STRING: QUOTES (~('"'))* QUOTES;
ID: LB_SHARP ALPHANUMERIC RB_SHARP;

OBJECT_TAG: LB_SQUARE 'object' RB_SQUARE;
ROOM_TAG: LB_SQUARE 'room' RB_SQUARE;
ACTION_TAG: LB_SQUARE 'action' RB_SQUARE;
FLAG_TAG: LB_SQUARE 'flag' RB_SQUARE;

ID_KEY: 'ID' COLON;
LOC_KEY: 'LOCATION' COLON;
NAME_KEY: 'NAME' COLON;
DESC_KEY: 'DESC' COLON;
FLAGS_KEY: 'FLAGS' COLON;
FLAG_KEY: 'FLAG' COLON;
VALUES_KEY: 'VALUES' COLON;
VALUE_KEY: 'VALUE' COLON;
DIR_KEY: 'N' COLON | 'S' COLON | 'E' COLON | 'W' COLON | 'U' COLON | 'D' COLON;
ACTION_KEY: 'ACTION' COLON;

// Condition type keys
PRSA_COND: 'PRSA' COLON;
PRSO_COND: 'PRSO' COLON;
PRSI_COND: 'PRSI' COLON;
HERE_COND: 'HERE' COLON;
ANDFLAGS_COND: 'ANDFLAGS' COLON;
ORFLAGS_COND: 'ORFLAGS' COLON;
FLAGVALUE_COND: 'FLAGVALUE' COLON;
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
alpha_numeric: ALPHA | NUMERIC | ALPHANUMERIC;
num_int: NUMERIC;
num_float: NUMERIC DOT NUMERIC | DOT NUMERIC;
number: num_int | num_float;
bool: TRUE | FALSE;
var: number | STRING | bool;
value: LB_ROUND alpha_numeric COLON var RB_ROUND;
flag: UNDERSCORE alpha_numeric;

id_entry: ID_KEY ID SEMICOLON;
loc_entry: LOC_KEY ID SEMICOLON;
name_entry: NAME_KEY STRING SEMICOLON;
desc_entry: DESC_KEY STRING SEMICOLON | /* epsilon */;
flags_entry: FLAGS_KEY flag (COMMA flag)* SEMICOLON | /* epsilon */;
values_entry: VALUES_KEY value (COMMA value)* SEMICOLON | /* epsilon */;
dir_entry: DIR_KEY ID SEMICOLON (DIR_KEY ID SEMICOLON)*;
action_entry: ACTION_KEY action_block SEMICOLON;
global_flag_entry: FLAG_KEY flag SEMICOLON;
flag_val_entry: VALUE_KEY num_int SEMICOLON | /* epsilon*/;

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

global_flag: FLAG_TAG LB_CURLY
        global_flag_entry
        flag_val_entry
        RB_CURLY;

action_block: effect_aux
              | effect_aux action_block
              | conditional
              | conditional action_block;
conditional: COND_TAG LB_SHARP conditions RB_SHARP LB_CURLY action_block RB_CURLY;
conditions: condition_aux
            | condition_aux AND conditions
            | condition_aux OR conditions;
effect_aux: EFFECT_TAG LB_SHARP effect RB_SHARP;
condition_aux: condition
               | NOT condition;

// condition bodies
prsa_cond: PRSA_COND ALPHA (COMMA ALPHA)*;
prso_cond: PRSO_COND ID (COMMA ID)*;
prsi_cond: PRSI_COND ID (COMMA ID)*;
here_cond: HERE_COND ID (COMMA ID)*;
andflags_cond: ANDFLAGS_COND flag (COMMA flag)*;
orflags_cond: ORFLAGS_COND flag (COMMA flag)*;
flagvalue_cond: FLAGVALUE_COND flag COMMA num_int;
haveitem_cond: HAVEITEM_COND ID (COMMA ID)*;
haveitems_cond: HAVEITEMS_COND ID (COMMA ID)*;
equals_cond: EQUALS_COND alpha_numeric COMMA var
             | EQUALS_COND alpha_numeric COMMA alpha_numeric;
gt_cond: GT_COND alpha_numeric COMMA var
         | GT_COND alpha_numeric COMMA alpha_numeric;
lt_cond: LT_COND alpha_numeric COMMA var
         | LT_COND alpha_numeric COMMA alpha_numeric;

condition: prsa_cond|prso_cond|prsi_cond|here_cond|andflags_cond|orflags_cond|flagvalue_cond|haveitem_cond|haveitems_cond|equals_cond|gt_cond|lt_cond;

// effect bodies
tell_eff: TELL_EFF STRING;
goto_eff: GOTO_EFF ID;
setflag_eff: SETFLAG_EFF flag | SETFLAG_EFF flag COMMA num_int;
remflag_eff: REMFLAG_EFF flag;
take_eff: TAKE_EFF ID;
place_eff: PLACE_EFF ID COMMA ID;
set_eff: SET_EFF alpha_numeric COMMA var;

effect: tell_eff|goto_eff|setflag_eff|remflag_eff|take_eff|place_eff|set_eff;

// Entry point
game_grammar: room (room | object | action | global_flag)*;