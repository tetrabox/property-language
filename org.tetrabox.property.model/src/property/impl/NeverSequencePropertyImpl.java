/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.NeverSequenceProperty;
import property.PropertyPackage;

import sequence.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Never Sequence Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NeverSequencePropertyImpl extends UnaryPropertyImpl<Sequence> implements NeverSequenceProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeverSequencePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.NEVER_SEQUENCE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetOperand(Sequence newOperand, NotificationChain msgs) {
		return super.basicSetOperand(newOperand, msgs);
	}

} //NeverSequencePropertyImpl
