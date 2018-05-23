/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.sequence.cs.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.tetrabox.sequence.cs.SequenceCSRuntimeModule
import org.tetrabox.sequence.cs.SequenceCSStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SequenceCSIdeSetup extends SequenceCSStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SequenceCSRuntimeModule, new SequenceCSIdeModule))
	}
	
}