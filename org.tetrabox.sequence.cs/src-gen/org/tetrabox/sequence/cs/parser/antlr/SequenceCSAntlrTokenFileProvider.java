/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.sequence.cs.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SequenceCSAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/tetrabox/sequence/cs/parser/antlr/internal/InternalSequenceCS.tokens");
	}
}
