/**
 */
package property;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see property.PropertyFactory
 * @model kind="package"
 * @generated
 */
public interface PropertyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "property";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tetrabox.org/property";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "property";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertyPackage eINSTANCE = property.impl.PropertyPackageImpl.init();

	/**
	 * The meta object id for the '{@link property.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.DocumentImpl
	 * @see property.impl.PropertyPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link property.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.ImportImpl
	 * @see property.impl.PropertyPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link property.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.PropertyImpl
	 * @see property.impl.PropertyPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link property.impl.UnaryPropertyImpl <em>Unary Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.UnaryPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getUnaryProperty()
	 * @generated
	 */
	int UNARY_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PROPERTY__OPERAND = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.BinaryPropertyImpl <em>Binary Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.BinaryPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getBinaryProperty()
	 * @generated
	 */
	int BINARY_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY__LEFT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY__RIGHT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.BooleanPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getBooleanProperty()
	 * @generated
	 */
	int BOOLEAN_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY__OPERAND = UNARY_PROPERTY__OPERAND;

	/**
	 * The number of structural features of the '<em>Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_FEATURE_COUNT = UNARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_OPERATION_COUNT = UNARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.AlwaysPropertyImpl <em>Always Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.AlwaysPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getAlwaysProperty()
	 * @generated
	 */
	int ALWAYS_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_PROPERTY__OPERAND = UNARY_PROPERTY__OPERAND;

	/**
	 * The number of structural features of the '<em>Always Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_PROPERTY_FEATURE_COUNT = UNARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Always Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_PROPERTY_OPERATION_COUNT = UNARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.NeverBooleanPropertyImpl <em>Never Boolean Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.NeverBooleanPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getNeverBooleanProperty()
	 * @generated
	 */
	int NEVER_BOOLEAN_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_BOOLEAN_PROPERTY__OPERAND = UNARY_PROPERTY__OPERAND;

	/**
	 * The number of structural features of the '<em>Never Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_BOOLEAN_PROPERTY_FEATURE_COUNT = UNARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Never Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_BOOLEAN_PROPERTY_OPERATION_COUNT = UNARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.NeverSequencePropertyImpl <em>Never Sequence Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.NeverSequencePropertyImpl
	 * @see property.impl.PropertyPackageImpl#getNeverSequenceProperty()
	 * @generated
	 */
	int NEVER_SEQUENCE_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_SEQUENCE_PROPERTY__OPERAND = UNARY_PROPERTY__OPERAND;

	/**
	 * The number of structural features of the '<em>Never Sequence Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_SEQUENCE_PROPERTY_FEATURE_COUNT = UNARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Never Sequence Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_SEQUENCE_PROPERTY_OPERATION_COUNT = UNARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.SequencePropertyImpl <em>Sequence Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.SequencePropertyImpl
	 * @see property.impl.PropertyPackageImpl#getSequenceProperty()
	 * @generated
	 */
	int SEQUENCE_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PROPERTY__OPERAND = UNARY_PROPERTY__OPERAND;

	/**
	 * The number of structural features of the '<em>Sequence Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PROPERTY_FEATURE_COUNT = UNARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PROPERTY_OPERATION_COUNT = UNARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.SequenceTightPropertyImpl <em>Sequence Tight Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.SequenceTightPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getSequenceTightProperty()
	 * @generated
	 */
	int SEQUENCE_TIGHT_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TIGHT_PROPERTY__OPERAND = UNARY_PROPERTY__OPERAND;

	/**
	 * The number of structural features of the '<em>Sequence Tight Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TIGHT_PROPERTY_FEATURE_COUNT = UNARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Tight Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TIGHT_PROPERTY_OPERATION_COUNT = UNARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.NextEPropertyImpl <em>Next EProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.NextEPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getNextEProperty()
	 * @generated
	 */
	int NEXT_EPROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EPROPERTY__OPERAND = UNARY_PROPERTY__OPERAND;

	/**
	 * The number of structural features of the '<em>Next EProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EPROPERTY_FEATURE_COUNT = UNARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Next EProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EPROPERTY_OPERATION_COUNT = UNARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.NextEventAPropertyImpl <em>Next Event AProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.NextEventAPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getNextEventAProperty()
	 * @generated
	 */
	int NEXT_EVENT_APROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EVENT_APROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EVENT_APROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EVENT_APROPERTY__RANGE = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Next Event AProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EVENT_APROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Next Event AProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EVENT_APROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.EventuallyBooleanPropertyImpl <em>Eventually Boolean Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.EventuallyBooleanPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getEventuallyBooleanProperty()
	 * @generated
	 */
	int EVENTUALLY_BOOLEAN_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_BOOLEAN_PROPERTY__OPERAND = UNARY_PROPERTY__OPERAND;

	/**
	 * The number of structural features of the '<em>Eventually Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_BOOLEAN_PROPERTY_FEATURE_COUNT = UNARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eventually Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_BOOLEAN_PROPERTY_OPERATION_COUNT = UNARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.EventuallySequencePropertyImpl <em>Eventually Sequence Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.EventuallySequencePropertyImpl
	 * @see property.impl.PropertyPackageImpl#getEventuallySequenceProperty()
	 * @generated
	 */
	int EVENTUALLY_SEQUENCE_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_SEQUENCE_PROPERTY__OPERAND = UNARY_PROPERTY__OPERAND;

	/**
	 * The number of structural features of the '<em>Eventually Sequence Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_SEQUENCE_PROPERTY_FEATURE_COUNT = UNARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eventually Sequence Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_SEQUENCE_PROPERTY_OPERATION_COUNT = UNARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.AndPropertyImpl <em>And Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.AndPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getAndProperty()
	 * @generated
	 */
	int AND_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>And Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.AbortPropertyImpl <em>Abort Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.AbortPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getAbortProperty()
	 * @generated
	 */
	int ABORT_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Abort Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abort Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.OrPropertyBooleanPropertyImpl <em>Or Property Boolean Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.OrPropertyBooleanPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getOrPropertyBooleanProperty()
	 * @generated
	 */
	int OR_PROPERTY_BOOLEAN_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PROPERTY_BOOLEAN_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PROPERTY_BOOLEAN_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Or Property Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PROPERTY_BOOLEAN_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Property Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PROPERTY_BOOLEAN_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.OrBooleanPropertyPropertyImpl <em>Or Boolean Property Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.OrBooleanPropertyPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getOrBooleanPropertyProperty()
	 * @generated
	 */
	int OR_BOOLEAN_PROPERTY_PROPERTY = 18;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_BOOLEAN_PROPERTY_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_BOOLEAN_PROPERTY_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Or Boolean Property Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_BOOLEAN_PROPERTY_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Boolean Property Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_BOOLEAN_PROPERTY_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.ImpliesPropertyImpl <em>Implies Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.ImpliesPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getImpliesProperty()
	 * @generated
	 */
	int IMPLIES_PROPERTY = 19;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Implies Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implies Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.SuffixImplicationPropertyImpl <em>Suffix Implication Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.SuffixImplicationPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getSuffixImplicationProperty()
	 * @generated
	 */
	int SUFFIX_IMPLICATION_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_IMPLICATION_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_IMPLICATION_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Suffix Implication Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_IMPLICATION_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suffix Implication Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_IMPLICATION_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.OverlappingSuffixImplicationPropertyImpl <em>Overlapping Suffix Implication Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.OverlappingSuffixImplicationPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getOverlappingSuffixImplicationProperty()
	 * @generated
	 */
	int OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Overlapping Suffix Implication Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Overlapping Suffix Implication Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.EquivalencePropertyImpl <em>Equivalence Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.EquivalencePropertyImpl
	 * @see property.impl.PropertyPackageImpl#getEquivalenceProperty()
	 * @generated
	 */
	int EQUIVALENCE_PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Equivalence Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equivalence Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.UntilPropertyImpl <em>Until Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.UntilPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getUntilProperty()
	 * @generated
	 */
	int UNTIL_PROPERTY = 23;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Until Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Until Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.BeforePropertyImpl <em>Before Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.BeforePropertyImpl
	 * @see property.impl.PropertyPackageImpl#getBeforeProperty()
	 * @generated
	 */
	int BEFORE_PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Before Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Before Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link property.impl.OverlappingUntilPropertyImpl <em>Overlapping Until Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.OverlappingUntilPropertyImpl
	 * @see property.impl.PropertyPackageImpl#getOverlappingUntilProperty()
	 * @generated
	 */
	int OVERLAPPING_UNTIL_PROPERTY = 25;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_UNTIL_PROPERTY__LEFT = BINARY_PROPERTY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_UNTIL_PROPERTY__RIGHT = BINARY_PROPERTY__RIGHT;

	/**
	 * The number of structural features of the '<em>Overlapping Until Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_UNTIL_PROPERTY_FEATURE_COUNT = BINARY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Overlapping Until Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_UNTIL_PROPERTY_OPERATION_COUNT = BINARY_PROPERTY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link property.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see property.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link property.Document#getOwnedImports <em>Owned Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Imports</em>'.
	 * @see property.Document#getOwnedImports()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_OwnedImports();

	/**
	 * Returns the meta object for the containment reference list '{@link property.Document#getOwnedProperties <em>Owned Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Properties</em>'.
	 * @see property.Document#getOwnedProperties()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_OwnedProperties();

	/**
	 * Returns the meta object for class '{@link property.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see property.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link property.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see property.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link property.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see property.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link property.UnaryProperty <em>Unary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Property</em>'.
	 * @see property.UnaryProperty
	 * @generated
	 */
	EClass getUnaryProperty();

	/**
	 * Returns the meta object for the containment reference '{@link property.UnaryProperty#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see property.UnaryProperty#getOperand()
	 * @see #getUnaryProperty()
	 * @generated
	 */
	EReference getUnaryProperty_Operand();

	/**
	 * Returns the meta object for class '{@link property.BinaryProperty <em>Binary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Property</em>'.
	 * @see property.BinaryProperty
	 * @generated
	 */
	EClass getBinaryProperty();

	/**
	 * Returns the meta object for the containment reference '{@link property.BinaryProperty#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see property.BinaryProperty#getLeft()
	 * @see #getBinaryProperty()
	 * @generated
	 */
	EReference getBinaryProperty_Left();

	/**
	 * Returns the meta object for the containment reference '{@link property.BinaryProperty#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see property.BinaryProperty#getRight()
	 * @see #getBinaryProperty()
	 * @generated
	 */
	EReference getBinaryProperty_Right();

	/**
	 * Returns the meta object for class '{@link property.BooleanProperty <em>Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Property</em>'.
	 * @see property.BooleanProperty
	 * @generated
	 */
	EClass getBooleanProperty();

	/**
	 * Returns the meta object for class '{@link property.AlwaysProperty <em>Always Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always Property</em>'.
	 * @see property.AlwaysProperty
	 * @generated
	 */
	EClass getAlwaysProperty();

	/**
	 * Returns the meta object for class '{@link property.NeverBooleanProperty <em>Never Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Never Boolean Property</em>'.
	 * @see property.NeverBooleanProperty
	 * @generated
	 */
	EClass getNeverBooleanProperty();

	/**
	 * Returns the meta object for class '{@link property.NeverSequenceProperty <em>Never Sequence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Never Sequence Property</em>'.
	 * @see property.NeverSequenceProperty
	 * @generated
	 */
	EClass getNeverSequenceProperty();

	/**
	 * Returns the meta object for class '{@link property.SequenceProperty <em>Sequence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Property</em>'.
	 * @see property.SequenceProperty
	 * @generated
	 */
	EClass getSequenceProperty();

	/**
	 * Returns the meta object for class '{@link property.SequenceTightProperty <em>Sequence Tight Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Tight Property</em>'.
	 * @see property.SequenceTightProperty
	 * @generated
	 */
	EClass getSequenceTightProperty();

	/**
	 * Returns the meta object for class '{@link property.NextEProperty <em>Next EProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next EProperty</em>'.
	 * @see property.NextEProperty
	 * @generated
	 */
	EClass getNextEProperty();

	/**
	 * Returns the meta object for class '{@link property.NextEventAProperty <em>Next Event AProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Event AProperty</em>'.
	 * @see property.NextEventAProperty
	 * @generated
	 */
	EClass getNextEventAProperty();

	/**
	 * Returns the meta object for the containment reference '{@link property.NextEventAProperty#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see property.NextEventAProperty#getRange()
	 * @see #getNextEventAProperty()
	 * @generated
	 */
	EReference getNextEventAProperty_Range();

	/**
	 * Returns the meta object for class '{@link property.EventuallyBooleanProperty <em>Eventually Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eventually Boolean Property</em>'.
	 * @see property.EventuallyBooleanProperty
	 * @generated
	 */
	EClass getEventuallyBooleanProperty();

	/**
	 * Returns the meta object for class '{@link property.EventuallySequenceProperty <em>Eventually Sequence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eventually Sequence Property</em>'.
	 * @see property.EventuallySequenceProperty
	 * @generated
	 */
	EClass getEventuallySequenceProperty();

	/**
	 * Returns the meta object for class '{@link property.AndProperty <em>And Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Property</em>'.
	 * @see property.AndProperty
	 * @generated
	 */
	EClass getAndProperty();

	/**
	 * Returns the meta object for class '{@link property.AbortProperty <em>Abort Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abort Property</em>'.
	 * @see property.AbortProperty
	 * @generated
	 */
	EClass getAbortProperty();

	/**
	 * Returns the meta object for class '{@link property.OrPropertyBooleanProperty <em>Or Property Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Property Boolean Property</em>'.
	 * @see property.OrPropertyBooleanProperty
	 * @generated
	 */
	EClass getOrPropertyBooleanProperty();

	/**
	 * Returns the meta object for class '{@link property.OrBooleanPropertyProperty <em>Or Boolean Property Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Boolean Property Property</em>'.
	 * @see property.OrBooleanPropertyProperty
	 * @generated
	 */
	EClass getOrBooleanPropertyProperty();

	/**
	 * Returns the meta object for class '{@link property.ImpliesProperty <em>Implies Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Property</em>'.
	 * @see property.ImpliesProperty
	 * @generated
	 */
	EClass getImpliesProperty();

	/**
	 * Returns the meta object for class '{@link property.SuffixImplicationProperty <em>Suffix Implication Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suffix Implication Property</em>'.
	 * @see property.SuffixImplicationProperty
	 * @generated
	 */
	EClass getSuffixImplicationProperty();

	/**
	 * Returns the meta object for class '{@link property.OverlappingSuffixImplicationProperty <em>Overlapping Suffix Implication Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlapping Suffix Implication Property</em>'.
	 * @see property.OverlappingSuffixImplicationProperty
	 * @generated
	 */
	EClass getOverlappingSuffixImplicationProperty();

	/**
	 * Returns the meta object for class '{@link property.EquivalenceProperty <em>Equivalence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalence Property</em>'.
	 * @see property.EquivalenceProperty
	 * @generated
	 */
	EClass getEquivalenceProperty();

	/**
	 * Returns the meta object for class '{@link property.UntilProperty <em>Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Until Property</em>'.
	 * @see property.UntilProperty
	 * @generated
	 */
	EClass getUntilProperty();

	/**
	 * Returns the meta object for class '{@link property.BeforeProperty <em>Before Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before Property</em>'.
	 * @see property.BeforeProperty
	 * @generated
	 */
	EClass getBeforeProperty();

	/**
	 * Returns the meta object for class '{@link property.OverlappingUntilProperty <em>Overlapping Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlapping Until Property</em>'.
	 * @see property.OverlappingUntilProperty
	 * @generated
	 */
	EClass getOverlappingUntilProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertyFactory getPropertyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link property.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.DocumentImpl
		 * @see property.impl.PropertyPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Owned Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__OWNED_IMPORTS = eINSTANCE.getDocument_OwnedImports();

		/**
		 * The meta object literal for the '<em><b>Owned Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__OWNED_PROPERTIES = eINSTANCE.getDocument_OwnedProperties();

		/**
		 * The meta object literal for the '{@link property.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.ImportImpl
		 * @see property.impl.PropertyPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '{@link property.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.PropertyImpl
		 * @see property.impl.PropertyPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link property.impl.UnaryPropertyImpl <em>Unary Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.UnaryPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getUnaryProperty()
		 * @generated
		 */
		EClass UNARY_PROPERTY = eINSTANCE.getUnaryProperty();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_PROPERTY__OPERAND = eINSTANCE.getUnaryProperty_Operand();

		/**
		 * The meta object literal for the '{@link property.impl.BinaryPropertyImpl <em>Binary Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.BinaryPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getBinaryProperty()
		 * @generated
		 */
		EClass BINARY_PROPERTY = eINSTANCE.getBinaryProperty();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_PROPERTY__LEFT = eINSTANCE.getBinaryProperty_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_PROPERTY__RIGHT = eINSTANCE.getBinaryProperty_Right();

		/**
		 * The meta object literal for the '{@link property.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.BooleanPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getBooleanProperty()
		 * @generated
		 */
		EClass BOOLEAN_PROPERTY = eINSTANCE.getBooleanProperty();

		/**
		 * The meta object literal for the '{@link property.impl.AlwaysPropertyImpl <em>Always Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.AlwaysPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getAlwaysProperty()
		 * @generated
		 */
		EClass ALWAYS_PROPERTY = eINSTANCE.getAlwaysProperty();

		/**
		 * The meta object literal for the '{@link property.impl.NeverBooleanPropertyImpl <em>Never Boolean Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.NeverBooleanPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getNeverBooleanProperty()
		 * @generated
		 */
		EClass NEVER_BOOLEAN_PROPERTY = eINSTANCE.getNeverBooleanProperty();

		/**
		 * The meta object literal for the '{@link property.impl.NeverSequencePropertyImpl <em>Never Sequence Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.NeverSequencePropertyImpl
		 * @see property.impl.PropertyPackageImpl#getNeverSequenceProperty()
		 * @generated
		 */
		EClass NEVER_SEQUENCE_PROPERTY = eINSTANCE.getNeverSequenceProperty();

		/**
		 * The meta object literal for the '{@link property.impl.SequencePropertyImpl <em>Sequence Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.SequencePropertyImpl
		 * @see property.impl.PropertyPackageImpl#getSequenceProperty()
		 * @generated
		 */
		EClass SEQUENCE_PROPERTY = eINSTANCE.getSequenceProperty();

		/**
		 * The meta object literal for the '{@link property.impl.SequenceTightPropertyImpl <em>Sequence Tight Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.SequenceTightPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getSequenceTightProperty()
		 * @generated
		 */
		EClass SEQUENCE_TIGHT_PROPERTY = eINSTANCE.getSequenceTightProperty();

		/**
		 * The meta object literal for the '{@link property.impl.NextEPropertyImpl <em>Next EProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.NextEPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getNextEProperty()
		 * @generated
		 */
		EClass NEXT_EPROPERTY = eINSTANCE.getNextEProperty();

		/**
		 * The meta object literal for the '{@link property.impl.NextEventAPropertyImpl <em>Next Event AProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.NextEventAPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getNextEventAProperty()
		 * @generated
		 */
		EClass NEXT_EVENT_APROPERTY = eINSTANCE.getNextEventAProperty();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT_EVENT_APROPERTY__RANGE = eINSTANCE.getNextEventAProperty_Range();

		/**
		 * The meta object literal for the '{@link property.impl.EventuallyBooleanPropertyImpl <em>Eventually Boolean Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.EventuallyBooleanPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getEventuallyBooleanProperty()
		 * @generated
		 */
		EClass EVENTUALLY_BOOLEAN_PROPERTY = eINSTANCE.getEventuallyBooleanProperty();

		/**
		 * The meta object literal for the '{@link property.impl.EventuallySequencePropertyImpl <em>Eventually Sequence Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.EventuallySequencePropertyImpl
		 * @see property.impl.PropertyPackageImpl#getEventuallySequenceProperty()
		 * @generated
		 */
		EClass EVENTUALLY_SEQUENCE_PROPERTY = eINSTANCE.getEventuallySequenceProperty();

		/**
		 * The meta object literal for the '{@link property.impl.AndPropertyImpl <em>And Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.AndPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getAndProperty()
		 * @generated
		 */
		EClass AND_PROPERTY = eINSTANCE.getAndProperty();

		/**
		 * The meta object literal for the '{@link property.impl.AbortPropertyImpl <em>Abort Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.AbortPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getAbortProperty()
		 * @generated
		 */
		EClass ABORT_PROPERTY = eINSTANCE.getAbortProperty();

		/**
		 * The meta object literal for the '{@link property.impl.OrPropertyBooleanPropertyImpl <em>Or Property Boolean Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.OrPropertyBooleanPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getOrPropertyBooleanProperty()
		 * @generated
		 */
		EClass OR_PROPERTY_BOOLEAN_PROPERTY = eINSTANCE.getOrPropertyBooleanProperty();

		/**
		 * The meta object literal for the '{@link property.impl.OrBooleanPropertyPropertyImpl <em>Or Boolean Property Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.OrBooleanPropertyPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getOrBooleanPropertyProperty()
		 * @generated
		 */
		EClass OR_BOOLEAN_PROPERTY_PROPERTY = eINSTANCE.getOrBooleanPropertyProperty();

		/**
		 * The meta object literal for the '{@link property.impl.ImpliesPropertyImpl <em>Implies Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.ImpliesPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getImpliesProperty()
		 * @generated
		 */
		EClass IMPLIES_PROPERTY = eINSTANCE.getImpliesProperty();

		/**
		 * The meta object literal for the '{@link property.impl.SuffixImplicationPropertyImpl <em>Suffix Implication Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.SuffixImplicationPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getSuffixImplicationProperty()
		 * @generated
		 */
		EClass SUFFIX_IMPLICATION_PROPERTY = eINSTANCE.getSuffixImplicationProperty();

		/**
		 * The meta object literal for the '{@link property.impl.OverlappingSuffixImplicationPropertyImpl <em>Overlapping Suffix Implication Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.OverlappingSuffixImplicationPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getOverlappingSuffixImplicationProperty()
		 * @generated
		 */
		EClass OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY = eINSTANCE.getOverlappingSuffixImplicationProperty();

		/**
		 * The meta object literal for the '{@link property.impl.EquivalencePropertyImpl <em>Equivalence Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.EquivalencePropertyImpl
		 * @see property.impl.PropertyPackageImpl#getEquivalenceProperty()
		 * @generated
		 */
		EClass EQUIVALENCE_PROPERTY = eINSTANCE.getEquivalenceProperty();

		/**
		 * The meta object literal for the '{@link property.impl.UntilPropertyImpl <em>Until Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.UntilPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getUntilProperty()
		 * @generated
		 */
		EClass UNTIL_PROPERTY = eINSTANCE.getUntilProperty();

		/**
		 * The meta object literal for the '{@link property.impl.BeforePropertyImpl <em>Before Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.BeforePropertyImpl
		 * @see property.impl.PropertyPackageImpl#getBeforeProperty()
		 * @generated
		 */
		EClass BEFORE_PROPERTY = eINSTANCE.getBeforeProperty();

		/**
		 * The meta object literal for the '{@link property.impl.OverlappingUntilPropertyImpl <em>Overlapping Until Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.OverlappingUntilPropertyImpl
		 * @see property.impl.PropertyPackageImpl#getOverlappingUntilProperty()
		 * @generated
		 */
		EClass OVERLAPPING_UNTIL_PROPERTY = eINSTANCE.getOverlappingUntilProperty();

	}

} //PropertyPackage
