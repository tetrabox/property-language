/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.EventuallyBooleanProperty;
import property.PropertyPackage;

import sequence.SequenceTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eventually Boolean Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EventuallyBooleanPropertyImpl extends UnaryPropertyImpl<SequenceTerminal> implements EventuallyBooleanProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventuallyBooleanPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.EVENTUALLY_BOOLEAN_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetOperand(SequenceTerminal newOperand, NotificationChain msgs) {
		return super.basicSetOperand(newOperand, msgs);
	}

} //EventuallyBooleanPropertyImpl
