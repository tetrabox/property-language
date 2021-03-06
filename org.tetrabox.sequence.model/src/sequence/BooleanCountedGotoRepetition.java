/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Counted Goto Repetition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.BooleanCountedGotoRepetition#getExpression <em>Expression</em>}</li>
 *   <li>{@link sequence.BooleanCountedGotoRepetition#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getBooleanCountedGotoRepetition()
 * @model
 * @generated
 */
public interface BooleanCountedGotoRepetition extends RepeatedSERE {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(SequenceTerminal)
	 * @see sequence.SequencePackage#getBooleanCountedGotoRepetition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	SequenceTerminal getExpression();

	/**
	 * Sets the value of the '{@link sequence.BooleanCountedGotoRepetition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(SequenceTerminal value);

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
	 * @see sequence.SequencePackage#getBooleanCountedGotoRepetition_Count()
	 * @model containment="true"
	 * @generated
	 */
	Count getCount();

	/**
	 * Sets the value of the '{@link sequence.BooleanCountedGotoRepetition#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Count value);

} // BooleanCountedGotoRepetition
