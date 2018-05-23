/**
 */
package property;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.UnaryProperty#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getUnaryProperty()
 * @model abstract="true"
 * @generated
 */
public interface UnaryProperty<O> extends Property {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Object)
	 * @see property.PropertyPackage#getUnaryProperty_Operand()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	O getOperand();

	/**
	 * Sets the value of the '{@link property.UnaryProperty#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(O value);

} // UnaryProperty
