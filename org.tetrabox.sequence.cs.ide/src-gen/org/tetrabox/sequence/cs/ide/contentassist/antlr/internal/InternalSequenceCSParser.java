package org.tetrabox.sequence.cs.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.tetrabox.sequence.cs.services.SequenceCSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSequenceCSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "':'", "';'", "'not'", "'ocl'", "']'", "'['", "'*'", "'('", "')'", "'+'", "'='", "'->'", "'{'", "'}'", "'|'", "'&'", "'&&'", "'within'", "'true'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSequenceCSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSequenceCSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSequenceCSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSequenceCS.g"; }


    	private SequenceCSGrammarAccess grammarAccess;

    	public void setGrammarAccess(SequenceCSGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSERE"
    // InternalSequenceCS.g:54:1: entryRuleSERE : ruleSERE EOF ;
    public final void entryRuleSERE() throws RecognitionException {
        try {
            // InternalSequenceCS.g:55:1: ( ruleSERE EOF )
            // InternalSequenceCS.g:56:1: ruleSERE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSERERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSERERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSERE"


    // $ANTLR start "ruleSERE"
    // InternalSequenceCS.g:63:1: ruleSERE : ( ( rule__SERE__Group__0 ) ) ;
    public final void ruleSERE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:67:2: ( ( ( rule__SERE__Group__0 ) ) )
            // InternalSequenceCS.g:68:2: ( ( rule__SERE__Group__0 ) )
            {
            // InternalSequenceCS.g:68:2: ( ( rule__SERE__Group__0 ) )
            // InternalSequenceCS.g:69:3: ( rule__SERE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getGroup()); 
            }
            // InternalSequenceCS.g:70:3: ( rule__SERE__Group__0 )
            // InternalSequenceCS.g:70:4: rule__SERE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SERE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSERE"


    // $ANTLR start "entryRuleSimpleSERE"
    // InternalSequenceCS.g:79:1: entryRuleSimpleSERE : ruleSimpleSERE EOF ;
    public final void entryRuleSimpleSERE() throws RecognitionException {
        try {
            // InternalSequenceCS.g:80:1: ( ruleSimpleSERE EOF )
            // InternalSequenceCS.g:81:1: ruleSimpleSERE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSERERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSimpleSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSERERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleSERE"


    // $ANTLR start "ruleSimpleSERE"
    // InternalSequenceCS.g:88:1: ruleSimpleSERE : ( ( rule__SimpleSERE__Alternatives ) ) ;
    public final void ruleSimpleSERE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:92:2: ( ( ( rule__SimpleSERE__Alternatives ) ) )
            // InternalSequenceCS.g:93:2: ( ( rule__SimpleSERE__Alternatives ) )
            {
            // InternalSequenceCS.g:93:2: ( ( rule__SimpleSERE__Alternatives ) )
            // InternalSequenceCS.g:94:3: ( rule__SimpleSERE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSEREAccess().getAlternatives()); 
            }
            // InternalSequenceCS.g:95:3: ( rule__SimpleSERE__Alternatives )
            // InternalSequenceCS.g:95:4: rule__SimpleSERE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSERE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSEREAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleSERE"


    // $ANTLR start "entryRuleSequenceTerminal"
    // InternalSequenceCS.g:104:1: entryRuleSequenceTerminal : ruleSequenceTerminal EOF ;
    public final void entryRuleSequenceTerminal() throws RecognitionException {
        try {
            // InternalSequenceCS.g:105:1: ( ruleSequenceTerminal EOF )
            // InternalSequenceCS.g:106:1: ruleSequenceTerminal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSequenceTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceTerminal"


    // $ANTLR start "ruleSequenceTerminal"
    // InternalSequenceCS.g:113:1: ruleSequenceTerminal : ( ( rule__SequenceTerminal__Alternatives ) ) ;
    public final void ruleSequenceTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:117:2: ( ( ( rule__SequenceTerminal__Alternatives ) ) )
            // InternalSequenceCS.g:118:2: ( ( rule__SequenceTerminal__Alternatives ) )
            {
            // InternalSequenceCS.g:118:2: ( ( rule__SequenceTerminal__Alternatives ) )
            // InternalSequenceCS.g:119:3: ( rule__SequenceTerminal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getAlternatives()); 
            }
            // InternalSequenceCS.g:120:3: ( rule__SequenceTerminal__Alternatives )
            // InternalSequenceCS.g:120:4: rule__SequenceTerminal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceTerminal"


    // $ANTLR start "entryRuleSequence"
    // InternalSequenceCS.g:129:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // InternalSequenceCS.g:130:1: ( ruleSequence EOF )
            // InternalSequenceCS.g:131:1: ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalSequenceCS.g:138:1: ruleSequence : ( ( rule__Sequence__Alternatives ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:142:2: ( ( ( rule__Sequence__Alternatives ) ) )
            // InternalSequenceCS.g:143:2: ( ( rule__Sequence__Alternatives ) )
            {
            // InternalSequenceCS.g:143:2: ( ( rule__Sequence__Alternatives ) )
            // InternalSequenceCS.g:144:3: ( rule__Sequence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getAlternatives()); 
            }
            // InternalSequenceCS.g:145:3: ( rule__Sequence__Alternatives )
            // InternalSequenceCS.g:145:4: rule__Sequence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleRepeatedSERE"
    // InternalSequenceCS.g:154:1: entryRuleRepeatedSERE : ruleRepeatedSERE EOF ;
    public final void entryRuleRepeatedSERE() throws RecognitionException {
        try {
            // InternalSequenceCS.g:155:1: ( ruleRepeatedSERE EOF )
            // InternalSequenceCS.g:156:1: ruleRepeatedSERE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSERERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSERERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepeatedSERE"


    // $ANTLR start "ruleRepeatedSERE"
    // InternalSequenceCS.g:163:1: ruleRepeatedSERE : ( ( rule__RepeatedSERE__Alternatives ) ) ;
    public final void ruleRepeatedSERE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:167:2: ( ( ( rule__RepeatedSERE__Alternatives ) ) )
            // InternalSequenceCS.g:168:2: ( ( rule__RepeatedSERE__Alternatives ) )
            {
            // InternalSequenceCS.g:168:2: ( ( rule__RepeatedSERE__Alternatives ) )
            // InternalSequenceCS.g:169:3: ( rule__RepeatedSERE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getAlternatives()); 
            }
            // InternalSequenceCS.g:170:3: ( rule__RepeatedSERE__Alternatives )
            // InternalSequenceCS.g:170:4: rule__RepeatedSERE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepeatedSERE"


    // $ANTLR start "entryRuleBracedSERE"
    // InternalSequenceCS.g:179:1: entryRuleBracedSERE : ruleBracedSERE EOF ;
    public final void entryRuleBracedSERE() throws RecognitionException {
        try {
            // InternalSequenceCS.g:180:1: ( ruleBracedSERE EOF )
            // InternalSequenceCS.g:181:1: ruleBracedSERE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracedSERERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracedSERERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBracedSERE"


    // $ANTLR start "ruleBracedSERE"
    // InternalSequenceCS.g:188:1: ruleBracedSERE : ( ( rule__BracedSERE__Group__0 ) ) ;
    public final void ruleBracedSERE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:192:2: ( ( ( rule__BracedSERE__Group__0 ) ) )
            // InternalSequenceCS.g:193:2: ( ( rule__BracedSERE__Group__0 ) )
            {
            // InternalSequenceCS.g:193:2: ( ( rule__BracedSERE__Group__0 ) )
            // InternalSequenceCS.g:194:3: ( rule__BracedSERE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracedSEREAccess().getGroup()); 
            }
            // InternalSequenceCS.g:195:3: ( rule__BracedSERE__Group__0 )
            // InternalSequenceCS.g:195:4: rule__BracedSERE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BracedSERE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracedSEREAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBracedSERE"


    // $ANTLR start "entryRuleCompoundSERE"
    // InternalSequenceCS.g:204:1: entryRuleCompoundSERE : ruleCompoundSERE EOF ;
    public final void entryRuleCompoundSERE() throws RecognitionException {
        try {
            // InternalSequenceCS.g:205:1: ( ruleCompoundSERE EOF )
            // InternalSequenceCS.g:206:1: ruleCompoundSERE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompoundSERERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompoundSERERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompoundSERE"


    // $ANTLR start "ruleCompoundSERE"
    // InternalSequenceCS.g:213:1: ruleCompoundSERE : ( ( rule__CompoundSERE__Alternatives ) ) ;
    public final void ruleCompoundSERE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:217:2: ( ( ( rule__CompoundSERE__Alternatives ) ) )
            // InternalSequenceCS.g:218:2: ( ( rule__CompoundSERE__Alternatives ) )
            {
            // InternalSequenceCS.g:218:2: ( ( rule__CompoundSERE__Alternatives ) )
            // InternalSequenceCS.g:219:3: ( rule__CompoundSERE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompoundSEREAccess().getAlternatives()); 
            }
            // InternalSequenceCS.g:220:3: ( rule__CompoundSERE__Alternatives )
            // InternalSequenceCS.g:220:4: rule__CompoundSERE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompoundSERE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompoundSEREAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompoundSERE"


    // $ANTLR start "entryRuleBinaryCompoundSERE"
    // InternalSequenceCS.g:229:1: entryRuleBinaryCompoundSERE : ruleBinaryCompoundSERE EOF ;
    public final void entryRuleBinaryCompoundSERE() throws RecognitionException {
        try {
            // InternalSequenceCS.g:230:1: ( ruleBinaryCompoundSERE EOF )
            // InternalSequenceCS.g:231:1: ruleBinaryCompoundSERE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSERERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSERERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryCompoundSERE"


    // $ANTLR start "ruleBinaryCompoundSERE"
    // InternalSequenceCS.g:238:1: ruleBinaryCompoundSERE : ( ( rule__BinaryCompoundSERE__Alternatives ) ) ;
    public final void ruleBinaryCompoundSERE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:242:2: ( ( ( rule__BinaryCompoundSERE__Alternatives ) ) )
            // InternalSequenceCS.g:243:2: ( ( rule__BinaryCompoundSERE__Alternatives ) )
            {
            // InternalSequenceCS.g:243:2: ( ( rule__BinaryCompoundSERE__Alternatives ) )
            // InternalSequenceCS.g:244:3: ( rule__BinaryCompoundSERE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives()); 
            }
            // InternalSequenceCS.g:245:3: ( rule__BinaryCompoundSERE__Alternatives )
            // InternalSequenceCS.g:245:4: rule__BinaryCompoundSERE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryCompoundSERE"


    // $ANTLR start "entryRuleCount"
    // InternalSequenceCS.g:254:1: entryRuleCount : ruleCount EOF ;
    public final void entryRuleCount() throws RecognitionException {
        try {
            // InternalSequenceCS.g:255:1: ( ruleCount EOF )
            // InternalSequenceCS.g:256:1: ruleCount EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCount();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalSequenceCS.g:263:1: ruleCount : ( ( rule__Count__Alternatives ) ) ;
    public final void ruleCount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:267:2: ( ( ( rule__Count__Alternatives ) ) )
            // InternalSequenceCS.g:268:2: ( ( rule__Count__Alternatives ) )
            {
            // InternalSequenceCS.g:268:2: ( ( rule__Count__Alternatives ) )
            // InternalSequenceCS.g:269:3: ( rule__Count__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountAccess().getAlternatives()); 
            }
            // InternalSequenceCS.g:270:3: ( rule__Count__Alternatives )
            // InternalSequenceCS.g:270:4: rule__Count__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Count__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRuleRange"
    // InternalSequenceCS.g:279:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalSequenceCS.g:280:1: ( ruleRange EOF )
            // InternalSequenceCS.g:281:1: ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalSequenceCS.g:288:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:292:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalSequenceCS.g:293:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalSequenceCS.g:293:2: ( ( rule__Range__Group__0 ) )
            // InternalSequenceCS.g:294:3: ( rule__Range__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup()); 
            }
            // InternalSequenceCS.g:295:3: ( rule__Range__Group__0 )
            // InternalSequenceCS.g:295:4: rule__Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleNUMBER"
    // InternalSequenceCS.g:304:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalSequenceCS.g:305:1: ( ruleNUMBER EOF )
            // InternalSequenceCS.g:306:1: ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalSequenceCS.g:313:1: ruleNUMBER : ( RULE_INT ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:317:2: ( ( RULE_INT ) )
            // InternalSequenceCS.g:318:2: ( RULE_INT )
            {
            // InternalSequenceCS.g:318:2: ( RULE_INT )
            // InternalSequenceCS.g:319:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "rule__SERE__Alternatives_1"
    // InternalSequenceCS.g:328:1: rule__SERE__Alternatives_1 : ( ( ( rule__SERE__Group_1_0__0 ) ) | ( ( rule__SERE__Group_1_1__0 ) ) );
    public final void rule__SERE__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:332:1: ( ( ( rule__SERE__Group_1_0__0 ) ) | ( ( rule__SERE__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSequenceCS.g:333:2: ( ( rule__SERE__Group_1_0__0 ) )
                    {
                    // InternalSequenceCS.g:333:2: ( ( rule__SERE__Group_1_0__0 ) )
                    // InternalSequenceCS.g:334:3: ( rule__SERE__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSEREAccess().getGroup_1_0()); 
                    }
                    // InternalSequenceCS.g:335:3: ( rule__SERE__Group_1_0__0 )
                    // InternalSequenceCS.g:335:4: rule__SERE__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SERE__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSEREAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:339:2: ( ( rule__SERE__Group_1_1__0 ) )
                    {
                    // InternalSequenceCS.g:339:2: ( ( rule__SERE__Group_1_1__0 ) )
                    // InternalSequenceCS.g:340:3: ( rule__SERE__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSEREAccess().getGroup_1_1()); 
                    }
                    // InternalSequenceCS.g:341:3: ( rule__SERE__Group_1_1__0 )
                    // InternalSequenceCS.g:341:4: rule__SERE__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SERE__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSEREAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Alternatives_1"


    // $ANTLR start "rule__SimpleSERE__Alternatives"
    // InternalSequenceCS.g:349:1: rule__SimpleSERE__Alternatives : ( ( ruleSequenceTerminal ) | ( ruleSequence ) | ( ruleCompoundSERE ) );
    public final void rule__SimpleSERE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:353:1: ( ( ruleSequenceTerminal ) | ( ruleSequence ) | ( ruleCompoundSERE ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSequenceCS.g:354:2: ( ruleSequenceTerminal )
                    {
                    // InternalSequenceCS.g:354:2: ( ruleSequenceTerminal )
                    // InternalSequenceCS.g:355:3: ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSEREAccess().getSequenceTerminalParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSEREAccess().getSequenceTerminalParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:360:2: ( ruleSequence )
                    {
                    // InternalSequenceCS.g:360:2: ( ruleSequence )
                    // InternalSequenceCS.g:361:3: ruleSequence
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSEREAccess().getSequenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSequence();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSEREAccess().getSequenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:366:2: ( ruleCompoundSERE )
                    {
                    // InternalSequenceCS.g:366:2: ( ruleCompoundSERE )
                    // InternalSequenceCS.g:367:3: ruleCompoundSERE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSEREAccess().getCompoundSEREParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCompoundSERE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSEREAccess().getCompoundSEREParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSERE__Alternatives"


    // $ANTLR start "rule__SequenceTerminal__Alternatives"
    // InternalSequenceCS.g:376:1: rule__SequenceTerminal__Alternatives : ( ( ( rule__SequenceTerminal__Group_0__0 ) ) | ( ( rule__SequenceTerminal__Group_1__0 ) ) | ( ( rule__SequenceTerminal__Group_2__0 ) ) );
    public final void rule__SequenceTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:380:1: ( ( ( rule__SequenceTerminal__Group_0__0 ) ) | ( ( rule__SequenceTerminal__Group_1__0 ) ) | ( ( rule__SequenceTerminal__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 11:
            case 30:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSequenceCS.g:381:2: ( ( rule__SequenceTerminal__Group_0__0 ) )
                    {
                    // InternalSequenceCS.g:381:2: ( ( rule__SequenceTerminal__Group_0__0 ) )
                    // InternalSequenceCS.g:382:3: ( rule__SequenceTerminal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceTerminalAccess().getGroup_0()); 
                    }
                    // InternalSequenceCS.g:383:3: ( rule__SequenceTerminal__Group_0__0 )
                    // InternalSequenceCS.g:383:4: rule__SequenceTerminal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceTerminal__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceTerminalAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:387:2: ( ( rule__SequenceTerminal__Group_1__0 ) )
                    {
                    // InternalSequenceCS.g:387:2: ( ( rule__SequenceTerminal__Group_1__0 ) )
                    // InternalSequenceCS.g:388:3: ( rule__SequenceTerminal__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceTerminalAccess().getGroup_1()); 
                    }
                    // InternalSequenceCS.g:389:3: ( rule__SequenceTerminal__Group_1__0 )
                    // InternalSequenceCS.g:389:4: rule__SequenceTerminal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceTerminal__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceTerminalAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:393:2: ( ( rule__SequenceTerminal__Group_2__0 ) )
                    {
                    // InternalSequenceCS.g:393:2: ( ( rule__SequenceTerminal__Group_2__0 ) )
                    // InternalSequenceCS.g:394:3: ( rule__SequenceTerminal__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceTerminalAccess().getGroup_2()); 
                    }
                    // InternalSequenceCS.g:395:3: ( rule__SequenceTerminal__Group_2__0 )
                    // InternalSequenceCS.g:395:4: rule__SequenceTerminal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceTerminal__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceTerminalAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Alternatives"


    // $ANTLR start "rule__SequenceTerminal__Alternatives_1_1"
    // InternalSequenceCS.g:403:1: rule__SequenceTerminal__Alternatives_1_1 : ( ( ( rule__SequenceTerminal__LiteralAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__SequenceTerminal__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:407:1: ( ( ( rule__SequenceTerminal__LiteralAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSequenceCS.g:408:2: ( ( rule__SequenceTerminal__LiteralAssignment_1_1_0 ) )
                    {
                    // InternalSequenceCS.g:408:2: ( ( rule__SequenceTerminal__LiteralAssignment_1_1_0 ) )
                    // InternalSequenceCS.g:409:3: ( rule__SequenceTerminal__LiteralAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceTerminalAccess().getLiteralAssignment_1_1_0()); 
                    }
                    // InternalSequenceCS.g:410:3: ( rule__SequenceTerminal__LiteralAssignment_1_1_0 )
                    // InternalSequenceCS.g:410:4: rule__SequenceTerminal__LiteralAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceTerminal__LiteralAssignment_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceTerminalAccess().getLiteralAssignment_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:414:2: ( 'false' )
                    {
                    // InternalSequenceCS.g:414:2: ( 'false' )
                    // InternalSequenceCS.g:415:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceTerminalAccess().getFalseKeyword_1_1_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceTerminalAccess().getFalseKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Alternatives_1_1"


    // $ANTLR start "rule__Sequence__Alternatives"
    // InternalSequenceCS.g:424:1: rule__Sequence__Alternatives : ( ( ruleBracedSERE ) | ( ruleRepeatedSERE ) );
    public final void rule__Sequence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:428:1: ( ( ruleBracedSERE ) | ( ruleRepeatedSERE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred7_InternalSequenceCS()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==11||(LA5_0>=14 && LA5_0<=15)||LA5_0==17||LA5_0==19||LA5_0==30) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSequenceCS.g:429:2: ( ruleBracedSERE )
                    {
                    // InternalSequenceCS.g:429:2: ( ruleBracedSERE )
                    // InternalSequenceCS.g:430:3: ruleBracedSERE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceAccess().getBracedSEREParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBracedSERE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceAccess().getBracedSEREParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:435:2: ( ruleRepeatedSERE )
                    {
                    // InternalSequenceCS.g:435:2: ( ruleRepeatedSERE )
                    // InternalSequenceCS.g:436:3: ruleRepeatedSERE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceAccess().getRepeatedSEREParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRepeatedSERE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceAccess().getRepeatedSEREParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Alternatives"


    // $ANTLR start "rule__RepeatedSERE__Alternatives"
    // InternalSequenceCS.g:445:1: rule__RepeatedSERE__Alternatives : ( ( ( rule__RepeatedSERE__Group_0__0 ) ) | ( ( rule__RepeatedSERE__Group_1__0 ) ) | ( ( rule__RepeatedSERE__Group_2__0 ) ) | ( ( rule__RepeatedSERE__Group_3__0 ) ) | ( ( rule__RepeatedSERE__Group_4__0 ) ) | ( ( rule__RepeatedSERE__Group_5__0 ) ) | ( ( rule__RepeatedSERE__Group_6__0 ) ) | ( ( rule__RepeatedSERE__Group_7__0 ) ) | ( ( rule__RepeatedSERE__Group_8__0 ) ) | ( ( rule__RepeatedSERE__Group_9__0 ) ) );
    public final void rule__RepeatedSERE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:449:1: ( ( ( rule__RepeatedSERE__Group_0__0 ) ) | ( ( rule__RepeatedSERE__Group_1__0 ) ) | ( ( rule__RepeatedSERE__Group_2__0 ) ) | ( ( rule__RepeatedSERE__Group_3__0 ) ) | ( ( rule__RepeatedSERE__Group_4__0 ) ) | ( ( rule__RepeatedSERE__Group_5__0 ) ) | ( ( rule__RepeatedSERE__Group_6__0 ) ) | ( ( rule__RepeatedSERE__Group_7__0 ) ) | ( ( rule__RepeatedSERE__Group_8__0 ) ) | ( ( rule__RepeatedSERE__Group_9__0 ) ) )
            int alt6=10;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSequenceCS.g:450:2: ( ( rule__RepeatedSERE__Group_0__0 ) )
                    {
                    // InternalSequenceCS.g:450:2: ( ( rule__RepeatedSERE__Group_0__0 ) )
                    // InternalSequenceCS.g:451:3: ( rule__RepeatedSERE__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_0()); 
                    }
                    // InternalSequenceCS.g:452:3: ( rule__RepeatedSERE__Group_0__0 )
                    // InternalSequenceCS.g:452:4: rule__RepeatedSERE__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:456:2: ( ( rule__RepeatedSERE__Group_1__0 ) )
                    {
                    // InternalSequenceCS.g:456:2: ( ( rule__RepeatedSERE__Group_1__0 ) )
                    // InternalSequenceCS.g:457:3: ( rule__RepeatedSERE__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_1()); 
                    }
                    // InternalSequenceCS.g:458:3: ( rule__RepeatedSERE__Group_1__0 )
                    // InternalSequenceCS.g:458:4: rule__RepeatedSERE__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:462:2: ( ( rule__RepeatedSERE__Group_2__0 ) )
                    {
                    // InternalSequenceCS.g:462:2: ( ( rule__RepeatedSERE__Group_2__0 ) )
                    // InternalSequenceCS.g:463:3: ( rule__RepeatedSERE__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_2()); 
                    }
                    // InternalSequenceCS.g:464:3: ( rule__RepeatedSERE__Group_2__0 )
                    // InternalSequenceCS.g:464:4: rule__RepeatedSERE__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSequenceCS.g:468:2: ( ( rule__RepeatedSERE__Group_3__0 ) )
                    {
                    // InternalSequenceCS.g:468:2: ( ( rule__RepeatedSERE__Group_3__0 ) )
                    // InternalSequenceCS.g:469:3: ( rule__RepeatedSERE__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_3()); 
                    }
                    // InternalSequenceCS.g:470:3: ( rule__RepeatedSERE__Group_3__0 )
                    // InternalSequenceCS.g:470:4: rule__RepeatedSERE__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSequenceCS.g:474:2: ( ( rule__RepeatedSERE__Group_4__0 ) )
                    {
                    // InternalSequenceCS.g:474:2: ( ( rule__RepeatedSERE__Group_4__0 ) )
                    // InternalSequenceCS.g:475:3: ( rule__RepeatedSERE__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_4()); 
                    }
                    // InternalSequenceCS.g:476:3: ( rule__RepeatedSERE__Group_4__0 )
                    // InternalSequenceCS.g:476:4: rule__RepeatedSERE__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSequenceCS.g:480:2: ( ( rule__RepeatedSERE__Group_5__0 ) )
                    {
                    // InternalSequenceCS.g:480:2: ( ( rule__RepeatedSERE__Group_5__0 ) )
                    // InternalSequenceCS.g:481:3: ( rule__RepeatedSERE__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_5()); 
                    }
                    // InternalSequenceCS.g:482:3: ( rule__RepeatedSERE__Group_5__0 )
                    // InternalSequenceCS.g:482:4: rule__RepeatedSERE__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSequenceCS.g:486:2: ( ( rule__RepeatedSERE__Group_6__0 ) )
                    {
                    // InternalSequenceCS.g:486:2: ( ( rule__RepeatedSERE__Group_6__0 ) )
                    // InternalSequenceCS.g:487:3: ( rule__RepeatedSERE__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_6()); 
                    }
                    // InternalSequenceCS.g:488:3: ( rule__RepeatedSERE__Group_6__0 )
                    // InternalSequenceCS.g:488:4: rule__RepeatedSERE__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSequenceCS.g:492:2: ( ( rule__RepeatedSERE__Group_7__0 ) )
                    {
                    // InternalSequenceCS.g:492:2: ( ( rule__RepeatedSERE__Group_7__0 ) )
                    // InternalSequenceCS.g:493:3: ( rule__RepeatedSERE__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_7()); 
                    }
                    // InternalSequenceCS.g:494:3: ( rule__RepeatedSERE__Group_7__0 )
                    // InternalSequenceCS.g:494:4: rule__RepeatedSERE__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSequenceCS.g:498:2: ( ( rule__RepeatedSERE__Group_8__0 ) )
                    {
                    // InternalSequenceCS.g:498:2: ( ( rule__RepeatedSERE__Group_8__0 ) )
                    // InternalSequenceCS.g:499:3: ( rule__RepeatedSERE__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_8()); 
                    }
                    // InternalSequenceCS.g:500:3: ( rule__RepeatedSERE__Group_8__0 )
                    // InternalSequenceCS.g:500:4: rule__RepeatedSERE__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalSequenceCS.g:504:2: ( ( rule__RepeatedSERE__Group_9__0 ) )
                    {
                    // InternalSequenceCS.g:504:2: ( ( rule__RepeatedSERE__Group_9__0 ) )
                    // InternalSequenceCS.g:505:3: ( rule__RepeatedSERE__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatedSEREAccess().getGroup_9()); 
                    }
                    // InternalSequenceCS.g:506:3: ( rule__RepeatedSERE__Group_9__0 )
                    // InternalSequenceCS.g:506:4: rule__RepeatedSERE__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatedSEREAccess().getGroup_9()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Alternatives"


    // $ANTLR start "rule__CompoundSERE__Alternatives"
    // InternalSequenceCS.g:514:1: rule__CompoundSERE__Alternatives : ( ( ruleRepeatedSERE ) | ( ruleBracedSERE ) | ( ruleBinaryCompoundSERE ) );
    public final void rule__CompoundSERE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:518:1: ( ( ruleRepeatedSERE ) | ( ruleBracedSERE ) | ( ruleBinaryCompoundSERE ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSequenceCS.g:519:2: ( ruleRepeatedSERE )
                    {
                    // InternalSequenceCS.g:519:2: ( ruleRepeatedSERE )
                    // InternalSequenceCS.g:520:3: ruleRepeatedSERE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompoundSEREAccess().getRepeatedSEREParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRepeatedSERE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompoundSEREAccess().getRepeatedSEREParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:525:2: ( ruleBracedSERE )
                    {
                    // InternalSequenceCS.g:525:2: ( ruleBracedSERE )
                    // InternalSequenceCS.g:526:3: ruleBracedSERE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompoundSEREAccess().getBracedSEREParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBracedSERE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompoundSEREAccess().getBracedSEREParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:531:2: ( ruleBinaryCompoundSERE )
                    {
                    // InternalSequenceCS.g:531:2: ( ruleBinaryCompoundSERE )
                    // InternalSequenceCS.g:532:3: ruleBinaryCompoundSERE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompoundSEREAccess().getBinaryCompoundSEREParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBinaryCompoundSERE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompoundSEREAccess().getBinaryCompoundSEREParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundSERE__Alternatives"


    // $ANTLR start "rule__BinaryCompoundSERE__Alternatives"
    // InternalSequenceCS.g:541:1: rule__BinaryCompoundSERE__Alternatives : ( ( ( rule__BinaryCompoundSERE__Group_0__0 ) ) | ( ( rule__BinaryCompoundSERE__Group_1__0 ) ) | ( ( rule__BinaryCompoundSERE__Group_2__0 ) ) | ( ( rule__BinaryCompoundSERE__Group_3__0 ) ) );
    public final void rule__BinaryCompoundSERE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:545:1: ( ( ( rule__BinaryCompoundSERE__Group_0__0 ) ) | ( ( rule__BinaryCompoundSERE__Group_1__0 ) ) | ( ( rule__BinaryCompoundSERE__Group_2__0 ) ) | ( ( rule__BinaryCompoundSERE__Group_3__0 ) ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSequenceCS.g:546:2: ( ( rule__BinaryCompoundSERE__Group_0__0 ) )
                    {
                    // InternalSequenceCS.g:546:2: ( ( rule__BinaryCompoundSERE__Group_0__0 ) )
                    // InternalSequenceCS.g:547:3: ( rule__BinaryCompoundSERE__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_0()); 
                    }
                    // InternalSequenceCS.g:548:3: ( rule__BinaryCompoundSERE__Group_0__0 )
                    // InternalSequenceCS.g:548:4: rule__BinaryCompoundSERE__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:552:2: ( ( rule__BinaryCompoundSERE__Group_1__0 ) )
                    {
                    // InternalSequenceCS.g:552:2: ( ( rule__BinaryCompoundSERE__Group_1__0 ) )
                    // InternalSequenceCS.g:553:3: ( rule__BinaryCompoundSERE__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_1()); 
                    }
                    // InternalSequenceCS.g:554:3: ( rule__BinaryCompoundSERE__Group_1__0 )
                    // InternalSequenceCS.g:554:4: rule__BinaryCompoundSERE__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:558:2: ( ( rule__BinaryCompoundSERE__Group_2__0 ) )
                    {
                    // InternalSequenceCS.g:558:2: ( ( rule__BinaryCompoundSERE__Group_2__0 ) )
                    // InternalSequenceCS.g:559:3: ( rule__BinaryCompoundSERE__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_2()); 
                    }
                    // InternalSequenceCS.g:560:3: ( rule__BinaryCompoundSERE__Group_2__0 )
                    // InternalSequenceCS.g:560:4: rule__BinaryCompoundSERE__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSequenceCS.g:564:2: ( ( rule__BinaryCompoundSERE__Group_3__0 ) )
                    {
                    // InternalSequenceCS.g:564:2: ( ( rule__BinaryCompoundSERE__Group_3__0 ) )
                    // InternalSequenceCS.g:565:3: ( rule__BinaryCompoundSERE__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_3()); 
                    }
                    // InternalSequenceCS.g:566:3: ( rule__BinaryCompoundSERE__Group_3__0 )
                    // InternalSequenceCS.g:566:4: rule__BinaryCompoundSERE__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Alternatives"


    // $ANTLR start "rule__BinaryCompoundSERE__Alternatives_0_1"
    // InternalSequenceCS.g:574:1: rule__BinaryCompoundSERE__Alternatives_0_1 : ( ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_0_1_2__0 ) ) );
    public final void rule__BinaryCompoundSERE__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:578:1: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_0_1_2__0 ) ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalSequenceCS.g:579:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 ) )
                    {
                    // InternalSequenceCS.g:579:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 ) )
                    // InternalSequenceCS.g:580:3: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_0_1_0()); 
                    }
                    // InternalSequenceCS.g:581:3: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 )
                    // InternalSequenceCS.g:581:4: rule__BinaryCompoundSERE__LeftAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__LeftAssignment_0_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:585:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 ) )
                    {
                    // InternalSequenceCS.g:585:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 ) )
                    // InternalSequenceCS.g:586:3: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_0_1_1()); 
                    }
                    // InternalSequenceCS.g:587:3: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 )
                    // InternalSequenceCS.g:587:4: rule__BinaryCompoundSERE__LeftAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__LeftAssignment_0_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_0_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:591:2: ( ( rule__BinaryCompoundSERE__Group_0_1_2__0 ) )
                    {
                    // InternalSequenceCS.g:591:2: ( ( rule__BinaryCompoundSERE__Group_0_1_2__0 ) )
                    // InternalSequenceCS.g:592:3: ( rule__BinaryCompoundSERE__Group_0_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_0_1_2()); 
                    }
                    // InternalSequenceCS.g:593:3: ( rule__BinaryCompoundSERE__Group_0_1_2__0 )
                    // InternalSequenceCS.g:593:4: rule__BinaryCompoundSERE__Group_0_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_0_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_0_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Alternatives_0_1"


    // $ANTLR start "rule__BinaryCompoundSERE__Alternatives_0_3"
    // InternalSequenceCS.g:601:1: rule__BinaryCompoundSERE__Alternatives_0_3 : ( ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_0_3_2__0 ) ) );
    public final void rule__BinaryCompoundSERE__Alternatives_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:605:1: ( ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_0_3_2__0 ) ) )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalSequenceCS.g:606:2: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 ) )
                    {
                    // InternalSequenceCS.g:606:2: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 ) )
                    // InternalSequenceCS.g:607:3: ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_0_3_0()); 
                    }
                    // InternalSequenceCS.g:608:3: ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 )
                    // InternalSequenceCS.g:608:4: rule__BinaryCompoundSERE__RightAssignment_0_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__RightAssignment_0_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_0_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:612:2: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 ) )
                    {
                    // InternalSequenceCS.g:612:2: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 ) )
                    // InternalSequenceCS.g:613:3: ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_0_3_1()); 
                    }
                    // InternalSequenceCS.g:614:3: ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 )
                    // InternalSequenceCS.g:614:4: rule__BinaryCompoundSERE__RightAssignment_0_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__RightAssignment_0_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_0_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:618:2: ( ( rule__BinaryCompoundSERE__Group_0_3_2__0 ) )
                    {
                    // InternalSequenceCS.g:618:2: ( ( rule__BinaryCompoundSERE__Group_0_3_2__0 ) )
                    // InternalSequenceCS.g:619:3: ( rule__BinaryCompoundSERE__Group_0_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_0_3_2()); 
                    }
                    // InternalSequenceCS.g:620:3: ( rule__BinaryCompoundSERE__Group_0_3_2__0 )
                    // InternalSequenceCS.g:620:4: rule__BinaryCompoundSERE__Group_0_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_0_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_0_3_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Alternatives_0_3"


    // $ANTLR start "rule__BinaryCompoundSERE__Alternatives_1_1"
    // InternalSequenceCS.g:628:1: rule__BinaryCompoundSERE__Alternatives_1_1 : ( ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_1_1_2__0 ) ) );
    public final void rule__BinaryCompoundSERE__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:632:1: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_1_1_2__0 ) ) )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalSequenceCS.g:633:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 ) )
                    {
                    // InternalSequenceCS.g:633:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 ) )
                    // InternalSequenceCS.g:634:3: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_1_1_0()); 
                    }
                    // InternalSequenceCS.g:635:3: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 )
                    // InternalSequenceCS.g:635:4: rule__BinaryCompoundSERE__LeftAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__LeftAssignment_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:639:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 ) )
                    {
                    // InternalSequenceCS.g:639:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 ) )
                    // InternalSequenceCS.g:640:3: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_1_1_1()); 
                    }
                    // InternalSequenceCS.g:641:3: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 )
                    // InternalSequenceCS.g:641:4: rule__BinaryCompoundSERE__LeftAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__LeftAssignment_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_1_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:645:2: ( ( rule__BinaryCompoundSERE__Group_1_1_2__0 ) )
                    {
                    // InternalSequenceCS.g:645:2: ( ( rule__BinaryCompoundSERE__Group_1_1_2__0 ) )
                    // InternalSequenceCS.g:646:3: ( rule__BinaryCompoundSERE__Group_1_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_1_1_2()); 
                    }
                    // InternalSequenceCS.g:647:3: ( rule__BinaryCompoundSERE__Group_1_1_2__0 )
                    // InternalSequenceCS.g:647:4: rule__BinaryCompoundSERE__Group_1_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_1_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_1_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Alternatives_1_1"


    // $ANTLR start "rule__BinaryCompoundSERE__Alternatives_1_3"
    // InternalSequenceCS.g:655:1: rule__BinaryCompoundSERE__Alternatives_1_3 : ( ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_1_3_2__0 ) ) );
    public final void rule__BinaryCompoundSERE__Alternatives_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:659:1: ( ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_1_3_2__0 ) ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSequenceCS.g:660:2: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 ) )
                    {
                    // InternalSequenceCS.g:660:2: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 ) )
                    // InternalSequenceCS.g:661:3: ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_1_3_0()); 
                    }
                    // InternalSequenceCS.g:662:3: ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 )
                    // InternalSequenceCS.g:662:4: rule__BinaryCompoundSERE__RightAssignment_1_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__RightAssignment_1_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_1_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:666:2: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 ) )
                    {
                    // InternalSequenceCS.g:666:2: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 ) )
                    // InternalSequenceCS.g:667:3: ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_1_3_1()); 
                    }
                    // InternalSequenceCS.g:668:3: ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 )
                    // InternalSequenceCS.g:668:4: rule__BinaryCompoundSERE__RightAssignment_1_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__RightAssignment_1_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_1_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:672:2: ( ( rule__BinaryCompoundSERE__Group_1_3_2__0 ) )
                    {
                    // InternalSequenceCS.g:672:2: ( ( rule__BinaryCompoundSERE__Group_1_3_2__0 ) )
                    // InternalSequenceCS.g:673:3: ( rule__BinaryCompoundSERE__Group_1_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_1_3_2()); 
                    }
                    // InternalSequenceCS.g:674:3: ( rule__BinaryCompoundSERE__Group_1_3_2__0 )
                    // InternalSequenceCS.g:674:4: rule__BinaryCompoundSERE__Group_1_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_1_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_1_3_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Alternatives_1_3"


    // $ANTLR start "rule__BinaryCompoundSERE__Alternatives_2_1"
    // InternalSequenceCS.g:682:1: rule__BinaryCompoundSERE__Alternatives_2_1 : ( ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_2_1_2__0 ) ) );
    public final void rule__BinaryCompoundSERE__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:686:1: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_2_1_2__0 ) ) )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalSequenceCS.g:687:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 ) )
                    {
                    // InternalSequenceCS.g:687:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 ) )
                    // InternalSequenceCS.g:688:3: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_2_1_0()); 
                    }
                    // InternalSequenceCS.g:689:3: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 )
                    // InternalSequenceCS.g:689:4: rule__BinaryCompoundSERE__LeftAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__LeftAssignment_2_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:693:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 ) )
                    {
                    // InternalSequenceCS.g:693:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 ) )
                    // InternalSequenceCS.g:694:3: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_2_1_1()); 
                    }
                    // InternalSequenceCS.g:695:3: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 )
                    // InternalSequenceCS.g:695:4: rule__BinaryCompoundSERE__LeftAssignment_2_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__LeftAssignment_2_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_2_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:699:2: ( ( rule__BinaryCompoundSERE__Group_2_1_2__0 ) )
                    {
                    // InternalSequenceCS.g:699:2: ( ( rule__BinaryCompoundSERE__Group_2_1_2__0 ) )
                    // InternalSequenceCS.g:700:3: ( rule__BinaryCompoundSERE__Group_2_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_2_1_2()); 
                    }
                    // InternalSequenceCS.g:701:3: ( rule__BinaryCompoundSERE__Group_2_1_2__0 )
                    // InternalSequenceCS.g:701:4: rule__BinaryCompoundSERE__Group_2_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_2_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_2_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Alternatives_2_1"


    // $ANTLR start "rule__BinaryCompoundSERE__Alternatives_2_3"
    // InternalSequenceCS.g:709:1: rule__BinaryCompoundSERE__Alternatives_2_3 : ( ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_2_3_2__0 ) ) );
    public final void rule__BinaryCompoundSERE__Alternatives_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:713:1: ( ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_2_3_2__0 ) ) )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalSequenceCS.g:714:2: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 ) )
                    {
                    // InternalSequenceCS.g:714:2: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 ) )
                    // InternalSequenceCS.g:715:3: ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_2_3_0()); 
                    }
                    // InternalSequenceCS.g:716:3: ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 )
                    // InternalSequenceCS.g:716:4: rule__BinaryCompoundSERE__RightAssignment_2_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__RightAssignment_2_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_2_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:720:2: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 ) )
                    {
                    // InternalSequenceCS.g:720:2: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 ) )
                    // InternalSequenceCS.g:721:3: ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_2_3_1()); 
                    }
                    // InternalSequenceCS.g:722:3: ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 )
                    // InternalSequenceCS.g:722:4: rule__BinaryCompoundSERE__RightAssignment_2_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__RightAssignment_2_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_2_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:726:2: ( ( rule__BinaryCompoundSERE__Group_2_3_2__0 ) )
                    {
                    // InternalSequenceCS.g:726:2: ( ( rule__BinaryCompoundSERE__Group_2_3_2__0 ) )
                    // InternalSequenceCS.g:727:3: ( rule__BinaryCompoundSERE__Group_2_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_2_3_2()); 
                    }
                    // InternalSequenceCS.g:728:3: ( rule__BinaryCompoundSERE__Group_2_3_2__0 )
                    // InternalSequenceCS.g:728:4: rule__BinaryCompoundSERE__Group_2_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_2_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_2_3_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Alternatives_2_3"


    // $ANTLR start "rule__BinaryCompoundSERE__Alternatives_3_1"
    // InternalSequenceCS.g:736:1: rule__BinaryCompoundSERE__Alternatives_3_1 : ( ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_3_1_2__0 ) ) );
    public final void rule__BinaryCompoundSERE__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:740:1: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_3_1_2__0 ) ) )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalSequenceCS.g:741:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 ) )
                    {
                    // InternalSequenceCS.g:741:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 ) )
                    // InternalSequenceCS.g:742:3: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_3_1_0()); 
                    }
                    // InternalSequenceCS.g:743:3: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 )
                    // InternalSequenceCS.g:743:4: rule__BinaryCompoundSERE__LeftAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__LeftAssignment_3_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:747:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 ) )
                    {
                    // InternalSequenceCS.g:747:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 ) )
                    // InternalSequenceCS.g:748:3: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_3_1_1()); 
                    }
                    // InternalSequenceCS.g:749:3: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 )
                    // InternalSequenceCS.g:749:4: rule__BinaryCompoundSERE__LeftAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__LeftAssignment_3_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_3_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:753:2: ( ( rule__BinaryCompoundSERE__Group_3_1_2__0 ) )
                    {
                    // InternalSequenceCS.g:753:2: ( ( rule__BinaryCompoundSERE__Group_3_1_2__0 ) )
                    // InternalSequenceCS.g:754:3: ( rule__BinaryCompoundSERE__Group_3_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_3_1_2()); 
                    }
                    // InternalSequenceCS.g:755:3: ( rule__BinaryCompoundSERE__Group_3_1_2__0 )
                    // InternalSequenceCS.g:755:4: rule__BinaryCompoundSERE__Group_3_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_3_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_3_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Alternatives_3_1"


    // $ANTLR start "rule__BinaryCompoundSERE__Alternatives_3_3"
    // InternalSequenceCS.g:763:1: rule__BinaryCompoundSERE__Alternatives_3_3 : ( ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_3_3_2__0 ) ) );
    public final void rule__BinaryCompoundSERE__Alternatives_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:767:1: ( ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_3_3_2__0 ) ) )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalSequenceCS.g:768:2: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 ) )
                    {
                    // InternalSequenceCS.g:768:2: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 ) )
                    // InternalSequenceCS.g:769:3: ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_3_3_0()); 
                    }
                    // InternalSequenceCS.g:770:3: ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 )
                    // InternalSequenceCS.g:770:4: rule__BinaryCompoundSERE__RightAssignment_3_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__RightAssignment_3_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_3_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:774:2: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 ) )
                    {
                    // InternalSequenceCS.g:774:2: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 ) )
                    // InternalSequenceCS.g:775:3: ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_3_3_1()); 
                    }
                    // InternalSequenceCS.g:776:3: ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 )
                    // InternalSequenceCS.g:776:4: rule__BinaryCompoundSERE__RightAssignment_3_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__RightAssignment_3_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_3_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:780:2: ( ( rule__BinaryCompoundSERE__Group_3_3_2__0 ) )
                    {
                    // InternalSequenceCS.g:780:2: ( ( rule__BinaryCompoundSERE__Group_3_3_2__0 ) )
                    // InternalSequenceCS.g:781:3: ( rule__BinaryCompoundSERE__Group_3_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_3_3_2()); 
                    }
                    // InternalSequenceCS.g:782:3: ( rule__BinaryCompoundSERE__Group_3_3_2__0 )
                    // InternalSequenceCS.g:782:4: rule__BinaryCompoundSERE__Group_3_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryCompoundSERE__Group_3_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryCompoundSEREAccess().getGroup_3_3_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Alternatives_3_3"


    // $ANTLR start "rule__Count__Alternatives"
    // InternalSequenceCS.g:790:1: rule__Count__Alternatives : ( ( ( rule__Count__COUNTAssignment_0 ) ) | ( ruleRange ) );
    public final void rule__Count__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:794:1: ( ( ( rule__Count__COUNTAssignment_0 ) ) | ( ruleRange ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==12) ) {
                    alt17=2;
                }
                else if ( (LA17_1==EOF||LA17_1==16) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSequenceCS.g:795:2: ( ( rule__Count__COUNTAssignment_0 ) )
                    {
                    // InternalSequenceCS.g:795:2: ( ( rule__Count__COUNTAssignment_0 ) )
                    // InternalSequenceCS.g:796:3: ( rule__Count__COUNTAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCountAccess().getCOUNTAssignment_0()); 
                    }
                    // InternalSequenceCS.g:797:3: ( rule__Count__COUNTAssignment_0 )
                    // InternalSequenceCS.g:797:4: rule__Count__COUNTAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Count__COUNTAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCountAccess().getCOUNTAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:801:2: ( ruleRange )
                    {
                    // InternalSequenceCS.g:801:2: ( ruleRange )
                    // InternalSequenceCS.g:802:3: ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCountAccess().getRangeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRange();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCountAccess().getRangeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Alternatives"


    // $ANTLR start "rule__SERE__Group__0"
    // InternalSequenceCS.g:811:1: rule__SERE__Group__0 : rule__SERE__Group__0__Impl rule__SERE__Group__1 ;
    public final void rule__SERE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:815:1: ( rule__SERE__Group__0__Impl rule__SERE__Group__1 )
            // InternalSequenceCS.g:816:2: rule__SERE__Group__0__Impl rule__SERE__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SERE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SERE__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group__0"


    // $ANTLR start "rule__SERE__Group__0__Impl"
    // InternalSequenceCS.g:823:1: rule__SERE__Group__0__Impl : ( ruleSimpleSERE ) ;
    public final void rule__SERE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:827:1: ( ( ruleSimpleSERE ) )
            // InternalSequenceCS.g:828:1: ( ruleSimpleSERE )
            {
            // InternalSequenceCS.g:828:1: ( ruleSimpleSERE )
            // InternalSequenceCS.g:829:2: ruleSimpleSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getSimpleSEREParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSimpleSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getSimpleSEREParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group__0__Impl"


    // $ANTLR start "rule__SERE__Group__1"
    // InternalSequenceCS.g:838:1: rule__SERE__Group__1 : rule__SERE__Group__1__Impl ;
    public final void rule__SERE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:842:1: ( rule__SERE__Group__1__Impl )
            // InternalSequenceCS.g:843:2: rule__SERE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SERE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group__1"


    // $ANTLR start "rule__SERE__Group__1__Impl"
    // InternalSequenceCS.g:849:1: rule__SERE__Group__1__Impl : ( ( rule__SERE__Alternatives_1 ) ) ;
    public final void rule__SERE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:853:1: ( ( ( rule__SERE__Alternatives_1 ) ) )
            // InternalSequenceCS.g:854:1: ( ( rule__SERE__Alternatives_1 ) )
            {
            // InternalSequenceCS.g:854:1: ( ( rule__SERE__Alternatives_1 ) )
            // InternalSequenceCS.g:855:2: ( rule__SERE__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getAlternatives_1()); 
            }
            // InternalSequenceCS.g:856:2: ( rule__SERE__Alternatives_1 )
            // InternalSequenceCS.g:856:3: rule__SERE__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SERE__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group__1__Impl"


    // $ANTLR start "rule__SERE__Group_1_0__0"
    // InternalSequenceCS.g:865:1: rule__SERE__Group_1_0__0 : rule__SERE__Group_1_0__0__Impl rule__SERE__Group_1_0__1 ;
    public final void rule__SERE__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:869:1: ( rule__SERE__Group_1_0__0__Impl rule__SERE__Group_1_0__1 )
            // InternalSequenceCS.g:870:2: rule__SERE__Group_1_0__0__Impl rule__SERE__Group_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__SERE__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SERE__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_0__0"


    // $ANTLR start "rule__SERE__Group_1_0__0__Impl"
    // InternalSequenceCS.g:877:1: rule__SERE__Group_1_0__0__Impl : ( ':' ) ;
    public final void rule__SERE__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:881:1: ( ( ':' ) )
            // InternalSequenceCS.g:882:1: ( ':' )
            {
            // InternalSequenceCS.g:882:1: ( ':' )
            // InternalSequenceCS.g:883:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getColonKeyword_1_0_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getColonKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_0__0__Impl"


    // $ANTLR start "rule__SERE__Group_1_0__1"
    // InternalSequenceCS.g:892:1: rule__SERE__Group_1_0__1 : rule__SERE__Group_1_0__1__Impl rule__SERE__Group_1_0__2 ;
    public final void rule__SERE__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:896:1: ( rule__SERE__Group_1_0__1__Impl rule__SERE__Group_1_0__2 )
            // InternalSequenceCS.g:897:2: rule__SERE__Group_1_0__1__Impl rule__SERE__Group_1_0__2
            {
            pushFollow(FOLLOW_4);
            rule__SERE__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SERE__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_0__1"


    // $ANTLR start "rule__SERE__Group_1_0__1__Impl"
    // InternalSequenceCS.g:904:1: rule__SERE__Group_1_0__1__Impl : ( () ) ;
    public final void rule__SERE__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:908:1: ( ( () ) )
            // InternalSequenceCS.g:909:1: ( () )
            {
            // InternalSequenceCS.g:909:1: ( () )
            // InternalSequenceCS.g:910:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getFusionSERELeftAction_1_0_1()); 
            }
            // InternalSequenceCS.g:911:2: ()
            // InternalSequenceCS.g:911:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getFusionSERELeftAction_1_0_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_0__1__Impl"


    // $ANTLR start "rule__SERE__Group_1_0__2"
    // InternalSequenceCS.g:919:1: rule__SERE__Group_1_0__2 : rule__SERE__Group_1_0__2__Impl ;
    public final void rule__SERE__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:923:1: ( rule__SERE__Group_1_0__2__Impl )
            // InternalSequenceCS.g:924:2: rule__SERE__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SERE__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_0__2"


    // $ANTLR start "rule__SERE__Group_1_0__2__Impl"
    // InternalSequenceCS.g:930:1: rule__SERE__Group_1_0__2__Impl : ( ( rule__SERE__RightAssignment_1_0_2 ) ) ;
    public final void rule__SERE__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:934:1: ( ( ( rule__SERE__RightAssignment_1_0_2 ) ) )
            // InternalSequenceCS.g:935:1: ( ( rule__SERE__RightAssignment_1_0_2 ) )
            {
            // InternalSequenceCS.g:935:1: ( ( rule__SERE__RightAssignment_1_0_2 ) )
            // InternalSequenceCS.g:936:2: ( rule__SERE__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getRightAssignment_1_0_2()); 
            }
            // InternalSequenceCS.g:937:2: ( rule__SERE__RightAssignment_1_0_2 )
            // InternalSequenceCS.g:937:3: rule__SERE__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SERE__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_0__2__Impl"


    // $ANTLR start "rule__SERE__Group_1_1__0"
    // InternalSequenceCS.g:946:1: rule__SERE__Group_1_1__0 : rule__SERE__Group_1_1__0__Impl rule__SERE__Group_1_1__1 ;
    public final void rule__SERE__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:950:1: ( rule__SERE__Group_1_1__0__Impl rule__SERE__Group_1_1__1 )
            // InternalSequenceCS.g:951:2: rule__SERE__Group_1_1__0__Impl rule__SERE__Group_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SERE__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SERE__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_1__0"


    // $ANTLR start "rule__SERE__Group_1_1__0__Impl"
    // InternalSequenceCS.g:958:1: rule__SERE__Group_1_1__0__Impl : ( ';' ) ;
    public final void rule__SERE__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:962:1: ( ( ';' ) )
            // InternalSequenceCS.g:963:1: ( ';' )
            {
            // InternalSequenceCS.g:963:1: ( ';' )
            // InternalSequenceCS.g:964:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getSemicolonKeyword_1_1_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getSemicolonKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_1__0__Impl"


    // $ANTLR start "rule__SERE__Group_1_1__1"
    // InternalSequenceCS.g:973:1: rule__SERE__Group_1_1__1 : rule__SERE__Group_1_1__1__Impl rule__SERE__Group_1_1__2 ;
    public final void rule__SERE__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:977:1: ( rule__SERE__Group_1_1__1__Impl rule__SERE__Group_1_1__2 )
            // InternalSequenceCS.g:978:2: rule__SERE__Group_1_1__1__Impl rule__SERE__Group_1_1__2
            {
            pushFollow(FOLLOW_4);
            rule__SERE__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SERE__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_1__1"


    // $ANTLR start "rule__SERE__Group_1_1__1__Impl"
    // InternalSequenceCS.g:985:1: rule__SERE__Group_1_1__1__Impl : ( () ) ;
    public final void rule__SERE__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:989:1: ( ( () ) )
            // InternalSequenceCS.g:990:1: ( () )
            {
            // InternalSequenceCS.g:990:1: ( () )
            // InternalSequenceCS.g:991:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getConcatenationSERELeftAction_1_1_1()); 
            }
            // InternalSequenceCS.g:992:2: ()
            // InternalSequenceCS.g:992:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getConcatenationSERELeftAction_1_1_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_1__1__Impl"


    // $ANTLR start "rule__SERE__Group_1_1__2"
    // InternalSequenceCS.g:1000:1: rule__SERE__Group_1_1__2 : rule__SERE__Group_1_1__2__Impl ;
    public final void rule__SERE__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1004:1: ( rule__SERE__Group_1_1__2__Impl )
            // InternalSequenceCS.g:1005:2: rule__SERE__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SERE__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_1__2"


    // $ANTLR start "rule__SERE__Group_1_1__2__Impl"
    // InternalSequenceCS.g:1011:1: rule__SERE__Group_1_1__2__Impl : ( ( rule__SERE__RightAssignment_1_1_2 ) ) ;
    public final void rule__SERE__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1015:1: ( ( ( rule__SERE__RightAssignment_1_1_2 ) ) )
            // InternalSequenceCS.g:1016:1: ( ( rule__SERE__RightAssignment_1_1_2 ) )
            {
            // InternalSequenceCS.g:1016:1: ( ( rule__SERE__RightAssignment_1_1_2 ) )
            // InternalSequenceCS.g:1017:2: ( rule__SERE__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getRightAssignment_1_1_2()); 
            }
            // InternalSequenceCS.g:1018:2: ( rule__SERE__RightAssignment_1_1_2 )
            // InternalSequenceCS.g:1018:3: rule__SERE__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SERE__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getRightAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__Group_1_1__2__Impl"


    // $ANTLR start "rule__SequenceTerminal__Group_0__0"
    // InternalSequenceCS.g:1027:1: rule__SequenceTerminal__Group_0__0 : rule__SequenceTerminal__Group_0__0__Impl rule__SequenceTerminal__Group_0__1 ;
    public final void rule__SequenceTerminal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1031:1: ( rule__SequenceTerminal__Group_0__0__Impl rule__SequenceTerminal__Group_0__1 )
            // InternalSequenceCS.g:1032:2: rule__SequenceTerminal__Group_0__0__Impl rule__SequenceTerminal__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__SequenceTerminal__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_0__0"


    // $ANTLR start "rule__SequenceTerminal__Group_0__0__Impl"
    // InternalSequenceCS.g:1039:1: rule__SequenceTerminal__Group_0__0__Impl : ( () ) ;
    public final void rule__SequenceTerminal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1043:1: ( ( () ) )
            // InternalSequenceCS.g:1044:1: ( () )
            {
            // InternalSequenceCS.g:1044:1: ( () )
            // InternalSequenceCS.g:1045:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getNotSequenceTerminalAction_0_0()); 
            }
            // InternalSequenceCS.g:1046:2: ()
            // InternalSequenceCS.g:1046:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getNotSequenceTerminalAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_0__0__Impl"


    // $ANTLR start "rule__SequenceTerminal__Group_0__1"
    // InternalSequenceCS.g:1054:1: rule__SequenceTerminal__Group_0__1 : rule__SequenceTerminal__Group_0__1__Impl rule__SequenceTerminal__Group_0__2 ;
    public final void rule__SequenceTerminal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1058:1: ( rule__SequenceTerminal__Group_0__1__Impl rule__SequenceTerminal__Group_0__2 )
            // InternalSequenceCS.g:1059:2: rule__SequenceTerminal__Group_0__1__Impl rule__SequenceTerminal__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__SequenceTerminal__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_0__1"


    // $ANTLR start "rule__SequenceTerminal__Group_0__1__Impl"
    // InternalSequenceCS.g:1066:1: rule__SequenceTerminal__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__SequenceTerminal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1070:1: ( ( 'not' ) )
            // InternalSequenceCS.g:1071:1: ( 'not' )
            {
            // InternalSequenceCS.g:1071:1: ( 'not' )
            // InternalSequenceCS.g:1072:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getNotKeyword_0_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getNotKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_0__1__Impl"


    // $ANTLR start "rule__SequenceTerminal__Group_0__2"
    // InternalSequenceCS.g:1081:1: rule__SequenceTerminal__Group_0__2 : rule__SequenceTerminal__Group_0__2__Impl ;
    public final void rule__SequenceTerminal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1085:1: ( rule__SequenceTerminal__Group_0__2__Impl )
            // InternalSequenceCS.g:1086:2: rule__SequenceTerminal__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_0__2"


    // $ANTLR start "rule__SequenceTerminal__Group_0__2__Impl"
    // InternalSequenceCS.g:1092:1: rule__SequenceTerminal__Group_0__2__Impl : ( ( rule__SequenceTerminal__LiteralAssignment_0_2 ) ) ;
    public final void rule__SequenceTerminal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1096:1: ( ( ( rule__SequenceTerminal__LiteralAssignment_0_2 ) ) )
            // InternalSequenceCS.g:1097:1: ( ( rule__SequenceTerminal__LiteralAssignment_0_2 ) )
            {
            // InternalSequenceCS.g:1097:1: ( ( rule__SequenceTerminal__LiteralAssignment_0_2 ) )
            // InternalSequenceCS.g:1098:2: ( rule__SequenceTerminal__LiteralAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getLiteralAssignment_0_2()); 
            }
            // InternalSequenceCS.g:1099:2: ( rule__SequenceTerminal__LiteralAssignment_0_2 )
            // InternalSequenceCS.g:1099:3: rule__SequenceTerminal__LiteralAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__LiteralAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getLiteralAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_0__2__Impl"


    // $ANTLR start "rule__SequenceTerminal__Group_1__0"
    // InternalSequenceCS.g:1108:1: rule__SequenceTerminal__Group_1__0 : rule__SequenceTerminal__Group_1__0__Impl rule__SequenceTerminal__Group_1__1 ;
    public final void rule__SequenceTerminal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1112:1: ( rule__SequenceTerminal__Group_1__0__Impl rule__SequenceTerminal__Group_1__1 )
            // InternalSequenceCS.g:1113:2: rule__SequenceTerminal__Group_1__0__Impl rule__SequenceTerminal__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__SequenceTerminal__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_1__0"


    // $ANTLR start "rule__SequenceTerminal__Group_1__0__Impl"
    // InternalSequenceCS.g:1120:1: rule__SequenceTerminal__Group_1__0__Impl : ( () ) ;
    public final void rule__SequenceTerminal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1124:1: ( ( () ) )
            // InternalSequenceCS.g:1125:1: ( () )
            {
            // InternalSequenceCS.g:1125:1: ( () )
            // InternalSequenceCS.g:1126:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getBooleanLiteralAction_1_0()); 
            }
            // InternalSequenceCS.g:1127:2: ()
            // InternalSequenceCS.g:1127:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getBooleanLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_1__0__Impl"


    // $ANTLR start "rule__SequenceTerminal__Group_1__1"
    // InternalSequenceCS.g:1135:1: rule__SequenceTerminal__Group_1__1 : rule__SequenceTerminal__Group_1__1__Impl ;
    public final void rule__SequenceTerminal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1139:1: ( rule__SequenceTerminal__Group_1__1__Impl )
            // InternalSequenceCS.g:1140:2: rule__SequenceTerminal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_1__1"


    // $ANTLR start "rule__SequenceTerminal__Group_1__1__Impl"
    // InternalSequenceCS.g:1146:1: rule__SequenceTerminal__Group_1__1__Impl : ( ( rule__SequenceTerminal__Alternatives_1_1 ) ) ;
    public final void rule__SequenceTerminal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1150:1: ( ( ( rule__SequenceTerminal__Alternatives_1_1 ) ) )
            // InternalSequenceCS.g:1151:1: ( ( rule__SequenceTerminal__Alternatives_1_1 ) )
            {
            // InternalSequenceCS.g:1151:1: ( ( rule__SequenceTerminal__Alternatives_1_1 ) )
            // InternalSequenceCS.g:1152:2: ( rule__SequenceTerminal__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getAlternatives_1_1()); 
            }
            // InternalSequenceCS.g:1153:2: ( rule__SequenceTerminal__Alternatives_1_1 )
            // InternalSequenceCS.g:1153:3: rule__SequenceTerminal__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_1__1__Impl"


    // $ANTLR start "rule__SequenceTerminal__Group_2__0"
    // InternalSequenceCS.g:1162:1: rule__SequenceTerminal__Group_2__0 : rule__SequenceTerminal__Group_2__0__Impl rule__SequenceTerminal__Group_2__1 ;
    public final void rule__SequenceTerminal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1166:1: ( rule__SequenceTerminal__Group_2__0__Impl rule__SequenceTerminal__Group_2__1 )
            // InternalSequenceCS.g:1167:2: rule__SequenceTerminal__Group_2__0__Impl rule__SequenceTerminal__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__SequenceTerminal__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_2__0"


    // $ANTLR start "rule__SequenceTerminal__Group_2__0__Impl"
    // InternalSequenceCS.g:1174:1: rule__SequenceTerminal__Group_2__0__Impl : ( () ) ;
    public final void rule__SequenceTerminal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1178:1: ( ( () ) )
            // InternalSequenceCS.g:1179:1: ( () )
            {
            // InternalSequenceCS.g:1179:1: ( () )
            // InternalSequenceCS.g:1180:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getOCLExpressionAction_2_0()); 
            }
            // InternalSequenceCS.g:1181:2: ()
            // InternalSequenceCS.g:1181:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getOCLExpressionAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_2__0__Impl"


    // $ANTLR start "rule__SequenceTerminal__Group_2__1"
    // InternalSequenceCS.g:1189:1: rule__SequenceTerminal__Group_2__1 : rule__SequenceTerminal__Group_2__1__Impl rule__SequenceTerminal__Group_2__2 ;
    public final void rule__SequenceTerminal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1193:1: ( rule__SequenceTerminal__Group_2__1__Impl rule__SequenceTerminal__Group_2__2 )
            // InternalSequenceCS.g:1194:2: rule__SequenceTerminal__Group_2__1__Impl rule__SequenceTerminal__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__SequenceTerminal__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_2__1"


    // $ANTLR start "rule__SequenceTerminal__Group_2__1__Impl"
    // InternalSequenceCS.g:1201:1: rule__SequenceTerminal__Group_2__1__Impl : ( 'ocl' ) ;
    public final void rule__SequenceTerminal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1205:1: ( ( 'ocl' ) )
            // InternalSequenceCS.g:1206:1: ( 'ocl' )
            {
            // InternalSequenceCS.g:1206:1: ( 'ocl' )
            // InternalSequenceCS.g:1207:2: 'ocl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getOclKeyword_2_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getOclKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_2__1__Impl"


    // $ANTLR start "rule__SequenceTerminal__Group_2__2"
    // InternalSequenceCS.g:1216:1: rule__SequenceTerminal__Group_2__2 : rule__SequenceTerminal__Group_2__2__Impl ;
    public final void rule__SequenceTerminal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1220:1: ( rule__SequenceTerminal__Group_2__2__Impl )
            // InternalSequenceCS.g:1221:2: rule__SequenceTerminal__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_2__2"


    // $ANTLR start "rule__SequenceTerminal__Group_2__2__Impl"
    // InternalSequenceCS.g:1227:1: rule__SequenceTerminal__Group_2__2__Impl : ( ( rule__SequenceTerminal__ExpressionAssignment_2_2 ) ) ;
    public final void rule__SequenceTerminal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1231:1: ( ( ( rule__SequenceTerminal__ExpressionAssignment_2_2 ) ) )
            // InternalSequenceCS.g:1232:1: ( ( rule__SequenceTerminal__ExpressionAssignment_2_2 ) )
            {
            // InternalSequenceCS.g:1232:1: ( ( rule__SequenceTerminal__ExpressionAssignment_2_2 ) )
            // InternalSequenceCS.g:1233:2: ( rule__SequenceTerminal__ExpressionAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getExpressionAssignment_2_2()); 
            }
            // InternalSequenceCS.g:1234:2: ( rule__SequenceTerminal__ExpressionAssignment_2_2 )
            // InternalSequenceCS.g:1234:3: rule__SequenceTerminal__ExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceTerminal__ExpressionAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getExpressionAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__Group_2__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_0__0"
    // InternalSequenceCS.g:1243:1: rule__RepeatedSERE__Group_0__0 : rule__RepeatedSERE__Group_0__0__Impl rule__RepeatedSERE__Group_0__1 ;
    public final void rule__RepeatedSERE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1247:1: ( rule__RepeatedSERE__Group_0__0__Impl rule__RepeatedSERE__Group_0__1 )
            // InternalSequenceCS.g:1248:2: rule__RepeatedSERE__Group_0__0__Impl rule__RepeatedSERE__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__RepeatedSERE__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__0"


    // $ANTLR start "rule__RepeatedSERE__Group_0__0__Impl"
    // InternalSequenceCS.g:1255:1: rule__RepeatedSERE__Group_0__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1259:1: ( ( () ) )
            // InternalSequenceCS.g:1260:1: ( () )
            {
            // InternalSequenceCS.g:1260:1: ( () )
            // InternalSequenceCS.g:1261:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getBooleanCountedConsecutiveRepetitionAction_0_0()); 
            }
            // InternalSequenceCS.g:1262:2: ()
            // InternalSequenceCS.g:1262:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getBooleanCountedConsecutiveRepetitionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_0__1"
    // InternalSequenceCS.g:1270:1: rule__RepeatedSERE__Group_0__1 : rule__RepeatedSERE__Group_0__1__Impl rule__RepeatedSERE__Group_0__2 ;
    public final void rule__RepeatedSERE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1274:1: ( rule__RepeatedSERE__Group_0__1__Impl rule__RepeatedSERE__Group_0__2 )
            // InternalSequenceCS.g:1275:2: rule__RepeatedSERE__Group_0__1__Impl rule__RepeatedSERE__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__RepeatedSERE__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__1"


    // $ANTLR start "rule__RepeatedSERE__Group_0__1__Impl"
    // InternalSequenceCS.g:1282:1: rule__RepeatedSERE__Group_0__1__Impl : ( ( rule__RepeatedSERE__ExpressionAssignment_0_1 ) ) ;
    public final void rule__RepeatedSERE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1286:1: ( ( ( rule__RepeatedSERE__ExpressionAssignment_0_1 ) ) )
            // InternalSequenceCS.g:1287:1: ( ( rule__RepeatedSERE__ExpressionAssignment_0_1 ) )
            {
            // InternalSequenceCS.g:1287:1: ( ( rule__RepeatedSERE__ExpressionAssignment_0_1 ) )
            // InternalSequenceCS.g:1288:2: ( rule__RepeatedSERE__ExpressionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_0_1()); 
            }
            // InternalSequenceCS.g:1289:2: ( rule__RepeatedSERE__ExpressionAssignment_0_1 )
            // InternalSequenceCS.g:1289:3: rule__RepeatedSERE__ExpressionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__ExpressionAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_0__2"
    // InternalSequenceCS.g:1297:1: rule__RepeatedSERE__Group_0__2 : rule__RepeatedSERE__Group_0__2__Impl rule__RepeatedSERE__Group_0__3 ;
    public final void rule__RepeatedSERE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1301:1: ( rule__RepeatedSERE__Group_0__2__Impl rule__RepeatedSERE__Group_0__3 )
            // InternalSequenceCS.g:1302:2: rule__RepeatedSERE__Group_0__2__Impl rule__RepeatedSERE__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__2"


    // $ANTLR start "rule__RepeatedSERE__Group_0__2__Impl"
    // InternalSequenceCS.g:1309:1: rule__RepeatedSERE__Group_0__2__Impl : ( ( rule__RepeatedSERE__Group_0_2__0 ) ) ;
    public final void rule__RepeatedSERE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1313:1: ( ( ( rule__RepeatedSERE__Group_0_2__0 ) ) )
            // InternalSequenceCS.g:1314:1: ( ( rule__RepeatedSERE__Group_0_2__0 ) )
            {
            // InternalSequenceCS.g:1314:1: ( ( rule__RepeatedSERE__Group_0_2__0 ) )
            // InternalSequenceCS.g:1315:2: ( rule__RepeatedSERE__Group_0_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getGroup_0_2()); 
            }
            // InternalSequenceCS.g:1316:2: ( rule__RepeatedSERE__Group_0_2__0 )
            // InternalSequenceCS.g:1316:3: rule__RepeatedSERE__Group_0_2__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_0_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getGroup_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_0__3"
    // InternalSequenceCS.g:1324:1: rule__RepeatedSERE__Group_0__3 : rule__RepeatedSERE__Group_0__3__Impl rule__RepeatedSERE__Group_0__4 ;
    public final void rule__RepeatedSERE__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1328:1: ( rule__RepeatedSERE__Group_0__3__Impl rule__RepeatedSERE__Group_0__4 )
            // InternalSequenceCS.g:1329:2: rule__RepeatedSERE__Group_0__3__Impl rule__RepeatedSERE__Group_0__4
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__3"


    // $ANTLR start "rule__RepeatedSERE__Group_0__3__Impl"
    // InternalSequenceCS.g:1336:1: rule__RepeatedSERE__Group_0__3__Impl : ( ( rule__RepeatedSERE__CountAssignment_0_3 )? ) ;
    public final void rule__RepeatedSERE__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1340:1: ( ( ( rule__RepeatedSERE__CountAssignment_0_3 )? ) )
            // InternalSequenceCS.g:1341:1: ( ( rule__RepeatedSERE__CountAssignment_0_3 )? )
            {
            // InternalSequenceCS.g:1341:1: ( ( rule__RepeatedSERE__CountAssignment_0_3 )? )
            // InternalSequenceCS.g:1342:2: ( rule__RepeatedSERE__CountAssignment_0_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountAssignment_0_3()); 
            }
            // InternalSequenceCS.g:1343:2: ( rule__RepeatedSERE__CountAssignment_0_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSequenceCS.g:1343:3: rule__RepeatedSERE__CountAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__CountAssignment_0_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__3__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_0__4"
    // InternalSequenceCS.g:1351:1: rule__RepeatedSERE__Group_0__4 : rule__RepeatedSERE__Group_0__4__Impl ;
    public final void rule__RepeatedSERE__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1355:1: ( rule__RepeatedSERE__Group_0__4__Impl )
            // InternalSequenceCS.g:1356:2: rule__RepeatedSERE__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__4"


    // $ANTLR start "rule__RepeatedSERE__Group_0__4__Impl"
    // InternalSequenceCS.g:1362:1: rule__RepeatedSERE__Group_0__4__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1366:1: ( ( ']' ) )
            // InternalSequenceCS.g:1367:1: ( ']' )
            {
            // InternalSequenceCS.g:1367:1: ( ']' )
            // InternalSequenceCS.g:1368:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_0_4()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0__4__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_0_2__0"
    // InternalSequenceCS.g:1378:1: rule__RepeatedSERE__Group_0_2__0 : rule__RepeatedSERE__Group_0_2__0__Impl rule__RepeatedSERE__Group_0_2__1 ;
    public final void rule__RepeatedSERE__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1382:1: ( rule__RepeatedSERE__Group_0_2__0__Impl rule__RepeatedSERE__Group_0_2__1 )
            // InternalSequenceCS.g:1383:2: rule__RepeatedSERE__Group_0_2__0__Impl rule__RepeatedSERE__Group_0_2__1
            {
            pushFollow(FOLLOW_11);
            rule__RepeatedSERE__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0_2__0"


    // $ANTLR start "rule__RepeatedSERE__Group_0_2__0__Impl"
    // InternalSequenceCS.g:1390:1: rule__RepeatedSERE__Group_0_2__0__Impl : ( ( '[' ) ) ;
    public final void rule__RepeatedSERE__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1394:1: ( ( ( '[' ) ) )
            // InternalSequenceCS.g:1395:1: ( ( '[' ) )
            {
            // InternalSequenceCS.g:1395:1: ( ( '[' ) )
            // InternalSequenceCS.g:1396:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_0_2_0()); 
            }
            // InternalSequenceCS.g:1397:2: ( '[' )
            // InternalSequenceCS.g:1397:3: '['
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0_2__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_0_2__1"
    // InternalSequenceCS.g:1405:1: rule__RepeatedSERE__Group_0_2__1 : rule__RepeatedSERE__Group_0_2__1__Impl ;
    public final void rule__RepeatedSERE__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1409:1: ( rule__RepeatedSERE__Group_0_2__1__Impl )
            // InternalSequenceCS.g:1410:2: rule__RepeatedSERE__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0_2__1"


    // $ANTLR start "rule__RepeatedSERE__Group_0_2__1__Impl"
    // InternalSequenceCS.g:1416:1: rule__RepeatedSERE__Group_0_2__1__Impl : ( '*' ) ;
    public final void rule__RepeatedSERE__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1420:1: ( ( '*' ) )
            // InternalSequenceCS.g:1421:1: ( '*' )
            {
            // InternalSequenceCS.g:1421:1: ( '*' )
            // InternalSequenceCS.g:1422:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_0_2_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_0_2__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_1__0"
    // InternalSequenceCS.g:1432:1: rule__RepeatedSERE__Group_1__0 : rule__RepeatedSERE__Group_1__0__Impl rule__RepeatedSERE__Group_1__1 ;
    public final void rule__RepeatedSERE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1436:1: ( rule__RepeatedSERE__Group_1__0__Impl rule__RepeatedSERE__Group_1__1 )
            // InternalSequenceCS.g:1437:2: rule__RepeatedSERE__Group_1__0__Impl rule__RepeatedSERE__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__RepeatedSERE__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__0"


    // $ANTLR start "rule__RepeatedSERE__Group_1__0__Impl"
    // InternalSequenceCS.g:1444:1: rule__RepeatedSERE__Group_1__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1448:1: ( ( () ) )
            // InternalSequenceCS.g:1449:1: ( () )
            {
            // InternalSequenceCS.g:1449:1: ( () )
            // InternalSequenceCS.g:1450:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getSequenceCountedConsecutiveRepetitionAction_1_0()); 
            }
            // InternalSequenceCS.g:1451:2: ()
            // InternalSequenceCS.g:1451:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getSequenceCountedConsecutiveRepetitionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_1__1"
    // InternalSequenceCS.g:1459:1: rule__RepeatedSERE__Group_1__1 : rule__RepeatedSERE__Group_1__1__Impl rule__RepeatedSERE__Group_1__2 ;
    public final void rule__RepeatedSERE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1463:1: ( rule__RepeatedSERE__Group_1__1__Impl rule__RepeatedSERE__Group_1__2 )
            // InternalSequenceCS.g:1464:2: rule__RepeatedSERE__Group_1__1__Impl rule__RepeatedSERE__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__RepeatedSERE__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__1"


    // $ANTLR start "rule__RepeatedSERE__Group_1__1__Impl"
    // InternalSequenceCS.g:1471:1: rule__RepeatedSERE__Group_1__1__Impl : ( ( rule__RepeatedSERE__ExpressionAssignment_1_1 ) ) ;
    public final void rule__RepeatedSERE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1475:1: ( ( ( rule__RepeatedSERE__ExpressionAssignment_1_1 ) ) )
            // InternalSequenceCS.g:1476:1: ( ( rule__RepeatedSERE__ExpressionAssignment_1_1 ) )
            {
            // InternalSequenceCS.g:1476:1: ( ( rule__RepeatedSERE__ExpressionAssignment_1_1 ) )
            // InternalSequenceCS.g:1477:2: ( rule__RepeatedSERE__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_1_1()); 
            }
            // InternalSequenceCS.g:1478:2: ( rule__RepeatedSERE__ExpressionAssignment_1_1 )
            // InternalSequenceCS.g:1478:3: rule__RepeatedSERE__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__ExpressionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_1__2"
    // InternalSequenceCS.g:1486:1: rule__RepeatedSERE__Group_1__2 : rule__RepeatedSERE__Group_1__2__Impl rule__RepeatedSERE__Group_1__3 ;
    public final void rule__RepeatedSERE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1490:1: ( rule__RepeatedSERE__Group_1__2__Impl rule__RepeatedSERE__Group_1__3 )
            // InternalSequenceCS.g:1491:2: rule__RepeatedSERE__Group_1__2__Impl rule__RepeatedSERE__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__2"


    // $ANTLR start "rule__RepeatedSERE__Group_1__2__Impl"
    // InternalSequenceCS.g:1498:1: rule__RepeatedSERE__Group_1__2__Impl : ( ( rule__RepeatedSERE__Group_1_2__0 ) ) ;
    public final void rule__RepeatedSERE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1502:1: ( ( ( rule__RepeatedSERE__Group_1_2__0 ) ) )
            // InternalSequenceCS.g:1503:1: ( ( rule__RepeatedSERE__Group_1_2__0 ) )
            {
            // InternalSequenceCS.g:1503:1: ( ( rule__RepeatedSERE__Group_1_2__0 ) )
            // InternalSequenceCS.g:1504:2: ( rule__RepeatedSERE__Group_1_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getGroup_1_2()); 
            }
            // InternalSequenceCS.g:1505:2: ( rule__RepeatedSERE__Group_1_2__0 )
            // InternalSequenceCS.g:1505:3: rule__RepeatedSERE__Group_1_2__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_1_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_1__3"
    // InternalSequenceCS.g:1513:1: rule__RepeatedSERE__Group_1__3 : rule__RepeatedSERE__Group_1__3__Impl rule__RepeatedSERE__Group_1__4 ;
    public final void rule__RepeatedSERE__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1517:1: ( rule__RepeatedSERE__Group_1__3__Impl rule__RepeatedSERE__Group_1__4 )
            // InternalSequenceCS.g:1518:2: rule__RepeatedSERE__Group_1__3__Impl rule__RepeatedSERE__Group_1__4
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__3"


    // $ANTLR start "rule__RepeatedSERE__Group_1__3__Impl"
    // InternalSequenceCS.g:1525:1: rule__RepeatedSERE__Group_1__3__Impl : ( ( rule__RepeatedSERE__CountAssignment_1_3 )? ) ;
    public final void rule__RepeatedSERE__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1529:1: ( ( ( rule__RepeatedSERE__CountAssignment_1_3 )? ) )
            // InternalSequenceCS.g:1530:1: ( ( rule__RepeatedSERE__CountAssignment_1_3 )? )
            {
            // InternalSequenceCS.g:1530:1: ( ( rule__RepeatedSERE__CountAssignment_1_3 )? )
            // InternalSequenceCS.g:1531:2: ( rule__RepeatedSERE__CountAssignment_1_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountAssignment_1_3()); 
            }
            // InternalSequenceCS.g:1532:2: ( rule__RepeatedSERE__CountAssignment_1_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSequenceCS.g:1532:3: rule__RepeatedSERE__CountAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__CountAssignment_1_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__3__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_1__4"
    // InternalSequenceCS.g:1540:1: rule__RepeatedSERE__Group_1__4 : rule__RepeatedSERE__Group_1__4__Impl ;
    public final void rule__RepeatedSERE__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1544:1: ( rule__RepeatedSERE__Group_1__4__Impl )
            // InternalSequenceCS.g:1545:2: rule__RepeatedSERE__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__4"


    // $ANTLR start "rule__RepeatedSERE__Group_1__4__Impl"
    // InternalSequenceCS.g:1551:1: rule__RepeatedSERE__Group_1__4__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1555:1: ( ( ']' ) )
            // InternalSequenceCS.g:1556:1: ( ']' )
            {
            // InternalSequenceCS.g:1556:1: ( ']' )
            // InternalSequenceCS.g:1557:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_1_4()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1__4__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_1_2__0"
    // InternalSequenceCS.g:1567:1: rule__RepeatedSERE__Group_1_2__0 : rule__RepeatedSERE__Group_1_2__0__Impl rule__RepeatedSERE__Group_1_2__1 ;
    public final void rule__RepeatedSERE__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1571:1: ( rule__RepeatedSERE__Group_1_2__0__Impl rule__RepeatedSERE__Group_1_2__1 )
            // InternalSequenceCS.g:1572:2: rule__RepeatedSERE__Group_1_2__0__Impl rule__RepeatedSERE__Group_1_2__1
            {
            pushFollow(FOLLOW_11);
            rule__RepeatedSERE__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1_2__0"


    // $ANTLR start "rule__RepeatedSERE__Group_1_2__0__Impl"
    // InternalSequenceCS.g:1579:1: rule__RepeatedSERE__Group_1_2__0__Impl : ( ( '[' ) ) ;
    public final void rule__RepeatedSERE__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1583:1: ( ( ( '[' ) ) )
            // InternalSequenceCS.g:1584:1: ( ( '[' ) )
            {
            // InternalSequenceCS.g:1584:1: ( ( '[' ) )
            // InternalSequenceCS.g:1585:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_1_2_0()); 
            }
            // InternalSequenceCS.g:1586:2: ( '[' )
            // InternalSequenceCS.g:1586:3: '['
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1_2__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_1_2__1"
    // InternalSequenceCS.g:1594:1: rule__RepeatedSERE__Group_1_2__1 : rule__RepeatedSERE__Group_1_2__1__Impl ;
    public final void rule__RepeatedSERE__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1598:1: ( rule__RepeatedSERE__Group_1_2__1__Impl )
            // InternalSequenceCS.g:1599:2: rule__RepeatedSERE__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1_2__1"


    // $ANTLR start "rule__RepeatedSERE__Group_1_2__1__Impl"
    // InternalSequenceCS.g:1605:1: rule__RepeatedSERE__Group_1_2__1__Impl : ( '*' ) ;
    public final void rule__RepeatedSERE__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1609:1: ( ( '*' ) )
            // InternalSequenceCS.g:1610:1: ( '*' )
            {
            // InternalSequenceCS.g:1610:1: ( '*' )
            // InternalSequenceCS.g:1611:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_1_2_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_1_2__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_2__0"
    // InternalSequenceCS.g:1621:1: rule__RepeatedSERE__Group_2__0 : rule__RepeatedSERE__Group_2__0__Impl rule__RepeatedSERE__Group_2__1 ;
    public final void rule__RepeatedSERE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1625:1: ( rule__RepeatedSERE__Group_2__0__Impl rule__RepeatedSERE__Group_2__1 )
            // InternalSequenceCS.g:1626:2: rule__RepeatedSERE__Group_2__0__Impl rule__RepeatedSERE__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__RepeatedSERE__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__0"


    // $ANTLR start "rule__RepeatedSERE__Group_2__0__Impl"
    // InternalSequenceCS.g:1633:1: rule__RepeatedSERE__Group_2__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1637:1: ( ( () ) )
            // InternalSequenceCS.g:1638:1: ( () )
            {
            // InternalSequenceCS.g:1638:1: ( () )
            // InternalSequenceCS.g:1639:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getSequenceCountedConsecutiveRepetitionAction_2_0()); 
            }
            // InternalSequenceCS.g:1640:2: ()
            // InternalSequenceCS.g:1640:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getSequenceCountedConsecutiveRepetitionAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_2__1"
    // InternalSequenceCS.g:1648:1: rule__RepeatedSERE__Group_2__1 : rule__RepeatedSERE__Group_2__1__Impl rule__RepeatedSERE__Group_2__2 ;
    public final void rule__RepeatedSERE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1652:1: ( rule__RepeatedSERE__Group_2__1__Impl rule__RepeatedSERE__Group_2__2 )
            // InternalSequenceCS.g:1653:2: rule__RepeatedSERE__Group_2__1__Impl rule__RepeatedSERE__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__RepeatedSERE__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__1"


    // $ANTLR start "rule__RepeatedSERE__Group_2__1__Impl"
    // InternalSequenceCS.g:1660:1: rule__RepeatedSERE__Group_2__1__Impl : ( '(' ) ;
    public final void rule__RepeatedSERE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1664:1: ( ( '(' ) )
            // InternalSequenceCS.g:1665:1: ( '(' )
            {
            // InternalSequenceCS.g:1665:1: ( '(' )
            // InternalSequenceCS.g:1666:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftParenthesisKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_2__2"
    // InternalSequenceCS.g:1675:1: rule__RepeatedSERE__Group_2__2 : rule__RepeatedSERE__Group_2__2__Impl rule__RepeatedSERE__Group_2__3 ;
    public final void rule__RepeatedSERE__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1679:1: ( rule__RepeatedSERE__Group_2__2__Impl rule__RepeatedSERE__Group_2__3 )
            // InternalSequenceCS.g:1680:2: rule__RepeatedSERE__Group_2__2__Impl rule__RepeatedSERE__Group_2__3
            {
            pushFollow(FOLLOW_14);
            rule__RepeatedSERE__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__2"


    // $ANTLR start "rule__RepeatedSERE__Group_2__2__Impl"
    // InternalSequenceCS.g:1687:1: rule__RepeatedSERE__Group_2__2__Impl : ( ( rule__RepeatedSERE__ExpressionAssignment_2_2 ) ) ;
    public final void rule__RepeatedSERE__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1691:1: ( ( ( rule__RepeatedSERE__ExpressionAssignment_2_2 ) ) )
            // InternalSequenceCS.g:1692:1: ( ( rule__RepeatedSERE__ExpressionAssignment_2_2 ) )
            {
            // InternalSequenceCS.g:1692:1: ( ( rule__RepeatedSERE__ExpressionAssignment_2_2 ) )
            // InternalSequenceCS.g:1693:2: ( rule__RepeatedSERE__ExpressionAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_2_2()); 
            }
            // InternalSequenceCS.g:1694:2: ( rule__RepeatedSERE__ExpressionAssignment_2_2 )
            // InternalSequenceCS.g:1694:3: rule__RepeatedSERE__ExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__ExpressionAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_2__3"
    // InternalSequenceCS.g:1702:1: rule__RepeatedSERE__Group_2__3 : rule__RepeatedSERE__Group_2__3__Impl rule__RepeatedSERE__Group_2__4 ;
    public final void rule__RepeatedSERE__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1706:1: ( rule__RepeatedSERE__Group_2__3__Impl rule__RepeatedSERE__Group_2__4 )
            // InternalSequenceCS.g:1707:2: rule__RepeatedSERE__Group_2__3__Impl rule__RepeatedSERE__Group_2__4
            {
            pushFollow(FOLLOW_9);
            rule__RepeatedSERE__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__3"


    // $ANTLR start "rule__RepeatedSERE__Group_2__3__Impl"
    // InternalSequenceCS.g:1714:1: rule__RepeatedSERE__Group_2__3__Impl : ( ')' ) ;
    public final void rule__RepeatedSERE__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1718:1: ( ( ')' ) )
            // InternalSequenceCS.g:1719:1: ( ')' )
            {
            // InternalSequenceCS.g:1719:1: ( ')' )
            // InternalSequenceCS.g:1720:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__3__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_2__4"
    // InternalSequenceCS.g:1729:1: rule__RepeatedSERE__Group_2__4 : rule__RepeatedSERE__Group_2__4__Impl rule__RepeatedSERE__Group_2__5 ;
    public final void rule__RepeatedSERE__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1733:1: ( rule__RepeatedSERE__Group_2__4__Impl rule__RepeatedSERE__Group_2__5 )
            // InternalSequenceCS.g:1734:2: rule__RepeatedSERE__Group_2__4__Impl rule__RepeatedSERE__Group_2__5
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__4"


    // $ANTLR start "rule__RepeatedSERE__Group_2__4__Impl"
    // InternalSequenceCS.g:1741:1: rule__RepeatedSERE__Group_2__4__Impl : ( ( rule__RepeatedSERE__Group_2_4__0 ) ) ;
    public final void rule__RepeatedSERE__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1745:1: ( ( ( rule__RepeatedSERE__Group_2_4__0 ) ) )
            // InternalSequenceCS.g:1746:1: ( ( rule__RepeatedSERE__Group_2_4__0 ) )
            {
            // InternalSequenceCS.g:1746:1: ( ( rule__RepeatedSERE__Group_2_4__0 ) )
            // InternalSequenceCS.g:1747:2: ( rule__RepeatedSERE__Group_2_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getGroup_2_4()); 
            }
            // InternalSequenceCS.g:1748:2: ( rule__RepeatedSERE__Group_2_4__0 )
            // InternalSequenceCS.g:1748:3: rule__RepeatedSERE__Group_2_4__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getGroup_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__4__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_2__5"
    // InternalSequenceCS.g:1756:1: rule__RepeatedSERE__Group_2__5 : rule__RepeatedSERE__Group_2__5__Impl rule__RepeatedSERE__Group_2__6 ;
    public final void rule__RepeatedSERE__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1760:1: ( rule__RepeatedSERE__Group_2__5__Impl rule__RepeatedSERE__Group_2__6 )
            // InternalSequenceCS.g:1761:2: rule__RepeatedSERE__Group_2__5__Impl rule__RepeatedSERE__Group_2__6
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__5"


    // $ANTLR start "rule__RepeatedSERE__Group_2__5__Impl"
    // InternalSequenceCS.g:1768:1: rule__RepeatedSERE__Group_2__5__Impl : ( ( rule__RepeatedSERE__CountAssignment_2_5 )? ) ;
    public final void rule__RepeatedSERE__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1772:1: ( ( ( rule__RepeatedSERE__CountAssignment_2_5 )? ) )
            // InternalSequenceCS.g:1773:1: ( ( rule__RepeatedSERE__CountAssignment_2_5 )? )
            {
            // InternalSequenceCS.g:1773:1: ( ( rule__RepeatedSERE__CountAssignment_2_5 )? )
            // InternalSequenceCS.g:1774:2: ( rule__RepeatedSERE__CountAssignment_2_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountAssignment_2_5()); 
            }
            // InternalSequenceCS.g:1775:2: ( rule__RepeatedSERE__CountAssignment_2_5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSequenceCS.g:1775:3: rule__RepeatedSERE__CountAssignment_2_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__CountAssignment_2_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountAssignment_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__5__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_2__6"
    // InternalSequenceCS.g:1783:1: rule__RepeatedSERE__Group_2__6 : rule__RepeatedSERE__Group_2__6__Impl ;
    public final void rule__RepeatedSERE__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1787:1: ( rule__RepeatedSERE__Group_2__6__Impl )
            // InternalSequenceCS.g:1788:2: rule__RepeatedSERE__Group_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__6"


    // $ANTLR start "rule__RepeatedSERE__Group_2__6__Impl"
    // InternalSequenceCS.g:1794:1: rule__RepeatedSERE__Group_2__6__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1798:1: ( ( ']' ) )
            // InternalSequenceCS.g:1799:1: ( ']' )
            {
            // InternalSequenceCS.g:1799:1: ( ']' )
            // InternalSequenceCS.g:1800:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_2_6()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_2_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2__6__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_2_4__0"
    // InternalSequenceCS.g:1810:1: rule__RepeatedSERE__Group_2_4__0 : rule__RepeatedSERE__Group_2_4__0__Impl rule__RepeatedSERE__Group_2_4__1 ;
    public final void rule__RepeatedSERE__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1814:1: ( rule__RepeatedSERE__Group_2_4__0__Impl rule__RepeatedSERE__Group_2_4__1 )
            // InternalSequenceCS.g:1815:2: rule__RepeatedSERE__Group_2_4__0__Impl rule__RepeatedSERE__Group_2_4__1
            {
            pushFollow(FOLLOW_11);
            rule__RepeatedSERE__Group_2_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2_4__0"


    // $ANTLR start "rule__RepeatedSERE__Group_2_4__0__Impl"
    // InternalSequenceCS.g:1822:1: rule__RepeatedSERE__Group_2_4__0__Impl : ( ( '[' ) ) ;
    public final void rule__RepeatedSERE__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1826:1: ( ( ( '[' ) ) )
            // InternalSequenceCS.g:1827:1: ( ( '[' ) )
            {
            // InternalSequenceCS.g:1827:1: ( ( '[' ) )
            // InternalSequenceCS.g:1828:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_2_4_0()); 
            }
            // InternalSequenceCS.g:1829:2: ( '[' )
            // InternalSequenceCS.g:1829:3: '['
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2_4__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_2_4__1"
    // InternalSequenceCS.g:1837:1: rule__RepeatedSERE__Group_2_4__1 : rule__RepeatedSERE__Group_2_4__1__Impl ;
    public final void rule__RepeatedSERE__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1841:1: ( rule__RepeatedSERE__Group_2_4__1__Impl )
            // InternalSequenceCS.g:1842:2: rule__RepeatedSERE__Group_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_2_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2_4__1"


    // $ANTLR start "rule__RepeatedSERE__Group_2_4__1__Impl"
    // InternalSequenceCS.g:1848:1: rule__RepeatedSERE__Group_2_4__1__Impl : ( '*' ) ;
    public final void rule__RepeatedSERE__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1852:1: ( ( '*' ) )
            // InternalSequenceCS.g:1853:1: ( '*' )
            {
            // InternalSequenceCS.g:1853:1: ( '*' )
            // InternalSequenceCS.g:1854:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_2_4_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_2_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_2_4__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_3__0"
    // InternalSequenceCS.g:1864:1: rule__RepeatedSERE__Group_3__0 : rule__RepeatedSERE__Group_3__0__Impl rule__RepeatedSERE__Group_3__1 ;
    public final void rule__RepeatedSERE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1868:1: ( rule__RepeatedSERE__Group_3__0__Impl rule__RepeatedSERE__Group_3__1 )
            // InternalSequenceCS.g:1869:2: rule__RepeatedSERE__Group_3__0__Impl rule__RepeatedSERE__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__RepeatedSERE__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3__0"


    // $ANTLR start "rule__RepeatedSERE__Group_3__0__Impl"
    // InternalSequenceCS.g:1876:1: rule__RepeatedSERE__Group_3__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1880:1: ( ( () ) )
            // InternalSequenceCS.g:1881:1: ( () )
            {
            // InternalSequenceCS.g:1881:1: ( () )
            // InternalSequenceCS.g:1882:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getBooleanConsecutiveRepetitionAction_3_0()); 
            }
            // InternalSequenceCS.g:1883:2: ()
            // InternalSequenceCS.g:1883:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getBooleanConsecutiveRepetitionAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_3__1"
    // InternalSequenceCS.g:1891:1: rule__RepeatedSERE__Group_3__1 : rule__RepeatedSERE__Group_3__1__Impl rule__RepeatedSERE__Group_3__2 ;
    public final void rule__RepeatedSERE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1895:1: ( rule__RepeatedSERE__Group_3__1__Impl rule__RepeatedSERE__Group_3__2 )
            // InternalSequenceCS.g:1896:2: rule__RepeatedSERE__Group_3__1__Impl rule__RepeatedSERE__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__RepeatedSERE__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3__1"


    // $ANTLR start "rule__RepeatedSERE__Group_3__1__Impl"
    // InternalSequenceCS.g:1903:1: rule__RepeatedSERE__Group_3__1__Impl : ( ( rule__RepeatedSERE__ExpressionAssignment_3_1 ) ) ;
    public final void rule__RepeatedSERE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1907:1: ( ( ( rule__RepeatedSERE__ExpressionAssignment_3_1 ) ) )
            // InternalSequenceCS.g:1908:1: ( ( rule__RepeatedSERE__ExpressionAssignment_3_1 ) )
            {
            // InternalSequenceCS.g:1908:1: ( ( rule__RepeatedSERE__ExpressionAssignment_3_1 ) )
            // InternalSequenceCS.g:1909:2: ( rule__RepeatedSERE__ExpressionAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_3_1()); 
            }
            // InternalSequenceCS.g:1910:2: ( rule__RepeatedSERE__ExpressionAssignment_3_1 )
            // InternalSequenceCS.g:1910:3: rule__RepeatedSERE__ExpressionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__ExpressionAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_3__2"
    // InternalSequenceCS.g:1918:1: rule__RepeatedSERE__Group_3__2 : rule__RepeatedSERE__Group_3__2__Impl rule__RepeatedSERE__Group_3__3 ;
    public final void rule__RepeatedSERE__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1922:1: ( rule__RepeatedSERE__Group_3__2__Impl rule__RepeatedSERE__Group_3__3 )
            // InternalSequenceCS.g:1923:2: rule__RepeatedSERE__Group_3__2__Impl rule__RepeatedSERE__Group_3__3
            {
            pushFollow(FOLLOW_15);
            rule__RepeatedSERE__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3__2"


    // $ANTLR start "rule__RepeatedSERE__Group_3__2__Impl"
    // InternalSequenceCS.g:1930:1: rule__RepeatedSERE__Group_3__2__Impl : ( ( rule__RepeatedSERE__Group_3_2__0 ) ) ;
    public final void rule__RepeatedSERE__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1934:1: ( ( ( rule__RepeatedSERE__Group_3_2__0 ) ) )
            // InternalSequenceCS.g:1935:1: ( ( rule__RepeatedSERE__Group_3_2__0 ) )
            {
            // InternalSequenceCS.g:1935:1: ( ( rule__RepeatedSERE__Group_3_2__0 ) )
            // InternalSequenceCS.g:1936:2: ( rule__RepeatedSERE__Group_3_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getGroup_3_2()); 
            }
            // InternalSequenceCS.g:1937:2: ( rule__RepeatedSERE__Group_3_2__0 )
            // InternalSequenceCS.g:1937:3: rule__RepeatedSERE__Group_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_3_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_3__3"
    // InternalSequenceCS.g:1945:1: rule__RepeatedSERE__Group_3__3 : rule__RepeatedSERE__Group_3__3__Impl ;
    public final void rule__RepeatedSERE__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1949:1: ( rule__RepeatedSERE__Group_3__3__Impl )
            // InternalSequenceCS.g:1950:2: rule__RepeatedSERE__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3__3"


    // $ANTLR start "rule__RepeatedSERE__Group_3__3__Impl"
    // InternalSequenceCS.g:1956:1: rule__RepeatedSERE__Group_3__3__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1960:1: ( ( ']' ) )
            // InternalSequenceCS.g:1961:1: ( ']' )
            {
            // InternalSequenceCS.g:1961:1: ( ']' )
            // InternalSequenceCS.g:1962:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_3_3()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3__3__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_3_2__0"
    // InternalSequenceCS.g:1972:1: rule__RepeatedSERE__Group_3_2__0 : rule__RepeatedSERE__Group_3_2__0__Impl rule__RepeatedSERE__Group_3_2__1 ;
    public final void rule__RepeatedSERE__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1976:1: ( rule__RepeatedSERE__Group_3_2__0__Impl rule__RepeatedSERE__Group_3_2__1 )
            // InternalSequenceCS.g:1977:2: rule__RepeatedSERE__Group_3_2__0__Impl rule__RepeatedSERE__Group_3_2__1
            {
            pushFollow(FOLLOW_16);
            rule__RepeatedSERE__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3_2__0"


    // $ANTLR start "rule__RepeatedSERE__Group_3_2__0__Impl"
    // InternalSequenceCS.g:1984:1: rule__RepeatedSERE__Group_3_2__0__Impl : ( ( '[' ) ) ;
    public final void rule__RepeatedSERE__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:1988:1: ( ( ( '[' ) ) )
            // InternalSequenceCS.g:1989:1: ( ( '[' ) )
            {
            // InternalSequenceCS.g:1989:1: ( ( '[' ) )
            // InternalSequenceCS.g:1990:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_3_2_0()); 
            }
            // InternalSequenceCS.g:1991:2: ( '[' )
            // InternalSequenceCS.g:1991:3: '['
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3_2__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_3_2__1"
    // InternalSequenceCS.g:1999:1: rule__RepeatedSERE__Group_3_2__1 : rule__RepeatedSERE__Group_3_2__1__Impl ;
    public final void rule__RepeatedSERE__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2003:1: ( rule__RepeatedSERE__Group_3_2__1__Impl )
            // InternalSequenceCS.g:2004:2: rule__RepeatedSERE__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3_2__1"


    // $ANTLR start "rule__RepeatedSERE__Group_3_2__1__Impl"
    // InternalSequenceCS.g:2010:1: rule__RepeatedSERE__Group_3_2__1__Impl : ( '+' ) ;
    public final void rule__RepeatedSERE__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2014:1: ( ( '+' ) )
            // InternalSequenceCS.g:2015:1: ( '+' )
            {
            // InternalSequenceCS.g:2015:1: ( '+' )
            // InternalSequenceCS.g:2016:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_3_2_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_3_2__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_4__0"
    // InternalSequenceCS.g:2026:1: rule__RepeatedSERE__Group_4__0 : rule__RepeatedSERE__Group_4__0__Impl rule__RepeatedSERE__Group_4__1 ;
    public final void rule__RepeatedSERE__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2030:1: ( rule__RepeatedSERE__Group_4__0__Impl rule__RepeatedSERE__Group_4__1 )
            // InternalSequenceCS.g:2031:2: rule__RepeatedSERE__Group_4__0__Impl rule__RepeatedSERE__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__RepeatedSERE__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4__0"


    // $ANTLR start "rule__RepeatedSERE__Group_4__0__Impl"
    // InternalSequenceCS.g:2038:1: rule__RepeatedSERE__Group_4__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2042:1: ( ( () ) )
            // InternalSequenceCS.g:2043:1: ( () )
            {
            // InternalSequenceCS.g:2043:1: ( () )
            // InternalSequenceCS.g:2044:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getSequenceConsecutiveRepetitionAction_4_0()); 
            }
            // InternalSequenceCS.g:2045:2: ()
            // InternalSequenceCS.g:2045:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getSequenceConsecutiveRepetitionAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_4__1"
    // InternalSequenceCS.g:2053:1: rule__RepeatedSERE__Group_4__1 : rule__RepeatedSERE__Group_4__1__Impl rule__RepeatedSERE__Group_4__2 ;
    public final void rule__RepeatedSERE__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2057:1: ( rule__RepeatedSERE__Group_4__1__Impl rule__RepeatedSERE__Group_4__2 )
            // InternalSequenceCS.g:2058:2: rule__RepeatedSERE__Group_4__1__Impl rule__RepeatedSERE__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__RepeatedSERE__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4__1"


    // $ANTLR start "rule__RepeatedSERE__Group_4__1__Impl"
    // InternalSequenceCS.g:2065:1: rule__RepeatedSERE__Group_4__1__Impl : ( ( rule__RepeatedSERE__ExpressionAssignment_4_1 ) ) ;
    public final void rule__RepeatedSERE__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2069:1: ( ( ( rule__RepeatedSERE__ExpressionAssignment_4_1 ) ) )
            // InternalSequenceCS.g:2070:1: ( ( rule__RepeatedSERE__ExpressionAssignment_4_1 ) )
            {
            // InternalSequenceCS.g:2070:1: ( ( rule__RepeatedSERE__ExpressionAssignment_4_1 ) )
            // InternalSequenceCS.g:2071:2: ( rule__RepeatedSERE__ExpressionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_4_1()); 
            }
            // InternalSequenceCS.g:2072:2: ( rule__RepeatedSERE__ExpressionAssignment_4_1 )
            // InternalSequenceCS.g:2072:3: rule__RepeatedSERE__ExpressionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__ExpressionAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_4__2"
    // InternalSequenceCS.g:2080:1: rule__RepeatedSERE__Group_4__2 : rule__RepeatedSERE__Group_4__2__Impl rule__RepeatedSERE__Group_4__3 ;
    public final void rule__RepeatedSERE__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2084:1: ( rule__RepeatedSERE__Group_4__2__Impl rule__RepeatedSERE__Group_4__3 )
            // InternalSequenceCS.g:2085:2: rule__RepeatedSERE__Group_4__2__Impl rule__RepeatedSERE__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__RepeatedSERE__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4__2"


    // $ANTLR start "rule__RepeatedSERE__Group_4__2__Impl"
    // InternalSequenceCS.g:2092:1: rule__RepeatedSERE__Group_4__2__Impl : ( ( rule__RepeatedSERE__Group_4_2__0 ) ) ;
    public final void rule__RepeatedSERE__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2096:1: ( ( ( rule__RepeatedSERE__Group_4_2__0 ) ) )
            // InternalSequenceCS.g:2097:1: ( ( rule__RepeatedSERE__Group_4_2__0 ) )
            {
            // InternalSequenceCS.g:2097:1: ( ( rule__RepeatedSERE__Group_4_2__0 ) )
            // InternalSequenceCS.g:2098:2: ( rule__RepeatedSERE__Group_4_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getGroup_4_2()); 
            }
            // InternalSequenceCS.g:2099:2: ( rule__RepeatedSERE__Group_4_2__0 )
            // InternalSequenceCS.g:2099:3: rule__RepeatedSERE__Group_4_2__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_4_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_4__3"
    // InternalSequenceCS.g:2107:1: rule__RepeatedSERE__Group_4__3 : rule__RepeatedSERE__Group_4__3__Impl ;
    public final void rule__RepeatedSERE__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2111:1: ( rule__RepeatedSERE__Group_4__3__Impl )
            // InternalSequenceCS.g:2112:2: rule__RepeatedSERE__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4__3"


    // $ANTLR start "rule__RepeatedSERE__Group_4__3__Impl"
    // InternalSequenceCS.g:2118:1: rule__RepeatedSERE__Group_4__3__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2122:1: ( ( ']' ) )
            // InternalSequenceCS.g:2123:1: ( ']' )
            {
            // InternalSequenceCS.g:2123:1: ( ']' )
            // InternalSequenceCS.g:2124:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_4_3()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4__3__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_4_2__0"
    // InternalSequenceCS.g:2134:1: rule__RepeatedSERE__Group_4_2__0 : rule__RepeatedSERE__Group_4_2__0__Impl rule__RepeatedSERE__Group_4_2__1 ;
    public final void rule__RepeatedSERE__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2138:1: ( rule__RepeatedSERE__Group_4_2__0__Impl rule__RepeatedSERE__Group_4_2__1 )
            // InternalSequenceCS.g:2139:2: rule__RepeatedSERE__Group_4_2__0__Impl rule__RepeatedSERE__Group_4_2__1
            {
            pushFollow(FOLLOW_16);
            rule__RepeatedSERE__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4_2__0"


    // $ANTLR start "rule__RepeatedSERE__Group_4_2__0__Impl"
    // InternalSequenceCS.g:2146:1: rule__RepeatedSERE__Group_4_2__0__Impl : ( ( '[' ) ) ;
    public final void rule__RepeatedSERE__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2150:1: ( ( ( '[' ) ) )
            // InternalSequenceCS.g:2151:1: ( ( '[' ) )
            {
            // InternalSequenceCS.g:2151:1: ( ( '[' ) )
            // InternalSequenceCS.g:2152:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_4_2_0()); 
            }
            // InternalSequenceCS.g:2153:2: ( '[' )
            // InternalSequenceCS.g:2153:3: '['
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4_2__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_4_2__1"
    // InternalSequenceCS.g:2161:1: rule__RepeatedSERE__Group_4_2__1 : rule__RepeatedSERE__Group_4_2__1__Impl ;
    public final void rule__RepeatedSERE__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2165:1: ( rule__RepeatedSERE__Group_4_2__1__Impl )
            // InternalSequenceCS.g:2166:2: rule__RepeatedSERE__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4_2__1"


    // $ANTLR start "rule__RepeatedSERE__Group_4_2__1__Impl"
    // InternalSequenceCS.g:2172:1: rule__RepeatedSERE__Group_4_2__1__Impl : ( '+' ) ;
    public final void rule__RepeatedSERE__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2176:1: ( ( '+' ) )
            // InternalSequenceCS.g:2177:1: ( '+' )
            {
            // InternalSequenceCS.g:2177:1: ( '+' )
            // InternalSequenceCS.g:2178:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_4_2_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_4_2__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_5__0"
    // InternalSequenceCS.g:2188:1: rule__RepeatedSERE__Group_5__0 : rule__RepeatedSERE__Group_5__0__Impl rule__RepeatedSERE__Group_5__1 ;
    public final void rule__RepeatedSERE__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2192:1: ( rule__RepeatedSERE__Group_5__0__Impl rule__RepeatedSERE__Group_5__1 )
            // InternalSequenceCS.g:2193:2: rule__RepeatedSERE__Group_5__0__Impl rule__RepeatedSERE__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__RepeatedSERE__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__0"


    // $ANTLR start "rule__RepeatedSERE__Group_5__0__Impl"
    // InternalSequenceCS.g:2200:1: rule__RepeatedSERE__Group_5__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2204:1: ( ( () ) )
            // InternalSequenceCS.g:2205:1: ( () )
            {
            // InternalSequenceCS.g:2205:1: ( () )
            // InternalSequenceCS.g:2206:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getSequenceConsecutiveRepetitionAction_5_0()); 
            }
            // InternalSequenceCS.g:2207:2: ()
            // InternalSequenceCS.g:2207:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getSequenceConsecutiveRepetitionAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_5__1"
    // InternalSequenceCS.g:2215:1: rule__RepeatedSERE__Group_5__1 : rule__RepeatedSERE__Group_5__1__Impl rule__RepeatedSERE__Group_5__2 ;
    public final void rule__RepeatedSERE__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2219:1: ( rule__RepeatedSERE__Group_5__1__Impl rule__RepeatedSERE__Group_5__2 )
            // InternalSequenceCS.g:2220:2: rule__RepeatedSERE__Group_5__1__Impl rule__RepeatedSERE__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__RepeatedSERE__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__1"


    // $ANTLR start "rule__RepeatedSERE__Group_5__1__Impl"
    // InternalSequenceCS.g:2227:1: rule__RepeatedSERE__Group_5__1__Impl : ( '(' ) ;
    public final void rule__RepeatedSERE__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2231:1: ( ( '(' ) )
            // InternalSequenceCS.g:2232:1: ( '(' )
            {
            // InternalSequenceCS.g:2232:1: ( '(' )
            // InternalSequenceCS.g:2233:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftParenthesisKeyword_5_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftParenthesisKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_5__2"
    // InternalSequenceCS.g:2242:1: rule__RepeatedSERE__Group_5__2 : rule__RepeatedSERE__Group_5__2__Impl rule__RepeatedSERE__Group_5__3 ;
    public final void rule__RepeatedSERE__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2246:1: ( rule__RepeatedSERE__Group_5__2__Impl rule__RepeatedSERE__Group_5__3 )
            // InternalSequenceCS.g:2247:2: rule__RepeatedSERE__Group_5__2__Impl rule__RepeatedSERE__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__RepeatedSERE__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__2"


    // $ANTLR start "rule__RepeatedSERE__Group_5__2__Impl"
    // InternalSequenceCS.g:2254:1: rule__RepeatedSERE__Group_5__2__Impl : ( ( rule__RepeatedSERE__ExpressionAssignment_5_2 ) ) ;
    public final void rule__RepeatedSERE__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2258:1: ( ( ( rule__RepeatedSERE__ExpressionAssignment_5_2 ) ) )
            // InternalSequenceCS.g:2259:1: ( ( rule__RepeatedSERE__ExpressionAssignment_5_2 ) )
            {
            // InternalSequenceCS.g:2259:1: ( ( rule__RepeatedSERE__ExpressionAssignment_5_2 ) )
            // InternalSequenceCS.g:2260:2: ( rule__RepeatedSERE__ExpressionAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_5_2()); 
            }
            // InternalSequenceCS.g:2261:2: ( rule__RepeatedSERE__ExpressionAssignment_5_2 )
            // InternalSequenceCS.g:2261:3: rule__RepeatedSERE__ExpressionAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__ExpressionAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_5__3"
    // InternalSequenceCS.g:2269:1: rule__RepeatedSERE__Group_5__3 : rule__RepeatedSERE__Group_5__3__Impl rule__RepeatedSERE__Group_5__4 ;
    public final void rule__RepeatedSERE__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2273:1: ( rule__RepeatedSERE__Group_5__3__Impl rule__RepeatedSERE__Group_5__4 )
            // InternalSequenceCS.g:2274:2: rule__RepeatedSERE__Group_5__3__Impl rule__RepeatedSERE__Group_5__4
            {
            pushFollow(FOLLOW_9);
            rule__RepeatedSERE__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_5__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__3"


    // $ANTLR start "rule__RepeatedSERE__Group_5__3__Impl"
    // InternalSequenceCS.g:2281:1: rule__RepeatedSERE__Group_5__3__Impl : ( ')' ) ;
    public final void rule__RepeatedSERE__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2285:1: ( ( ')' ) )
            // InternalSequenceCS.g:2286:1: ( ')' )
            {
            // InternalSequenceCS.g:2286:1: ( ')' )
            // InternalSequenceCS.g:2287:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightParenthesisKeyword_5_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightParenthesisKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__3__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_5__4"
    // InternalSequenceCS.g:2296:1: rule__RepeatedSERE__Group_5__4 : rule__RepeatedSERE__Group_5__4__Impl rule__RepeatedSERE__Group_5__5 ;
    public final void rule__RepeatedSERE__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2300:1: ( rule__RepeatedSERE__Group_5__4__Impl rule__RepeatedSERE__Group_5__5 )
            // InternalSequenceCS.g:2301:2: rule__RepeatedSERE__Group_5__4__Impl rule__RepeatedSERE__Group_5__5
            {
            pushFollow(FOLLOW_15);
            rule__RepeatedSERE__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_5__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__4"


    // $ANTLR start "rule__RepeatedSERE__Group_5__4__Impl"
    // InternalSequenceCS.g:2308:1: rule__RepeatedSERE__Group_5__4__Impl : ( ( rule__RepeatedSERE__Group_5_4__0 ) ) ;
    public final void rule__RepeatedSERE__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2312:1: ( ( ( rule__RepeatedSERE__Group_5_4__0 ) ) )
            // InternalSequenceCS.g:2313:1: ( ( rule__RepeatedSERE__Group_5_4__0 ) )
            {
            // InternalSequenceCS.g:2313:1: ( ( rule__RepeatedSERE__Group_5_4__0 ) )
            // InternalSequenceCS.g:2314:2: ( rule__RepeatedSERE__Group_5_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getGroup_5_4()); 
            }
            // InternalSequenceCS.g:2315:2: ( rule__RepeatedSERE__Group_5_4__0 )
            // InternalSequenceCS.g:2315:3: rule__RepeatedSERE__Group_5_4__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_5_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getGroup_5_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__4__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_5__5"
    // InternalSequenceCS.g:2323:1: rule__RepeatedSERE__Group_5__5 : rule__RepeatedSERE__Group_5__5__Impl ;
    public final void rule__RepeatedSERE__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2327:1: ( rule__RepeatedSERE__Group_5__5__Impl )
            // InternalSequenceCS.g:2328:2: rule__RepeatedSERE__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_5__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__5"


    // $ANTLR start "rule__RepeatedSERE__Group_5__5__Impl"
    // InternalSequenceCS.g:2334:1: rule__RepeatedSERE__Group_5__5__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2338:1: ( ( ']' ) )
            // InternalSequenceCS.g:2339:1: ( ']' )
            {
            // InternalSequenceCS.g:2339:1: ( ']' )
            // InternalSequenceCS.g:2340:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_5_5()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_5_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5__5__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_5_4__0"
    // InternalSequenceCS.g:2350:1: rule__RepeatedSERE__Group_5_4__0 : rule__RepeatedSERE__Group_5_4__0__Impl rule__RepeatedSERE__Group_5_4__1 ;
    public final void rule__RepeatedSERE__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2354:1: ( rule__RepeatedSERE__Group_5_4__0__Impl rule__RepeatedSERE__Group_5_4__1 )
            // InternalSequenceCS.g:2355:2: rule__RepeatedSERE__Group_5_4__0__Impl rule__RepeatedSERE__Group_5_4__1
            {
            pushFollow(FOLLOW_16);
            rule__RepeatedSERE__Group_5_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_5_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5_4__0"


    // $ANTLR start "rule__RepeatedSERE__Group_5_4__0__Impl"
    // InternalSequenceCS.g:2362:1: rule__RepeatedSERE__Group_5_4__0__Impl : ( ( '[' ) ) ;
    public final void rule__RepeatedSERE__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2366:1: ( ( ( '[' ) ) )
            // InternalSequenceCS.g:2367:1: ( ( '[' ) )
            {
            // InternalSequenceCS.g:2367:1: ( ( '[' ) )
            // InternalSequenceCS.g:2368:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_5_4_0()); 
            }
            // InternalSequenceCS.g:2369:2: ( '[' )
            // InternalSequenceCS.g:2369:3: '['
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_5_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5_4__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_5_4__1"
    // InternalSequenceCS.g:2377:1: rule__RepeatedSERE__Group_5_4__1 : rule__RepeatedSERE__Group_5_4__1__Impl ;
    public final void rule__RepeatedSERE__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2381:1: ( rule__RepeatedSERE__Group_5_4__1__Impl )
            // InternalSequenceCS.g:2382:2: rule__RepeatedSERE__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_5_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5_4__1"


    // $ANTLR start "rule__RepeatedSERE__Group_5_4__1__Impl"
    // InternalSequenceCS.g:2388:1: rule__RepeatedSERE__Group_5_4__1__Impl : ( '+' ) ;
    public final void rule__RepeatedSERE__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2392:1: ( ( '+' ) )
            // InternalSequenceCS.g:2393:1: ( '+' )
            {
            // InternalSequenceCS.g:2393:1: ( '+' )
            // InternalSequenceCS.g:2394:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_5_4_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_5_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_5_4__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_6__0"
    // InternalSequenceCS.g:2404:1: rule__RepeatedSERE__Group_6__0 : rule__RepeatedSERE__Group_6__0__Impl rule__RepeatedSERE__Group_6__1 ;
    public final void rule__RepeatedSERE__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2408:1: ( rule__RepeatedSERE__Group_6__0__Impl rule__RepeatedSERE__Group_6__1 )
            // InternalSequenceCS.g:2409:2: rule__RepeatedSERE__Group_6__0__Impl rule__RepeatedSERE__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__RepeatedSERE__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__0"


    // $ANTLR start "rule__RepeatedSERE__Group_6__0__Impl"
    // InternalSequenceCS.g:2416:1: rule__RepeatedSERE__Group_6__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2420:1: ( ( () ) )
            // InternalSequenceCS.g:2421:1: ( () )
            {
            // InternalSequenceCS.g:2421:1: ( () )
            // InternalSequenceCS.g:2422:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getBooleanCountedNonConsecutiveRepetitionAction_6_0()); 
            }
            // InternalSequenceCS.g:2423:2: ()
            // InternalSequenceCS.g:2423:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getBooleanCountedNonConsecutiveRepetitionAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_6__1"
    // InternalSequenceCS.g:2431:1: rule__RepeatedSERE__Group_6__1 : rule__RepeatedSERE__Group_6__1__Impl rule__RepeatedSERE__Group_6__2 ;
    public final void rule__RepeatedSERE__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2435:1: ( rule__RepeatedSERE__Group_6__1__Impl rule__RepeatedSERE__Group_6__2 )
            // InternalSequenceCS.g:2436:2: rule__RepeatedSERE__Group_6__1__Impl rule__RepeatedSERE__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__RepeatedSERE__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__1"


    // $ANTLR start "rule__RepeatedSERE__Group_6__1__Impl"
    // InternalSequenceCS.g:2443:1: rule__RepeatedSERE__Group_6__1__Impl : ( ( rule__RepeatedSERE__ExpressionAssignment_6_1 ) ) ;
    public final void rule__RepeatedSERE__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2447:1: ( ( ( rule__RepeatedSERE__ExpressionAssignment_6_1 ) ) )
            // InternalSequenceCS.g:2448:1: ( ( rule__RepeatedSERE__ExpressionAssignment_6_1 ) )
            {
            // InternalSequenceCS.g:2448:1: ( ( rule__RepeatedSERE__ExpressionAssignment_6_1 ) )
            // InternalSequenceCS.g:2449:2: ( rule__RepeatedSERE__ExpressionAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_6_1()); 
            }
            // InternalSequenceCS.g:2450:2: ( rule__RepeatedSERE__ExpressionAssignment_6_1 )
            // InternalSequenceCS.g:2450:3: rule__RepeatedSERE__ExpressionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__ExpressionAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_6__2"
    // InternalSequenceCS.g:2458:1: rule__RepeatedSERE__Group_6__2 : rule__RepeatedSERE__Group_6__2__Impl rule__RepeatedSERE__Group_6__3 ;
    public final void rule__RepeatedSERE__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2462:1: ( rule__RepeatedSERE__Group_6__2__Impl rule__RepeatedSERE__Group_6__3 )
            // InternalSequenceCS.g:2463:2: rule__RepeatedSERE__Group_6__2__Impl rule__RepeatedSERE__Group_6__3
            {
            pushFollow(FOLLOW_17);
            rule__RepeatedSERE__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__2"


    // $ANTLR start "rule__RepeatedSERE__Group_6__2__Impl"
    // InternalSequenceCS.g:2470:1: rule__RepeatedSERE__Group_6__2__Impl : ( ( rule__RepeatedSERE__Group_6_2__0 ) ) ;
    public final void rule__RepeatedSERE__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2474:1: ( ( ( rule__RepeatedSERE__Group_6_2__0 ) ) )
            // InternalSequenceCS.g:2475:1: ( ( rule__RepeatedSERE__Group_6_2__0 ) )
            {
            // InternalSequenceCS.g:2475:1: ( ( rule__RepeatedSERE__Group_6_2__0 ) )
            // InternalSequenceCS.g:2476:2: ( rule__RepeatedSERE__Group_6_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getGroup_6_2()); 
            }
            // InternalSequenceCS.g:2477:2: ( rule__RepeatedSERE__Group_6_2__0 )
            // InternalSequenceCS.g:2477:3: rule__RepeatedSERE__Group_6_2__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_6_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getGroup_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_6__3"
    // InternalSequenceCS.g:2485:1: rule__RepeatedSERE__Group_6__3 : rule__RepeatedSERE__Group_6__3__Impl rule__RepeatedSERE__Group_6__4 ;
    public final void rule__RepeatedSERE__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2489:1: ( rule__RepeatedSERE__Group_6__3__Impl rule__RepeatedSERE__Group_6__4 )
            // InternalSequenceCS.g:2490:2: rule__RepeatedSERE__Group_6__3__Impl rule__RepeatedSERE__Group_6__4
            {
            pushFollow(FOLLOW_15);
            rule__RepeatedSERE__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__3"


    // $ANTLR start "rule__RepeatedSERE__Group_6__3__Impl"
    // InternalSequenceCS.g:2497:1: rule__RepeatedSERE__Group_6__3__Impl : ( ( rule__RepeatedSERE__CountAssignment_6_3 ) ) ;
    public final void rule__RepeatedSERE__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2501:1: ( ( ( rule__RepeatedSERE__CountAssignment_6_3 ) ) )
            // InternalSequenceCS.g:2502:1: ( ( rule__RepeatedSERE__CountAssignment_6_3 ) )
            {
            // InternalSequenceCS.g:2502:1: ( ( rule__RepeatedSERE__CountAssignment_6_3 ) )
            // InternalSequenceCS.g:2503:2: ( rule__RepeatedSERE__CountAssignment_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountAssignment_6_3()); 
            }
            // InternalSequenceCS.g:2504:2: ( rule__RepeatedSERE__CountAssignment_6_3 )
            // InternalSequenceCS.g:2504:3: rule__RepeatedSERE__CountAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__CountAssignment_6_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountAssignment_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__3__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_6__4"
    // InternalSequenceCS.g:2512:1: rule__RepeatedSERE__Group_6__4 : rule__RepeatedSERE__Group_6__4__Impl ;
    public final void rule__RepeatedSERE__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2516:1: ( rule__RepeatedSERE__Group_6__4__Impl )
            // InternalSequenceCS.g:2517:2: rule__RepeatedSERE__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__4"


    // $ANTLR start "rule__RepeatedSERE__Group_6__4__Impl"
    // InternalSequenceCS.g:2523:1: rule__RepeatedSERE__Group_6__4__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2527:1: ( ( ']' ) )
            // InternalSequenceCS.g:2528:1: ( ']' )
            {
            // InternalSequenceCS.g:2528:1: ( ']' )
            // InternalSequenceCS.g:2529:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_6_4()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_6_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6__4__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_6_2__0"
    // InternalSequenceCS.g:2539:1: rule__RepeatedSERE__Group_6_2__0 : rule__RepeatedSERE__Group_6_2__0__Impl rule__RepeatedSERE__Group_6_2__1 ;
    public final void rule__RepeatedSERE__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2543:1: ( rule__RepeatedSERE__Group_6_2__0__Impl rule__RepeatedSERE__Group_6_2__1 )
            // InternalSequenceCS.g:2544:2: rule__RepeatedSERE__Group_6_2__0__Impl rule__RepeatedSERE__Group_6_2__1
            {
            pushFollow(FOLLOW_18);
            rule__RepeatedSERE__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_6_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6_2__0"


    // $ANTLR start "rule__RepeatedSERE__Group_6_2__0__Impl"
    // InternalSequenceCS.g:2551:1: rule__RepeatedSERE__Group_6_2__0__Impl : ( ( '[' ) ) ;
    public final void rule__RepeatedSERE__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2555:1: ( ( ( '[' ) ) )
            // InternalSequenceCS.g:2556:1: ( ( '[' ) )
            {
            // InternalSequenceCS.g:2556:1: ( ( '[' ) )
            // InternalSequenceCS.g:2557:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_6_2_0()); 
            }
            // InternalSequenceCS.g:2558:2: ( '[' )
            // InternalSequenceCS.g:2558:3: '['
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6_2__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_6_2__1"
    // InternalSequenceCS.g:2566:1: rule__RepeatedSERE__Group_6_2__1 : rule__RepeatedSERE__Group_6_2__1__Impl ;
    public final void rule__RepeatedSERE__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2570:1: ( rule__RepeatedSERE__Group_6_2__1__Impl )
            // InternalSequenceCS.g:2571:2: rule__RepeatedSERE__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6_2__1"


    // $ANTLR start "rule__RepeatedSERE__Group_6_2__1__Impl"
    // InternalSequenceCS.g:2577:1: rule__RepeatedSERE__Group_6_2__1__Impl : ( '=' ) ;
    public final void rule__RepeatedSERE__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2581:1: ( ( '=' ) )
            // InternalSequenceCS.g:2582:1: ( '=' )
            {
            // InternalSequenceCS.g:2582:1: ( '=' )
            // InternalSequenceCS.g:2583:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getEqualsSignKeyword_6_2_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getEqualsSignKeyword_6_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_6_2__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_7__0"
    // InternalSequenceCS.g:2593:1: rule__RepeatedSERE__Group_7__0 : rule__RepeatedSERE__Group_7__0__Impl rule__RepeatedSERE__Group_7__1 ;
    public final void rule__RepeatedSERE__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2597:1: ( rule__RepeatedSERE__Group_7__0__Impl rule__RepeatedSERE__Group_7__1 )
            // InternalSequenceCS.g:2598:2: rule__RepeatedSERE__Group_7__0__Impl rule__RepeatedSERE__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__RepeatedSERE__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__0"


    // $ANTLR start "rule__RepeatedSERE__Group_7__0__Impl"
    // InternalSequenceCS.g:2605:1: rule__RepeatedSERE__Group_7__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2609:1: ( ( () ) )
            // InternalSequenceCS.g:2610:1: ( () )
            {
            // InternalSequenceCS.g:2610:1: ( () )
            // InternalSequenceCS.g:2611:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getBooleanCountedGotoRepetitionAction_7_0()); 
            }
            // InternalSequenceCS.g:2612:2: ()
            // InternalSequenceCS.g:2612:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getBooleanCountedGotoRepetitionAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_7__1"
    // InternalSequenceCS.g:2620:1: rule__RepeatedSERE__Group_7__1 : rule__RepeatedSERE__Group_7__1__Impl rule__RepeatedSERE__Group_7__2 ;
    public final void rule__RepeatedSERE__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2624:1: ( rule__RepeatedSERE__Group_7__1__Impl rule__RepeatedSERE__Group_7__2 )
            // InternalSequenceCS.g:2625:2: rule__RepeatedSERE__Group_7__1__Impl rule__RepeatedSERE__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__RepeatedSERE__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__1"


    // $ANTLR start "rule__RepeatedSERE__Group_7__1__Impl"
    // InternalSequenceCS.g:2632:1: rule__RepeatedSERE__Group_7__1__Impl : ( ( rule__RepeatedSERE__ExpressionAssignment_7_1 ) ) ;
    public final void rule__RepeatedSERE__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2636:1: ( ( ( rule__RepeatedSERE__ExpressionAssignment_7_1 ) ) )
            // InternalSequenceCS.g:2637:1: ( ( rule__RepeatedSERE__ExpressionAssignment_7_1 ) )
            {
            // InternalSequenceCS.g:2637:1: ( ( rule__RepeatedSERE__ExpressionAssignment_7_1 ) )
            // InternalSequenceCS.g:2638:2: ( rule__RepeatedSERE__ExpressionAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_7_1()); 
            }
            // InternalSequenceCS.g:2639:2: ( rule__RepeatedSERE__ExpressionAssignment_7_1 )
            // InternalSequenceCS.g:2639:3: rule__RepeatedSERE__ExpressionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__ExpressionAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_7__2"
    // InternalSequenceCS.g:2647:1: rule__RepeatedSERE__Group_7__2 : rule__RepeatedSERE__Group_7__2__Impl rule__RepeatedSERE__Group_7__3 ;
    public final void rule__RepeatedSERE__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2651:1: ( rule__RepeatedSERE__Group_7__2__Impl rule__RepeatedSERE__Group_7__3 )
            // InternalSequenceCS.g:2652:2: rule__RepeatedSERE__Group_7__2__Impl rule__RepeatedSERE__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__2"


    // $ANTLR start "rule__RepeatedSERE__Group_7__2__Impl"
    // InternalSequenceCS.g:2659:1: rule__RepeatedSERE__Group_7__2__Impl : ( ( rule__RepeatedSERE__Group_7_2__0 ) ) ;
    public final void rule__RepeatedSERE__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2663:1: ( ( ( rule__RepeatedSERE__Group_7_2__0 ) ) )
            // InternalSequenceCS.g:2664:1: ( ( rule__RepeatedSERE__Group_7_2__0 ) )
            {
            // InternalSequenceCS.g:2664:1: ( ( rule__RepeatedSERE__Group_7_2__0 ) )
            // InternalSequenceCS.g:2665:2: ( rule__RepeatedSERE__Group_7_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getGroup_7_2()); 
            }
            // InternalSequenceCS.g:2666:2: ( rule__RepeatedSERE__Group_7_2__0 )
            // InternalSequenceCS.g:2666:3: rule__RepeatedSERE__Group_7_2__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_7_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getGroup_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_7__3"
    // InternalSequenceCS.g:2674:1: rule__RepeatedSERE__Group_7__3 : rule__RepeatedSERE__Group_7__3__Impl rule__RepeatedSERE__Group_7__4 ;
    public final void rule__RepeatedSERE__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2678:1: ( rule__RepeatedSERE__Group_7__3__Impl rule__RepeatedSERE__Group_7__4 )
            // InternalSequenceCS.g:2679:2: rule__RepeatedSERE__Group_7__3__Impl rule__RepeatedSERE__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_7__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__3"


    // $ANTLR start "rule__RepeatedSERE__Group_7__3__Impl"
    // InternalSequenceCS.g:2686:1: rule__RepeatedSERE__Group_7__3__Impl : ( ( rule__RepeatedSERE__CountAssignment_7_3 )? ) ;
    public final void rule__RepeatedSERE__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2690:1: ( ( ( rule__RepeatedSERE__CountAssignment_7_3 )? ) )
            // InternalSequenceCS.g:2691:1: ( ( rule__RepeatedSERE__CountAssignment_7_3 )? )
            {
            // InternalSequenceCS.g:2691:1: ( ( rule__RepeatedSERE__CountAssignment_7_3 )? )
            // InternalSequenceCS.g:2692:2: ( rule__RepeatedSERE__CountAssignment_7_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountAssignment_7_3()); 
            }
            // InternalSequenceCS.g:2693:2: ( rule__RepeatedSERE__CountAssignment_7_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSequenceCS.g:2693:3: rule__RepeatedSERE__CountAssignment_7_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__CountAssignment_7_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountAssignment_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__3__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_7__4"
    // InternalSequenceCS.g:2701:1: rule__RepeatedSERE__Group_7__4 : rule__RepeatedSERE__Group_7__4__Impl ;
    public final void rule__RepeatedSERE__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2705:1: ( rule__RepeatedSERE__Group_7__4__Impl )
            // InternalSequenceCS.g:2706:2: rule__RepeatedSERE__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__4"


    // $ANTLR start "rule__RepeatedSERE__Group_7__4__Impl"
    // InternalSequenceCS.g:2712:1: rule__RepeatedSERE__Group_7__4__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2716:1: ( ( ']' ) )
            // InternalSequenceCS.g:2717:1: ( ']' )
            {
            // InternalSequenceCS.g:2717:1: ( ']' )
            // InternalSequenceCS.g:2718:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_7_4()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_7_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7__4__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_7_2__0"
    // InternalSequenceCS.g:2728:1: rule__RepeatedSERE__Group_7_2__0 : rule__RepeatedSERE__Group_7_2__0__Impl rule__RepeatedSERE__Group_7_2__1 ;
    public final void rule__RepeatedSERE__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2732:1: ( rule__RepeatedSERE__Group_7_2__0__Impl rule__RepeatedSERE__Group_7_2__1 )
            // InternalSequenceCS.g:2733:2: rule__RepeatedSERE__Group_7_2__0__Impl rule__RepeatedSERE__Group_7_2__1
            {
            pushFollow(FOLLOW_19);
            rule__RepeatedSERE__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_7_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7_2__0"


    // $ANTLR start "rule__RepeatedSERE__Group_7_2__0__Impl"
    // InternalSequenceCS.g:2740:1: rule__RepeatedSERE__Group_7_2__0__Impl : ( ( '[' ) ) ;
    public final void rule__RepeatedSERE__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2744:1: ( ( ( '[' ) ) )
            // InternalSequenceCS.g:2745:1: ( ( '[' ) )
            {
            // InternalSequenceCS.g:2745:1: ( ( '[' ) )
            // InternalSequenceCS.g:2746:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_7_2_0()); 
            }
            // InternalSequenceCS.g:2747:2: ( '[' )
            // InternalSequenceCS.g:2747:3: '['
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7_2__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_7_2__1"
    // InternalSequenceCS.g:2755:1: rule__RepeatedSERE__Group_7_2__1 : rule__RepeatedSERE__Group_7_2__1__Impl ;
    public final void rule__RepeatedSERE__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2759:1: ( rule__RepeatedSERE__Group_7_2__1__Impl )
            // InternalSequenceCS.g:2760:2: rule__RepeatedSERE__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_7_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7_2__1"


    // $ANTLR start "rule__RepeatedSERE__Group_7_2__1__Impl"
    // InternalSequenceCS.g:2766:1: rule__RepeatedSERE__Group_7_2__1__Impl : ( '->' ) ;
    public final void rule__RepeatedSERE__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2770:1: ( ( '->' ) )
            // InternalSequenceCS.g:2771:1: ( '->' )
            {
            // InternalSequenceCS.g:2771:1: ( '->' )
            // InternalSequenceCS.g:2772:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getHyphenMinusGreaterThanSignKeyword_7_2_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getHyphenMinusGreaterThanSignKeyword_7_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_7_2__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_8__0"
    // InternalSequenceCS.g:2782:1: rule__RepeatedSERE__Group_8__0 : rule__RepeatedSERE__Group_8__0__Impl rule__RepeatedSERE__Group_8__1 ;
    public final void rule__RepeatedSERE__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2786:1: ( rule__RepeatedSERE__Group_8__0__Impl rule__RepeatedSERE__Group_8__1 )
            // InternalSequenceCS.g:2787:2: rule__RepeatedSERE__Group_8__0__Impl rule__RepeatedSERE__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__RepeatedSERE__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__0"


    // $ANTLR start "rule__RepeatedSERE__Group_8__0__Impl"
    // InternalSequenceCS.g:2794:1: rule__RepeatedSERE__Group_8__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2798:1: ( ( () ) )
            // InternalSequenceCS.g:2799:1: ( () )
            {
            // InternalSequenceCS.g:2799:1: ( () )
            // InternalSequenceCS.g:2800:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getWildCardAction_8_0()); 
            }
            // InternalSequenceCS.g:2801:2: ()
            // InternalSequenceCS.g:2801:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getWildCardAction_8_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_8__1"
    // InternalSequenceCS.g:2809:1: rule__RepeatedSERE__Group_8__1 : rule__RepeatedSERE__Group_8__1__Impl rule__RepeatedSERE__Group_8__2 ;
    public final void rule__RepeatedSERE__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2813:1: ( rule__RepeatedSERE__Group_8__1__Impl rule__RepeatedSERE__Group_8__2 )
            // InternalSequenceCS.g:2814:2: rule__RepeatedSERE__Group_8__1__Impl rule__RepeatedSERE__Group_8__2
            {
            pushFollow(FOLLOW_11);
            rule__RepeatedSERE__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__1"


    // $ANTLR start "rule__RepeatedSERE__Group_8__1__Impl"
    // InternalSequenceCS.g:2821:1: rule__RepeatedSERE__Group_8__1__Impl : ( '[' ) ;
    public final void rule__RepeatedSERE__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2825:1: ( ( '[' ) )
            // InternalSequenceCS.g:2826:1: ( '[' )
            {
            // InternalSequenceCS.g:2826:1: ( '[' )
            // InternalSequenceCS.g:2827:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_8_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_8__2"
    // InternalSequenceCS.g:2836:1: rule__RepeatedSERE__Group_8__2 : rule__RepeatedSERE__Group_8__2__Impl rule__RepeatedSERE__Group_8__3 ;
    public final void rule__RepeatedSERE__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2840:1: ( rule__RepeatedSERE__Group_8__2__Impl rule__RepeatedSERE__Group_8__3 )
            // InternalSequenceCS.g:2841:2: rule__RepeatedSERE__Group_8__2__Impl rule__RepeatedSERE__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__2"


    // $ANTLR start "rule__RepeatedSERE__Group_8__2__Impl"
    // InternalSequenceCS.g:2848:1: rule__RepeatedSERE__Group_8__2__Impl : ( '*' ) ;
    public final void rule__RepeatedSERE__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2852:1: ( ( '*' ) )
            // InternalSequenceCS.g:2853:1: ( '*' )
            {
            // InternalSequenceCS.g:2853:1: ( '*' )
            // InternalSequenceCS.g:2854:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_8_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_8__3"
    // InternalSequenceCS.g:2863:1: rule__RepeatedSERE__Group_8__3 : rule__RepeatedSERE__Group_8__3__Impl rule__RepeatedSERE__Group_8__4 ;
    public final void rule__RepeatedSERE__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2867:1: ( rule__RepeatedSERE__Group_8__3__Impl rule__RepeatedSERE__Group_8__4 )
            // InternalSequenceCS.g:2868:2: rule__RepeatedSERE__Group_8__3__Impl rule__RepeatedSERE__Group_8__4
            {
            pushFollow(FOLLOW_10);
            rule__RepeatedSERE__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_8__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__3"


    // $ANTLR start "rule__RepeatedSERE__Group_8__3__Impl"
    // InternalSequenceCS.g:2875:1: rule__RepeatedSERE__Group_8__3__Impl : ( ( rule__RepeatedSERE__CountAssignment_8_3 )? ) ;
    public final void rule__RepeatedSERE__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2879:1: ( ( ( rule__RepeatedSERE__CountAssignment_8_3 )? ) )
            // InternalSequenceCS.g:2880:1: ( ( rule__RepeatedSERE__CountAssignment_8_3 )? )
            {
            // InternalSequenceCS.g:2880:1: ( ( rule__RepeatedSERE__CountAssignment_8_3 )? )
            // InternalSequenceCS.g:2881:2: ( rule__RepeatedSERE__CountAssignment_8_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountAssignment_8_3()); 
            }
            // InternalSequenceCS.g:2882:2: ( rule__RepeatedSERE__CountAssignment_8_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSequenceCS.g:2882:3: rule__RepeatedSERE__CountAssignment_8_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepeatedSERE__CountAssignment_8_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountAssignment_8_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__3__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_8__4"
    // InternalSequenceCS.g:2890:1: rule__RepeatedSERE__Group_8__4 : rule__RepeatedSERE__Group_8__4__Impl ;
    public final void rule__RepeatedSERE__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2894:1: ( rule__RepeatedSERE__Group_8__4__Impl )
            // InternalSequenceCS.g:2895:2: rule__RepeatedSERE__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__4"


    // $ANTLR start "rule__RepeatedSERE__Group_8__4__Impl"
    // InternalSequenceCS.g:2901:1: rule__RepeatedSERE__Group_8__4__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2905:1: ( ( ']' ) )
            // InternalSequenceCS.g:2906:1: ( ']' )
            {
            // InternalSequenceCS.g:2906:1: ( ']' )
            // InternalSequenceCS.g:2907:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_8_4()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_8_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_8__4__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_9__0"
    // InternalSequenceCS.g:2917:1: rule__RepeatedSERE__Group_9__0 : rule__RepeatedSERE__Group_9__0__Impl rule__RepeatedSERE__Group_9__1 ;
    public final void rule__RepeatedSERE__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2921:1: ( rule__RepeatedSERE__Group_9__0__Impl rule__RepeatedSERE__Group_9__1 )
            // InternalSequenceCS.g:2922:2: rule__RepeatedSERE__Group_9__0__Impl rule__RepeatedSERE__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__RepeatedSERE__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_9__0"


    // $ANTLR start "rule__RepeatedSERE__Group_9__0__Impl"
    // InternalSequenceCS.g:2929:1: rule__RepeatedSERE__Group_9__0__Impl : ( () ) ;
    public final void rule__RepeatedSERE__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2933:1: ( ( () ) )
            // InternalSequenceCS.g:2934:1: ( () )
            {
            // InternalSequenceCS.g:2934:1: ( () )
            // InternalSequenceCS.g:2935:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLengthOneAction_9_0()); 
            }
            // InternalSequenceCS.g:2936:2: ()
            // InternalSequenceCS.g:2936:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLengthOneAction_9_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_9__0__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_9__1"
    // InternalSequenceCS.g:2944:1: rule__RepeatedSERE__Group_9__1 : rule__RepeatedSERE__Group_9__1__Impl rule__RepeatedSERE__Group_9__2 ;
    public final void rule__RepeatedSERE__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2948:1: ( rule__RepeatedSERE__Group_9__1__Impl rule__RepeatedSERE__Group_9__2 )
            // InternalSequenceCS.g:2949:2: rule__RepeatedSERE__Group_9__1__Impl rule__RepeatedSERE__Group_9__2
            {
            pushFollow(FOLLOW_16);
            rule__RepeatedSERE__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_9__1"


    // $ANTLR start "rule__RepeatedSERE__Group_9__1__Impl"
    // InternalSequenceCS.g:2956:1: rule__RepeatedSERE__Group_9__1__Impl : ( '[' ) ;
    public final void rule__RepeatedSERE__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2960:1: ( ( '[' ) )
            // InternalSequenceCS.g:2961:1: ( '[' )
            {
            // InternalSequenceCS.g:2961:1: ( '[' )
            // InternalSequenceCS.g:2962:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_9_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_9__1__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_9__2"
    // InternalSequenceCS.g:2971:1: rule__RepeatedSERE__Group_9__2 : rule__RepeatedSERE__Group_9__2__Impl rule__RepeatedSERE__Group_9__3 ;
    public final void rule__RepeatedSERE__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2975:1: ( rule__RepeatedSERE__Group_9__2__Impl rule__RepeatedSERE__Group_9__3 )
            // InternalSequenceCS.g:2976:2: rule__RepeatedSERE__Group_9__2__Impl rule__RepeatedSERE__Group_9__3
            {
            pushFollow(FOLLOW_15);
            rule__RepeatedSERE__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_9__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_9__2"


    // $ANTLR start "rule__RepeatedSERE__Group_9__2__Impl"
    // InternalSequenceCS.g:2983:1: rule__RepeatedSERE__Group_9__2__Impl : ( '+' ) ;
    public final void rule__RepeatedSERE__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:2987:1: ( ( '+' ) )
            // InternalSequenceCS.g:2988:1: ( '+' )
            {
            // InternalSequenceCS.g:2988:1: ( '+' )
            // InternalSequenceCS.g:2989:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_9_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_9__2__Impl"


    // $ANTLR start "rule__RepeatedSERE__Group_9__3"
    // InternalSequenceCS.g:2998:1: rule__RepeatedSERE__Group_9__3 : rule__RepeatedSERE__Group_9__3__Impl ;
    public final void rule__RepeatedSERE__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3002:1: ( rule__RepeatedSERE__Group_9__3__Impl )
            // InternalSequenceCS.g:3003:2: rule__RepeatedSERE__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatedSERE__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_9__3"


    // $ANTLR start "rule__RepeatedSERE__Group_9__3__Impl"
    // InternalSequenceCS.g:3009:1: rule__RepeatedSERE__Group_9__3__Impl : ( ']' ) ;
    public final void rule__RepeatedSERE__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3013:1: ( ( ']' ) )
            // InternalSequenceCS.g:3014:1: ( ']' )
            {
            // InternalSequenceCS.g:3014:1: ( ']' )
            // InternalSequenceCS.g:3015:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_9_3()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_9_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__Group_9__3__Impl"


    // $ANTLR start "rule__BracedSERE__Group__0"
    // InternalSequenceCS.g:3025:1: rule__BracedSERE__Group__0 : rule__BracedSERE__Group__0__Impl rule__BracedSERE__Group__1 ;
    public final void rule__BracedSERE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3029:1: ( rule__BracedSERE__Group__0__Impl rule__BracedSERE__Group__1 )
            // InternalSequenceCS.g:3030:2: rule__BracedSERE__Group__0__Impl rule__BracedSERE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BracedSERE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BracedSERE__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracedSERE__Group__0"


    // $ANTLR start "rule__BracedSERE__Group__0__Impl"
    // InternalSequenceCS.g:3037:1: rule__BracedSERE__Group__0__Impl : ( '{' ) ;
    public final void rule__BracedSERE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3041:1: ( ( '{' ) )
            // InternalSequenceCS.g:3042:1: ( '{' )
            {
            // InternalSequenceCS.g:3042:1: ( '{' )
            // InternalSequenceCS.g:3043:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracedSEREAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracedSEREAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracedSERE__Group__0__Impl"


    // $ANTLR start "rule__BracedSERE__Group__1"
    // InternalSequenceCS.g:3052:1: rule__BracedSERE__Group__1 : rule__BracedSERE__Group__1__Impl rule__BracedSERE__Group__2 ;
    public final void rule__BracedSERE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3056:1: ( rule__BracedSERE__Group__1__Impl rule__BracedSERE__Group__2 )
            // InternalSequenceCS.g:3057:2: rule__BracedSERE__Group__1__Impl rule__BracedSERE__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__BracedSERE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BracedSERE__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracedSERE__Group__1"


    // $ANTLR start "rule__BracedSERE__Group__1__Impl"
    // InternalSequenceCS.g:3064:1: rule__BracedSERE__Group__1__Impl : ( ( rule__BracedSERE__ExpressionAssignment_1 ) ) ;
    public final void rule__BracedSERE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3068:1: ( ( ( rule__BracedSERE__ExpressionAssignment_1 ) ) )
            // InternalSequenceCS.g:3069:1: ( ( rule__BracedSERE__ExpressionAssignment_1 ) )
            {
            // InternalSequenceCS.g:3069:1: ( ( rule__BracedSERE__ExpressionAssignment_1 ) )
            // InternalSequenceCS.g:3070:2: ( rule__BracedSERE__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracedSEREAccess().getExpressionAssignment_1()); 
            }
            // InternalSequenceCS.g:3071:2: ( rule__BracedSERE__ExpressionAssignment_1 )
            // InternalSequenceCS.g:3071:3: rule__BracedSERE__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BracedSERE__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracedSEREAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracedSERE__Group__1__Impl"


    // $ANTLR start "rule__BracedSERE__Group__2"
    // InternalSequenceCS.g:3079:1: rule__BracedSERE__Group__2 : rule__BracedSERE__Group__2__Impl ;
    public final void rule__BracedSERE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3083:1: ( rule__BracedSERE__Group__2__Impl )
            // InternalSequenceCS.g:3084:2: rule__BracedSERE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BracedSERE__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracedSERE__Group__2"


    // $ANTLR start "rule__BracedSERE__Group__2__Impl"
    // InternalSequenceCS.g:3090:1: rule__BracedSERE__Group__2__Impl : ( '}' ) ;
    public final void rule__BracedSERE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3094:1: ( ( '}' ) )
            // InternalSequenceCS.g:3095:1: ( '}' )
            {
            // InternalSequenceCS.g:3095:1: ( '}' )
            // InternalSequenceCS.g:3096:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracedSEREAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracedSEREAccess().getRightCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracedSERE__Group__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0__0"
    // InternalSequenceCS.g:3106:1: rule__BinaryCompoundSERE__Group_0__0 : rule__BinaryCompoundSERE__Group_0__0__Impl rule__BinaryCompoundSERE__Group_0__1 ;
    public final void rule__BinaryCompoundSERE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3110:1: ( rule__BinaryCompoundSERE__Group_0__0__Impl rule__BinaryCompoundSERE__Group_0__1 )
            // InternalSequenceCS.g:3111:2: rule__BinaryCompoundSERE__Group_0__0__Impl rule__BinaryCompoundSERE__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0__0__Impl"
    // InternalSequenceCS.g:3118:1: rule__BinaryCompoundSERE__Group_0__0__Impl : ( () ) ;
    public final void rule__BinaryCompoundSERE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3122:1: ( ( () ) )
            // InternalSequenceCS.g:3123:1: ( () )
            {
            // InternalSequenceCS.g:3123:1: ( () )
            // InternalSequenceCS.g:3124:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getSEREOrAction_0_0()); 
            }
            // InternalSequenceCS.g:3125:2: ()
            // InternalSequenceCS.g:3125:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getSEREOrAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0__1"
    // InternalSequenceCS.g:3133:1: rule__BinaryCompoundSERE__Group_0__1 : rule__BinaryCompoundSERE__Group_0__1__Impl rule__BinaryCompoundSERE__Group_0__2 ;
    public final void rule__BinaryCompoundSERE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3137:1: ( rule__BinaryCompoundSERE__Group_0__1__Impl rule__BinaryCompoundSERE__Group_0__2 )
            // InternalSequenceCS.g:3138:2: rule__BinaryCompoundSERE__Group_0__1__Impl rule__BinaryCompoundSERE__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__BinaryCompoundSERE__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0__1__Impl"
    // InternalSequenceCS.g:3145:1: rule__BinaryCompoundSERE__Group_0__1__Impl : ( ( rule__BinaryCompoundSERE__Alternatives_0_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3149:1: ( ( ( rule__BinaryCompoundSERE__Alternatives_0_1 ) ) )
            // InternalSequenceCS.g:3150:1: ( ( rule__BinaryCompoundSERE__Alternatives_0_1 ) )
            {
            // InternalSequenceCS.g:3150:1: ( ( rule__BinaryCompoundSERE__Alternatives_0_1 ) )
            // InternalSequenceCS.g:3151:2: ( rule__BinaryCompoundSERE__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_0_1()); 
            }
            // InternalSequenceCS.g:3152:2: ( rule__BinaryCompoundSERE__Alternatives_0_1 )
            // InternalSequenceCS.g:3152:3: rule__BinaryCompoundSERE__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Alternatives_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0__2"
    // InternalSequenceCS.g:3160:1: rule__BinaryCompoundSERE__Group_0__2 : rule__BinaryCompoundSERE__Group_0__2__Impl rule__BinaryCompoundSERE__Group_0__3 ;
    public final void rule__BinaryCompoundSERE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3164:1: ( rule__BinaryCompoundSERE__Group_0__2__Impl rule__BinaryCompoundSERE__Group_0__3 )
            // InternalSequenceCS.g:3165:2: rule__BinaryCompoundSERE__Group_0__2__Impl rule__BinaryCompoundSERE__Group_0__3
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0__2__Impl"
    // InternalSequenceCS.g:3172:1: rule__BinaryCompoundSERE__Group_0__2__Impl : ( ( '|' ) ) ;
    public final void rule__BinaryCompoundSERE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3176:1: ( ( ( '|' ) ) )
            // InternalSequenceCS.g:3177:1: ( ( '|' ) )
            {
            // InternalSequenceCS.g:3177:1: ( ( '|' ) )
            // InternalSequenceCS.g:3178:2: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getVerticalLineKeyword_0_2()); 
            }
            // InternalSequenceCS.g:3179:2: ( '|' )
            // InternalSequenceCS.g:3179:3: '|'
            {
            match(input,26,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getVerticalLineKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0__3"
    // InternalSequenceCS.g:3187:1: rule__BinaryCompoundSERE__Group_0__3 : rule__BinaryCompoundSERE__Group_0__3__Impl ;
    public final void rule__BinaryCompoundSERE__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3191:1: ( rule__BinaryCompoundSERE__Group_0__3__Impl )
            // InternalSequenceCS.g:3192:2: rule__BinaryCompoundSERE__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0__3"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0__3__Impl"
    // InternalSequenceCS.g:3198:1: rule__BinaryCompoundSERE__Group_0__3__Impl : ( ( rule__BinaryCompoundSERE__Alternatives_0_3 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3202:1: ( ( ( rule__BinaryCompoundSERE__Alternatives_0_3 ) ) )
            // InternalSequenceCS.g:3203:1: ( ( rule__BinaryCompoundSERE__Alternatives_0_3 ) )
            {
            // InternalSequenceCS.g:3203:1: ( ( rule__BinaryCompoundSERE__Alternatives_0_3 ) )
            // InternalSequenceCS.g:3204:2: ( rule__BinaryCompoundSERE__Alternatives_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_0_3()); 
            }
            // InternalSequenceCS.g:3205:2: ( rule__BinaryCompoundSERE__Alternatives_0_3 )
            // InternalSequenceCS.g:3205:3: rule__BinaryCompoundSERE__Alternatives_0_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Alternatives_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0__3__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_1_2__0"
    // InternalSequenceCS.g:3214:1: rule__BinaryCompoundSERE__Group_0_1_2__0 : rule__BinaryCompoundSERE__Group_0_1_2__0__Impl rule__BinaryCompoundSERE__Group_0_1_2__1 ;
    public final void rule__BinaryCompoundSERE__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3218:1: ( rule__BinaryCompoundSERE__Group_0_1_2__0__Impl rule__BinaryCompoundSERE__Group_0_1_2__1 )
            // InternalSequenceCS.g:3219:2: rule__BinaryCompoundSERE__Group_0_1_2__0__Impl rule__BinaryCompoundSERE__Group_0_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_0_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_1_2__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_1_2__0__Impl"
    // InternalSequenceCS.g:3226:1: rule__BinaryCompoundSERE__Group_0_1_2__0__Impl : ( '(' ) ;
    public final void rule__BinaryCompoundSERE__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3230:1: ( ( '(' ) )
            // InternalSequenceCS.g:3231:1: ( '(' )
            {
            // InternalSequenceCS.g:3231:1: ( '(' )
            // InternalSequenceCS.g:3232:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_0_1_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_1_2__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_1_2__1"
    // InternalSequenceCS.g:3241:1: rule__BinaryCompoundSERE__Group_0_1_2__1 : rule__BinaryCompoundSERE__Group_0_1_2__1__Impl rule__BinaryCompoundSERE__Group_0_1_2__2 ;
    public final void rule__BinaryCompoundSERE__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3245:1: ( rule__BinaryCompoundSERE__Group_0_1_2__1__Impl rule__BinaryCompoundSERE__Group_0_1_2__2 )
            // InternalSequenceCS.g:3246:2: rule__BinaryCompoundSERE__Group_0_1_2__1__Impl rule__BinaryCompoundSERE__Group_0_1_2__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryCompoundSERE__Group_0_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_1_2__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_1_2__1__Impl"
    // InternalSequenceCS.g:3253:1: rule__BinaryCompoundSERE__Group_0_1_2__1__Impl : ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3257:1: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1 ) ) )
            // InternalSequenceCS.g:3258:1: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1 ) )
            {
            // InternalSequenceCS.g:3258:1: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1 ) )
            // InternalSequenceCS.g:3259:2: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_0_1_2_1()); 
            }
            // InternalSequenceCS.g:3260:2: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1 )
            // InternalSequenceCS.g:3260:3: rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_0_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_1_2__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_1_2__2"
    // InternalSequenceCS.g:3268:1: rule__BinaryCompoundSERE__Group_0_1_2__2 : rule__BinaryCompoundSERE__Group_0_1_2__2__Impl ;
    public final void rule__BinaryCompoundSERE__Group_0_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3272:1: ( rule__BinaryCompoundSERE__Group_0_1_2__2__Impl )
            // InternalSequenceCS.g:3273:2: rule__BinaryCompoundSERE__Group_0_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_1_2__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_1_2__2__Impl"
    // InternalSequenceCS.g:3279:1: rule__BinaryCompoundSERE__Group_0_1_2__2__Impl : ( ')' ) ;
    public final void rule__BinaryCompoundSERE__Group_0_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3283:1: ( ( ')' ) )
            // InternalSequenceCS.g:3284:1: ( ')' )
            {
            // InternalSequenceCS.g:3284:1: ( ')' )
            // InternalSequenceCS.g:3285:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_0_1_2_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_0_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_1_2__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_3_2__0"
    // InternalSequenceCS.g:3295:1: rule__BinaryCompoundSERE__Group_0_3_2__0 : rule__BinaryCompoundSERE__Group_0_3_2__0__Impl rule__BinaryCompoundSERE__Group_0_3_2__1 ;
    public final void rule__BinaryCompoundSERE__Group_0_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3299:1: ( rule__BinaryCompoundSERE__Group_0_3_2__0__Impl rule__BinaryCompoundSERE__Group_0_3_2__1 )
            // InternalSequenceCS.g:3300:2: rule__BinaryCompoundSERE__Group_0_3_2__0__Impl rule__BinaryCompoundSERE__Group_0_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_0_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_3_2__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_3_2__0__Impl"
    // InternalSequenceCS.g:3307:1: rule__BinaryCompoundSERE__Group_0_3_2__0__Impl : ( '(' ) ;
    public final void rule__BinaryCompoundSERE__Group_0_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3311:1: ( ( '(' ) )
            // InternalSequenceCS.g:3312:1: ( '(' )
            {
            // InternalSequenceCS.g:3312:1: ( '(' )
            // InternalSequenceCS.g:3313:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_0_3_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_0_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_3_2__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_3_2__1"
    // InternalSequenceCS.g:3322:1: rule__BinaryCompoundSERE__Group_0_3_2__1 : rule__BinaryCompoundSERE__Group_0_3_2__1__Impl rule__BinaryCompoundSERE__Group_0_3_2__2 ;
    public final void rule__BinaryCompoundSERE__Group_0_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3326:1: ( rule__BinaryCompoundSERE__Group_0_3_2__1__Impl rule__BinaryCompoundSERE__Group_0_3_2__2 )
            // InternalSequenceCS.g:3327:2: rule__BinaryCompoundSERE__Group_0_3_2__1__Impl rule__BinaryCompoundSERE__Group_0_3_2__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryCompoundSERE__Group_0_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0_3_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_3_2__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_3_2__1__Impl"
    // InternalSequenceCS.g:3334:1: rule__BinaryCompoundSERE__Group_0_3_2__1__Impl : ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_2_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_0_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3338:1: ( ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_2_1 ) ) )
            // InternalSequenceCS.g:3339:1: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_2_1 ) )
            {
            // InternalSequenceCS.g:3339:1: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_2_1 ) )
            // InternalSequenceCS.g:3340:2: ( rule__BinaryCompoundSERE__RightAssignment_0_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_0_3_2_1()); 
            }
            // InternalSequenceCS.g:3341:2: ( rule__BinaryCompoundSERE__RightAssignment_0_3_2_1 )
            // InternalSequenceCS.g:3341:3: rule__BinaryCompoundSERE__RightAssignment_0_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__RightAssignment_0_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_0_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_3_2__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_3_2__2"
    // InternalSequenceCS.g:3349:1: rule__BinaryCompoundSERE__Group_0_3_2__2 : rule__BinaryCompoundSERE__Group_0_3_2__2__Impl ;
    public final void rule__BinaryCompoundSERE__Group_0_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3353:1: ( rule__BinaryCompoundSERE__Group_0_3_2__2__Impl )
            // InternalSequenceCS.g:3354:2: rule__BinaryCompoundSERE__Group_0_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_0_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_3_2__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_0_3_2__2__Impl"
    // InternalSequenceCS.g:3360:1: rule__BinaryCompoundSERE__Group_0_3_2__2__Impl : ( ')' ) ;
    public final void rule__BinaryCompoundSERE__Group_0_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3364:1: ( ( ')' ) )
            // InternalSequenceCS.g:3365:1: ( ')' )
            {
            // InternalSequenceCS.g:3365:1: ( ')' )
            // InternalSequenceCS.g:3366:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_0_3_2_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_0_3_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_0_3_2__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1__0"
    // InternalSequenceCS.g:3376:1: rule__BinaryCompoundSERE__Group_1__0 : rule__BinaryCompoundSERE__Group_1__0__Impl rule__BinaryCompoundSERE__Group_1__1 ;
    public final void rule__BinaryCompoundSERE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3380:1: ( rule__BinaryCompoundSERE__Group_1__0__Impl rule__BinaryCompoundSERE__Group_1__1 )
            // InternalSequenceCS.g:3381:2: rule__BinaryCompoundSERE__Group_1__0__Impl rule__BinaryCompoundSERE__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1__0__Impl"
    // InternalSequenceCS.g:3388:1: rule__BinaryCompoundSERE__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryCompoundSERE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3392:1: ( ( () ) )
            // InternalSequenceCS.g:3393:1: ( () )
            {
            // InternalSequenceCS.g:3393:1: ( () )
            // InternalSequenceCS.g:3394:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getSEREAndNLMAction_1_0()); 
            }
            // InternalSequenceCS.g:3395:2: ()
            // InternalSequenceCS.g:3395:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getSEREAndNLMAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1__1"
    // InternalSequenceCS.g:3403:1: rule__BinaryCompoundSERE__Group_1__1 : rule__BinaryCompoundSERE__Group_1__1__Impl rule__BinaryCompoundSERE__Group_1__2 ;
    public final void rule__BinaryCompoundSERE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3407:1: ( rule__BinaryCompoundSERE__Group_1__1__Impl rule__BinaryCompoundSERE__Group_1__2 )
            // InternalSequenceCS.g:3408:2: rule__BinaryCompoundSERE__Group_1__1__Impl rule__BinaryCompoundSERE__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__BinaryCompoundSERE__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1__1__Impl"
    // InternalSequenceCS.g:3415:1: rule__BinaryCompoundSERE__Group_1__1__Impl : ( ( rule__BinaryCompoundSERE__Alternatives_1_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3419:1: ( ( ( rule__BinaryCompoundSERE__Alternatives_1_1 ) ) )
            // InternalSequenceCS.g:3420:1: ( ( rule__BinaryCompoundSERE__Alternatives_1_1 ) )
            {
            // InternalSequenceCS.g:3420:1: ( ( rule__BinaryCompoundSERE__Alternatives_1_1 ) )
            // InternalSequenceCS.g:3421:2: ( rule__BinaryCompoundSERE__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_1_1()); 
            }
            // InternalSequenceCS.g:3422:2: ( rule__BinaryCompoundSERE__Alternatives_1_1 )
            // InternalSequenceCS.g:3422:3: rule__BinaryCompoundSERE__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1__2"
    // InternalSequenceCS.g:3430:1: rule__BinaryCompoundSERE__Group_1__2 : rule__BinaryCompoundSERE__Group_1__2__Impl rule__BinaryCompoundSERE__Group_1__3 ;
    public final void rule__BinaryCompoundSERE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3434:1: ( rule__BinaryCompoundSERE__Group_1__2__Impl rule__BinaryCompoundSERE__Group_1__3 )
            // InternalSequenceCS.g:3435:2: rule__BinaryCompoundSERE__Group_1__2__Impl rule__BinaryCompoundSERE__Group_1__3
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1__2__Impl"
    // InternalSequenceCS.g:3442:1: rule__BinaryCompoundSERE__Group_1__2__Impl : ( ( '&' ) ) ;
    public final void rule__BinaryCompoundSERE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3446:1: ( ( ( '&' ) ) )
            // InternalSequenceCS.g:3447:1: ( ( '&' ) )
            {
            // InternalSequenceCS.g:3447:1: ( ( '&' ) )
            // InternalSequenceCS.g:3448:2: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAmpersandKeyword_1_2()); 
            }
            // InternalSequenceCS.g:3449:2: ( '&' )
            // InternalSequenceCS.g:3449:3: '&'
            {
            match(input,27,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAmpersandKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1__3"
    // InternalSequenceCS.g:3457:1: rule__BinaryCompoundSERE__Group_1__3 : rule__BinaryCompoundSERE__Group_1__3__Impl ;
    public final void rule__BinaryCompoundSERE__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3461:1: ( rule__BinaryCompoundSERE__Group_1__3__Impl )
            // InternalSequenceCS.g:3462:2: rule__BinaryCompoundSERE__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1__3"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1__3__Impl"
    // InternalSequenceCS.g:3468:1: rule__BinaryCompoundSERE__Group_1__3__Impl : ( ( rule__BinaryCompoundSERE__Alternatives_1_3 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3472:1: ( ( ( rule__BinaryCompoundSERE__Alternatives_1_3 ) ) )
            // InternalSequenceCS.g:3473:1: ( ( rule__BinaryCompoundSERE__Alternatives_1_3 ) )
            {
            // InternalSequenceCS.g:3473:1: ( ( rule__BinaryCompoundSERE__Alternatives_1_3 ) )
            // InternalSequenceCS.g:3474:2: ( rule__BinaryCompoundSERE__Alternatives_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_1_3()); 
            }
            // InternalSequenceCS.g:3475:2: ( rule__BinaryCompoundSERE__Alternatives_1_3 )
            // InternalSequenceCS.g:3475:3: rule__BinaryCompoundSERE__Alternatives_1_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Alternatives_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1__3__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_1_2__0"
    // InternalSequenceCS.g:3484:1: rule__BinaryCompoundSERE__Group_1_1_2__0 : rule__BinaryCompoundSERE__Group_1_1_2__0__Impl rule__BinaryCompoundSERE__Group_1_1_2__1 ;
    public final void rule__BinaryCompoundSERE__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3488:1: ( rule__BinaryCompoundSERE__Group_1_1_2__0__Impl rule__BinaryCompoundSERE__Group_1_1_2__1 )
            // InternalSequenceCS.g:3489:2: rule__BinaryCompoundSERE__Group_1_1_2__0__Impl rule__BinaryCompoundSERE__Group_1_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_1_2__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_1_2__0__Impl"
    // InternalSequenceCS.g:3496:1: rule__BinaryCompoundSERE__Group_1_1_2__0__Impl : ( '(' ) ;
    public final void rule__BinaryCompoundSERE__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3500:1: ( ( '(' ) )
            // InternalSequenceCS.g:3501:1: ( '(' )
            {
            // InternalSequenceCS.g:3501:1: ( '(' )
            // InternalSequenceCS.g:3502:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_1_1_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_1_2__1"
    // InternalSequenceCS.g:3511:1: rule__BinaryCompoundSERE__Group_1_1_2__1 : rule__BinaryCompoundSERE__Group_1_1_2__1__Impl rule__BinaryCompoundSERE__Group_1_1_2__2 ;
    public final void rule__BinaryCompoundSERE__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3515:1: ( rule__BinaryCompoundSERE__Group_1_1_2__1__Impl rule__BinaryCompoundSERE__Group_1_1_2__2 )
            // InternalSequenceCS.g:3516:2: rule__BinaryCompoundSERE__Group_1_1_2__1__Impl rule__BinaryCompoundSERE__Group_1_1_2__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryCompoundSERE__Group_1_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_1_2__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_1_2__1__Impl"
    // InternalSequenceCS.g:3523:1: rule__BinaryCompoundSERE__Group_1_1_2__1__Impl : ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3527:1: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1 ) ) )
            // InternalSequenceCS.g:3528:1: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1 ) )
            {
            // InternalSequenceCS.g:3528:1: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1 ) )
            // InternalSequenceCS.g:3529:2: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_1_1_2_1()); 
            }
            // InternalSequenceCS.g:3530:2: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1 )
            // InternalSequenceCS.g:3530:3: rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_1_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_1_2__2"
    // InternalSequenceCS.g:3538:1: rule__BinaryCompoundSERE__Group_1_1_2__2 : rule__BinaryCompoundSERE__Group_1_1_2__2__Impl ;
    public final void rule__BinaryCompoundSERE__Group_1_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3542:1: ( rule__BinaryCompoundSERE__Group_1_1_2__2__Impl )
            // InternalSequenceCS.g:3543:2: rule__BinaryCompoundSERE__Group_1_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_1_2__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_1_2__2__Impl"
    // InternalSequenceCS.g:3549:1: rule__BinaryCompoundSERE__Group_1_1_2__2__Impl : ( ')' ) ;
    public final void rule__BinaryCompoundSERE__Group_1_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3553:1: ( ( ')' ) )
            // InternalSequenceCS.g:3554:1: ( ')' )
            {
            // InternalSequenceCS.g:3554:1: ( ')' )
            // InternalSequenceCS.g:3555:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_1_1_2_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_1_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_1_2__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_3_2__0"
    // InternalSequenceCS.g:3565:1: rule__BinaryCompoundSERE__Group_1_3_2__0 : rule__BinaryCompoundSERE__Group_1_3_2__0__Impl rule__BinaryCompoundSERE__Group_1_3_2__1 ;
    public final void rule__BinaryCompoundSERE__Group_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3569:1: ( rule__BinaryCompoundSERE__Group_1_3_2__0__Impl rule__BinaryCompoundSERE__Group_1_3_2__1 )
            // InternalSequenceCS.g:3570:2: rule__BinaryCompoundSERE__Group_1_3_2__0__Impl rule__BinaryCompoundSERE__Group_1_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_1_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_3_2__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_3_2__0__Impl"
    // InternalSequenceCS.g:3577:1: rule__BinaryCompoundSERE__Group_1_3_2__0__Impl : ( '(' ) ;
    public final void rule__BinaryCompoundSERE__Group_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3581:1: ( ( '(' ) )
            // InternalSequenceCS.g:3582:1: ( '(' )
            {
            // InternalSequenceCS.g:3582:1: ( '(' )
            // InternalSequenceCS.g:3583:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_1_3_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_1_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_3_2__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_3_2__1"
    // InternalSequenceCS.g:3592:1: rule__BinaryCompoundSERE__Group_1_3_2__1 : rule__BinaryCompoundSERE__Group_1_3_2__1__Impl rule__BinaryCompoundSERE__Group_1_3_2__2 ;
    public final void rule__BinaryCompoundSERE__Group_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3596:1: ( rule__BinaryCompoundSERE__Group_1_3_2__1__Impl rule__BinaryCompoundSERE__Group_1_3_2__2 )
            // InternalSequenceCS.g:3597:2: rule__BinaryCompoundSERE__Group_1_3_2__1__Impl rule__BinaryCompoundSERE__Group_1_3_2__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryCompoundSERE__Group_1_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1_3_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_3_2__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_3_2__1__Impl"
    // InternalSequenceCS.g:3604:1: rule__BinaryCompoundSERE__Group_1_3_2__1__Impl : ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_2_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3608:1: ( ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_2_1 ) ) )
            // InternalSequenceCS.g:3609:1: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_2_1 ) )
            {
            // InternalSequenceCS.g:3609:1: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_2_1 ) )
            // InternalSequenceCS.g:3610:2: ( rule__BinaryCompoundSERE__RightAssignment_1_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_1_3_2_1()); 
            }
            // InternalSequenceCS.g:3611:2: ( rule__BinaryCompoundSERE__RightAssignment_1_3_2_1 )
            // InternalSequenceCS.g:3611:3: rule__BinaryCompoundSERE__RightAssignment_1_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__RightAssignment_1_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_1_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_3_2__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_3_2__2"
    // InternalSequenceCS.g:3619:1: rule__BinaryCompoundSERE__Group_1_3_2__2 : rule__BinaryCompoundSERE__Group_1_3_2__2__Impl ;
    public final void rule__BinaryCompoundSERE__Group_1_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3623:1: ( rule__BinaryCompoundSERE__Group_1_3_2__2__Impl )
            // InternalSequenceCS.g:3624:2: rule__BinaryCompoundSERE__Group_1_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_1_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_3_2__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_1_3_2__2__Impl"
    // InternalSequenceCS.g:3630:1: rule__BinaryCompoundSERE__Group_1_3_2__2__Impl : ( ')' ) ;
    public final void rule__BinaryCompoundSERE__Group_1_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3634:1: ( ( ')' ) )
            // InternalSequenceCS.g:3635:1: ( ')' )
            {
            // InternalSequenceCS.g:3635:1: ( ')' )
            // InternalSequenceCS.g:3636:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_1_3_2_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_1_3_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_1_3_2__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2__0"
    // InternalSequenceCS.g:3646:1: rule__BinaryCompoundSERE__Group_2__0 : rule__BinaryCompoundSERE__Group_2__0__Impl rule__BinaryCompoundSERE__Group_2__1 ;
    public final void rule__BinaryCompoundSERE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3650:1: ( rule__BinaryCompoundSERE__Group_2__0__Impl rule__BinaryCompoundSERE__Group_2__1 )
            // InternalSequenceCS.g:3651:2: rule__BinaryCompoundSERE__Group_2__0__Impl rule__BinaryCompoundSERE__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2__0__Impl"
    // InternalSequenceCS.g:3658:1: rule__BinaryCompoundSERE__Group_2__0__Impl : ( () ) ;
    public final void rule__BinaryCompoundSERE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3662:1: ( ( () ) )
            // InternalSequenceCS.g:3663:1: ( () )
            {
            // InternalSequenceCS.g:3663:1: ( () )
            // InternalSequenceCS.g:3664:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getSEREAndLMAction_2_0()); 
            }
            // InternalSequenceCS.g:3665:2: ()
            // InternalSequenceCS.g:3665:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getSEREAndLMAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2__1"
    // InternalSequenceCS.g:3673:1: rule__BinaryCompoundSERE__Group_2__1 : rule__BinaryCompoundSERE__Group_2__1__Impl rule__BinaryCompoundSERE__Group_2__2 ;
    public final void rule__BinaryCompoundSERE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3677:1: ( rule__BinaryCompoundSERE__Group_2__1__Impl rule__BinaryCompoundSERE__Group_2__2 )
            // InternalSequenceCS.g:3678:2: rule__BinaryCompoundSERE__Group_2__1__Impl rule__BinaryCompoundSERE__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__BinaryCompoundSERE__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2__1__Impl"
    // InternalSequenceCS.g:3685:1: rule__BinaryCompoundSERE__Group_2__1__Impl : ( ( rule__BinaryCompoundSERE__Alternatives_2_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3689:1: ( ( ( rule__BinaryCompoundSERE__Alternatives_2_1 ) ) )
            // InternalSequenceCS.g:3690:1: ( ( rule__BinaryCompoundSERE__Alternatives_2_1 ) )
            {
            // InternalSequenceCS.g:3690:1: ( ( rule__BinaryCompoundSERE__Alternatives_2_1 ) )
            // InternalSequenceCS.g:3691:2: ( rule__BinaryCompoundSERE__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_2_1()); 
            }
            // InternalSequenceCS.g:3692:2: ( rule__BinaryCompoundSERE__Alternatives_2_1 )
            // InternalSequenceCS.g:3692:3: rule__BinaryCompoundSERE__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2__2"
    // InternalSequenceCS.g:3700:1: rule__BinaryCompoundSERE__Group_2__2 : rule__BinaryCompoundSERE__Group_2__2__Impl rule__BinaryCompoundSERE__Group_2__3 ;
    public final void rule__BinaryCompoundSERE__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3704:1: ( rule__BinaryCompoundSERE__Group_2__2__Impl rule__BinaryCompoundSERE__Group_2__3 )
            // InternalSequenceCS.g:3705:2: rule__BinaryCompoundSERE__Group_2__2__Impl rule__BinaryCompoundSERE__Group_2__3
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2__2__Impl"
    // InternalSequenceCS.g:3712:1: rule__BinaryCompoundSERE__Group_2__2__Impl : ( ( '&&' ) ) ;
    public final void rule__BinaryCompoundSERE__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3716:1: ( ( ( '&&' ) ) )
            // InternalSequenceCS.g:3717:1: ( ( '&&' ) )
            {
            // InternalSequenceCS.g:3717:1: ( ( '&&' ) )
            // InternalSequenceCS.g:3718:2: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAmpersandAmpersandKeyword_2_2()); 
            }
            // InternalSequenceCS.g:3719:2: ( '&&' )
            // InternalSequenceCS.g:3719:3: '&&'
            {
            match(input,28,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAmpersandAmpersandKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2__3"
    // InternalSequenceCS.g:3727:1: rule__BinaryCompoundSERE__Group_2__3 : rule__BinaryCompoundSERE__Group_2__3__Impl ;
    public final void rule__BinaryCompoundSERE__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3731:1: ( rule__BinaryCompoundSERE__Group_2__3__Impl )
            // InternalSequenceCS.g:3732:2: rule__BinaryCompoundSERE__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2__3"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2__3__Impl"
    // InternalSequenceCS.g:3738:1: rule__BinaryCompoundSERE__Group_2__3__Impl : ( ( rule__BinaryCompoundSERE__Alternatives_2_3 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3742:1: ( ( ( rule__BinaryCompoundSERE__Alternatives_2_3 ) ) )
            // InternalSequenceCS.g:3743:1: ( ( rule__BinaryCompoundSERE__Alternatives_2_3 ) )
            {
            // InternalSequenceCS.g:3743:1: ( ( rule__BinaryCompoundSERE__Alternatives_2_3 ) )
            // InternalSequenceCS.g:3744:2: ( rule__BinaryCompoundSERE__Alternatives_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_2_3()); 
            }
            // InternalSequenceCS.g:3745:2: ( rule__BinaryCompoundSERE__Alternatives_2_3 )
            // InternalSequenceCS.g:3745:3: rule__BinaryCompoundSERE__Alternatives_2_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Alternatives_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2__3__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_1_2__0"
    // InternalSequenceCS.g:3754:1: rule__BinaryCompoundSERE__Group_2_1_2__0 : rule__BinaryCompoundSERE__Group_2_1_2__0__Impl rule__BinaryCompoundSERE__Group_2_1_2__1 ;
    public final void rule__BinaryCompoundSERE__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3758:1: ( rule__BinaryCompoundSERE__Group_2_1_2__0__Impl rule__BinaryCompoundSERE__Group_2_1_2__1 )
            // InternalSequenceCS.g:3759:2: rule__BinaryCompoundSERE__Group_2_1_2__0__Impl rule__BinaryCompoundSERE__Group_2_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_2_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_1_2__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_1_2__0__Impl"
    // InternalSequenceCS.g:3766:1: rule__BinaryCompoundSERE__Group_2_1_2__0__Impl : ( '(' ) ;
    public final void rule__BinaryCompoundSERE__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3770:1: ( ( '(' ) )
            // InternalSequenceCS.g:3771:1: ( '(' )
            {
            // InternalSequenceCS.g:3771:1: ( '(' )
            // InternalSequenceCS.g:3772:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_2_1_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_1_2__1"
    // InternalSequenceCS.g:3781:1: rule__BinaryCompoundSERE__Group_2_1_2__1 : rule__BinaryCompoundSERE__Group_2_1_2__1__Impl rule__BinaryCompoundSERE__Group_2_1_2__2 ;
    public final void rule__BinaryCompoundSERE__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3785:1: ( rule__BinaryCompoundSERE__Group_2_1_2__1__Impl rule__BinaryCompoundSERE__Group_2_1_2__2 )
            // InternalSequenceCS.g:3786:2: rule__BinaryCompoundSERE__Group_2_1_2__1__Impl rule__BinaryCompoundSERE__Group_2_1_2__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryCompoundSERE__Group_2_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_1_2__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_1_2__1__Impl"
    // InternalSequenceCS.g:3793:1: rule__BinaryCompoundSERE__Group_2_1_2__1__Impl : ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3797:1: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1 ) ) )
            // InternalSequenceCS.g:3798:1: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1 ) )
            {
            // InternalSequenceCS.g:3798:1: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1 ) )
            // InternalSequenceCS.g:3799:2: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_2_1_2_1()); 
            }
            // InternalSequenceCS.g:3800:2: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1 )
            // InternalSequenceCS.g:3800:3: rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_2_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_1_2__2"
    // InternalSequenceCS.g:3808:1: rule__BinaryCompoundSERE__Group_2_1_2__2 : rule__BinaryCompoundSERE__Group_2_1_2__2__Impl ;
    public final void rule__BinaryCompoundSERE__Group_2_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3812:1: ( rule__BinaryCompoundSERE__Group_2_1_2__2__Impl )
            // InternalSequenceCS.g:3813:2: rule__BinaryCompoundSERE__Group_2_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_1_2__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_1_2__2__Impl"
    // InternalSequenceCS.g:3819:1: rule__BinaryCompoundSERE__Group_2_1_2__2__Impl : ( ')' ) ;
    public final void rule__BinaryCompoundSERE__Group_2_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3823:1: ( ( ')' ) )
            // InternalSequenceCS.g:3824:1: ( ')' )
            {
            // InternalSequenceCS.g:3824:1: ( ')' )
            // InternalSequenceCS.g:3825:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_2_1_2_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_2_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_1_2__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_3_2__0"
    // InternalSequenceCS.g:3835:1: rule__BinaryCompoundSERE__Group_2_3_2__0 : rule__BinaryCompoundSERE__Group_2_3_2__0__Impl rule__BinaryCompoundSERE__Group_2_3_2__1 ;
    public final void rule__BinaryCompoundSERE__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3839:1: ( rule__BinaryCompoundSERE__Group_2_3_2__0__Impl rule__BinaryCompoundSERE__Group_2_3_2__1 )
            // InternalSequenceCS.g:3840:2: rule__BinaryCompoundSERE__Group_2_3_2__0__Impl rule__BinaryCompoundSERE__Group_2_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_2_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_3_2__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_3_2__0__Impl"
    // InternalSequenceCS.g:3847:1: rule__BinaryCompoundSERE__Group_2_3_2__0__Impl : ( '(' ) ;
    public final void rule__BinaryCompoundSERE__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3851:1: ( ( '(' ) )
            // InternalSequenceCS.g:3852:1: ( '(' )
            {
            // InternalSequenceCS.g:3852:1: ( '(' )
            // InternalSequenceCS.g:3853:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_2_3_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_2_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_3_2__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_3_2__1"
    // InternalSequenceCS.g:3862:1: rule__BinaryCompoundSERE__Group_2_3_2__1 : rule__BinaryCompoundSERE__Group_2_3_2__1__Impl rule__BinaryCompoundSERE__Group_2_3_2__2 ;
    public final void rule__BinaryCompoundSERE__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3866:1: ( rule__BinaryCompoundSERE__Group_2_3_2__1__Impl rule__BinaryCompoundSERE__Group_2_3_2__2 )
            // InternalSequenceCS.g:3867:2: rule__BinaryCompoundSERE__Group_2_3_2__1__Impl rule__BinaryCompoundSERE__Group_2_3_2__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryCompoundSERE__Group_2_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2_3_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_3_2__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_3_2__1__Impl"
    // InternalSequenceCS.g:3874:1: rule__BinaryCompoundSERE__Group_2_3_2__1__Impl : ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_2_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3878:1: ( ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_2_1 ) ) )
            // InternalSequenceCS.g:3879:1: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_2_1 ) )
            {
            // InternalSequenceCS.g:3879:1: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_2_1 ) )
            // InternalSequenceCS.g:3880:2: ( rule__BinaryCompoundSERE__RightAssignment_2_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_2_3_2_1()); 
            }
            // InternalSequenceCS.g:3881:2: ( rule__BinaryCompoundSERE__RightAssignment_2_3_2_1 )
            // InternalSequenceCS.g:3881:3: rule__BinaryCompoundSERE__RightAssignment_2_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__RightAssignment_2_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_2_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_3_2__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_3_2__2"
    // InternalSequenceCS.g:3889:1: rule__BinaryCompoundSERE__Group_2_3_2__2 : rule__BinaryCompoundSERE__Group_2_3_2__2__Impl ;
    public final void rule__BinaryCompoundSERE__Group_2_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3893:1: ( rule__BinaryCompoundSERE__Group_2_3_2__2__Impl )
            // InternalSequenceCS.g:3894:2: rule__BinaryCompoundSERE__Group_2_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_2_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_3_2__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_2_3_2__2__Impl"
    // InternalSequenceCS.g:3900:1: rule__BinaryCompoundSERE__Group_2_3_2__2__Impl : ( ')' ) ;
    public final void rule__BinaryCompoundSERE__Group_2_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3904:1: ( ( ')' ) )
            // InternalSequenceCS.g:3905:1: ( ')' )
            {
            // InternalSequenceCS.g:3905:1: ( ')' )
            // InternalSequenceCS.g:3906:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_2_3_2_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_2_3_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_2_3_2__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3__0"
    // InternalSequenceCS.g:3916:1: rule__BinaryCompoundSERE__Group_3__0 : rule__BinaryCompoundSERE__Group_3__0__Impl rule__BinaryCompoundSERE__Group_3__1 ;
    public final void rule__BinaryCompoundSERE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3920:1: ( rule__BinaryCompoundSERE__Group_3__0__Impl rule__BinaryCompoundSERE__Group_3__1 )
            // InternalSequenceCS.g:3921:2: rule__BinaryCompoundSERE__Group_3__0__Impl rule__BinaryCompoundSERE__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3__0__Impl"
    // InternalSequenceCS.g:3928:1: rule__BinaryCompoundSERE__Group_3__0__Impl : ( () ) ;
    public final void rule__BinaryCompoundSERE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3932:1: ( ( () ) )
            // InternalSequenceCS.g:3933:1: ( () )
            {
            // InternalSequenceCS.g:3933:1: ( () )
            // InternalSequenceCS.g:3934:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getSEREWithinAction_3_0()); 
            }
            // InternalSequenceCS.g:3935:2: ()
            // InternalSequenceCS.g:3935:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getSEREWithinAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3__1"
    // InternalSequenceCS.g:3943:1: rule__BinaryCompoundSERE__Group_3__1 : rule__BinaryCompoundSERE__Group_3__1__Impl rule__BinaryCompoundSERE__Group_3__2 ;
    public final void rule__BinaryCompoundSERE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3947:1: ( rule__BinaryCompoundSERE__Group_3__1__Impl rule__BinaryCompoundSERE__Group_3__2 )
            // InternalSequenceCS.g:3948:2: rule__BinaryCompoundSERE__Group_3__1__Impl rule__BinaryCompoundSERE__Group_3__2
            {
            pushFollow(FOLLOW_24);
            rule__BinaryCompoundSERE__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3__1__Impl"
    // InternalSequenceCS.g:3955:1: rule__BinaryCompoundSERE__Group_3__1__Impl : ( ( rule__BinaryCompoundSERE__Alternatives_3_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3959:1: ( ( ( rule__BinaryCompoundSERE__Alternatives_3_1 ) ) )
            // InternalSequenceCS.g:3960:1: ( ( rule__BinaryCompoundSERE__Alternatives_3_1 ) )
            {
            // InternalSequenceCS.g:3960:1: ( ( rule__BinaryCompoundSERE__Alternatives_3_1 ) )
            // InternalSequenceCS.g:3961:2: ( rule__BinaryCompoundSERE__Alternatives_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_3_1()); 
            }
            // InternalSequenceCS.g:3962:2: ( rule__BinaryCompoundSERE__Alternatives_3_1 )
            // InternalSequenceCS.g:3962:3: rule__BinaryCompoundSERE__Alternatives_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Alternatives_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3__2"
    // InternalSequenceCS.g:3970:1: rule__BinaryCompoundSERE__Group_3__2 : rule__BinaryCompoundSERE__Group_3__2__Impl rule__BinaryCompoundSERE__Group_3__3 ;
    public final void rule__BinaryCompoundSERE__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3974:1: ( rule__BinaryCompoundSERE__Group_3__2__Impl rule__BinaryCompoundSERE__Group_3__3 )
            // InternalSequenceCS.g:3975:2: rule__BinaryCompoundSERE__Group_3__2__Impl rule__BinaryCompoundSERE__Group_3__3
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3__2__Impl"
    // InternalSequenceCS.g:3982:1: rule__BinaryCompoundSERE__Group_3__2__Impl : ( ( 'within' ) ) ;
    public final void rule__BinaryCompoundSERE__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:3986:1: ( ( ( 'within' ) ) )
            // InternalSequenceCS.g:3987:1: ( ( 'within' ) )
            {
            // InternalSequenceCS.g:3987:1: ( ( 'within' ) )
            // InternalSequenceCS.g:3988:2: ( 'within' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getWithinKeyword_3_2()); 
            }
            // InternalSequenceCS.g:3989:2: ( 'within' )
            // InternalSequenceCS.g:3989:3: 'within'
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getWithinKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3__3"
    // InternalSequenceCS.g:3997:1: rule__BinaryCompoundSERE__Group_3__3 : rule__BinaryCompoundSERE__Group_3__3__Impl ;
    public final void rule__BinaryCompoundSERE__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4001:1: ( rule__BinaryCompoundSERE__Group_3__3__Impl )
            // InternalSequenceCS.g:4002:2: rule__BinaryCompoundSERE__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3__3"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3__3__Impl"
    // InternalSequenceCS.g:4008:1: rule__BinaryCompoundSERE__Group_3__3__Impl : ( ( rule__BinaryCompoundSERE__Alternatives_3_3 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4012:1: ( ( ( rule__BinaryCompoundSERE__Alternatives_3_3 ) ) )
            // InternalSequenceCS.g:4013:1: ( ( rule__BinaryCompoundSERE__Alternatives_3_3 ) )
            {
            // InternalSequenceCS.g:4013:1: ( ( rule__BinaryCompoundSERE__Alternatives_3_3 ) )
            // InternalSequenceCS.g:4014:2: ( rule__BinaryCompoundSERE__Alternatives_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_3_3()); 
            }
            // InternalSequenceCS.g:4015:2: ( rule__BinaryCompoundSERE__Alternatives_3_3 )
            // InternalSequenceCS.g:4015:3: rule__BinaryCompoundSERE__Alternatives_3_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Alternatives_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getAlternatives_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3__3__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_1_2__0"
    // InternalSequenceCS.g:4024:1: rule__BinaryCompoundSERE__Group_3_1_2__0 : rule__BinaryCompoundSERE__Group_3_1_2__0__Impl rule__BinaryCompoundSERE__Group_3_1_2__1 ;
    public final void rule__BinaryCompoundSERE__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4028:1: ( rule__BinaryCompoundSERE__Group_3_1_2__0__Impl rule__BinaryCompoundSERE__Group_3_1_2__1 )
            // InternalSequenceCS.g:4029:2: rule__BinaryCompoundSERE__Group_3_1_2__0__Impl rule__BinaryCompoundSERE__Group_3_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_3_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_1_2__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_1_2__0__Impl"
    // InternalSequenceCS.g:4036:1: rule__BinaryCompoundSERE__Group_3_1_2__0__Impl : ( '(' ) ;
    public final void rule__BinaryCompoundSERE__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4040:1: ( ( '(' ) )
            // InternalSequenceCS.g:4041:1: ( '(' )
            {
            // InternalSequenceCS.g:4041:1: ( '(' )
            // InternalSequenceCS.g:4042:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_3_1_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_1_2__1"
    // InternalSequenceCS.g:4051:1: rule__BinaryCompoundSERE__Group_3_1_2__1 : rule__BinaryCompoundSERE__Group_3_1_2__1__Impl rule__BinaryCompoundSERE__Group_3_1_2__2 ;
    public final void rule__BinaryCompoundSERE__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4055:1: ( rule__BinaryCompoundSERE__Group_3_1_2__1__Impl rule__BinaryCompoundSERE__Group_3_1_2__2 )
            // InternalSequenceCS.g:4056:2: rule__BinaryCompoundSERE__Group_3_1_2__1__Impl rule__BinaryCompoundSERE__Group_3_1_2__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryCompoundSERE__Group_3_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_1_2__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_1_2__1__Impl"
    // InternalSequenceCS.g:4063:1: rule__BinaryCompoundSERE__Group_3_1_2__1__Impl : ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4067:1: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1 ) ) )
            // InternalSequenceCS.g:4068:1: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1 ) )
            {
            // InternalSequenceCS.g:4068:1: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1 ) )
            // InternalSequenceCS.g:4069:2: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_3_1_2_1()); 
            }
            // InternalSequenceCS.g:4070:2: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1 )
            // InternalSequenceCS.g:4070:3: rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_3_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_1_2__2"
    // InternalSequenceCS.g:4078:1: rule__BinaryCompoundSERE__Group_3_1_2__2 : rule__BinaryCompoundSERE__Group_3_1_2__2__Impl ;
    public final void rule__BinaryCompoundSERE__Group_3_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4082:1: ( rule__BinaryCompoundSERE__Group_3_1_2__2__Impl )
            // InternalSequenceCS.g:4083:2: rule__BinaryCompoundSERE__Group_3_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_1_2__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_1_2__2__Impl"
    // InternalSequenceCS.g:4089:1: rule__BinaryCompoundSERE__Group_3_1_2__2__Impl : ( ')' ) ;
    public final void rule__BinaryCompoundSERE__Group_3_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4093:1: ( ( ')' ) )
            // InternalSequenceCS.g:4094:1: ( ')' )
            {
            // InternalSequenceCS.g:4094:1: ( ')' )
            // InternalSequenceCS.g:4095:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_3_1_2_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_3_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_1_2__2__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_3_2__0"
    // InternalSequenceCS.g:4105:1: rule__BinaryCompoundSERE__Group_3_3_2__0 : rule__BinaryCompoundSERE__Group_3_3_2__0__Impl rule__BinaryCompoundSERE__Group_3_3_2__1 ;
    public final void rule__BinaryCompoundSERE__Group_3_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4109:1: ( rule__BinaryCompoundSERE__Group_3_3_2__0__Impl rule__BinaryCompoundSERE__Group_3_3_2__1 )
            // InternalSequenceCS.g:4110:2: rule__BinaryCompoundSERE__Group_3_3_2__0__Impl rule__BinaryCompoundSERE__Group_3_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCompoundSERE__Group_3_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_3_2__0"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_3_2__0__Impl"
    // InternalSequenceCS.g:4117:1: rule__BinaryCompoundSERE__Group_3_3_2__0__Impl : ( '(' ) ;
    public final void rule__BinaryCompoundSERE__Group_3_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4121:1: ( ( '(' ) )
            // InternalSequenceCS.g:4122:1: ( '(' )
            {
            // InternalSequenceCS.g:4122:1: ( '(' )
            // InternalSequenceCS.g:4123:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_3_3_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_3_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_3_2__0__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_3_2__1"
    // InternalSequenceCS.g:4132:1: rule__BinaryCompoundSERE__Group_3_3_2__1 : rule__BinaryCompoundSERE__Group_3_3_2__1__Impl rule__BinaryCompoundSERE__Group_3_3_2__2 ;
    public final void rule__BinaryCompoundSERE__Group_3_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4136:1: ( rule__BinaryCompoundSERE__Group_3_3_2__1__Impl rule__BinaryCompoundSERE__Group_3_3_2__2 )
            // InternalSequenceCS.g:4137:2: rule__BinaryCompoundSERE__Group_3_3_2__1__Impl rule__BinaryCompoundSERE__Group_3_3_2__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryCompoundSERE__Group_3_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3_3_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_3_2__1"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_3_2__1__Impl"
    // InternalSequenceCS.g:4144:1: rule__BinaryCompoundSERE__Group_3_3_2__1__Impl : ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_2_1 ) ) ;
    public final void rule__BinaryCompoundSERE__Group_3_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4148:1: ( ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_2_1 ) ) )
            // InternalSequenceCS.g:4149:1: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_2_1 ) )
            {
            // InternalSequenceCS.g:4149:1: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_2_1 ) )
            // InternalSequenceCS.g:4150:2: ( rule__BinaryCompoundSERE__RightAssignment_3_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_3_3_2_1()); 
            }
            // InternalSequenceCS.g:4151:2: ( rule__BinaryCompoundSERE__RightAssignment_3_3_2_1 )
            // InternalSequenceCS.g:4151:3: rule__BinaryCompoundSERE__RightAssignment_3_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__RightAssignment_3_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_3_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_3_2__1__Impl"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_3_2__2"
    // InternalSequenceCS.g:4159:1: rule__BinaryCompoundSERE__Group_3_3_2__2 : rule__BinaryCompoundSERE__Group_3_3_2__2__Impl ;
    public final void rule__BinaryCompoundSERE__Group_3_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4163:1: ( rule__BinaryCompoundSERE__Group_3_3_2__2__Impl )
            // InternalSequenceCS.g:4164:2: rule__BinaryCompoundSERE__Group_3_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCompoundSERE__Group_3_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_3_2__2"


    // $ANTLR start "rule__BinaryCompoundSERE__Group_3_3_2__2__Impl"
    // InternalSequenceCS.g:4170:1: rule__BinaryCompoundSERE__Group_3_3_2__2__Impl : ( ')' ) ;
    public final void rule__BinaryCompoundSERE__Group_3_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4174:1: ( ( ')' ) )
            // InternalSequenceCS.g:4175:1: ( ')' )
            {
            // InternalSequenceCS.g:4175:1: ( ')' )
            // InternalSequenceCS.g:4176:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_3_3_2_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_3_3_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__Group_3_3_2__2__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalSequenceCS.g:4186:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4190:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalSequenceCS.g:4191:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Range__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalSequenceCS.g:4198:1: rule__Range__Group__0__Impl : ( ( rule__Range__LOWER_BOUNDAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4202:1: ( ( ( rule__Range__LOWER_BOUNDAssignment_0 ) ) )
            // InternalSequenceCS.g:4203:1: ( ( rule__Range__LOWER_BOUNDAssignment_0 ) )
            {
            // InternalSequenceCS.g:4203:1: ( ( rule__Range__LOWER_BOUNDAssignment_0 ) )
            // InternalSequenceCS.g:4204:2: ( rule__Range__LOWER_BOUNDAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getLOWER_BOUNDAssignment_0()); 
            }
            // InternalSequenceCS.g:4205:2: ( rule__Range__LOWER_BOUNDAssignment_0 )
            // InternalSequenceCS.g:4205:3: rule__Range__LOWER_BOUNDAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Range__LOWER_BOUNDAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getLOWER_BOUNDAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalSequenceCS.g:4213:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4217:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalSequenceCS.g:4218:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Range__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalSequenceCS.g:4225:1: rule__Range__Group__1__Impl : ( ':' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4229:1: ( ( ':' ) )
            // InternalSequenceCS.g:4230:1: ( ':' )
            {
            // InternalSequenceCS.g:4230:1: ( ':' )
            // InternalSequenceCS.g:4231:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getColonKeyword_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalSequenceCS.g:4240:1: rule__Range__Group__2 : rule__Range__Group__2__Impl ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4244:1: ( rule__Range__Group__2__Impl )
            // InternalSequenceCS.g:4245:2: rule__Range__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalSequenceCS.g:4251:1: rule__Range__Group__2__Impl : ( ( rule__Range__HIGHER_BOUNDAssignment_2 ) ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4255:1: ( ( ( rule__Range__HIGHER_BOUNDAssignment_2 ) ) )
            // InternalSequenceCS.g:4256:1: ( ( rule__Range__HIGHER_BOUNDAssignment_2 ) )
            {
            // InternalSequenceCS.g:4256:1: ( ( rule__Range__HIGHER_BOUNDAssignment_2 ) )
            // InternalSequenceCS.g:4257:2: ( rule__Range__HIGHER_BOUNDAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getHIGHER_BOUNDAssignment_2()); 
            }
            // InternalSequenceCS.g:4258:2: ( rule__Range__HIGHER_BOUNDAssignment_2 )
            // InternalSequenceCS.g:4258:3: rule__Range__HIGHER_BOUNDAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Range__HIGHER_BOUNDAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getHIGHER_BOUNDAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__SERE__RightAssignment_1_0_2"
    // InternalSequenceCS.g:4267:1: rule__SERE__RightAssignment_1_0_2 : ( ruleSERE ) ;
    public final void rule__SERE__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4271:1: ( ( ruleSERE ) )
            // InternalSequenceCS.g:4272:2: ( ruleSERE )
            {
            // InternalSequenceCS.g:4272:2: ( ruleSERE )
            // InternalSequenceCS.g:4273:3: ruleSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getRightSEREParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getRightSEREParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__RightAssignment_1_0_2"


    // $ANTLR start "rule__SERE__RightAssignment_1_1_2"
    // InternalSequenceCS.g:4282:1: rule__SERE__RightAssignment_1_1_2 : ( ruleSERE ) ;
    public final void rule__SERE__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4286:1: ( ( ruleSERE ) )
            // InternalSequenceCS.g:4287:2: ( ruleSERE )
            {
            // InternalSequenceCS.g:4287:2: ( ruleSERE )
            // InternalSequenceCS.g:4288:3: ruleSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSEREAccess().getRightSEREParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSEREAccess().getRightSEREParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SERE__RightAssignment_1_1_2"


    // $ANTLR start "rule__SequenceTerminal__LiteralAssignment_0_2"
    // InternalSequenceCS.g:4297:1: rule__SequenceTerminal__LiteralAssignment_0_2 : ( ruleSequenceTerminal ) ;
    public final void rule__SequenceTerminal__LiteralAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4301:1: ( ( ruleSequenceTerminal ) )
            // InternalSequenceCS.g:4302:2: ( ruleSequenceTerminal )
            {
            // InternalSequenceCS.g:4302:2: ( ruleSequenceTerminal )
            // InternalSequenceCS.g:4303:3: ruleSequenceTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getLiteralSequenceTerminalParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getLiteralSequenceTerminalParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__LiteralAssignment_0_2"


    // $ANTLR start "rule__SequenceTerminal__LiteralAssignment_1_1_0"
    // InternalSequenceCS.g:4312:1: rule__SequenceTerminal__LiteralAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__SequenceTerminal__LiteralAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4316:1: ( ( ( 'true' ) ) )
            // InternalSequenceCS.g:4317:2: ( ( 'true' ) )
            {
            // InternalSequenceCS.g:4317:2: ( ( 'true' ) )
            // InternalSequenceCS.g:4318:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getLiteralTrueKeyword_1_1_0_0()); 
            }
            // InternalSequenceCS.g:4319:3: ( 'true' )
            // InternalSequenceCS.g:4320:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getLiteralTrueKeyword_1_1_0_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getLiteralTrueKeyword_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getLiteralTrueKeyword_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__LiteralAssignment_1_1_0"


    // $ANTLR start "rule__SequenceTerminal__ExpressionAssignment_2_2"
    // InternalSequenceCS.g:4331:1: rule__SequenceTerminal__ExpressionAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SequenceTerminal__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4335:1: ( ( RULE_STRING ) )
            // InternalSequenceCS.g:4336:2: ( RULE_STRING )
            {
            // InternalSequenceCS.g:4336:2: ( RULE_STRING )
            // InternalSequenceCS.g:4337:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceTerminalAccess().getExpressionSTRINGTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceTerminalAccess().getExpressionSTRINGTerminalRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTerminal__ExpressionAssignment_2_2"


    // $ANTLR start "rule__RepeatedSERE__ExpressionAssignment_0_1"
    // InternalSequenceCS.g:4346:1: rule__RepeatedSERE__ExpressionAssignment_0_1 : ( ruleSequenceTerminal ) ;
    public final void rule__RepeatedSERE__ExpressionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4350:1: ( ( ruleSequenceTerminal ) )
            // InternalSequenceCS.g:4351:2: ( ruleSequenceTerminal )
            {
            // InternalSequenceCS.g:4351:2: ( ruleSequenceTerminal )
            // InternalSequenceCS.g:4352:3: ruleSequenceTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__ExpressionAssignment_0_1"


    // $ANTLR start "rule__RepeatedSERE__CountAssignment_0_3"
    // InternalSequenceCS.g:4361:1: rule__RepeatedSERE__CountAssignment_0_3 : ( ruleCount ) ;
    public final void rule__RepeatedSERE__CountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4365:1: ( ( ruleCount ) )
            // InternalSequenceCS.g:4366:2: ( ruleCount )
            {
            // InternalSequenceCS.g:4366:2: ( ruleCount )
            // InternalSequenceCS.g:4367:3: ruleCount
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCount();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__CountAssignment_0_3"


    // $ANTLR start "rule__RepeatedSERE__ExpressionAssignment_1_1"
    // InternalSequenceCS.g:4376:1: rule__RepeatedSERE__ExpressionAssignment_1_1 : ( ruleBracedSERE ) ;
    public final void rule__RepeatedSERE__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4380:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4381:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4381:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4382:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__ExpressionAssignment_1_1"


    // $ANTLR start "rule__RepeatedSERE__CountAssignment_1_3"
    // InternalSequenceCS.g:4391:1: rule__RepeatedSERE__CountAssignment_1_3 : ( ruleCount ) ;
    public final void rule__RepeatedSERE__CountAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4395:1: ( ( ruleCount ) )
            // InternalSequenceCS.g:4396:2: ( ruleCount )
            {
            // InternalSequenceCS.g:4396:2: ( ruleCount )
            // InternalSequenceCS.g:4397:3: ruleCount
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCount();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__CountAssignment_1_3"


    // $ANTLR start "rule__RepeatedSERE__ExpressionAssignment_2_2"
    // InternalSequenceCS.g:4406:1: rule__RepeatedSERE__ExpressionAssignment_2_2 : ( ruleRepeatedSERE ) ;
    public final void rule__RepeatedSERE__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4410:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4411:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4411:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4412:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__ExpressionAssignment_2_2"


    // $ANTLR start "rule__RepeatedSERE__CountAssignment_2_5"
    // InternalSequenceCS.g:4421:1: rule__RepeatedSERE__CountAssignment_2_5 : ( ruleCount ) ;
    public final void rule__RepeatedSERE__CountAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4425:1: ( ( ruleCount ) )
            // InternalSequenceCS.g:4426:2: ( ruleCount )
            {
            // InternalSequenceCS.g:4426:2: ( ruleCount )
            // InternalSequenceCS.g:4427:3: ruleCount
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_2_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCount();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_2_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__CountAssignment_2_5"


    // $ANTLR start "rule__RepeatedSERE__ExpressionAssignment_3_1"
    // InternalSequenceCS.g:4436:1: rule__RepeatedSERE__ExpressionAssignment_3_1 : ( ruleSequenceTerminal ) ;
    public final void rule__RepeatedSERE__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4440:1: ( ( ruleSequenceTerminal ) )
            // InternalSequenceCS.g:4441:2: ( ruleSequenceTerminal )
            {
            // InternalSequenceCS.g:4441:2: ( ruleSequenceTerminal )
            // InternalSequenceCS.g:4442:3: ruleSequenceTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__ExpressionAssignment_3_1"


    // $ANTLR start "rule__RepeatedSERE__ExpressionAssignment_4_1"
    // InternalSequenceCS.g:4451:1: rule__RepeatedSERE__ExpressionAssignment_4_1 : ( ruleBracedSERE ) ;
    public final void rule__RepeatedSERE__ExpressionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4455:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4456:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4456:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4457:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__ExpressionAssignment_4_1"


    // $ANTLR start "rule__RepeatedSERE__ExpressionAssignment_5_2"
    // InternalSequenceCS.g:4466:1: rule__RepeatedSERE__ExpressionAssignment_5_2 : ( ruleRepeatedSERE ) ;
    public final void rule__RepeatedSERE__ExpressionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4470:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4471:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4471:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4472:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__ExpressionAssignment_5_2"


    // $ANTLR start "rule__RepeatedSERE__ExpressionAssignment_6_1"
    // InternalSequenceCS.g:4481:1: rule__RepeatedSERE__ExpressionAssignment_6_1 : ( ruleSequenceTerminal ) ;
    public final void rule__RepeatedSERE__ExpressionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4485:1: ( ( ruleSequenceTerminal ) )
            // InternalSequenceCS.g:4486:2: ( ruleSequenceTerminal )
            {
            // InternalSequenceCS.g:4486:2: ( ruleSequenceTerminal )
            // InternalSequenceCS.g:4487:3: ruleSequenceTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__ExpressionAssignment_6_1"


    // $ANTLR start "rule__RepeatedSERE__CountAssignment_6_3"
    // InternalSequenceCS.g:4496:1: rule__RepeatedSERE__CountAssignment_6_3 : ( ruleCount ) ;
    public final void rule__RepeatedSERE__CountAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4500:1: ( ( ruleCount ) )
            // InternalSequenceCS.g:4501:2: ( ruleCount )
            {
            // InternalSequenceCS.g:4501:2: ( ruleCount )
            // InternalSequenceCS.g:4502:3: ruleCount
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_6_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCount();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__CountAssignment_6_3"


    // $ANTLR start "rule__RepeatedSERE__ExpressionAssignment_7_1"
    // InternalSequenceCS.g:4511:1: rule__RepeatedSERE__ExpressionAssignment_7_1 : ( ruleSequenceTerminal ) ;
    public final void rule__RepeatedSERE__ExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4515:1: ( ( ruleSequenceTerminal ) )
            // InternalSequenceCS.g:4516:2: ( ruleSequenceTerminal )
            {
            // InternalSequenceCS.g:4516:2: ( ruleSequenceTerminal )
            // InternalSequenceCS.g:4517:3: ruleSequenceTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__ExpressionAssignment_7_1"


    // $ANTLR start "rule__RepeatedSERE__CountAssignment_7_3"
    // InternalSequenceCS.g:4526:1: rule__RepeatedSERE__CountAssignment_7_3 : ( ruleCount ) ;
    public final void rule__RepeatedSERE__CountAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4530:1: ( ( ruleCount ) )
            // InternalSequenceCS.g:4531:2: ( ruleCount )
            {
            // InternalSequenceCS.g:4531:2: ( ruleCount )
            // InternalSequenceCS.g:4532:3: ruleCount
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_7_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCount();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_7_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__CountAssignment_7_3"


    // $ANTLR start "rule__RepeatedSERE__CountAssignment_8_3"
    // InternalSequenceCS.g:4541:1: rule__RepeatedSERE__CountAssignment_8_3 : ( ruleCount ) ;
    public final void rule__RepeatedSERE__CountAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4545:1: ( ( ruleCount ) )
            // InternalSequenceCS.g:4546:2: ( ruleCount )
            {
            // InternalSequenceCS.g:4546:2: ( ruleCount )
            // InternalSequenceCS.g:4547:3: ruleCount
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_8_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCount();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_8_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatedSERE__CountAssignment_8_3"


    // $ANTLR start "rule__BracedSERE__ExpressionAssignment_1"
    // InternalSequenceCS.g:4556:1: rule__BracedSERE__ExpressionAssignment_1 : ( ruleSERE ) ;
    public final void rule__BracedSERE__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4560:1: ( ( ruleSERE ) )
            // InternalSequenceCS.g:4561:2: ( ruleSERE )
            {
            // InternalSequenceCS.g:4561:2: ( ruleSERE )
            // InternalSequenceCS.g:4562:3: ruleSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracedSEREAccess().getExpressionSEREParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracedSEREAccess().getExpressionSEREParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracedSERE__ExpressionAssignment_1"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_0_1_0"
    // InternalSequenceCS.g:4571:1: rule__BinaryCompoundSERE__LeftAssignment_0_1_0 : ( ruleRepeatedSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4575:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4576:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4576:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4577:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_0_1_0"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_0_1_1"
    // InternalSequenceCS.g:4586:1: rule__BinaryCompoundSERE__LeftAssignment_0_1_1 : ( ruleBracedSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4590:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4591:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4591:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4592:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_0_1_1"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1"
    // InternalSequenceCS.g:4601:1: rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1 : ( ruleBinaryCompoundSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4605:1: ( ( ruleBinaryCompoundSERE ) )
            // InternalSequenceCS.g:4606:2: ( ruleBinaryCompoundSERE )
            {
            // InternalSequenceCS.g:4606:2: ( ruleBinaryCompoundSERE )
            // InternalSequenceCS.g:4607:3: ruleBinaryCompoundSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_0_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_0_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_0_1_2_1"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_0_3_0"
    // InternalSequenceCS.g:4616:1: rule__BinaryCompoundSERE__RightAssignment_0_3_0 : ( ruleRepeatedSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4620:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4621:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4621:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4622:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_0_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_0_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_0_3_0"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_0_3_1"
    // InternalSequenceCS.g:4631:1: rule__BinaryCompoundSERE__RightAssignment_0_3_1 : ( ruleBracedSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4635:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4636:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4636:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4637:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_0_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_0_3_1"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_0_3_2_1"
    // InternalSequenceCS.g:4646:1: rule__BinaryCompoundSERE__RightAssignment_0_3_2_1 : ( ruleBinaryCompoundSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_0_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4650:1: ( ( ruleBinaryCompoundSERE ) )
            // InternalSequenceCS.g:4651:2: ( ruleBinaryCompoundSERE )
            {
            // InternalSequenceCS.g:4651:2: ( ruleBinaryCompoundSERE )
            // InternalSequenceCS.g:4652:3: ruleBinaryCompoundSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_0_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_0_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_0_3_2_1"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_1_1_0"
    // InternalSequenceCS.g:4661:1: rule__BinaryCompoundSERE__LeftAssignment_1_1_0 : ( ruleRepeatedSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4665:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4666:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4666:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4667:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_1_1_0"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_1_1_1"
    // InternalSequenceCS.g:4676:1: rule__BinaryCompoundSERE__LeftAssignment_1_1_1 : ( ruleBracedSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4680:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4681:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4681:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4682:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_1_1_1"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1"
    // InternalSequenceCS.g:4691:1: rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1 : ( ruleBinaryCompoundSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4695:1: ( ( ruleBinaryCompoundSERE ) )
            // InternalSequenceCS.g:4696:2: ( ruleBinaryCompoundSERE )
            {
            // InternalSequenceCS.g:4696:2: ( ruleBinaryCompoundSERE )
            // InternalSequenceCS.g:4697:3: ruleBinaryCompoundSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_1_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_1_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_1_1_2_1"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_1_3_0"
    // InternalSequenceCS.g:4706:1: rule__BinaryCompoundSERE__RightAssignment_1_3_0 : ( ruleRepeatedSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4710:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4711:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4711:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4712:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_1_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_1_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_1_3_0"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_1_3_1"
    // InternalSequenceCS.g:4721:1: rule__BinaryCompoundSERE__RightAssignment_1_3_1 : ( ruleBracedSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4725:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4726:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4726:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4727:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_1_3_1"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_1_3_2_1"
    // InternalSequenceCS.g:4736:1: rule__BinaryCompoundSERE__RightAssignment_1_3_2_1 : ( ruleBinaryCompoundSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4740:1: ( ( ruleBinaryCompoundSERE ) )
            // InternalSequenceCS.g:4741:2: ( ruleBinaryCompoundSERE )
            {
            // InternalSequenceCS.g:4741:2: ( ruleBinaryCompoundSERE )
            // InternalSequenceCS.g:4742:3: ruleBinaryCompoundSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_1_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_1_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_1_3_2_1"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_2_1_0"
    // InternalSequenceCS.g:4751:1: rule__BinaryCompoundSERE__LeftAssignment_2_1_0 : ( ruleRepeatedSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4755:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4756:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4756:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4757:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_2_1_0"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_2_1_1"
    // InternalSequenceCS.g:4766:1: rule__BinaryCompoundSERE__LeftAssignment_2_1_1 : ( ruleBracedSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4770:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4771:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4771:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4772:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_2_1_1"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1"
    // InternalSequenceCS.g:4781:1: rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1 : ( ruleBinaryCompoundSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4785:1: ( ( ruleBinaryCompoundSERE ) )
            // InternalSequenceCS.g:4786:2: ( ruleBinaryCompoundSERE )
            {
            // InternalSequenceCS.g:4786:2: ( ruleBinaryCompoundSERE )
            // InternalSequenceCS.g:4787:3: ruleBinaryCompoundSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_2_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_2_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_2_1_2_1"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_2_3_0"
    // InternalSequenceCS.g:4796:1: rule__BinaryCompoundSERE__RightAssignment_2_3_0 : ( ruleRepeatedSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4800:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4801:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4801:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4802:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_2_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_2_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_2_3_0"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_2_3_1"
    // InternalSequenceCS.g:4811:1: rule__BinaryCompoundSERE__RightAssignment_2_3_1 : ( ruleBracedSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4815:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4816:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4816:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4817:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_2_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_2_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_2_3_1"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_2_3_2_1"
    // InternalSequenceCS.g:4826:1: rule__BinaryCompoundSERE__RightAssignment_2_3_2_1 : ( ruleBinaryCompoundSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4830:1: ( ( ruleBinaryCompoundSERE ) )
            // InternalSequenceCS.g:4831:2: ( ruleBinaryCompoundSERE )
            {
            // InternalSequenceCS.g:4831:2: ( ruleBinaryCompoundSERE )
            // InternalSequenceCS.g:4832:3: ruleBinaryCompoundSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_2_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_2_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_2_3_2_1"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_3_1_0"
    // InternalSequenceCS.g:4841:1: rule__BinaryCompoundSERE__LeftAssignment_3_1_0 : ( ruleRepeatedSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4845:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4846:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4846:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4847:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_3_1_0"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_3_1_1"
    // InternalSequenceCS.g:4856:1: rule__BinaryCompoundSERE__LeftAssignment_3_1_1 : ( ruleBracedSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4860:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4861:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4861:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4862:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_3_1_1"


    // $ANTLR start "rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1"
    // InternalSequenceCS.g:4871:1: rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1 : ( ruleBinaryCompoundSERE ) ;
    public final void rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4875:1: ( ( ruleBinaryCompoundSERE ) )
            // InternalSequenceCS.g:4876:2: ( ruleBinaryCompoundSERE )
            {
            // InternalSequenceCS.g:4876:2: ( ruleBinaryCompoundSERE )
            // InternalSequenceCS.g:4877:3: ruleBinaryCompoundSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_3_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_3_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__LeftAssignment_3_1_2_1"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_3_3_0"
    // InternalSequenceCS.g:4886:1: rule__BinaryCompoundSERE__RightAssignment_3_3_0 : ( ruleRepeatedSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4890:1: ( ( ruleRepeatedSERE ) )
            // InternalSequenceCS.g:4891:2: ( ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:4891:2: ( ruleRepeatedSERE )
            // InternalSequenceCS.g:4892:3: ruleRepeatedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_3_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_3_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_3_3_0"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_3_3_1"
    // InternalSequenceCS.g:4901:1: rule__BinaryCompoundSERE__RightAssignment_3_3_1 : ( ruleBracedSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4905:1: ( ( ruleBracedSERE ) )
            // InternalSequenceCS.g:4906:2: ( ruleBracedSERE )
            {
            // InternalSequenceCS.g:4906:2: ( ruleBracedSERE )
            // InternalSequenceCS.g:4907:3: ruleBracedSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_3_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBracedSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_3_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_3_3_1"


    // $ANTLR start "rule__BinaryCompoundSERE__RightAssignment_3_3_2_1"
    // InternalSequenceCS.g:4916:1: rule__BinaryCompoundSERE__RightAssignment_3_3_2_1 : ( ruleBinaryCompoundSERE ) ;
    public final void rule__BinaryCompoundSERE__RightAssignment_3_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4920:1: ( ( ruleBinaryCompoundSERE ) )
            // InternalSequenceCS.g:4921:2: ( ruleBinaryCompoundSERE )
            {
            // InternalSequenceCS.g:4921:2: ( ruleBinaryCompoundSERE )
            // InternalSequenceCS.g:4922:3: ruleBinaryCompoundSERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_3_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_3_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCompoundSERE__RightAssignment_3_3_2_1"


    // $ANTLR start "rule__Count__COUNTAssignment_0"
    // InternalSequenceCS.g:4931:1: rule__Count__COUNTAssignment_0 : ( ruleNUMBER ) ;
    public final void rule__Count__COUNTAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4935:1: ( ( ruleNUMBER ) )
            // InternalSequenceCS.g:4936:2: ( ruleNUMBER )
            {
            // InternalSequenceCS.g:4936:2: ( ruleNUMBER )
            // InternalSequenceCS.g:4937:3: ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountAccess().getCOUNTNUMBERParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountAccess().getCOUNTNUMBERParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__COUNTAssignment_0"


    // $ANTLR start "rule__Range__LOWER_BOUNDAssignment_0"
    // InternalSequenceCS.g:4946:1: rule__Range__LOWER_BOUNDAssignment_0 : ( ruleNUMBER ) ;
    public final void rule__Range__LOWER_BOUNDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4950:1: ( ( ruleNUMBER ) )
            // InternalSequenceCS.g:4951:2: ( ruleNUMBER )
            {
            // InternalSequenceCS.g:4951:2: ( ruleNUMBER )
            // InternalSequenceCS.g:4952:3: ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getLOWER_BOUNDNUMBERParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getLOWER_BOUNDNUMBERParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__LOWER_BOUNDAssignment_0"


    // $ANTLR start "rule__Range__HIGHER_BOUNDAssignment_2"
    // InternalSequenceCS.g:4961:1: rule__Range__HIGHER_BOUNDAssignment_2 : ( ruleNUMBER ) ;
    public final void rule__Range__HIGHER_BOUNDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequenceCS.g:4965:1: ( ( ruleNUMBER ) )
            // InternalSequenceCS.g:4966:2: ( ruleNUMBER )
            {
            // InternalSequenceCS.g:4966:2: ( ruleNUMBER )
            // InternalSequenceCS.g:4967:3: ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getHIGHER_BOUNDNUMBERParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getHIGHER_BOUNDNUMBERParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__HIGHER_BOUNDAssignment_2"

    // $ANTLR start synpred2_InternalSequenceCS
    public final void synpred2_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:354:2: ( ( ruleSequenceTerminal ) )
        // InternalSequenceCS.g:354:2: ( ruleSequenceTerminal )
        {
        // InternalSequenceCS.g:354:2: ( ruleSequenceTerminal )
        // InternalSequenceCS.g:355:3: ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSimpleSEREAccess().getSequenceTerminalParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSequenceCS

    // $ANTLR start synpred3_InternalSequenceCS
    public final void synpred3_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:360:2: ( ( ruleSequence ) )
        // InternalSequenceCS.g:360:2: ( ruleSequence )
        {
        // InternalSequenceCS.g:360:2: ( ruleSequence )
        // InternalSequenceCS.g:361:3: ruleSequence
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSimpleSEREAccess().getSequenceParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleSequence();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSequenceCS

    // $ANTLR start synpred7_InternalSequenceCS
    public final void synpred7_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:429:2: ( ( ruleBracedSERE ) )
        // InternalSequenceCS.g:429:2: ( ruleBracedSERE )
        {
        // InternalSequenceCS.g:429:2: ( ruleBracedSERE )
        // InternalSequenceCS.g:430:3: ruleBracedSERE
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSequenceAccess().getBracedSEREParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalSequenceCS

    // $ANTLR start synpred8_InternalSequenceCS
    public final void synpred8_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:450:2: ( ( ( rule__RepeatedSERE__Group_0__0 ) ) )
        // InternalSequenceCS.g:450:2: ( ( rule__RepeatedSERE__Group_0__0 ) )
        {
        // InternalSequenceCS.g:450:2: ( ( rule__RepeatedSERE__Group_0__0 ) )
        // InternalSequenceCS.g:451:3: ( rule__RepeatedSERE__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRepeatedSEREAccess().getGroup_0()); 
        }
        // InternalSequenceCS.g:452:3: ( rule__RepeatedSERE__Group_0__0 )
        // InternalSequenceCS.g:452:4: rule__RepeatedSERE__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__RepeatedSERE__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalSequenceCS

    // $ANTLR start synpred9_InternalSequenceCS
    public final void synpred9_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:456:2: ( ( ( rule__RepeatedSERE__Group_1__0 ) ) )
        // InternalSequenceCS.g:456:2: ( ( rule__RepeatedSERE__Group_1__0 ) )
        {
        // InternalSequenceCS.g:456:2: ( ( rule__RepeatedSERE__Group_1__0 ) )
        // InternalSequenceCS.g:457:3: ( rule__RepeatedSERE__Group_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRepeatedSEREAccess().getGroup_1()); 
        }
        // InternalSequenceCS.g:458:3: ( rule__RepeatedSERE__Group_1__0 )
        // InternalSequenceCS.g:458:4: rule__RepeatedSERE__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__RepeatedSERE__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalSequenceCS

    // $ANTLR start synpred10_InternalSequenceCS
    public final void synpred10_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:462:2: ( ( ( rule__RepeatedSERE__Group_2__0 ) ) )
        // InternalSequenceCS.g:462:2: ( ( rule__RepeatedSERE__Group_2__0 ) )
        {
        // InternalSequenceCS.g:462:2: ( ( rule__RepeatedSERE__Group_2__0 ) )
        // InternalSequenceCS.g:463:3: ( rule__RepeatedSERE__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRepeatedSEREAccess().getGroup_2()); 
        }
        // InternalSequenceCS.g:464:3: ( rule__RepeatedSERE__Group_2__0 )
        // InternalSequenceCS.g:464:4: rule__RepeatedSERE__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__RepeatedSERE__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalSequenceCS

    // $ANTLR start synpred11_InternalSequenceCS
    public final void synpred11_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:468:2: ( ( ( rule__RepeatedSERE__Group_3__0 ) ) )
        // InternalSequenceCS.g:468:2: ( ( rule__RepeatedSERE__Group_3__0 ) )
        {
        // InternalSequenceCS.g:468:2: ( ( rule__RepeatedSERE__Group_3__0 ) )
        // InternalSequenceCS.g:469:3: ( rule__RepeatedSERE__Group_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRepeatedSEREAccess().getGroup_3()); 
        }
        // InternalSequenceCS.g:470:3: ( rule__RepeatedSERE__Group_3__0 )
        // InternalSequenceCS.g:470:4: rule__RepeatedSERE__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__RepeatedSERE__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalSequenceCS

    // $ANTLR start synpred12_InternalSequenceCS
    public final void synpred12_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:474:2: ( ( ( rule__RepeatedSERE__Group_4__0 ) ) )
        // InternalSequenceCS.g:474:2: ( ( rule__RepeatedSERE__Group_4__0 ) )
        {
        // InternalSequenceCS.g:474:2: ( ( rule__RepeatedSERE__Group_4__0 ) )
        // InternalSequenceCS.g:475:3: ( rule__RepeatedSERE__Group_4__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRepeatedSEREAccess().getGroup_4()); 
        }
        // InternalSequenceCS.g:476:3: ( rule__RepeatedSERE__Group_4__0 )
        // InternalSequenceCS.g:476:4: rule__RepeatedSERE__Group_4__0
        {
        pushFollow(FOLLOW_2);
        rule__RepeatedSERE__Group_4__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalSequenceCS

    // $ANTLR start synpred13_InternalSequenceCS
    public final void synpred13_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:480:2: ( ( ( rule__RepeatedSERE__Group_5__0 ) ) )
        // InternalSequenceCS.g:480:2: ( ( rule__RepeatedSERE__Group_5__0 ) )
        {
        // InternalSequenceCS.g:480:2: ( ( rule__RepeatedSERE__Group_5__0 ) )
        // InternalSequenceCS.g:481:3: ( rule__RepeatedSERE__Group_5__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRepeatedSEREAccess().getGroup_5()); 
        }
        // InternalSequenceCS.g:482:3: ( rule__RepeatedSERE__Group_5__0 )
        // InternalSequenceCS.g:482:4: rule__RepeatedSERE__Group_5__0
        {
        pushFollow(FOLLOW_2);
        rule__RepeatedSERE__Group_5__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalSequenceCS

    // $ANTLR start synpred14_InternalSequenceCS
    public final void synpred14_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:486:2: ( ( ( rule__RepeatedSERE__Group_6__0 ) ) )
        // InternalSequenceCS.g:486:2: ( ( rule__RepeatedSERE__Group_6__0 ) )
        {
        // InternalSequenceCS.g:486:2: ( ( rule__RepeatedSERE__Group_6__0 ) )
        // InternalSequenceCS.g:487:3: ( rule__RepeatedSERE__Group_6__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRepeatedSEREAccess().getGroup_6()); 
        }
        // InternalSequenceCS.g:488:3: ( rule__RepeatedSERE__Group_6__0 )
        // InternalSequenceCS.g:488:4: rule__RepeatedSERE__Group_6__0
        {
        pushFollow(FOLLOW_2);
        rule__RepeatedSERE__Group_6__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSequenceCS

    // $ANTLR start synpred15_InternalSequenceCS
    public final void synpred15_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:492:2: ( ( ( rule__RepeatedSERE__Group_7__0 ) ) )
        // InternalSequenceCS.g:492:2: ( ( rule__RepeatedSERE__Group_7__0 ) )
        {
        // InternalSequenceCS.g:492:2: ( ( rule__RepeatedSERE__Group_7__0 ) )
        // InternalSequenceCS.g:493:3: ( rule__RepeatedSERE__Group_7__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRepeatedSEREAccess().getGroup_7()); 
        }
        // InternalSequenceCS.g:494:3: ( rule__RepeatedSERE__Group_7__0 )
        // InternalSequenceCS.g:494:4: rule__RepeatedSERE__Group_7__0
        {
        pushFollow(FOLLOW_2);
        rule__RepeatedSERE__Group_7__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalSequenceCS

    // $ANTLR start synpred16_InternalSequenceCS
    public final void synpred16_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:498:2: ( ( ( rule__RepeatedSERE__Group_8__0 ) ) )
        // InternalSequenceCS.g:498:2: ( ( rule__RepeatedSERE__Group_8__0 ) )
        {
        // InternalSequenceCS.g:498:2: ( ( rule__RepeatedSERE__Group_8__0 ) )
        // InternalSequenceCS.g:499:3: ( rule__RepeatedSERE__Group_8__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRepeatedSEREAccess().getGroup_8()); 
        }
        // InternalSequenceCS.g:500:3: ( rule__RepeatedSERE__Group_8__0 )
        // InternalSequenceCS.g:500:4: rule__RepeatedSERE__Group_8__0
        {
        pushFollow(FOLLOW_2);
        rule__RepeatedSERE__Group_8__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalSequenceCS

    // $ANTLR start synpred17_InternalSequenceCS
    public final void synpred17_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:519:2: ( ( ruleRepeatedSERE ) )
        // InternalSequenceCS.g:519:2: ( ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:519:2: ( ruleRepeatedSERE )
        // InternalSequenceCS.g:520:3: ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompoundSEREAccess().getRepeatedSEREParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalSequenceCS

    // $ANTLR start synpred18_InternalSequenceCS
    public final void synpred18_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:525:2: ( ( ruleBracedSERE ) )
        // InternalSequenceCS.g:525:2: ( ruleBracedSERE )
        {
        // InternalSequenceCS.g:525:2: ( ruleBracedSERE )
        // InternalSequenceCS.g:526:3: ruleBracedSERE
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompoundSEREAccess().getBracedSEREParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalSequenceCS

    // $ANTLR start synpred19_InternalSequenceCS
    public final void synpred19_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:546:2: ( ( ( rule__BinaryCompoundSERE__Group_0__0 ) ) )
        // InternalSequenceCS.g:546:2: ( ( rule__BinaryCompoundSERE__Group_0__0 ) )
        {
        // InternalSequenceCS.g:546:2: ( ( rule__BinaryCompoundSERE__Group_0__0 ) )
        // InternalSequenceCS.g:547:3: ( rule__BinaryCompoundSERE__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_0()); 
        }
        // InternalSequenceCS.g:548:3: ( rule__BinaryCompoundSERE__Group_0__0 )
        // InternalSequenceCS.g:548:4: rule__BinaryCompoundSERE__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalSequenceCS

    // $ANTLR start synpred20_InternalSequenceCS
    public final void synpred20_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:552:2: ( ( ( rule__BinaryCompoundSERE__Group_1__0 ) ) )
        // InternalSequenceCS.g:552:2: ( ( rule__BinaryCompoundSERE__Group_1__0 ) )
        {
        // InternalSequenceCS.g:552:2: ( ( rule__BinaryCompoundSERE__Group_1__0 ) )
        // InternalSequenceCS.g:553:3: ( rule__BinaryCompoundSERE__Group_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_1()); 
        }
        // InternalSequenceCS.g:554:3: ( rule__BinaryCompoundSERE__Group_1__0 )
        // InternalSequenceCS.g:554:4: rule__BinaryCompoundSERE__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSequenceCS

    // $ANTLR start synpred21_InternalSequenceCS
    public final void synpred21_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:558:2: ( ( ( rule__BinaryCompoundSERE__Group_2__0 ) ) )
        // InternalSequenceCS.g:558:2: ( ( rule__BinaryCompoundSERE__Group_2__0 ) )
        {
        // InternalSequenceCS.g:558:2: ( ( rule__BinaryCompoundSERE__Group_2__0 ) )
        // InternalSequenceCS.g:559:3: ( rule__BinaryCompoundSERE__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getGroup_2()); 
        }
        // InternalSequenceCS.g:560:3: ( rule__BinaryCompoundSERE__Group_2__0 )
        // InternalSequenceCS.g:560:4: rule__BinaryCompoundSERE__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalSequenceCS

    // $ANTLR start synpred22_InternalSequenceCS
    public final void synpred22_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:579:2: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 ) ) )
        // InternalSequenceCS.g:579:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 ) )
        {
        // InternalSequenceCS.g:579:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 ) )
        // InternalSequenceCS.g:580:3: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_0_1_0()); 
        }
        // InternalSequenceCS.g:581:3: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 )
        // InternalSequenceCS.g:581:4: rule__BinaryCompoundSERE__LeftAssignment_0_1_0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__LeftAssignment_0_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalSequenceCS

    // $ANTLR start synpred23_InternalSequenceCS
    public final void synpred23_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:585:2: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 ) ) )
        // InternalSequenceCS.g:585:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 ) )
        {
        // InternalSequenceCS.g:585:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 ) )
        // InternalSequenceCS.g:586:3: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_0_1_1()); 
        }
        // InternalSequenceCS.g:587:3: ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 )
        // InternalSequenceCS.g:587:4: rule__BinaryCompoundSERE__LeftAssignment_0_1_1
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__LeftAssignment_0_1_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalSequenceCS

    // $ANTLR start synpred24_InternalSequenceCS
    public final void synpred24_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:606:2: ( ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 ) ) )
        // InternalSequenceCS.g:606:2: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 ) )
        {
        // InternalSequenceCS.g:606:2: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 ) )
        // InternalSequenceCS.g:607:3: ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_0_3_0()); 
        }
        // InternalSequenceCS.g:608:3: ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 )
        // InternalSequenceCS.g:608:4: rule__BinaryCompoundSERE__RightAssignment_0_3_0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__RightAssignment_0_3_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalSequenceCS

    // $ANTLR start synpred25_InternalSequenceCS
    public final void synpred25_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:612:2: ( ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 ) ) )
        // InternalSequenceCS.g:612:2: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 ) )
        {
        // InternalSequenceCS.g:612:2: ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 ) )
        // InternalSequenceCS.g:613:3: ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_0_3_1()); 
        }
        // InternalSequenceCS.g:614:3: ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 )
        // InternalSequenceCS.g:614:4: rule__BinaryCompoundSERE__RightAssignment_0_3_1
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__RightAssignment_0_3_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalSequenceCS

    // $ANTLR start synpred26_InternalSequenceCS
    public final void synpred26_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:633:2: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 ) ) )
        // InternalSequenceCS.g:633:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 ) )
        {
        // InternalSequenceCS.g:633:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 ) )
        // InternalSequenceCS.g:634:3: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_1_1_0()); 
        }
        // InternalSequenceCS.g:635:3: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 )
        // InternalSequenceCS.g:635:4: rule__BinaryCompoundSERE__LeftAssignment_1_1_0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__LeftAssignment_1_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalSequenceCS

    // $ANTLR start synpred27_InternalSequenceCS
    public final void synpred27_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:639:2: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 ) ) )
        // InternalSequenceCS.g:639:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 ) )
        {
        // InternalSequenceCS.g:639:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 ) )
        // InternalSequenceCS.g:640:3: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_1_1_1()); 
        }
        // InternalSequenceCS.g:641:3: ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 )
        // InternalSequenceCS.g:641:4: rule__BinaryCompoundSERE__LeftAssignment_1_1_1
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__LeftAssignment_1_1_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalSequenceCS

    // $ANTLR start synpred28_InternalSequenceCS
    public final void synpred28_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:660:2: ( ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 ) ) )
        // InternalSequenceCS.g:660:2: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 ) )
        {
        // InternalSequenceCS.g:660:2: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 ) )
        // InternalSequenceCS.g:661:3: ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_1_3_0()); 
        }
        // InternalSequenceCS.g:662:3: ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 )
        // InternalSequenceCS.g:662:4: rule__BinaryCompoundSERE__RightAssignment_1_3_0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__RightAssignment_1_3_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalSequenceCS

    // $ANTLR start synpred29_InternalSequenceCS
    public final void synpred29_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:666:2: ( ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 ) ) )
        // InternalSequenceCS.g:666:2: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 ) )
        {
        // InternalSequenceCS.g:666:2: ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 ) )
        // InternalSequenceCS.g:667:3: ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_1_3_1()); 
        }
        // InternalSequenceCS.g:668:3: ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 )
        // InternalSequenceCS.g:668:4: rule__BinaryCompoundSERE__RightAssignment_1_3_1
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__RightAssignment_1_3_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalSequenceCS

    // $ANTLR start synpred30_InternalSequenceCS
    public final void synpred30_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:687:2: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 ) ) )
        // InternalSequenceCS.g:687:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 ) )
        {
        // InternalSequenceCS.g:687:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 ) )
        // InternalSequenceCS.g:688:3: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_2_1_0()); 
        }
        // InternalSequenceCS.g:689:3: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 )
        // InternalSequenceCS.g:689:4: rule__BinaryCompoundSERE__LeftAssignment_2_1_0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__LeftAssignment_2_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred30_InternalSequenceCS

    // $ANTLR start synpred31_InternalSequenceCS
    public final void synpred31_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:693:2: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 ) ) )
        // InternalSequenceCS.g:693:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 ) )
        {
        // InternalSequenceCS.g:693:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 ) )
        // InternalSequenceCS.g:694:3: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_2_1_1()); 
        }
        // InternalSequenceCS.g:695:3: ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 )
        // InternalSequenceCS.g:695:4: rule__BinaryCompoundSERE__LeftAssignment_2_1_1
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__LeftAssignment_2_1_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred31_InternalSequenceCS

    // $ANTLR start synpred32_InternalSequenceCS
    public final void synpred32_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:714:2: ( ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 ) ) )
        // InternalSequenceCS.g:714:2: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 ) )
        {
        // InternalSequenceCS.g:714:2: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 ) )
        // InternalSequenceCS.g:715:3: ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_2_3_0()); 
        }
        // InternalSequenceCS.g:716:3: ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 )
        // InternalSequenceCS.g:716:4: rule__BinaryCompoundSERE__RightAssignment_2_3_0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__RightAssignment_2_3_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred32_InternalSequenceCS

    // $ANTLR start synpred33_InternalSequenceCS
    public final void synpred33_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:720:2: ( ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 ) ) )
        // InternalSequenceCS.g:720:2: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 ) )
        {
        // InternalSequenceCS.g:720:2: ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 ) )
        // InternalSequenceCS.g:721:3: ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_2_3_1()); 
        }
        // InternalSequenceCS.g:722:3: ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 )
        // InternalSequenceCS.g:722:4: rule__BinaryCompoundSERE__RightAssignment_2_3_1
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__RightAssignment_2_3_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33_InternalSequenceCS

    // $ANTLR start synpred34_InternalSequenceCS
    public final void synpred34_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:741:2: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 ) ) )
        // InternalSequenceCS.g:741:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 ) )
        {
        // InternalSequenceCS.g:741:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 ) )
        // InternalSequenceCS.g:742:3: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_3_1_0()); 
        }
        // InternalSequenceCS.g:743:3: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 )
        // InternalSequenceCS.g:743:4: rule__BinaryCompoundSERE__LeftAssignment_3_1_0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__LeftAssignment_3_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred34_InternalSequenceCS

    // $ANTLR start synpred35_InternalSequenceCS
    public final void synpred35_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:747:2: ( ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 ) ) )
        // InternalSequenceCS.g:747:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 ) )
        {
        // InternalSequenceCS.g:747:2: ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 ) )
        // InternalSequenceCS.g:748:3: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getLeftAssignment_3_1_1()); 
        }
        // InternalSequenceCS.g:749:3: ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 )
        // InternalSequenceCS.g:749:4: rule__BinaryCompoundSERE__LeftAssignment_3_1_1
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__LeftAssignment_3_1_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35_InternalSequenceCS

    // $ANTLR start synpred36_InternalSequenceCS
    public final void synpred36_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:768:2: ( ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 ) ) )
        // InternalSequenceCS.g:768:2: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 ) )
        {
        // InternalSequenceCS.g:768:2: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 ) )
        // InternalSequenceCS.g:769:3: ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_3_3_0()); 
        }
        // InternalSequenceCS.g:770:3: ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 )
        // InternalSequenceCS.g:770:4: rule__BinaryCompoundSERE__RightAssignment_3_3_0
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__RightAssignment_3_3_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalSequenceCS

    // $ANTLR start synpred37_InternalSequenceCS
    public final void synpred37_InternalSequenceCS_fragment() throws RecognitionException {   
        // InternalSequenceCS.g:774:2: ( ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 ) ) )
        // InternalSequenceCS.g:774:2: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 ) )
        {
        // InternalSequenceCS.g:774:2: ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 ) )
        // InternalSequenceCS.g:775:3: ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryCompoundSEREAccess().getRightAssignment_3_3_1()); 
        }
        // InternalSequenceCS.g:776:3: ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 )
        // InternalSequenceCS.g:776:4: rule__BinaryCompoundSERE__RightAssignment_3_3_1
        {
        pushFollow(FOLLOW_2);
        rule__BinaryCompoundSERE__RightAssignment_3_3_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred37_InternalSequenceCS

    // Delegated rules

    public final boolean synpred16_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\13\7\0\3\uffff";
    static final String dfa_3s = "\1\36\7\0\3\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\2\uffff\1\1\1\4\1\uffff\1\7\1\uffff\1\6\4\uffff\1\5\5\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "349:1: rule__SimpleSERE__Alternatives : ( ( ruleSequenceTerminal ) | ( ruleSequence ) | ( ruleCompoundSERE ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred3_InternalSequenceCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred3_InternalSequenceCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred3_InternalSequenceCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred3_InternalSequenceCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSequenceCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSequenceCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSequenceCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\1\13\7\0\12\uffff";
    static final String dfa_9s = "\1\36\7\0\12\uffff";
    static final String dfa_10s = "\10\uffff\1\1\1\4\1\7\1\10\1\2\1\5\1\3\1\6\1\11\1\12";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\3\2\uffff\1\1\1\4\1\uffff\1\7\1\uffff\1\6\4\uffff\1\5\5\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "445:1: rule__RepeatedSERE__Alternatives : ( ( ( rule__RepeatedSERE__Group_0__0 ) ) | ( ( rule__RepeatedSERE__Group_1__0 ) ) | ( ( rule__RepeatedSERE__Group_2__0 ) ) | ( ( rule__RepeatedSERE__Group_3__0 ) ) | ( ( rule__RepeatedSERE__Group_4__0 ) ) | ( ( rule__RepeatedSERE__Group_5__0 ) ) | ( ( rule__RepeatedSERE__Group_6__0 ) ) | ( ( rule__RepeatedSERE__Group_7__0 ) ) | ( ( rule__RepeatedSERE__Group_8__0 ) ) | ( ( rule__RepeatedSERE__Group_9__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred11_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred14_InternalSequenceCS()) ) {s = 10;}

                        else if ( (synpred15_InternalSequenceCS()) ) {s = 11;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred11_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred14_InternalSequenceCS()) ) {s = 10;}

                        else if ( (synpred15_InternalSequenceCS()) ) {s = 11;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred11_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred14_InternalSequenceCS()) ) {s = 10;}

                        else if ( (synpred15_InternalSequenceCS()) ) {s = 11;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred11_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred14_InternalSequenceCS()) ) {s = 10;}

                        else if ( (synpred15_InternalSequenceCS()) ) {s = 11;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSequenceCS()) ) {s = 12;}

                        else if ( (synpred12_InternalSequenceCS()) ) {s = 13;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalSequenceCS()) ) {s = 14;}

                        else if ( (synpred13_InternalSequenceCS()) ) {s = 15;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSequenceCS()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\10\uffff\1\1\1\3\1\2";
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_13;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "514:1: rule__CompoundSERE__Alternatives : ( ( ruleRepeatedSERE ) | ( ruleBracedSERE ) | ( ruleBinaryCompoundSERE ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred18_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\14\uffff";
    static final String dfa_15s = "\1\13\7\0\4\uffff";
    static final String dfa_16s = "\1\36\7\0\4\uffff";
    static final String dfa_17s = "\10\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\4\uffff}>";
    static final String[] dfa_19s = {
            "\1\3\2\uffff\1\1\1\4\1\uffff\1\7\1\uffff\1\6\4\uffff\1\5\5\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "541:1: rule__BinaryCompoundSERE__Alternatives : ( ( ( rule__BinaryCompoundSERE__Group_0__0 ) ) | ( ( rule__BinaryCompoundSERE__Group_1__0 ) ) | ( ( rule__BinaryCompoundSERE__Group_2__0 ) ) | ( ( rule__BinaryCompoundSERE__Group_3__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred20_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred21_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred20_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred21_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred20_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred21_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred20_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred21_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred20_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred21_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred20_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred21_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred20_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred21_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\12\uffff";
    static final String dfa_21s = "\1\13\4\uffff\2\0\3\uffff";
    static final String dfa_22s = "\1\36\4\uffff\2\0\3\uffff";
    static final String dfa_23s = "\1\uffff\1\1\6\uffff\1\2\1\3";
    static final String dfa_24s = "\5\uffff\1\0\1\1\3\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\2\uffff\2\1\1\uffff\1\1\1\uffff\1\6\4\uffff\1\5\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "574:1: rule__BinaryCompoundSERE__Alternatives_0_1 : ( ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_0_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_0_1_2__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred23_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "601:1: rule__BinaryCompoundSERE__Alternatives_0_3 : ( ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_0_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_0_3_2__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred25_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "628:1: rule__BinaryCompoundSERE__Alternatives_1_1 : ( ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_1_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_1_1_2__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred27_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "655:1: rule__BinaryCompoundSERE__Alternatives_1_3 : ( ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_1_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_1_3_2__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred29_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "682:1: rule__BinaryCompoundSERE__Alternatives_2_1 : ( ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_2_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_2_1_2__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred31_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "709:1: rule__BinaryCompoundSERE__Alternatives_2_3 : ( ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_2_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_2_3_2__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred33_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "736:1: rule__BinaryCompoundSERE__Alternatives_3_1 : ( ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_0 ) ) | ( ( rule__BinaryCompoundSERE__LeftAssignment_3_1_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_3_1_2__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred35_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "763:1: rule__BinaryCompoundSERE__Alternatives_3_3 : ( ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_0 ) ) | ( ( rule__BinaryCompoundSERE__RightAssignment_3_3_1 ) ) | ( ( rule__BinaryCompoundSERE__Group_3_3_2__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred37_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000410AC800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000004000C800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});

}