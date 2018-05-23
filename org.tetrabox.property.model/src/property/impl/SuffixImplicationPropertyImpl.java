/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.Property;
import property.PropertyPackage;
import property.SuffixImplicationProperty;

import sequence.SequenceTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suffix Implication Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SuffixImplicationPropertyImpl extends BinaryPropertyImpl<SequenceTerminal, Property> implements SuffixImplicationProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuffixImplicationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.SUFFIX_IMPLICATION_PROPERTY;
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
	public NotificationChain basicSetRight(Property newRight, NotificationChain msgs) {
		return super.basicSetRight(newRight, msgs);
	}

} //SuffixImplicationPropertyImpl
