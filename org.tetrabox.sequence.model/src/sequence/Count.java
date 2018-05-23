/**
 */
package sequence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence.Count#getCOUNT <em>COUNT</em>}</li>
 * </ul>
 *
 * @see sequence.SequencePackage#getCount()
 * @model
 * @generated
 */
public interface Count extends EObject {
	/**
	 * Returns the value of the '<em><b>COUNT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COUNT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COUNT</em>' attribute.
	 * @see #setCOUNT(int)
	 * @see sequence.SequencePackage#getCount_COUNT()
	 * @model
	 * @generated
	 */
	int getCOUNT();

	/**
	 * Sets the value of the '{@link sequence.Count#getCOUNT <em>COUNT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COUNT</em>' attribute.
	 * @see #getCOUNT()
	 * @generated
	 */
	void setCOUNT(int value);

} // Count
