/**
 */
package property;

import sequence.Range;
import sequence.SequenceTerminal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Event AProperty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.NextEventAProperty#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getNextEventAProperty()
 * @model
 * @generated
 */
public interface NextEventAProperty extends BinaryProperty<SequenceTerminal, Property> {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see property.PropertyPackage#getNextEventAProperty_Range()
	 * @model containment="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link property.NextEventAProperty#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

} // NextEventAProperty
