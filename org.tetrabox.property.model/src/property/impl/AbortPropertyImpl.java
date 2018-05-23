/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.AbortProperty;
import property.Property;
import property.PropertyPackage;

import sequence.SequenceTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abort Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AbortPropertyImpl extends BinaryPropertyImpl<Property, SequenceTerminal> implements AbortProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbortPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.ABORT_PROPERTY;
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

} //AbortPropertyImpl
