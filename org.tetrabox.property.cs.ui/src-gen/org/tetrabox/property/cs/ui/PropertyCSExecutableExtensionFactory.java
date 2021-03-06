/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.property.cs.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.tetrabox.property.cs.ui.internal.CsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PropertyCSExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CsActivator.getInstance().getInjector(CsActivator.ORG_TETRABOX_PROPERTY_CS_PROPERTYCS);
	}
	
}
