/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.PropertyPackage;
import property.SequenceTightProperty;

import sequence.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Tight Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SequenceTightPropertyImpl extends UnaryPropertyImpl<Sequence> implements SequenceTightProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceTightPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.SEQUENCE_TIGHT_PROPERTY;
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

} //SequenceTightPropertyImpl
