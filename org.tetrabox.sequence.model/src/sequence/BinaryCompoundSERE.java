/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Compound SERE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.BinaryCompoundSERE#getLeft <em>Left</em>}</li>
 *   <li>{@link sequence.BinaryCompoundSERE#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getBinaryCompoundSERE()
 * @model abstract="true"
 * @generated
 */
public interface BinaryCompoundSERE extends CompoundSERE {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(CompoundSERE)
	 * @see sequence.SequencePackage#getBinaryCompoundSERE_Left()
	 * @model containment="true"
	 * @generated
	 */
	CompoundSERE getLeft();

	/**
	 * Sets the value of the '{@link sequence.BinaryCompoundSERE#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(CompoundSERE value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(CompoundSERE)
	 * @see sequence.SequencePackage#getBinaryCompoundSERE_Right()
	 * @model containment="true"
	 * @generated
	 */
	CompoundSERE getRight();

	/**
	 * Sets the value of the '{@link sequence.BinaryCompoundSERE#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(CompoundSERE value);

} // BinaryCompoundSERE
