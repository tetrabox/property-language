/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counted Consecutive Repetition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.SequenceCountedConsecutiveRepetition#getExpression <em>Expression</em>}</li>
 *   <li>{@link sequence.SequenceCountedConsecutiveRepetition#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getSequenceCountedConsecutiveRepetition()
 * @model
 * @generated
 */
public interface SequenceCountedConsecutiveRepetition extends RepeatedSERE {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Sequence)
	 * @see sequence.SequencePackage#getSequenceCountedConsecutiveRepetition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Sequence getExpression();

	/**
	 * Sets the value of the '{@link sequence.SequenceCountedConsecutiveRepetition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Sequence value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(Count)
	 * @see sequence.SequencePackage#getSequenceCountedConsecutiveRepetition_Count()
	 * @model containment="true"
	 * @generated
	 */
	Count getCount();

	/**
	 * Sets the value of the '{@link sequence.SequenceCountedConsecutiveRepetition#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Count value);

} // SequenceCountedConsecutiveRepetition
