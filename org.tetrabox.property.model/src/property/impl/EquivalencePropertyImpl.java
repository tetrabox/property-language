/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.EquivalenceProperty;
import property.PropertyPackage;

import sequence.SequenceTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalence Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EquivalencePropertyImpl extends BinaryPropertyImpl<SequenceTerminal, SequenceTerminal> implements EquivalenceProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalencePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.EQUIVALENCE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLeft(SequenceTerminal newLeft, NotificationChain msgs) {
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

} //EquivalencePropertyImpl
