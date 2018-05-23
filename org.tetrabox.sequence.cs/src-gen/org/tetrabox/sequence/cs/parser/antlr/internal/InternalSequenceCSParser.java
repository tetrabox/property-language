package org.tetrabox.sequence.cs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.tetrabox.sequence.cs.services.SequenceCSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSequenceCSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "';'", "'not'", "'true'", "'false'", "'ocl'", "'['", "'*'", "']'", "'('", "')'", "'+'", "'='", "'->'", "'{'", "'}'", "'|'", "'&'", "'&&'", "'within'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_INT=5;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private SequenceCSGrammarAccess grammarAccess;

        public InternalSequenceCSParser(TokenStream input, SequenceCSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SERE";
       	}

       	@Override
       	protected SequenceCSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSERE"
    // InternalSequenceCS.g:70:1: entryRuleSERE returns [EObject current=null] : iv_ruleSERE= ruleSERE EOF ;
    public final EObject entryRuleSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSERE = null;


        try {
            // InternalSequenceCS.g:70:45: (iv_ruleSERE= ruleSERE EOF )
            // InternalSequenceCS.g:71:2: iv_ruleSERE= ruleSERE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSERERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSERE=ruleSERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSERE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSERE"


    // $ANTLR start "ruleSERE"
    // InternalSequenceCS.g:77:1: ruleSERE returns [EObject current=null] : (this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) ) ) ;
    public final EObject ruleSERE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_SimpleSERE_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:83:2: ( (this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) ) ) )
            // InternalSequenceCS.g:84:2: (this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) ) )
            {
            // InternalSequenceCS.g:84:2: (this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) ) )
            // InternalSequenceCS.g:85:3: this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSEREAccess().getSimpleSEREParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_3);
            this_SimpleSERE_0=ruleSimpleSERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SimpleSERE_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSequenceCS.g:96:3: ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSequenceCS.g:97:4: (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) )
                    {
                    // InternalSequenceCS.g:97:4: (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) )
                    // InternalSequenceCS.g:98:5: otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSEREAccess().getColonKeyword_1_0_0());
                      				
                    }
                    // InternalSequenceCS.g:102:5: ()
                    // InternalSequenceCS.g:103:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSEREAccess().getFusionSERELeftAction_1_0_1(),
                      							current);
                      					
                    }

                    }

                    // InternalSequenceCS.g:112:5: ( (lv_right_3_0= ruleSERE ) )
                    // InternalSequenceCS.g:113:6: (lv_right_3_0= ruleSERE )
                    {
                    // InternalSequenceCS.g:113:6: (lv_right_3_0= ruleSERE )
                    // InternalSequenceCS.g:114:7: lv_right_3_0= ruleSERE
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEREAccess().getRightSEREParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSERERule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_3_0,
                      								"org.tetrabox.sequence.cs.SequenceCS.SERE");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:133:4: (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) )
                    {
                    // InternalSequenceCS.g:133:4: (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) )
                    // InternalSequenceCS.g:134:5: otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSEREAccess().getSemicolonKeyword_1_1_0());
                      				
                    }
                    // InternalSequenceCS.g:138:5: ()
                    // InternalSequenceCS.g:139:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSEREAccess().getConcatenationSERELeftAction_1_1_1(),
                      							current);
                      					
                    }

                    }

                    // InternalSequenceCS.g:148:5: ( (lv_right_6_0= ruleSERE ) )
                    // InternalSequenceCS.g:149:6: (lv_right_6_0= ruleSERE )
                    {
                    // InternalSequenceCS.g:149:6: (lv_right_6_0= ruleSERE )
                    // InternalSequenceCS.g:150:7: lv_right_6_0= ruleSERE
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEREAccess().getRightSEREParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_6_0=ruleSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSERERule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_6_0,
                      								"org.tetrabox.sequence.cs.SequenceCS.SERE");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSERE"


    // $ANTLR start "entryRuleSimpleSERE"
    // InternalSequenceCS.g:173:1: entryRuleSimpleSERE returns [EObject current=null] : iv_ruleSimpleSERE= ruleSimpleSERE EOF ;
    public final EObject entryRuleSimpleSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSERE = null;


        try {
            // InternalSequenceCS.g:173:51: (iv_ruleSimpleSERE= ruleSimpleSERE EOF )
            // InternalSequenceCS.g:174:2: iv_ruleSimpleSERE= ruleSimpleSERE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSERERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleSERE=ruleSimpleSERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSERE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSERE"


    // $ANTLR start "ruleSimpleSERE"
    // InternalSequenceCS.g:180:1: ruleSimpleSERE returns [EObject current=null] : (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE ) ;
    public final EObject ruleSimpleSERE() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceTerminal_0 = null;

        EObject this_Sequence_1 = null;

        EObject this_CompoundSERE_2 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:186:2: ( (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE ) )
            // InternalSequenceCS.g:187:2: (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE )
            {
            // InternalSequenceCS.g:187:2: (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSequenceCS.g:188:3: this_SequenceTerminal_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleSEREAccess().getSequenceTerminalParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SequenceTerminal_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SequenceTerminal_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:200:3: this_Sequence_1= ruleSequence
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleSEREAccess().getSequenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Sequence_1=ruleSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Sequence_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:212:3: this_CompoundSERE_2= ruleCompoundSERE
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleSEREAccess().getCompoundSEREParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompoundSERE_2=ruleCompoundSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CompoundSERE_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleSERE"


    // $ANTLR start "entryRuleSequenceTerminal"
    // InternalSequenceCS.g:227:1: entryRuleSequenceTerminal returns [EObject current=null] : iv_ruleSequenceTerminal= ruleSequenceTerminal EOF ;
    public final EObject entryRuleSequenceTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceTerminal = null;


        try {
            // InternalSequenceCS.g:227:57: (iv_ruleSequenceTerminal= ruleSequenceTerminal EOF )
            // InternalSequenceCS.g:228:2: iv_ruleSequenceTerminal= ruleSequenceTerminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSequenceTerminal=ruleSequenceTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenceTerminal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceTerminal"


    // $ANTLR start "ruleSequenceTerminal"
    // InternalSequenceCS.g:234:1: ruleSequenceTerminal returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) ) | ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleSequenceTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_literal_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_expression_8_0=null;
        EObject lv_literal_2_0 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:240:2: ( ( ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) ) | ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) ) ) )
            // InternalSequenceCS.g:241:2: ( ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) ) | ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) ) )
            {
            // InternalSequenceCS.g:241:2: ( ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) ) | ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSequenceCS.g:242:3: ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalSequenceCS.g:242:3: ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) )
                    // InternalSequenceCS.g:243:4: () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) )
                    {
                    // InternalSequenceCS.g:243:4: ()
                    // InternalSequenceCS.g:244:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSequenceTerminalAccess().getNotSequenceTerminalAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSequenceTerminalAccess().getNotKeyword_0_1());
                      			
                    }
                    // InternalSequenceCS.g:257:4: ( (lv_literal_2_0= ruleSequenceTerminal ) )
                    // InternalSequenceCS.g:258:5: (lv_literal_2_0= ruleSequenceTerminal )
                    {
                    // InternalSequenceCS.g:258:5: (lv_literal_2_0= ruleSequenceTerminal )
                    // InternalSequenceCS.g:259:6: lv_literal_2_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSequenceTerminalAccess().getLiteralSequenceTerminalParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_literal_2_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSequenceTerminalRule());
                      						}
                      						set(
                      							current,
                      							"literal",
                      							lv_literal_2_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:278:3: ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) )
                    {
                    // InternalSequenceCS.g:278:3: ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) )
                    // InternalSequenceCS.g:279:4: () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' )
                    {
                    // InternalSequenceCS.g:279:4: ()
                    // InternalSequenceCS.g:280:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSequenceTerminalAccess().getBooleanLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:289:4: ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==15) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSequenceCS.g:290:5: ( (lv_literal_4_0= 'true' ) )
                            {
                            // InternalSequenceCS.g:290:5: ( (lv_literal_4_0= 'true' ) )
                            // InternalSequenceCS.g:291:6: (lv_literal_4_0= 'true' )
                            {
                            // InternalSequenceCS.g:291:6: (lv_literal_4_0= 'true' )
                            // InternalSequenceCS.g:292:7: lv_literal_4_0= 'true'
                            {
                            lv_literal_4_0=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_literal_4_0, grammarAccess.getSequenceTerminalAccess().getLiteralTrueKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSequenceTerminalRule());
                              							}
                              							setWithLastConsumed(current, "literal", true, "true");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSequenceCS.g:305:5: otherlv_5= 'false'
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getSequenceTerminalAccess().getFalseKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:312:3: ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) )
                    {
                    // InternalSequenceCS.g:312:3: ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) )
                    // InternalSequenceCS.g:313:4: () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) )
                    {
                    // InternalSequenceCS.g:313:4: ()
                    // InternalSequenceCS.g:314:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSequenceTerminalAccess().getOCLExpressionAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSequenceTerminalAccess().getOclKeyword_2_1());
                      			
                    }
                    // InternalSequenceCS.g:327:4: ( (lv_expression_8_0= RULE_STRING ) )
                    // InternalSequenceCS.g:328:5: (lv_expression_8_0= RULE_STRING )
                    {
                    // InternalSequenceCS.g:328:5: (lv_expression_8_0= RULE_STRING )
                    // InternalSequenceCS.g:329:6: lv_expression_8_0= RULE_STRING
                    {
                    lv_expression_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_expression_8_0, grammarAccess.getSequenceTerminalAccess().getExpressionSTRINGTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSequenceTerminalRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"expression",
                      							lv_expression_8_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceTerminal"


    // $ANTLR start "entryRuleSequence"
    // InternalSequenceCS.g:350:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalSequenceCS.g:350:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalSequenceCS.g:351:2: iv_ruleSequence= ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalSequenceCS.g:357:1: ruleSequence returns [EObject current=null] : (this_BracedSERE_0= ruleBracedSERE | this_RepeatedSERE_1= ruleRepeatedSERE ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        EObject this_BracedSERE_0 = null;

        EObject this_RepeatedSERE_1 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:363:2: ( (this_BracedSERE_0= ruleBracedSERE | this_RepeatedSERE_1= ruleRepeatedSERE ) )
            // InternalSequenceCS.g:364:2: (this_BracedSERE_0= ruleBracedSERE | this_RepeatedSERE_1= ruleRepeatedSERE )
            {
            // InternalSequenceCS.g:364:2: (this_BracedSERE_0= ruleBracedSERE | this_RepeatedSERE_1= ruleRepeatedSERE )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred7_InternalSequenceCS()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA5_0>=13 && LA5_0<=17)||LA5_0==20) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSequenceCS.g:365:3: this_BracedSERE_0= ruleBracedSERE
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSequenceAccess().getBracedSEREParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BracedSERE_0=ruleBracedSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BracedSERE_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:377:3: this_RepeatedSERE_1= ruleRepeatedSERE
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSequenceAccess().getRepeatedSEREParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RepeatedSERE_1=ruleRepeatedSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RepeatedSERE_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleRepeatedSERE"
    // InternalSequenceCS.g:392:1: entryRuleRepeatedSERE returns [EObject current=null] : iv_ruleRepeatedSERE= ruleRepeatedSERE EOF ;
    public final EObject entryRuleRepeatedSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatedSERE = null;


        try {
            // InternalSequenceCS.g:392:53: (iv_ruleRepeatedSERE= ruleRepeatedSERE EOF )
            // InternalSequenceCS.g:393:2: iv_ruleRepeatedSERE= ruleRepeatedSERE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeatedSERERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRepeatedSERE=ruleRepeatedSERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepeatedSERE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeatedSERE"


    // $ANTLR start "ruleRepeatedSERE"
    // InternalSequenceCS.g:399:1: ruleRepeatedSERE returns [EObject current=null] : ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) ) ;
    public final EObject ruleRepeatedSERE() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        EObject lv_expression_1_0 = null;

        EObject lv_count_4_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_count_10_0 = null;

        EObject lv_expression_14_0 = null;

        EObject lv_count_18_0 = null;

        EObject lv_expression_21_0 = null;

        EObject lv_expression_26_0 = null;

        EObject lv_expression_32_0 = null;

        EObject lv_expression_38_0 = null;

        EObject lv_count_41_0 = null;

        EObject lv_expression_44_0 = null;

        EObject lv_count_47_0 = null;

        EObject lv_count_52_0 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:405:2: ( ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) ) )
            // InternalSequenceCS.g:406:2: ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) )
            {
            // InternalSequenceCS.g:406:2: ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) )
            int alt11=10;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalSequenceCS.g:407:3: ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' )
                    {
                    // InternalSequenceCS.g:407:3: ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' )
                    // InternalSequenceCS.g:408:4: () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']'
                    {
                    // InternalSequenceCS.g:408:4: ()
                    // InternalSequenceCS.g:409:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getBooleanCountedConsecutiveRepetitionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:418:4: ( (lv_expression_1_0= ruleSequenceTerminal ) )
                    // InternalSequenceCS.g:419:5: (lv_expression_1_0= ruleSequenceTerminal )
                    {
                    // InternalSequenceCS.g:419:5: (lv_expression_1_0= ruleSequenceTerminal )
                    // InternalSequenceCS.g:420:6: lv_expression_1_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_expression_1_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSequenceCS.g:437:4: ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' )
                    // InternalSequenceCS.g:438:5: ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*'
                    {
                    // InternalSequenceCS.g:438:5: ( ( '[' )=>otherlv_2= '[' )
                    // InternalSequenceCS.g:439:6: ( '[' )=>otherlv_2= '['
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_0_2_0());
                      					
                    }

                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_0_2_1());
                      				
                    }

                    }

                    // InternalSequenceCS.g:450:4: ( (lv_count_4_0= ruleCount ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_INT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSequenceCS.g:451:5: (lv_count_4_0= ruleCount )
                            {
                            // InternalSequenceCS.g:451:5: (lv_count_4_0= ruleCount )
                            // InternalSequenceCS.g:452:6: lv_count_4_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_0_3_0());
                              					
                            }
                            pushFollow(FOLLOW_10);
                            lv_count_4_0=ruleCount();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                              						}
                              						set(
                              							current,
                              							"count",
                              							lv_count_4_0,
                              							"org.tetrabox.sequence.cs.SequenceCS.Count");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:475:3: ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' )
                    {
                    // InternalSequenceCS.g:475:3: ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' )
                    // InternalSequenceCS.g:476:4: () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']'
                    {
                    // InternalSequenceCS.g:476:4: ()
                    // InternalSequenceCS.g:477:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getSequenceCountedConsecutiveRepetitionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:486:4: ( (lv_expression_7_0= ruleBracedSERE ) )
                    // InternalSequenceCS.g:487:5: (lv_expression_7_0= ruleBracedSERE )
                    {
                    // InternalSequenceCS.g:487:5: (lv_expression_7_0= ruleBracedSERE )
                    // InternalSequenceCS.g:488:6: lv_expression_7_0= ruleBracedSERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_expression_7_0=ruleBracedSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_7_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSequenceCS.g:505:4: ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' )
                    // InternalSequenceCS.g:506:5: ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*'
                    {
                    // InternalSequenceCS.g:506:5: ( ( '[' )=>otherlv_8= '[' )
                    // InternalSequenceCS.g:507:6: ( '[' )=>otherlv_8= '['
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_1_2_0());
                      					
                    }

                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_1_2_1());
                      				
                    }

                    }

                    // InternalSequenceCS.g:518:4: ( (lv_count_10_0= ruleCount ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSequenceCS.g:519:5: (lv_count_10_0= ruleCount )
                            {
                            // InternalSequenceCS.g:519:5: (lv_count_10_0= ruleCount )
                            // InternalSequenceCS.g:520:6: lv_count_10_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_1_3_0());
                              					
                            }
                            pushFollow(FOLLOW_10);
                            lv_count_10_0=ruleCount();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                              						}
                              						set(
                              							current,
                              							"count",
                              							lv_count_10_0,
                              							"org.tetrabox.sequence.cs.SequenceCS.Count");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:543:3: ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' )
                    {
                    // InternalSequenceCS.g:543:3: ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' )
                    // InternalSequenceCS.g:544:4: () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']'
                    {
                    // InternalSequenceCS.g:544:4: ()
                    // InternalSequenceCS.g:545:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getSequenceCountedConsecutiveRepetitionAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_13=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getRepeatedSEREAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    // InternalSequenceCS.g:558:4: ( (lv_expression_14_0= ruleRepeatedSERE ) )
                    // InternalSequenceCS.g:559:5: (lv_expression_14_0= ruleRepeatedSERE )
                    {
                    // InternalSequenceCS.g:559:5: (lv_expression_14_0= ruleRepeatedSERE )
                    // InternalSequenceCS.g:560:6: lv_expression_14_0= ruleRepeatedSERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_expression_14_0=ruleRepeatedSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_14_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getRepeatedSEREAccess().getRightParenthesisKeyword_2_3());
                      			
                    }
                    // InternalSequenceCS.g:581:4: ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' )
                    // InternalSequenceCS.g:582:5: ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*'
                    {
                    // InternalSequenceCS.g:582:5: ( ( '[' )=>otherlv_16= '[' )
                    // InternalSequenceCS.g:583:6: ( '[' )=>otherlv_16= '['
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_2_4_0());
                      					
                    }

                    }

                    otherlv_17=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_2_4_1());
                      				
                    }

                    }

                    // InternalSequenceCS.g:594:4: ( (lv_count_18_0= ruleCount ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_INT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSequenceCS.g:595:5: (lv_count_18_0= ruleCount )
                            {
                            // InternalSequenceCS.g:595:5: (lv_count_18_0= ruleCount )
                            // InternalSequenceCS.g:596:6: lv_count_18_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_2_5_0());
                              					
                            }
                            pushFollow(FOLLOW_10);
                            lv_count_18_0=ruleCount();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                              						}
                              						set(
                              							current,
                              							"count",
                              							lv_count_18_0,
                              							"org.tetrabox.sequence.cs.SequenceCS.Count");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_2_6());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSequenceCS.g:619:3: ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' )
                    {
                    // InternalSequenceCS.g:619:3: ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' )
                    // InternalSequenceCS.g:620:4: () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']'
                    {
                    // InternalSequenceCS.g:620:4: ()
                    // InternalSequenceCS.g:621:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getBooleanConsecutiveRepetitionAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:630:4: ( (lv_expression_21_0= ruleSequenceTerminal ) )
                    // InternalSequenceCS.g:631:5: (lv_expression_21_0= ruleSequenceTerminal )
                    {
                    // InternalSequenceCS.g:631:5: (lv_expression_21_0= ruleSequenceTerminal )
                    // InternalSequenceCS.g:632:6: lv_expression_21_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_expression_21_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_21_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSequenceCS.g:649:4: ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' )
                    // InternalSequenceCS.g:650:5: ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+'
                    {
                    // InternalSequenceCS.g:650:5: ( ( '[' )=>otherlv_22= '[' )
                    // InternalSequenceCS.g:651:6: ( '[' )=>otherlv_22= '['
                    {
                    otherlv_22=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_22, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_3_2_0());
                      					
                    }

                    }

                    otherlv_23=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_23, grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_3_2_1());
                      				
                    }

                    }

                    otherlv_24=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_24, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSequenceCS.g:668:3: ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' )
                    {
                    // InternalSequenceCS.g:668:3: ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' )
                    // InternalSequenceCS.g:669:4: () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']'
                    {
                    // InternalSequenceCS.g:669:4: ()
                    // InternalSequenceCS.g:670:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getSequenceConsecutiveRepetitionAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:679:4: ( (lv_expression_26_0= ruleBracedSERE ) )
                    // InternalSequenceCS.g:680:5: (lv_expression_26_0= ruleBracedSERE )
                    {
                    // InternalSequenceCS.g:680:5: (lv_expression_26_0= ruleBracedSERE )
                    // InternalSequenceCS.g:681:6: lv_expression_26_0= ruleBracedSERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_expression_26_0=ruleBracedSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_26_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSequenceCS.g:698:4: ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' )
                    // InternalSequenceCS.g:699:5: ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+'
                    {
                    // InternalSequenceCS.g:699:5: ( ( '[' )=>otherlv_27= '[' )
                    // InternalSequenceCS.g:700:6: ( '[' )=>otherlv_27= '['
                    {
                    otherlv_27=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_27, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_4_2_0());
                      					
                    }

                    }

                    otherlv_28=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_28, grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_4_2_1());
                      				
                    }

                    }

                    otherlv_29=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSequenceCS.g:717:3: ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' )
                    {
                    // InternalSequenceCS.g:717:3: ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' )
                    // InternalSequenceCS.g:718:4: () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']'
                    {
                    // InternalSequenceCS.g:718:4: ()
                    // InternalSequenceCS.g:719:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getSequenceConsecutiveRepetitionAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_31=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getRepeatedSEREAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalSequenceCS.g:732:4: ( (lv_expression_32_0= ruleRepeatedSERE ) )
                    // InternalSequenceCS.g:733:5: (lv_expression_32_0= ruleRepeatedSERE )
                    {
                    // InternalSequenceCS.g:733:5: (lv_expression_32_0= ruleRepeatedSERE )
                    // InternalSequenceCS.g:734:6: lv_expression_32_0= ruleRepeatedSERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_expression_32_0=ruleRepeatedSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_32_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_33=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getRepeatedSEREAccess().getRightParenthesisKeyword_5_3());
                      			
                    }
                    // InternalSequenceCS.g:755:4: ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' )
                    // InternalSequenceCS.g:756:5: ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+'
                    {
                    // InternalSequenceCS.g:756:5: ( ( '[' )=>otherlv_34= '[' )
                    // InternalSequenceCS.g:757:6: ( '[' )=>otherlv_34= '['
                    {
                    otherlv_34=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_34, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_5_4_0());
                      					
                    }

                    }

                    otherlv_35=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_35, grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_5_4_1());
                      				
                    }

                    }

                    otherlv_36=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_5_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSequenceCS.g:774:3: ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' )
                    {
                    // InternalSequenceCS.g:774:3: ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' )
                    // InternalSequenceCS.g:775:4: () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']'
                    {
                    // InternalSequenceCS.g:775:4: ()
                    // InternalSequenceCS.g:776:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getBooleanCountedNonConsecutiveRepetitionAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:785:4: ( (lv_expression_38_0= ruleSequenceTerminal ) )
                    // InternalSequenceCS.g:786:5: (lv_expression_38_0= ruleSequenceTerminal )
                    {
                    // InternalSequenceCS.g:786:5: (lv_expression_38_0= ruleSequenceTerminal )
                    // InternalSequenceCS.g:787:6: lv_expression_38_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_expression_38_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_38_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSequenceCS.g:804:4: ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' )
                    // InternalSequenceCS.g:805:5: ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '='
                    {
                    // InternalSequenceCS.g:805:5: ( ( '[' )=>otherlv_39= '[' )
                    // InternalSequenceCS.g:806:6: ( '[' )=>otherlv_39= '['
                    {
                    otherlv_39=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_39, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_6_2_0());
                      					
                    }

                    }

                    otherlv_40=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_40, grammarAccess.getRepeatedSEREAccess().getEqualsSignKeyword_6_2_1());
                      				
                    }

                    }

                    // InternalSequenceCS.g:817:4: ( (lv_count_41_0= ruleCount ) )
                    // InternalSequenceCS.g:818:5: (lv_count_41_0= ruleCount )
                    {
                    // InternalSequenceCS.g:818:5: (lv_count_41_0= ruleCount )
                    // InternalSequenceCS.g:819:6: lv_count_41_0= ruleCount
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_6_3_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_count_41_0=ruleCount();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                      						}
                      						set(
                      							current,
                      							"count",
                      							lv_count_41_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.Count");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_42=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_6_4());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSequenceCS.g:842:3: ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' )
                    {
                    // InternalSequenceCS.g:842:3: ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' )
                    // InternalSequenceCS.g:843:4: () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']'
                    {
                    // InternalSequenceCS.g:843:4: ()
                    // InternalSequenceCS.g:844:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getBooleanCountedGotoRepetitionAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:853:4: ( (lv_expression_44_0= ruleSequenceTerminal ) )
                    // InternalSequenceCS.g:854:5: (lv_expression_44_0= ruleSequenceTerminal )
                    {
                    // InternalSequenceCS.g:854:5: (lv_expression_44_0= ruleSequenceTerminal )
                    // InternalSequenceCS.g:855:6: lv_expression_44_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_expression_44_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_44_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSequenceCS.g:872:4: ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' )
                    // InternalSequenceCS.g:873:5: ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->'
                    {
                    // InternalSequenceCS.g:873:5: ( ( '[' )=>otherlv_45= '[' )
                    // InternalSequenceCS.g:874:6: ( '[' )=>otherlv_45= '['
                    {
                    otherlv_45=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_45, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_7_2_0());
                      					
                    }

                    }

                    otherlv_46=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_46, grammarAccess.getRepeatedSEREAccess().getHyphenMinusGreaterThanSignKeyword_7_2_1());
                      				
                    }

                    }

                    // InternalSequenceCS.g:885:4: ( (lv_count_47_0= ruleCount ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSequenceCS.g:886:5: (lv_count_47_0= ruleCount )
                            {
                            // InternalSequenceCS.g:886:5: (lv_count_47_0= ruleCount )
                            // InternalSequenceCS.g:887:6: lv_count_47_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_7_3_0());
                              					
                            }
                            pushFollow(FOLLOW_10);
                            lv_count_47_0=ruleCount();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                              						}
                              						set(
                              							current,
                              							"count",
                              							lv_count_47_0,
                              							"org.tetrabox.sequence.cs.SequenceCS.Count");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_48=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_48, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_7_4());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSequenceCS.g:910:3: ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' )
                    {
                    // InternalSequenceCS.g:910:3: ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' )
                    // InternalSequenceCS.g:911:4: () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']'
                    {
                    // InternalSequenceCS.g:911:4: ()
                    // InternalSequenceCS.g:912:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getWildCardAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_50=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_50, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_8_1());
                      			
                    }
                    otherlv_51=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_8_2());
                      			
                    }
                    // InternalSequenceCS.g:929:4: ( (lv_count_52_0= ruleCount ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSequenceCS.g:930:5: (lv_count_52_0= ruleCount )
                            {
                            // InternalSequenceCS.g:930:5: (lv_count_52_0= ruleCount )
                            // InternalSequenceCS.g:931:6: lv_count_52_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_8_3_0());
                              					
                            }
                            pushFollow(FOLLOW_10);
                            lv_count_52_0=ruleCount();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getRepeatedSERERule());
                              						}
                              						set(
                              							current,
                              							"count",
                              							lv_count_52_0,
                              							"org.tetrabox.sequence.cs.SequenceCS.Count");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_53=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_53, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_8_4());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalSequenceCS.g:954:3: ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' )
                    {
                    // InternalSequenceCS.g:954:3: ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' )
                    // InternalSequenceCS.g:955:4: () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']'
                    {
                    // InternalSequenceCS.g:955:4: ()
                    // InternalSequenceCS.g:956:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRepeatedSEREAccess().getLengthOneAction_9_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_55=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_55, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_9_1());
                      			
                    }
                    otherlv_56=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_56, grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_9_2());
                      			
                    }
                    otherlv_57=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_57, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_9_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeatedSERE"


    // $ANTLR start "entryRuleBracedSERE"
    // InternalSequenceCS.g:982:1: entryRuleBracedSERE returns [EObject current=null] : iv_ruleBracedSERE= ruleBracedSERE EOF ;
    public final EObject entryRuleBracedSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracedSERE = null;


        try {
            // InternalSequenceCS.g:982:51: (iv_ruleBracedSERE= ruleBracedSERE EOF )
            // InternalSequenceCS.g:983:2: iv_ruleBracedSERE= ruleBracedSERE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBracedSERERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBracedSERE=ruleBracedSERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBracedSERE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBracedSERE"


    // $ANTLR start "ruleBracedSERE"
    // InternalSequenceCS.g:989:1: ruleBracedSERE returns [EObject current=null] : (otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}' ) ;
    public final EObject ruleBracedSERE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:995:2: ( (otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}' ) )
            // InternalSequenceCS.g:996:2: (otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}' )
            {
            // InternalSequenceCS.g:996:2: (otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}' )
            // InternalSequenceCS.g:997:3: otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBracedSEREAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalSequenceCS.g:1001:3: ( (lv_expression_1_0= ruleSERE ) )
            // InternalSequenceCS.g:1002:4: (lv_expression_1_0= ruleSERE )
            {
            // InternalSequenceCS.g:1002:4: (lv_expression_1_0= ruleSERE )
            // InternalSequenceCS.g:1003:5: lv_expression_1_0= ruleSERE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBracedSEREAccess().getExpressionSEREParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_expression_1_0=ruleSERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBracedSERERule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.tetrabox.sequence.cs.SequenceCS.SERE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBracedSEREAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBracedSERE"


    // $ANTLR start "entryRuleCompoundSERE"
    // InternalSequenceCS.g:1028:1: entryRuleCompoundSERE returns [EObject current=null] : iv_ruleCompoundSERE= ruleCompoundSERE EOF ;
    public final EObject entryRuleCompoundSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundSERE = null;


        try {
            // InternalSequenceCS.g:1028:53: (iv_ruleCompoundSERE= ruleCompoundSERE EOF )
            // InternalSequenceCS.g:1029:2: iv_ruleCompoundSERE= ruleCompoundSERE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompoundSERERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompoundSERE=ruleCompoundSERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompoundSERE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundSERE"


    // $ANTLR start "ruleCompoundSERE"
    // InternalSequenceCS.g:1035:1: ruleCompoundSERE returns [EObject current=null] : (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE ) ;
    public final EObject ruleCompoundSERE() throws RecognitionException {
        EObject current = null;

        EObject this_RepeatedSERE_0 = null;

        EObject this_BracedSERE_1 = null;

        EObject this_BinaryCompoundSERE_2 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:1041:2: ( (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE ) )
            // InternalSequenceCS.g:1042:2: (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE )
            {
            // InternalSequenceCS.g:1042:2: (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSequenceCS.g:1043:3: this_RepeatedSERE_0= ruleRepeatedSERE
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCompoundSEREAccess().getRepeatedSEREParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RepeatedSERE_0=ruleRepeatedSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RepeatedSERE_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:1055:3: this_BracedSERE_1= ruleBracedSERE
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCompoundSEREAccess().getBracedSEREParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BracedSERE_1=ruleBracedSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BracedSERE_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:1067:3: this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCompoundSEREAccess().getBinaryCompoundSEREParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinaryCompoundSERE_2=ruleBinaryCompoundSERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinaryCompoundSERE_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundSERE"


    // $ANTLR start "entryRuleBinaryCompoundSERE"
    // InternalSequenceCS.g:1082:1: entryRuleBinaryCompoundSERE returns [EObject current=null] : iv_ruleBinaryCompoundSERE= ruleBinaryCompoundSERE EOF ;
    public final EObject entryRuleBinaryCompoundSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryCompoundSERE = null;


        try {
            // InternalSequenceCS.g:1082:59: (iv_ruleBinaryCompoundSERE= ruleBinaryCompoundSERE EOF )
            // InternalSequenceCS.g:1083:2: iv_ruleBinaryCompoundSERE= ruleBinaryCompoundSERE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryCompoundSERERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryCompoundSERE=ruleBinaryCompoundSERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryCompoundSERE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryCompoundSERE"


    // $ANTLR start "ruleBinaryCompoundSERE"
    // InternalSequenceCS.g:1089:1: ruleBinaryCompoundSERE returns [EObject current=null] : ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) ) ;
    public final EObject ruleBinaryCompoundSERE() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        EObject lv_left_1_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_7_0 = null;

        EObject lv_right_8_0 = null;

        EObject lv_right_10_0 = null;

        EObject lv_left_13_0 = null;

        EObject lv_left_14_0 = null;

        EObject lv_left_16_0 = null;

        EObject lv_right_19_0 = null;

        EObject lv_right_20_0 = null;

        EObject lv_right_22_0 = null;

        EObject lv_left_25_0 = null;

        EObject lv_left_26_0 = null;

        EObject lv_left_28_0 = null;

        EObject lv_right_31_0 = null;

        EObject lv_right_32_0 = null;

        EObject lv_right_34_0 = null;

        EObject lv_left_37_0 = null;

        EObject lv_left_38_0 = null;

        EObject lv_left_40_0 = null;

        EObject lv_right_43_0 = null;

        EObject lv_right_44_0 = null;

        EObject lv_right_46_0 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:1095:2: ( ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) ) )
            // InternalSequenceCS.g:1096:2: ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) )
            {
            // InternalSequenceCS.g:1096:2: ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalSequenceCS.g:1097:3: ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) )
                    {
                    // InternalSequenceCS.g:1097:3: ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) )
                    // InternalSequenceCS.g:1098:4: () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )
                    {
                    // InternalSequenceCS.g:1098:4: ()
                    // InternalSequenceCS.g:1099:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryCompoundSEREAccess().getSEREOrAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:1108:4: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) )
                    int alt13=3;
                    alt13 = dfa13.predict(input);
                    switch (alt13) {
                        case 1 :
                            // InternalSequenceCS.g:1109:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
                            {
                            // InternalSequenceCS.g:1109:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
                            // InternalSequenceCS.g:1110:6: (lv_left_1_0= ruleRepeatedSERE )
                            {
                            // InternalSequenceCS.g:1110:6: (lv_left_1_0= ruleRepeatedSERE )
                            // InternalSequenceCS.g:1111:7: lv_left_1_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_17);
                            lv_left_1_0=ruleRepeatedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_1_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSequenceCS.g:1129:5: ( (lv_left_2_0= ruleBracedSERE ) )
                            {
                            // InternalSequenceCS.g:1129:5: ( (lv_left_2_0= ruleBracedSERE ) )
                            // InternalSequenceCS.g:1130:6: (lv_left_2_0= ruleBracedSERE )
                            {
                            // InternalSequenceCS.g:1130:6: (lv_left_2_0= ruleBracedSERE )
                            // InternalSequenceCS.g:1131:7: lv_left_2_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_17);
                            lv_left_2_0=ruleBracedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_2_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSequenceCS.g:1149:5: (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' )
                            {
                            // InternalSequenceCS.g:1149:5: (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' )
                            // InternalSequenceCS.g:1150:6: otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_0_1_2_0());
                              					
                            }
                            // InternalSequenceCS.g:1154:6: ( (lv_left_4_0= ruleBinaryCompoundSERE ) )
                            // InternalSequenceCS.g:1155:7: (lv_left_4_0= ruleBinaryCompoundSERE )
                            {
                            // InternalSequenceCS.g:1155:7: (lv_left_4_0= ruleBinaryCompoundSERE )
                            // InternalSequenceCS.g:1156:8: lv_left_4_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_0_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_11);
                            lv_left_4_0=ruleBinaryCompoundSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_4_0,
                              									"org.tetrabox.sequence.cs.SequenceCS.BinaryCompoundSERE");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_0_1_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSequenceCS.g:1179:4: ( ( '|' )=>otherlv_6= '|' )
                    // InternalSequenceCS.g:1180:5: ( '|' )=>otherlv_6= '|'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getBinaryCompoundSEREAccess().getVerticalLineKeyword_0_2());
                      				
                    }

                    }

                    // InternalSequenceCS.g:1186:4: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )
                    int alt14=3;
                    alt14 = dfa14.predict(input);
                    switch (alt14) {
                        case 1 :
                            // InternalSequenceCS.g:1187:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
                            {
                            // InternalSequenceCS.g:1187:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
                            // InternalSequenceCS.g:1188:6: (lv_right_7_0= ruleRepeatedSERE )
                            {
                            // InternalSequenceCS.g:1188:6: (lv_right_7_0= ruleRepeatedSERE )
                            // InternalSequenceCS.g:1189:7: lv_right_7_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_0_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_7_0=ruleRepeatedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"right",
                              								lv_right_7_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSequenceCS.g:1207:5: ( (lv_right_8_0= ruleBracedSERE ) )
                            {
                            // InternalSequenceCS.g:1207:5: ( (lv_right_8_0= ruleBracedSERE ) )
                            // InternalSequenceCS.g:1208:6: (lv_right_8_0= ruleBracedSERE )
                            {
                            // InternalSequenceCS.g:1208:6: (lv_right_8_0= ruleBracedSERE )
                            // InternalSequenceCS.g:1209:7: lv_right_8_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_0_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_8_0=ruleBracedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"right",
                              								lv_right_8_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSequenceCS.g:1227:5: (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' )
                            {
                            // InternalSequenceCS.g:1227:5: (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' )
                            // InternalSequenceCS.g:1228:6: otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')'
                            {
                            otherlv_9=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_0_3_2_0());
                              					
                            }
                            // InternalSequenceCS.g:1232:6: ( (lv_right_10_0= ruleBinaryCompoundSERE ) )
                            // InternalSequenceCS.g:1233:7: (lv_right_10_0= ruleBinaryCompoundSERE )
                            {
                            // InternalSequenceCS.g:1233:7: (lv_right_10_0= ruleBinaryCompoundSERE )
                            // InternalSequenceCS.g:1234:8: lv_right_10_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_0_3_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_11);
                            lv_right_10_0=ruleBinaryCompoundSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              								}
                              								set(
                              									current,
                              									"right",
                              									lv_right_10_0,
                              									"org.tetrabox.sequence.cs.SequenceCS.BinaryCompoundSERE");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_11=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_11, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_0_3_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:1259:3: ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) )
                    {
                    // InternalSequenceCS.g:1259:3: ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) )
                    // InternalSequenceCS.g:1260:4: () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )
                    {
                    // InternalSequenceCS.g:1260:4: ()
                    // InternalSequenceCS.g:1261:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryCompoundSEREAccess().getSEREAndNLMAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:1270:4: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) )
                    int alt15=3;
                    alt15 = dfa15.predict(input);
                    switch (alt15) {
                        case 1 :
                            // InternalSequenceCS.g:1271:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
                            {
                            // InternalSequenceCS.g:1271:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
                            // InternalSequenceCS.g:1272:6: (lv_left_13_0= ruleRepeatedSERE )
                            {
                            // InternalSequenceCS.g:1272:6: (lv_left_13_0= ruleRepeatedSERE )
                            // InternalSequenceCS.g:1273:7: lv_left_13_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_18);
                            lv_left_13_0=ruleRepeatedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_13_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSequenceCS.g:1291:5: ( (lv_left_14_0= ruleBracedSERE ) )
                            {
                            // InternalSequenceCS.g:1291:5: ( (lv_left_14_0= ruleBracedSERE ) )
                            // InternalSequenceCS.g:1292:6: (lv_left_14_0= ruleBracedSERE )
                            {
                            // InternalSequenceCS.g:1292:6: (lv_left_14_0= ruleBracedSERE )
                            // InternalSequenceCS.g:1293:7: lv_left_14_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_18);
                            lv_left_14_0=ruleBracedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_14_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSequenceCS.g:1311:5: (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' )
                            {
                            // InternalSequenceCS.g:1311:5: (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' )
                            // InternalSequenceCS.g:1312:6: otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')'
                            {
                            otherlv_15=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_15, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_1_1_2_0());
                              					
                            }
                            // InternalSequenceCS.g:1316:6: ( (lv_left_16_0= ruleBinaryCompoundSERE ) )
                            // InternalSequenceCS.g:1317:7: (lv_left_16_0= ruleBinaryCompoundSERE )
                            {
                            // InternalSequenceCS.g:1317:7: (lv_left_16_0= ruleBinaryCompoundSERE )
                            // InternalSequenceCS.g:1318:8: lv_left_16_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_1_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_11);
                            lv_left_16_0=ruleBinaryCompoundSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_16_0,
                              									"org.tetrabox.sequence.cs.SequenceCS.BinaryCompoundSERE");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_17=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_17, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_1_1_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSequenceCS.g:1341:4: ( ( '&' )=>otherlv_18= '&' )
                    // InternalSequenceCS.g:1342:5: ( '&' )=>otherlv_18= '&'
                    {
                    otherlv_18=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_18, grammarAccess.getBinaryCompoundSEREAccess().getAmpersandKeyword_1_2());
                      				
                    }

                    }

                    // InternalSequenceCS.g:1348:4: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )
                    int alt16=3;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // InternalSequenceCS.g:1349:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
                            {
                            // InternalSequenceCS.g:1349:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
                            // InternalSequenceCS.g:1350:6: (lv_right_19_0= ruleRepeatedSERE )
                            {
                            // InternalSequenceCS.g:1350:6: (lv_right_19_0= ruleRepeatedSERE )
                            // InternalSequenceCS.g:1351:7: lv_right_19_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_19_0=ruleRepeatedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"right",
                              								lv_right_19_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSequenceCS.g:1369:5: ( (lv_right_20_0= ruleBracedSERE ) )
                            {
                            // InternalSequenceCS.g:1369:5: ( (lv_right_20_0= ruleBracedSERE ) )
                            // InternalSequenceCS.g:1370:6: (lv_right_20_0= ruleBracedSERE )
                            {
                            // InternalSequenceCS.g:1370:6: (lv_right_20_0= ruleBracedSERE )
                            // InternalSequenceCS.g:1371:7: lv_right_20_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_1_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_20_0=ruleBracedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"right",
                              								lv_right_20_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSequenceCS.g:1389:5: (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' )
                            {
                            // InternalSequenceCS.g:1389:5: (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' )
                            // InternalSequenceCS.g:1390:6: otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')'
                            {
                            otherlv_21=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_21, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_1_3_2_0());
                              					
                            }
                            // InternalSequenceCS.g:1394:6: ( (lv_right_22_0= ruleBinaryCompoundSERE ) )
                            // InternalSequenceCS.g:1395:7: (lv_right_22_0= ruleBinaryCompoundSERE )
                            {
                            // InternalSequenceCS.g:1395:7: (lv_right_22_0= ruleBinaryCompoundSERE )
                            // InternalSequenceCS.g:1396:8: lv_right_22_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_1_3_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_11);
                            lv_right_22_0=ruleBinaryCompoundSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              								}
                              								set(
                              									current,
                              									"right",
                              									lv_right_22_0,
                              									"org.tetrabox.sequence.cs.SequenceCS.BinaryCompoundSERE");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_23=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_23, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_1_3_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSequenceCS.g:1421:3: ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) )
                    {
                    // InternalSequenceCS.g:1421:3: ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) )
                    // InternalSequenceCS.g:1422:4: () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )
                    {
                    // InternalSequenceCS.g:1422:4: ()
                    // InternalSequenceCS.g:1423:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryCompoundSEREAccess().getSEREAndLMAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:1432:4: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) )
                    int alt17=3;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // InternalSequenceCS.g:1433:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
                            {
                            // InternalSequenceCS.g:1433:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
                            // InternalSequenceCS.g:1434:6: (lv_left_25_0= ruleRepeatedSERE )
                            {
                            // InternalSequenceCS.g:1434:6: (lv_left_25_0= ruleRepeatedSERE )
                            // InternalSequenceCS.g:1435:7: lv_left_25_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_19);
                            lv_left_25_0=ruleRepeatedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_25_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSequenceCS.g:1453:5: ( (lv_left_26_0= ruleBracedSERE ) )
                            {
                            // InternalSequenceCS.g:1453:5: ( (lv_left_26_0= ruleBracedSERE ) )
                            // InternalSequenceCS.g:1454:6: (lv_left_26_0= ruleBracedSERE )
                            {
                            // InternalSequenceCS.g:1454:6: (lv_left_26_0= ruleBracedSERE )
                            // InternalSequenceCS.g:1455:7: lv_left_26_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_19);
                            lv_left_26_0=ruleBracedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_26_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSequenceCS.g:1473:5: (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' )
                            {
                            // InternalSequenceCS.g:1473:5: (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' )
                            // InternalSequenceCS.g:1474:6: otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')'
                            {
                            otherlv_27=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_27, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_2_1_2_0());
                              					
                            }
                            // InternalSequenceCS.g:1478:6: ( (lv_left_28_0= ruleBinaryCompoundSERE ) )
                            // InternalSequenceCS.g:1479:7: (lv_left_28_0= ruleBinaryCompoundSERE )
                            {
                            // InternalSequenceCS.g:1479:7: (lv_left_28_0= ruleBinaryCompoundSERE )
                            // InternalSequenceCS.g:1480:8: lv_left_28_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_11);
                            lv_left_28_0=ruleBinaryCompoundSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_28_0,
                              									"org.tetrabox.sequence.cs.SequenceCS.BinaryCompoundSERE");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_29=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_29, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_2_1_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSequenceCS.g:1503:4: ( ( '&&' )=>otherlv_30= '&&' )
                    // InternalSequenceCS.g:1504:5: ( '&&' )=>otherlv_30= '&&'
                    {
                    otherlv_30=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_30, grammarAccess.getBinaryCompoundSEREAccess().getAmpersandAmpersandKeyword_2_2());
                      				
                    }

                    }

                    // InternalSequenceCS.g:1510:4: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )
                    int alt18=3;
                    alt18 = dfa18.predict(input);
                    switch (alt18) {
                        case 1 :
                            // InternalSequenceCS.g:1511:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
                            {
                            // InternalSequenceCS.g:1511:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
                            // InternalSequenceCS.g:1512:6: (lv_right_31_0= ruleRepeatedSERE )
                            {
                            // InternalSequenceCS.g:1512:6: (lv_right_31_0= ruleRepeatedSERE )
                            // InternalSequenceCS.g:1513:7: lv_right_31_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_2_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_31_0=ruleRepeatedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"right",
                              								lv_right_31_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSequenceCS.g:1531:5: ( (lv_right_32_0= ruleBracedSERE ) )
                            {
                            // InternalSequenceCS.g:1531:5: ( (lv_right_32_0= ruleBracedSERE ) )
                            // InternalSequenceCS.g:1532:6: (lv_right_32_0= ruleBracedSERE )
                            {
                            // InternalSequenceCS.g:1532:6: (lv_right_32_0= ruleBracedSERE )
                            // InternalSequenceCS.g:1533:7: lv_right_32_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_2_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_32_0=ruleBracedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"right",
                              								lv_right_32_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSequenceCS.g:1551:5: (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' )
                            {
                            // InternalSequenceCS.g:1551:5: (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' )
                            // InternalSequenceCS.g:1552:6: otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')'
                            {
                            otherlv_33=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_33, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_2_3_2_0());
                              					
                            }
                            // InternalSequenceCS.g:1556:6: ( (lv_right_34_0= ruleBinaryCompoundSERE ) )
                            // InternalSequenceCS.g:1557:7: (lv_right_34_0= ruleBinaryCompoundSERE )
                            {
                            // InternalSequenceCS.g:1557:7: (lv_right_34_0= ruleBinaryCompoundSERE )
                            // InternalSequenceCS.g:1558:8: lv_right_34_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_2_3_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_11);
                            lv_right_34_0=ruleBinaryCompoundSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              								}
                              								set(
                              									current,
                              									"right",
                              									lv_right_34_0,
                              									"org.tetrabox.sequence.cs.SequenceCS.BinaryCompoundSERE");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_35=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_35, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_2_3_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSequenceCS.g:1583:3: ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) )
                    {
                    // InternalSequenceCS.g:1583:3: ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) )
                    // InternalSequenceCS.g:1584:4: () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) )
                    {
                    // InternalSequenceCS.g:1584:4: ()
                    // InternalSequenceCS.g:1585:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryCompoundSEREAccess().getSEREWithinAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSequenceCS.g:1594:4: ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) )
                    int alt19=3;
                    alt19 = dfa19.predict(input);
                    switch (alt19) {
                        case 1 :
                            // InternalSequenceCS.g:1595:5: ( (lv_left_37_0= ruleRepeatedSERE ) )
                            {
                            // InternalSequenceCS.g:1595:5: ( (lv_left_37_0= ruleRepeatedSERE ) )
                            // InternalSequenceCS.g:1596:6: (lv_left_37_0= ruleRepeatedSERE )
                            {
                            // InternalSequenceCS.g:1596:6: (lv_left_37_0= ruleRepeatedSERE )
                            // InternalSequenceCS.g:1597:7: lv_left_37_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_20);
                            lv_left_37_0=ruleRepeatedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_37_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSequenceCS.g:1615:5: ( (lv_left_38_0= ruleBracedSERE ) )
                            {
                            // InternalSequenceCS.g:1615:5: ( (lv_left_38_0= ruleBracedSERE ) )
                            // InternalSequenceCS.g:1616:6: (lv_left_38_0= ruleBracedSERE )
                            {
                            // InternalSequenceCS.g:1616:6: (lv_left_38_0= ruleBracedSERE )
                            // InternalSequenceCS.g:1617:7: lv_left_38_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_3_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_20);
                            lv_left_38_0=ruleBracedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_38_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSequenceCS.g:1635:5: (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' )
                            {
                            // InternalSequenceCS.g:1635:5: (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' )
                            // InternalSequenceCS.g:1636:6: otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')'
                            {
                            otherlv_39=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_39, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_3_1_2_0());
                              					
                            }
                            // InternalSequenceCS.g:1640:6: ( (lv_left_40_0= ruleBinaryCompoundSERE ) )
                            // InternalSequenceCS.g:1641:7: (lv_left_40_0= ruleBinaryCompoundSERE )
                            {
                            // InternalSequenceCS.g:1641:7: (lv_left_40_0= ruleBinaryCompoundSERE )
                            // InternalSequenceCS.g:1642:8: lv_left_40_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_3_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_11);
                            lv_left_40_0=ruleBinaryCompoundSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_40_0,
                              									"org.tetrabox.sequence.cs.SequenceCS.BinaryCompoundSERE");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_41=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_41, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_3_1_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSequenceCS.g:1665:4: ( ( 'within' )=>otherlv_42= 'within' )
                    // InternalSequenceCS.g:1666:5: ( 'within' )=>otherlv_42= 'within'
                    {
                    otherlv_42=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_42, grammarAccess.getBinaryCompoundSEREAccess().getWithinKeyword_3_2());
                      				
                    }

                    }

                    // InternalSequenceCS.g:1672:4: ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) )
                    int alt20=3;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // InternalSequenceCS.g:1673:5: ( (lv_right_43_0= ruleRepeatedSERE ) )
                            {
                            // InternalSequenceCS.g:1673:5: ( (lv_right_43_0= ruleRepeatedSERE ) )
                            // InternalSequenceCS.g:1674:6: (lv_right_43_0= ruleRepeatedSERE )
                            {
                            // InternalSequenceCS.g:1674:6: (lv_right_43_0= ruleRepeatedSERE )
                            // InternalSequenceCS.g:1675:7: lv_right_43_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_3_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_43_0=ruleRepeatedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"right",
                              								lv_right_43_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.RepeatedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSequenceCS.g:1693:5: ( (lv_right_44_0= ruleBracedSERE ) )
                            {
                            // InternalSequenceCS.g:1693:5: ( (lv_right_44_0= ruleBracedSERE ) )
                            // InternalSequenceCS.g:1694:6: (lv_right_44_0= ruleBracedSERE )
                            {
                            // InternalSequenceCS.g:1694:6: (lv_right_44_0= ruleBracedSERE )
                            // InternalSequenceCS.g:1695:7: lv_right_44_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_3_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_44_0=ruleBracedSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              							}
                              							set(
                              								current,
                              								"right",
                              								lv_right_44_0,
                              								"org.tetrabox.sequence.cs.SequenceCS.BracedSERE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSequenceCS.g:1713:5: (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' )
                            {
                            // InternalSequenceCS.g:1713:5: (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' )
                            // InternalSequenceCS.g:1714:6: otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')'
                            {
                            otherlv_45=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_45, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_3_3_2_0());
                              					
                            }
                            // InternalSequenceCS.g:1718:6: ( (lv_right_46_0= ruleBinaryCompoundSERE ) )
                            // InternalSequenceCS.g:1719:7: (lv_right_46_0= ruleBinaryCompoundSERE )
                            {
                            // InternalSequenceCS.g:1719:7: (lv_right_46_0= ruleBinaryCompoundSERE )
                            // InternalSequenceCS.g:1720:8: lv_right_46_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_3_3_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_11);
                            lv_right_46_0=ruleBinaryCompoundSERE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getBinaryCompoundSERERule());
                              								}
                              								set(
                              									current,
                              									"right",
                              									lv_right_46_0,
                              									"org.tetrabox.sequence.cs.SequenceCS.BinaryCompoundSERE");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_47=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_47, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_3_3_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryCompoundSERE"


    // $ANTLR start "entryRuleCount"
    // InternalSequenceCS.g:1748:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalSequenceCS.g:1748:46: (iv_ruleCount= ruleCount EOF )
            // InternalSequenceCS.g:1749:2: iv_ruleCount= ruleCount EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCount=ruleCount();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCount; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalSequenceCS.g:1755:1: ruleCount returns [EObject current=null] : ( ( (lv_COUNT_0_0= ruleNUMBER ) ) | this_Range_1= ruleRange ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_COUNT_0_0 = null;

        EObject this_Range_1 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:1761:2: ( ( ( (lv_COUNT_0_0= ruleNUMBER ) ) | this_Range_1= ruleRange ) )
            // InternalSequenceCS.g:1762:2: ( ( (lv_COUNT_0_0= ruleNUMBER ) ) | this_Range_1= ruleRange )
            {
            // InternalSequenceCS.g:1762:2: ( ( (lv_COUNT_0_0= ruleNUMBER ) ) | this_Range_1= ruleRange )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||LA22_1==19) ) {
                    alt22=1;
                }
                else if ( (LA22_1==11) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSequenceCS.g:1763:3: ( (lv_COUNT_0_0= ruleNUMBER ) )
                    {
                    // InternalSequenceCS.g:1763:3: ( (lv_COUNT_0_0= ruleNUMBER ) )
                    // InternalSequenceCS.g:1764:4: (lv_COUNT_0_0= ruleNUMBER )
                    {
                    // InternalSequenceCS.g:1764:4: (lv_COUNT_0_0= ruleNUMBER )
                    // InternalSequenceCS.g:1765:5: lv_COUNT_0_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCountAccess().getCOUNTNUMBERParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_COUNT_0_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCountRule());
                      					}
                      					set(
                      						current,
                      						"COUNT",
                      						lv_COUNT_0_0,
                      						"org.tetrabox.sequence.cs.SequenceCS.NUMBER");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequenceCS.g:1783:3: this_Range_1= ruleRange
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCountAccess().getRangeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Range_1=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Range_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRuleRange"
    // InternalSequenceCS.g:1798:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalSequenceCS.g:1798:46: (iv_ruleRange= ruleRange EOF )
            // InternalSequenceCS.g:1799:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalSequenceCS.g:1805:1: ruleRange returns [EObject current=null] : ( ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_LOWER_BOUND_0_0 = null;

        AntlrDatatypeRuleToken lv_HIGHER_BOUND_2_0 = null;



        	enterRule();

        try {
            // InternalSequenceCS.g:1811:2: ( ( ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) ) ) )
            // InternalSequenceCS.g:1812:2: ( ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) ) )
            {
            // InternalSequenceCS.g:1812:2: ( ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) ) )
            // InternalSequenceCS.g:1813:3: ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) )
            {
            // InternalSequenceCS.g:1813:3: ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) )
            // InternalSequenceCS.g:1814:4: (lv_LOWER_BOUND_0_0= ruleNUMBER )
            {
            // InternalSequenceCS.g:1814:4: (lv_LOWER_BOUND_0_0= ruleNUMBER )
            // InternalSequenceCS.g:1815:5: lv_LOWER_BOUND_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeAccess().getLOWER_BOUNDNUMBERParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_LOWER_BOUND_0_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRangeRule());
              					}
              					set(
              						current,
              						"LOWER_BOUND",
              						lv_LOWER_BOUND_0_0,
              						"org.tetrabox.sequence.cs.SequenceCS.NUMBER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getColonKeyword_1());
              		
            }
            // InternalSequenceCS.g:1836:3: ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) )
            // InternalSequenceCS.g:1837:4: (lv_HIGHER_BOUND_2_0= ruleNUMBER )
            {
            // InternalSequenceCS.g:1837:4: (lv_HIGHER_BOUND_2_0= ruleNUMBER )
            // InternalSequenceCS.g:1838:5: lv_HIGHER_BOUND_2_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeAccess().getHIGHER_BOUNDNUMBERParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_HIGHER_BOUND_2_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRangeRule());
              					}
              					set(
              						current,
              						"HIGHER_BOUND",
              						lv_HIGHER_BOUND_2_0,
              						"org.tetrabox.sequence.cs.SequenceCS.NUMBER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleNUMBER"
    // InternalSequenceCS.g:1859:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalSequenceCS.g:1859:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalSequenceCS.g:1860:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalSequenceCS.g:1866:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSequenceCS.g:1872:2: (this_INT_0= RULE_INT )
            // InternalSequenceCS.g:1873:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"

    // $ANTLR start synpred2_InternalSequenceCS
    public final void synpred2_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject this_SequenceTerminal_0 = null;


        // InternalSequenceCS.g:188:3: (this_SequenceTerminal_0= ruleSequenceTerminal )
        // InternalSequenceCS.g:188:3: this_SequenceTerminal_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SequenceTerminal_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSequenceCS

    // $ANTLR start synpred3_InternalSequenceCS
    public final void synpred3_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject this_Sequence_1 = null;


        // InternalSequenceCS.g:200:3: (this_Sequence_1= ruleSequence )
        // InternalSequenceCS.g:200:3: this_Sequence_1= ruleSequence
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Sequence_1=ruleSequence();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSequenceCS

    // $ANTLR start synpred7_InternalSequenceCS
    public final void synpred7_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject this_BracedSERE_0 = null;


        // InternalSequenceCS.g:365:3: (this_BracedSERE_0= ruleBracedSERE )
        // InternalSequenceCS.g:365:3: this_BracedSERE_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_BracedSERE_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalSequenceCS

    // $ANTLR start synpred10_InternalSequenceCS
    public final void synpred10_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_1_0 = null;

        EObject lv_count_4_0 = null;


        // InternalSequenceCS.g:407:3: ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) )
        // InternalSequenceCS.g:407:3: ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' )
        {
        // InternalSequenceCS.g:407:3: ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' )
        // InternalSequenceCS.g:408:4: () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']'
        {
        // InternalSequenceCS.g:408:4: ()
        // InternalSequenceCS.g:409:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSequenceCS.g:418:4: ( (lv_expression_1_0= ruleSequenceTerminal ) )
        // InternalSequenceCS.g:419:5: (lv_expression_1_0= ruleSequenceTerminal )
        {
        // InternalSequenceCS.g:419:5: (lv_expression_1_0= ruleSequenceTerminal )
        // InternalSequenceCS.g:420:6: lv_expression_1_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_7);
        lv_expression_1_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSequenceCS.g:437:4: ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' )
        // InternalSequenceCS.g:438:5: ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*'
        {
        // InternalSequenceCS.g:438:5: ( ( '[' )=>otherlv_2= '[' )
        // InternalSequenceCS.g:439:6: ( '[' )=>otherlv_2= '['
        {
        otherlv_2=(Token)match(input,17,FOLLOW_8); if (state.failed) return ;

        }

        otherlv_3=(Token)match(input,18,FOLLOW_9); if (state.failed) return ;

        }

        // InternalSequenceCS.g:450:4: ( (lv_count_4_0= ruleCount ) )?
        int alt24=2;
        int LA24_0 = input.LA(1);

        if ( (LA24_0==RULE_INT) ) {
            alt24=1;
        }
        switch (alt24) {
            case 1 :
                // InternalSequenceCS.g:451:5: (lv_count_4_0= ruleCount )
                {
                // InternalSequenceCS.g:451:5: (lv_count_4_0= ruleCount )
                // InternalSequenceCS.g:452:6: lv_count_4_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_0_3_0());
                  					
                }
                pushFollow(FOLLOW_10);
                lv_count_4_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalSequenceCS

    // $ANTLR start synpred13_InternalSequenceCS
    public final void synpred13_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_expression_7_0 = null;

        EObject lv_count_10_0 = null;


        // InternalSequenceCS.g:475:3: ( ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) )
        // InternalSequenceCS.g:475:3: ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' )
        {
        // InternalSequenceCS.g:475:3: ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' )
        // InternalSequenceCS.g:476:4: () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']'
        {
        // InternalSequenceCS.g:476:4: ()
        // InternalSequenceCS.g:477:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSequenceCS.g:486:4: ( (lv_expression_7_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:487:5: (lv_expression_7_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:487:5: (lv_expression_7_0= ruleBracedSERE )
        // InternalSequenceCS.g:488:6: lv_expression_7_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_7);
        lv_expression_7_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSequenceCS.g:505:4: ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' )
        // InternalSequenceCS.g:506:5: ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*'
        {
        // InternalSequenceCS.g:506:5: ( ( '[' )=>otherlv_8= '[' )
        // InternalSequenceCS.g:507:6: ( '[' )=>otherlv_8= '['
        {
        otherlv_8=(Token)match(input,17,FOLLOW_8); if (state.failed) return ;

        }

        otherlv_9=(Token)match(input,18,FOLLOW_9); if (state.failed) return ;

        }

        // InternalSequenceCS.g:518:4: ( (lv_count_10_0= ruleCount ) )?
        int alt25=2;
        int LA25_0 = input.LA(1);

        if ( (LA25_0==RULE_INT) ) {
            alt25=1;
        }
        switch (alt25) {
            case 1 :
                // InternalSequenceCS.g:519:5: (lv_count_10_0= ruleCount )
                {
                // InternalSequenceCS.g:519:5: (lv_count_10_0= ruleCount )
                // InternalSequenceCS.g:520:6: lv_count_10_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_1_3_0());
                  					
                }
                pushFollow(FOLLOW_10);
                lv_count_10_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_11=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSequenceCS

    // $ANTLR start synpred16_InternalSequenceCS
    public final void synpred16_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_expression_14_0 = null;

        EObject lv_count_18_0 = null;


        // InternalSequenceCS.g:543:3: ( ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) )
        // InternalSequenceCS.g:543:3: ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' )
        {
        // InternalSequenceCS.g:543:3: ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' )
        // InternalSequenceCS.g:544:4: () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']'
        {
        // InternalSequenceCS.g:544:4: ()
        // InternalSequenceCS.g:545:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_13=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;
        // InternalSequenceCS.g:558:4: ( (lv_expression_14_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:559:5: (lv_expression_14_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:559:5: (lv_expression_14_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:560:6: lv_expression_14_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_2_2_0());
          					
        }
        pushFollow(FOLLOW_11);
        lv_expression_14_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,21,FOLLOW_7); if (state.failed) return ;
        // InternalSequenceCS.g:581:4: ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' )
        // InternalSequenceCS.g:582:5: ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*'
        {
        // InternalSequenceCS.g:582:5: ( ( '[' )=>otherlv_16= '[' )
        // InternalSequenceCS.g:583:6: ( '[' )=>otherlv_16= '['
        {
        otherlv_16=(Token)match(input,17,FOLLOW_8); if (state.failed) return ;

        }

        otherlv_17=(Token)match(input,18,FOLLOW_9); if (state.failed) return ;

        }

        // InternalSequenceCS.g:594:4: ( (lv_count_18_0= ruleCount ) )?
        int alt26=2;
        int LA26_0 = input.LA(1);

        if ( (LA26_0==RULE_INT) ) {
            alt26=1;
        }
        switch (alt26) {
            case 1 :
                // InternalSequenceCS.g:595:5: (lv_count_18_0= ruleCount )
                {
                // InternalSequenceCS.g:595:5: (lv_count_18_0= ruleCount )
                // InternalSequenceCS.g:596:6: lv_count_18_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_2_5_0());
                  					
                }
                pushFollow(FOLLOW_10);
                lv_count_18_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_19=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalSequenceCS

    // $ANTLR start synpred18_InternalSequenceCS
    public final void synpred18_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_expression_21_0 = null;


        // InternalSequenceCS.g:619:3: ( ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) )
        // InternalSequenceCS.g:619:3: ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' )
        {
        // InternalSequenceCS.g:619:3: ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' )
        // InternalSequenceCS.g:620:4: () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']'
        {
        // InternalSequenceCS.g:620:4: ()
        // InternalSequenceCS.g:621:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSequenceCS.g:630:4: ( (lv_expression_21_0= ruleSequenceTerminal ) )
        // InternalSequenceCS.g:631:5: (lv_expression_21_0= ruleSequenceTerminal )
        {
        // InternalSequenceCS.g:631:5: (lv_expression_21_0= ruleSequenceTerminal )
        // InternalSequenceCS.g:632:6: lv_expression_21_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_3_1_0());
          					
        }
        pushFollow(FOLLOW_7);
        lv_expression_21_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSequenceCS.g:649:4: ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' )
        // InternalSequenceCS.g:650:5: ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+'
        {
        // InternalSequenceCS.g:650:5: ( ( '[' )=>otherlv_22= '[' )
        // InternalSequenceCS.g:651:6: ( '[' )=>otherlv_22= '['
        {
        otherlv_22=(Token)match(input,17,FOLLOW_12); if (state.failed) return ;

        }

        otherlv_23=(Token)match(input,22,FOLLOW_10); if (state.failed) return ;

        }

        otherlv_24=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalSequenceCS

    // $ANTLR start synpred20_InternalSequenceCS
    public final void synpred20_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_expression_26_0 = null;


        // InternalSequenceCS.g:668:3: ( ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) )
        // InternalSequenceCS.g:668:3: ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' )
        {
        // InternalSequenceCS.g:668:3: ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' )
        // InternalSequenceCS.g:669:4: () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']'
        {
        // InternalSequenceCS.g:669:4: ()
        // InternalSequenceCS.g:670:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSequenceCS.g:679:4: ( (lv_expression_26_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:680:5: (lv_expression_26_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:680:5: (lv_expression_26_0= ruleBracedSERE )
        // InternalSequenceCS.g:681:6: lv_expression_26_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_4_1_0());
          					
        }
        pushFollow(FOLLOW_7);
        lv_expression_26_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSequenceCS.g:698:4: ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' )
        // InternalSequenceCS.g:699:5: ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+'
        {
        // InternalSequenceCS.g:699:5: ( ( '[' )=>otherlv_27= '[' )
        // InternalSequenceCS.g:700:6: ( '[' )=>otherlv_27= '['
        {
        otherlv_27=(Token)match(input,17,FOLLOW_12); if (state.failed) return ;

        }

        otherlv_28=(Token)match(input,22,FOLLOW_10); if (state.failed) return ;

        }

        otherlv_29=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalSequenceCS

    // $ANTLR start synpred22_InternalSequenceCS
    public final void synpred22_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        EObject lv_expression_32_0 = null;


        // InternalSequenceCS.g:717:3: ( ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) )
        // InternalSequenceCS.g:717:3: ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' )
        {
        // InternalSequenceCS.g:717:3: ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' )
        // InternalSequenceCS.g:718:4: () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']'
        {
        // InternalSequenceCS.g:718:4: ()
        // InternalSequenceCS.g:719:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_31=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;
        // InternalSequenceCS.g:732:4: ( (lv_expression_32_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:733:5: (lv_expression_32_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:733:5: (lv_expression_32_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:734:6: lv_expression_32_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_5_2_0());
          					
        }
        pushFollow(FOLLOW_11);
        lv_expression_32_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_33=(Token)match(input,21,FOLLOW_7); if (state.failed) return ;
        // InternalSequenceCS.g:755:4: ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' )
        // InternalSequenceCS.g:756:5: ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+'
        {
        // InternalSequenceCS.g:756:5: ( ( '[' )=>otherlv_34= '[' )
        // InternalSequenceCS.g:757:6: ( '[' )=>otherlv_34= '['
        {
        otherlv_34=(Token)match(input,17,FOLLOW_12); if (state.failed) return ;

        }

        otherlv_35=(Token)match(input,22,FOLLOW_10); if (state.failed) return ;

        }

        otherlv_36=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalSequenceCS

    // $ANTLR start synpred24_InternalSequenceCS
    public final void synpred24_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        EObject lv_expression_38_0 = null;

        EObject lv_count_41_0 = null;


        // InternalSequenceCS.g:774:3: ( ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) )
        // InternalSequenceCS.g:774:3: ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' )
        {
        // InternalSequenceCS.g:774:3: ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' )
        // InternalSequenceCS.g:775:4: () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']'
        {
        // InternalSequenceCS.g:775:4: ()
        // InternalSequenceCS.g:776:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSequenceCS.g:785:4: ( (lv_expression_38_0= ruleSequenceTerminal ) )
        // InternalSequenceCS.g:786:5: (lv_expression_38_0= ruleSequenceTerminal )
        {
        // InternalSequenceCS.g:786:5: (lv_expression_38_0= ruleSequenceTerminal )
        // InternalSequenceCS.g:787:6: lv_expression_38_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_6_1_0());
          					
        }
        pushFollow(FOLLOW_7);
        lv_expression_38_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSequenceCS.g:804:4: ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' )
        // InternalSequenceCS.g:805:5: ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '='
        {
        // InternalSequenceCS.g:805:5: ( ( '[' )=>otherlv_39= '[' )
        // InternalSequenceCS.g:806:6: ( '[' )=>otherlv_39= '['
        {
        otherlv_39=(Token)match(input,17,FOLLOW_13); if (state.failed) return ;

        }

        otherlv_40=(Token)match(input,23,FOLLOW_14); if (state.failed) return ;

        }

        // InternalSequenceCS.g:817:4: ( (lv_count_41_0= ruleCount ) )
        // InternalSequenceCS.g:818:5: (lv_count_41_0= ruleCount )
        {
        // InternalSequenceCS.g:818:5: (lv_count_41_0= ruleCount )
        // InternalSequenceCS.g:819:6: lv_count_41_0= ruleCount
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_6_3_0());
          					
        }
        pushFollow(FOLLOW_10);
        lv_count_41_0=ruleCount();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_42=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalSequenceCS

    // $ANTLR start synpred27_InternalSequenceCS
    public final void synpred27_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        EObject lv_expression_44_0 = null;

        EObject lv_count_47_0 = null;


        // InternalSequenceCS.g:842:3: ( ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) )
        // InternalSequenceCS.g:842:3: ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' )
        {
        // InternalSequenceCS.g:842:3: ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' )
        // InternalSequenceCS.g:843:4: () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']'
        {
        // InternalSequenceCS.g:843:4: ()
        // InternalSequenceCS.g:844:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSequenceCS.g:853:4: ( (lv_expression_44_0= ruleSequenceTerminal ) )
        // InternalSequenceCS.g:854:5: (lv_expression_44_0= ruleSequenceTerminal )
        {
        // InternalSequenceCS.g:854:5: (lv_expression_44_0= ruleSequenceTerminal )
        // InternalSequenceCS.g:855:6: lv_expression_44_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_7_1_0());
          					
        }
        pushFollow(FOLLOW_7);
        lv_expression_44_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSequenceCS.g:872:4: ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' )
        // InternalSequenceCS.g:873:5: ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->'
        {
        // InternalSequenceCS.g:873:5: ( ( '[' )=>otherlv_45= '[' )
        // InternalSequenceCS.g:874:6: ( '[' )=>otherlv_45= '['
        {
        otherlv_45=(Token)match(input,17,FOLLOW_15); if (state.failed) return ;

        }

        otherlv_46=(Token)match(input,24,FOLLOW_9); if (state.failed) return ;

        }

        // InternalSequenceCS.g:885:4: ( (lv_count_47_0= ruleCount ) )?
        int alt27=2;
        int LA27_0 = input.LA(1);

        if ( (LA27_0==RULE_INT) ) {
            alt27=1;
        }
        switch (alt27) {
            case 1 :
                // InternalSequenceCS.g:886:5: (lv_count_47_0= ruleCount )
                {
                // InternalSequenceCS.g:886:5: (lv_count_47_0= ruleCount )
                // InternalSequenceCS.g:887:6: lv_count_47_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_7_3_0());
                  					
                }
                pushFollow(FOLLOW_10);
                lv_count_47_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_48=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalSequenceCS

    // $ANTLR start synpred29_InternalSequenceCS
    public final void synpred29_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        EObject lv_count_52_0 = null;


        // InternalSequenceCS.g:910:3: ( ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) )
        // InternalSequenceCS.g:910:3: ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' )
        {
        // InternalSequenceCS.g:910:3: ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' )
        // InternalSequenceCS.g:911:4: () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']'
        {
        // InternalSequenceCS.g:911:4: ()
        // InternalSequenceCS.g:912:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_50=(Token)match(input,17,FOLLOW_8); if (state.failed) return ;
        otherlv_51=(Token)match(input,18,FOLLOW_9); if (state.failed) return ;
        // InternalSequenceCS.g:929:4: ( (lv_count_52_0= ruleCount ) )?
        int alt28=2;
        int LA28_0 = input.LA(1);

        if ( (LA28_0==RULE_INT) ) {
            alt28=1;
        }
        switch (alt28) {
            case 1 :
                // InternalSequenceCS.g:930:5: (lv_count_52_0= ruleCount )
                {
                // InternalSequenceCS.g:930:5: (lv_count_52_0= ruleCount )
                // InternalSequenceCS.g:931:6: lv_count_52_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_8_3_0());
                  					
                }
                pushFollow(FOLLOW_10);
                lv_count_52_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_53=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalSequenceCS

    // $ANTLR start synpred30_InternalSequenceCS
    public final void synpred30_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject this_RepeatedSERE_0 = null;


        // InternalSequenceCS.g:1043:3: (this_RepeatedSERE_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:1043:3: this_RepeatedSERE_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_RepeatedSERE_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalSequenceCS

    // $ANTLR start synpred31_InternalSequenceCS
    public final void synpred31_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject this_BracedSERE_1 = null;


        // InternalSequenceCS.g:1055:3: (this_BracedSERE_1= ruleBracedSERE )
        // InternalSequenceCS.g:1055:3: this_BracedSERE_1= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_BracedSERE_1=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalSequenceCS

    // $ANTLR start synpred32_InternalSequenceCS
    public final void synpred32_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_left_1_0 = null;


        // InternalSequenceCS.g:1109:5: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) )
        // InternalSequenceCS.g:1109:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
        {
        // InternalSequenceCS.g:1109:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:1110:6: (lv_left_1_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:1110:6: (lv_left_1_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:1111:7: lv_left_1_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_0_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_1_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred32_InternalSequenceCS

    // $ANTLR start synpred33_InternalSequenceCS
    public final void synpred33_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_left_2_0 = null;


        // InternalSequenceCS.g:1129:5: ( ( (lv_left_2_0= ruleBracedSERE ) ) )
        // InternalSequenceCS.g:1129:5: ( (lv_left_2_0= ruleBracedSERE ) )
        {
        // InternalSequenceCS.g:1129:5: ( (lv_left_2_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:1130:6: (lv_left_2_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:1130:6: (lv_left_2_0= ruleBracedSERE )
        // InternalSequenceCS.g:1131:7: lv_left_2_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_0_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_2_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33_InternalSequenceCS

    // $ANTLR start synpred35_InternalSequenceCS
    public final void synpred35_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_right_7_0 = null;


        // InternalSequenceCS.g:1187:5: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) )
        // InternalSequenceCS.g:1187:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
        {
        // InternalSequenceCS.g:1187:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:1188:6: (lv_right_7_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:1188:6: (lv_right_7_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:1189:7: lv_right_7_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_0_3_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_right_7_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35_InternalSequenceCS

    // $ANTLR start synpred36_InternalSequenceCS
    public final void synpred36_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_right_8_0 = null;


        // InternalSequenceCS.g:1207:5: ( ( (lv_right_8_0= ruleBracedSERE ) ) )
        // InternalSequenceCS.g:1207:5: ( (lv_right_8_0= ruleBracedSERE ) )
        {
        // InternalSequenceCS.g:1207:5: ( (lv_right_8_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:1208:6: (lv_right_8_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:1208:6: (lv_right_8_0= ruleBracedSERE )
        // InternalSequenceCS.g:1209:7: lv_right_8_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_0_3_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_right_8_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalSequenceCS

    // $ANTLR start synpred37_InternalSequenceCS
    public final void synpred37_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_left_1_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_7_0 = null;

        EObject lv_right_8_0 = null;

        EObject lv_right_10_0 = null;


        // InternalSequenceCS.g:1097:3: ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) )
        // InternalSequenceCS.g:1097:3: ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) )
        {
        // InternalSequenceCS.g:1097:3: ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) )
        // InternalSequenceCS.g:1098:4: () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )
        {
        // InternalSequenceCS.g:1098:4: ()
        // InternalSequenceCS.g:1099:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSequenceCS.g:1108:4: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) )
        int alt29=3;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // InternalSequenceCS.g:1109:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
                {
                // InternalSequenceCS.g:1109:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
                // InternalSequenceCS.g:1110:6: (lv_left_1_0= ruleRepeatedSERE )
                {
                // InternalSequenceCS.g:1110:6: (lv_left_1_0= ruleRepeatedSERE )
                // InternalSequenceCS.g:1111:7: lv_left_1_0= ruleRepeatedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_0_1_0_0());
                  						
                }
                pushFollow(FOLLOW_17);
                lv_left_1_0=ruleRepeatedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalSequenceCS.g:1129:5: ( (lv_left_2_0= ruleBracedSERE ) )
                {
                // InternalSequenceCS.g:1129:5: ( (lv_left_2_0= ruleBracedSERE ) )
                // InternalSequenceCS.g:1130:6: (lv_left_2_0= ruleBracedSERE )
                {
                // InternalSequenceCS.g:1130:6: (lv_left_2_0= ruleBracedSERE )
                // InternalSequenceCS.g:1131:7: lv_left_2_0= ruleBracedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FOLLOW_17);
                lv_left_2_0=ruleBracedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalSequenceCS.g:1149:5: (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' )
                {
                // InternalSequenceCS.g:1149:5: (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' )
                // InternalSequenceCS.g:1150:6: otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')'
                {
                otherlv_3=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;
                // InternalSequenceCS.g:1154:6: ( (lv_left_4_0= ruleBinaryCompoundSERE ) )
                // InternalSequenceCS.g:1155:7: (lv_left_4_0= ruleBinaryCompoundSERE )
                {
                // InternalSequenceCS.g:1155:7: (lv_left_4_0= ruleBinaryCompoundSERE )
                // InternalSequenceCS.g:1156:8: lv_left_4_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_0_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_11);
                lv_left_4_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_5=(Token)match(input,21,FOLLOW_17); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalSequenceCS.g:1179:4: ( ( '|' )=>otherlv_6= '|' )
        // InternalSequenceCS.g:1180:5: ( '|' )=>otherlv_6= '|'
        {
        otherlv_6=(Token)match(input,27,FOLLOW_4); if (state.failed) return ;

        }

        // InternalSequenceCS.g:1186:4: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )
        int alt30=3;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // InternalSequenceCS.g:1187:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
                {
                // InternalSequenceCS.g:1187:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
                // InternalSequenceCS.g:1188:6: (lv_right_7_0= ruleRepeatedSERE )
                {
                // InternalSequenceCS.g:1188:6: (lv_right_7_0= ruleRepeatedSERE )
                // InternalSequenceCS.g:1189:7: lv_right_7_0= ruleRepeatedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_0_3_0_0());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_right_7_0=ruleRepeatedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalSequenceCS.g:1207:5: ( (lv_right_8_0= ruleBracedSERE ) )
                {
                // InternalSequenceCS.g:1207:5: ( (lv_right_8_0= ruleBracedSERE ) )
                // InternalSequenceCS.g:1208:6: (lv_right_8_0= ruleBracedSERE )
                {
                // InternalSequenceCS.g:1208:6: (lv_right_8_0= ruleBracedSERE )
                // InternalSequenceCS.g:1209:7: lv_right_8_0= ruleBracedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_0_3_1_0());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_right_8_0=ruleBracedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalSequenceCS.g:1227:5: (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' )
                {
                // InternalSequenceCS.g:1227:5: (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' )
                // InternalSequenceCS.g:1228:6: otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')'
                {
                otherlv_9=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;
                // InternalSequenceCS.g:1232:6: ( (lv_right_10_0= ruleBinaryCompoundSERE ) )
                // InternalSequenceCS.g:1233:7: (lv_right_10_0= ruleBinaryCompoundSERE )
                {
                // InternalSequenceCS.g:1233:7: (lv_right_10_0= ruleBinaryCompoundSERE )
                // InternalSequenceCS.g:1234:8: lv_right_10_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_0_3_2_1_0());
                  							
                }
                pushFollow(FOLLOW_11);
                lv_right_10_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_11=(Token)match(input,21,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred37_InternalSequenceCS

    // $ANTLR start synpred38_InternalSequenceCS
    public final void synpred38_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_left_13_0 = null;


        // InternalSequenceCS.g:1271:5: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) )
        // InternalSequenceCS.g:1271:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
        {
        // InternalSequenceCS.g:1271:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:1272:6: (lv_left_13_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:1272:6: (lv_left_13_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:1273:7: lv_left_13_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_1_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_13_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred38_InternalSequenceCS

    // $ANTLR start synpred39_InternalSequenceCS
    public final void synpred39_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_left_14_0 = null;


        // InternalSequenceCS.g:1291:5: ( ( (lv_left_14_0= ruleBracedSERE ) ) )
        // InternalSequenceCS.g:1291:5: ( (lv_left_14_0= ruleBracedSERE ) )
        {
        // InternalSequenceCS.g:1291:5: ( (lv_left_14_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:1292:6: (lv_left_14_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:1292:6: (lv_left_14_0= ruleBracedSERE )
        // InternalSequenceCS.g:1293:7: lv_left_14_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_1_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_14_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred39_InternalSequenceCS

    // $ANTLR start synpred41_InternalSequenceCS
    public final void synpred41_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_right_19_0 = null;


        // InternalSequenceCS.g:1349:5: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) )
        // InternalSequenceCS.g:1349:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
        {
        // InternalSequenceCS.g:1349:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:1350:6: (lv_right_19_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:1350:6: (lv_right_19_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:1351:7: lv_right_19_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_1_3_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_right_19_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred41_InternalSequenceCS

    // $ANTLR start synpred42_InternalSequenceCS
    public final void synpred42_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_right_20_0 = null;


        // InternalSequenceCS.g:1369:5: ( ( (lv_right_20_0= ruleBracedSERE ) ) )
        // InternalSequenceCS.g:1369:5: ( (lv_right_20_0= ruleBracedSERE ) )
        {
        // InternalSequenceCS.g:1369:5: ( (lv_right_20_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:1370:6: (lv_right_20_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:1370:6: (lv_right_20_0= ruleBracedSERE )
        // InternalSequenceCS.g:1371:7: lv_right_20_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_1_3_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_right_20_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred42_InternalSequenceCS

    // $ANTLR start synpred43_InternalSequenceCS
    public final void synpred43_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_left_13_0 = null;

        EObject lv_left_14_0 = null;

        EObject lv_left_16_0 = null;

        EObject lv_right_19_0 = null;

        EObject lv_right_20_0 = null;

        EObject lv_right_22_0 = null;


        // InternalSequenceCS.g:1259:3: ( ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) )
        // InternalSequenceCS.g:1259:3: ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) )
        {
        // InternalSequenceCS.g:1259:3: ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) )
        // InternalSequenceCS.g:1260:4: () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )
        {
        // InternalSequenceCS.g:1260:4: ()
        // InternalSequenceCS.g:1261:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSequenceCS.g:1270:4: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) )
        int alt31=3;
        alt31 = dfa31.predict(input);
        switch (alt31) {
            case 1 :
                // InternalSequenceCS.g:1271:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
                {
                // InternalSequenceCS.g:1271:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
                // InternalSequenceCS.g:1272:6: (lv_left_13_0= ruleRepeatedSERE )
                {
                // InternalSequenceCS.g:1272:6: (lv_left_13_0= ruleRepeatedSERE )
                // InternalSequenceCS.g:1273:7: lv_left_13_0= ruleRepeatedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_1_1_0_0());
                  						
                }
                pushFollow(FOLLOW_18);
                lv_left_13_0=ruleRepeatedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalSequenceCS.g:1291:5: ( (lv_left_14_0= ruleBracedSERE ) )
                {
                // InternalSequenceCS.g:1291:5: ( (lv_left_14_0= ruleBracedSERE ) )
                // InternalSequenceCS.g:1292:6: (lv_left_14_0= ruleBracedSERE )
                {
                // InternalSequenceCS.g:1292:6: (lv_left_14_0= ruleBracedSERE )
                // InternalSequenceCS.g:1293:7: lv_left_14_0= ruleBracedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_1_1_1_0());
                  						
                }
                pushFollow(FOLLOW_18);
                lv_left_14_0=ruleBracedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalSequenceCS.g:1311:5: (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' )
                {
                // InternalSequenceCS.g:1311:5: (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' )
                // InternalSequenceCS.g:1312:6: otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')'
                {
                otherlv_15=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;
                // InternalSequenceCS.g:1316:6: ( (lv_left_16_0= ruleBinaryCompoundSERE ) )
                // InternalSequenceCS.g:1317:7: (lv_left_16_0= ruleBinaryCompoundSERE )
                {
                // InternalSequenceCS.g:1317:7: (lv_left_16_0= ruleBinaryCompoundSERE )
                // InternalSequenceCS.g:1318:8: lv_left_16_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_1_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_11);
                lv_left_16_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_17=(Token)match(input,21,FOLLOW_18); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalSequenceCS.g:1341:4: ( ( '&' )=>otherlv_18= '&' )
        // InternalSequenceCS.g:1342:5: ( '&' )=>otherlv_18= '&'
        {
        otherlv_18=(Token)match(input,28,FOLLOW_4); if (state.failed) return ;

        }

        // InternalSequenceCS.g:1348:4: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )
        int alt32=3;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // InternalSequenceCS.g:1349:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
                {
                // InternalSequenceCS.g:1349:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
                // InternalSequenceCS.g:1350:6: (lv_right_19_0= ruleRepeatedSERE )
                {
                // InternalSequenceCS.g:1350:6: (lv_right_19_0= ruleRepeatedSERE )
                // InternalSequenceCS.g:1351:7: lv_right_19_0= ruleRepeatedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_1_3_0_0());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_right_19_0=ruleRepeatedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalSequenceCS.g:1369:5: ( (lv_right_20_0= ruleBracedSERE ) )
                {
                // InternalSequenceCS.g:1369:5: ( (lv_right_20_0= ruleBracedSERE ) )
                // InternalSequenceCS.g:1370:6: (lv_right_20_0= ruleBracedSERE )
                {
                // InternalSequenceCS.g:1370:6: (lv_right_20_0= ruleBracedSERE )
                // InternalSequenceCS.g:1371:7: lv_right_20_0= ruleBracedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_1_3_1_0());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_right_20_0=ruleBracedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalSequenceCS.g:1389:5: (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' )
                {
                // InternalSequenceCS.g:1389:5: (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' )
                // InternalSequenceCS.g:1390:6: otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')'
                {
                otherlv_21=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;
                // InternalSequenceCS.g:1394:6: ( (lv_right_22_0= ruleBinaryCompoundSERE ) )
                // InternalSequenceCS.g:1395:7: (lv_right_22_0= ruleBinaryCompoundSERE )
                {
                // InternalSequenceCS.g:1395:7: (lv_right_22_0= ruleBinaryCompoundSERE )
                // InternalSequenceCS.g:1396:8: lv_right_22_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_1_3_2_1_0());
                  							
                }
                pushFollow(FOLLOW_11);
                lv_right_22_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_23=(Token)match(input,21,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred43_InternalSequenceCS

    // $ANTLR start synpred44_InternalSequenceCS
    public final void synpred44_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_left_25_0 = null;


        // InternalSequenceCS.g:1433:5: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) )
        // InternalSequenceCS.g:1433:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
        {
        // InternalSequenceCS.g:1433:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:1434:6: (lv_left_25_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:1434:6: (lv_left_25_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:1435:7: lv_left_25_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_2_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_25_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred44_InternalSequenceCS

    // $ANTLR start synpred45_InternalSequenceCS
    public final void synpred45_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_left_26_0 = null;


        // InternalSequenceCS.g:1453:5: ( ( (lv_left_26_0= ruleBracedSERE ) ) )
        // InternalSequenceCS.g:1453:5: ( (lv_left_26_0= ruleBracedSERE ) )
        {
        // InternalSequenceCS.g:1453:5: ( (lv_left_26_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:1454:6: (lv_left_26_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:1454:6: (lv_left_26_0= ruleBracedSERE )
        // InternalSequenceCS.g:1455:7: lv_left_26_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_26_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred45_InternalSequenceCS

    // $ANTLR start synpred47_InternalSequenceCS
    public final void synpred47_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_right_31_0 = null;


        // InternalSequenceCS.g:1511:5: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) )
        // InternalSequenceCS.g:1511:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
        {
        // InternalSequenceCS.g:1511:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:1512:6: (lv_right_31_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:1512:6: (lv_right_31_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:1513:7: lv_right_31_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_2_3_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_right_31_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred47_InternalSequenceCS

    // $ANTLR start synpred48_InternalSequenceCS
    public final void synpred48_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_right_32_0 = null;


        // InternalSequenceCS.g:1531:5: ( ( (lv_right_32_0= ruleBracedSERE ) ) )
        // InternalSequenceCS.g:1531:5: ( (lv_right_32_0= ruleBracedSERE ) )
        {
        // InternalSequenceCS.g:1531:5: ( (lv_right_32_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:1532:6: (lv_right_32_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:1532:6: (lv_right_32_0= ruleBracedSERE )
        // InternalSequenceCS.g:1533:7: lv_right_32_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_2_3_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_right_32_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred48_InternalSequenceCS

    // $ANTLR start synpred49_InternalSequenceCS
    public final void synpred49_InternalSequenceCS_fragment() throws RecognitionException {   
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        EObject lv_left_25_0 = null;

        EObject lv_left_26_0 = null;

        EObject lv_left_28_0 = null;

        EObject lv_right_31_0 = null;

        EObject lv_right_32_0 = null;

        EObject lv_right_34_0 = null;


        // InternalSequenceCS.g:1421:3: ( ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) )
        // InternalSequenceCS.g:1421:3: ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) )
        {
        // InternalSequenceCS.g:1421:3: ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) )
        // InternalSequenceCS.g:1422:4: () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )
        {
        // InternalSequenceCS.g:1422:4: ()
        // InternalSequenceCS.g:1423:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSequenceCS.g:1432:4: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) )
        int alt33=3;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // InternalSequenceCS.g:1433:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
                {
                // InternalSequenceCS.g:1433:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
                // InternalSequenceCS.g:1434:6: (lv_left_25_0= ruleRepeatedSERE )
                {
                // InternalSequenceCS.g:1434:6: (lv_left_25_0= ruleRepeatedSERE )
                // InternalSequenceCS.g:1435:7: lv_left_25_0= ruleRepeatedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_2_1_0_0());
                  						
                }
                pushFollow(FOLLOW_19);
                lv_left_25_0=ruleRepeatedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalSequenceCS.g:1453:5: ( (lv_left_26_0= ruleBracedSERE ) )
                {
                // InternalSequenceCS.g:1453:5: ( (lv_left_26_0= ruleBracedSERE ) )
                // InternalSequenceCS.g:1454:6: (lv_left_26_0= ruleBracedSERE )
                {
                // InternalSequenceCS.g:1454:6: (lv_left_26_0= ruleBracedSERE )
                // InternalSequenceCS.g:1455:7: lv_left_26_0= ruleBracedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_2_1_1_0());
                  						
                }
                pushFollow(FOLLOW_19);
                lv_left_26_0=ruleBracedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalSequenceCS.g:1473:5: (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' )
                {
                // InternalSequenceCS.g:1473:5: (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' )
                // InternalSequenceCS.g:1474:6: otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')'
                {
                otherlv_27=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;
                // InternalSequenceCS.g:1478:6: ( (lv_left_28_0= ruleBinaryCompoundSERE ) )
                // InternalSequenceCS.g:1479:7: (lv_left_28_0= ruleBinaryCompoundSERE )
                {
                // InternalSequenceCS.g:1479:7: (lv_left_28_0= ruleBinaryCompoundSERE )
                // InternalSequenceCS.g:1480:8: lv_left_28_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_11);
                lv_left_28_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_29=(Token)match(input,21,FOLLOW_19); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalSequenceCS.g:1503:4: ( ( '&&' )=>otherlv_30= '&&' )
        // InternalSequenceCS.g:1504:5: ( '&&' )=>otherlv_30= '&&'
        {
        otherlv_30=(Token)match(input,29,FOLLOW_4); if (state.failed) return ;

        }

        // InternalSequenceCS.g:1510:4: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )
        int alt34=3;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // InternalSequenceCS.g:1511:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
                {
                // InternalSequenceCS.g:1511:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
                // InternalSequenceCS.g:1512:6: (lv_right_31_0= ruleRepeatedSERE )
                {
                // InternalSequenceCS.g:1512:6: (lv_right_31_0= ruleRepeatedSERE )
                // InternalSequenceCS.g:1513:7: lv_right_31_0= ruleRepeatedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_2_3_0_0());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_right_31_0=ruleRepeatedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalSequenceCS.g:1531:5: ( (lv_right_32_0= ruleBracedSERE ) )
                {
                // InternalSequenceCS.g:1531:5: ( (lv_right_32_0= ruleBracedSERE ) )
                // InternalSequenceCS.g:1532:6: (lv_right_32_0= ruleBracedSERE )
                {
                // InternalSequenceCS.g:1532:6: (lv_right_32_0= ruleBracedSERE )
                // InternalSequenceCS.g:1533:7: lv_right_32_0= ruleBracedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_2_3_1_0());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_right_32_0=ruleBracedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalSequenceCS.g:1551:5: (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' )
                {
                // InternalSequenceCS.g:1551:5: (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' )
                // InternalSequenceCS.g:1552:6: otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')'
                {
                otherlv_33=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;
                // InternalSequenceCS.g:1556:6: ( (lv_right_34_0= ruleBinaryCompoundSERE ) )
                // InternalSequenceCS.g:1557:7: (lv_right_34_0= ruleBinaryCompoundSERE )
                {
                // InternalSequenceCS.g:1557:7: (lv_right_34_0= ruleBinaryCompoundSERE )
                // InternalSequenceCS.g:1558:8: lv_right_34_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_2_3_2_1_0());
                  							
                }
                pushFollow(FOLLOW_11);
                lv_right_34_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_35=(Token)match(input,21,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred49_InternalSequenceCS

    // $ANTLR start synpred50_InternalSequenceCS
    public final void synpred50_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_left_37_0 = null;


        // InternalSequenceCS.g:1595:5: ( ( (lv_left_37_0= ruleRepeatedSERE ) ) )
        // InternalSequenceCS.g:1595:5: ( (lv_left_37_0= ruleRepeatedSERE ) )
        {
        // InternalSequenceCS.g:1595:5: ( (lv_left_37_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:1596:6: (lv_left_37_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:1596:6: (lv_left_37_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:1597:7: lv_left_37_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_3_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_37_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred50_InternalSequenceCS

    // $ANTLR start synpred51_InternalSequenceCS
    public final void synpred51_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_left_38_0 = null;


        // InternalSequenceCS.g:1615:5: ( ( (lv_left_38_0= ruleBracedSERE ) ) )
        // InternalSequenceCS.g:1615:5: ( (lv_left_38_0= ruleBracedSERE ) )
        {
        // InternalSequenceCS.g:1615:5: ( (lv_left_38_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:1616:6: (lv_left_38_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:1616:6: (lv_left_38_0= ruleBracedSERE )
        // InternalSequenceCS.g:1617:7: lv_left_38_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_3_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_38_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred51_InternalSequenceCS

    // $ANTLR start synpred53_InternalSequenceCS
    public final void synpred53_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_right_43_0 = null;


        // InternalSequenceCS.g:1673:5: ( ( (lv_right_43_0= ruleRepeatedSERE ) ) )
        // InternalSequenceCS.g:1673:5: ( (lv_right_43_0= ruleRepeatedSERE ) )
        {
        // InternalSequenceCS.g:1673:5: ( (lv_right_43_0= ruleRepeatedSERE ) )
        // InternalSequenceCS.g:1674:6: (lv_right_43_0= ruleRepeatedSERE )
        {
        // InternalSequenceCS.g:1674:6: (lv_right_43_0= ruleRepeatedSERE )
        // InternalSequenceCS.g:1675:7: lv_right_43_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightRepeatedSEREParserRuleCall_3_3_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_right_43_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred53_InternalSequenceCS

    // $ANTLR start synpred54_InternalSequenceCS
    public final void synpred54_InternalSequenceCS_fragment() throws RecognitionException {   
        EObject lv_right_44_0 = null;


        // InternalSequenceCS.g:1693:5: ( ( (lv_right_44_0= ruleBracedSERE ) ) )
        // InternalSequenceCS.g:1693:5: ( (lv_right_44_0= ruleBracedSERE ) )
        {
        // InternalSequenceCS.g:1693:5: ( (lv_right_44_0= ruleBracedSERE ) )
        // InternalSequenceCS.g:1694:6: (lv_right_44_0= ruleBracedSERE )
        {
        // InternalSequenceCS.g:1694:6: (lv_right_44_0= ruleBracedSERE )
        // InternalSequenceCS.g:1695:7: lv_right_44_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBracedSEREParserRuleCall_3_3_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_right_44_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred54_InternalSequenceCS

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
    public final boolean synpred44_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalSequenceCS_fragment(); // can never throw exception
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
    public final boolean synpred47_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalSequenceCS_fragment(); // can never throw exception
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
    public final boolean synpred51_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalSequenceCS_fragment(); // can never throw exception
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
    public final boolean synpred53_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalSequenceCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalSequenceCS_fragment(); // can never throw exception
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
    public final boolean synpred49_InternalSequenceCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalSequenceCS_fragment(); // can never throw exception
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
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\15\7\0\3\uffff";
    static final String dfa_3s = "\1\31\7\0\3\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\7\2\uffff\1\6\4\uffff\1\5",
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
            return "187:2: (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE )";
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
    static final String dfa_8s = "\1\15\7\0\12\uffff";
    static final String dfa_9s = "\1\31\7\0\12\uffff";
    static final String dfa_10s = "\10\uffff\1\1\1\4\1\7\1\10\1\2\1\5\1\3\1\6\1\11\1\12";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2\1\3\1\4\1\7\2\uffff\1\6\4\uffff\1\5",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "406:2: ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred18_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred24_InternalSequenceCS()) ) {s = 10;}

                        else if ( (synpred27_InternalSequenceCS()) ) {s = 11;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred18_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred24_InternalSequenceCS()) ) {s = 10;}

                        else if ( (synpred27_InternalSequenceCS()) ) {s = 11;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred18_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred24_InternalSequenceCS()) ) {s = 10;}

                        else if ( (synpred27_InternalSequenceCS()) ) {s = 11;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred18_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred24_InternalSequenceCS()) ) {s = 10;}

                        else if ( (synpred27_InternalSequenceCS()) ) {s = 11;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalSequenceCS()) ) {s = 12;}

                        else if ( (synpred20_InternalSequenceCS()) ) {s = 13;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSequenceCS()) ) {s = 14;}

                        else if ( (synpred22_InternalSequenceCS()) ) {s = 15;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSequenceCS()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index11_7);
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
    static final String dfa_13s = "\10\uffff\1\1\1\3\1\2";
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_13;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1042:2: (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred31_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSequenceCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_7);
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
    static final String dfa_14s = "\14\uffff";
    static final String dfa_15s = "\1\15\7\0\4\uffff";
    static final String dfa_16s = "\1\31\7\0\4\uffff";
    static final String dfa_17s = "\10\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\4\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\1\2\1\3\1\4\1\7\2\uffff\1\6\4\uffff\1\5",
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1096:2: ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred43_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred49_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred43_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred49_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred43_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred49_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred43_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred49_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred43_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred49_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred43_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred49_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSequenceCS()) ) {s = 8;}

                        else if ( (synpred43_InternalSequenceCS()) ) {s = 9;}

                        else if ( (synpred49_InternalSequenceCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\12\uffff";
    static final String dfa_21s = "\1\15\4\uffff\2\0\3\uffff";
    static final String dfa_22s = "\1\31\4\uffff\2\0\3\uffff";
    static final String dfa_23s = "\1\uffff\1\1\6\uffff\1\2\1\3";
    static final String dfa_24s = "\5\uffff\1\0\1\1\3\uffff}>";
    static final String[] dfa_25s = {
            "\5\1\2\uffff\1\6\4\uffff\1\5",
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
            return "1108:4: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) )";
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
                        if ( (synpred32_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred33_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSequenceCS()) ) {s = 1;}

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
            return "1186:4: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )";
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
                        if ( (synpred35_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred36_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSequenceCS()) ) {s = 1;}

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
            return "1270:4: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) )";
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
                        if ( (synpred38_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred39_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalSequenceCS()) ) {s = 1;}

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
            return "1348:4: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )";
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
                        if ( (synpred41_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred42_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSequenceCS()) ) {s = 1;}

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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1432:4: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred45_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1510:4: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred48_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1594:4: ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred51_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_6 = input.LA(1);

                         
                        int index19_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index19_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1672:4: ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred54_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1108:4: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred33_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1186:4: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred36_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1270:4: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred39_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1348:4: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred42_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1432:4: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred45_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1510:4: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalSequenceCS()) ) {s = 1;}

                        else if ( (synpred48_InternalSequenceCS()) ) {s = 8;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalSequenceCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000213E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000800L});

}