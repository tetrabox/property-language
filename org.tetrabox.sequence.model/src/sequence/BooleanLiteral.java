/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.BooleanLiteral#isLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getBooleanLiteral()
 * @model
 * @generated
 */
public interface BooleanLiteral extends SequenceTerminal {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(boolean)
	 * @see sequence.SequencePackage#getBooleanLiteral_Literal()
	 * @model
	 * @generated
	 */
	boolean isLiteral();

	/**
	 * Sets the value of the '{@link sequence.BooleanLiteral#isLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #isLiteral()
	 * @generated
	 */
	void setLiteral(boolean value);

} // BooleanLiteral
