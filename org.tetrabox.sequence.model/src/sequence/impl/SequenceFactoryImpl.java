/**
 */
package sequence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sequence.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceFactoryImpl extends EFactoryImpl implements SequenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SequenceFactory init() {
		try {
			SequenceFactory theSequenceFactory = (SequenceFactory)EPackage.Registry.INSTANCE.getEFactory(SequencePackage.eNS_URI);
			if (theSequenceFactory != null) {
				return theSequenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SequenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFactoryImpl() {
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
			case SequencePackage.OCL_EXPRESSION: return createOCLExpression();
			case SequencePackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case SequencePackage.NOT_SEQUENCE_TERMINAL: return createNotSequenceTerminal();
			case SequencePackage.FUSION_SERE: return createFusionSERE();
			case SequencePackage.CONCATENATION_SERE: return createConcatenationSERE();
			case SequencePackage.SIMPLE_SERE: return createSimpleSERE();
			case SequencePackage.WILD_CARD: return createWildCard();
			case SequencePackage.LENGTH_ONE: return createLengthOne();
			case SequencePackage.BOOLEAN_COUNTED_CONSECUTIVE_REPETITION: return createBooleanCountedConsecutiveRepetition();
			case SequencePackage.BOOLEAN_CONSECUTIVE_REPETITION: return createBooleanConsecutiveRepetition();
			case SequencePackage.BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION: return createBooleanCountedNonConsecutiveRepetition();
			case SequencePackage.BOOLEAN_COUNTED_GOTO_REPETITION: return createBooleanCountedGotoRepetition();
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION: return createSequenceCountedConsecutiveRepetition();
			case SequencePackage.SEQUENCE_CONSECUTIVE_REPETITION: return createSequenceConsecutiveRepetition();
			case SequencePackage.BRACED_SERE: return createBracedSERE();
			case SequencePackage.COMPOUND_SERE: return createCompoundSERE();
			case SequencePackage.SERE_OR: return createSEREOr();
			case SequencePackage.SERE_AND_NLM: return createSEREAndNLM();
			case SequencePackage.SERE_AND_LM: return createSEREAndLM();
			case SequencePackage.SERE_WITHIN: return createSEREWithin();
			case SequencePackage.COUNT: return createCount();
			case SequencePackage.RANGE: return createRange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpression createOCLExpression() {
		OCLExpressionImpl oclExpression = new OCLExpressionImpl();
		return oclExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotSequenceTerminal createNotSequenceTerminal() {
		NotSequenceTerminalImpl notSequenceTerminal = new NotSequenceTerminalImpl();
		return notSequenceTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FusionSERE createFusionSERE() {
		FusionSEREImpl fusionSERE = new FusionSEREImpl();
		return fusionSERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcatenationSERE createConcatenationSERE() {
		ConcatenationSEREImpl concatenationSERE = new ConcatenationSEREImpl();
		return concatenationSERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSERE createSimpleSERE() {
		SimpleSEREImpl simpleSERE = new SimpleSEREImpl();
		return simpleSERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildCard createWildCard() {
		WildCardImpl wildCard = new WildCardImpl();
		return wildCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthOne createLengthOne() {
		LengthOneImpl lengthOne = new LengthOneImpl();
		return lengthOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanCountedConsecutiveRepetition createBooleanCountedConsecutiveRepetition() {
		BooleanCountedConsecutiveRepetitionImpl booleanCountedConsecutiveRepetition = new BooleanCountedConsecutiveRepetitionImpl();
		return booleanCountedConsecutiveRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConsecutiveRepetition createBooleanConsecutiveRepetition() {
		BooleanConsecutiveRepetitionImpl booleanConsecutiveRepetition = new BooleanConsecutiveRepetitionImpl();
		return booleanConsecutiveRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanCountedNonConsecutiveRepetition createBooleanCountedNonConsecutiveRepetition() {
		BooleanCountedNonConsecutiveRepetitionImpl booleanCountedNonConsecutiveRepetition = new BooleanCountedNonConsecutiveRepetitionImpl();
		return booleanCountedNonConsecutiveRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanCountedGotoRepetition createBooleanCountedGotoRepetition() {
		BooleanCountedGotoRepetitionImpl booleanCountedGotoRepetition = new BooleanCountedGotoRepetitionImpl();
		return booleanCountedGotoRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceCountedConsecutiveRepetition createSequenceCountedConsecutiveRepetition() {
		SequenceCountedConsecutiveRepetitionImpl sequenceCountedConsecutiveRepetition = new SequenceCountedConsecutiveRepetitionImpl();
		return sequenceCountedConsecutiveRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceConsecutiveRepetition createSequenceConsecutiveRepetition() {
		SequenceConsecutiveRepetitionImpl sequenceConsecutiveRepetition = new SequenceConsecutiveRepetitionImpl();
		return sequenceConsecutiveRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BracedSERE createBracedSERE() {
		BracedSEREImpl bracedSERE = new BracedSEREImpl();
		return bracedSERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundSERE createCompoundSERE() {
		CompoundSEREImpl compoundSERE = new CompoundSEREImpl();
		return compoundSERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEREOr createSEREOr() {
		SEREOrImpl sereOr = new SEREOrImpl();
		return sereOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEREAndNLM createSEREAndNLM() {
		SEREAndNLMImpl sereAndNLM = new SEREAndNLMImpl();
		return sereAndNLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEREAndLM createSEREAndLM() {
		SEREAndLMImpl sereAndLM = new SEREAndLMImpl();
		return sereAndLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEREWithin createSEREWithin() {
		SEREWithinImpl sereWithin = new SEREWithinImpl();
		return sereWithin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencePackage getSequencePackage() {
		return (SequencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SequencePackage getPackage() {
		return SequencePackage.eINSTANCE;
	}

} //SequenceFactoryImpl
