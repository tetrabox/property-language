/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.sequence.cs.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.tetrabox.sequence.cs.parser.antlr.internal.InternalSequenceCSParser;
import org.tetrabox.sequence.cs.services.SequenceCSGrammarAccess;

public class SequenceCSParser extends AbstractAntlrParser {

	@Inject
	private SequenceCSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSequenceCSParser createParser(XtextTokenStream stream) {
		return new InternalSequenceCSParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SERE";
	}

	public SequenceCSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SequenceCSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}