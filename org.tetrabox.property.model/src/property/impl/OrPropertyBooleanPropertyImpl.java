/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.OrPropertyBooleanProperty;
import property.Property;
import property.PropertyPackage;

import sequence.SequenceTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Property Boolean Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OrPropertyBooleanPropertyImpl extends BinaryPropertyImpl<Property, SequenceTerminal> implements OrPropertyBooleanProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrPropertyBooleanPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.OR_PROPERTY_BOOLEAN_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLeft(Property newLeft, NotificationChain msgs) {
		return super.basicSetLeft(newLeft, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRight(SequenceTerminal newRight, NotificationChain msgs) {
		return super.basicSetRight(newRight, msgs);
	}

} //OrPropertyBooleanPropertyImpl
