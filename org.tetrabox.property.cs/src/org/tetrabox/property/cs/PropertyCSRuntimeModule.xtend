/*
 * generated by Xtext 2.10.0
 */
package org.tetrabox.property.cs

import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class PropertyCSRuntimeModule extends AbstractPropertyCSRuntimeModule {
	public override Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return typeof(ImportUriGlobalScopeProvider)
	}
}
