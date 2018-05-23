/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Sequence Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.NotSequenceTerminal#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getNotSequenceTerminal()
 * @model
 * @generated
 */
public interface NotSequenceTerminal extends SequenceTerminal {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(SequenceTerminal)
	 * @see sequence.SequencePackage#getNotSequenceTerminal_Literal()
	 * @model containment="true"
	 * @generated
	 */
	SequenceTerminal getLiteral();

	/**
	 * Sets the value of the '{@link sequence.NotSequenceTerminal#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(SequenceTerminal value);

} // NotSequenceTerminal
