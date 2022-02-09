package ProcessInput;

import ProcessInput.GrammarFiles.EditorGrammarParser;
import ProcessInput.GrammarFiles.EditorGrammarVisitor;
import edu.stanford.nlp.util.ArraySet;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.Set;

public class GrammarVisitor<T> extends AbstractParseTreeVisitor<T> implements EditorGrammarVisitor<T> {

    @Override public T visitAlpha_numeric(EditorGrammarParser.Alpha_numericContext ctx) { return visitChildren(ctx); }

    @Override public T visitNum_int(EditorGrammarParser.Num_intContext ctx) { return visitChildren(ctx); }

    @Override public T visitNum_float(EditorGrammarParser.Num_floatContext ctx) { return visitChildren(ctx); }

    @Override public T visitNumber(EditorGrammarParser.NumberContext ctx) { return visitChildren(ctx); }

    @Override public T visitBool(EditorGrammarParser.BoolContext ctx) { return visitChildren(ctx); }

    @Override public T visitVar(EditorGrammarParser.VarContext ctx) { return visitChildren(ctx); }

    @Override public T visitValue(EditorGrammarParser.ValueContext ctx) { return visitChildren(ctx); }

    @Override public T visitFlag(EditorGrammarParser.FlagContext ctx) { return visitChildren(ctx); }

    // --------------------------------------------------------------------------------------
    //                                      ENTRIES
    // --------------------------------------------------------------------------------------

    @Override public T visitId_entry(EditorGrammarParser.Id_entryContext ctx) {
        String id = ctx.ID().toString();
        StoryCompiler.get().id = id.substring(1, id.length()-1).toUpperCase();
        return visitChildren(ctx);
    }

    @Override public T visitLoc_entry(EditorGrammarParser.Loc_entryContext ctx) {
        String loc = ctx.ID().toString();
        StoryCompiler.get().location = loc.substring(1, loc.length()-1).toUpperCase();
        return visitChildren(ctx);
    }

    @Override
    public T visitLoc_type_entry(EditorGrammarParser.Loc_type_entryContext ctx) {
        try {
            String type = ctx.num_int().getText();
            StoryCompiler.get().locationType = Integer.parseInt(type);
        }
        catch (NullPointerException ignored) {}
        return visitChildren(ctx);
    }

    @Override public T visitName_entry(EditorGrammarParser.Name_entryContext ctx) {
        String name = ctx.STRING().toString();
        StoryCompiler.get().name = name.substring(1, name.length()-1);
        return visitChildren(ctx);
    }

    @Override public T visitDesc_entry(EditorGrammarParser.Desc_entryContext ctx) {
        String desc = ctx.STRING().toString();
        StoryCompiler.get().desc = desc.substring(1, desc.length()-1);
        return visitChildren(ctx);
    }

    // TODO
    @Override
    public T visitAlt_desc_entry(EditorGrammarParser.Alt_desc_entryContext ctx) {
        T children = visitChildren(ctx);
        if (ctx.flag_conditions() != null) {
            // not epsilon case
            String desc = ctx.STRING().getText().substring(1, ctx.STRING().getText().length()-1);
            StoryCompiler.get().altDescs.add(desc);
            StoryCompiler.get().altDescConds.add(StoryCompiler.get().flagConds.pop());
        }
        return children;
    }

    @Override
    public T visitFlag_conditions(EditorGrammarParser.Flag_conditionsContext ctx) {
        Set<String> flagValuePairs = new HashSet<>();
        for (int i = 0; i < ctx.flag().size(); i++) {
            flagValuePairs.add(ctx.flag(i).getText() + "=" + ctx.num_int(i).getText());
        }
        StoryCompiler.get().flagConds.push(flagValuePairs);
        return visitChildren(ctx);
    }

    @Override
    public T visitSynonyms_entry(EditorGrammarParser.Synonyms_entryContext ctx) {
        Set<String> synonyms = new HashSet<>();
        for (TerminalNode syn : ctx.STRING()) {
            synonyms.add(syn.toString());
        }
        StoryCompiler.get().synonyms = synonyms;
        return visitChildren(ctx);
    }

    @Override
    public T visitProperties_entry(EditorGrammarParser.Properties_entryContext ctx) {
        for (int i = 0; i < ctx.flag().size(); i++) {
            StoryCompiler.get().properties.add("_" + ctx.flag(i).alpha_numeric().getText().toUpperCase());
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

    @Override
    public T visitNorth_entry(EditorGrammarParser.North_entryContext ctx) {
        if (ctx.children == null) {
            return visitChildren(ctx);
        }

        String room = ctx.ID().toString();
        room = room.substring(1, room.length()-1);
        StoryCompiler.get().n = room;

        return visitChildren(ctx);
    }

    @Override
    public T visitSouth_entry(EditorGrammarParser.South_entryContext ctx) {
        if (ctx.children == null) {
            return visitChildren(ctx);
        }

        String room = ctx.ID().toString();
        room = room.substring(1, room.length()-1);
        StoryCompiler.get().s = room;

        return visitChildren(ctx);
    }

    @Override
    public T visitEast_entry(EditorGrammarParser.East_entryContext ctx) {
        if (ctx.children == null) {
            return visitChildren(ctx);
        }

        String room = ctx.ID().toString();
        room = room.substring(1, room.length()-1);
        StoryCompiler.get().e = room;

        return visitChildren(ctx);
    }

    @Override
    public T visitWest_entry(EditorGrammarParser.West_entryContext ctx) {
        if (ctx.children == null) {
            return visitChildren(ctx);
        }

        String room = ctx.ID().toString();
        room = room.substring(1, room.length()-1);
        StoryCompiler.get().w = room;

        return visitChildren(ctx);
    }

    @Override
    public T visitUp_entry(EditorGrammarParser.Up_entryContext ctx) {
        if (ctx.children == null) {
            return visitChildren(ctx);
        }

        String room = ctx.ID().toString();
        room = room.substring(1, room.length()-1);
        StoryCompiler.get().u = room;

        return visitChildren(ctx);
    }

    @Override
    public T visitDown_entry(EditorGrammarParser.Down_entryContext ctx) {
        if (ctx.children == null) {
            return visitChildren(ctx);
        }

        String room = ctx.ID().toString();
        room = room.substring(1, room.length()-1);
        StoryCompiler.get().d = room;

        return visitChildren(ctx);
    }

    @Override
    public T visitNorth_cond(EditorGrammarParser.North_condContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().nconds = ctx.flag_conditions() != null ? StoryCompiler.get().flagConds.pop() : new ArraySet<>();
        if (ctx.hidden() != null && ctx.hidden().getChildCount() > 0) {
            StoryCompiler.get().nHidden = true;
        }
        return children;
    }

    @Override
    public T visitSouth_cond(EditorGrammarParser.South_condContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().sconds = ctx.flag_conditions() != null ? StoryCompiler.get().flagConds.pop() : new ArraySet<>();
        if (ctx.hidden() != null && ctx.hidden().getChildCount() > 0) {
            StoryCompiler.get().sHidden = true;
        }
        return children;
    }

    @Override
    public T visitEast_cond(EditorGrammarParser.East_condContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().econds = ctx.flag_conditions() != null ? StoryCompiler.get().flagConds.pop() : new ArraySet<>();
        if (ctx.hidden() != null && ctx.hidden().getChildCount() > 0) {
            StoryCompiler.get().eHidden = true;
        }
        return children;
    }

    @Override
    public T visitWest_cond(EditorGrammarParser.West_condContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().wconds = ctx.flag_conditions() != null ? StoryCompiler.get().flagConds.pop() : new ArraySet<>();
        if (ctx.hidden() != null && ctx.hidden().getChildCount() > 0) {
            StoryCompiler.get().wHidden = true;
        }
        return children;
    }

    @Override
    public T visitUp_cond(EditorGrammarParser.Up_condContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().uconds = ctx.flag_conditions() != null ? StoryCompiler.get().flagConds.pop() : new ArraySet<>();
        if (ctx.hidden() != null && ctx.hidden().getChildCount() > 0) {
            StoryCompiler.get().uHidden = true;
        }
        return children;
    }

    @Override
    public T visitDown_cond(EditorGrammarParser.Down_condContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().dconds = ctx.flag_conditions() != null ? StoryCompiler.get().flagConds.pop() : new ArraySet<>();
        if (ctx.hidden() != null && ctx.hidden().getChildCount() > 0) {
            StoryCompiler.get().dHidden = true;
        }
        return children;
    }

    @Override
    public T visitHidden(EditorGrammarParser.HiddenContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitNorth_block_message(EditorGrammarParser.North_block_messageContext ctx) {
        if (ctx.STRING() == null) {
            return visitChildren(ctx);
        }
        String message = ctx.STRING().getText();
        StoryCompiler.get().nblockMessage = message.substring(1, message.length()-1);
        return visitChildren(ctx);
    }

    @Override
    public T visitSouth_block_message(EditorGrammarParser.South_block_messageContext ctx) {
        if (ctx.STRING() == null) {
            return visitChildren(ctx);
        }
        String message = ctx.STRING().getText();
        StoryCompiler.get().sblockMessage = message.substring(1, message.length()-1);
        return visitChildren(ctx);
    }

    @Override
    public T visitEast_block_message(EditorGrammarParser.East_block_messageContext ctx) {
        if (ctx.STRING() == null) {
            return visitChildren(ctx);
        }
        String message = ctx.STRING().getText();
        StoryCompiler.get().eblockMessage = message.substring(1, message.length()-1);
        return visitChildren(ctx);
    }

    @Override
    public T visitWest_block_message(EditorGrammarParser.West_block_messageContext ctx) {
        if (ctx.STRING() == null) {
            return visitChildren(ctx);
        }
        String message = ctx.STRING().getText();
        StoryCompiler.get().wblockMessage = message.substring(1, message.length()-1);
        return visitChildren(ctx);
    }

    @Override
    public T visitUp_block_message(EditorGrammarParser.Up_block_messageContext ctx) {
        if (ctx.STRING() == null) {
            return visitChildren(ctx);
        }
        String message = ctx.STRING().getText();
        StoryCompiler.get().ublockMessage = message.substring(1, message.length()-1);
        return visitChildren(ctx);
    }

    @Override
    public T visitDown_block_message(EditorGrammarParser.Down_block_messageContext ctx) {
        if (ctx.STRING() == null) {
            return visitChildren(ctx);
        }
        String message = ctx.STRING().getText();
        StoryCompiler.get().dblockMessage = message.substring(1, message.length()-1);
        return visitChildren(ctx);
    }

    @Override public T visitAction_entry(EditorGrammarParser.Action_entryContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitGlobal_flag_entry(EditorGrammarParser.Global_flag_entryContext ctx) {
        StoryCompiler.get().flagName = "_" + ctx.flag().alpha_numeric().getText().toUpperCase();
        return visitChildren(ctx);
    }

    @Override public T visitFlag_val_entry(EditorGrammarParser.Flag_val_entryContext ctx) {
        StoryCompiler.get().flagValue = Integer.parseInt(ctx.num_int().NUMERIC().getText());
        return visitChildren(ctx);
    }

    @Override
    public T visitDet_entry(EditorGrammarParser.Det_entryContext ctx) {
        if (ctx.STRING() != null) {
            StoryCompiler.get().det = ctx.STRING().toString().substring(1, ctx.STRING().toString().length()-1);
        }
        return visitChildren(ctx);
    }

    @Override
    public T visitAre_entry(EditorGrammarParser.Are_entryContext ctx) {
        boolean useAre = false;
        if (ctx.TRUE() != null) {
            useAre = true;
        }
        StoryCompiler.get().useAre = useAre;
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

    @Override
    public T visitGlobal_flag(EditorGrammarParser.Global_flagContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().compileFlag();
        return children;
    }

    // --------------------------------------------------------------------------------------
    //                                  ACTION PARTS
    // --------------------------------------------------------------------------------------
    
    @Override public T visitAction_block(EditorGrammarParser.Action_blockContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitConditional(EditorGrammarParser.ConditionalContext ctx) {
        StoryCompiler.get().newConditional();
        T children = visitChildren(ctx);
        StoryCompiler.get().compileConditional();
        return children;
    }
    
    @Override public T visitConditions(EditorGrammarParser.ConditionsContext ctx) {
        T children = visitChildren(ctx);
        boolean isAnd = (ctx.children.contains(ctx.AND()));
        boolean isOr = (ctx.children.contains(ctx.OR()));
        StoryCompiler.get().compileConditions(isAnd, isOr);
        // If this node's parent is a Conditional node, then we need to add the current built condition to the conditions list
        if (ctx.parent instanceof EditorGrammarParser.ConditionalContext) {
            StoryCompiler.get().addConditional();
        }
        return children;
    }
    
    @Override public T visitEffect_aux(EditorGrammarParser.Effect_auxContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitCondition_aux(EditorGrammarParser.Condition_auxContext ctx) {
        if (ctx.children.contains(ctx.NOT())) {
            StoryCompiler.get().setIsNot();
        }
        return visitChildren(ctx);
    }
    
    @Override public T visitPrsa_cond(EditorGrammarParser.Prsa_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> objs = new HashSet<>();
        for (int i = 0; i < ctx.ALPHA().size(); i++) {
            objs.add(ctx.ALPHA(i).getText());
        }
        for (int j = 0; j < ctx.IN_TAG().size(); j++) {
            objs.add("IN");
        }
        for (int j = 0; j < ctx.ON_TAG().size(); j++) {
            objs.add("ON");
        }
        for (int j = 0; j < ctx.UNDER_TAG().size(); j++) {
            objs.add("UNDER");
        }
        StoryCompiler.get().compilePRSACond(objs);
        return children;
    }

    @Override
    public T visitPrsa_and_cond(EditorGrammarParser.Prsa_and_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> objs = new HashSet<>();
        for (int i = 0; i < ctx.ALPHA().size(); i++) {
            objs.add(ctx.ALPHA(i).getText());
        }
        for (int j = 0; j < ctx.IN_TAG().size(); j++) {
            objs.add("IN");
        }
        for (int j = 0; j < ctx.ON_TAG().size(); j++) {
            objs.add("ON");
        }
        for (int j = 0; j < ctx.UNDER_TAG().size(); j++) {
            objs.add("UNDER");
        }
        StoryCompiler.get().compilePRSAAndCond(objs);
        return children;
    }

    @Override public T visitPrso_cond(EditorGrammarParser.Prso_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> objs = new HashSet<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            objs.add(ctx.ID(i).getText().substring(1, ctx.ID(i).getText().length()-1));
        }
        StoryCompiler.get().compilePRSOCond(objs);
        return children;
    }
    
    @Override public T visitPrsi_cond(EditorGrammarParser.Prsi_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> objs = new HashSet<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            objs.add(ctx.ID(i).getText().substring(1, ctx.ID(i).getText().length()-1));
        }
        StoryCompiler.get().compilePRSICond(objs);
        return children;
    }
    
    @Override public T visitHere_cond(EditorGrammarParser.Here_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> locs = new HashSet<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            locs.add(ctx.ID(i).getText().substring(1, ctx.ID(i).getText().length()-1));
        }
        StoryCompiler.get().compileHereCond(locs);
        return children;
    }

    @Override
    public T visitInscope_cond(EditorGrammarParser.Inscope_condContext ctx) {
        T children = visitChildren(ctx);
        String obj = ctx.ID(0).getText().substring(1, ctx.ID(0).getText().length()-1);
        Set<String> locs = new HashSet<>();
        for (int i = 1; i < ctx.ID().size(); i++) {
            locs.add(ctx.ID(i).getText().substring(1, ctx.ID(i).getText().length()-1));
        }
        StoryCompiler.get().compileInScopeCond(obj, locs);
        return children;
    }

    @Override public T visitAndflags_cond(EditorGrammarParser.Andflags_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> flags = new HashSet<>();
        for (int i = 0; i < ctx.flag().size(); i++) {
            flags.add(ctx.flag(i).getText());
        }
        StoryCompiler.get().compileAndFlagsCond(flags);
        return children;
    }
    
    @Override public T visitOrflags_cond(EditorGrammarParser.Orflags_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> flags = new HashSet<>();
        for (int i = 0; i < ctx.flag().size(); i++) {
            flags.add(ctx.flag(i).getText());
        }
        StoryCompiler.get().compileOrFlagsCond(flags);
        return children;
    }

    @Override
    public T visitAndproperties_cond(EditorGrammarParser.Andproperties_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> properties = new HashSet<>();
        for (int i = 0; i < ctx.flag().size(); i++) {
            properties.add(ctx.flag(i).getText());
        }
        String id = ctx.ID().getText().substring(1, ctx.ID().getText().length()-1);
        StoryCompiler.get().compileAndPropertiesCond(id, properties);
        return children;
    }

    @Override
    public T visitOrproperties_cond(EditorGrammarParser.Orproperties_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> properties = new HashSet<>();
        for (int i = 0; i < ctx.flag().size(); i++) {
            properties.add(ctx.flag(i).getText());
        }
        String id = ctx.ID().getText().substring(1, ctx.ID().getText().length()-1);
        StoryCompiler.get().compileOrPropertiesCond(id, properties);
        return children;
    }

    @Override
    public T visitFlagvalue_cond(EditorGrammarParser.Flagvalue_condContext ctx) {
        T children = visitChildren(ctx);
        String flag = ctx.flag().getText();
        int value = Integer.parseInt(ctx.num_int().getText());
        StoryCompiler.get().compileFlagValue(flag, value);
        return children;
    }

    @Override public T visitHaveitem_cond(EditorGrammarParser.Haveitem_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> objs = new HashSet<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            objs.add(ctx.ID(i).getText().substring(1, ctx.ID(i).getText().length()-1));
        }
        StoryCompiler.get().compileHaveItemCond(objs);
        return children;
    }
    
    @Override public T visitHaveitems_cond(EditorGrammarParser.Haveitems_condContext ctx) {
        T children = visitChildren(ctx);
        Set<String> objs = new HashSet<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            objs.add(ctx.ID(i).getText().substring(1, ctx.ID(i).getText().length()-1));
        }
        StoryCompiler.get().compileHaveItemsCond(objs);
        return children;
    }
    
    @Override public T visitEquals_cond(EditorGrammarParser.Equals_condContext ctx) {
        T children = visitChildren(ctx);
        String lobj = ctx.ID(0).getText();
        lobj = lobj.substring(1, lobj.length()-1).toUpperCase();
        if (ctx.children.contains(ctx.var())) {
            StoryCompiler.get().compileEqualsCond(lobj, lobj, ctx.alpha_numeric(0).getText(), ctx.var().getText(), false);
        }
        else {
            String robj = ctx.ID(1).getText();
            robj = robj.substring(1, robj.length()-1).toUpperCase();
            StoryCompiler.get().compileEqualsCond(lobj, robj, ctx.alpha_numeric(0).getText(), ctx.alpha_numeric(1).getText(), true);
        }
        return children;
    }
    
    @Override public T visitGt_cond(EditorGrammarParser.Gt_condContext ctx) {
        T children = visitChildren(ctx);
        String lobj = ctx.ID(0).getText();
        lobj = lobj.substring(1, lobj.length()-1).toUpperCase();
        if (ctx.children.contains(ctx.var())) {
            StoryCompiler.get().compileGTCond(lobj, lobj, ctx.alpha_numeric(0).getText(), ctx.var().getText(), false);
        }
        else {
            String robj = ctx.ID(1).getText();
            robj = robj.substring(1, robj.length()-1).toUpperCase();
            StoryCompiler.get().compileGTCond(lobj, robj, ctx.alpha_numeric(0).getText(), ctx.alpha_numeric(1).getText(), true);
        }
        return children;
    }
    
    @Override public T visitLt_cond(EditorGrammarParser.Lt_condContext ctx) {
        T children = visitChildren(ctx);
        String lobj = ctx.ID(0).getText();
        lobj = lobj.substring(1, lobj.length()-1).toUpperCase();
        if (ctx.children.contains(ctx.var())) {
            StoryCompiler.get().compileLTCond(lobj, lobj, ctx.alpha_numeric(0).getText(), ctx.var().getText(), false);
        }
        else {
            String robj = ctx.ID(1).getText();
            robj = robj.substring(1, robj.length()-1).toUpperCase();
            StoryCompiler.get().compileLTCond(lobj, robj, ctx.alpha_numeric(0).getText(), ctx.alpha_numeric(1).getText(), true);
        }
        return children;
    }
    
    @Override public T visitCondition(EditorGrammarParser.ConditionContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitTell_eff(EditorGrammarParser.Tell_effContext ctx) {
        T children = visitChildren(ctx);
        String text = ctx.STRING().getText();
        StoryCompiler.get().compileTellEff(text.substring(1, text.length()-1));
        return children;
    }
    
    @Override public T visitGoto_eff(EditorGrammarParser.Goto_effContext ctx) {
        T children = visitChildren(ctx);
        String loc = ctx.ID().getText();
        StoryCompiler.get().compileGotoEff(loc.substring(1, loc.length()-1));
        return children;
    }
    
    @Override public T visitSetflag_eff(EditorGrammarParser.Setflag_effContext ctx) {
        T children = visitChildren(ctx);
        int val = 1;
        if (ctx.children.contains(ctx.num_int())) {
            val = Integer.parseInt(ctx.num_int().getText());
        }
        StoryCompiler.get().compileSetFlagEff(ctx.flag().getText(), val);
        return children;
    }
    
    @Override public T visitRemflag_eff(EditorGrammarParser.Remflag_effContext ctx) {
        T children = visitChildren(ctx);
        StoryCompiler.get().compileRemFlagEff(ctx.flag().getText());
        return children;
    }
    
    @Override public T visitTake_eff(EditorGrammarParser.Take_effContext ctx) {
        T children = visitChildren(ctx);
        String obj = ctx.ID().getText();
        StoryCompiler.get().compileTakeEff(obj.substring(1, obj.length()-1));
        return children;
    }
    
    @Override public T visitPlace_eff(EditorGrammarParser.Place_effContext ctx) {
        T children = visitChildren(ctx);
        String obj = ctx.ID(0).getText();
        String loc = ctx.ID(1).getText();
        int type = 0;
        try {
            String x = ctx.ON_TAG().getText();
            type = 1;
        }
        catch (Exception e) {
            try {
                String x = ctx.UNDER_TAG().getText();
                type = 2;
            }
            catch (Exception ignored) {}
        }
        StoryCompiler.get().compilePlaceEff(obj.substring(1, obj.length()-1), loc.substring(1, loc.length()-1), type);
        return children;
    }

    @Override
    public T visitSet_var_eff(EditorGrammarParser.Set_var_effContext ctx) {
        T children = visitChildren(ctx);
        String id = ctx.ID().getText();
        id = id.substring(1, id.length()-1).toUpperCase();
        StoryCompiler.get().compileSetVarEff(id, ctx.alpha_numeric().getText(), ctx.var().getText());
        return children;
    }

    @Override
    public T visitInc_var_eff(EditorGrammarParser.Inc_var_effContext ctx) {
        T children = visitChildren(ctx);
        String id = ctx.ID().getText();
        id = id.substring(1, id.length()-1).toUpperCase();
        StoryCompiler.get().compileIncVarEff(id, ctx.alpha_numeric().getText(), Float.parseFloat(ctx.var().getText()));
        return children;
    }

    @Override
    public T visitDec_var_eff(EditorGrammarParser.Dec_var_effContext ctx) {
        T children = visitChildren(ctx);
        String id = ctx.ID().getText();
        id = id.substring(1, id.length()-1).toUpperCase();
        StoryCompiler.get().compileDecVarEff(id, ctx.alpha_numeric().getText(), Float.parseFloat(ctx.var().getText()));
        return children;
    }

    @Override
    public T visitAdd_property_eff(EditorGrammarParser.Add_property_effContext ctx) {
        T children = visitChildren(ctx);
        String id = ctx.ID().getText();
        id = id.substring(1, id.length()-1).toUpperCase();
        String property = ctx.flag().getText();
        StoryCompiler.get().compileAddPropertyEff(id, property);
        return children;
    }

    @Override
    public T visitRemove_property_eff(EditorGrammarParser.Remove_property_effContext ctx) {
        T children = visitChildren(ctx);
        String id = ctx.ID().getText();
        id = id.substring(1, id.length()-1).toUpperCase();
        String property = ctx.flag().getText();
        StoryCompiler.get().compileRemovePropertyEff(id, property);
        return children;
    }

    @Override public T visitEffect(EditorGrammarParser.EffectContext ctx) { return visitChildren(ctx); }

    // --------------------------------------------------------------------------------------
    //                                 ENTRY POINT
    // --------------------------------------------------------------------------------------

    @Override public T visitGame_grammar(EditorGrammarParser.Game_grammarContext ctx) { return visitChildren(ctx); }
}
