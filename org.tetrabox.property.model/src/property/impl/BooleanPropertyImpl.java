/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.BooleanProperty;
import property.PropertyPackage;

import sequence.SequenceTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BooleanPropertyImpl extends UnaryPropertyImpl<SequenceTerminal> implements BooleanProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.BOOLEAN_PROPERTY;
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

} //BooleanPropertyImpl
