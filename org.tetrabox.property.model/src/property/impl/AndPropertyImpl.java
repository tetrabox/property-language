/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.AndProperty;
import property.Property;
import property.PropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AndPropertyImpl extends BinaryPropertyImpl<Property, Property> implements AndProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.AND_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLeft(Property newLeft, NotificationChain msgs) {
		return super.basicSetLeft(newLeft, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRight(Property newRight, NotificationChain msgs) {
		return super.basicSetRight(newRight, msgs);
	}

} //AndPropertyImpl
