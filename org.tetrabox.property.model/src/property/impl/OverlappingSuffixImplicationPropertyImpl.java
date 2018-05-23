/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.OverlappingSuffixImplicationProperty;
import property.Property;
import property.PropertyPackage;

import sequence.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overlapping Suffix Implication Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OverlappingSuffixImplicationPropertyImpl extends BinaryPropertyImpl<Sequence, Property> implements OverlappingSuffixImplicationProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverlappingSuffixImplicationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLeft(Sequence newLeft, NotificationChain msgs) {
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

} //OverlappingSuffixImplicationPropertyImpl
