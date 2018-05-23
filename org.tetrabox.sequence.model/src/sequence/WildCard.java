/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wild Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.WildCard#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getWildCard()
 * @model
 * @generated
 */
public interface WildCard extends RepeatedSERE {
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
	 * @see sequence.SequencePackage#getWildCard_Count()
	 * @model containment="true"
	 * @generated
	 */
	Count getCount();

	/**
	 * Sets the value of the '{@link sequence.WildCard#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Count value);

} // WildCard
