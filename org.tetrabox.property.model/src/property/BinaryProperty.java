/**
 */
package property;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.BinaryProperty#getLeft <em>Left</em>}</li>
 *   <li>{@link property.BinaryProperty#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getBinaryProperty()
 * @model abstract="true"
 * @generated
 */
public interface BinaryProperty<L, R> extends Property {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Object)
	 * @see property.PropertyPackage#getBinaryProperty_Left()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	L getLeft();

	/**
	 * Sets the value of the '{@link property.BinaryProperty#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(L value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Object)
	 * @see property.PropertyPackage#getBinaryProperty_Right()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	R getRight();

	/**
	 * Sets the value of the '{@link property.BinaryProperty#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(R value);

} // BinaryProperty
