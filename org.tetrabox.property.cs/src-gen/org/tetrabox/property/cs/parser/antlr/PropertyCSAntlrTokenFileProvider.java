/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.property.cs.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PropertyCSAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/tetrabox/property/cs/parser/antlr/internal/InternalPropertyCS.tokens");
	}
}
