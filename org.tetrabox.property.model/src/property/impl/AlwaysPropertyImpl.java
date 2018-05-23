/**
 */
package property.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import property.AlwaysProperty;
import property.Property;
import property.PropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Always Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AlwaysPropertyImpl extends UnaryPropertyImpl<Property> implements AlwaysProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlwaysPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.ALWAYS_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetOperand(Property newOperand, NotificationChain msgs) {
		return super.basicSetOperand(newOperand, msgs);
	}

} //AlwaysPropertyImpl
