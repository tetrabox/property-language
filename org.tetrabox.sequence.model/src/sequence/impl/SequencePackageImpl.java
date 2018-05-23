/**
 */
package sequence.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sequence.BinaryCompoundSERE;
import sequence.BooleanConsecutiveRepetition;
import sequence.BooleanCountedConsecutiveRepetition;
import sequence.BooleanCountedGotoRepetition;
import sequence.BooleanCountedNonConsecutiveRepetition;
import sequence.BooleanLiteral;
import sequence.BracedSERE;
import sequence.CompoundSERE;
import sequence.ConcatenationSERE;
import sequence.Count;
import sequence.FusionSERE;
import sequence.LengthOne;
import sequence.NotSequenceTerminal;
import sequence.OCLExpression;
import sequence.Range;
import sequence.RepeatedSERE;
import sequence.SEREAndLM;
import sequence.SEREAndNLM;
import sequence.SEREOr;
import sequence.SEREWithin;
import sequence.Sequence;
import sequence.SequenceConsecutiveRepetition;
import sequence.SequenceCountedConsecutiveRepetition;
import sequence.SequenceFactory;
import sequence.SequencePackage;
import sequence.SequenceTerminal;
import sequence.SimpleSERE;
import sequence.WildCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequencePackageImpl extends EPackageImpl implements SequencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notSequenceTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fusionSEREEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatenationSEREEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSEREEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatedSEREEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wildCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanCountedConsecutiveRepetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConsecutiveRepetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanCountedNonConsecutiveRepetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanCountedGotoRepetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceCountedConsecutiveRepetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceConsecutiveRepetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bracedSEREEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundSEREEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryCompoundSEREEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sereOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sereAndNLMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sereAndLMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sereWithinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

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
	 * @see sequence.SequencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SequencePackageImpl() {
		super(eNS_URI, SequenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SequencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SequencePackage init() {
		if (isInited) return (SequencePackage)EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI);

		// Obtain or create and register package
		SequencePackageImpl theSequencePackage = (SequencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SequencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SequencePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSequencePackage.createPackageContents();

		// Initialize created meta-data
		theSequencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSequencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SequencePackage.eNS_URI, theSequencePackage);
		return theSequencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceTerminal() {
		return sequenceTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLExpression() {
		return oclExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLExpression_Expression() {
		return (EAttribute)oclExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLExpression_Context() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteral_Literal() {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotSequenceTerminal() {
		return notSequenceTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotSequenceTerminal_Literal() {
		return (EReference)notSequenceTerminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSERE() {
		return sereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFusionSERE() {
		return fusionSEREEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFusionSERE_Left() {
		return (EReference)fusionSEREEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFusionSERE_Right() {
		return (EReference)fusionSEREEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcatenationSERE() {
		return concatenationSEREEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcatenationSERE_Left() {
		return (EReference)concatenationSEREEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcatenationSERE_Right() {
		return (EReference)concatenationSEREEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSERE() {
		return simpleSEREEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatedSERE() {
		return repeatedSEREEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWildCard() {
		return wildCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWildCard_Count() {
		return (EReference)wildCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthOne() {
		return lengthOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanCountedConsecutiveRepetition() {
		return booleanCountedConsecutiveRepetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanCountedConsecutiveRepetition_Expression() {
		return (EReference)booleanCountedConsecutiveRepetitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanCountedConsecutiveRepetition_Count() {
		return (EReference)booleanCountedConsecutiveRepetitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanConsecutiveRepetition() {
		return booleanConsecutiveRepetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanConsecutiveRepetition_Expression() {
		return (EReference)booleanConsecutiveRepetitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanCountedNonConsecutiveRepetition() {
		return booleanCountedNonConsecutiveRepetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanCountedNonConsecutiveRepetition_Expression() {
		return (EReference)booleanCountedNonConsecutiveRepetitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanCountedNonConsecutiveRepetition_Count() {
		return (EReference)booleanCountedNonConsecutiveRepetitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanCountedGotoRepetition() {
		return booleanCountedGotoRepetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanCountedGotoRepetition_Expression() {
		return (EReference)booleanCountedGotoRepetitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanCountedGotoRepetition_Count() {
		return (EReference)booleanCountedGotoRepetitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceCountedConsecutiveRepetition() {
		return sequenceCountedConsecutiveRepetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceCountedConsecutiveRepetition_Expression() {
		return (EReference)sequenceCountedConsecutiveRepetitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceCountedConsecutiveRepetition_Count() {
		return (EReference)sequenceCountedConsecutiveRepetitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceConsecutiveRepetition() {
		return sequenceConsecutiveRepetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceConsecutiveRepetition_Expression() {
		return (EReference)sequenceConsecutiveRepetitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBracedSERE() {
		return bracedSEREEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBracedSERE_Expression() {
		return (EReference)bracedSEREEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundSERE() {
		return compoundSEREEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryCompoundSERE() {
		return binaryCompoundSEREEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCompoundSERE_Left() {
		return (EReference)binaryCompoundSEREEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCompoundSERE_Right() {
		return (EReference)binaryCompoundSEREEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEREOr() {
		return sereOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEREAndNLM() {
		return sereAndNLMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEREAndLM() {
		return sereAndLMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEREWithin() {
		return sereWithinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCount() {
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCount_COUNT() {
		return (EAttribute)countEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_LOWER_BOUND() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_HIGHER_BOUND() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFactory getSequenceFactory() {
		return (SequenceFactory)getEFactoryInstance();
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
		sequenceTerminalEClass = createEClass(SEQUENCE_TERMINAL);

		oclExpressionEClass = createEClass(OCL_EXPRESSION);
		createEAttribute(oclExpressionEClass, OCL_EXPRESSION__EXPRESSION);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__CONTEXT);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__LITERAL);

		notSequenceTerminalEClass = createEClass(NOT_SEQUENCE_TERMINAL);
		createEReference(notSequenceTerminalEClass, NOT_SEQUENCE_TERMINAL__LITERAL);

		sereEClass = createEClass(SERE);

		fusionSEREEClass = createEClass(FUSION_SERE);
		createEReference(fusionSEREEClass, FUSION_SERE__LEFT);
		createEReference(fusionSEREEClass, FUSION_SERE__RIGHT);

		concatenationSEREEClass = createEClass(CONCATENATION_SERE);
		createEReference(concatenationSEREEClass, CONCATENATION_SERE__LEFT);
		createEReference(concatenationSEREEClass, CONCATENATION_SERE__RIGHT);

		simpleSEREEClass = createEClass(SIMPLE_SERE);

		sequenceEClass = createEClass(SEQUENCE);

		repeatedSEREEClass = createEClass(REPEATED_SERE);

		wildCardEClass = createEClass(WILD_CARD);
		createEReference(wildCardEClass, WILD_CARD__COUNT);

		lengthOneEClass = createEClass(LENGTH_ONE);

		booleanCountedConsecutiveRepetitionEClass = createEClass(BOOLEAN_COUNTED_CONSECUTIVE_REPETITION);
		createEReference(booleanCountedConsecutiveRepetitionEClass, BOOLEAN_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION);
		createEReference(booleanCountedConsecutiveRepetitionEClass, BOOLEAN_COUNTED_CONSECUTIVE_REPETITION__COUNT);

		booleanConsecutiveRepetitionEClass = createEClass(BOOLEAN_CONSECUTIVE_REPETITION);
		createEReference(booleanConsecutiveRepetitionEClass, BOOLEAN_CONSECUTIVE_REPETITION__EXPRESSION);

		booleanCountedNonConsecutiveRepetitionEClass = createEClass(BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION);
		createEReference(booleanCountedNonConsecutiveRepetitionEClass, BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__EXPRESSION);
		createEReference(booleanCountedNonConsecutiveRepetitionEClass, BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__COUNT);

		booleanCountedGotoRepetitionEClass = createEClass(BOOLEAN_COUNTED_GOTO_REPETITION);
		createEReference(booleanCountedGotoRepetitionEClass, BOOLEAN_COUNTED_GOTO_REPETITION__EXPRESSION);
		createEReference(booleanCountedGotoRepetitionEClass, BOOLEAN_COUNTED_GOTO_REPETITION__COUNT);

		sequenceCountedConsecutiveRepetitionEClass = createEClass(SEQUENCE_COUNTED_CONSECUTIVE_REPETITION);
		createEReference(sequenceCountedConsecutiveRepetitionEClass, SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION);
		createEReference(sequenceCountedConsecutiveRepetitionEClass, SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT);

		sequenceConsecutiveRepetitionEClass = createEClass(SEQUENCE_CONSECUTIVE_REPETITION);
		createEReference(sequenceConsecutiveRepetitionEClass, SEQUENCE_CONSECUTIVE_REPETITION__EXPRESSION);

		bracedSEREEClass = createEClass(BRACED_SERE);
		createEReference(bracedSEREEClass, BRACED_SERE__EXPRESSION);

		compoundSEREEClass = createEClass(COMPOUND_SERE);

		binaryCompoundSEREEClass = createEClass(BINARY_COMPOUND_SERE);
		createEReference(binaryCompoundSEREEClass, BINARY_COMPOUND_SERE__LEFT);
		createEReference(binaryCompoundSEREEClass, BINARY_COMPOUND_SERE__RIGHT);

		sereOrEClass = createEClass(SERE_OR);

		sereAndNLMEClass = createEClass(SERE_AND_NLM);

		sereAndLMEClass = createEClass(SERE_AND_LM);

		sereWithinEClass = createEClass(SERE_WITHIN);

		countEClass = createEClass(COUNT);
		createEAttribute(countEClass, COUNT__COUNT);

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__LOWER_BOUND);
		createEAttribute(rangeEClass, RANGE__HIGHER_BOUND);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sequenceTerminalEClass.getESuperTypes().add(this.getSimpleSERE());
		oclExpressionEClass.getESuperTypes().add(this.getSequenceTerminal());
		booleanLiteralEClass.getESuperTypes().add(this.getSequenceTerminal());
		notSequenceTerminalEClass.getESuperTypes().add(this.getSequenceTerminal());
		fusionSEREEClass.getESuperTypes().add(this.getSERE());
		concatenationSEREEClass.getESuperTypes().add(this.getSERE());
		simpleSEREEClass.getESuperTypes().add(this.getSERE());
		sequenceEClass.getESuperTypes().add(this.getSimpleSERE());
		repeatedSEREEClass.getESuperTypes().add(this.getSequence());
		repeatedSEREEClass.getESuperTypes().add(this.getCompoundSERE());
		wildCardEClass.getESuperTypes().add(this.getRepeatedSERE());
		lengthOneEClass.getESuperTypes().add(this.getRepeatedSERE());
		booleanCountedConsecutiveRepetitionEClass.getESuperTypes().add(this.getRepeatedSERE());
		booleanConsecutiveRepetitionEClass.getESuperTypes().add(this.getRepeatedSERE());
		booleanCountedNonConsecutiveRepetitionEClass.getESuperTypes().add(this.getRepeatedSERE());
		booleanCountedGotoRepetitionEClass.getESuperTypes().add(this.getRepeatedSERE());
		sequenceCountedConsecutiveRepetitionEClass.getESuperTypes().add(this.getRepeatedSERE());
		sequenceConsecutiveRepetitionEClass.getESuperTypes().add(this.getRepeatedSERE());
		bracedSEREEClass.getESuperTypes().add(this.getSequence());
		bracedSEREEClass.getESuperTypes().add(this.getCompoundSERE());
		compoundSEREEClass.getESuperTypes().add(this.getSimpleSERE());
		binaryCompoundSEREEClass.getESuperTypes().add(this.getCompoundSERE());
		sereOrEClass.getESuperTypes().add(this.getBinaryCompoundSERE());
		sereAndNLMEClass.getESuperTypes().add(this.getBinaryCompoundSERE());
		sereAndLMEClass.getESuperTypes().add(this.getBinaryCompoundSERE());
		sereWithinEClass.getESuperTypes().add(this.getBinaryCompoundSERE());
		rangeEClass.getESuperTypes().add(this.getCount());

		// Initialize classes, features, and operations; add parameters
		initEClass(sequenceTerminalEClass, SequenceTerminal.class, "SequenceTerminal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclExpressionEClass, OCLExpression.class, "OCLExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, OCLExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOCLExpression_Context(), theEcorePackage.getEClass(), null, "context", null, 0, 1, OCLExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Literal(), ecorePackage.getEBoolean(), "literal", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notSequenceTerminalEClass, NotSequenceTerminal.class, "NotSequenceTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotSequenceTerminal_Literal(), this.getSequenceTerminal(), null, "literal", null, 0, 1, NotSequenceTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sereEClass, sequence.SERE.class, "SERE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fusionSEREEClass, FusionSERE.class, "FusionSERE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFusionSERE_Left(), this.getSimpleSERE(), null, "left", null, 0, 1, FusionSERE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFusionSERE_Right(), this.getSERE(), null, "right", null, 0, 1, FusionSERE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concatenationSEREEClass, ConcatenationSERE.class, "ConcatenationSERE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcatenationSERE_Left(), this.getSimpleSERE(), null, "left", null, 0, 1, ConcatenationSERE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcatenationSERE_Right(), this.getSERE(), null, "right", null, 0, 1, ConcatenationSERE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSEREEClass, SimpleSERE.class, "SimpleSERE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceEClass, Sequence.class, "Sequence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatedSEREEClass, RepeatedSERE.class, "RepeatedSERE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wildCardEClass, WildCard.class, "WildCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWildCard_Count(), this.getCount(), null, "count", null, 0, 1, WildCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthOneEClass, LengthOne.class, "LengthOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanCountedConsecutiveRepetitionEClass, BooleanCountedConsecutiveRepetition.class, "BooleanCountedConsecutiveRepetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanCountedConsecutiveRepetition_Expression(), this.getSequenceTerminal(), null, "expression", null, 0, 1, BooleanCountedConsecutiveRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanCountedConsecutiveRepetition_Count(), this.getCount(), null, "count", null, 0, 1, BooleanCountedConsecutiveRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanConsecutiveRepetitionEClass, BooleanConsecutiveRepetition.class, "BooleanConsecutiveRepetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanConsecutiveRepetition_Expression(), this.getSequenceTerminal(), null, "expression", null, 0, 1, BooleanConsecutiveRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanCountedNonConsecutiveRepetitionEClass, BooleanCountedNonConsecutiveRepetition.class, "BooleanCountedNonConsecutiveRepetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanCountedNonConsecutiveRepetition_Expression(), this.getSequenceTerminal(), null, "expression", null, 0, 1, BooleanCountedNonConsecutiveRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanCountedNonConsecutiveRepetition_Count(), this.getCount(), null, "count", null, 0, 1, BooleanCountedNonConsecutiveRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanCountedGotoRepetitionEClass, BooleanCountedGotoRepetition.class, "BooleanCountedGotoRepetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanCountedGotoRepetition_Expression(), this.getSequenceTerminal(), null, "expression", null, 0, 1, BooleanCountedGotoRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanCountedGotoRepetition_Count(), this.getCount(), null, "count", null, 0, 1, BooleanCountedGotoRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceCountedConsecutiveRepetitionEClass, SequenceCountedConsecutiveRepetition.class, "SequenceCountedConsecutiveRepetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceCountedConsecutiveRepetition_Expression(), this.getSequence(), null, "expression", null, 0, 1, SequenceCountedConsecutiveRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceCountedConsecutiveRepetition_Count(), this.getCount(), null, "count", null, 0, 1, SequenceCountedConsecutiveRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceConsecutiveRepetitionEClass, SequenceConsecutiveRepetition.class, "SequenceConsecutiveRepetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceConsecutiveRepetition_Expression(), this.getSequence(), null, "expression", null, 0, 1, SequenceConsecutiveRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bracedSEREEClass, BracedSERE.class, "BracedSERE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBracedSERE_Expression(), this.getSERE(), null, "expression", null, 0, 1, BracedSERE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundSEREEClass, CompoundSERE.class, "CompoundSERE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryCompoundSEREEClass, BinaryCompoundSERE.class, "BinaryCompoundSERE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryCompoundSERE_Left(), this.getCompoundSERE(), null, "left", null, 0, 1, BinaryCompoundSERE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCompoundSERE_Right(), this.getCompoundSERE(), null, "right", null, 0, 1, BinaryCompoundSERE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sereOrEClass, SEREOr.class, "SEREOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sereAndNLMEClass, SEREAndNLM.class, "SEREAndNLM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sereAndLMEClass, SEREAndLM.class, "SEREAndLM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sereWithinEClass, SEREWithin.class, "SEREWithin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCount_COUNT(), ecorePackage.getEInt(), "COUNT", null, 0, 1, Count.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_LOWER_BOUND(), ecorePackage.getEInt(), "LOWER_BOUND", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_HIGHER_BOUND(), ecorePackage.getEInt(), "HIGHER_BOUND", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SequencePackageImpl
