/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concatenation SERE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.ConcatenationSERE#getLeft <em>Left</em>}</li>
 *   <li>{@link sequence.ConcatenationSERE#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getConcatenationSERE()
 * @model
 * @generated
 */
public interface ConcatenationSERE extends SERE {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(SimpleSERE)
	 * @see sequence.SequencePackage#getConcatenationSERE_Left()
	 * @model containment="true"
	 * @generated
	 */
	SimpleSERE getLeft();

	/**
	 * Sets the value of the '{@link sequence.ConcatenationSERE#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(SimpleSERE value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(SERE)
	 * @see sequence.SequencePackage#getConcatenationSERE_Right()
	 * @model containment="true"
	 * @generated
	 */
	SERE getRight();

	/**
	 * Sets the value of the '{@link sequence.ConcatenationSERE#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(SERE value);

} // ConcatenationSERE
