/**
 */
package property.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import property.AbortProperty;
import property.AlwaysProperty;
import property.AndProperty;
import property.BeforeProperty;
import property.BinaryProperty;
import property.BooleanProperty;
import property.Document;
import property.EquivalenceProperty;
import property.EventuallyBooleanProperty;
import property.EventuallySequenceProperty;
import property.ImpliesProperty;
import property.Import;
import property.NeverBooleanProperty;
import property.NeverSequenceProperty;
import property.NextEProperty;
import property.NextEventAProperty;
import property.OrBooleanPropertyProperty;
import property.OrPropertyBooleanProperty;
import property.OverlappingSuffixImplicationProperty;
import property.OverlappingUntilProperty;
import property.Property;
import property.PropertyFactory;
import property.PropertyPackage;
import property.SequenceProperty;
import property.SequenceTightProperty;
import property.SuffixImplicationProperty;
import property.UnaryProperty;
import property.UntilProperty;

import sequence.SequencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyPackageImpl extends EPackageImpl implements PropertyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alwaysPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neverBooleanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neverSequencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTightPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextEPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextEventAPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventuallyBooleanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventuallySequencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abortPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orPropertyBooleanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orBooleanPropertyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliesPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suffixImplicationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlappingSuffixImplicationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untilPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beforePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlappingUntilPropertyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see property.PropertyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PropertyPackageImpl() {
		super(eNS_URI, PropertyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PropertyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PropertyPackage init() {
		if (isInited) return (PropertyPackage)EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);

		// Obtain or create and register package
		PropertyPackageImpl thePropertyPackage = (PropertyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PropertyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PropertyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		SequencePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePropertyPackage.createPackageContents();

		// Initialize created meta-data
		thePropertyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePropertyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PropertyPackage.eNS_URI, thePropertyPackage);
		return thePropertyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_OwnedImports() {
		return (EReference)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_OwnedProperties() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryProperty() {
		return unaryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryProperty_Operand() {
		return (EReference)unaryPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryProperty() {
		return binaryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryProperty_Left() {
		return (EReference)binaryPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryProperty_Right() {
		return (EReference)binaryPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanProperty() {
		return booleanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlwaysProperty() {
		return alwaysPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeverBooleanProperty() {
		return neverBooleanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeverSequenceProperty() {
		return neverSequencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceProperty() {
		return sequencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceTightProperty() {
		return sequenceTightPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextEProperty() {
		return nextEPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextEventAProperty() {
		return nextEventAPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextEventAProperty_Range() {
		return (EReference)nextEventAPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventuallyBooleanProperty() {
		return eventuallyBooleanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventuallySequenceProperty() {
		return eventuallySequencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndProperty() {
		return andPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbortProperty() {
		return abortPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrPropertyBooleanProperty() {
		return orPropertyBooleanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrBooleanPropertyProperty() {
		return orBooleanPropertyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpliesProperty() {
		return impliesPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuffixImplicationProperty() {
		return suffixImplicationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlappingSuffixImplicationProperty() {
		return overlappingSuffixImplicationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalenceProperty() {
		return equivalencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUntilProperty() {
		return untilPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeforeProperty() {
		return beforePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlappingUntilProperty() {
		return overlappingUntilPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFactory getPropertyFactory() {
		return (PropertyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__OWNED_IMPORTS);
		createEReference(documentEClass, DOCUMENT__OWNED_PROPERTIES);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);

		propertyEClass = createEClass(PROPERTY);

		unaryPropertyEClass = createEClass(UNARY_PROPERTY);
		createEReference(unaryPropertyEClass, UNARY_PROPERTY__OPERAND);

		binaryPropertyEClass = createEClass(BINARY_PROPERTY);
		createEReference(binaryPropertyEClass, BINARY_PROPERTY__LEFT);
		createEReference(binaryPropertyEClass, BINARY_PROPERTY__RIGHT);

		booleanPropertyEClass = createEClass(BOOLEAN_PROPERTY);

		alwaysPropertyEClass = createEClass(ALWAYS_PROPERTY);

		neverBooleanPropertyEClass = createEClass(NEVER_BOOLEAN_PROPERTY);

		neverSequencePropertyEClass = createEClass(NEVER_SEQUENCE_PROPERTY);

		sequencePropertyEClass = createEClass(SEQUENCE_PROPERTY);

		sequenceTightPropertyEClass = createEClass(SEQUENCE_TIGHT_PROPERTY);

		nextEPropertyEClass = createEClass(NEXT_EPROPERTY);

		nextEventAPropertyEClass = createEClass(NEXT_EVENT_APROPERTY);
		createEReference(nextEventAPropertyEClass, NEXT_EVENT_APROPERTY__RANGE);

		eventuallyBooleanPropertyEClass = createEClass(EVENTUALLY_BOOLEAN_PROPERTY);

		eventuallySequencePropertyEClass = createEClass(EVENTUALLY_SEQUENCE_PROPERTY);

		andPropertyEClass = createEClass(AND_PROPERTY);

		abortPropertyEClass = createEClass(ABORT_PROPERTY);

		orPropertyBooleanPropertyEClass = createEClass(OR_PROPERTY_BOOLEAN_PROPERTY);

		orBooleanPropertyPropertyEClass = createEClass(OR_BOOLEAN_PROPERTY_PROPERTY);

		impliesPropertyEClass = createEClass(IMPLIES_PROPERTY);

		suffixImplicationPropertyEClass = createEClass(SUFFIX_IMPLICATION_PROPERTY);

		overlappingSuffixImplicationPropertyEClass = createEClass(OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY);

		equivalencePropertyEClass = createEClass(EQUIVALENCE_PROPERTY);

		untilPropertyEClass = createEClass(UNTIL_PROPERTY);

		beforePropertyEClass = createEClass(BEFORE_PROPERTY);

		overlappingUntilPropertyEClass = createEClass(OVERLAPPING_UNTIL_PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SequencePackage theSequencePackage = (SequencePackage)EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI);

		// Create type parameters
		ETypeParameter unaryPropertyEClass_O = addETypeParameter(unaryPropertyEClass, "O");
		ETypeParameter binaryPropertyEClass_L = addETypeParameter(binaryPropertyEClass, "L");
		ETypeParameter binaryPropertyEClass_R = addETypeParameter(binaryPropertyEClass, "R");

		// Set bounds for type parameters

		// Add supertypes to classes
		unaryPropertyEClass.getESuperTypes().add(this.getProperty());
		binaryPropertyEClass.getESuperTypes().add(this.getProperty());
		EGenericType g1 = createEGenericType(this.getUnaryProperty());
		EGenericType g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		booleanPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryProperty());
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		alwaysPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		neverBooleanPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequence());
		g1.getETypeArguments().add(g2);
		neverSequencePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequence());
		g1.getETypeArguments().add(g2);
		sequencePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequence());
		g1.getETypeArguments().add(g2);
		sequenceTightPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		nextEPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		nextEventAPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		eventuallyBooleanPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequence());
		g1.getETypeArguments().add(g2);
		eventuallySequencePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		andPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		abortPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		orPropertyBooleanPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		orBooleanPropertyPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		impliesPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		suffixImplicationPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequence());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		overlappingSuffixImplicationPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		equivalencePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		untilPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		beforePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryProperty());
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theSequencePackage.getSequenceTerminal());
		g1.getETypeArguments().add(g2);
		overlappingUntilPropertyEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_OwnedImports(), this.getImport(), null, "ownedImports", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_OwnedProperties(), this.getProperty(), null, "ownedProperties", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryPropertyEClass, UnaryProperty.class, "UnaryProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(unaryPropertyEClass_O);
		initEReference(getUnaryProperty_Operand(), g1, null, "operand", null, 0, 1, UnaryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryPropertyEClass, BinaryProperty.class, "BinaryProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(binaryPropertyEClass_L);
		initEReference(getBinaryProperty_Left(), g1, null, "left", null, 0, 1, BinaryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(binaryPropertyEClass_R);
		initEReference(getBinaryProperty_Right(), g1, null, "right", null, 0, 1, BinaryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanPropertyEClass, BooleanProperty.class, "BooleanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alwaysPropertyEClass, AlwaysProperty.class, "AlwaysProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(neverBooleanPropertyEClass, NeverBooleanProperty.class, "NeverBooleanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(neverSequencePropertyEClass, NeverSequenceProperty.class, "NeverSequenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequencePropertyEClass, SequenceProperty.class, "SequenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceTightPropertyEClass, SequenceTightProperty.class, "SequenceTightProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nextEPropertyEClass, NextEProperty.class, "NextEProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nextEventAPropertyEClass, NextEventAProperty.class, "NextEventAProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNextEventAProperty_Range(), theSequencePackage.getRange(), null, "range", null, 0, 1, NextEventAProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventuallyBooleanPropertyEClass, EventuallyBooleanProperty.class, "EventuallyBooleanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventuallySequencePropertyEClass, EventuallySequenceProperty.class, "EventuallySequenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andPropertyEClass, AndProperty.class, "AndProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abortPropertyEClass, AbortProperty.class, "AbortProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orPropertyBooleanPropertyEClass, OrPropertyBooleanProperty.class, "OrPropertyBooleanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orBooleanPropertyPropertyEClass, OrBooleanPropertyProperty.class, "OrBooleanPropertyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(impliesPropertyEClass, ImpliesProperty.class, "ImpliesProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suffixImplicationPropertyEClass, SuffixImplicationProperty.class, "SuffixImplicationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(overlappingSuffixImplicationPropertyEClass, OverlappingSuffixImplicationProperty.class, "OverlappingSuffixImplicationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equivalencePropertyEClass, EquivalenceProperty.class, "EquivalenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(untilPropertyEClass, UntilProperty.class, "UntilProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beforePropertyEClass, BeforeProperty.class, "BeforeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(overlappingUntilPropertyEClass, OverlappingUntilProperty.class, "OverlappingUntilProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PropertyPackageImpl
