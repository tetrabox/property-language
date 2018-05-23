package org.tetrabox.property.cs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.tetrabox.property.cs.services.PropertyCSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPropertyCSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IMPORT_URI", "RULE_STRING", "RULE_INT", "RULE_SCHEME", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'('", "')'", "'and'", "'or'", "'abort'", "'until'", "'!'", "'always'", "'never'", "'next_e'", "'eventually!'", "'->'", "'<->'", "'until_'", "'before'", "'|=>'", "'|->'", "'next_event_a'", "'['", "']'", "':'", "';'", "'not'", "'true'", "'false'", "'ocl'", "'*'", "'+'", "'='", "'{'", "'}'", "'|'", "'&'", "'&&'", "'within'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SCHEME=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_IMPORT_URI=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPropertyCSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPropertyCSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPropertyCSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPropertyCS.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private PropertyCSGrammarAccess grammarAccess;

        public InternalPropertyCSParser(TokenStream input, PropertyCSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Document";
       	}

       	@Override
       	protected PropertyCSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocument"
    // InternalPropertyCS.g:70:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalPropertyCS.g:70:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalPropertyCS.g:71:2: iv_ruleDocument= ruleDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalPropertyCS.g:77:1: ruleDocument returns [EObject current=null] : ( ( (lv_ownedImports_0_0= ruleImport ) )* ( (lv_ownedProperties_1_0= ruleProperty ) )+ ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedImports_0_0 = null;

        EObject lv_ownedProperties_1_0 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:83:2: ( ( ( (lv_ownedImports_0_0= ruleImport ) )* ( (lv_ownedProperties_1_0= ruleProperty ) )+ ) )
            // InternalPropertyCS.g:84:2: ( ( (lv_ownedImports_0_0= ruleImport ) )* ( (lv_ownedProperties_1_0= ruleProperty ) )+ )
            {
            // InternalPropertyCS.g:84:2: ( ( (lv_ownedImports_0_0= ruleImport ) )* ( (lv_ownedProperties_1_0= ruleProperty ) )+ )
            // InternalPropertyCS.g:85:3: ( (lv_ownedImports_0_0= ruleImport ) )* ( (lv_ownedProperties_1_0= ruleProperty ) )+
            {
            // InternalPropertyCS.g:85:3: ( (lv_ownedImports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPropertyCS.g:86:4: (lv_ownedImports_0_0= ruleImport )
            	    {
            	    // InternalPropertyCS.g:86:4: (lv_ownedImports_0_0= ruleImport )
            	    // InternalPropertyCS.g:87:5: lv_ownedImports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDocumentAccess().getOwnedImportsImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_ownedImports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDocumentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedImports",
            	      						lv_ownedImports_0_0,
            	      						"org.tetrabox.property.cs.PropertyCS.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPropertyCS.g:104:3: ( (lv_ownedProperties_1_0= ruleProperty ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||(LA2_0>=21 && LA2_0<=24)||(LA2_0>=31 && LA2_0<=32)||(LA2_0>=36 && LA2_0<=39)||LA2_0==43) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPropertyCS.g:105:4: (lv_ownedProperties_1_0= ruleProperty )
            	    {
            	    // InternalPropertyCS.g:105:4: (lv_ownedProperties_1_0= ruleProperty )
            	    // InternalPropertyCS.g:106:5: lv_ownedProperties_1_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDocumentAccess().getOwnedPropertiesPropertyParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_ownedProperties_1_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDocumentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedProperties",
            	      						lv_ownedProperties_1_0,
            	      						"org.tetrabox.property.cs.PropertyCS.Property");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleImport"
    // InternalPropertyCS.g:127:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalPropertyCS.g:127:47: (iv_ruleImport= ruleImport EOF )
            // InternalPropertyCS.g:128:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalPropertyCS.g:134:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_IMPORT_URI ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalPropertyCS.g:140:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_IMPORT_URI ) ) ) )
            // InternalPropertyCS.g:141:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_IMPORT_URI ) ) )
            {
            // InternalPropertyCS.g:141:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_IMPORT_URI ) ) )
            // InternalPropertyCS.g:142:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_IMPORT_URI ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalPropertyCS.g:146:3: ( (lv_importURI_1_0= RULE_IMPORT_URI ) )
            // InternalPropertyCS.g:147:4: (lv_importURI_1_0= RULE_IMPORT_URI )
            {
            // InternalPropertyCS.g:147:4: (lv_importURI_1_0= RULE_IMPORT_URI )
            // InternalPropertyCS.g:148:5: lv_importURI_1_0= RULE_IMPORT_URI
            {
            lv_importURI_1_0=(Token)match(input,RULE_IMPORT_URI,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURIIMPORT_URITerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"importURI",
              						lv_importURI_1_0,
              						"org.tetrabox.property.cs.PropertyCS.IMPORT_URI");
              				
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleProperty"
    // InternalPropertyCS.g:168:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalPropertyCS.g:168:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalPropertyCS.g:169:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalPropertyCS.g:175:1: ruleProperty returns [EObject current=null] : ( ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) ) | ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) ) | ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) ) | this_UnaryProperty_44= ruleUnaryProperty | this_BinaryProperty_45= ruleBinaryProperty | (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' ) | (otherlv_49= '(' this_BinaryProperty_50= ruleBinaryProperty otherlv_51= ')' ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        EObject lv_left_1_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_right_10_0 = null;

        EObject lv_left_12_0 = null;

        EObject lv_left_13_0 = null;

        EObject lv_left_15_0 = null;

        EObject lv_left_18_0 = null;

        EObject lv_right_21_0 = null;

        EObject lv_left_23_0 = null;

        EObject lv_left_24_0 = null;

        EObject lv_left_26_0 = null;

        EObject lv_left_29_0 = null;

        EObject lv_right_32_0 = null;

        EObject lv_left_34_0 = null;

        EObject lv_left_35_0 = null;

        EObject lv_left_37_0 = null;

        EObject lv_left_40_0 = null;

        EObject lv_right_43_0 = null;

        EObject this_UnaryProperty_44 = null;

        EObject this_BinaryProperty_45 = null;

        EObject this_UnaryProperty_47 = null;

        EObject this_BinaryProperty_50 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:181:2: ( ( ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) ) | ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) ) | ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) ) | this_UnaryProperty_44= ruleUnaryProperty | this_BinaryProperty_45= ruleBinaryProperty | (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' ) | (otherlv_49= '(' this_BinaryProperty_50= ruleBinaryProperty otherlv_51= ')' ) ) )
            // InternalPropertyCS.g:182:2: ( ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) ) | ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) ) | ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) ) | this_UnaryProperty_44= ruleUnaryProperty | this_BinaryProperty_45= ruleBinaryProperty | (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' ) | (otherlv_49= '(' this_BinaryProperty_50= ruleBinaryProperty otherlv_51= ')' ) )
            {
            // InternalPropertyCS.g:182:2: ( ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) ) | ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) ) | ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) ) | this_UnaryProperty_44= ruleUnaryProperty | this_BinaryProperty_45= ruleBinaryProperty | (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' ) | (otherlv_49= '(' this_BinaryProperty_50= ruleBinaryProperty otherlv_51= ')' ) )
            int alt7=8;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalPropertyCS.g:183:3: ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) )
                    {
                    // InternalPropertyCS.g:183:3: ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) )
                    // InternalPropertyCS.g:184:4: () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) )
                    {
                    // InternalPropertyCS.g:184:4: ()
                    // InternalPropertyCS.g:185:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPropertyAccess().getAndPropertyAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:194:4: ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) )
                    int alt3=4;
                    alt3 = dfa3.predict(input);
                    switch (alt3) {
                        case 1 :
                            // InternalPropertyCS.g:195:5: ( (lv_left_1_0= ruleUnaryProperty ) )
                            {
                            // InternalPropertyCS.g:195:5: ( (lv_left_1_0= ruleUnaryProperty ) )
                            // InternalPropertyCS.g:196:6: (lv_left_1_0= ruleUnaryProperty )
                            {
                            // InternalPropertyCS.g:196:6: (lv_left_1_0= ruleUnaryProperty )
                            // InternalPropertyCS.g:197:7: lv_left_1_0= ruleUnaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_6);
                            lv_left_1_0=ruleUnaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyRule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_1_0,
                              								"org.tetrabox.property.cs.PropertyCS.UnaryProperty");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPropertyCS.g:215:5: ( (lv_left_2_0= ruleBinaryProperty ) )
                            {
                            // InternalPropertyCS.g:215:5: ( (lv_left_2_0= ruleBinaryProperty ) )
                            // InternalPropertyCS.g:216:6: (lv_left_2_0= ruleBinaryProperty )
                            {
                            // InternalPropertyCS.g:216:6: (lv_left_2_0= ruleBinaryProperty )
                            // InternalPropertyCS.g:217:7: lv_left_2_0= ruleBinaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_6);
                            lv_left_2_0=ruleBinaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyRule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_2_0,
                              								"org.tetrabox.property.cs.PropertyCS.BinaryProperty");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPropertyCS.g:235:5: (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' )
                            {
                            // InternalPropertyCS.g:235:5: (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' )
                            // InternalPropertyCS.g:236:6: otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_0_1_2_0());
                              					
                            }
                            // InternalPropertyCS.g:240:6: ( (lv_left_4_0= ruleUnaryProperty ) )
                            // InternalPropertyCS.g:241:7: (lv_left_4_0= ruleUnaryProperty )
                            {
                            // InternalPropertyCS.g:241:7: (lv_left_4_0= ruleUnaryProperty )
                            // InternalPropertyCS.g:242:8: lv_left_4_0= ruleUnaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_0_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_left_4_0=ruleUnaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPropertyRule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_4_0,
                              									"org.tetrabox.property.cs.PropertyCS.UnaryProperty");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_0_1_2_2());
                              					
                            }

                            }


                            }
                            break;
                        case 4 :
                            // InternalPropertyCS.g:265:5: (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' )
                            {
                            // InternalPropertyCS.g:265:5: (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' )
                            // InternalPropertyCS.g:266:6: otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')'
                            {
                            otherlv_6=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_0_1_3_0());
                              					
                            }
                            // InternalPropertyCS.g:270:6: ( (lv_left_7_0= ruleBinaryProperty ) )
                            // InternalPropertyCS.g:271:7: (lv_left_7_0= ruleBinaryProperty )
                            {
                            // InternalPropertyCS.g:271:7: (lv_left_7_0= ruleBinaryProperty )
                            // InternalPropertyCS.g:272:8: lv_left_7_0= ruleBinaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_0_1_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_left_7_0=ruleBinaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPropertyRule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_7_0,
                              									"org.tetrabox.property.cs.PropertyCS.BinaryProperty");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_0_1_3_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPropertyCS.g:295:4: ( ( 'and' )=>otherlv_9= 'and' )
                    // InternalPropertyCS.g:296:5: ( 'and' )=>otherlv_9= 'and'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getAndKeyword_0_2());
                      				
                    }

                    }

                    // InternalPropertyCS.g:302:4: ( (lv_right_10_0= ruleProperty ) )
                    // InternalPropertyCS.g:303:5: (lv_right_10_0= ruleProperty )
                    {
                    // InternalPropertyCS.g:303:5: (lv_right_10_0= ruleProperty )
                    // InternalPropertyCS.g:304:6: lv_right_10_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPropertyAccess().getRightPropertyParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_10_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_10_0,
                      							"org.tetrabox.property.cs.PropertyCS.Property");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPropertyCS.g:323:3: ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) )
                    {
                    // InternalPropertyCS.g:323:3: ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) )
                    // InternalPropertyCS.g:324:4: () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) )
                    {
                    // InternalPropertyCS.g:324:4: ()
                    // InternalPropertyCS.g:325:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPropertyAccess().getOrPropertyBooleanPropertyAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:334:4: ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) )
                    int alt4=4;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // InternalPropertyCS.g:335:5: ( (lv_left_12_0= ruleUnaryProperty ) )
                            {
                            // InternalPropertyCS.g:335:5: ( (lv_left_12_0= ruleUnaryProperty ) )
                            // InternalPropertyCS.g:336:6: (lv_left_12_0= ruleUnaryProperty )
                            {
                            // InternalPropertyCS.g:336:6: (lv_left_12_0= ruleUnaryProperty )
                            // InternalPropertyCS.g:337:7: lv_left_12_0= ruleUnaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_11);
                            lv_left_12_0=ruleUnaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyRule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_12_0,
                              								"org.tetrabox.property.cs.PropertyCS.UnaryProperty");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPropertyCS.g:355:5: ( (lv_left_13_0= ruleBinaryProperty ) )
                            {
                            // InternalPropertyCS.g:355:5: ( (lv_left_13_0= ruleBinaryProperty ) )
                            // InternalPropertyCS.g:356:6: (lv_left_13_0= ruleBinaryProperty )
                            {
                            // InternalPropertyCS.g:356:6: (lv_left_13_0= ruleBinaryProperty )
                            // InternalPropertyCS.g:357:7: lv_left_13_0= ruleBinaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_11);
                            lv_left_13_0=ruleBinaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyRule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_13_0,
                              								"org.tetrabox.property.cs.PropertyCS.BinaryProperty");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPropertyCS.g:375:5: (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' )
                            {
                            // InternalPropertyCS.g:375:5: (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' )
                            // InternalPropertyCS.g:376:6: otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')'
                            {
                            otherlv_14=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_14, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_1_1_2_0());
                              					
                            }
                            // InternalPropertyCS.g:380:6: ( (lv_left_15_0= ruleUnaryProperty ) )
                            // InternalPropertyCS.g:381:7: (lv_left_15_0= ruleUnaryProperty )
                            {
                            // InternalPropertyCS.g:381:7: (lv_left_15_0= ruleUnaryProperty )
                            // InternalPropertyCS.g:382:8: lv_left_15_0= ruleUnaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_1_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_left_15_0=ruleUnaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPropertyRule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_15_0,
                              									"org.tetrabox.property.cs.PropertyCS.UnaryProperty");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_16=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_16, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_1_1_2_2());
                              					
                            }

                            }


                            }
                            break;
                        case 4 :
                            // InternalPropertyCS.g:405:5: (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' )
                            {
                            // InternalPropertyCS.g:405:5: (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' )
                            // InternalPropertyCS.g:406:6: otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')'
                            {
                            otherlv_17=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_17, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_1_1_3_0());
                              					
                            }
                            // InternalPropertyCS.g:410:6: ( (lv_left_18_0= ruleBinaryProperty ) )
                            // InternalPropertyCS.g:411:7: (lv_left_18_0= ruleBinaryProperty )
                            {
                            // InternalPropertyCS.g:411:7: (lv_left_18_0= ruleBinaryProperty )
                            // InternalPropertyCS.g:412:8: lv_left_18_0= ruleBinaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_1_1_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_left_18_0=ruleBinaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPropertyRule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_18_0,
                              									"org.tetrabox.property.cs.PropertyCS.BinaryProperty");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_19=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_19, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_1_1_3_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPropertyCS.g:435:4: ( ( 'or' )=>otherlv_20= 'or' )
                    // InternalPropertyCS.g:436:5: ( 'or' )=>otherlv_20= 'or'
                    {
                    otherlv_20=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_20, grammarAccess.getPropertyAccess().getOrKeyword_1_2());
                      				
                    }

                    }

                    // InternalPropertyCS.g:442:4: ( (lv_right_21_0= ruleProperty ) )
                    // InternalPropertyCS.g:443:5: (lv_right_21_0= ruleProperty )
                    {
                    // InternalPropertyCS.g:443:5: (lv_right_21_0= ruleProperty )
                    // InternalPropertyCS.g:444:6: lv_right_21_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPropertyAccess().getRightPropertyParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_21_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_21_0,
                      							"org.tetrabox.property.cs.PropertyCS.Property");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPropertyCS.g:463:3: ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:463:3: ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:464:4: () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:464:4: ()
                    // InternalPropertyCS.g:465:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPropertyAccess().getAbortPropertyAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:474:4: ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) )
                    int alt5=4;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1 :
                            // InternalPropertyCS.g:475:5: ( (lv_left_23_0= ruleUnaryProperty ) )
                            {
                            // InternalPropertyCS.g:475:5: ( (lv_left_23_0= ruleUnaryProperty ) )
                            // InternalPropertyCS.g:476:6: (lv_left_23_0= ruleUnaryProperty )
                            {
                            // InternalPropertyCS.g:476:6: (lv_left_23_0= ruleUnaryProperty )
                            // InternalPropertyCS.g:477:7: lv_left_23_0= ruleUnaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_left_23_0=ruleUnaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyRule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_23_0,
                              								"org.tetrabox.property.cs.PropertyCS.UnaryProperty");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPropertyCS.g:495:5: ( (lv_left_24_0= ruleBinaryProperty ) )
                            {
                            // InternalPropertyCS.g:495:5: ( (lv_left_24_0= ruleBinaryProperty ) )
                            // InternalPropertyCS.g:496:6: (lv_left_24_0= ruleBinaryProperty )
                            {
                            // InternalPropertyCS.g:496:6: (lv_left_24_0= ruleBinaryProperty )
                            // InternalPropertyCS.g:497:7: lv_left_24_0= ruleBinaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_left_24_0=ruleBinaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyRule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_24_0,
                              								"org.tetrabox.property.cs.PropertyCS.BinaryProperty");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPropertyCS.g:515:5: (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' )
                            {
                            // InternalPropertyCS.g:515:5: (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' )
                            // InternalPropertyCS.g:516:6: otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')'
                            {
                            otherlv_25=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_25, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_2_1_2_0());
                              					
                            }
                            // InternalPropertyCS.g:520:6: ( (lv_left_26_0= ruleUnaryProperty ) )
                            // InternalPropertyCS.g:521:7: (lv_left_26_0= ruleUnaryProperty )
                            {
                            // InternalPropertyCS.g:521:7: (lv_left_26_0= ruleUnaryProperty )
                            // InternalPropertyCS.g:522:8: lv_left_26_0= ruleUnaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_left_26_0=ruleUnaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPropertyRule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_26_0,
                              									"org.tetrabox.property.cs.PropertyCS.UnaryProperty");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_27=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_27, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_2_1_2_2());
                              					
                            }

                            }


                            }
                            break;
                        case 4 :
                            // InternalPropertyCS.g:545:5: (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' )
                            {
                            // InternalPropertyCS.g:545:5: (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' )
                            // InternalPropertyCS.g:546:6: otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')'
                            {
                            otherlv_28=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_28, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_2_1_3_0());
                              					
                            }
                            // InternalPropertyCS.g:550:6: ( (lv_left_29_0= ruleBinaryProperty ) )
                            // InternalPropertyCS.g:551:7: (lv_left_29_0= ruleBinaryProperty )
                            {
                            // InternalPropertyCS.g:551:7: (lv_left_29_0= ruleBinaryProperty )
                            // InternalPropertyCS.g:552:8: lv_left_29_0= ruleBinaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_2_1_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_left_29_0=ruleBinaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPropertyRule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_29_0,
                              									"org.tetrabox.property.cs.PropertyCS.BinaryProperty");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_30=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_30, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_2_1_3_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPropertyCS.g:575:4: ( ( 'abort' )=>otherlv_31= 'abort' )
                    // InternalPropertyCS.g:576:5: ( 'abort' )=>otherlv_31= 'abort'
                    {
                    otherlv_31=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_31, grammarAccess.getPropertyAccess().getAbortKeyword_2_2());
                      				
                    }

                    }

                    // InternalPropertyCS.g:582:4: ( (lv_right_32_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:583:5: (lv_right_32_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:583:5: (lv_right_32_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:584:6: lv_right_32_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPropertyAccess().getRightSequenceTerminalParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_32_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_32_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPropertyCS.g:603:3: ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:603:3: ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:604:4: () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:604:4: ()
                    // InternalPropertyCS.g:605:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPropertyAccess().getUntilPropertyAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:614:4: ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) )
                    int alt6=4;
                    alt6 = dfa6.predict(input);
                    switch (alt6) {
                        case 1 :
                            // InternalPropertyCS.g:615:5: ( (lv_left_34_0= ruleUnaryProperty ) )
                            {
                            // InternalPropertyCS.g:615:5: ( (lv_left_34_0= ruleUnaryProperty ) )
                            // InternalPropertyCS.g:616:6: (lv_left_34_0= ruleUnaryProperty )
                            {
                            // InternalPropertyCS.g:616:6: (lv_left_34_0= ruleUnaryProperty )
                            // InternalPropertyCS.g:617:7: lv_left_34_0= ruleUnaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_14);
                            lv_left_34_0=ruleUnaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyRule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_34_0,
                              								"org.tetrabox.property.cs.PropertyCS.UnaryProperty");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPropertyCS.g:635:5: ( (lv_left_35_0= ruleBinaryProperty ) )
                            {
                            // InternalPropertyCS.g:635:5: ( (lv_left_35_0= ruleBinaryProperty ) )
                            // InternalPropertyCS.g:636:6: (lv_left_35_0= ruleBinaryProperty )
                            {
                            // InternalPropertyCS.g:636:6: (lv_left_35_0= ruleBinaryProperty )
                            // InternalPropertyCS.g:637:7: lv_left_35_0= ruleBinaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_3_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_14);
                            lv_left_35_0=ruleBinaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyRule());
                              							}
                              							set(
                              								current,
                              								"left",
                              								lv_left_35_0,
                              								"org.tetrabox.property.cs.PropertyCS.BinaryProperty");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPropertyCS.g:655:5: (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' )
                            {
                            // InternalPropertyCS.g:655:5: (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' )
                            // InternalPropertyCS.g:656:6: otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')'
                            {
                            otherlv_36=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_36, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_3_1_2_0());
                              					
                            }
                            // InternalPropertyCS.g:660:6: ( (lv_left_37_0= ruleUnaryProperty ) )
                            // InternalPropertyCS.g:661:7: (lv_left_37_0= ruleUnaryProperty )
                            {
                            // InternalPropertyCS.g:661:7: (lv_left_37_0= ruleUnaryProperty )
                            // InternalPropertyCS.g:662:8: lv_left_37_0= ruleUnaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_3_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_left_37_0=ruleUnaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPropertyRule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_37_0,
                              									"org.tetrabox.property.cs.PropertyCS.UnaryProperty");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_38=(Token)match(input,15,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_38, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_3_1_2_2());
                              					
                            }

                            }


                            }
                            break;
                        case 4 :
                            // InternalPropertyCS.g:685:5: (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' )
                            {
                            // InternalPropertyCS.g:685:5: (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' )
                            // InternalPropertyCS.g:686:6: otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')'
                            {
                            otherlv_39=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_39, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_3_1_3_0());
                              					
                            }
                            // InternalPropertyCS.g:690:6: ( (lv_left_40_0= ruleBinaryProperty ) )
                            // InternalPropertyCS.g:691:7: (lv_left_40_0= ruleBinaryProperty )
                            {
                            // InternalPropertyCS.g:691:7: (lv_left_40_0= ruleBinaryProperty )
                            // InternalPropertyCS.g:692:8: lv_left_40_0= ruleBinaryProperty
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_3_1_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_left_40_0=ruleBinaryProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPropertyRule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_40_0,
                              									"org.tetrabox.property.cs.PropertyCS.BinaryProperty");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_41=(Token)match(input,15,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_41, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_3_1_3_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPropertyCS.g:715:4: ( ( 'until' )=>otherlv_42= 'until' )
                    // InternalPropertyCS.g:716:5: ( 'until' )=>otherlv_42= 'until'
                    {
                    otherlv_42=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_42, grammarAccess.getPropertyAccess().getUntilKeyword_3_2());
                      				
                    }

                    }

                    // InternalPropertyCS.g:722:4: ( (lv_right_43_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:723:5: (lv_right_43_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:723:5: (lv_right_43_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:724:6: lv_right_43_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPropertyAccess().getRightSequenceTerminalParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_43_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_43_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPropertyCS.g:743:3: this_UnaryProperty_44= ruleUnaryProperty
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyAccess().getUnaryPropertyParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryProperty_44=ruleUnaryProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryProperty_44;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPropertyCS.g:755:3: this_BinaryProperty_45= ruleBinaryProperty
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyAccess().getBinaryPropertyParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinaryProperty_45=ruleBinaryProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinaryProperty_45;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalPropertyCS.g:767:3: (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' )
                    {
                    // InternalPropertyCS.g:767:3: (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' )
                    // InternalPropertyCS.g:768:4: otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')'
                    {
                    otherlv_46=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_46, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPropertyAccess().getUnaryPropertyParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_UnaryProperty_47=ruleUnaryProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_UnaryProperty_47;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_48=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_48, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPropertyCS.g:789:3: (otherlv_49= '(' this_BinaryProperty_50= ruleBinaryProperty otherlv_51= ')' )
                    {
                    // InternalPropertyCS.g:789:3: (otherlv_49= '(' this_BinaryProperty_50= ruleBinaryProperty otherlv_51= ')' )
                    // InternalPropertyCS.g:790:4: otherlv_49= '(' this_BinaryProperty_50= ruleBinaryProperty otherlv_51= ')'
                    {
                    otherlv_49=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_49, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPropertyAccess().getBinaryPropertyParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_BinaryProperty_50=ruleBinaryProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BinaryProperty_50;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_51=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_7_2());
                      			
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleUnaryProperty"
    // InternalPropertyCS.g:814:1: entryRuleUnaryProperty returns [EObject current=null] : iv_ruleUnaryProperty= ruleUnaryProperty EOF ;
    public final EObject entryRuleUnaryProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryProperty = null;


        try {
            // InternalPropertyCS.g:814:54: (iv_ruleUnaryProperty= ruleUnaryProperty EOF )
            // InternalPropertyCS.g:815:2: iv_ruleUnaryProperty= ruleUnaryProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryProperty=ruleUnaryProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryProperty; 
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
    // $ANTLR end "entryRuleUnaryProperty"


    // $ANTLR start "ruleUnaryProperty"
    // InternalPropertyCS.g:821:1: ruleUnaryProperty returns [EObject current=null] : ( ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_operand_3_0= ruleSequence ) ) ) | ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' ) | ( () otherlv_8= 'always' ( (lv_operand_9_0= ruleProperty ) ) ) | ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) ) | ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) ) | ( () otherlv_17= 'next_e' ( (lv_operand_18_0= ruleSequenceTerminal ) ) ) | ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) ) | ( () otherlv_23= 'eventually!' ( (lv_operand_24_0= ruleSequence ) ) ) ) ;
    public final EObject ruleUnaryProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        EObject lv_operand_1_0 = null;

        EObject lv_operand_3_0 = null;

        EObject lv_operand_5_0 = null;

        EObject lv_operand_9_0 = null;

        EObject lv_operand_12_0 = null;

        EObject lv_operand_15_0 = null;

        EObject lv_operand_18_0 = null;

        EObject lv_operand_21_0 = null;

        EObject lv_operand_24_0 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:827:2: ( ( ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_operand_3_0= ruleSequence ) ) ) | ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' ) | ( () otherlv_8= 'always' ( (lv_operand_9_0= ruleProperty ) ) ) | ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) ) | ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) ) | ( () otherlv_17= 'next_e' ( (lv_operand_18_0= ruleSequenceTerminal ) ) ) | ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) ) | ( () otherlv_23= 'eventually!' ( (lv_operand_24_0= ruleSequence ) ) ) ) )
            // InternalPropertyCS.g:828:2: ( ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_operand_3_0= ruleSequence ) ) ) | ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' ) | ( () otherlv_8= 'always' ( (lv_operand_9_0= ruleProperty ) ) ) | ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) ) | ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) ) | ( () otherlv_17= 'next_e' ( (lv_operand_18_0= ruleSequenceTerminal ) ) ) | ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) ) | ( () otherlv_23= 'eventually!' ( (lv_operand_24_0= ruleSequence ) ) ) )
            {
            // InternalPropertyCS.g:828:2: ( ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_operand_3_0= ruleSequence ) ) ) | ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' ) | ( () otherlv_8= 'always' ( (lv_operand_9_0= ruleProperty ) ) ) | ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) ) | ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) ) | ( () otherlv_17= 'next_e' ( (lv_operand_18_0= ruleSequenceTerminal ) ) ) | ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) ) | ( () otherlv_23= 'eventually!' ( (lv_operand_24_0= ruleSequence ) ) ) )
            int alt8=9;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalPropertyCS.g:829:3: ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:829:3: ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:830:4: () ( (lv_operand_1_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:830:4: ()
                    // InternalPropertyCS.g:831:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryPropertyAccess().getBooleanPropertyAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:840:4: ( (lv_operand_1_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:841:5: (lv_operand_1_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:841:5: (lv_operand_1_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:842:6: lv_operand_1_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_1_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_1_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPropertyCS.g:861:3: ( () ( (lv_operand_3_0= ruleSequence ) ) )
                    {
                    // InternalPropertyCS.g:861:3: ( () ( (lv_operand_3_0= ruleSequence ) ) )
                    // InternalPropertyCS.g:862:4: () ( (lv_operand_3_0= ruleSequence ) )
                    {
                    // InternalPropertyCS.g:862:4: ()
                    // InternalPropertyCS.g:863:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryPropertyAccess().getSequencePropertyAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:872:4: ( (lv_operand_3_0= ruleSequence ) )
                    // InternalPropertyCS.g:873:5: (lv_operand_3_0= ruleSequence )
                    {
                    // InternalPropertyCS.g:873:5: (lv_operand_3_0= ruleSequence )
                    // InternalPropertyCS.g:874:6: lv_operand_3_0= ruleSequence
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_3_0=ruleSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_3_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.Sequence");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPropertyCS.g:893:3: ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' )
                    {
                    // InternalPropertyCS.g:893:3: ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' )
                    // InternalPropertyCS.g:894:4: () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!'
                    {
                    // InternalPropertyCS.g:894:4: ()
                    // InternalPropertyCS.g:895:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryPropertyAccess().getSequenceTightPropertyAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:904:4: ( (lv_operand_5_0= ruleSequence ) )
                    // InternalPropertyCS.g:905:5: (lv_operand_5_0= ruleSequence )
                    {
                    // InternalPropertyCS.g:905:5: (lv_operand_5_0= ruleSequence )
                    // InternalPropertyCS.g:906:6: lv_operand_5_0= ruleSequence
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_operand_5_0=ruleSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_5_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.Sequence");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getUnaryPropertyAccess().getExclamationMarkKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPropertyCS.g:929:3: ( () otherlv_8= 'always' ( (lv_operand_9_0= ruleProperty ) ) )
                    {
                    // InternalPropertyCS.g:929:3: ( () otherlv_8= 'always' ( (lv_operand_9_0= ruleProperty ) ) )
                    // InternalPropertyCS.g:930:4: () otherlv_8= 'always' ( (lv_operand_9_0= ruleProperty ) )
                    {
                    // InternalPropertyCS.g:930:4: ()
                    // InternalPropertyCS.g:931:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryPropertyAccess().getAlwaysPropertyAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getUnaryPropertyAccess().getAlwaysKeyword_3_1());
                      			
                    }
                    // InternalPropertyCS.g:944:4: ( (lv_operand_9_0= ruleProperty ) )
                    // InternalPropertyCS.g:945:5: (lv_operand_9_0= ruleProperty )
                    {
                    // InternalPropertyCS.g:945:5: (lv_operand_9_0= ruleProperty )
                    // InternalPropertyCS.g:946:6: lv_operand_9_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandPropertyParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_9_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_9_0,
                      							"org.tetrabox.property.cs.PropertyCS.Property");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPropertyCS.g:965:3: ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:965:3: ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:966:4: () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:966:4: ()
                    // InternalPropertyCS.g:967:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryPropertyAccess().getNeverBooleanPropertyAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getUnaryPropertyAccess().getNeverKeyword_4_1());
                      			
                    }
                    // InternalPropertyCS.g:980:4: ( (lv_operand_12_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:981:5: (lv_operand_12_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:981:5: (lv_operand_12_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:982:6: lv_operand_12_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_12_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_12_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPropertyCS.g:1001:3: ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) )
                    {
                    // InternalPropertyCS.g:1001:3: ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) )
                    // InternalPropertyCS.g:1002:4: () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) )
                    {
                    // InternalPropertyCS.g:1002:4: ()
                    // InternalPropertyCS.g:1003:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryPropertyAccess().getNeverSequencePropertyAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_14=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getUnaryPropertyAccess().getNeverKeyword_5_1());
                      			
                    }
                    // InternalPropertyCS.g:1016:4: ( (lv_operand_15_0= ruleSequence ) )
                    // InternalPropertyCS.g:1017:5: (lv_operand_15_0= ruleSequence )
                    {
                    // InternalPropertyCS.g:1017:5: (lv_operand_15_0= ruleSequence )
                    // InternalPropertyCS.g:1018:6: lv_operand_15_0= ruleSequence
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_15_0=ruleSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_15_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.Sequence");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPropertyCS.g:1037:3: ( () otherlv_17= 'next_e' ( (lv_operand_18_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:1037:3: ( () otherlv_17= 'next_e' ( (lv_operand_18_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:1038:4: () otherlv_17= 'next_e' ( (lv_operand_18_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:1038:4: ()
                    // InternalPropertyCS.g:1039:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryPropertyAccess().getNextEPropertyAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_17=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getUnaryPropertyAccess().getNext_eKeyword_6_1());
                      			
                    }
                    // InternalPropertyCS.g:1052:4: ( (lv_operand_18_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1053:5: (lv_operand_18_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1053:5: (lv_operand_18_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1054:6: lv_operand_18_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_18_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_18_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalPropertyCS.g:1073:3: ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:1073:3: ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:1074:4: () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:1074:4: ()
                    // InternalPropertyCS.g:1075:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryPropertyAccess().getEventuallyBooleanPropertyAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_20=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getUnaryPropertyAccess().getEventuallyKeyword_7_1());
                      			
                    }
                    // InternalPropertyCS.g:1088:4: ( (lv_operand_21_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1089:5: (lv_operand_21_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1089:5: (lv_operand_21_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1090:6: lv_operand_21_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_21_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_21_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalPropertyCS.g:1109:3: ( () otherlv_23= 'eventually!' ( (lv_operand_24_0= ruleSequence ) ) )
                    {
                    // InternalPropertyCS.g:1109:3: ( () otherlv_23= 'eventually!' ( (lv_operand_24_0= ruleSequence ) ) )
                    // InternalPropertyCS.g:1110:4: () otherlv_23= 'eventually!' ( (lv_operand_24_0= ruleSequence ) )
                    {
                    // InternalPropertyCS.g:1110:4: ()
                    // InternalPropertyCS.g:1111:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryPropertyAccess().getEventuallySequencePropertyAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_23=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getUnaryPropertyAccess().getEventuallyKeyword_8_1());
                      			
                    }
                    // InternalPropertyCS.g:1124:4: ( (lv_operand_24_0= ruleSequence ) )
                    // InternalPropertyCS.g:1125:5: (lv_operand_24_0= ruleSequence )
                    {
                    // InternalPropertyCS.g:1125:5: (lv_operand_24_0= ruleSequence )
                    // InternalPropertyCS.g:1126:6: lv_operand_24_0= ruleSequence
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_24_0=ruleSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_24_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.Sequence");
                      						afterParserOrEnumRuleCall();
                      					
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
    // $ANTLR end "ruleUnaryProperty"


    // $ANTLR start "entryRuleBinaryProperty"
    // InternalPropertyCS.g:1148:1: entryRuleBinaryProperty returns [EObject current=null] : iv_ruleBinaryProperty= ruleBinaryProperty EOF ;
    public final EObject entryRuleBinaryProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryProperty = null;


        try {
            // InternalPropertyCS.g:1148:55: (iv_ruleBinaryProperty= ruleBinaryProperty EOF )
            // InternalPropertyCS.g:1149:2: iv_ruleBinaryProperty= ruleBinaryProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryProperty=ruleBinaryProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryProperty; 
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
    // $ANTLR end "entryRuleBinaryProperty"


    // $ANTLR start "ruleBinaryProperty"
    // InternalPropertyCS.g:1155:1: ruleBinaryProperty returns [EObject current=null] : ( ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) ) | ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) ) | ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) ) | ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) ) | ( () otherlv_29= 'next_event_a' otherlv_30= '(' ( (lv_left_31_0= ruleSequenceTerminal ) ) otherlv_32= ')' otherlv_33= '[' ( (lv_range_34_0= ruleRange ) ) otherlv_35= ']' otherlv_36= '(' ( (lv_right_37_0= ruleProperty ) ) otherlv_38= ')' ) ) ;
    public final EObject ruleBinaryProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_left_5_0 = null;

        EObject lv_right_7_0 = null;

        EObject lv_left_9_0 = null;

        EObject lv_right_11_0 = null;

        EObject lv_left_13_0 = null;

        EObject lv_right_15_0 = null;

        EObject lv_left_17_0 = null;

        EObject lv_right_19_0 = null;

        EObject lv_left_21_0 = null;

        EObject lv_right_23_0 = null;

        EObject lv_left_25_0 = null;

        EObject lv_right_27_0 = null;

        EObject lv_left_31_0 = null;

        EObject lv_range_34_0 = null;

        EObject lv_right_37_0 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:1161:2: ( ( ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) ) | ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) ) | ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) ) | ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) ) | ( () otherlv_29= 'next_event_a' otherlv_30= '(' ( (lv_left_31_0= ruleSequenceTerminal ) ) otherlv_32= ')' otherlv_33= '[' ( (lv_range_34_0= ruleRange ) ) otherlv_35= ']' otherlv_36= '(' ( (lv_right_37_0= ruleProperty ) ) otherlv_38= ')' ) ) )
            // InternalPropertyCS.g:1162:2: ( ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) ) | ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) ) | ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) ) | ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) ) | ( () otherlv_29= 'next_event_a' otherlv_30= '(' ( (lv_left_31_0= ruleSequenceTerminal ) ) otherlv_32= ')' otherlv_33= '[' ( (lv_range_34_0= ruleRange ) ) otherlv_35= ']' otherlv_36= '(' ( (lv_right_37_0= ruleProperty ) ) otherlv_38= ')' ) )
            {
            // InternalPropertyCS.g:1162:2: ( ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) ) | ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) ) | ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) ) | ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) ) | ( () otherlv_29= 'next_event_a' otherlv_30= '(' ( (lv_left_31_0= ruleSequenceTerminal ) ) otherlv_32= ')' otherlv_33= '[' ( (lv_range_34_0= ruleRange ) ) otherlv_35= ']' otherlv_36= '(' ( (lv_right_37_0= ruleProperty ) ) otherlv_38= ')' ) )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalPropertyCS.g:1163:3: ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) )
                    {
                    // InternalPropertyCS.g:1163:3: ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) )
                    // InternalPropertyCS.g:1164:4: () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) )
                    {
                    // InternalPropertyCS.g:1164:4: ()
                    // InternalPropertyCS.g:1165:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryPropertyAccess().getOrBooleanPropertyPropertyAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:1174:4: ( (lv_left_1_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1175:5: (lv_left_1_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1175:5: (lv_left_1_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1176:6: lv_left_1_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_left_1_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_1_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBinaryPropertyAccess().getOrKeyword_0_2());
                      			
                    }
                    // InternalPropertyCS.g:1197:4: ( (lv_right_3_0= ruleProperty ) )
                    // InternalPropertyCS.g:1198:5: (lv_right_3_0= ruleProperty )
                    {
                    // InternalPropertyCS.g:1198:5: (lv_right_3_0= ruleProperty )
                    // InternalPropertyCS.g:1199:6: lv_right_3_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"org.tetrabox.property.cs.PropertyCS.Property");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPropertyCS.g:1218:3: ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) )
                    {
                    // InternalPropertyCS.g:1218:3: ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) )
                    // InternalPropertyCS.g:1219:4: () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) )
                    {
                    // InternalPropertyCS.g:1219:4: ()
                    // InternalPropertyCS.g:1220:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryPropertyAccess().getImpliesPropertyAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:1229:4: ( (lv_left_5_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1230:5: (lv_left_5_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1230:5: (lv_left_5_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1231:6: lv_left_5_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_left_5_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_5_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getBinaryPropertyAccess().getHyphenMinusGreaterThanSignKeyword_1_2());
                      			
                    }
                    // InternalPropertyCS.g:1252:4: ( (lv_right_7_0= ruleProperty ) )
                    // InternalPropertyCS.g:1253:5: (lv_right_7_0= ruleProperty )
                    {
                    // InternalPropertyCS.g:1253:5: (lv_right_7_0= ruleProperty )
                    // InternalPropertyCS.g:1254:6: lv_right_7_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_7_0,
                      							"org.tetrabox.property.cs.PropertyCS.Property");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPropertyCS.g:1273:3: ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:1273:3: ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:1274:4: () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:1274:4: ()
                    // InternalPropertyCS.g:1275:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryPropertyAccess().getEquivalencePropertyAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:1284:4: ( (lv_left_9_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1285:5: (lv_left_9_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1285:5: (lv_left_9_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1286:6: lv_left_9_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_left_9_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_9_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getBinaryPropertyAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_2_2());
                      			
                    }
                    // InternalPropertyCS.g:1307:4: ( (lv_right_11_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1308:5: (lv_right_11_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1308:5: (lv_right_11_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1309:6: lv_right_11_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightSequenceTerminalParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_11_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_11_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPropertyCS.g:1328:3: ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:1328:3: ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:1329:4: () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:1329:4: ()
                    // InternalPropertyCS.g:1330:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryPropertyAccess().getOverlappingUntilPropertyAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:1339:4: ( (lv_left_13_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1340:5: (lv_left_13_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1340:5: (lv_left_13_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1341:6: lv_left_13_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_left_13_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_13_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getBinaryPropertyAccess().getUntil_Keyword_3_2());
                      			
                    }
                    // InternalPropertyCS.g:1362:4: ( (lv_right_15_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1363:5: (lv_right_15_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1363:5: (lv_right_15_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1364:6: lv_right_15_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightSequenceTerminalParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_15_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_15_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPropertyCS.g:1383:3: ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:1383:3: ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:1384:4: () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:1384:4: ()
                    // InternalPropertyCS.g:1385:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryPropertyAccess().getBeforePropertyAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:1394:4: ( (lv_left_17_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1395:5: (lv_left_17_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1395:5: (lv_left_17_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1396:6: lv_left_17_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_left_17_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_17_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getBinaryPropertyAccess().getBeforeKeyword_4_2());
                      			
                    }
                    // InternalPropertyCS.g:1417:4: ( (lv_right_19_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1418:5: (lv_right_19_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1418:5: (lv_right_19_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1419:6: lv_right_19_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightSequenceTerminalParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_19_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_19_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPropertyCS.g:1438:3: ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) )
                    {
                    // InternalPropertyCS.g:1438:3: ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) )
                    // InternalPropertyCS.g:1439:4: () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) )
                    {
                    // InternalPropertyCS.g:1439:4: ()
                    // InternalPropertyCS.g:1440:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryPropertyAccess().getSuffixImplicationPropertyAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:1449:4: ( (lv_left_21_0= ruleSequence ) )
                    // InternalPropertyCS.g:1450:5: (lv_left_21_0= ruleSequence )
                    {
                    // InternalPropertyCS.g:1450:5: (lv_left_21_0= ruleSequence )
                    // InternalPropertyCS.g:1451:6: lv_left_21_0= ruleSequence
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_left_21_0=ruleSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_21_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.Sequence");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,29,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getBinaryPropertyAccess().getVerticalLineEqualsSignGreaterThanSignKeyword_5_2());
                      			
                    }
                    // InternalPropertyCS.g:1472:4: ( (lv_right_23_0= ruleProperty ) )
                    // InternalPropertyCS.g:1473:5: (lv_right_23_0= ruleProperty )
                    {
                    // InternalPropertyCS.g:1473:5: (lv_right_23_0= ruleProperty )
                    // InternalPropertyCS.g:1474:6: lv_right_23_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_5_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_23_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_23_0,
                      							"org.tetrabox.property.cs.PropertyCS.Property");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPropertyCS.g:1493:3: ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) )
                    {
                    // InternalPropertyCS.g:1493:3: ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) )
                    // InternalPropertyCS.g:1494:4: () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) )
                    {
                    // InternalPropertyCS.g:1494:4: ()
                    // InternalPropertyCS.g:1495:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryPropertyAccess().getOverlappingSuffixImplicationPropertyAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPropertyCS.g:1504:4: ( (lv_left_25_0= ruleSequence ) )
                    // InternalPropertyCS.g:1505:5: (lv_left_25_0= ruleSequence )
                    {
                    // InternalPropertyCS.g:1505:5: (lv_left_25_0= ruleSequence )
                    // InternalPropertyCS.g:1506:6: lv_left_25_0= ruleSequence
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_left_25_0=ruleSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_25_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.Sequence");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,30,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getBinaryPropertyAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_6_2());
                      			
                    }
                    // InternalPropertyCS.g:1527:4: ( (lv_right_27_0= ruleProperty ) )
                    // InternalPropertyCS.g:1528:5: (lv_right_27_0= ruleProperty )
                    {
                    // InternalPropertyCS.g:1528:5: (lv_right_27_0= ruleProperty )
                    // InternalPropertyCS.g:1529:6: lv_right_27_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_6_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_27_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_27_0,
                      							"org.tetrabox.property.cs.PropertyCS.Property");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalPropertyCS.g:1548:3: ( () otherlv_29= 'next_event_a' otherlv_30= '(' ( (lv_left_31_0= ruleSequenceTerminal ) ) otherlv_32= ')' otherlv_33= '[' ( (lv_range_34_0= ruleRange ) ) otherlv_35= ']' otherlv_36= '(' ( (lv_right_37_0= ruleProperty ) ) otherlv_38= ')' )
                    {
                    // InternalPropertyCS.g:1548:3: ( () otherlv_29= 'next_event_a' otherlv_30= '(' ( (lv_left_31_0= ruleSequenceTerminal ) ) otherlv_32= ')' otherlv_33= '[' ( (lv_range_34_0= ruleRange ) ) otherlv_35= ']' otherlv_36= '(' ( (lv_right_37_0= ruleProperty ) ) otherlv_38= ')' )
                    // InternalPropertyCS.g:1549:4: () otherlv_29= 'next_event_a' otherlv_30= '(' ( (lv_left_31_0= ruleSequenceTerminal ) ) otherlv_32= ')' otherlv_33= '[' ( (lv_range_34_0= ruleRange ) ) otherlv_35= ']' otherlv_36= '(' ( (lv_right_37_0= ruleProperty ) ) otherlv_38= ')'
                    {
                    // InternalPropertyCS.g:1549:4: ()
                    // InternalPropertyCS.g:1550:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBinaryPropertyAccess().getNextEventAPropertyAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_29=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getBinaryPropertyAccess().getNext_event_aKeyword_7_1());
                      			
                    }
                    otherlv_30=(Token)match(input,14,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getBinaryPropertyAccess().getLeftParenthesisKeyword_7_2());
                      			
                    }
                    // InternalPropertyCS.g:1567:4: ( (lv_left_31_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1568:5: (lv_left_31_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1568:5: (lv_left_31_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1569:6: lv_left_31_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_7_3_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_left_31_0=ruleSequenceTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_31_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.SequenceTerminal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,15,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_32, grammarAccess.getBinaryPropertyAccess().getRightParenthesisKeyword_7_4());
                      			
                    }
                    otherlv_33=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getBinaryPropertyAccess().getLeftSquareBracketKeyword_7_5());
                      			
                    }
                    // InternalPropertyCS.g:1594:4: ( (lv_range_34_0= ruleRange ) )
                    // InternalPropertyCS.g:1595:5: (lv_range_34_0= ruleRange )
                    {
                    // InternalPropertyCS.g:1595:5: (lv_range_34_0= ruleRange )
                    // InternalPropertyCS.g:1596:6: lv_range_34_0= ruleRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRangeRangeParserRuleCall_7_6_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_range_34_0=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"range",
                      							lv_range_34_0,
                      							"org.tetrabox.sequence.cs.SequenceCS.Range");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getBinaryPropertyAccess().getRightSquareBracketKeyword_7_7());
                      			
                    }
                    otherlv_36=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getBinaryPropertyAccess().getLeftParenthesisKeyword_7_8());
                      			
                    }
                    // InternalPropertyCS.g:1621:4: ( (lv_right_37_0= ruleProperty ) )
                    // InternalPropertyCS.g:1622:5: (lv_right_37_0= ruleProperty )
                    {
                    // InternalPropertyCS.g:1622:5: (lv_right_37_0= ruleProperty )
                    // InternalPropertyCS.g:1623:6: lv_right_37_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_7_9_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_right_37_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinaryPropertyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_37_0,
                      							"org.tetrabox.property.cs.PropertyCS.Property");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_38=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getBinaryPropertyAccess().getRightParenthesisKeyword_7_10());
                      			
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
    // $ANTLR end "ruleBinaryProperty"


    // $ANTLR start "entryRuleSERE"
    // InternalPropertyCS.g:1649:1: entryRuleSERE returns [EObject current=null] : iv_ruleSERE= ruleSERE EOF ;
    public final EObject entryRuleSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSERE = null;


        try {
            // InternalPropertyCS.g:1649:45: (iv_ruleSERE= ruleSERE EOF )
            // InternalPropertyCS.g:1650:2: iv_ruleSERE= ruleSERE EOF
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
    // InternalPropertyCS.g:1656:1: ruleSERE returns [EObject current=null] : (this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) ) ) ;
    public final EObject ruleSERE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_SimpleSERE_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:1662:2: ( (this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) ) ) )
            // InternalPropertyCS.g:1663:2: (this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) ) )
            {
            // InternalPropertyCS.g:1663:2: (this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) ) )
            // InternalPropertyCS.g:1664:3: this_SimpleSERE_0= ruleSimpleSERE ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSEREAccess().getSimpleSEREParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_SimpleSERE_0=ruleSimpleSERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SimpleSERE_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPropertyCS.g:1675:3: ( (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) ) | (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPropertyCS.g:1676:4: (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) )
                    {
                    // InternalPropertyCS.g:1676:4: (otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) ) )
                    // InternalPropertyCS.g:1677:5: otherlv_1= ':' () ( (lv_right_3_0= ruleSERE ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSEREAccess().getColonKeyword_1_0_0());
                      				
                    }
                    // InternalPropertyCS.g:1681:5: ()
                    // InternalPropertyCS.g:1682:6: 
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

                    // InternalPropertyCS.g:1691:5: ( (lv_right_3_0= ruleSERE ) )
                    // InternalPropertyCS.g:1692:6: (lv_right_3_0= ruleSERE )
                    {
                    // InternalPropertyCS.g:1692:6: (lv_right_3_0= ruleSERE )
                    // InternalPropertyCS.g:1693:7: lv_right_3_0= ruleSERE
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
                    // InternalPropertyCS.g:1712:4: (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) )
                    {
                    // InternalPropertyCS.g:1712:4: (otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) ) )
                    // InternalPropertyCS.g:1713:5: otherlv_4= ';' () ( (lv_right_6_0= ruleSERE ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSEREAccess().getSemicolonKeyword_1_1_0());
                      				
                    }
                    // InternalPropertyCS.g:1717:5: ()
                    // InternalPropertyCS.g:1718:6: 
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

                    // InternalPropertyCS.g:1727:5: ( (lv_right_6_0= ruleSERE ) )
                    // InternalPropertyCS.g:1728:6: (lv_right_6_0= ruleSERE )
                    {
                    // InternalPropertyCS.g:1728:6: (lv_right_6_0= ruleSERE )
                    // InternalPropertyCS.g:1729:7: lv_right_6_0= ruleSERE
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
    // InternalPropertyCS.g:1752:1: entryRuleSimpleSERE returns [EObject current=null] : iv_ruleSimpleSERE= ruleSimpleSERE EOF ;
    public final EObject entryRuleSimpleSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSERE = null;


        try {
            // InternalPropertyCS.g:1752:51: (iv_ruleSimpleSERE= ruleSimpleSERE EOF )
            // InternalPropertyCS.g:1753:2: iv_ruleSimpleSERE= ruleSimpleSERE EOF
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
    // InternalPropertyCS.g:1759:1: ruleSimpleSERE returns [EObject current=null] : (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE ) ;
    public final EObject ruleSimpleSERE() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceTerminal_0 = null;

        EObject this_Sequence_1 = null;

        EObject this_CompoundSERE_2 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:1765:2: ( (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE ) )
            // InternalPropertyCS.g:1766:2: (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE )
            {
            // InternalPropertyCS.g:1766:2: (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalPropertyCS.g:1767:3: this_SequenceTerminal_0= ruleSequenceTerminal
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
                    // InternalPropertyCS.g:1779:3: this_Sequence_1= ruleSequence
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
                    // InternalPropertyCS.g:1791:3: this_CompoundSERE_2= ruleCompoundSERE
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
    // InternalPropertyCS.g:1806:1: entryRuleSequenceTerminal returns [EObject current=null] : iv_ruleSequenceTerminal= ruleSequenceTerminal EOF ;
    public final EObject entryRuleSequenceTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceTerminal = null;


        try {
            // InternalPropertyCS.g:1806:57: (iv_ruleSequenceTerminal= ruleSequenceTerminal EOF )
            // InternalPropertyCS.g:1807:2: iv_ruleSequenceTerminal= ruleSequenceTerminal EOF
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
    // InternalPropertyCS.g:1813:1: ruleSequenceTerminal returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) ) | ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) ) ) ;
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
            // InternalPropertyCS.g:1819:2: ( ( ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) ) | ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) ) ) )
            // InternalPropertyCS.g:1820:2: ( ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) ) | ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) ) )
            {
            // InternalPropertyCS.g:1820:2: ( ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) ) | ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt13=1;
                }
                break;
            case 37:
            case 38:
                {
                alt13=2;
                }
                break;
            case 39:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPropertyCS.g:1821:3: ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) )
                    {
                    // InternalPropertyCS.g:1821:3: ( () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) ) )
                    // InternalPropertyCS.g:1822:4: () otherlv_1= 'not' ( (lv_literal_2_0= ruleSequenceTerminal ) )
                    {
                    // InternalPropertyCS.g:1822:4: ()
                    // InternalPropertyCS.g:1823:5: 
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

                    otherlv_1=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSequenceTerminalAccess().getNotKeyword_0_1());
                      			
                    }
                    // InternalPropertyCS.g:1836:4: ( (lv_literal_2_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1837:5: (lv_literal_2_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1837:5: (lv_literal_2_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1838:6: lv_literal_2_0= ruleSequenceTerminal
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
                    // InternalPropertyCS.g:1857:3: ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) )
                    {
                    // InternalPropertyCS.g:1857:3: ( () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' ) )
                    // InternalPropertyCS.g:1858:4: () ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' )
                    {
                    // InternalPropertyCS.g:1858:4: ()
                    // InternalPropertyCS.g:1859:5: 
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

                    // InternalPropertyCS.g:1868:4: ( ( (lv_literal_4_0= 'true' ) ) | otherlv_5= 'false' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==37) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==38) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPropertyCS.g:1869:5: ( (lv_literal_4_0= 'true' ) )
                            {
                            // InternalPropertyCS.g:1869:5: ( (lv_literal_4_0= 'true' ) )
                            // InternalPropertyCS.g:1870:6: (lv_literal_4_0= 'true' )
                            {
                            // InternalPropertyCS.g:1870:6: (lv_literal_4_0= 'true' )
                            // InternalPropertyCS.g:1871:7: lv_literal_4_0= 'true'
                            {
                            lv_literal_4_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
                            // InternalPropertyCS.g:1884:5: otherlv_5= 'false'
                            {
                            otherlv_5=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPropertyCS.g:1891:3: ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) )
                    {
                    // InternalPropertyCS.g:1891:3: ( () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) ) )
                    // InternalPropertyCS.g:1892:4: () otherlv_7= 'ocl' ( (lv_expression_8_0= RULE_STRING ) )
                    {
                    // InternalPropertyCS.g:1892:4: ()
                    // InternalPropertyCS.g:1893:5: 
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

                    otherlv_7=(Token)match(input,39,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSequenceTerminalAccess().getOclKeyword_2_1());
                      			
                    }
                    // InternalPropertyCS.g:1906:4: ( (lv_expression_8_0= RULE_STRING ) )
                    // InternalPropertyCS.g:1907:5: (lv_expression_8_0= RULE_STRING )
                    {
                    // InternalPropertyCS.g:1907:5: (lv_expression_8_0= RULE_STRING )
                    // InternalPropertyCS.g:1908:6: lv_expression_8_0= RULE_STRING
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
    // InternalPropertyCS.g:1929:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalPropertyCS.g:1929:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalPropertyCS.g:1930:2: iv_ruleSequence= ruleSequence EOF
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
    // InternalPropertyCS.g:1936:1: ruleSequence returns [EObject current=null] : (this_BracedSERE_0= ruleBracedSERE | this_RepeatedSERE_1= ruleRepeatedSERE ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        EObject this_BracedSERE_0 = null;

        EObject this_RepeatedSERE_1 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:1942:2: ( (this_BracedSERE_0= ruleBracedSERE | this_RepeatedSERE_1= ruleRepeatedSERE ) )
            // InternalPropertyCS.g:1943:2: (this_BracedSERE_0= ruleBracedSERE | this_RepeatedSERE_1= ruleRepeatedSERE )
            {
            // InternalPropertyCS.g:1943:2: (this_BracedSERE_0= ruleBracedSERE | this_RepeatedSERE_1= ruleRepeatedSERE )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred47_InternalPropertyCS()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==14||LA14_0==32||(LA14_0>=36 && LA14_0<=39)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPropertyCS.g:1944:3: this_BracedSERE_0= ruleBracedSERE
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
                    // InternalPropertyCS.g:1956:3: this_RepeatedSERE_1= ruleRepeatedSERE
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
    // InternalPropertyCS.g:1971:1: entryRuleRepeatedSERE returns [EObject current=null] : iv_ruleRepeatedSERE= ruleRepeatedSERE EOF ;
    public final EObject entryRuleRepeatedSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatedSERE = null;


        try {
            // InternalPropertyCS.g:1971:53: (iv_ruleRepeatedSERE= ruleRepeatedSERE EOF )
            // InternalPropertyCS.g:1972:2: iv_ruleRepeatedSERE= ruleRepeatedSERE EOF
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
    // InternalPropertyCS.g:1978:1: ruleRepeatedSERE returns [EObject current=null] : ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) ) ;
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
            // InternalPropertyCS.g:1984:2: ( ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) ) )
            // InternalPropertyCS.g:1985:2: ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) )
            {
            // InternalPropertyCS.g:1985:2: ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) )
            int alt20=10;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalPropertyCS.g:1986:3: ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' )
                    {
                    // InternalPropertyCS.g:1986:3: ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' )
                    // InternalPropertyCS.g:1987:4: () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']'
                    {
                    // InternalPropertyCS.g:1987:4: ()
                    // InternalPropertyCS.g:1988:5: 
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

                    // InternalPropertyCS.g:1997:4: ( (lv_expression_1_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:1998:5: (lv_expression_1_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:1998:5: (lv_expression_1_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:1999:6: lv_expression_1_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalPropertyCS.g:2016:4: ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' )
                    // InternalPropertyCS.g:2017:5: ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*'
                    {
                    // InternalPropertyCS.g:2017:5: ( ( '[' )=>otherlv_2= '[' )
                    // InternalPropertyCS.g:2018:6: ( '[' )=>otherlv_2= '['
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_0_2_0());
                      					
                    }

                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_0_2_1());
                      				
                    }

                    }

                    // InternalPropertyCS.g:2029:4: ( (lv_count_4_0= ruleCount ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_INT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalPropertyCS.g:2030:5: (lv_count_4_0= ruleCount )
                            {
                            // InternalPropertyCS.g:2030:5: (lv_count_4_0= ruleCount )
                            // InternalPropertyCS.g:2031:6: lv_count_4_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_0_3_0());
                              					
                            }
                            pushFollow(FOLLOW_26);
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

                    otherlv_5=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPropertyCS.g:2054:3: ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' )
                    {
                    // InternalPropertyCS.g:2054:3: ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' )
                    // InternalPropertyCS.g:2055:4: () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']'
                    {
                    // InternalPropertyCS.g:2055:4: ()
                    // InternalPropertyCS.g:2056:5: 
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

                    // InternalPropertyCS.g:2065:4: ( (lv_expression_7_0= ruleBracedSERE ) )
                    // InternalPropertyCS.g:2066:5: (lv_expression_7_0= ruleBracedSERE )
                    {
                    // InternalPropertyCS.g:2066:5: (lv_expression_7_0= ruleBracedSERE )
                    // InternalPropertyCS.g:2067:6: lv_expression_7_0= ruleBracedSERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalPropertyCS.g:2084:4: ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' )
                    // InternalPropertyCS.g:2085:5: ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*'
                    {
                    // InternalPropertyCS.g:2085:5: ( ( '[' )=>otherlv_8= '[' )
                    // InternalPropertyCS.g:2086:6: ( '[' )=>otherlv_8= '['
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_1_2_0());
                      					
                    }

                    }

                    otherlv_9=(Token)match(input,40,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_1_2_1());
                      				
                    }

                    }

                    // InternalPropertyCS.g:2097:4: ( (lv_count_10_0= ruleCount ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_INT) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPropertyCS.g:2098:5: (lv_count_10_0= ruleCount )
                            {
                            // InternalPropertyCS.g:2098:5: (lv_count_10_0= ruleCount )
                            // InternalPropertyCS.g:2099:6: lv_count_10_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_1_3_0());
                              					
                            }
                            pushFollow(FOLLOW_26);
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

                    otherlv_11=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPropertyCS.g:2122:3: ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' )
                    {
                    // InternalPropertyCS.g:2122:3: ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' )
                    // InternalPropertyCS.g:2123:4: () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']'
                    {
                    // InternalPropertyCS.g:2123:4: ()
                    // InternalPropertyCS.g:2124:5: 
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

                    otherlv_13=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getRepeatedSEREAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    // InternalPropertyCS.g:2137:4: ( (lv_expression_14_0= ruleRepeatedSERE ) )
                    // InternalPropertyCS.g:2138:5: (lv_expression_14_0= ruleRepeatedSERE )
                    {
                    // InternalPropertyCS.g:2138:5: (lv_expression_14_0= ruleRepeatedSERE )
                    // InternalPropertyCS.g:2139:6: lv_expression_14_0= ruleRepeatedSERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
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

                    otherlv_15=(Token)match(input,15,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getRepeatedSEREAccess().getRightParenthesisKeyword_2_3());
                      			
                    }
                    // InternalPropertyCS.g:2160:4: ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' )
                    // InternalPropertyCS.g:2161:5: ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*'
                    {
                    // InternalPropertyCS.g:2161:5: ( ( '[' )=>otherlv_16= '[' )
                    // InternalPropertyCS.g:2162:6: ( '[' )=>otherlv_16= '['
                    {
                    otherlv_16=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_2_4_0());
                      					
                    }

                    }

                    otherlv_17=(Token)match(input,40,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_2_4_1());
                      				
                    }

                    }

                    // InternalPropertyCS.g:2173:4: ( (lv_count_18_0= ruleCount ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_INT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalPropertyCS.g:2174:5: (lv_count_18_0= ruleCount )
                            {
                            // InternalPropertyCS.g:2174:5: (lv_count_18_0= ruleCount )
                            // InternalPropertyCS.g:2175:6: lv_count_18_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_2_5_0());
                              					
                            }
                            pushFollow(FOLLOW_26);
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

                    otherlv_19=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_2_6());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPropertyCS.g:2198:3: ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' )
                    {
                    // InternalPropertyCS.g:2198:3: ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' )
                    // InternalPropertyCS.g:2199:4: () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']'
                    {
                    // InternalPropertyCS.g:2199:4: ()
                    // InternalPropertyCS.g:2200:5: 
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

                    // InternalPropertyCS.g:2209:4: ( (lv_expression_21_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:2210:5: (lv_expression_21_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:2210:5: (lv_expression_21_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:2211:6: lv_expression_21_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalPropertyCS.g:2228:4: ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' )
                    // InternalPropertyCS.g:2229:5: ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+'
                    {
                    // InternalPropertyCS.g:2229:5: ( ( '[' )=>otherlv_22= '[' )
                    // InternalPropertyCS.g:2230:6: ( '[' )=>otherlv_22= '['
                    {
                    otherlv_22=(Token)match(input,32,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_22, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_3_2_0());
                      					
                    }

                    }

                    otherlv_23=(Token)match(input,41,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_23, grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_3_2_1());
                      				
                    }

                    }

                    otherlv_24=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_24, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPropertyCS.g:2247:3: ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' )
                    {
                    // InternalPropertyCS.g:2247:3: ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' )
                    // InternalPropertyCS.g:2248:4: () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']'
                    {
                    // InternalPropertyCS.g:2248:4: ()
                    // InternalPropertyCS.g:2249:5: 
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

                    // InternalPropertyCS.g:2258:4: ( (lv_expression_26_0= ruleBracedSERE ) )
                    // InternalPropertyCS.g:2259:5: (lv_expression_26_0= ruleBracedSERE )
                    {
                    // InternalPropertyCS.g:2259:5: (lv_expression_26_0= ruleBracedSERE )
                    // InternalPropertyCS.g:2260:6: lv_expression_26_0= ruleBracedSERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalPropertyCS.g:2277:4: ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' )
                    // InternalPropertyCS.g:2278:5: ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+'
                    {
                    // InternalPropertyCS.g:2278:5: ( ( '[' )=>otherlv_27= '[' )
                    // InternalPropertyCS.g:2279:6: ( '[' )=>otherlv_27= '['
                    {
                    otherlv_27=(Token)match(input,32,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_27, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_4_2_0());
                      					
                    }

                    }

                    otherlv_28=(Token)match(input,41,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_28, grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_4_2_1());
                      				
                    }

                    }

                    otherlv_29=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPropertyCS.g:2296:3: ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' )
                    {
                    // InternalPropertyCS.g:2296:3: ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' )
                    // InternalPropertyCS.g:2297:4: () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']'
                    {
                    // InternalPropertyCS.g:2297:4: ()
                    // InternalPropertyCS.g:2298:5: 
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

                    otherlv_31=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getRepeatedSEREAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalPropertyCS.g:2311:4: ( (lv_expression_32_0= ruleRepeatedSERE ) )
                    // InternalPropertyCS.g:2312:5: (lv_expression_32_0= ruleRepeatedSERE )
                    {
                    // InternalPropertyCS.g:2312:5: (lv_expression_32_0= ruleRepeatedSERE )
                    // InternalPropertyCS.g:2313:6: lv_expression_32_0= ruleRepeatedSERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
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

                    otherlv_33=(Token)match(input,15,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getRepeatedSEREAccess().getRightParenthesisKeyword_5_3());
                      			
                    }
                    // InternalPropertyCS.g:2334:4: ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' )
                    // InternalPropertyCS.g:2335:5: ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+'
                    {
                    // InternalPropertyCS.g:2335:5: ( ( '[' )=>otherlv_34= '[' )
                    // InternalPropertyCS.g:2336:6: ( '[' )=>otherlv_34= '['
                    {
                    otherlv_34=(Token)match(input,32,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_34, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_5_4_0());
                      					
                    }

                    }

                    otherlv_35=(Token)match(input,41,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_35, grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_5_4_1());
                      				
                    }

                    }

                    otherlv_36=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_5_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPropertyCS.g:2353:3: ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' )
                    {
                    // InternalPropertyCS.g:2353:3: ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' )
                    // InternalPropertyCS.g:2354:4: () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']'
                    {
                    // InternalPropertyCS.g:2354:4: ()
                    // InternalPropertyCS.g:2355:5: 
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

                    // InternalPropertyCS.g:2364:4: ( (lv_expression_38_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:2365:5: (lv_expression_38_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:2365:5: (lv_expression_38_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:2366:6: lv_expression_38_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalPropertyCS.g:2383:4: ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' )
                    // InternalPropertyCS.g:2384:5: ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '='
                    {
                    // InternalPropertyCS.g:2384:5: ( ( '[' )=>otherlv_39= '[' )
                    // InternalPropertyCS.g:2385:6: ( '[' )=>otherlv_39= '['
                    {
                    otherlv_39=(Token)match(input,32,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_39, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_6_2_0());
                      					
                    }

                    }

                    otherlv_40=(Token)match(input,42,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_40, grammarAccess.getRepeatedSEREAccess().getEqualsSignKeyword_6_2_1());
                      				
                    }

                    }

                    // InternalPropertyCS.g:2396:4: ( (lv_count_41_0= ruleCount ) )
                    // InternalPropertyCS.g:2397:5: (lv_count_41_0= ruleCount )
                    {
                    // InternalPropertyCS.g:2397:5: (lv_count_41_0= ruleCount )
                    // InternalPropertyCS.g:2398:6: lv_count_41_0= ruleCount
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_6_3_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
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

                    otherlv_42=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_6_4());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPropertyCS.g:2421:3: ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' )
                    {
                    // InternalPropertyCS.g:2421:3: ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' )
                    // InternalPropertyCS.g:2422:4: () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']'
                    {
                    // InternalPropertyCS.g:2422:4: ()
                    // InternalPropertyCS.g:2423:5: 
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

                    // InternalPropertyCS.g:2432:4: ( (lv_expression_44_0= ruleSequenceTerminal ) )
                    // InternalPropertyCS.g:2433:5: (lv_expression_44_0= ruleSequenceTerminal )
                    {
                    // InternalPropertyCS.g:2433:5: (lv_expression_44_0= ruleSequenceTerminal )
                    // InternalPropertyCS.g:2434:6: lv_expression_44_0= ruleSequenceTerminal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalPropertyCS.g:2451:4: ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' )
                    // InternalPropertyCS.g:2452:5: ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->'
                    {
                    // InternalPropertyCS.g:2452:5: ( ( '[' )=>otherlv_45= '[' )
                    // InternalPropertyCS.g:2453:6: ( '[' )=>otherlv_45= '['
                    {
                    otherlv_45=(Token)match(input,32,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_45, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_7_2_0());
                      					
                    }

                    }

                    otherlv_46=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_46, grammarAccess.getRepeatedSEREAccess().getHyphenMinusGreaterThanSignKeyword_7_2_1());
                      				
                    }

                    }

                    // InternalPropertyCS.g:2464:4: ( (lv_count_47_0= ruleCount ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_INT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalPropertyCS.g:2465:5: (lv_count_47_0= ruleCount )
                            {
                            // InternalPropertyCS.g:2465:5: (lv_count_47_0= ruleCount )
                            // InternalPropertyCS.g:2466:6: lv_count_47_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_7_3_0());
                              					
                            }
                            pushFollow(FOLLOW_26);
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

                    otherlv_48=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_48, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_7_4());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalPropertyCS.g:2489:3: ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' )
                    {
                    // InternalPropertyCS.g:2489:3: ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' )
                    // InternalPropertyCS.g:2490:4: () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']'
                    {
                    // InternalPropertyCS.g:2490:4: ()
                    // InternalPropertyCS.g:2491:5: 
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

                    otherlv_50=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_50, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_8_1());
                      			
                    }
                    otherlv_51=(Token)match(input,40,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getRepeatedSEREAccess().getAsteriskKeyword_8_2());
                      			
                    }
                    // InternalPropertyCS.g:2508:4: ( (lv_count_52_0= ruleCount ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_INT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalPropertyCS.g:2509:5: (lv_count_52_0= ruleCount )
                            {
                            // InternalPropertyCS.g:2509:5: (lv_count_52_0= ruleCount )
                            // InternalPropertyCS.g:2510:6: lv_count_52_0= ruleCount
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_8_3_0());
                              					
                            }
                            pushFollow(FOLLOW_26);
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

                    otherlv_53=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_53, grammarAccess.getRepeatedSEREAccess().getRightSquareBracketKeyword_8_4());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalPropertyCS.g:2533:3: ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' )
                    {
                    // InternalPropertyCS.g:2533:3: ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' )
                    // InternalPropertyCS.g:2534:4: () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']'
                    {
                    // InternalPropertyCS.g:2534:4: ()
                    // InternalPropertyCS.g:2535:5: 
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

                    otherlv_55=(Token)match(input,32,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_55, grammarAccess.getRepeatedSEREAccess().getLeftSquareBracketKeyword_9_1());
                      			
                    }
                    otherlv_56=(Token)match(input,41,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_56, grammarAccess.getRepeatedSEREAccess().getPlusSignKeyword_9_2());
                      			
                    }
                    otherlv_57=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalPropertyCS.g:2561:1: entryRuleBracedSERE returns [EObject current=null] : iv_ruleBracedSERE= ruleBracedSERE EOF ;
    public final EObject entryRuleBracedSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracedSERE = null;


        try {
            // InternalPropertyCS.g:2561:51: (iv_ruleBracedSERE= ruleBracedSERE EOF )
            // InternalPropertyCS.g:2562:2: iv_ruleBracedSERE= ruleBracedSERE EOF
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
    // InternalPropertyCS.g:2568:1: ruleBracedSERE returns [EObject current=null] : (otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}' ) ;
    public final EObject ruleBracedSERE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:2574:2: ( (otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}' ) )
            // InternalPropertyCS.g:2575:2: (otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}' )
            {
            // InternalPropertyCS.g:2575:2: (otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}' )
            // InternalPropertyCS.g:2576:3: otherlv_0= '{' ( (lv_expression_1_0= ruleSERE ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBracedSEREAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalPropertyCS.g:2580:3: ( (lv_expression_1_0= ruleSERE ) )
            // InternalPropertyCS.g:2581:4: (lv_expression_1_0= ruleSERE )
            {
            // InternalPropertyCS.g:2581:4: (lv_expression_1_0= ruleSERE )
            // InternalPropertyCS.g:2582:5: lv_expression_1_0= ruleSERE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBracedSEREAccess().getExpressionSEREParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalPropertyCS.g:2607:1: entryRuleCompoundSERE returns [EObject current=null] : iv_ruleCompoundSERE= ruleCompoundSERE EOF ;
    public final EObject entryRuleCompoundSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundSERE = null;


        try {
            // InternalPropertyCS.g:2607:53: (iv_ruleCompoundSERE= ruleCompoundSERE EOF )
            // InternalPropertyCS.g:2608:2: iv_ruleCompoundSERE= ruleCompoundSERE EOF
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
    // InternalPropertyCS.g:2614:1: ruleCompoundSERE returns [EObject current=null] : (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE ) ;
    public final EObject ruleCompoundSERE() throws RecognitionException {
        EObject current = null;

        EObject this_RepeatedSERE_0 = null;

        EObject this_BracedSERE_1 = null;

        EObject this_BinaryCompoundSERE_2 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:2620:2: ( (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE ) )
            // InternalPropertyCS.g:2621:2: (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE )
            {
            // InternalPropertyCS.g:2621:2: (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalPropertyCS.g:2622:3: this_RepeatedSERE_0= ruleRepeatedSERE
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
                    // InternalPropertyCS.g:2634:3: this_BracedSERE_1= ruleBracedSERE
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
                    // InternalPropertyCS.g:2646:3: this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE
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
    // InternalPropertyCS.g:2661:1: entryRuleBinaryCompoundSERE returns [EObject current=null] : iv_ruleBinaryCompoundSERE= ruleBinaryCompoundSERE EOF ;
    public final EObject entryRuleBinaryCompoundSERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryCompoundSERE = null;


        try {
            // InternalPropertyCS.g:2661:59: (iv_ruleBinaryCompoundSERE= ruleBinaryCompoundSERE EOF )
            // InternalPropertyCS.g:2662:2: iv_ruleBinaryCompoundSERE= ruleBinaryCompoundSERE EOF
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
    // InternalPropertyCS.g:2668:1: ruleBinaryCompoundSERE returns [EObject current=null] : ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) ) ;
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
            // InternalPropertyCS.g:2674:2: ( ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) ) )
            // InternalPropertyCS.g:2675:2: ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) )
            {
            // InternalPropertyCS.g:2675:2: ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) )
            int alt30=4;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalPropertyCS.g:2676:3: ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) )
                    {
                    // InternalPropertyCS.g:2676:3: ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) )
                    // InternalPropertyCS.g:2677:4: () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )
                    {
                    // InternalPropertyCS.g:2677:4: ()
                    // InternalPropertyCS.g:2678:5: 
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

                    // InternalPropertyCS.g:2687:4: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) )
                    int alt22=3;
                    alt22 = dfa22.predict(input);
                    switch (alt22) {
                        case 1 :
                            // InternalPropertyCS.g:2688:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
                            {
                            // InternalPropertyCS.g:2688:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
                            // InternalPropertyCS.g:2689:6: (lv_left_1_0= ruleRepeatedSERE )
                            {
                            // InternalPropertyCS.g:2689:6: (lv_left_1_0= ruleRepeatedSERE )
                            // InternalPropertyCS.g:2690:7: lv_left_1_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_34);
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
                            // InternalPropertyCS.g:2708:5: ( (lv_left_2_0= ruleBracedSERE ) )
                            {
                            // InternalPropertyCS.g:2708:5: ( (lv_left_2_0= ruleBracedSERE ) )
                            // InternalPropertyCS.g:2709:6: (lv_left_2_0= ruleBracedSERE )
                            {
                            // InternalPropertyCS.g:2709:6: (lv_left_2_0= ruleBracedSERE )
                            // InternalPropertyCS.g:2710:7: lv_left_2_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_34);
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
                            // InternalPropertyCS.g:2728:5: (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' )
                            {
                            // InternalPropertyCS.g:2728:5: (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' )
                            // InternalPropertyCS.g:2729:6: otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_0_1_2_0());
                              					
                            }
                            // InternalPropertyCS.g:2733:6: ( (lv_left_4_0= ruleBinaryCompoundSERE ) )
                            // InternalPropertyCS.g:2734:7: (lv_left_4_0= ruleBinaryCompoundSERE )
                            {
                            // InternalPropertyCS.g:2734:7: (lv_left_4_0= ruleBinaryCompoundSERE )
                            // InternalPropertyCS.g:2735:8: lv_left_4_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_0_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
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

                            otherlv_5=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_0_1_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPropertyCS.g:2758:4: ( ( '|' )=>otherlv_6= '|' )
                    // InternalPropertyCS.g:2759:5: ( '|' )=>otherlv_6= '|'
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getBinaryCompoundSEREAccess().getVerticalLineKeyword_0_2());
                      				
                    }

                    }

                    // InternalPropertyCS.g:2765:4: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )
                    int alt23=3;
                    alt23 = dfa23.predict(input);
                    switch (alt23) {
                        case 1 :
                            // InternalPropertyCS.g:2766:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
                            {
                            // InternalPropertyCS.g:2766:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
                            // InternalPropertyCS.g:2767:6: (lv_right_7_0= ruleRepeatedSERE )
                            {
                            // InternalPropertyCS.g:2767:6: (lv_right_7_0= ruleRepeatedSERE )
                            // InternalPropertyCS.g:2768:7: lv_right_7_0= ruleRepeatedSERE
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
                            // InternalPropertyCS.g:2786:5: ( (lv_right_8_0= ruleBracedSERE ) )
                            {
                            // InternalPropertyCS.g:2786:5: ( (lv_right_8_0= ruleBracedSERE ) )
                            // InternalPropertyCS.g:2787:6: (lv_right_8_0= ruleBracedSERE )
                            {
                            // InternalPropertyCS.g:2787:6: (lv_right_8_0= ruleBracedSERE )
                            // InternalPropertyCS.g:2788:7: lv_right_8_0= ruleBracedSERE
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
                            // InternalPropertyCS.g:2806:5: (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' )
                            {
                            // InternalPropertyCS.g:2806:5: (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' )
                            // InternalPropertyCS.g:2807:6: otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')'
                            {
                            otherlv_9=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_0_3_2_0());
                              					
                            }
                            // InternalPropertyCS.g:2811:6: ( (lv_right_10_0= ruleBinaryCompoundSERE ) )
                            // InternalPropertyCS.g:2812:7: (lv_right_10_0= ruleBinaryCompoundSERE )
                            {
                            // InternalPropertyCS.g:2812:7: (lv_right_10_0= ruleBinaryCompoundSERE )
                            // InternalPropertyCS.g:2813:8: lv_right_10_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_0_3_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
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

                            otherlv_11=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPropertyCS.g:2838:3: ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) )
                    {
                    // InternalPropertyCS.g:2838:3: ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) )
                    // InternalPropertyCS.g:2839:4: () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )
                    {
                    // InternalPropertyCS.g:2839:4: ()
                    // InternalPropertyCS.g:2840:5: 
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

                    // InternalPropertyCS.g:2849:4: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) )
                    int alt24=3;
                    alt24 = dfa24.predict(input);
                    switch (alt24) {
                        case 1 :
                            // InternalPropertyCS.g:2850:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
                            {
                            // InternalPropertyCS.g:2850:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
                            // InternalPropertyCS.g:2851:6: (lv_left_13_0= ruleRepeatedSERE )
                            {
                            // InternalPropertyCS.g:2851:6: (lv_left_13_0= ruleRepeatedSERE )
                            // InternalPropertyCS.g:2852:7: lv_left_13_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_35);
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
                            // InternalPropertyCS.g:2870:5: ( (lv_left_14_0= ruleBracedSERE ) )
                            {
                            // InternalPropertyCS.g:2870:5: ( (lv_left_14_0= ruleBracedSERE ) )
                            // InternalPropertyCS.g:2871:6: (lv_left_14_0= ruleBracedSERE )
                            {
                            // InternalPropertyCS.g:2871:6: (lv_left_14_0= ruleBracedSERE )
                            // InternalPropertyCS.g:2872:7: lv_left_14_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_35);
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
                            // InternalPropertyCS.g:2890:5: (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' )
                            {
                            // InternalPropertyCS.g:2890:5: (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' )
                            // InternalPropertyCS.g:2891:6: otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')'
                            {
                            otherlv_15=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_15, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_1_1_2_0());
                              					
                            }
                            // InternalPropertyCS.g:2895:6: ( (lv_left_16_0= ruleBinaryCompoundSERE ) )
                            // InternalPropertyCS.g:2896:7: (lv_left_16_0= ruleBinaryCompoundSERE )
                            {
                            // InternalPropertyCS.g:2896:7: (lv_left_16_0= ruleBinaryCompoundSERE )
                            // InternalPropertyCS.g:2897:8: lv_left_16_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_1_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
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

                            otherlv_17=(Token)match(input,15,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_17, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_1_1_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPropertyCS.g:2920:4: ( ( '&' )=>otherlv_18= '&' )
                    // InternalPropertyCS.g:2921:5: ( '&' )=>otherlv_18= '&'
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_18, grammarAccess.getBinaryCompoundSEREAccess().getAmpersandKeyword_1_2());
                      				
                    }

                    }

                    // InternalPropertyCS.g:2927:4: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )
                    int alt25=3;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // InternalPropertyCS.g:2928:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
                            {
                            // InternalPropertyCS.g:2928:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
                            // InternalPropertyCS.g:2929:6: (lv_right_19_0= ruleRepeatedSERE )
                            {
                            // InternalPropertyCS.g:2929:6: (lv_right_19_0= ruleRepeatedSERE )
                            // InternalPropertyCS.g:2930:7: lv_right_19_0= ruleRepeatedSERE
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
                            // InternalPropertyCS.g:2948:5: ( (lv_right_20_0= ruleBracedSERE ) )
                            {
                            // InternalPropertyCS.g:2948:5: ( (lv_right_20_0= ruleBracedSERE ) )
                            // InternalPropertyCS.g:2949:6: (lv_right_20_0= ruleBracedSERE )
                            {
                            // InternalPropertyCS.g:2949:6: (lv_right_20_0= ruleBracedSERE )
                            // InternalPropertyCS.g:2950:7: lv_right_20_0= ruleBracedSERE
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
                            // InternalPropertyCS.g:2968:5: (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' )
                            {
                            // InternalPropertyCS.g:2968:5: (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' )
                            // InternalPropertyCS.g:2969:6: otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')'
                            {
                            otherlv_21=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_21, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_1_3_2_0());
                              					
                            }
                            // InternalPropertyCS.g:2973:6: ( (lv_right_22_0= ruleBinaryCompoundSERE ) )
                            // InternalPropertyCS.g:2974:7: (lv_right_22_0= ruleBinaryCompoundSERE )
                            {
                            // InternalPropertyCS.g:2974:7: (lv_right_22_0= ruleBinaryCompoundSERE )
                            // InternalPropertyCS.g:2975:8: lv_right_22_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_1_3_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
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

                            otherlv_23=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPropertyCS.g:3000:3: ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) )
                    {
                    // InternalPropertyCS.g:3000:3: ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) )
                    // InternalPropertyCS.g:3001:4: () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )
                    {
                    // InternalPropertyCS.g:3001:4: ()
                    // InternalPropertyCS.g:3002:5: 
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

                    // InternalPropertyCS.g:3011:4: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) )
                    int alt26=3;
                    alt26 = dfa26.predict(input);
                    switch (alt26) {
                        case 1 :
                            // InternalPropertyCS.g:3012:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
                            {
                            // InternalPropertyCS.g:3012:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
                            // InternalPropertyCS.g:3013:6: (lv_left_25_0= ruleRepeatedSERE )
                            {
                            // InternalPropertyCS.g:3013:6: (lv_left_25_0= ruleRepeatedSERE )
                            // InternalPropertyCS.g:3014:7: lv_left_25_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_36);
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
                            // InternalPropertyCS.g:3032:5: ( (lv_left_26_0= ruleBracedSERE ) )
                            {
                            // InternalPropertyCS.g:3032:5: ( (lv_left_26_0= ruleBracedSERE ) )
                            // InternalPropertyCS.g:3033:6: (lv_left_26_0= ruleBracedSERE )
                            {
                            // InternalPropertyCS.g:3033:6: (lv_left_26_0= ruleBracedSERE )
                            // InternalPropertyCS.g:3034:7: lv_left_26_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_36);
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
                            // InternalPropertyCS.g:3052:5: (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' )
                            {
                            // InternalPropertyCS.g:3052:5: (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' )
                            // InternalPropertyCS.g:3053:6: otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')'
                            {
                            otherlv_27=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_27, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_2_1_2_0());
                              					
                            }
                            // InternalPropertyCS.g:3057:6: ( (lv_left_28_0= ruleBinaryCompoundSERE ) )
                            // InternalPropertyCS.g:3058:7: (lv_left_28_0= ruleBinaryCompoundSERE )
                            {
                            // InternalPropertyCS.g:3058:7: (lv_left_28_0= ruleBinaryCompoundSERE )
                            // InternalPropertyCS.g:3059:8: lv_left_28_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
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

                            otherlv_29=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_29, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_2_1_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPropertyCS.g:3082:4: ( ( '&&' )=>otherlv_30= '&&' )
                    // InternalPropertyCS.g:3083:5: ( '&&' )=>otherlv_30= '&&'
                    {
                    otherlv_30=(Token)match(input,47,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_30, grammarAccess.getBinaryCompoundSEREAccess().getAmpersandAmpersandKeyword_2_2());
                      				
                    }

                    }

                    // InternalPropertyCS.g:3089:4: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )
                    int alt27=3;
                    alt27 = dfa27.predict(input);
                    switch (alt27) {
                        case 1 :
                            // InternalPropertyCS.g:3090:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
                            {
                            // InternalPropertyCS.g:3090:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
                            // InternalPropertyCS.g:3091:6: (lv_right_31_0= ruleRepeatedSERE )
                            {
                            // InternalPropertyCS.g:3091:6: (lv_right_31_0= ruleRepeatedSERE )
                            // InternalPropertyCS.g:3092:7: lv_right_31_0= ruleRepeatedSERE
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
                            // InternalPropertyCS.g:3110:5: ( (lv_right_32_0= ruleBracedSERE ) )
                            {
                            // InternalPropertyCS.g:3110:5: ( (lv_right_32_0= ruleBracedSERE ) )
                            // InternalPropertyCS.g:3111:6: (lv_right_32_0= ruleBracedSERE )
                            {
                            // InternalPropertyCS.g:3111:6: (lv_right_32_0= ruleBracedSERE )
                            // InternalPropertyCS.g:3112:7: lv_right_32_0= ruleBracedSERE
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
                            // InternalPropertyCS.g:3130:5: (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' )
                            {
                            // InternalPropertyCS.g:3130:5: (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' )
                            // InternalPropertyCS.g:3131:6: otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')'
                            {
                            otherlv_33=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_33, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_2_3_2_0());
                              					
                            }
                            // InternalPropertyCS.g:3135:6: ( (lv_right_34_0= ruleBinaryCompoundSERE ) )
                            // InternalPropertyCS.g:3136:7: (lv_right_34_0= ruleBinaryCompoundSERE )
                            {
                            // InternalPropertyCS.g:3136:7: (lv_right_34_0= ruleBinaryCompoundSERE )
                            // InternalPropertyCS.g:3137:8: lv_right_34_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_2_3_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
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

                            otherlv_35=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPropertyCS.g:3162:3: ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) )
                    {
                    // InternalPropertyCS.g:3162:3: ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) )
                    // InternalPropertyCS.g:3163:4: () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) )
                    {
                    // InternalPropertyCS.g:3163:4: ()
                    // InternalPropertyCS.g:3164:5: 
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

                    // InternalPropertyCS.g:3173:4: ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) )
                    int alt28=3;
                    alt28 = dfa28.predict(input);
                    switch (alt28) {
                        case 1 :
                            // InternalPropertyCS.g:3174:5: ( (lv_left_37_0= ruleRepeatedSERE ) )
                            {
                            // InternalPropertyCS.g:3174:5: ( (lv_left_37_0= ruleRepeatedSERE ) )
                            // InternalPropertyCS.g:3175:6: (lv_left_37_0= ruleRepeatedSERE )
                            {
                            // InternalPropertyCS.g:3175:6: (lv_left_37_0= ruleRepeatedSERE )
                            // InternalPropertyCS.g:3176:7: lv_left_37_0= ruleRepeatedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_37);
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
                            // InternalPropertyCS.g:3194:5: ( (lv_left_38_0= ruleBracedSERE ) )
                            {
                            // InternalPropertyCS.g:3194:5: ( (lv_left_38_0= ruleBracedSERE ) )
                            // InternalPropertyCS.g:3195:6: (lv_left_38_0= ruleBracedSERE )
                            {
                            // InternalPropertyCS.g:3195:6: (lv_left_38_0= ruleBracedSERE )
                            // InternalPropertyCS.g:3196:7: lv_left_38_0= ruleBracedSERE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_3_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_37);
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
                            // InternalPropertyCS.g:3214:5: (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' )
                            {
                            // InternalPropertyCS.g:3214:5: (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' )
                            // InternalPropertyCS.g:3215:6: otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')'
                            {
                            otherlv_39=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_39, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_3_1_2_0());
                              					
                            }
                            // InternalPropertyCS.g:3219:6: ( (lv_left_40_0= ruleBinaryCompoundSERE ) )
                            // InternalPropertyCS.g:3220:7: (lv_left_40_0= ruleBinaryCompoundSERE )
                            {
                            // InternalPropertyCS.g:3220:7: (lv_left_40_0= ruleBinaryCompoundSERE )
                            // InternalPropertyCS.g:3221:8: lv_left_40_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_3_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
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

                            otherlv_41=(Token)match(input,15,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_41, grammarAccess.getBinaryCompoundSEREAccess().getRightParenthesisKeyword_3_1_2_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPropertyCS.g:3244:4: ( ( 'within' )=>otherlv_42= 'within' )
                    // InternalPropertyCS.g:3245:5: ( 'within' )=>otherlv_42= 'within'
                    {
                    otherlv_42=(Token)match(input,48,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_42, grammarAccess.getBinaryCompoundSEREAccess().getWithinKeyword_3_2());
                      				
                    }

                    }

                    // InternalPropertyCS.g:3251:4: ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) )
                    int alt29=3;
                    alt29 = dfa29.predict(input);
                    switch (alt29) {
                        case 1 :
                            // InternalPropertyCS.g:3252:5: ( (lv_right_43_0= ruleRepeatedSERE ) )
                            {
                            // InternalPropertyCS.g:3252:5: ( (lv_right_43_0= ruleRepeatedSERE ) )
                            // InternalPropertyCS.g:3253:6: (lv_right_43_0= ruleRepeatedSERE )
                            {
                            // InternalPropertyCS.g:3253:6: (lv_right_43_0= ruleRepeatedSERE )
                            // InternalPropertyCS.g:3254:7: lv_right_43_0= ruleRepeatedSERE
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
                            // InternalPropertyCS.g:3272:5: ( (lv_right_44_0= ruleBracedSERE ) )
                            {
                            // InternalPropertyCS.g:3272:5: ( (lv_right_44_0= ruleBracedSERE ) )
                            // InternalPropertyCS.g:3273:6: (lv_right_44_0= ruleBracedSERE )
                            {
                            // InternalPropertyCS.g:3273:6: (lv_right_44_0= ruleBracedSERE )
                            // InternalPropertyCS.g:3274:7: lv_right_44_0= ruleBracedSERE
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
                            // InternalPropertyCS.g:3292:5: (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' )
                            {
                            // InternalPropertyCS.g:3292:5: (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' )
                            // InternalPropertyCS.g:3293:6: otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')'
                            {
                            otherlv_45=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_45, grammarAccess.getBinaryCompoundSEREAccess().getLeftParenthesisKeyword_3_3_2_0());
                              					
                            }
                            // InternalPropertyCS.g:3297:6: ( (lv_right_46_0= ruleBinaryCompoundSERE ) )
                            // InternalPropertyCS.g:3298:7: (lv_right_46_0= ruleBinaryCompoundSERE )
                            {
                            // InternalPropertyCS.g:3298:7: (lv_right_46_0= ruleBinaryCompoundSERE )
                            // InternalPropertyCS.g:3299:8: lv_right_46_0= ruleBinaryCompoundSERE
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_3_3_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
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

                            otherlv_47=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalPropertyCS.g:3327:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalPropertyCS.g:3327:46: (iv_ruleCount= ruleCount EOF )
            // InternalPropertyCS.g:3328:2: iv_ruleCount= ruleCount EOF
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
    // InternalPropertyCS.g:3334:1: ruleCount returns [EObject current=null] : ( ( (lv_COUNT_0_0= ruleNUMBER ) ) | this_Range_1= ruleRange ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_COUNT_0_0 = null;

        EObject this_Range_1 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:3340:2: ( ( ( (lv_COUNT_0_0= ruleNUMBER ) ) | this_Range_1= ruleRange ) )
            // InternalPropertyCS.g:3341:2: ( ( (lv_COUNT_0_0= ruleNUMBER ) ) | this_Range_1= ruleRange )
            {
            // InternalPropertyCS.g:3341:2: ( ( (lv_COUNT_0_0= ruleNUMBER ) ) | this_Range_1= ruleRange )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==34) ) {
                    alt31=2;
                }
                else if ( (LA31_1==EOF||LA31_1==33) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalPropertyCS.g:3342:3: ( (lv_COUNT_0_0= ruleNUMBER ) )
                    {
                    // InternalPropertyCS.g:3342:3: ( (lv_COUNT_0_0= ruleNUMBER ) )
                    // InternalPropertyCS.g:3343:4: (lv_COUNT_0_0= ruleNUMBER )
                    {
                    // InternalPropertyCS.g:3343:4: (lv_COUNT_0_0= ruleNUMBER )
                    // InternalPropertyCS.g:3344:5: lv_COUNT_0_0= ruleNUMBER
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
                    // InternalPropertyCS.g:3362:3: this_Range_1= ruleRange
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
    // InternalPropertyCS.g:3377:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalPropertyCS.g:3377:46: (iv_ruleRange= ruleRange EOF )
            // InternalPropertyCS.g:3378:2: iv_ruleRange= ruleRange EOF
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
    // InternalPropertyCS.g:3384:1: ruleRange returns [EObject current=null] : ( ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_LOWER_BOUND_0_0 = null;

        AntlrDatatypeRuleToken lv_HIGHER_BOUND_2_0 = null;



        	enterRule();

        try {
            // InternalPropertyCS.g:3390:2: ( ( ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) ) ) )
            // InternalPropertyCS.g:3391:2: ( ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) ) )
            {
            // InternalPropertyCS.g:3391:2: ( ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) ) )
            // InternalPropertyCS.g:3392:3: ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) )
            {
            // InternalPropertyCS.g:3392:3: ( (lv_LOWER_BOUND_0_0= ruleNUMBER ) )
            // InternalPropertyCS.g:3393:4: (lv_LOWER_BOUND_0_0= ruleNUMBER )
            {
            // InternalPropertyCS.g:3393:4: (lv_LOWER_BOUND_0_0= ruleNUMBER )
            // InternalPropertyCS.g:3394:5: lv_LOWER_BOUND_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeAccess().getLOWER_BOUNDNUMBERParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            otherlv_1=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getColonKeyword_1());
              		
            }
            // InternalPropertyCS.g:3415:3: ( (lv_HIGHER_BOUND_2_0= ruleNUMBER ) )
            // InternalPropertyCS.g:3416:4: (lv_HIGHER_BOUND_2_0= ruleNUMBER )
            {
            // InternalPropertyCS.g:3416:4: (lv_HIGHER_BOUND_2_0= ruleNUMBER )
            // InternalPropertyCS.g:3417:5: lv_HIGHER_BOUND_2_0= ruleNUMBER
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
    // InternalPropertyCS.g:3438:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalPropertyCS.g:3438:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalPropertyCS.g:3439:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalPropertyCS.g:3445:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPropertyCS.g:3451:2: (this_INT_0= RULE_INT )
            // InternalPropertyCS.g:3452:2: this_INT_0= RULE_INT
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

    // $ANTLR start synpred3_InternalPropertyCS
    public final void synpred3_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_1_0 = null;


        // InternalPropertyCS.g:195:5: ( ( (lv_left_1_0= ruleUnaryProperty ) ) )
        // InternalPropertyCS.g:195:5: ( (lv_left_1_0= ruleUnaryProperty ) )
        {
        // InternalPropertyCS.g:195:5: ( (lv_left_1_0= ruleUnaryProperty ) )
        // InternalPropertyCS.g:196:6: (lv_left_1_0= ruleUnaryProperty )
        {
        // InternalPropertyCS.g:196:6: (lv_left_1_0= ruleUnaryProperty )
        // InternalPropertyCS.g:197:7: lv_left_1_0= ruleUnaryProperty
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_0_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_1_0=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalPropertyCS

    // $ANTLR start synpred4_InternalPropertyCS
    public final void synpred4_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_2_0 = null;


        // InternalPropertyCS.g:215:5: ( ( (lv_left_2_0= ruleBinaryProperty ) ) )
        // InternalPropertyCS.g:215:5: ( (lv_left_2_0= ruleBinaryProperty ) )
        {
        // InternalPropertyCS.g:215:5: ( (lv_left_2_0= ruleBinaryProperty ) )
        // InternalPropertyCS.g:216:6: (lv_left_2_0= ruleBinaryProperty )
        {
        // InternalPropertyCS.g:216:6: (lv_left_2_0= ruleBinaryProperty )
        // InternalPropertyCS.g:217:7: lv_left_2_0= ruleBinaryProperty
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_0_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_2_0=ruleBinaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalPropertyCS

    // $ANTLR start synpred5_InternalPropertyCS
    public final void synpred5_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_4_0 = null;


        // InternalPropertyCS.g:235:5: ( (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) )
        // InternalPropertyCS.g:235:5: (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' )
        {
        // InternalPropertyCS.g:235:5: (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' )
        // InternalPropertyCS.g:236:6: otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return ;
        // InternalPropertyCS.g:240:6: ( (lv_left_4_0= ruleUnaryProperty ) )
        // InternalPropertyCS.g:241:7: (lv_left_4_0= ruleUnaryProperty )
        {
        // InternalPropertyCS.g:241:7: (lv_left_4_0= ruleUnaryProperty )
        // InternalPropertyCS.g:242:8: lv_left_4_0= ruleUnaryProperty
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_0_1_2_1_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_left_4_0=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalPropertyCS

    // $ANTLR start synpred7_InternalPropertyCS
    public final void synpred7_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_left_1_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_right_10_0 = null;


        // InternalPropertyCS.g:183:3: ( ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) ) )
        // InternalPropertyCS.g:183:3: ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) )
        {
        // InternalPropertyCS.g:183:3: ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) )
        // InternalPropertyCS.g:184:4: () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) )
        {
        // InternalPropertyCS.g:184:4: ()
        // InternalPropertyCS.g:185:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:194:4: ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) )
        int alt32=4;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // InternalPropertyCS.g:195:5: ( (lv_left_1_0= ruleUnaryProperty ) )
                {
                // InternalPropertyCS.g:195:5: ( (lv_left_1_0= ruleUnaryProperty ) )
                // InternalPropertyCS.g:196:6: (lv_left_1_0= ruleUnaryProperty )
                {
                // InternalPropertyCS.g:196:6: (lv_left_1_0= ruleUnaryProperty )
                // InternalPropertyCS.g:197:7: lv_left_1_0= ruleUnaryProperty
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_0_1_0_0());
                  						
                }
                pushFollow(FOLLOW_6);
                lv_left_1_0=ruleUnaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalPropertyCS.g:215:5: ( (lv_left_2_0= ruleBinaryProperty ) )
                {
                // InternalPropertyCS.g:215:5: ( (lv_left_2_0= ruleBinaryProperty ) )
                // InternalPropertyCS.g:216:6: (lv_left_2_0= ruleBinaryProperty )
                {
                // InternalPropertyCS.g:216:6: (lv_left_2_0= ruleBinaryProperty )
                // InternalPropertyCS.g:217:7: lv_left_2_0= ruleBinaryProperty
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FOLLOW_6);
                lv_left_2_0=ruleBinaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalPropertyCS.g:235:5: (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' )
                {
                // InternalPropertyCS.g:235:5: (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' )
                // InternalPropertyCS.g:236:6: otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')'
                {
                otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return ;
                // InternalPropertyCS.g:240:6: ( (lv_left_4_0= ruleUnaryProperty ) )
                // InternalPropertyCS.g:241:7: (lv_left_4_0= ruleUnaryProperty )
                {
                // InternalPropertyCS.g:241:7: (lv_left_4_0= ruleUnaryProperty )
                // InternalPropertyCS.g:242:8: lv_left_4_0= ruleUnaryProperty
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_0_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_4_0=ruleUnaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalPropertyCS.g:265:5: (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' )
                {
                // InternalPropertyCS.g:265:5: (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' )
                // InternalPropertyCS.g:266:6: otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')'
                {
                otherlv_6=(Token)match(input,14,FOLLOW_9); if (state.failed) return ;
                // InternalPropertyCS.g:270:6: ( (lv_left_7_0= ruleBinaryProperty ) )
                // InternalPropertyCS.g:271:7: (lv_left_7_0= ruleBinaryProperty )
                {
                // InternalPropertyCS.g:271:7: (lv_left_7_0= ruleBinaryProperty )
                // InternalPropertyCS.g:272:8: lv_left_7_0= ruleBinaryProperty
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_0_1_3_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_7_0=ruleBinaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_8=(Token)match(input,15,FOLLOW_6); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalPropertyCS.g:295:4: ( ( 'and' )=>otherlv_9= 'and' )
        // InternalPropertyCS.g:296:5: ( 'and' )=>otherlv_9= 'and'
        {
        otherlv_9=(Token)match(input,16,FOLLOW_10); if (state.failed) return ;

        }

        // InternalPropertyCS.g:302:4: ( (lv_right_10_0= ruleProperty ) )
        // InternalPropertyCS.g:303:5: (lv_right_10_0= ruleProperty )
        {
        // InternalPropertyCS.g:303:5: (lv_right_10_0= ruleProperty )
        // InternalPropertyCS.g:304:6: lv_right_10_0= ruleProperty
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPropertyAccess().getRightPropertyParserRuleCall_0_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_10_0=ruleProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalPropertyCS

    // $ANTLR start synpred8_InternalPropertyCS
    public final void synpred8_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_12_0 = null;


        // InternalPropertyCS.g:335:5: ( ( (lv_left_12_0= ruleUnaryProperty ) ) )
        // InternalPropertyCS.g:335:5: ( (lv_left_12_0= ruleUnaryProperty ) )
        {
        // InternalPropertyCS.g:335:5: ( (lv_left_12_0= ruleUnaryProperty ) )
        // InternalPropertyCS.g:336:6: (lv_left_12_0= ruleUnaryProperty )
        {
        // InternalPropertyCS.g:336:6: (lv_left_12_0= ruleUnaryProperty )
        // InternalPropertyCS.g:337:7: lv_left_12_0= ruleUnaryProperty
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_1_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_12_0=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalPropertyCS

    // $ANTLR start synpred9_InternalPropertyCS
    public final void synpred9_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_13_0 = null;


        // InternalPropertyCS.g:355:5: ( ( (lv_left_13_0= ruleBinaryProperty ) ) )
        // InternalPropertyCS.g:355:5: ( (lv_left_13_0= ruleBinaryProperty ) )
        {
        // InternalPropertyCS.g:355:5: ( (lv_left_13_0= ruleBinaryProperty ) )
        // InternalPropertyCS.g:356:6: (lv_left_13_0= ruleBinaryProperty )
        {
        // InternalPropertyCS.g:356:6: (lv_left_13_0= ruleBinaryProperty )
        // InternalPropertyCS.g:357:7: lv_left_13_0= ruleBinaryProperty
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_1_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_13_0=ruleBinaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalPropertyCS

    // $ANTLR start synpred10_InternalPropertyCS
    public final void synpred10_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_left_15_0 = null;


        // InternalPropertyCS.g:375:5: ( (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) )
        // InternalPropertyCS.g:375:5: (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' )
        {
        // InternalPropertyCS.g:375:5: (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' )
        // InternalPropertyCS.g:376:6: otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')'
        {
        otherlv_14=(Token)match(input,14,FOLLOW_7); if (state.failed) return ;
        // InternalPropertyCS.g:380:6: ( (lv_left_15_0= ruleUnaryProperty ) )
        // InternalPropertyCS.g:381:7: (lv_left_15_0= ruleUnaryProperty )
        {
        // InternalPropertyCS.g:381:7: (lv_left_15_0= ruleUnaryProperty )
        // InternalPropertyCS.g:382:8: lv_left_15_0= ruleUnaryProperty
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_1_1_2_1_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_left_15_0=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_16=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalPropertyCS

    // $ANTLR start synpred12_InternalPropertyCS
    public final void synpred12_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_left_12_0 = null;

        EObject lv_left_13_0 = null;

        EObject lv_left_15_0 = null;

        EObject lv_left_18_0 = null;

        EObject lv_right_21_0 = null;


        // InternalPropertyCS.g:323:3: ( ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) ) )
        // InternalPropertyCS.g:323:3: ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) )
        {
        // InternalPropertyCS.g:323:3: ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) )
        // InternalPropertyCS.g:324:4: () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) )
        {
        // InternalPropertyCS.g:324:4: ()
        // InternalPropertyCS.g:325:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:334:4: ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) )
        int alt33=4;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // InternalPropertyCS.g:335:5: ( (lv_left_12_0= ruleUnaryProperty ) )
                {
                // InternalPropertyCS.g:335:5: ( (lv_left_12_0= ruleUnaryProperty ) )
                // InternalPropertyCS.g:336:6: (lv_left_12_0= ruleUnaryProperty )
                {
                // InternalPropertyCS.g:336:6: (lv_left_12_0= ruleUnaryProperty )
                // InternalPropertyCS.g:337:7: lv_left_12_0= ruleUnaryProperty
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_1_1_0_0());
                  						
                }
                pushFollow(FOLLOW_11);
                lv_left_12_0=ruleUnaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalPropertyCS.g:355:5: ( (lv_left_13_0= ruleBinaryProperty ) )
                {
                // InternalPropertyCS.g:355:5: ( (lv_left_13_0= ruleBinaryProperty ) )
                // InternalPropertyCS.g:356:6: (lv_left_13_0= ruleBinaryProperty )
                {
                // InternalPropertyCS.g:356:6: (lv_left_13_0= ruleBinaryProperty )
                // InternalPropertyCS.g:357:7: lv_left_13_0= ruleBinaryProperty
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_1_1_1_0());
                  						
                }
                pushFollow(FOLLOW_11);
                lv_left_13_0=ruleBinaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalPropertyCS.g:375:5: (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' )
                {
                // InternalPropertyCS.g:375:5: (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' )
                // InternalPropertyCS.g:376:6: otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')'
                {
                otherlv_14=(Token)match(input,14,FOLLOW_7); if (state.failed) return ;
                // InternalPropertyCS.g:380:6: ( (lv_left_15_0= ruleUnaryProperty ) )
                // InternalPropertyCS.g:381:7: (lv_left_15_0= ruleUnaryProperty )
                {
                // InternalPropertyCS.g:381:7: (lv_left_15_0= ruleUnaryProperty )
                // InternalPropertyCS.g:382:8: lv_left_15_0= ruleUnaryProperty
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_1_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_15_0=ruleUnaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_16=(Token)match(input,15,FOLLOW_11); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalPropertyCS.g:405:5: (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' )
                {
                // InternalPropertyCS.g:405:5: (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' )
                // InternalPropertyCS.g:406:6: otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')'
                {
                otherlv_17=(Token)match(input,14,FOLLOW_9); if (state.failed) return ;
                // InternalPropertyCS.g:410:6: ( (lv_left_18_0= ruleBinaryProperty ) )
                // InternalPropertyCS.g:411:7: (lv_left_18_0= ruleBinaryProperty )
                {
                // InternalPropertyCS.g:411:7: (lv_left_18_0= ruleBinaryProperty )
                // InternalPropertyCS.g:412:8: lv_left_18_0= ruleBinaryProperty
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_1_1_3_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_18_0=ruleBinaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_19=(Token)match(input,15,FOLLOW_11); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalPropertyCS.g:435:4: ( ( 'or' )=>otherlv_20= 'or' )
        // InternalPropertyCS.g:436:5: ( 'or' )=>otherlv_20= 'or'
        {
        otherlv_20=(Token)match(input,17,FOLLOW_10); if (state.failed) return ;

        }

        // InternalPropertyCS.g:442:4: ( (lv_right_21_0= ruleProperty ) )
        // InternalPropertyCS.g:443:5: (lv_right_21_0= ruleProperty )
        {
        // InternalPropertyCS.g:443:5: (lv_right_21_0= ruleProperty )
        // InternalPropertyCS.g:444:6: lv_right_21_0= ruleProperty
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPropertyAccess().getRightPropertyParserRuleCall_1_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_21_0=ruleProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalPropertyCS

    // $ANTLR start synpred13_InternalPropertyCS
    public final void synpred13_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_23_0 = null;


        // InternalPropertyCS.g:475:5: ( ( (lv_left_23_0= ruleUnaryProperty ) ) )
        // InternalPropertyCS.g:475:5: ( (lv_left_23_0= ruleUnaryProperty ) )
        {
        // InternalPropertyCS.g:475:5: ( (lv_left_23_0= ruleUnaryProperty ) )
        // InternalPropertyCS.g:476:6: (lv_left_23_0= ruleUnaryProperty )
        {
        // InternalPropertyCS.g:476:6: (lv_left_23_0= ruleUnaryProperty )
        // InternalPropertyCS.g:477:7: lv_left_23_0= ruleUnaryProperty
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_2_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_23_0=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalPropertyCS

    // $ANTLR start synpred14_InternalPropertyCS
    public final void synpred14_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_24_0 = null;


        // InternalPropertyCS.g:495:5: ( ( (lv_left_24_0= ruleBinaryProperty ) ) )
        // InternalPropertyCS.g:495:5: ( (lv_left_24_0= ruleBinaryProperty ) )
        {
        // InternalPropertyCS.g:495:5: ( (lv_left_24_0= ruleBinaryProperty ) )
        // InternalPropertyCS.g:496:6: (lv_left_24_0= ruleBinaryProperty )
        {
        // InternalPropertyCS.g:496:6: (lv_left_24_0= ruleBinaryProperty )
        // InternalPropertyCS.g:497:7: lv_left_24_0= ruleBinaryProperty
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_24_0=ruleBinaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalPropertyCS

    // $ANTLR start synpred15_InternalPropertyCS
    public final void synpred15_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_left_26_0 = null;


        // InternalPropertyCS.g:515:5: ( (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) )
        // InternalPropertyCS.g:515:5: (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' )
        {
        // InternalPropertyCS.g:515:5: (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' )
        // InternalPropertyCS.g:516:6: otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')'
        {
        otherlv_25=(Token)match(input,14,FOLLOW_7); if (state.failed) return ;
        // InternalPropertyCS.g:520:6: ( (lv_left_26_0= ruleUnaryProperty ) )
        // InternalPropertyCS.g:521:7: (lv_left_26_0= ruleUnaryProperty )
        {
        // InternalPropertyCS.g:521:7: (lv_left_26_0= ruleUnaryProperty )
        // InternalPropertyCS.g:522:8: lv_left_26_0= ruleUnaryProperty
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_2_1_2_1_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_left_26_0=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_27=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalPropertyCS

    // $ANTLR start synpred17_InternalPropertyCS
    public final void synpred17_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        EObject lv_left_23_0 = null;

        EObject lv_left_24_0 = null;

        EObject lv_left_26_0 = null;

        EObject lv_left_29_0 = null;

        EObject lv_right_32_0 = null;


        // InternalPropertyCS.g:463:3: ( ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) ) )
        // InternalPropertyCS.g:463:3: ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) )
        {
        // InternalPropertyCS.g:463:3: ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) )
        // InternalPropertyCS.g:464:4: () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) )
        {
        // InternalPropertyCS.g:464:4: ()
        // InternalPropertyCS.g:465:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:474:4: ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) )
        int alt34=4;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // InternalPropertyCS.g:475:5: ( (lv_left_23_0= ruleUnaryProperty ) )
                {
                // InternalPropertyCS.g:475:5: ( (lv_left_23_0= ruleUnaryProperty ) )
                // InternalPropertyCS.g:476:6: (lv_left_23_0= ruleUnaryProperty )
                {
                // InternalPropertyCS.g:476:6: (lv_left_23_0= ruleUnaryProperty )
                // InternalPropertyCS.g:477:7: lv_left_23_0= ruleUnaryProperty
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_2_1_0_0());
                  						
                }
                pushFollow(FOLLOW_12);
                lv_left_23_0=ruleUnaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalPropertyCS.g:495:5: ( (lv_left_24_0= ruleBinaryProperty ) )
                {
                // InternalPropertyCS.g:495:5: ( (lv_left_24_0= ruleBinaryProperty ) )
                // InternalPropertyCS.g:496:6: (lv_left_24_0= ruleBinaryProperty )
                {
                // InternalPropertyCS.g:496:6: (lv_left_24_0= ruleBinaryProperty )
                // InternalPropertyCS.g:497:7: lv_left_24_0= ruleBinaryProperty
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_2_1_1_0());
                  						
                }
                pushFollow(FOLLOW_12);
                lv_left_24_0=ruleBinaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalPropertyCS.g:515:5: (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' )
                {
                // InternalPropertyCS.g:515:5: (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' )
                // InternalPropertyCS.g:516:6: otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')'
                {
                otherlv_25=(Token)match(input,14,FOLLOW_7); if (state.failed) return ;
                // InternalPropertyCS.g:520:6: ( (lv_left_26_0= ruleUnaryProperty ) )
                // InternalPropertyCS.g:521:7: (lv_left_26_0= ruleUnaryProperty )
                {
                // InternalPropertyCS.g:521:7: (lv_left_26_0= ruleUnaryProperty )
                // InternalPropertyCS.g:522:8: lv_left_26_0= ruleUnaryProperty
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_26_0=ruleUnaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_27=(Token)match(input,15,FOLLOW_12); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalPropertyCS.g:545:5: (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' )
                {
                // InternalPropertyCS.g:545:5: (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' )
                // InternalPropertyCS.g:546:6: otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')'
                {
                otherlv_28=(Token)match(input,14,FOLLOW_9); if (state.failed) return ;
                // InternalPropertyCS.g:550:6: ( (lv_left_29_0= ruleBinaryProperty ) )
                // InternalPropertyCS.g:551:7: (lv_left_29_0= ruleBinaryProperty )
                {
                // InternalPropertyCS.g:551:7: (lv_left_29_0= ruleBinaryProperty )
                // InternalPropertyCS.g:552:8: lv_left_29_0= ruleBinaryProperty
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_2_1_3_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_29_0=ruleBinaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_30=(Token)match(input,15,FOLLOW_12); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalPropertyCS.g:575:4: ( ( 'abort' )=>otherlv_31= 'abort' )
        // InternalPropertyCS.g:576:5: ( 'abort' )=>otherlv_31= 'abort'
        {
        otherlv_31=(Token)match(input,18,FOLLOW_13); if (state.failed) return ;

        }

        // InternalPropertyCS.g:582:4: ( (lv_right_32_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:583:5: (lv_right_32_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:583:5: (lv_right_32_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:584:6: lv_right_32_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPropertyAccess().getRightSequenceTerminalParserRuleCall_2_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_32_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalPropertyCS

    // $ANTLR start synpred18_InternalPropertyCS
    public final void synpred18_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_34_0 = null;


        // InternalPropertyCS.g:615:5: ( ( (lv_left_34_0= ruleUnaryProperty ) ) )
        // InternalPropertyCS.g:615:5: ( (lv_left_34_0= ruleUnaryProperty ) )
        {
        // InternalPropertyCS.g:615:5: ( (lv_left_34_0= ruleUnaryProperty ) )
        // InternalPropertyCS.g:616:6: (lv_left_34_0= ruleUnaryProperty )
        {
        // InternalPropertyCS.g:616:6: (lv_left_34_0= ruleUnaryProperty )
        // InternalPropertyCS.g:617:7: lv_left_34_0= ruleUnaryProperty
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_3_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_34_0=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalPropertyCS

    // $ANTLR start synpred19_InternalPropertyCS
    public final void synpred19_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_35_0 = null;


        // InternalPropertyCS.g:635:5: ( ( (lv_left_35_0= ruleBinaryProperty ) ) )
        // InternalPropertyCS.g:635:5: ( (lv_left_35_0= ruleBinaryProperty ) )
        {
        // InternalPropertyCS.g:635:5: ( (lv_left_35_0= ruleBinaryProperty ) )
        // InternalPropertyCS.g:636:6: (lv_left_35_0= ruleBinaryProperty )
        {
        // InternalPropertyCS.g:636:6: (lv_left_35_0= ruleBinaryProperty )
        // InternalPropertyCS.g:637:7: lv_left_35_0= ruleBinaryProperty
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_3_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_left_35_0=ruleBinaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalPropertyCS

    // $ANTLR start synpred20_InternalPropertyCS
    public final void synpred20_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_36=null;
        Token otherlv_38=null;
        EObject lv_left_37_0 = null;


        // InternalPropertyCS.g:655:5: ( (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) )
        // InternalPropertyCS.g:655:5: (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' )
        {
        // InternalPropertyCS.g:655:5: (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' )
        // InternalPropertyCS.g:656:6: otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')'
        {
        otherlv_36=(Token)match(input,14,FOLLOW_7); if (state.failed) return ;
        // InternalPropertyCS.g:660:6: ( (lv_left_37_0= ruleUnaryProperty ) )
        // InternalPropertyCS.g:661:7: (lv_left_37_0= ruleUnaryProperty )
        {
        // InternalPropertyCS.g:661:7: (lv_left_37_0= ruleUnaryProperty )
        // InternalPropertyCS.g:662:8: lv_left_37_0= ruleUnaryProperty
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_3_1_2_1_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_left_37_0=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_38=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalPropertyCS

    // $ANTLR start synpred22_InternalPropertyCS
    public final void synpred22_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        EObject lv_left_34_0 = null;

        EObject lv_left_35_0 = null;

        EObject lv_left_37_0 = null;

        EObject lv_left_40_0 = null;

        EObject lv_right_43_0 = null;


        // InternalPropertyCS.g:603:3: ( ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) ) )
        // InternalPropertyCS.g:603:3: ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) )
        {
        // InternalPropertyCS.g:603:3: ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) )
        // InternalPropertyCS.g:604:4: () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) )
        {
        // InternalPropertyCS.g:604:4: ()
        // InternalPropertyCS.g:605:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:614:4: ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) )
        int alt35=4;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // InternalPropertyCS.g:615:5: ( (lv_left_34_0= ruleUnaryProperty ) )
                {
                // InternalPropertyCS.g:615:5: ( (lv_left_34_0= ruleUnaryProperty ) )
                // InternalPropertyCS.g:616:6: (lv_left_34_0= ruleUnaryProperty )
                {
                // InternalPropertyCS.g:616:6: (lv_left_34_0= ruleUnaryProperty )
                // InternalPropertyCS.g:617:7: lv_left_34_0= ruleUnaryProperty
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_3_1_0_0());
                  						
                }
                pushFollow(FOLLOW_14);
                lv_left_34_0=ruleUnaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalPropertyCS.g:635:5: ( (lv_left_35_0= ruleBinaryProperty ) )
                {
                // InternalPropertyCS.g:635:5: ( (lv_left_35_0= ruleBinaryProperty ) )
                // InternalPropertyCS.g:636:6: (lv_left_35_0= ruleBinaryProperty )
                {
                // InternalPropertyCS.g:636:6: (lv_left_35_0= ruleBinaryProperty )
                // InternalPropertyCS.g:637:7: lv_left_35_0= ruleBinaryProperty
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_3_1_1_0());
                  						
                }
                pushFollow(FOLLOW_14);
                lv_left_35_0=ruleBinaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalPropertyCS.g:655:5: (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' )
                {
                // InternalPropertyCS.g:655:5: (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' )
                // InternalPropertyCS.g:656:6: otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')'
                {
                otherlv_36=(Token)match(input,14,FOLLOW_7); if (state.failed) return ;
                // InternalPropertyCS.g:660:6: ( (lv_left_37_0= ruleUnaryProperty ) )
                // InternalPropertyCS.g:661:7: (lv_left_37_0= ruleUnaryProperty )
                {
                // InternalPropertyCS.g:661:7: (lv_left_37_0= ruleUnaryProperty )
                // InternalPropertyCS.g:662:8: lv_left_37_0= ruleUnaryProperty
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getPropertyAccess().getLeftUnaryPropertyParserRuleCall_3_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_37_0=ruleUnaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_38=(Token)match(input,15,FOLLOW_14); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalPropertyCS.g:685:5: (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' )
                {
                // InternalPropertyCS.g:685:5: (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' )
                // InternalPropertyCS.g:686:6: otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')'
                {
                otherlv_39=(Token)match(input,14,FOLLOW_9); if (state.failed) return ;
                // InternalPropertyCS.g:690:6: ( (lv_left_40_0= ruleBinaryProperty ) )
                // InternalPropertyCS.g:691:7: (lv_left_40_0= ruleBinaryProperty )
                {
                // InternalPropertyCS.g:691:7: (lv_left_40_0= ruleBinaryProperty )
                // InternalPropertyCS.g:692:8: lv_left_40_0= ruleBinaryProperty
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getPropertyAccess().getLeftBinaryPropertyParserRuleCall_3_1_3_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_40_0=ruleBinaryProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_41=(Token)match(input,15,FOLLOW_14); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalPropertyCS.g:715:4: ( ( 'until' )=>otherlv_42= 'until' )
        // InternalPropertyCS.g:716:5: ( 'until' )=>otherlv_42= 'until'
        {
        otherlv_42=(Token)match(input,19,FOLLOW_13); if (state.failed) return ;

        }

        // InternalPropertyCS.g:722:4: ( (lv_right_43_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:723:5: (lv_right_43_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:723:5: (lv_right_43_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:724:6: lv_right_43_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPropertyAccess().getRightSequenceTerminalParserRuleCall_3_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_43_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalPropertyCS

    // $ANTLR start synpred23_InternalPropertyCS
    public final void synpred23_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject this_UnaryProperty_44 = null;


        // InternalPropertyCS.g:743:3: (this_UnaryProperty_44= ruleUnaryProperty )
        // InternalPropertyCS.g:743:3: this_UnaryProperty_44= ruleUnaryProperty
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_UnaryProperty_44=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalPropertyCS

    // $ANTLR start synpred24_InternalPropertyCS
    public final void synpred24_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject this_BinaryProperty_45 = null;


        // InternalPropertyCS.g:755:3: (this_BinaryProperty_45= ruleBinaryProperty )
        // InternalPropertyCS.g:755:3: this_BinaryProperty_45= ruleBinaryProperty
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_BinaryProperty_45=ruleBinaryProperty();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalPropertyCS

    // $ANTLR start synpred25_InternalPropertyCS
    public final void synpred25_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_46=null;
        Token otherlv_48=null;
        EObject this_UnaryProperty_47 = null;


        // InternalPropertyCS.g:767:3: ( (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' ) )
        // InternalPropertyCS.g:767:3: (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' )
        {
        // InternalPropertyCS.g:767:3: (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' )
        // InternalPropertyCS.g:768:4: otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')'
        {
        otherlv_46=(Token)match(input,14,FOLLOW_7); if (state.failed) return ;
        pushFollow(FOLLOW_8);
        this_UnaryProperty_47=ruleUnaryProperty();

        state._fsp--;
        if (state.failed) return ;
        otherlv_48=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalPropertyCS

    // $ANTLR start synpred26_InternalPropertyCS
    public final void synpred26_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_operand_1_0 = null;


        // InternalPropertyCS.g:829:3: ( ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) ) )
        // InternalPropertyCS.g:829:3: ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) )
        {
        // InternalPropertyCS.g:829:3: ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) )
        // InternalPropertyCS.g:830:4: () ( (lv_operand_1_0= ruleSequenceTerminal ) )
        {
        // InternalPropertyCS.g:830:4: ()
        // InternalPropertyCS.g:831:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:840:4: ( (lv_operand_1_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:841:5: (lv_operand_1_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:841:5: (lv_operand_1_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:842:6: lv_operand_1_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_operand_1_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred26_InternalPropertyCS

    // $ANTLR start synpred27_InternalPropertyCS
    public final void synpred27_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_operand_3_0 = null;


        // InternalPropertyCS.g:861:3: ( ( () ( (lv_operand_3_0= ruleSequence ) ) ) )
        // InternalPropertyCS.g:861:3: ( () ( (lv_operand_3_0= ruleSequence ) ) )
        {
        // InternalPropertyCS.g:861:3: ( () ( (lv_operand_3_0= ruleSequence ) ) )
        // InternalPropertyCS.g:862:4: () ( (lv_operand_3_0= ruleSequence ) )
        {
        // InternalPropertyCS.g:862:4: ()
        // InternalPropertyCS.g:863:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:872:4: ( (lv_operand_3_0= ruleSequence ) )
        // InternalPropertyCS.g:873:5: (lv_operand_3_0= ruleSequence )
        {
        // InternalPropertyCS.g:873:5: (lv_operand_3_0= ruleSequence )
        // InternalPropertyCS.g:874:6: lv_operand_3_0= ruleSequence
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_operand_3_0=ruleSequence();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalPropertyCS

    // $ANTLR start synpred28_InternalPropertyCS
    public final void synpred28_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_operand_5_0 = null;


        // InternalPropertyCS.g:893:3: ( ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' ) )
        // InternalPropertyCS.g:893:3: ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' )
        {
        // InternalPropertyCS.g:893:3: ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' )
        // InternalPropertyCS.g:894:4: () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!'
        {
        // InternalPropertyCS.g:894:4: ()
        // InternalPropertyCS.g:895:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:904:4: ( (lv_operand_5_0= ruleSequence ) )
        // InternalPropertyCS.g:905:5: (lv_operand_5_0= ruleSequence )
        {
        // InternalPropertyCS.g:905:5: (lv_operand_5_0= ruleSequence )
        // InternalPropertyCS.g:906:6: lv_operand_5_0= ruleSequence
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_15);
        lv_operand_5_0=ruleSequence();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalPropertyCS

    // $ANTLR start synpred30_InternalPropertyCS
    public final void synpred30_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        EObject lv_operand_12_0 = null;


        // InternalPropertyCS.g:965:3: ( ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) ) )
        // InternalPropertyCS.g:965:3: ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) )
        {
        // InternalPropertyCS.g:965:3: ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) )
        // InternalPropertyCS.g:966:4: () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) )
        {
        // InternalPropertyCS.g:966:4: ()
        // InternalPropertyCS.g:967:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_11=(Token)match(input,22,FOLLOW_13); if (state.failed) return ;
        // InternalPropertyCS.g:980:4: ( (lv_operand_12_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:981:5: (lv_operand_12_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:981:5: (lv_operand_12_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:982:6: lv_operand_12_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_4_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_operand_12_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalPropertyCS

    // $ANTLR start synpred31_InternalPropertyCS
    public final void synpred31_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        EObject lv_operand_15_0 = null;


        // InternalPropertyCS.g:1001:3: ( ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) ) )
        // InternalPropertyCS.g:1001:3: ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) )
        {
        // InternalPropertyCS.g:1001:3: ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) )
        // InternalPropertyCS.g:1002:4: () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) )
        {
        // InternalPropertyCS.g:1002:4: ()
        // InternalPropertyCS.g:1003:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_14=(Token)match(input,22,FOLLOW_16); if (state.failed) return ;
        // InternalPropertyCS.g:1016:4: ( (lv_operand_15_0= ruleSequence ) )
        // InternalPropertyCS.g:1017:5: (lv_operand_15_0= ruleSequence )
        {
        // InternalPropertyCS.g:1017:5: (lv_operand_15_0= ruleSequence )
        // InternalPropertyCS.g:1018:6: lv_operand_15_0= ruleSequence
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_5_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_operand_15_0=ruleSequence();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalPropertyCS

    // $ANTLR start synpred33_InternalPropertyCS
    public final void synpred33_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_20=null;
        EObject lv_operand_21_0 = null;


        // InternalPropertyCS.g:1073:3: ( ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) ) )
        // InternalPropertyCS.g:1073:3: ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) )
        {
        // InternalPropertyCS.g:1073:3: ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) )
        // InternalPropertyCS.g:1074:4: () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) )
        {
        // InternalPropertyCS.g:1074:4: ()
        // InternalPropertyCS.g:1075:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_20=(Token)match(input,24,FOLLOW_13); if (state.failed) return ;
        // InternalPropertyCS.g:1088:4: ( (lv_operand_21_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1089:5: (lv_operand_21_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1089:5: (lv_operand_21_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1090:6: lv_operand_21_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_7_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_operand_21_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred33_InternalPropertyCS

    // $ANTLR start synpred34_InternalPropertyCS
    public final void synpred34_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;


        // InternalPropertyCS.g:1163:3: ( ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) ) )
        // InternalPropertyCS.g:1163:3: ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) )
        {
        // InternalPropertyCS.g:1163:3: ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) )
        // InternalPropertyCS.g:1164:4: () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) )
        {
        // InternalPropertyCS.g:1164:4: ()
        // InternalPropertyCS.g:1165:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:1174:4: ( (lv_left_1_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1175:5: (lv_left_1_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1175:5: (lv_left_1_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1176:6: lv_left_1_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_11);
        lv_left_1_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,17,FOLLOW_10); if (state.failed) return ;
        // InternalPropertyCS.g:1197:4: ( (lv_right_3_0= ruleProperty ) )
        // InternalPropertyCS.g:1198:5: (lv_right_3_0= ruleProperty )
        {
        // InternalPropertyCS.g:1198:5: (lv_right_3_0= ruleProperty )
        // InternalPropertyCS.g:1199:6: lv_right_3_0= ruleProperty
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_0_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred34_InternalPropertyCS

    // $ANTLR start synpred35_InternalPropertyCS
    public final void synpred35_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_left_5_0 = null;

        EObject lv_right_7_0 = null;


        // InternalPropertyCS.g:1218:3: ( ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) ) )
        // InternalPropertyCS.g:1218:3: ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) )
        {
        // InternalPropertyCS.g:1218:3: ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) )
        // InternalPropertyCS.g:1219:4: () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) )
        {
        // InternalPropertyCS.g:1219:4: ()
        // InternalPropertyCS.g:1220:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:1229:4: ( (lv_left_5_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1230:5: (lv_left_5_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1230:5: (lv_left_5_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1231:6: lv_left_5_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_17);
        lv_left_5_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,25,FOLLOW_10); if (state.failed) return ;
        // InternalPropertyCS.g:1252:4: ( (lv_right_7_0= ruleProperty ) )
        // InternalPropertyCS.g:1253:5: (lv_right_7_0= ruleProperty )
        {
        // InternalPropertyCS.g:1253:5: (lv_right_7_0= ruleProperty )
        // InternalPropertyCS.g:1254:6: lv_right_7_0= ruleProperty
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_1_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_7_0=ruleProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred35_InternalPropertyCS

    // $ANTLR start synpred36_InternalPropertyCS
    public final void synpred36_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        EObject lv_left_9_0 = null;

        EObject lv_right_11_0 = null;


        // InternalPropertyCS.g:1273:3: ( ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) ) )
        // InternalPropertyCS.g:1273:3: ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) )
        {
        // InternalPropertyCS.g:1273:3: ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) )
        // InternalPropertyCS.g:1274:4: () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) )
        {
        // InternalPropertyCS.g:1274:4: ()
        // InternalPropertyCS.g:1275:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:1284:4: ( (lv_left_9_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1285:5: (lv_left_9_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1285:5: (lv_left_9_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1286:6: lv_left_9_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_18);
        lv_left_9_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,26,FOLLOW_13); if (state.failed) return ;
        // InternalPropertyCS.g:1307:4: ( (lv_right_11_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1308:5: (lv_right_11_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1308:5: (lv_right_11_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1309:6: lv_right_11_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightSequenceTerminalParserRuleCall_2_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_11_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred36_InternalPropertyCS

    // $ANTLR start synpred37_InternalPropertyCS
    public final void synpred37_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        EObject lv_left_13_0 = null;

        EObject lv_right_15_0 = null;


        // InternalPropertyCS.g:1328:3: ( ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) ) )
        // InternalPropertyCS.g:1328:3: ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) )
        {
        // InternalPropertyCS.g:1328:3: ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) )
        // InternalPropertyCS.g:1329:4: () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) )
        {
        // InternalPropertyCS.g:1329:4: ()
        // InternalPropertyCS.g:1330:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:1339:4: ( (lv_left_13_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1340:5: (lv_left_13_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1340:5: (lv_left_13_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1341:6: lv_left_13_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_3_1_0());
          					
        }
        pushFollow(FOLLOW_19);
        lv_left_13_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_14=(Token)match(input,27,FOLLOW_13); if (state.failed) return ;
        // InternalPropertyCS.g:1362:4: ( (lv_right_15_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1363:5: (lv_right_15_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1363:5: (lv_right_15_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1364:6: lv_right_15_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightSequenceTerminalParserRuleCall_3_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_15_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred37_InternalPropertyCS

    // $ANTLR start synpred38_InternalPropertyCS
    public final void synpred38_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_18=null;
        EObject lv_left_17_0 = null;

        EObject lv_right_19_0 = null;


        // InternalPropertyCS.g:1383:3: ( ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) ) )
        // InternalPropertyCS.g:1383:3: ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) )
        {
        // InternalPropertyCS.g:1383:3: ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) )
        // InternalPropertyCS.g:1384:4: () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) )
        {
        // InternalPropertyCS.g:1384:4: ()
        // InternalPropertyCS.g:1385:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:1394:4: ( (lv_left_17_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1395:5: (lv_left_17_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1395:5: (lv_left_17_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1396:6: lv_left_17_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_4_1_0());
          					
        }
        pushFollow(FOLLOW_20);
        lv_left_17_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_18=(Token)match(input,28,FOLLOW_13); if (state.failed) return ;
        // InternalPropertyCS.g:1417:4: ( (lv_right_19_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1418:5: (lv_right_19_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1418:5: (lv_right_19_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1419:6: lv_right_19_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightSequenceTerminalParserRuleCall_4_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_19_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred38_InternalPropertyCS

    // $ANTLR start synpred39_InternalPropertyCS
    public final void synpred39_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_22=null;
        EObject lv_left_21_0 = null;

        EObject lv_right_23_0 = null;


        // InternalPropertyCS.g:1438:3: ( ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) ) )
        // InternalPropertyCS.g:1438:3: ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) )
        {
        // InternalPropertyCS.g:1438:3: ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) )
        // InternalPropertyCS.g:1439:4: () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) )
        {
        // InternalPropertyCS.g:1439:4: ()
        // InternalPropertyCS.g:1440:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:1449:4: ( (lv_left_21_0= ruleSequence ) )
        // InternalPropertyCS.g:1450:5: (lv_left_21_0= ruleSequence )
        {
        // InternalPropertyCS.g:1450:5: (lv_left_21_0= ruleSequence )
        // InternalPropertyCS.g:1451:6: lv_left_21_0= ruleSequence
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceParserRuleCall_5_1_0());
          					
        }
        pushFollow(FOLLOW_21);
        lv_left_21_0=ruleSequence();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_22=(Token)match(input,29,FOLLOW_10); if (state.failed) return ;
        // InternalPropertyCS.g:1472:4: ( (lv_right_23_0= ruleProperty ) )
        // InternalPropertyCS.g:1473:5: (lv_right_23_0= ruleProperty )
        {
        // InternalPropertyCS.g:1473:5: (lv_right_23_0= ruleProperty )
        // InternalPropertyCS.g:1474:6: lv_right_23_0= ruleProperty
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_5_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_23_0=ruleProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred39_InternalPropertyCS

    // $ANTLR start synpred40_InternalPropertyCS
    public final void synpred40_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_26=null;
        EObject lv_left_25_0 = null;

        EObject lv_right_27_0 = null;


        // InternalPropertyCS.g:1493:3: ( ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) ) )
        // InternalPropertyCS.g:1493:3: ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) )
        {
        // InternalPropertyCS.g:1493:3: ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) )
        // InternalPropertyCS.g:1494:4: () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) )
        {
        // InternalPropertyCS.g:1494:4: ()
        // InternalPropertyCS.g:1495:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:1504:4: ( (lv_left_25_0= ruleSequence ) )
        // InternalPropertyCS.g:1505:5: (lv_left_25_0= ruleSequence )
        {
        // InternalPropertyCS.g:1505:5: (lv_left_25_0= ruleSequence )
        // InternalPropertyCS.g:1506:6: lv_left_25_0= ruleSequence
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getLeftSequenceParserRuleCall_6_1_0());
          					
        }
        pushFollow(FOLLOW_22);
        lv_left_25_0=ruleSequence();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_26=(Token)match(input,30,FOLLOW_10); if (state.failed) return ;
        // InternalPropertyCS.g:1527:4: ( (lv_right_27_0= ruleProperty ) )
        // InternalPropertyCS.g:1528:5: (lv_right_27_0= ruleProperty )
        {
        // InternalPropertyCS.g:1528:5: (lv_right_27_0= ruleProperty )
        // InternalPropertyCS.g:1529:6: lv_right_27_0= ruleProperty
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_6_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_27_0=ruleProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred40_InternalPropertyCS

    // $ANTLR start synpred42_InternalPropertyCS
    public final void synpred42_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject this_SequenceTerminal_0 = null;


        // InternalPropertyCS.g:1767:3: (this_SequenceTerminal_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1767:3: this_SequenceTerminal_0= ruleSequenceTerminal
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
    // $ANTLR end synpred42_InternalPropertyCS

    // $ANTLR start synpred43_InternalPropertyCS
    public final void synpred43_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject this_Sequence_1 = null;


        // InternalPropertyCS.g:1779:3: (this_Sequence_1= ruleSequence )
        // InternalPropertyCS.g:1779:3: this_Sequence_1= ruleSequence
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
    // $ANTLR end synpred43_InternalPropertyCS

    // $ANTLR start synpred47_InternalPropertyCS
    public final void synpred47_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject this_BracedSERE_0 = null;


        // InternalPropertyCS.g:1944:3: (this_BracedSERE_0= ruleBracedSERE )
        // InternalPropertyCS.g:1944:3: this_BracedSERE_0= ruleBracedSERE
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
    // $ANTLR end synpred47_InternalPropertyCS

    // $ANTLR start synpred50_InternalPropertyCS
    public final void synpred50_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_1_0 = null;

        EObject lv_count_4_0 = null;


        // InternalPropertyCS.g:1986:3: ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) )
        // InternalPropertyCS.g:1986:3: ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' )
        {
        // InternalPropertyCS.g:1986:3: ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' )
        // InternalPropertyCS.g:1987:4: () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']'
        {
        // InternalPropertyCS.g:1987:4: ()
        // InternalPropertyCS.g:1988:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:1997:4: ( (lv_expression_1_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:1998:5: (lv_expression_1_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:1998:5: (lv_expression_1_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:1999:6: lv_expression_1_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_24);
        lv_expression_1_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalPropertyCS.g:2016:4: ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' )
        // InternalPropertyCS.g:2017:5: ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*'
        {
        // InternalPropertyCS.g:2017:5: ( ( '[' )=>otherlv_2= '[' )
        // InternalPropertyCS.g:2018:6: ( '[' )=>otherlv_2= '['
        {
        otherlv_2=(Token)match(input,32,FOLLOW_29); if (state.failed) return ;

        }

        otherlv_3=(Token)match(input,40,FOLLOW_30); if (state.failed) return ;

        }

        // InternalPropertyCS.g:2029:4: ( (lv_count_4_0= ruleCount ) )?
        int alt37=2;
        int LA37_0 = input.LA(1);

        if ( (LA37_0==RULE_INT) ) {
            alt37=1;
        }
        switch (alt37) {
            case 1 :
                // InternalPropertyCS.g:2030:5: (lv_count_4_0= ruleCount )
                {
                // InternalPropertyCS.g:2030:5: (lv_count_4_0= ruleCount )
                // InternalPropertyCS.g:2031:6: lv_count_4_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_0_3_0());
                  					
                }
                pushFollow(FOLLOW_26);
                lv_count_4_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_5=(Token)match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred50_InternalPropertyCS

    // $ANTLR start synpred53_InternalPropertyCS
    public final void synpred53_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_expression_7_0 = null;

        EObject lv_count_10_0 = null;


        // InternalPropertyCS.g:2054:3: ( ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) )
        // InternalPropertyCS.g:2054:3: ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' )
        {
        // InternalPropertyCS.g:2054:3: ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' )
        // InternalPropertyCS.g:2055:4: () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']'
        {
        // InternalPropertyCS.g:2055:4: ()
        // InternalPropertyCS.g:2056:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:2065:4: ( (lv_expression_7_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:2066:5: (lv_expression_7_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:2066:5: (lv_expression_7_0= ruleBracedSERE )
        // InternalPropertyCS.g:2067:6: lv_expression_7_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_24);
        lv_expression_7_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalPropertyCS.g:2084:4: ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' )
        // InternalPropertyCS.g:2085:5: ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*'
        {
        // InternalPropertyCS.g:2085:5: ( ( '[' )=>otherlv_8= '[' )
        // InternalPropertyCS.g:2086:6: ( '[' )=>otherlv_8= '['
        {
        otherlv_8=(Token)match(input,32,FOLLOW_29); if (state.failed) return ;

        }

        otherlv_9=(Token)match(input,40,FOLLOW_30); if (state.failed) return ;

        }

        // InternalPropertyCS.g:2097:4: ( (lv_count_10_0= ruleCount ) )?
        int alt38=2;
        int LA38_0 = input.LA(1);

        if ( (LA38_0==RULE_INT) ) {
            alt38=1;
        }
        switch (alt38) {
            case 1 :
                // InternalPropertyCS.g:2098:5: (lv_count_10_0= ruleCount )
                {
                // InternalPropertyCS.g:2098:5: (lv_count_10_0= ruleCount )
                // InternalPropertyCS.g:2099:6: lv_count_10_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_1_3_0());
                  					
                }
                pushFollow(FOLLOW_26);
                lv_count_10_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_11=(Token)match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred53_InternalPropertyCS

    // $ANTLR start synpred56_InternalPropertyCS
    public final void synpred56_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_expression_14_0 = null;

        EObject lv_count_18_0 = null;


        // InternalPropertyCS.g:2122:3: ( ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) )
        // InternalPropertyCS.g:2122:3: ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' )
        {
        // InternalPropertyCS.g:2122:3: ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' )
        // InternalPropertyCS.g:2123:4: () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']'
        {
        // InternalPropertyCS.g:2123:4: ()
        // InternalPropertyCS.g:2124:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_13=(Token)match(input,14,FOLLOW_16); if (state.failed) return ;
        // InternalPropertyCS.g:2137:4: ( (lv_expression_14_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:2138:5: (lv_expression_14_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:2138:5: (lv_expression_14_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:2139:6: lv_expression_14_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_2_2_0());
          					
        }
        pushFollow(FOLLOW_8);
        lv_expression_14_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,15,FOLLOW_24); if (state.failed) return ;
        // InternalPropertyCS.g:2160:4: ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' )
        // InternalPropertyCS.g:2161:5: ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*'
        {
        // InternalPropertyCS.g:2161:5: ( ( '[' )=>otherlv_16= '[' )
        // InternalPropertyCS.g:2162:6: ( '[' )=>otherlv_16= '['
        {
        otherlv_16=(Token)match(input,32,FOLLOW_29); if (state.failed) return ;

        }

        otherlv_17=(Token)match(input,40,FOLLOW_30); if (state.failed) return ;

        }

        // InternalPropertyCS.g:2173:4: ( (lv_count_18_0= ruleCount ) )?
        int alt39=2;
        int LA39_0 = input.LA(1);

        if ( (LA39_0==RULE_INT) ) {
            alt39=1;
        }
        switch (alt39) {
            case 1 :
                // InternalPropertyCS.g:2174:5: (lv_count_18_0= ruleCount )
                {
                // InternalPropertyCS.g:2174:5: (lv_count_18_0= ruleCount )
                // InternalPropertyCS.g:2175:6: lv_count_18_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_2_5_0());
                  					
                }
                pushFollow(FOLLOW_26);
                lv_count_18_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_19=(Token)match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred56_InternalPropertyCS

    // $ANTLR start synpred58_InternalPropertyCS
    public final void synpred58_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_expression_21_0 = null;


        // InternalPropertyCS.g:2198:3: ( ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) )
        // InternalPropertyCS.g:2198:3: ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' )
        {
        // InternalPropertyCS.g:2198:3: ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' )
        // InternalPropertyCS.g:2199:4: () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']'
        {
        // InternalPropertyCS.g:2199:4: ()
        // InternalPropertyCS.g:2200:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:2209:4: ( (lv_expression_21_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:2210:5: (lv_expression_21_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:2210:5: (lv_expression_21_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:2211:6: lv_expression_21_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_3_1_0());
          					
        }
        pushFollow(FOLLOW_24);
        lv_expression_21_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalPropertyCS.g:2228:4: ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' )
        // InternalPropertyCS.g:2229:5: ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+'
        {
        // InternalPropertyCS.g:2229:5: ( ( '[' )=>otherlv_22= '[' )
        // InternalPropertyCS.g:2230:6: ( '[' )=>otherlv_22= '['
        {
        otherlv_22=(Token)match(input,32,FOLLOW_31); if (state.failed) return ;

        }

        otherlv_23=(Token)match(input,41,FOLLOW_26); if (state.failed) return ;

        }

        otherlv_24=(Token)match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred58_InternalPropertyCS

    // $ANTLR start synpred60_InternalPropertyCS
    public final void synpred60_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_expression_26_0 = null;


        // InternalPropertyCS.g:2247:3: ( ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) )
        // InternalPropertyCS.g:2247:3: ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' )
        {
        // InternalPropertyCS.g:2247:3: ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' )
        // InternalPropertyCS.g:2248:4: () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']'
        {
        // InternalPropertyCS.g:2248:4: ()
        // InternalPropertyCS.g:2249:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:2258:4: ( (lv_expression_26_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:2259:5: (lv_expression_26_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:2259:5: (lv_expression_26_0= ruleBracedSERE )
        // InternalPropertyCS.g:2260:6: lv_expression_26_0= ruleBracedSERE
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionBracedSEREParserRuleCall_4_1_0());
          					
        }
        pushFollow(FOLLOW_24);
        lv_expression_26_0=ruleBracedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalPropertyCS.g:2277:4: ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' )
        // InternalPropertyCS.g:2278:5: ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+'
        {
        // InternalPropertyCS.g:2278:5: ( ( '[' )=>otherlv_27= '[' )
        // InternalPropertyCS.g:2279:6: ( '[' )=>otherlv_27= '['
        {
        otherlv_27=(Token)match(input,32,FOLLOW_31); if (state.failed) return ;

        }

        otherlv_28=(Token)match(input,41,FOLLOW_26); if (state.failed) return ;

        }

        otherlv_29=(Token)match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred60_InternalPropertyCS

    // $ANTLR start synpred62_InternalPropertyCS
    public final void synpred62_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        EObject lv_expression_32_0 = null;


        // InternalPropertyCS.g:2296:3: ( ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) )
        // InternalPropertyCS.g:2296:3: ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' )
        {
        // InternalPropertyCS.g:2296:3: ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' )
        // InternalPropertyCS.g:2297:4: () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']'
        {
        // InternalPropertyCS.g:2297:4: ()
        // InternalPropertyCS.g:2298:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_31=(Token)match(input,14,FOLLOW_16); if (state.failed) return ;
        // InternalPropertyCS.g:2311:4: ( (lv_expression_32_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:2312:5: (lv_expression_32_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:2312:5: (lv_expression_32_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:2313:6: lv_expression_32_0= ruleRepeatedSERE
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionRepeatedSEREParserRuleCall_5_2_0());
          					
        }
        pushFollow(FOLLOW_8);
        lv_expression_32_0=ruleRepeatedSERE();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_33=(Token)match(input,15,FOLLOW_24); if (state.failed) return ;
        // InternalPropertyCS.g:2334:4: ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' )
        // InternalPropertyCS.g:2335:5: ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+'
        {
        // InternalPropertyCS.g:2335:5: ( ( '[' )=>otherlv_34= '[' )
        // InternalPropertyCS.g:2336:6: ( '[' )=>otherlv_34= '['
        {
        otherlv_34=(Token)match(input,32,FOLLOW_31); if (state.failed) return ;

        }

        otherlv_35=(Token)match(input,41,FOLLOW_26); if (state.failed) return ;

        }

        otherlv_36=(Token)match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred62_InternalPropertyCS

    // $ANTLR start synpred64_InternalPropertyCS
    public final void synpred64_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        EObject lv_expression_38_0 = null;

        EObject lv_count_41_0 = null;


        // InternalPropertyCS.g:2353:3: ( ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) )
        // InternalPropertyCS.g:2353:3: ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' )
        {
        // InternalPropertyCS.g:2353:3: ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' )
        // InternalPropertyCS.g:2354:4: () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']'
        {
        // InternalPropertyCS.g:2354:4: ()
        // InternalPropertyCS.g:2355:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:2364:4: ( (lv_expression_38_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:2365:5: (lv_expression_38_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:2365:5: (lv_expression_38_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:2366:6: lv_expression_38_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_6_1_0());
          					
        }
        pushFollow(FOLLOW_24);
        lv_expression_38_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalPropertyCS.g:2383:4: ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' )
        // InternalPropertyCS.g:2384:5: ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '='
        {
        // InternalPropertyCS.g:2384:5: ( ( '[' )=>otherlv_39= '[' )
        // InternalPropertyCS.g:2385:6: ( '[' )=>otherlv_39= '['
        {
        otherlv_39=(Token)match(input,32,FOLLOW_32); if (state.failed) return ;

        }

        otherlv_40=(Token)match(input,42,FOLLOW_25); if (state.failed) return ;

        }

        // InternalPropertyCS.g:2396:4: ( (lv_count_41_0= ruleCount ) )
        // InternalPropertyCS.g:2397:5: (lv_count_41_0= ruleCount )
        {
        // InternalPropertyCS.g:2397:5: (lv_count_41_0= ruleCount )
        // InternalPropertyCS.g:2398:6: lv_count_41_0= ruleCount
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_6_3_0());
          					
        }
        pushFollow(FOLLOW_26);
        lv_count_41_0=ruleCount();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_42=(Token)match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred64_InternalPropertyCS

    // $ANTLR start synpred67_InternalPropertyCS
    public final void synpred67_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        EObject lv_expression_44_0 = null;

        EObject lv_count_47_0 = null;


        // InternalPropertyCS.g:2421:3: ( ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) )
        // InternalPropertyCS.g:2421:3: ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' )
        {
        // InternalPropertyCS.g:2421:3: ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' )
        // InternalPropertyCS.g:2422:4: () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']'
        {
        // InternalPropertyCS.g:2422:4: ()
        // InternalPropertyCS.g:2423:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:2432:4: ( (lv_expression_44_0= ruleSequenceTerminal ) )
        // InternalPropertyCS.g:2433:5: (lv_expression_44_0= ruleSequenceTerminal )
        {
        // InternalPropertyCS.g:2433:5: (lv_expression_44_0= ruleSequenceTerminal )
        // InternalPropertyCS.g:2434:6: lv_expression_44_0= ruleSequenceTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_7_1_0());
          					
        }
        pushFollow(FOLLOW_24);
        lv_expression_44_0=ruleSequenceTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalPropertyCS.g:2451:4: ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' )
        // InternalPropertyCS.g:2452:5: ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->'
        {
        // InternalPropertyCS.g:2452:5: ( ( '[' )=>otherlv_45= '[' )
        // InternalPropertyCS.g:2453:6: ( '[' )=>otherlv_45= '['
        {
        otherlv_45=(Token)match(input,32,FOLLOW_17); if (state.failed) return ;

        }

        otherlv_46=(Token)match(input,25,FOLLOW_30); if (state.failed) return ;

        }

        // InternalPropertyCS.g:2464:4: ( (lv_count_47_0= ruleCount ) )?
        int alt40=2;
        int LA40_0 = input.LA(1);

        if ( (LA40_0==RULE_INT) ) {
            alt40=1;
        }
        switch (alt40) {
            case 1 :
                // InternalPropertyCS.g:2465:5: (lv_count_47_0= ruleCount )
                {
                // InternalPropertyCS.g:2465:5: (lv_count_47_0= ruleCount )
                // InternalPropertyCS.g:2466:6: lv_count_47_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_7_3_0());
                  					
                }
                pushFollow(FOLLOW_26);
                lv_count_47_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_48=(Token)match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred67_InternalPropertyCS

    // $ANTLR start synpred69_InternalPropertyCS
    public final void synpred69_InternalPropertyCS_fragment() throws RecognitionException {   
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        EObject lv_count_52_0 = null;


        // InternalPropertyCS.g:2489:3: ( ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) )
        // InternalPropertyCS.g:2489:3: ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' )
        {
        // InternalPropertyCS.g:2489:3: ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' )
        // InternalPropertyCS.g:2490:4: () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']'
        {
        // InternalPropertyCS.g:2490:4: ()
        // InternalPropertyCS.g:2491:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_50=(Token)match(input,32,FOLLOW_29); if (state.failed) return ;
        otherlv_51=(Token)match(input,40,FOLLOW_30); if (state.failed) return ;
        // InternalPropertyCS.g:2508:4: ( (lv_count_52_0= ruleCount ) )?
        int alt41=2;
        int LA41_0 = input.LA(1);

        if ( (LA41_0==RULE_INT) ) {
            alt41=1;
        }
        switch (alt41) {
            case 1 :
                // InternalPropertyCS.g:2509:5: (lv_count_52_0= ruleCount )
                {
                // InternalPropertyCS.g:2509:5: (lv_count_52_0= ruleCount )
                // InternalPropertyCS.g:2510:6: lv_count_52_0= ruleCount
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_8_3_0());
                  					
                }
                pushFollow(FOLLOW_26);
                lv_count_52_0=ruleCount();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_53=(Token)match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred69_InternalPropertyCS

    // $ANTLR start synpred70_InternalPropertyCS
    public final void synpred70_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject this_RepeatedSERE_0 = null;


        // InternalPropertyCS.g:2622:3: (this_RepeatedSERE_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:2622:3: this_RepeatedSERE_0= ruleRepeatedSERE
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
    // $ANTLR end synpred70_InternalPropertyCS

    // $ANTLR start synpred71_InternalPropertyCS
    public final void synpred71_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject this_BracedSERE_1 = null;


        // InternalPropertyCS.g:2634:3: (this_BracedSERE_1= ruleBracedSERE )
        // InternalPropertyCS.g:2634:3: this_BracedSERE_1= ruleBracedSERE
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
    // $ANTLR end synpred71_InternalPropertyCS

    // $ANTLR start synpred72_InternalPropertyCS
    public final void synpred72_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_1_0 = null;


        // InternalPropertyCS.g:2688:5: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) )
        // InternalPropertyCS.g:2688:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
        {
        // InternalPropertyCS.g:2688:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:2689:6: (lv_left_1_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:2689:6: (lv_left_1_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:2690:7: lv_left_1_0= ruleRepeatedSERE
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
    // $ANTLR end synpred72_InternalPropertyCS

    // $ANTLR start synpred73_InternalPropertyCS
    public final void synpred73_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_2_0 = null;


        // InternalPropertyCS.g:2708:5: ( ( (lv_left_2_0= ruleBracedSERE ) ) )
        // InternalPropertyCS.g:2708:5: ( (lv_left_2_0= ruleBracedSERE ) )
        {
        // InternalPropertyCS.g:2708:5: ( (lv_left_2_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:2709:6: (lv_left_2_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:2709:6: (lv_left_2_0= ruleBracedSERE )
        // InternalPropertyCS.g:2710:7: lv_left_2_0= ruleBracedSERE
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
    // $ANTLR end synpred73_InternalPropertyCS

    // $ANTLR start synpred75_InternalPropertyCS
    public final void synpred75_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_right_7_0 = null;


        // InternalPropertyCS.g:2766:5: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) )
        // InternalPropertyCS.g:2766:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
        {
        // InternalPropertyCS.g:2766:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:2767:6: (lv_right_7_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:2767:6: (lv_right_7_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:2768:7: lv_right_7_0= ruleRepeatedSERE
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
    // $ANTLR end synpred75_InternalPropertyCS

    // $ANTLR start synpred76_InternalPropertyCS
    public final void synpred76_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_right_8_0 = null;


        // InternalPropertyCS.g:2786:5: ( ( (lv_right_8_0= ruleBracedSERE ) ) )
        // InternalPropertyCS.g:2786:5: ( (lv_right_8_0= ruleBracedSERE ) )
        {
        // InternalPropertyCS.g:2786:5: ( (lv_right_8_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:2787:6: (lv_right_8_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:2787:6: (lv_right_8_0= ruleBracedSERE )
        // InternalPropertyCS.g:2788:7: lv_right_8_0= ruleBracedSERE
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
    // $ANTLR end synpred76_InternalPropertyCS

    // $ANTLR start synpred77_InternalPropertyCS
    public final void synpred77_InternalPropertyCS_fragment() throws RecognitionException {   
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


        // InternalPropertyCS.g:2676:3: ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) )
        // InternalPropertyCS.g:2676:3: ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) )
        {
        // InternalPropertyCS.g:2676:3: ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) )
        // InternalPropertyCS.g:2677:4: () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )
        {
        // InternalPropertyCS.g:2677:4: ()
        // InternalPropertyCS.g:2678:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:2687:4: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) )
        int alt42=3;
        alt42 = dfa42.predict(input);
        switch (alt42) {
            case 1 :
                // InternalPropertyCS.g:2688:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
                {
                // InternalPropertyCS.g:2688:5: ( (lv_left_1_0= ruleRepeatedSERE ) )
                // InternalPropertyCS.g:2689:6: (lv_left_1_0= ruleRepeatedSERE )
                {
                // InternalPropertyCS.g:2689:6: (lv_left_1_0= ruleRepeatedSERE )
                // InternalPropertyCS.g:2690:7: lv_left_1_0= ruleRepeatedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_0_1_0_0());
                  						
                }
                pushFollow(FOLLOW_34);
                lv_left_1_0=ruleRepeatedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalPropertyCS.g:2708:5: ( (lv_left_2_0= ruleBracedSERE ) )
                {
                // InternalPropertyCS.g:2708:5: ( (lv_left_2_0= ruleBracedSERE ) )
                // InternalPropertyCS.g:2709:6: (lv_left_2_0= ruleBracedSERE )
                {
                // InternalPropertyCS.g:2709:6: (lv_left_2_0= ruleBracedSERE )
                // InternalPropertyCS.g:2710:7: lv_left_2_0= ruleBracedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FOLLOW_34);
                lv_left_2_0=ruleBracedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalPropertyCS.g:2728:5: (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' )
                {
                // InternalPropertyCS.g:2728:5: (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' )
                // InternalPropertyCS.g:2729:6: otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')'
                {
                otherlv_3=(Token)match(input,14,FOLLOW_16); if (state.failed) return ;
                // InternalPropertyCS.g:2733:6: ( (lv_left_4_0= ruleBinaryCompoundSERE ) )
                // InternalPropertyCS.g:2734:7: (lv_left_4_0= ruleBinaryCompoundSERE )
                {
                // InternalPropertyCS.g:2734:7: (lv_left_4_0= ruleBinaryCompoundSERE )
                // InternalPropertyCS.g:2735:8: lv_left_4_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_0_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_4_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_5=(Token)match(input,15,FOLLOW_34); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalPropertyCS.g:2758:4: ( ( '|' )=>otherlv_6= '|' )
        // InternalPropertyCS.g:2759:5: ( '|' )=>otherlv_6= '|'
        {
        otherlv_6=(Token)match(input,45,FOLLOW_16); if (state.failed) return ;

        }

        // InternalPropertyCS.g:2765:4: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )
        int alt43=3;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // InternalPropertyCS.g:2766:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
                {
                // InternalPropertyCS.g:2766:5: ( (lv_right_7_0= ruleRepeatedSERE ) )
                // InternalPropertyCS.g:2767:6: (lv_right_7_0= ruleRepeatedSERE )
                {
                // InternalPropertyCS.g:2767:6: (lv_right_7_0= ruleRepeatedSERE )
                // InternalPropertyCS.g:2768:7: lv_right_7_0= ruleRepeatedSERE
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
                // InternalPropertyCS.g:2786:5: ( (lv_right_8_0= ruleBracedSERE ) )
                {
                // InternalPropertyCS.g:2786:5: ( (lv_right_8_0= ruleBracedSERE ) )
                // InternalPropertyCS.g:2787:6: (lv_right_8_0= ruleBracedSERE )
                {
                // InternalPropertyCS.g:2787:6: (lv_right_8_0= ruleBracedSERE )
                // InternalPropertyCS.g:2788:7: lv_right_8_0= ruleBracedSERE
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
                // InternalPropertyCS.g:2806:5: (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' )
                {
                // InternalPropertyCS.g:2806:5: (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' )
                // InternalPropertyCS.g:2807:6: otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')'
                {
                otherlv_9=(Token)match(input,14,FOLLOW_16); if (state.failed) return ;
                // InternalPropertyCS.g:2811:6: ( (lv_right_10_0= ruleBinaryCompoundSERE ) )
                // InternalPropertyCS.g:2812:7: (lv_right_10_0= ruleBinaryCompoundSERE )
                {
                // InternalPropertyCS.g:2812:7: (lv_right_10_0= ruleBinaryCompoundSERE )
                // InternalPropertyCS.g:2813:8: lv_right_10_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_0_3_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_right_10_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_11=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred77_InternalPropertyCS

    // $ANTLR start synpred78_InternalPropertyCS
    public final void synpred78_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_13_0 = null;


        // InternalPropertyCS.g:2850:5: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) )
        // InternalPropertyCS.g:2850:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
        {
        // InternalPropertyCS.g:2850:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:2851:6: (lv_left_13_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:2851:6: (lv_left_13_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:2852:7: lv_left_13_0= ruleRepeatedSERE
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
    // $ANTLR end synpred78_InternalPropertyCS

    // $ANTLR start synpred79_InternalPropertyCS
    public final void synpred79_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_14_0 = null;


        // InternalPropertyCS.g:2870:5: ( ( (lv_left_14_0= ruleBracedSERE ) ) )
        // InternalPropertyCS.g:2870:5: ( (lv_left_14_0= ruleBracedSERE ) )
        {
        // InternalPropertyCS.g:2870:5: ( (lv_left_14_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:2871:6: (lv_left_14_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:2871:6: (lv_left_14_0= ruleBracedSERE )
        // InternalPropertyCS.g:2872:7: lv_left_14_0= ruleBracedSERE
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
    // $ANTLR end synpred79_InternalPropertyCS

    // $ANTLR start synpred81_InternalPropertyCS
    public final void synpred81_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_right_19_0 = null;


        // InternalPropertyCS.g:2928:5: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) )
        // InternalPropertyCS.g:2928:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
        {
        // InternalPropertyCS.g:2928:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:2929:6: (lv_right_19_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:2929:6: (lv_right_19_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:2930:7: lv_right_19_0= ruleRepeatedSERE
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
    // $ANTLR end synpred81_InternalPropertyCS

    // $ANTLR start synpred82_InternalPropertyCS
    public final void synpred82_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_right_20_0 = null;


        // InternalPropertyCS.g:2948:5: ( ( (lv_right_20_0= ruleBracedSERE ) ) )
        // InternalPropertyCS.g:2948:5: ( (lv_right_20_0= ruleBracedSERE ) )
        {
        // InternalPropertyCS.g:2948:5: ( (lv_right_20_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:2949:6: (lv_right_20_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:2949:6: (lv_right_20_0= ruleBracedSERE )
        // InternalPropertyCS.g:2950:7: lv_right_20_0= ruleBracedSERE
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
    // $ANTLR end synpred82_InternalPropertyCS

    // $ANTLR start synpred83_InternalPropertyCS
    public final void synpred83_InternalPropertyCS_fragment() throws RecognitionException {   
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


        // InternalPropertyCS.g:2838:3: ( ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) )
        // InternalPropertyCS.g:2838:3: ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) )
        {
        // InternalPropertyCS.g:2838:3: ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) )
        // InternalPropertyCS.g:2839:4: () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )
        {
        // InternalPropertyCS.g:2839:4: ()
        // InternalPropertyCS.g:2840:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:2849:4: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) )
        int alt44=3;
        alt44 = dfa44.predict(input);
        switch (alt44) {
            case 1 :
                // InternalPropertyCS.g:2850:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
                {
                // InternalPropertyCS.g:2850:5: ( (lv_left_13_0= ruleRepeatedSERE ) )
                // InternalPropertyCS.g:2851:6: (lv_left_13_0= ruleRepeatedSERE )
                {
                // InternalPropertyCS.g:2851:6: (lv_left_13_0= ruleRepeatedSERE )
                // InternalPropertyCS.g:2852:7: lv_left_13_0= ruleRepeatedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_1_1_0_0());
                  						
                }
                pushFollow(FOLLOW_35);
                lv_left_13_0=ruleRepeatedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalPropertyCS.g:2870:5: ( (lv_left_14_0= ruleBracedSERE ) )
                {
                // InternalPropertyCS.g:2870:5: ( (lv_left_14_0= ruleBracedSERE ) )
                // InternalPropertyCS.g:2871:6: (lv_left_14_0= ruleBracedSERE )
                {
                // InternalPropertyCS.g:2871:6: (lv_left_14_0= ruleBracedSERE )
                // InternalPropertyCS.g:2872:7: lv_left_14_0= ruleBracedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_1_1_1_0());
                  						
                }
                pushFollow(FOLLOW_35);
                lv_left_14_0=ruleBracedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalPropertyCS.g:2890:5: (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' )
                {
                // InternalPropertyCS.g:2890:5: (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' )
                // InternalPropertyCS.g:2891:6: otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')'
                {
                otherlv_15=(Token)match(input,14,FOLLOW_16); if (state.failed) return ;
                // InternalPropertyCS.g:2895:6: ( (lv_left_16_0= ruleBinaryCompoundSERE ) )
                // InternalPropertyCS.g:2896:7: (lv_left_16_0= ruleBinaryCompoundSERE )
                {
                // InternalPropertyCS.g:2896:7: (lv_left_16_0= ruleBinaryCompoundSERE )
                // InternalPropertyCS.g:2897:8: lv_left_16_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_1_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_16_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_17=(Token)match(input,15,FOLLOW_35); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalPropertyCS.g:2920:4: ( ( '&' )=>otherlv_18= '&' )
        // InternalPropertyCS.g:2921:5: ( '&' )=>otherlv_18= '&'
        {
        otherlv_18=(Token)match(input,46,FOLLOW_16); if (state.failed) return ;

        }

        // InternalPropertyCS.g:2927:4: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )
        int alt45=3;
        alt45 = dfa45.predict(input);
        switch (alt45) {
            case 1 :
                // InternalPropertyCS.g:2928:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
                {
                // InternalPropertyCS.g:2928:5: ( (lv_right_19_0= ruleRepeatedSERE ) )
                // InternalPropertyCS.g:2929:6: (lv_right_19_0= ruleRepeatedSERE )
                {
                // InternalPropertyCS.g:2929:6: (lv_right_19_0= ruleRepeatedSERE )
                // InternalPropertyCS.g:2930:7: lv_right_19_0= ruleRepeatedSERE
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
                // InternalPropertyCS.g:2948:5: ( (lv_right_20_0= ruleBracedSERE ) )
                {
                // InternalPropertyCS.g:2948:5: ( (lv_right_20_0= ruleBracedSERE ) )
                // InternalPropertyCS.g:2949:6: (lv_right_20_0= ruleBracedSERE )
                {
                // InternalPropertyCS.g:2949:6: (lv_right_20_0= ruleBracedSERE )
                // InternalPropertyCS.g:2950:7: lv_right_20_0= ruleBracedSERE
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
                // InternalPropertyCS.g:2968:5: (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' )
                {
                // InternalPropertyCS.g:2968:5: (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' )
                // InternalPropertyCS.g:2969:6: otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')'
                {
                otherlv_21=(Token)match(input,14,FOLLOW_16); if (state.failed) return ;
                // InternalPropertyCS.g:2973:6: ( (lv_right_22_0= ruleBinaryCompoundSERE ) )
                // InternalPropertyCS.g:2974:7: (lv_right_22_0= ruleBinaryCompoundSERE )
                {
                // InternalPropertyCS.g:2974:7: (lv_right_22_0= ruleBinaryCompoundSERE )
                // InternalPropertyCS.g:2975:8: lv_right_22_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_1_3_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_right_22_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_23=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred83_InternalPropertyCS

    // $ANTLR start synpred84_InternalPropertyCS
    public final void synpred84_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_25_0 = null;


        // InternalPropertyCS.g:3012:5: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) )
        // InternalPropertyCS.g:3012:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
        {
        // InternalPropertyCS.g:3012:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:3013:6: (lv_left_25_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:3013:6: (lv_left_25_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:3014:7: lv_left_25_0= ruleRepeatedSERE
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
    // $ANTLR end synpred84_InternalPropertyCS

    // $ANTLR start synpred85_InternalPropertyCS
    public final void synpred85_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_26_0 = null;


        // InternalPropertyCS.g:3032:5: ( ( (lv_left_26_0= ruleBracedSERE ) ) )
        // InternalPropertyCS.g:3032:5: ( (lv_left_26_0= ruleBracedSERE ) )
        {
        // InternalPropertyCS.g:3032:5: ( (lv_left_26_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:3033:6: (lv_left_26_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:3033:6: (lv_left_26_0= ruleBracedSERE )
        // InternalPropertyCS.g:3034:7: lv_left_26_0= ruleBracedSERE
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
    // $ANTLR end synpred85_InternalPropertyCS

    // $ANTLR start synpred87_InternalPropertyCS
    public final void synpred87_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_right_31_0 = null;


        // InternalPropertyCS.g:3090:5: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) )
        // InternalPropertyCS.g:3090:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
        {
        // InternalPropertyCS.g:3090:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:3091:6: (lv_right_31_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:3091:6: (lv_right_31_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:3092:7: lv_right_31_0= ruleRepeatedSERE
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
    // $ANTLR end synpred87_InternalPropertyCS

    // $ANTLR start synpred88_InternalPropertyCS
    public final void synpred88_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_right_32_0 = null;


        // InternalPropertyCS.g:3110:5: ( ( (lv_right_32_0= ruleBracedSERE ) ) )
        // InternalPropertyCS.g:3110:5: ( (lv_right_32_0= ruleBracedSERE ) )
        {
        // InternalPropertyCS.g:3110:5: ( (lv_right_32_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:3111:6: (lv_right_32_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:3111:6: (lv_right_32_0= ruleBracedSERE )
        // InternalPropertyCS.g:3112:7: lv_right_32_0= ruleBracedSERE
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
    // $ANTLR end synpred88_InternalPropertyCS

    // $ANTLR start synpred89_InternalPropertyCS
    public final void synpred89_InternalPropertyCS_fragment() throws RecognitionException {   
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


        // InternalPropertyCS.g:3000:3: ( ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) )
        // InternalPropertyCS.g:3000:3: ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) )
        {
        // InternalPropertyCS.g:3000:3: ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) )
        // InternalPropertyCS.g:3001:4: () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )
        {
        // InternalPropertyCS.g:3001:4: ()
        // InternalPropertyCS.g:3002:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPropertyCS.g:3011:4: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) )
        int alt46=3;
        alt46 = dfa46.predict(input);
        switch (alt46) {
            case 1 :
                // InternalPropertyCS.g:3012:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
                {
                // InternalPropertyCS.g:3012:5: ( (lv_left_25_0= ruleRepeatedSERE ) )
                // InternalPropertyCS.g:3013:6: (lv_left_25_0= ruleRepeatedSERE )
                {
                // InternalPropertyCS.g:3013:6: (lv_left_25_0= ruleRepeatedSERE )
                // InternalPropertyCS.g:3014:7: lv_left_25_0= ruleRepeatedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftRepeatedSEREParserRuleCall_2_1_0_0());
                  						
                }
                pushFollow(FOLLOW_36);
                lv_left_25_0=ruleRepeatedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalPropertyCS.g:3032:5: ( (lv_left_26_0= ruleBracedSERE ) )
                {
                // InternalPropertyCS.g:3032:5: ( (lv_left_26_0= ruleBracedSERE ) )
                // InternalPropertyCS.g:3033:6: (lv_left_26_0= ruleBracedSERE )
                {
                // InternalPropertyCS.g:3033:6: (lv_left_26_0= ruleBracedSERE )
                // InternalPropertyCS.g:3034:7: lv_left_26_0= ruleBracedSERE
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBracedSEREParserRuleCall_2_1_1_0());
                  						
                }
                pushFollow(FOLLOW_36);
                lv_left_26_0=ruleBracedSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalPropertyCS.g:3052:5: (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' )
                {
                // InternalPropertyCS.g:3052:5: (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' )
                // InternalPropertyCS.g:3053:6: otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')'
                {
                otherlv_27=(Token)match(input,14,FOLLOW_16); if (state.failed) return ;
                // InternalPropertyCS.g:3057:6: ( (lv_left_28_0= ruleBinaryCompoundSERE ) )
                // InternalPropertyCS.g:3058:7: (lv_left_28_0= ruleBinaryCompoundSERE )
                {
                // InternalPropertyCS.g:3058:7: (lv_left_28_0= ruleBinaryCompoundSERE )
                // InternalPropertyCS.g:3059:8: lv_left_28_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getLeftBinaryCompoundSEREParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_left_28_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_29=(Token)match(input,15,FOLLOW_36); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalPropertyCS.g:3082:4: ( ( '&&' )=>otherlv_30= '&&' )
        // InternalPropertyCS.g:3083:5: ( '&&' )=>otherlv_30= '&&'
        {
        otherlv_30=(Token)match(input,47,FOLLOW_16); if (state.failed) return ;

        }

        // InternalPropertyCS.g:3089:4: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )
        int alt47=3;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // InternalPropertyCS.g:3090:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
                {
                // InternalPropertyCS.g:3090:5: ( (lv_right_31_0= ruleRepeatedSERE ) )
                // InternalPropertyCS.g:3091:6: (lv_right_31_0= ruleRepeatedSERE )
                {
                // InternalPropertyCS.g:3091:6: (lv_right_31_0= ruleRepeatedSERE )
                // InternalPropertyCS.g:3092:7: lv_right_31_0= ruleRepeatedSERE
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
                // InternalPropertyCS.g:3110:5: ( (lv_right_32_0= ruleBracedSERE ) )
                {
                // InternalPropertyCS.g:3110:5: ( (lv_right_32_0= ruleBracedSERE ) )
                // InternalPropertyCS.g:3111:6: (lv_right_32_0= ruleBracedSERE )
                {
                // InternalPropertyCS.g:3111:6: (lv_right_32_0= ruleBracedSERE )
                // InternalPropertyCS.g:3112:7: lv_right_32_0= ruleBracedSERE
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
                // InternalPropertyCS.g:3130:5: (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' )
                {
                // InternalPropertyCS.g:3130:5: (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' )
                // InternalPropertyCS.g:3131:6: otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')'
                {
                otherlv_33=(Token)match(input,14,FOLLOW_16); if (state.failed) return ;
                // InternalPropertyCS.g:3135:6: ( (lv_right_34_0= ruleBinaryCompoundSERE ) )
                // InternalPropertyCS.g:3136:7: (lv_right_34_0= ruleBinaryCompoundSERE )
                {
                // InternalPropertyCS.g:3136:7: (lv_right_34_0= ruleBinaryCompoundSERE )
                // InternalPropertyCS.g:3137:8: lv_right_34_0= ruleBinaryCompoundSERE
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getBinaryCompoundSEREAccess().getRightBinaryCompoundSEREParserRuleCall_2_3_2_1_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_right_34_0=ruleBinaryCompoundSERE();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_35=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred89_InternalPropertyCS

    // $ANTLR start synpred90_InternalPropertyCS
    public final void synpred90_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_37_0 = null;


        // InternalPropertyCS.g:3174:5: ( ( (lv_left_37_0= ruleRepeatedSERE ) ) )
        // InternalPropertyCS.g:3174:5: ( (lv_left_37_0= ruleRepeatedSERE ) )
        {
        // InternalPropertyCS.g:3174:5: ( (lv_left_37_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:3175:6: (lv_left_37_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:3175:6: (lv_left_37_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:3176:7: lv_left_37_0= ruleRepeatedSERE
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
    // $ANTLR end synpred90_InternalPropertyCS

    // $ANTLR start synpred91_InternalPropertyCS
    public final void synpred91_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_left_38_0 = null;


        // InternalPropertyCS.g:3194:5: ( ( (lv_left_38_0= ruleBracedSERE ) ) )
        // InternalPropertyCS.g:3194:5: ( (lv_left_38_0= ruleBracedSERE ) )
        {
        // InternalPropertyCS.g:3194:5: ( (lv_left_38_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:3195:6: (lv_left_38_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:3195:6: (lv_left_38_0= ruleBracedSERE )
        // InternalPropertyCS.g:3196:7: lv_left_38_0= ruleBracedSERE
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
    // $ANTLR end synpred91_InternalPropertyCS

    // $ANTLR start synpred93_InternalPropertyCS
    public final void synpred93_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_right_43_0 = null;


        // InternalPropertyCS.g:3252:5: ( ( (lv_right_43_0= ruleRepeatedSERE ) ) )
        // InternalPropertyCS.g:3252:5: ( (lv_right_43_0= ruleRepeatedSERE ) )
        {
        // InternalPropertyCS.g:3252:5: ( (lv_right_43_0= ruleRepeatedSERE ) )
        // InternalPropertyCS.g:3253:6: (lv_right_43_0= ruleRepeatedSERE )
        {
        // InternalPropertyCS.g:3253:6: (lv_right_43_0= ruleRepeatedSERE )
        // InternalPropertyCS.g:3254:7: lv_right_43_0= ruleRepeatedSERE
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
    // $ANTLR end synpred93_InternalPropertyCS

    // $ANTLR start synpred94_InternalPropertyCS
    public final void synpred94_InternalPropertyCS_fragment() throws RecognitionException {   
        EObject lv_right_44_0 = null;


        // InternalPropertyCS.g:3272:5: ( ( (lv_right_44_0= ruleBracedSERE ) ) )
        // InternalPropertyCS.g:3272:5: ( (lv_right_44_0= ruleBracedSERE ) )
        {
        // InternalPropertyCS.g:3272:5: ( (lv_right_44_0= ruleBracedSERE ) )
        // InternalPropertyCS.g:3273:6: (lv_right_44_0= ruleBracedSERE )
        {
        // InternalPropertyCS.g:3273:6: (lv_right_44_0= ruleBracedSERE )
        // InternalPropertyCS.g:3274:7: lv_right_44_0= ruleBracedSERE
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
    // $ANTLR end synpred94_InternalPropertyCS

    // Delegated rules

    public final boolean synpred13_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalPropertyCS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalPropertyCS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\16\14\0\10\uffff";
    static final String dfa_3s = "\1\53\14\0\10\uffff";
    static final String dfa_4s = "\15\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\6\uffff\1\10\1\11\1\12\1\13\6\uffff\1\14\1\7\3\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "182:2: ( ( () ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) ) ( ( 'and' )=>otherlv_9= 'and' ) ( (lv_right_10_0= ruleProperty ) ) ) | ( () ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) ) ( ( 'or' )=>otherlv_20= 'or' ) ( (lv_right_21_0= ruleProperty ) ) ) | ( () ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) ) ( ( 'abort' )=>otherlv_31= 'abort' ) ( (lv_right_32_0= ruleSequenceTerminal ) ) ) | ( () ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) ) ( ( 'until' )=>otherlv_42= 'until' ) ( (lv_right_43_0= ruleSequenceTerminal ) ) ) | this_UnaryProperty_44= ruleUnaryProperty | this_BinaryProperty_45= ruleBinaryProperty | (otherlv_46= '(' this_UnaryProperty_47= ruleUnaryProperty otherlv_48= ')' ) | (otherlv_49= '(' this_BinaryProperty_50= ruleBinaryProperty otherlv_51= ')' ) )";
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
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                        else if ( (synpred24_InternalPropertyCS()) ) {s = 18;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                        else if ( (synpred24_InternalPropertyCS()) ) {s = 18;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                        else if ( (synpred24_InternalPropertyCS()) ) {s = 18;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                        else if ( (synpred24_InternalPropertyCS()) ) {s = 18;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                        else if ( (synpred24_InternalPropertyCS()) ) {s = 18;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                        else if ( (synpred24_InternalPropertyCS()) ) {s = 18;}

                        else if ( (synpred25_InternalPropertyCS()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                        else if ( (synpred24_InternalPropertyCS()) ) {s = 18;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred23_InternalPropertyCS()) ) {s = 17;}

                         
                        input.seek(index7_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA7_12 = input.LA(1);

                         
                        int index7_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred12_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred17_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred22_InternalPropertyCS()) ) {s = 16;}

                        else if ( (synpred24_InternalPropertyCS()) ) {s = 18;}

                         
                        input.seek(index7_12);
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
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\16\7\0\7\uffff";
    static final String dfa_9s = "\1\53\7\0\7\uffff";
    static final String dfa_10s = "\10\uffff\1\1\3\uffff\1\2\1\3\1\4";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\7\uffff}>";
    static final String[] dfa_12s = {
            "\1\6\6\uffff\4\10\6\uffff\1\14\1\7\3\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
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
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "194:4: ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred5_InternalPropertyCS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "334:4: ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred10_InternalPropertyCS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "474:4: ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_4 = input.LA(1);

                         
                        int index5_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index5_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_6 = input.LA(1);

                         
                        int index5_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred15_InternalPropertyCS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_7 = input.LA(1);

                         
                        int index5_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index5_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }

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
            return "614:4: ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) )";
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
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred20_InternalPropertyCS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
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
    static final String dfa_13s = "\23\uffff";
    static final String dfa_14s = "\1\16\7\0\1\uffff\1\0\1\uffff\1\0\7\uffff";
    static final String dfa_15s = "\1\53\7\0\1\uffff\1\0\1\uffff\1\0\7\uffff";
    static final String dfa_16s = "\10\uffff\1\4\1\uffff\1\7\1\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10\7\uffff}>";
    static final String[] dfa_18s = {
            "\1\6\6\uffff\1\10\1\11\1\12\1\13\7\uffff\1\7\3\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "828:2: ( ( () ( (lv_operand_1_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_operand_3_0= ruleSequence ) ) ) | ( () ( (lv_operand_5_0= ruleSequence ) ) otherlv_6= '!' ) | ( () otherlv_8= 'always' ( (lv_operand_9_0= ruleProperty ) ) ) | ( () otherlv_11= 'never' ( (lv_operand_12_0= ruleSequenceTerminal ) ) ) | ( () otherlv_14= 'never' ( (lv_operand_15_0= ruleSequence ) ) ) | ( () otherlv_17= 'next_e' ( (lv_operand_18_0= ruleSequenceTerminal ) ) ) | ( () otherlv_20= 'eventually!' ( (lv_operand_21_0= ruleSequenceTerminal ) ) ) | ( () otherlv_23= 'eventually!' ( (lv_operand_24_0= ruleSequence ) ) ) )";
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
                        if ( (synpred26_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred27_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred28_InternalPropertyCS()) ) {s = 14;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred27_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred28_InternalPropertyCS()) ) {s = 14;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred27_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred28_InternalPropertyCS()) ) {s = 14;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred27_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred28_InternalPropertyCS()) ) {s = 14;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred28_InternalPropertyCS()) ) {s = 14;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred28_InternalPropertyCS()) ) {s = 14;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred28_InternalPropertyCS()) ) {s = 14;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalPropertyCS()) ) {s = 15;}

                        else if ( (synpred31_InternalPropertyCS()) ) {s = 16;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_11 = input.LA(1);

                         
                        int index8_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPropertyCS()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_11);
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
    static final String dfa_19s = "\20\uffff";
    static final String dfa_20s = "\1\16\7\0\10\uffff";
    static final String dfa_21s = "\1\53\7\0\10\uffff";
    static final String dfa_22s = "\10\uffff\1\10\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String dfa_23s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\10\uffff}>";
    static final String[] dfa_24s = {
            "\1\6\20\uffff\1\10\1\7\3\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
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
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1162:2: ( ( () ( (lv_left_1_0= ruleSequenceTerminal ) ) otherlv_2= 'or' ( (lv_right_3_0= ruleProperty ) ) ) | ( () ( (lv_left_5_0= ruleSequenceTerminal ) ) otherlv_6= '->' ( (lv_right_7_0= ruleProperty ) ) ) | ( () ( (lv_left_9_0= ruleSequenceTerminal ) ) otherlv_10= '<->' ( (lv_right_11_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_13_0= ruleSequenceTerminal ) ) otherlv_14= 'until_' ( (lv_right_15_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_17_0= ruleSequenceTerminal ) ) otherlv_18= 'before' ( (lv_right_19_0= ruleSequenceTerminal ) ) ) | ( () ( (lv_left_21_0= ruleSequence ) ) otherlv_22= '|=>' ( (lv_right_23_0= ruleProperty ) ) ) | ( () ( (lv_left_25_0= ruleSequence ) ) otherlv_26= '|->' ( (lv_right_27_0= ruleProperty ) ) ) | ( () otherlv_29= 'next_event_a' otherlv_30= '(' ( (lv_left_31_0= ruleSequenceTerminal ) ) otherlv_32= ')' otherlv_33= '[' ( (lv_range_34_0= ruleRange ) ) otherlv_35= ']' otherlv_36= '(' ( (lv_right_37_0= ruleProperty ) ) otherlv_38= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred35_InternalPropertyCS()) ) {s = 10;}

                        else if ( (synpred36_InternalPropertyCS()) ) {s = 11;}

                        else if ( (synpred37_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred38_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred39_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred40_InternalPropertyCS()) ) {s = 15;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred35_InternalPropertyCS()) ) {s = 10;}

                        else if ( (synpred36_InternalPropertyCS()) ) {s = 11;}

                        else if ( (synpred37_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred38_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred39_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred40_InternalPropertyCS()) ) {s = 15;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred35_InternalPropertyCS()) ) {s = 10;}

                        else if ( (synpred36_InternalPropertyCS()) ) {s = 11;}

                        else if ( (synpred37_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred38_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred39_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred40_InternalPropertyCS()) ) {s = 15;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred35_InternalPropertyCS()) ) {s = 10;}

                        else if ( (synpred36_InternalPropertyCS()) ) {s = 11;}

                        else if ( (synpred37_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred38_InternalPropertyCS()) ) {s = 13;}

                        else if ( (synpred39_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred40_InternalPropertyCS()) ) {s = 15;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred40_InternalPropertyCS()) ) {s = 15;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred40_InternalPropertyCS()) ) {s = 15;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred40_InternalPropertyCS()) ) {s = 15;}

                         
                        input.seek(index9_7);
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
    static final String dfa_25s = "\13\uffff";
    static final String dfa_26s = "\1\16\7\0\3\uffff";
    static final String dfa_27s = "\1\53\7\0\3\uffff";
    static final String dfa_28s = "\10\uffff\1\1\1\2\1\3";
    static final String dfa_29s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff}>";
    static final String[] dfa_30s = {
            "\1\6\21\uffff\1\7\3\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
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

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1766:2: (this_SequenceTerminal_0= ruleSequenceTerminal | this_Sequence_1= ruleSequence | this_CompoundSERE_2= ruleCompoundSERE )";
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
                        if ( (synpred42_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred43_InternalPropertyCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred43_InternalPropertyCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred43_InternalPropertyCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred43_InternalPropertyCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalPropertyCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalPropertyCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalPropertyCS()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
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
    static final String dfa_31s = "\22\uffff";
    static final String dfa_32s = "\1\16\7\0\12\uffff";
    static final String dfa_33s = "\1\53\7\0\12\uffff";
    static final String dfa_34s = "\10\uffff\1\1\1\4\1\7\1\10\1\2\1\5\1\3\1\6\1\11\1\12";
    static final String dfa_35s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\12\uffff}>";
    static final String[] dfa_36s = {
            "\1\6\21\uffff\1\7\3\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
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

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_31;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "1985:2: ( ( () ( (lv_expression_1_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_2= '[' ) otherlv_3= '*' ) ( (lv_count_4_0= ruleCount ) )? otherlv_5= ']' ) | ( () ( (lv_expression_7_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_8= '[' ) otherlv_9= '*' ) ( (lv_count_10_0= ruleCount ) )? otherlv_11= ']' ) | ( () otherlv_13= '(' ( (lv_expression_14_0= ruleRepeatedSERE ) ) otherlv_15= ')' ( ( ( '[' )=>otherlv_16= '[' ) otherlv_17= '*' ) ( (lv_count_18_0= ruleCount ) )? otherlv_19= ']' ) | ( () ( (lv_expression_21_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_22= '[' ) otherlv_23= '+' ) otherlv_24= ']' ) | ( () ( (lv_expression_26_0= ruleBracedSERE ) ) ( ( ( '[' )=>otherlv_27= '[' ) otherlv_28= '+' ) otherlv_29= ']' ) | ( () otherlv_31= '(' ( (lv_expression_32_0= ruleRepeatedSERE ) ) otherlv_33= ')' ( ( ( '[' )=>otherlv_34= '[' ) otherlv_35= '+' ) otherlv_36= ']' ) | ( () ( (lv_expression_38_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_39= '[' ) otherlv_40= '=' ) ( (lv_count_41_0= ruleCount ) ) otherlv_42= ']' ) | ( () ( (lv_expression_44_0= ruleSequenceTerminal ) ) ( ( ( '[' )=>otherlv_45= '[' ) otherlv_46= '->' ) ( (lv_count_47_0= ruleCount ) )? otherlv_48= ']' ) | ( () otherlv_50= '[' otherlv_51= '*' ( (lv_count_52_0= ruleCount ) )? otherlv_53= ']' ) | ( () otherlv_55= '[' otherlv_56= '+' otherlv_57= ']' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred58_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred64_InternalPropertyCS()) ) {s = 10;}

                        else if ( (synpred67_InternalPropertyCS()) ) {s = 11;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred58_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred64_InternalPropertyCS()) ) {s = 10;}

                        else if ( (synpred67_InternalPropertyCS()) ) {s = 11;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred58_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred64_InternalPropertyCS()) ) {s = 10;}

                        else if ( (synpred67_InternalPropertyCS()) ) {s = 11;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred58_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred64_InternalPropertyCS()) ) {s = 10;}

                        else if ( (synpred67_InternalPropertyCS()) ) {s = 11;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred60_InternalPropertyCS()) ) {s = 13;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalPropertyCS()) ) {s = 14;}

                        else if ( (synpred62_InternalPropertyCS()) ) {s = 15;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalPropertyCS()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_7);
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
    static final String dfa_37s = "\10\uffff\1\1\1\3\1\2";
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_37;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "2621:2: (this_RepeatedSERE_0= ruleRepeatedSERE | this_BracedSERE_1= ruleBracedSERE | this_BinaryCompoundSERE_2= ruleBinaryCompoundSERE )";
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
                        if ( (synpred70_InternalPropertyCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalPropertyCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalPropertyCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalPropertyCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred71_InternalPropertyCS()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalPropertyCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalPropertyCS()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
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
    static final String dfa_38s = "\14\uffff";
    static final String dfa_39s = "\1\16\7\0\4\uffff";
    static final String dfa_40s = "\1\53\7\0\4\uffff";
    static final String dfa_41s = "\10\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_42s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\4\uffff}>";
    static final String[] dfa_43s = {
            "\1\6\21\uffff\1\7\3\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
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

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "2675:2: ( ( () ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) ) ( ( '|' )=>otherlv_6= '|' ) ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) ) ) | ( () ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) ) ( ( '&' )=>otherlv_18= '&' ) ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) ) ) | ( () ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) ) ( ( '&&' )=>otherlv_30= '&&' ) ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) ) ) | ( () ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) ) ( ( 'within' )=>otherlv_42= 'within' ) ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred83_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred89_InternalPropertyCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred83_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred89_InternalPropertyCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred83_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred89_InternalPropertyCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred83_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred89_InternalPropertyCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred83_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred89_InternalPropertyCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred83_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred89_InternalPropertyCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_7 = input.LA(1);

                         
                        int index30_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred83_InternalPropertyCS()) ) {s = 9;}

                        else if ( (synpred89_InternalPropertyCS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_7);
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
    static final String dfa_44s = "\12\uffff";
    static final String dfa_45s = "\1\16\4\uffff\2\0\3\uffff";
    static final String dfa_46s = "\1\53\4\uffff\2\0\3\uffff";
    static final String dfa_47s = "\1\uffff\1\1\6\uffff\1\2\1\3";
    static final String dfa_48s = "\5\uffff\1\0\1\1\3\uffff}>";
    static final String[] dfa_49s = {
            "\1\6\21\uffff\1\1\3\uffff\4\1\3\uffff\1\5",
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

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2687:4: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred73_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2765:4: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred76_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2849:4: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred79_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2927:4: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred82_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_6 = input.LA(1);

                         
                        int index25_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index25_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3011:4: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred85_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3089:4: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred88_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3173:4: ( ( (lv_left_37_0= ruleRepeatedSERE ) ) | ( (lv_left_38_0= ruleBracedSERE ) ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryCompoundSERE ) ) otherlv_41= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred91_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3251:4: ( ( (lv_right_43_0= ruleRepeatedSERE ) ) | ( (lv_right_44_0= ruleBracedSERE ) ) | (otherlv_45= '(' ( (lv_right_46_0= ruleBinaryCompoundSERE ) ) otherlv_47= ')' ) )";
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
                        if ( (synpred93_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred94_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalPropertyCS()) ) {s = 1;}

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

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "194:4: ( ( (lv_left_1_0= ruleUnaryProperty ) ) | ( (lv_left_2_0= ruleBinaryProperty ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleUnaryProperty ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_left_7_0= ruleBinaryProperty ) ) otherlv_8= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred5_InternalPropertyCS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred4_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index32_7);
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
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "334:4: ( ( (lv_left_12_0= ruleUnaryProperty ) ) | ( (lv_left_13_0= ruleBinaryProperty ) ) | (otherlv_14= '(' ( (lv_left_15_0= ruleUnaryProperty ) ) otherlv_16= ')' ) | (otherlv_17= '(' ( (lv_left_18_0= ruleBinaryProperty ) ) otherlv_19= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index33_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_4 = input.LA(1);

                         
                        int index33_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index33_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred10_InternalPropertyCS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred9_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index33_7);
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
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "474:4: ( ( (lv_left_23_0= ruleUnaryProperty ) ) | ( (lv_left_24_0= ruleBinaryProperty ) ) | (otherlv_25= '(' ( (lv_left_26_0= ruleUnaryProperty ) ) otherlv_27= ')' ) | (otherlv_28= '(' ( (lv_left_29_0= ruleBinaryProperty ) ) otherlv_30= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred15_InternalPropertyCS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred14_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index34_7);
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

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "614:4: ( ( (lv_left_34_0= ruleUnaryProperty ) ) | ( (lv_left_35_0= ruleBinaryProperty ) ) | (otherlv_36= '(' ( (lv_left_37_0= ruleUnaryProperty ) ) otherlv_38= ')' ) | (otherlv_39= '(' ( (lv_left_40_0= ruleBinaryProperty ) ) otherlv_41= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_3 = input.LA(1);

                         
                        int index35_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index35_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_4 = input.LA(1);

                         
                        int index35_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index35_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_5 = input.LA(1);

                         
                        int index35_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index35_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_6 = input.LA(1);

                         
                        int index35_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                        else if ( (synpred20_InternalPropertyCS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index35_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA35_7 = input.LA(1);

                         
                        int index35_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalPropertyCS()) ) {s = 8;}

                        else if ( (synpred19_InternalPropertyCS()) ) {s = 12;}

                         
                        input.seek(index35_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2687:4: ( ( (lv_left_1_0= ruleRepeatedSERE ) ) | ( (lv_left_2_0= ruleBracedSERE ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleBinaryCompoundSERE ) ) otherlv_5= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_5 = input.LA(1);

                         
                        int index42_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred73_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index42_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2765:4: ( ( (lv_right_7_0= ruleRepeatedSERE ) ) | ( (lv_right_8_0= ruleBracedSERE ) ) | (otherlv_9= '(' ( (lv_right_10_0= ruleBinaryCompoundSERE ) ) otherlv_11= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_5 = input.LA(1);

                         
                        int index43_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred76_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index43_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_6 = input.LA(1);

                         
                        int index43_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index43_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2849:4: ( ( (lv_left_13_0= ruleRepeatedSERE ) ) | ( (lv_left_14_0= ruleBracedSERE ) ) | (otherlv_15= '(' ( (lv_left_16_0= ruleBinaryCompoundSERE ) ) otherlv_17= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_5 = input.LA(1);

                         
                        int index44_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred79_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index44_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2927:4: ( ( (lv_right_19_0= ruleRepeatedSERE ) ) | ( (lv_right_20_0= ruleBracedSERE ) ) | (otherlv_21= '(' ( (lv_right_22_0= ruleBinaryCompoundSERE ) ) otherlv_23= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_5 = input.LA(1);

                         
                        int index45_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred82_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index45_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3011:4: ( ( (lv_left_25_0= ruleRepeatedSERE ) ) | ( (lv_left_26_0= ruleBracedSERE ) ) | (otherlv_27= '(' ( (lv_left_28_0= ruleBinaryCompoundSERE ) ) otherlv_29= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_5 = input.LA(1);

                         
                        int index46_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred85_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index46_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_6 = input.LA(1);

                         
                        int index46_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index46_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3089:4: ( ( (lv_right_31_0= ruleRepeatedSERE ) ) | ( (lv_right_32_0= ruleBracedSERE ) ) | (otherlv_33= '(' ( (lv_right_34_0= ruleBinaryCompoundSERE ) ) otherlv_35= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_5 = input.LA(1);

                         
                        int index47_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalPropertyCS()) ) {s = 1;}

                        else if ( (synpred88_InternalPropertyCS()) ) {s = 8;}

                         
                        input.seek(index47_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_6 = input.LA(1);

                         
                        int index47_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalPropertyCS()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index47_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000008F181E06000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000008F181E04002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000008F101E04000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000008F180004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000008F181E04000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000008F100004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});

}