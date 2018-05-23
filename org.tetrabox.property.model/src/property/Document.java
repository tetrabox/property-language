/**
 */
package property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.Document#getOwnedImports <em>Owned Imports</em>}</li>
 *   <li>{@link property.Document#getOwnedProperties <em>Owned Properties</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Imports</b></em>' containment reference list.
	 * The list contents are of type {@link property.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Imports</em>' containment reference list.
	 * @see property.PropertyPackage#getDocument_OwnedImports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getOwnedImports();

	/**
	 * Returns the value of the '<em><b>Owned Properties</b></em>' containment reference list.
	 * The list contents are of type {@link property.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Properties</em>' containment reference list.
	 * @see property.PropertyPackage#getDocument_OwnedProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedProperties();

} // Document
