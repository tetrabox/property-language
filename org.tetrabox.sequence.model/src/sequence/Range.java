/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.Range#getLOWER_BOUND <em>LOWER BOUND</em>}</li>
 *   <li>{@link sequence.Range#getHIGHER_BOUND <em>HIGHER BOUND</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getRange()
 * @model
 * @generated
 */
public interface Range extends Count {
	/**
	 * Returns the value of the '<em><b>LOWER BOUND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOWER BOUND</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOWER BOUND</em>' attribute.
	 * @see #setLOWER_BOUND(int)
	 * @see sequence.SequencePackage#getRange_LOWER_BOUND()
	 * @model
	 * @generated
	 */
	int getLOWER_BOUND();

	/**
	 * Sets the value of the '{@link sequence.Range#getLOWER_BOUND <em>LOWER BOUND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOWER BOUND</em>' attribute.
	 * @see #getLOWER_BOUND()
	 * @generated
	 */
	void setLOWER_BOUND(int value);

	/**
	 * Returns the value of the '<em><b>HIGHER BOUND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HIGHER BOUND</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HIGHER BOUND</em>' attribute.
	 * @see #setHIGHER_BOUND(int)
	 * @see sequence.SequencePackage#getRange_HIGHER_BOUND()
	 * @model
	 * @generated
	 */
	int getHIGHER_BOUND();

	/**
	 * Sets the value of the '{@link sequence.Range#getHIGHER_BOUND <em>HIGHER BOUND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIGHER BOUND</em>' attribute.
	 * @see #getHIGHER_BOUND()
	 * @generated
	 */
	void setHIGHER_BOUND(int value);

} // Range
