/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.property.cs.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.tetrabox.property.cs.parser.antlr.internal.InternalPropertyCSParser;
import org.tetrabox.property.cs.services.PropertyCSGrammarAccess;

public class PropertyCSParser extends AbstractAntlrParser {

	@Inject
	private PropertyCSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPropertyCSParser createParser(XtextTokenStream stream) {
		return new InternalPropertyCSParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Document";
	}

	public PropertyCSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PropertyCSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
