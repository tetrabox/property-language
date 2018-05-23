/**
 */
package sequence.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sequence.Count;
import sequence.Sequence;
import sequence.SequenceCountedConsecutiveRepetition;
import sequence.SequencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Counted Consecutive Repetition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sequence.impl.SequenceCountedConsecutiveRepetitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link sequence.impl.SequenceCountedConsecutiveRepetitionImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceCountedConsecutiveRepetitionImpl extends RepeatedSEREImpl implements SequenceCountedConsecutiveRepetition {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Sequence expression;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected Count count;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceCountedConsecutiveRepetitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencePackage.Literals.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Sequence newExpression, NotificationChain msgs) {
		Sequence oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Sequence newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(Count newCount, NotificationChain msgs) {
		Count oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT, oldCount, newCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(Count newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT:
				return basicSetCount(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION:
				return getExpression();
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT:
				return getCount();
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
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION:
				setExpression((Sequence)newValue);
				return;
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT:
				setCount((Count)newValue);
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
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION:
				setExpression((Sequence)null);
				return;
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT:
				setCount((Count)null);
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
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION:
				return expression != null;
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT:
				return count != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceCountedConsecutiveRepetitionImpl
