/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Braced SERE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.BracedSERE#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getBracedSERE()
 * @model
 * @generated
 */
public interface BracedSERE extends Sequence, CompoundSERE {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(SERE)
	 * @see sequence.SequencePackage#getBracedSERE_Expression()
	 * @model containment="true"
	 * @generated
	 */
	SERE getExpression();

	/**
	 * Sets the value of the '{@link sequence.BracedSERE#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(SERE value);

} // BracedSERE
