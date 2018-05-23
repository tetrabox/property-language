/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consecutive Repetition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.SequenceConsecutiveRepetition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getSequenceConsecutiveRepetition()
 * @model
 * @generated
 */
public interface SequenceConsecutiveRepetition extends RepeatedSERE {
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
	 * @see sequence.SequencePackage#getSequenceConsecutiveRepetition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Sequence getExpression();

	/**
	 * Sets the value of the '{@link sequence.SequenceConsecutiveRepetition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Sequence value);

} // SequenceConsecutiveRepetition
