package org.tetrabox.property.cs.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPropertyCSLexer extends Lexer {
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
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SCHEME=7;
    public static final int RULE_STRING=6;
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
    public static final int RULE_IMPORT_URI=5;
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

    public InternalPropertyCSLexer() {;} 
    public InternalPropertyCSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPropertyCSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPropertyCS.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:11:7: ( 'false' )
            // InternalPropertyCS.g:11:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:12:7: ( 'import' )
            // InternalPropertyCS.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:13:7: ( 'and' )
            // InternalPropertyCS.g:13:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:14:7: ( '(' )
            // InternalPropertyCS.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:15:7: ( ')' )
            // InternalPropertyCS.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:16:7: ( 'or' )
            // InternalPropertyCS.g:16:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:17:7: ( 'abort' )
            // InternalPropertyCS.g:17:9: 'abort'
            {
            match("abort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:18:7: ( 'until' )
            // InternalPropertyCS.g:18:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:19:7: ( '!' )
            // InternalPropertyCS.g:19:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:20:7: ( 'always' )
            // InternalPropertyCS.g:20:9: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:21:7: ( 'never' )
            // InternalPropertyCS.g:21:9: 'never'
            {
            match("never"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:22:7: ( 'next_e' )
            // InternalPropertyCS.g:22:9: 'next_e'
            {
            match("next_e"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:23:7: ( 'eventually!' )
            // InternalPropertyCS.g:23:9: 'eventually!'
            {
            match("eventually!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:24:7: ( '->' )
            // InternalPropertyCS.g:24:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:25:7: ( '<->' )
            // InternalPropertyCS.g:25:9: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:26:7: ( 'until_' )
            // InternalPropertyCS.g:26:9: 'until_'
            {
            match("until_"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:27:7: ( 'before' )
            // InternalPropertyCS.g:27:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:28:7: ( '|=>' )
            // InternalPropertyCS.g:28:9: '|=>'
            {
            match("|=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:29:7: ( '|->' )
            // InternalPropertyCS.g:29:9: '|->'
            {
            match("|->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:30:7: ( 'next_event_a' )
            // InternalPropertyCS.g:30:9: 'next_event_a'
            {
            match("next_event_a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:31:7: ( '[' )
            // InternalPropertyCS.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:32:7: ( ']' )
            // InternalPropertyCS.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:33:7: ( ':' )
            // InternalPropertyCS.g:33:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:34:7: ( ';' )
            // InternalPropertyCS.g:34:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:35:7: ( 'not' )
            // InternalPropertyCS.g:35:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:36:7: ( 'ocl' )
            // InternalPropertyCS.g:36:9: 'ocl'
            {
            match("ocl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:37:7: ( '*' )
            // InternalPropertyCS.g:37:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:38:7: ( '+' )
            // InternalPropertyCS.g:38:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:39:7: ( '=' )
            // InternalPropertyCS.g:39:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:40:7: ( '{' )
            // InternalPropertyCS.g:40:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:41:7: ( '}' )
            // InternalPropertyCS.g:41:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:42:7: ( '|' )
            // InternalPropertyCS.g:42:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:43:7: ( '&' )
            // InternalPropertyCS.g:43:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:44:7: ( '&&' )
            // InternalPropertyCS.g:44:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:45:7: ( 'within' )
            // InternalPropertyCS.g:45:9: 'within'
            {
            match("within"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:46:7: ( 'true' )
            // InternalPropertyCS.g:46:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "RULE_IMPORT_URI"
    public final void mRULE_IMPORT_URI() throws RecognitionException {
        try {
            int _type = RULE_IMPORT_URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:9230:17: ( RULE_SCHEME RULE_ID ( ( '.' | '/' ) RULE_ID )* )
            // InternalPropertyCS.g:9230:19: RULE_SCHEME RULE_ID ( ( '.' | '/' ) RULE_ID )*
            {
            mRULE_SCHEME(); 
            mRULE_ID(); 
            // InternalPropertyCS.g:9230:39: ( ( '.' | '/' ) RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='.' && LA1_0<='/')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPropertyCS.g:9230:40: ( '.' | '/' ) RULE_ID
            	    {
            	    if ( (input.LA(1)>='.' && input.LA(1)<='/') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPORT_URI"

    // $ANTLR start "RULE_SCHEME"
    public final void mRULE_SCHEME() throws RecognitionException {
        try {
            // InternalPropertyCS.g:9232:22: ( RULE_ID ':/' )
            // InternalPropertyCS.g:9232:24: RULE_ID ':/'
            {
            mRULE_ID(); 
            match(":/"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCHEME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:9234:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPropertyCS.g:9234:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPropertyCS.g:9234:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPropertyCS.g:9234:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPropertyCS.g:9234:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPropertyCS.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:9236:10: ( ( '0' .. '9' )+ )
            // InternalPropertyCS.g:9236:12: ( '0' .. '9' )+
            {
            // InternalPropertyCS.g:9236:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPropertyCS.g:9236:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:9238:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPropertyCS.g:9238:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPropertyCS.g:9238:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPropertyCS.g:9238:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPropertyCS.g:9238:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPropertyCS.g:9238:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPropertyCS.g:9238:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPropertyCS.g:9238:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPropertyCS.g:9238:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPropertyCS.g:9238:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPropertyCS.g:9238:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:9240:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPropertyCS.g:9240:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPropertyCS.g:9240:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPropertyCS.g:9240:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:9242:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPropertyCS.g:9242:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPropertyCS.g:9242:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPropertyCS.g:9242:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalPropertyCS.g:9242:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPropertyCS.g:9242:41: ( '\\r' )? '\\n'
                    {
                    // InternalPropertyCS.g:9242:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPropertyCS.g:9242:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:9244:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPropertyCS.g:9244:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPropertyCS.g:9244:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPropertyCS.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropertyCS.g:9246:16: ( . )
            // InternalPropertyCS.g:9246:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPropertyCS.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_IMPORT_URI | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=44;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalPropertyCS.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalPropertyCS.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalPropertyCS.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalPropertyCS.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalPropertyCS.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalPropertyCS.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalPropertyCS.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalPropertyCS.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalPropertyCS.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalPropertyCS.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalPropertyCS.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalPropertyCS.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalPropertyCS.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalPropertyCS.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalPropertyCS.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalPropertyCS.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalPropertyCS.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalPropertyCS.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalPropertyCS.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalPropertyCS.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalPropertyCS.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalPropertyCS.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalPropertyCS.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalPropertyCS.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalPropertyCS.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalPropertyCS.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalPropertyCS.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalPropertyCS.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalPropertyCS.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalPropertyCS.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalPropertyCS.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalPropertyCS.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalPropertyCS.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalPropertyCS.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalPropertyCS.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalPropertyCS.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalPropertyCS.g:1:226: RULE_IMPORT_URI
                {
                mRULE_IMPORT_URI(); 

                }
                break;
            case 38 :
                // InternalPropertyCS.g:1:242: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalPropertyCS.g:1:250: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // InternalPropertyCS.g:1:259: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // InternalPropertyCS.g:1:271: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // InternalPropertyCS.g:1:287: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // InternalPropertyCS.g:1:303: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalPropertyCS.g:1:311: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\45\2\uffff\2\45\1\uffff\2\45\2\42\1\45\1\71\11\uffff\1\104\2\45\1\42\1\45\1\uffff\3\42\2\uffff\2\45\2\uffff\4\45\2\uffff\1\122\2\45\1\uffff\3\45\2\uffff\1\45\16\uffff\3\45\5\uffff\2\45\1\136\2\45\1\uffff\1\141\3\45\1\145\6\45\1\uffff\2\45\1\uffff\3\45\1\uffff\3\45\1\164\1\165\1\45\1\167\1\45\1\172\1\173\4\45\2\uffff\1\u0080\1\uffff\1\u0081\1\u0082\2\uffff\1\u0084\1\45\1\u0086\1\u0087\3\uffff\1\45\1\uffff\1\45\2\uffff\7\45\1\uffff\1\u0091\1\uffff";
    static final String DFA13_eofS =
        "\u0092\uffff";
    static final String DFA13_minS =
        "\1\0\3\60\2\uffff\2\60\1\uffff\2\60\1\76\1\55\1\60\1\55\11\uffff\1\46\2\60\1\101\1\60\1\uffff\2\0\1\52\2\uffff\2\60\2\uffff\4\60\2\uffff\3\60\1\uffff\3\60\2\uffff\1\60\16\uffff\3\60\5\uffff\5\60\1\uffff\13\60\1\uffff\2\60\1\uffff\3\60\1\uffff\16\60\2\uffff\1\60\1\uffff\2\60\2\uffff\4\60\3\uffff\1\60\1\uffff\1\60\2\uffff\5\60\1\41\1\60\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\3\172\2\uffff\2\172\1\uffff\2\172\1\76\1\55\1\172\1\75\11\uffff\1\46\4\172\1\uffff\2\uffff\1\57\2\uffff\2\172\2\uffff\4\172\2\uffff\3\172\1\uffff\3\172\2\uffff\1\172\16\uffff\3\172\5\uffff\5\172\1\uffff\13\172\1\uffff\2\172\1\uffff\3\172\1\uffff\16\172\2\uffff\1\172\1\uffff\2\172\2\uffff\4\172\3\uffff\1\172\1\uffff\1\172\2\uffff\7\172\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\4\1\5\2\uffff\1\11\6\uffff\1\25\1\26\1\27\1\30\1\33\1\34\1\35\1\36\1\37\5\uffff\1\47\3\uffff\1\53\1\54\2\uffff\1\46\1\45\4\uffff\1\4\1\5\3\uffff\1\11\3\uffff\1\16\1\17\1\uffff\1\22\1\23\1\40\1\25\1\26\1\27\1\30\1\33\1\34\1\35\1\36\1\37\1\42\1\41\3\uffff\1\47\1\50\1\51\1\52\1\53\5\uffff\1\6\13\uffff\1\3\2\uffff\1\32\3\uffff\1\31\16\uffff\1\44\1\1\1\uffff\1\7\2\uffff\1\10\1\13\4\uffff\1\2\1\12\1\20\1\uffff\1\14\1\uffff\1\21\1\43\7\uffff\1\15\1\uffff\1\24";
    static final String DFA13_specialS =
        "\1\0\35\uffff\1\2\1\1\162\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\10\1\36\3\42\1\30\1\37\1\4\1\5\1\23\1\24\1\42\1\13\1\42\1\40\12\35\1\21\1\22\1\14\1\25\3\42\32\34\1\17\1\42\1\20\1\33\1\34\1\42\1\3\1\15\2\34\1\12\1\1\2\34\1\2\4\34\1\11\1\6\4\34\1\32\1\7\1\34\1\31\3\34\1\26\1\16\1\27\uff82\42",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\1\43\31\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\14\44\1\47\15\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\1\44\1\51\11\44\1\52\1\44\1\50\14\44",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\2\44\1\56\16\44\1\55\10\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\57\14\44",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\61\11\44\1\62\13\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\25\44\1\63\4\44",
            "\1\64",
            "\1\65",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\66\25\44",
            "\1\70\17\uffff\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\105\21\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\106\10\44",
            "\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\0\111",
            "\0\111",
            "\1\112\4\uffff\1\113",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\115\16\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\17\44\1\116\12\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\117\26\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\120\13\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\26\44\1\121\3\44",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\123\16\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\124\6\44",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\25\44\1\125\1\44\1\126\2\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\127\6\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\130\25\44",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\5\44\1\131\24\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\132\6\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\24\44\1\133\5\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\134\7\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\135\13\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\137\10\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\1\140\31\44",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\142\21\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\143\25\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\144\6\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\146\14\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\147\13\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\7\44\1\150\22\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\151\25\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\152\25\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\153\10\44",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\154\6\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\30\44\1\155\1\44",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\156\16\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\157\10\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\160\1\uffff\32\44",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\161\6\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\162\10\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\163\21\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\166\6\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\170\7\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\171\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\174\25\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\24\44\1\175\5\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\176\25\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\177\14\44",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\25\44\1\u0083\4\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\1\u0085\31\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\u0088\25\44",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\u0089\16\44",
            "",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\u008a\14\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\u008b\16\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\u008c\6\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\30\44\1\u008d\1\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\u008e\1\uffff\32\44",
            "\1\u008f\16\uffff\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\1\u0090\31\44",
            "",
            "\12\44\1\46\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_IMPORT_URI | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='f') ) {s = 1;}

                        else if ( (LA13_0=='i') ) {s = 2;}

                        else if ( (LA13_0=='a') ) {s = 3;}

                        else if ( (LA13_0=='(') ) {s = 4;}

                        else if ( (LA13_0==')') ) {s = 5;}

                        else if ( (LA13_0=='o') ) {s = 6;}

                        else if ( (LA13_0=='u') ) {s = 7;}

                        else if ( (LA13_0=='!') ) {s = 8;}

                        else if ( (LA13_0=='n') ) {s = 9;}

                        else if ( (LA13_0=='e') ) {s = 10;}

                        else if ( (LA13_0=='-') ) {s = 11;}

                        else if ( (LA13_0=='<') ) {s = 12;}

                        else if ( (LA13_0=='b') ) {s = 13;}

                        else if ( (LA13_0=='|') ) {s = 14;}

                        else if ( (LA13_0=='[') ) {s = 15;}

                        else if ( (LA13_0==']') ) {s = 16;}

                        else if ( (LA13_0==':') ) {s = 17;}

                        else if ( (LA13_0==';') ) {s = 18;}

                        else if ( (LA13_0=='*') ) {s = 19;}

                        else if ( (LA13_0=='+') ) {s = 20;}

                        else if ( (LA13_0=='=') ) {s = 21;}

                        else if ( (LA13_0=='{') ) {s = 22;}

                        else if ( (LA13_0=='}') ) {s = 23;}

                        else if ( (LA13_0=='&') ) {s = 24;}

                        else if ( (LA13_0=='w') ) {s = 25;}

                        else if ( (LA13_0=='t') ) {s = 26;}

                        else if ( (LA13_0=='^') ) {s = 27;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='c' && LA13_0<='d')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||(LA13_0>='p' && LA13_0<='s')||LA13_0=='v'||(LA13_0>='x' && LA13_0<='z')) ) {s = 28;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 29;}

                        else if ( (LA13_0=='\"') ) {s = 30;}

                        else if ( (LA13_0=='\'') ) {s = 31;}

                        else if ( (LA13_0=='/') ) {s = 32;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 33;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='%')||LA13_0==','||LA13_0=='.'||(LA13_0>='>' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_31 = input.LA(1);

                        s = -1;
                        if ( ((LA13_31>='\u0000' && LA13_31<='\uFFFF')) ) {s = 73;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_30 = input.LA(1);

                        s = -1;
                        if ( ((LA13_30>='\u0000' && LA13_30<='\uFFFF')) ) {s = 73;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}