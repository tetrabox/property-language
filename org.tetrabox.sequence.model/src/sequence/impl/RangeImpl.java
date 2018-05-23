/**
 */
package sequence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sequence.Range;
import sequence.SequencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sequence.impl.RangeImpl#getLOWER_BOUND <em>LOWER BOUND</em>}</li>
 *   <li>{@link sequence.impl.RangeImpl#getHIGHER_BOUND <em>HIGHER BOUND</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeImpl extends CountImpl implements Range {
	/**
	 * The default value of the '{@link #getLOWER_BOUND() <em>LOWER BOUND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOWER_BOUND()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLOWER_BOUND() <em>LOWER BOUND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOWER_BOUND()
	 * @generated
	 * @ordered
	 */
	protected int loweR_BOUND = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHIGHER_BOUND() <em>HIGHER BOUND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIGHER_BOUND()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGHER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHIGHER_BOUND() <em>HIGHER BOUND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIGHER_BOUND()
	 * @generated
	 * @ordered
	 */
	protected int higheR_BOUND = HIGHER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencePackage.Literals.RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLOWER_BOUND() {
		return loweR_BOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLOWER_BOUND(int newLOWER_BOUND) {
		int oldLOWER_BOUND = loweR_BOUND;
		loweR_BOUND = newLOWER_BOUND;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.RANGE__LOWER_BOUND, oldLOWER_BOUND, loweR_BOUND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHIGHER_BOUND() {
		return higheR_BOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHIGHER_BOUND(int newHIGHER_BOUND) {
		int oldHIGHER_BOUND = higheR_BOUND;
		higheR_BOUND = newHIGHER_BOUND;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.RANGE__HIGHER_BOUND, oldHIGHER_BOUND, higheR_BOUND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequencePackage.RANGE__LOWER_BOUND:
				return getLOWER_BOUND();
			case SequencePackage.RANGE__HIGHER_BOUND:
				return getHIGHER_BOUND();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SequencePackage.RANGE__LOWER_BOUND:
				setLOWER_BOUND((Integer)newValue);
				return;
			case SequencePackage.RANGE__HIGHER_BOUND:
				setHIGHER_BOUND((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SequencePackage.RANGE__LOWER_BOUND:
				setLOWER_BOUND(LOWER_BOUND_EDEFAULT);
				return;
			case SequencePackage.RANGE__HIGHER_BOUND:
				setHIGHER_BOUND(HIGHER_BOUND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SequencePackage.RANGE__LOWER_BOUND:
				return loweR_BOUND != LOWER_BOUND_EDEFAULT;
			case SequencePackage.RANGE__HIGHER_BOUND:
				return higheR_BOUND != HIGHER_BOUND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (LOWER_BOUND: ");
		result.append(loweR_BOUND);
		result.append(", HIGHER_BOUND: ");
		result.append(higheR_BOUND);
		result.append(')');
		return result.toString();
	}

} //RangeImpl
