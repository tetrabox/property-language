/**
 */
package property.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import property.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyFactoryImpl extends EFactoryImpl implements PropertyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertyFactory init() {
		try {
			PropertyFactory thePropertyFactory = (PropertyFactory)EPackage.Registry.INSTANCE.getEFactory(PropertyPackage.eNS_URI);
			if (thePropertyFactory != null) {
				return thePropertyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PropertyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PropertyPackage.DOCUMENT: return createDocument();
			case PropertyPackage.IMPORT: return createImport();
			case PropertyPackage.BOOLEAN_PROPERTY: return createBooleanProperty();
			case PropertyPackage.ALWAYS_PROPERTY: return createAlwaysProperty();
			case PropertyPackage.NEVER_BOOLEAN_PROPERTY: return createNeverBooleanProperty();
			case PropertyPackage.NEVER_SEQUENCE_PROPERTY: return createNeverSequenceProperty();
			case PropertyPackage.SEQUENCE_PROPERTY: return createSequenceProperty();
			case PropertyPackage.SEQUENCE_TIGHT_PROPERTY: return createSequenceTightProperty();
			case PropertyPackage.NEXT_EPROPERTY: return createNextEProperty();
			case PropertyPackage.NEXT_EVENT_APROPERTY: return createNextEventAProperty();
			case PropertyPackage.EVENTUALLY_BOOLEAN_PROPERTY: return createEventuallyBooleanProperty();
			case PropertyPackage.EVENTUALLY_SEQUENCE_PROPERTY: return createEventuallySequenceProperty();
			case PropertyPackage.AND_PROPERTY: return createAndProperty();
			case PropertyPackage.ABORT_PROPERTY: return createAbortProperty();
			case PropertyPackage.OR_PROPERTY_BOOLEAN_PROPERTY: return createOrPropertyBooleanProperty();
			case PropertyPackage.OR_BOOLEAN_PROPERTY_PROPERTY: return createOrBooleanPropertyProperty();
			case PropertyPackage.IMPLIES_PROPERTY: return createImpliesProperty();
			case PropertyPackage.SUFFIX_IMPLICATION_PROPERTY: return createSuffixImplicationProperty();
			case PropertyPackage.OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY: return createOverlappingSuffixImplicationProperty();
			case PropertyPackage.EQUIVALENCE_PROPERTY: return createEquivalenceProperty();
			case PropertyPackage.UNTIL_PROPERTY: return createUntilProperty();
			case PropertyPackage.BEFORE_PROPERTY: return createBeforeProperty();
			case PropertyPackage.OVERLAPPING_UNTIL_PROPERTY: return createOverlappingUntilProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanProperty createBooleanProperty() {
		BooleanPropertyImpl booleanProperty = new BooleanPropertyImpl();
		return booleanProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlwaysProperty createAlwaysProperty() {
		AlwaysPropertyImpl alwaysProperty = new AlwaysPropertyImpl();
		return alwaysProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeverBooleanProperty createNeverBooleanProperty() {
		NeverBooleanPropertyImpl neverBooleanProperty = new NeverBooleanPropertyImpl();
		return neverBooleanProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeverSequenceProperty createNeverSequenceProperty() {
		NeverSequencePropertyImpl neverSequenceProperty = new NeverSequencePropertyImpl();
		return neverSequenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceProperty createSequenceProperty() {
		SequencePropertyImpl sequenceProperty = new SequencePropertyImpl();
		return sequenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTightProperty createSequenceTightProperty() {
		SequenceTightPropertyImpl sequenceTightProperty = new SequenceTightPropertyImpl();
		return sequenceTightProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextEProperty createNextEProperty() {
		NextEPropertyImpl nextEProperty = new NextEPropertyImpl();
		return nextEProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextEventAProperty createNextEventAProperty() {
		NextEventAPropertyImpl nextEventAProperty = new NextEventAPropertyImpl();
		return nextEventAProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventuallyBooleanProperty createEventuallyBooleanProperty() {
		EventuallyBooleanPropertyImpl eventuallyBooleanProperty = new EventuallyBooleanPropertyImpl();
		return eventuallyBooleanProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventuallySequenceProperty createEventuallySequenceProperty() {
		EventuallySequencePropertyImpl eventuallySequenceProperty = new EventuallySequencePropertyImpl();
		return eventuallySequenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndProperty createAndProperty() {
		AndPropertyImpl andProperty = new AndPropertyImpl();
		return andProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbortProperty createAbortProperty() {
		AbortPropertyImpl abortProperty = new AbortPropertyImpl();
		return abortProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrPropertyBooleanProperty createOrPropertyBooleanProperty() {
		OrPropertyBooleanPropertyImpl orPropertyBooleanProperty = new OrPropertyBooleanPropertyImpl();
		return orPropertyBooleanProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrBooleanPropertyProperty createOrBooleanPropertyProperty() {
		OrBooleanPropertyPropertyImpl orBooleanPropertyProperty = new OrBooleanPropertyPropertyImpl();
		return orBooleanPropertyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpliesProperty createImpliesProperty() {
		ImpliesPropertyImpl impliesProperty = new ImpliesPropertyImpl();
		return impliesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuffixImplicationProperty createSuffixImplicationProperty() {
		SuffixImplicationPropertyImpl suffixImplicationProperty = new SuffixImplicationPropertyImpl();
		return suffixImplicationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlappingSuffixImplicationProperty createOverlappingSuffixImplicationProperty() {
		OverlappingSuffixImplicationPropertyImpl overlappingSuffixImplicationProperty = new OverlappingSuffixImplicationPropertyImpl();
		return overlappingSuffixImplicationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalenceProperty createEquivalenceProperty() {
		EquivalencePropertyImpl equivalenceProperty = new EquivalencePropertyImpl();
		return equivalenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UntilProperty createUntilProperty() {
		UntilPropertyImpl untilProperty = new UntilPropertyImpl();
		return untilProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeforeProperty createBeforeProperty() {
		BeforePropertyImpl beforeProperty = new BeforePropertyImpl();
		return beforeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlappingUntilProperty createOverlappingUntilProperty() {
		OverlappingUntilPropertyImpl overlappingUntilProperty = new OverlappingUntilPropertyImpl();
		return overlappingUntilProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyPackage getPropertyPackage() {
		return (PropertyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PropertyPackage getPackage() {
		return PropertyPackage.eINSTANCE;
	}

} //PropertyFactoryImpl
