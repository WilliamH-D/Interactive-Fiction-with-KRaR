package ProcessInput;

import ProcessInput.GrammarFiles.EditorGrammarParser;
import ProcessInput.GrammarFiles.EditorGrammarVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class GrammarVisitor<T> extends AbstractParseTreeVisitor<T> implements EditorGrammarVisitor<T> {

    @Override public T visitAlpha_numeric(EditorGrammarParser.Alpha_numericContext ctx) { return visitChildren(ctx); }

    @Override public T visitNum_int(EditorGrammarParser.Num_intContext ctx) { return visitChildren(ctx); }

    @Override public T visitNum_float(EditorGrammarParser.Num_floatContext ctx) { return visitChildren(ctx); }

    @Override public T visitNumber(EditorGrammarParser.NumberContext ctx) { return visitChildren(ctx); }

    @Override public T visitBool(EditorGrammarParser.BoolContext ctx) { return visitChildren(ctx); }

    @Override public T visitVar(EditorGrammarParser.VarContext ctx) { return visitChildren(ctx); }

    @Override public T visitAnd(EditorGrammarParser.AndContext ctx) { return visitChildren(ctx); }

    @Override public T visitOr(EditorGrammarParser.OrContext ctx) { return visitChildren(ctx); }

    @Override public T visitNot(EditorGrammarParser.NotContext ctx) { return visitChildren(ctx); }

    @Override public T visitValue(EditorGrammarParser.ValueContext ctx) { return visitChildren(ctx); }

    @Override public T visitFlag(EditorGrammarParser.FlagContext ctx) { return visitChildren(ctx); }

    // --------------------------------------------------------------------------------------
    //                                      ENTRIES
    // --------------------------------------------------------------------------------------

    @Override public T visitId_entry(EditorGrammarParser.Id_entryContext ctx) {
        StoryCompiler.get().id = ctx.ID().toString();
        return visitChildren(ctx);
    }

    @Override public T visitLoc_entry(EditorGrammarParser.Loc_entryContext ctx) {
        StoryCompiler.get().location = ctx.ID().toString();
        return visitChildren(ctx);
    }

    @Override public T visitName_entry(EditorGrammarParser.Name_entryContext ctx) {
        StoryCompiler.get().name = ctx.STRING().toString();
        return visitChildren(ctx);
    }

    @Override public T visitDesc_entry(EditorGrammarParser.Desc_entryContext ctx) {
        StoryCompiler.get().desc = ctx.STRING().toString();
        return visitChildren(ctx);
    }

    @Override public T visitFlags_entry(EditorGrammarParser.Flags_entryContext ctx) {
        for (int i = 0; i < ctx.flag().size(); i++) {
            StoryCompiler.get().flags.add("_" + ctx.flag(i).alpha_numeric().getText());
        }
        return visitChildren(ctx);
    }

    @Override public T visitValues_entry(EditorGrammarParser.Values_entryContext ctx) {
        for (int i = 0; i < ctx.value().size(); i++) {
            StoryCompiler.get().values.put(ctx.value(i).alpha_numeric().getText(),
                    ctx.value(i).var().getText());
        }
        return visitChildren(ctx);
    }

    @Override public T visitDir_entry(EditorGrammarParser.Dir_entryContext ctx) {
        for (int i = 0; i < ctx.DIR_KEY().size(); i++) {
            switch(ctx.DIR_KEY(i).toString().substring(0,1)) {
                case("N"): StoryCompiler.get().n = ctx.ID(i).toString() ;break;
                case("S"): StoryCompiler.get().s = ctx.ID(i).toString() ;break;
                case("E"): StoryCompiler.get().e = ctx.ID(i).toString() ;break;
                case("W"): StoryCompiler.get().w = ctx.ID(i).toString() ;break;
                case("U"): StoryCompiler.get().u = ctx.ID(i).toString() ;break;
                case("D"): StoryCompiler.get().d = ctx.ID(i).toString() ;break;
            }
        }
        return visitChildren(ctx);
    }

    @Override public T visitAction_entry(EditorGrammarParser.Action_entryContext ctx) {
        return visitChildren(ctx);
    }

    // --------------------------------------------------------------------------------------
    //                                OBJECT / ROOM / ACTION
    // --------------------------------------------------------------------------------------
    
    @Override public T visitObject(EditorGrammarParser.ObjectContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().compileObject();
        return children;
    }
    
    @Override public T visitRoom(EditorGrammarParser.RoomContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().compileRoom();
        return children;
    }
    
    @Override public T visitAction(EditorGrammarParser.ActionContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().compileAction();
        return children;
    }

    // --------------------------------------------------------------------------------------
    //                                  ACTION PARTS
    // --------------------------------------------------------------------------------------
    
    @Override public T visitAction_block(EditorGrammarParser.Action_blockContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitConditional(EditorGrammarParser.ConditionalContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitConditions(EditorGrammarParser.ConditionsContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitEffects(EditorGrammarParser.EffectsContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitEffect_aux(EditorGrammarParser.Effect_auxContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitCondition_aux(EditorGrammarParser.Condition_auxContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitPrsa_cond(EditorGrammarParser.Prsa_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitPrso_cond(EditorGrammarParser.Prso_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitPrsi_cond(EditorGrammarParser.Prsi_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitHere_cond(EditorGrammarParser.Here_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitAndflags_cond(EditorGrammarParser.Andflags_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitOrflags_cond(EditorGrammarParser.Orflags_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitHaveitem_cond(EditorGrammarParser.Haveitem_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitHaveitems_cond(EditorGrammarParser.Haveitems_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitEquals_cond(EditorGrammarParser.Equals_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitGt_cond(EditorGrammarParser.Gt_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitLt_cond(EditorGrammarParser.Lt_condContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitCondition(EditorGrammarParser.ConditionContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitTell_eff(EditorGrammarParser.Tell_effContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitGoto_eff(EditorGrammarParser.Goto_effContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitSetflag_eff(EditorGrammarParser.Setflag_effContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitRemflag_eff(EditorGrammarParser.Remflag_effContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitTake_eff(EditorGrammarParser.Take_effContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitPlace_eff(EditorGrammarParser.Place_effContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitSet_eff(EditorGrammarParser.Set_effContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitEffect(EditorGrammarParser.EffectContext ctx) { return visitChildren(ctx); }

    // --------------------------------------------------------------------------------------
    //                                 ENTRY POINT
    // --------------------------------------------------------------------------------------

    @Override public T visitGame_grammar(EditorGrammarParser.Game_grammarContext ctx) { return visitChildren(ctx); }
}
