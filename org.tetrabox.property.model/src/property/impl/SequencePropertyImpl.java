/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.PropertyPackage;
import property.SequenceProperty;

import sequence.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SequencePropertyImpl extends UnaryPropertyImpl<Sequence> implements SequenceProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequencePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.SEQUENCE_PROPERTY;
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

} //SequencePropertyImpl
