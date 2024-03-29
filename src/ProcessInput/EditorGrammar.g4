grammar EditorGrammar;

// Lexing rules (Must be upper case)

// Define symbols
COLON: ':';          SEMICOLON: ';';
LB_SQUARE: '[';      RB_SQUARE: ']';
LB_SHARP: '<';       RB_SHARP: '>';
LB_CURLY: '{';       RB_CURLY: '}';
LB_ROUND: '(';       RB_ROUND: ')';
QUOTES: '"';         UNDERSCORE: '_';
COMMA: ',';          DOT: '.';
PLUS: '+';           MINUS: '-';
BAR: '|';            ANDPERSAND: '&';
EQUALS: '=';

// Define boolean logic terms
TRUE: 'TRUE';        FALSE: 'FALSE';
AND: ANDPERSAND ANDPERSAND;
OR: BAR BAR;
NOT:'!';

// Reserved keyword for defining a room as being hidden
HIDDEN_KEY: 'HIDDEN';
DEFAULT_KEY: 'DEFAULT';

// Reserved strings
COND_TAG: 'COND';
EFFECT_TAG: 'EFF';
QUERY_TAG: 'QUERY';
ELSE_TAG: 'ELSE';
IN_TAG: 'IN';
ON_TAG: 'ON';
UNDER_TAG: 'UNDER';
BLOCK_MESSAGE_TAG: 'BLOCKMESSAGE';

// Character sequences
ALPHA: [a-zA-Z]+;
NUMERIC: [0-9]+;
ALPHANUMERIC: [a-zA-Z0-9]+;
WHITESPACE: [ \n\t\r]+ -> skip;

// Any character string between quotation markes
STRING: QUOTES (~('"'))* QUOTES;

// Object/extension ID
ID: LB_SHARP ALPHANUMERIC RB_SHARP;

// Section tags
OBJECT_TAG: LB_SQUARE 'object' RB_SQUARE;
ROOM_TAG: LB_SQUARE 'room' RB_SQUARE;
ACTION_TAG: LB_SQUARE 'action' RB_SQUARE;
FLAG_TAG: LB_SQUARE 'flag' RB_SQUARE;
END_TAG: LB_SQUARE 'end' RB_SQUARE;

// Entry keys
ID_KEY: 'ID' COLON;
LOC_KEY: 'LOCATION' COLON;
LOC_TYPE_KEY: 'LOCATIONTYPE' COLON;
NAME_KEY: 'NAME' COLON;
DESC_KEY: 'DESC' COLON;
ALT_DESC_KEY: 'ALTDESC' COLON;
CONDS_KEY: 'CONDS' COLON;
SYNS_KEY: 'SYNS' COLON;
PROPERTIES_KEY: 'PROPERTIES' COLON;
FLAG_KEY: 'FLAG' COLON;
VALUES_KEY: 'VALUES' COLON;
VALUE_KEY: 'VALUE' COLON;

NORTH_KEY: 'N' COLON;   SOUTH_KEY: 'S' COLON;   EAST_KEY: 'E' COLON;   WEST_KEY: 'W' COLON;   UP_KEY: 'U' COLON;   DOWN_KEY: 'D' COLON;

NORTH_COND_KEY: 'N' COND_TAG COLON; SOUTH_COND_KEY: 'S' COND_TAG COLON;   EAST_COND_KEY: 'E' COND_TAG COLON;
WEST_COND_KEY: 'W' COND_TAG COLON;  UP_COND_KEY: 'U' COND_TAG COLON;      DOWN_COND_KEY: 'D' COND_TAG COLON;

NORTH_BLOCK_MESSAGE_KEY: 'N' BLOCK_MESSAGE_TAG COLON;   SOUTH_BLOCK_MESSAGE_KEY: 'S' BLOCK_MESSAGE_TAG COLON;
EAST_BLOCK_MESSAGE_KEY: 'E' BLOCK_MESSAGE_TAG COLON;    WEST_BLOCK_MESSAGE_KEY: 'W' BLOCK_MESSAGE_TAG COLON;
UP_BLOCK_MESSAGE_KEY: 'U' BLOCK_MESSAGE_TAG COLON;      DOWN_BLOCK_MESSAGE_KEY: 'D' BLOCK_MESSAGE_TAG COLON;

ACTION_KEY: 'ACTION' COLON;
CHECK_KEY: 'CHECK' COLON;
DET_KEY: 'DET' COLON;
ARE_KEY: 'ARE' COLON;
USE_KEY: 'USE' COLON;

// Condition keys
PRSA_COND: 'PRSA' COLON;
PRSA_AND_COND: 'PRSAAND' COLON;
PRSO_COND: 'PRSO' COLON;
PRSI_COND: 'PRSI' COLON;
HERE_COND: 'HERE' COLON;
INSCOPE_COND: 'INSCOPE' COLON;
ANDFLAGS_COND: 'ANDFLAGS' COLON;
ORFLAGS_COND: 'ORFLAGS' COLON;
ANDPROPERTIES_COND: 'ANDPROPERTIES' COLON;
ORPROPERTIES_COND: 'ORPROPERTIES' COLON;
FLAGVALUE_COND: 'FLAGVALUE' COLON;
HAVEITEM_COND: 'HAVEITEM' COLON;
HAVEITEMS_COND: 'HAVEITEMS' COLON;
EQUALS_COND: 'EQUALS' COLON;
GT_COND: 'GT' COLON;
LT_COND: 'LT' COLON;

// Effect keys
TELL_EFF: 'TELL' COLON;
GOTO_EFF: 'GOTO' COLON;
SETFLAG_EFF: 'SETFLAG' COLON;
REMFLAG_EFF: 'REMFLAG' COLON;
TAKE_EFF: 'TAKE' COLON;
PLACE_EFF: 'PLACE' COLON;
SET_VAR_EFF: 'SETVAR' COLON;
INC_VAR_EFF: 'INCVAR' COLON;
DEC_VAR_EFF: 'DECVAR' COLON;
ADD_PROPERTY_EFF: 'ADDPROPERTY' COLON;
REMOVE_PROPERTY_EFF: 'REMPROPERTY' COLON;
ADD_QUERY_EFF: 'ADDQUERY' COLON;
REMOVE_QUERY_EFF: 'REMQUERY' COLON;

// Parsing rules (Must be lower case)

// Defining values
alpha_numeric: ALPHA | NUMERIC | ALPHANUMERIC;
num_int: NUMERIC;
num_float: NUMERIC DOT NUMERIC | DOT NUMERIC;
number: num_int | num_float;
bool: TRUE | FALSE;
var: number | STRING | bool;
value: LB_ROUND alpha_numeric COLON var RB_ROUND;


flag: UNDERSCORE alpha_numeric;

// Entries
id_entry: ID_KEY ID SEMICOLON;
loc_entry: LOC_KEY ID SEMICOLON;
loc_type_entry: LOC_TYPE_KEY num_int SEMICOLON | /* epsilon */;
name_entry: NAME_KEY STRING SEMICOLON;
desc_entry: DESC_KEY STRING SEMICOLON | /* epsilon */;

alt_desc_entry: ALT_DESC_KEY STRING SEMICOLON CONDS_KEY
                (flag_conditions | query_conditional) SEMICOLON
                alt_desc_entry | /* epsilon */;

synonyms_entry: SYNS_KEY STRING (COMMA STRING)* SEMICOLON | /* epsilon */;
properties_entry: PROPERTIES_KEY flag (COMMA flag)* SEMICOLON | /* epsilon */;
values_entry: VALUES_KEY value (COMMA value)* SEMICOLON | /* epsilon */;

north_entry: NORTH_KEY ID SEMICOLON
            north_cond | /*epsilon*/;
south_entry: SOUTH_KEY ID SEMICOLON
            south_cond | /*epsilon*/;
east_entry: EAST_KEY ID SEMICOLON
            east_cond | /*epsilon*/;
west_entry: WEST_KEY ID SEMICOLON
            west_cond | /*epsilon*/;
up_entry: UP_KEY ID SEMICOLON
            up_cond | /*epsilon*/;
down_entry: DOWN_KEY ID SEMICOLON
            down_cond | /*epsilon*/;

action_entry: ACTION_KEY action_block SEMICOLON;
global_flag_entry: FLAG_KEY flag SEMICOLON;
flag_val_entry: VALUE_KEY num_int SEMICOLON | /* epsilon*/;
det_entry: DET_KEY STRING SEMICOLON | /* epsilon*/;
are_entry: ARE_KEY (TRUE | FALSE) SEMICOLON | /* epsilon */;

// Flag conditions (e.g. _FLAG1 = 1)
flag_conditions: flag EQUALS num_int (COMMA flag EQUALS num_int)*;

// Directional movement conditions
north_cond: NORTH_COND_KEY (flag_conditions | query_conditional) hidden SEMICOLON
            north_block_message | /*epsilon*/;
south_cond: SOUTH_COND_KEY (flag_conditions | query_conditional) hidden SEMICOLON
            south_block_message | /*epsilon*/;
east_cond: EAST_COND_KEY (flag_conditions | query_conditional) hidden SEMICOLON
            east_block_message | /*epsilon*/;
west_cond: WEST_COND_KEY (flag_conditions | query_conditional) hidden SEMICOLON
            west_block_message | /*epsilon*/;
up_cond: UP_COND_KEY (flag_conditions | query_conditional) hidden SEMICOLON
            up_block_message | /*epsilon*/;
down_cond: DOWN_COND_KEY (flag_conditions | query_conditional) hidden SEMICOLON
            down_block_message | /*epsilon*/;

// Hide room in direction if conditions not met
hidden: COMMA UNDERSCORE HIDDEN_KEY | /*epsilon*/;

// Define messages for when unable to move due to unmet conditions
north_block_message: NORTH_BLOCK_MESSAGE_KEY STRING SEMICOLON | /*epsilon*/;
south_block_message: SOUTH_BLOCK_MESSAGE_KEY STRING SEMICOLON | /*epsilon*/;
east_block_message: EAST_BLOCK_MESSAGE_KEY STRING SEMICOLON | /*epsilon*/;
west_block_message: WEST_BLOCK_MESSAGE_KEY STRING SEMICOLON | /*epsilon*/;
up_block_message: UP_BLOCK_MESSAGE_KEY STRING SEMICOLON | /*epsilon*/;
down_block_message: DOWN_BLOCK_MESSAGE_KEY STRING SEMICOLON | /*epsilon*/;

// Define the extension packages to be used (enhanced engine only)
use_packages: USE_KEY ID (COMMA ID)* SEMICOLON | /* epsilon */;

// Define game objects
object: OBJECT_TAG LB_CURLY
            id_entry
            loc_entry
            loc_type_entry
            name_entry
            desc_entry
            alt_desc_entry
            synonyms_entry
            properties_entry
            values_entry
            det_entry
            are_entry
            RB_CURLY;

// Define game room
room: ROOM_TAG LB_CURLY
            id_entry
            north_entry
            south_entry
            east_entry
            west_entry
            up_entry
            down_entry
            name_entry
            desc_entry
            alt_desc_entry
            synonyms_entry
            det_entry
            RB_CURLY;

// Define an action on an object
action: ACTION_TAG LB_CURLY
        id_entry
        action_entry
        RB_CURLY;

// Define a global flag
global_flag: FLAG_TAG LB_CURLY
        global_flag_entry
        flag_val_entry
        RB_CURLY;

// Define actions to be performed at the end of a user interaction based on changes in KB (enhanced engine only)
end: END_TAG LB_CURLY
            check_entry
            (check_entry)*
            RB_CURLY | /* epsilon */;

// Define the parts of an action entry
action_block: effect_aux action_block
              | conditional action_block
              | /*epsilon*/;
conditional: COND_TAG LB_SHARP conditions RB_SHARP LB_CURLY action_block RB_CURLY;
conditions: condition_aux
            | condition_aux AND conditions
            | condition_aux OR conditions;
condition_aux: condition
               | NOT condition;
effect_aux: EFFECT_TAG LB_SHARP effect RB_SHARP;

// condition bodies
prsa_cond: PRSA_COND (ALPHA|IN_TAG|ON_TAG|UNDER_TAG) (COMMA (ALPHA|IN_TAG|ON_TAG|UNDER_TAG))*;
prsa_and_cond: PRSA_AND_COND (ALPHA|IN_TAG|ON_TAG|UNDER_TAG) (COMMA (ALPHA|IN_TAG|ON_TAG|UNDER_TAG))*;
prso_cond: PRSO_COND ID (COMMA ID)*;
prsi_cond: PRSI_COND ID (COMMA ID)*;
here_cond: HERE_COND ID (COMMA ID)*;
inscope_cond: INSCOPE_COND ID COMMA ID (COMMA ID)*;
andflags_cond: ANDFLAGS_COND flag (COMMA flag)*;
orflags_cond: ORFLAGS_COND flag (COMMA flag)*;
andproperties_cond: ANDPROPERTIES_COND ID COMMA flag (COMMA flag)*;
orproperties_cond: ORPROPERTIES_COND ID COMMA flag (COMMA flag)*;
flagvalue_cond: FLAGVALUE_COND flag COMMA num_int;
haveitem_cond: HAVEITEM_COND ID (COMMA ID)*;
haveitems_cond: HAVEITEMS_COND ID (COMMA ID)*;
equals_cond: EQUALS_COND ID COLON alpha_numeric COMMA var
             | EQUALS_COND ID COLON alpha_numeric COMMA ID COLON alpha_numeric;
gt_cond: GT_COND ID COLON alpha_numeric COMMA var
         | GT_COND ID COLON alpha_numeric COMMA ID COLON alpha_numeric;
lt_cond: LT_COND ID COLON alpha_numeric COMMA var
         | LT_COND ID COLON alpha_numeric COMMA ID COLON alpha_numeric;

// Combined conditions
condition: prsa_cond|prsa_and_cond|prso_cond|prsi_cond|here_cond|inscope_cond|andflags_cond|orflags_cond|andproperties_cond|orproperties_cond|flagvalue_cond|haveitem_cond|haveitems_cond|equals_cond|gt_cond|lt_cond|query_conditional;

// effect bodies
tell_eff: TELL_EFF STRING;
goto_eff: GOTO_EFF ID;
setflag_eff: SETFLAG_EFF flag | SETFLAG_EFF flag COMMA num_int;
remflag_eff: REMFLAG_EFF flag;
take_eff: TAKE_EFF ID;
place_eff: PLACE_EFF ID COMMA ID COMMA (IN_TAG|ON_TAG|UNDER_TAG);
set_var_eff: SET_VAR_EFF ID COLON alpha_numeric COMMA var;
inc_var_eff: INC_VAR_EFF ID COLON alpha_numeric COMMA var;
dec_var_eff: DEC_VAR_EFF ID COLON alpha_numeric COMMA var;
add_property_eff: ADD_PROPERTY_EFF ID COMMA flag;
remove_property_eff: REMOVE_PROPERTY_EFF ID COMMA flag;
add_query_eff: ADD_QUERY_EFF query;
remove_query_eff: REMOVE_QUERY_EFF query;

// Combined effects
effect: tell_eff|goto_eff|setflag_eff|remflag_eff|take_eff|place_eff|set_var_eff|inc_var_eff|dec_var_eff|add_property_eff|remove_property_eff|add_query_eff|remove_query_eff;

// Define parts of a query conditional (enhanced engine only)
query_conditional: QUERY_TAG LB_SHARP queries RB_SHARP;


queries: query (COMMA query)*;

query: functor LB_ROUND parameters RB_ROUND;
functor: ALPHA | ALPHANUMERIC;
parameters: parameter (COMMA parameter)*;
parameter: (ALPHA |ALPHANUMERIC) | NUMERIC | LB_SQUARE parameter (BAR parameter | /* epsilon */) RB_SQUARE;

// End condition is already set by default
defaultCheck: COMMA UNDERSCORE DEFAULT_KEY | /*epsilon*/;

// Define parts of an end block (enhanced engine only)
check_entry: CHECK_KEY query_conditional defaultCheck LB_CURLY if_effects RB_CURLY SEMICOLON | CHECK_KEY query_conditional defaultCheck LB_CURLY if_effects RB_CURLY ELSE_TAG LB_CURLY else_effects RB_CURLY SEMICOLON;
if_effects: effect_aux (effect_aux)*;
else_effects: effect_aux (effect_aux)*;

// Entry point
game_grammar: use_packages room (room | object | action | global_flag)* end;