/**
 */
package sequence;

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
 * @see sequence.SequenceFactory
 * @model kind="package"
 * @generated
 */
public interface SequencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tetrabox.org/sequence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sequence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequencePackage eINSTANCE = sequence.impl.SequencePackageImpl.init();

	/**
	 * The meta object id for the '{@link sequence.impl.SEREImpl <em>SERE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SEREImpl
	 * @see sequence.impl.SequencePackageImpl#getSERE()
	 * @generated
	 */
	int SERE = 4;

	/**
	 * The number of structural features of the '<em>SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SimpleSEREImpl <em>Simple SERE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SimpleSEREImpl
	 * @see sequence.impl.SequencePackageImpl#getSimpleSERE()
	 * @generated
	 */
	int SIMPLE_SERE = 7;

	/**
	 * The number of structural features of the '<em>Simple SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERE_FEATURE_COUNT = SERE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERE_OPERATION_COUNT = SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SequenceTerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SequenceTerminalImpl
	 * @see sequence.impl.SequencePackageImpl#getSequenceTerminal()
	 * @generated
	 */
	int SEQUENCE_TERMINAL = 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TERMINAL_FEATURE_COUNT = SIMPLE_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TERMINAL_OPERATION_COUNT = SIMPLE_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.OCLExpressionImpl <em>OCL Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.OCLExpressionImpl
	 * @see sequence.impl.SequencePackageImpl#getOCLExpression()
	 * @generated
	 */
	int OCL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__EXPRESSION = SEQUENCE_TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__CONTEXT = SEQUENCE_TERMINAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_FEATURE_COUNT = SEQUENCE_TERMINAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OCL Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_OPERATION_COUNT = SEQUENCE_TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.BooleanLiteralImpl
	 * @see sequence.impl.SequencePackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__LITERAL = SEQUENCE_TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = SEQUENCE_TERMINAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = SEQUENCE_TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.NotSequenceTerminalImpl <em>Not Sequence Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.NotSequenceTerminalImpl
	 * @see sequence.impl.SequencePackageImpl#getNotSequenceTerminal()
	 * @generated
	 */
	int NOT_SEQUENCE_TERMINAL = 3;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SEQUENCE_TERMINAL__LITERAL = SEQUENCE_TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Sequence Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SEQUENCE_TERMINAL_FEATURE_COUNT = SEQUENCE_TERMINAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Sequence Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SEQUENCE_TERMINAL_OPERATION_COUNT = SEQUENCE_TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.FusionSEREImpl <em>Fusion SERE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.FusionSEREImpl
	 * @see sequence.impl.SequencePackageImpl#getFusionSERE()
	 * @generated
	 */
	int FUSION_SERE = 5;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_SERE__LEFT = SERE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_SERE__RIGHT = SERE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fusion SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_SERE_FEATURE_COUNT = SERE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fusion SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_SERE_OPERATION_COUNT = SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.ConcatenationSEREImpl <em>Concatenation SERE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.ConcatenationSEREImpl
	 * @see sequence.impl.SequencePackageImpl#getConcatenationSERE()
	 * @generated
	 */
	int CONCATENATION_SERE = 6;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION_SERE__LEFT = SERE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION_SERE__RIGHT = SERE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concatenation SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION_SERE_FEATURE_COUNT = SERE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Concatenation SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION_SERE_OPERATION_COUNT = SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SequenceImpl
	 * @see sequence.impl.SequencePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 8;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = SIMPLE_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = SIMPLE_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.RepeatedSEREImpl <em>Repeated SERE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.RepeatedSEREImpl
	 * @see sequence.impl.SequencePackageImpl#getRepeatedSERE()
	 * @generated
	 */
	int REPEATED_SERE = 9;

	/**
	 * The number of structural features of the '<em>Repeated SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_SERE_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Repeated SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_SERE_OPERATION_COUNT = SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.WildCardImpl <em>Wild Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.WildCardImpl
	 * @see sequence.impl.SequencePackageImpl#getWildCard()
	 * @generated
	 */
	int WILD_CARD = 10;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD__COUNT = REPEATED_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wild Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_FEATURE_COUNT = REPEATED_SERE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wild Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_OPERATION_COUNT = REPEATED_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.LengthOneImpl <em>Length One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.LengthOneImpl
	 * @see sequence.impl.SequencePackageImpl#getLengthOne()
	 * @generated
	 */
	int LENGTH_ONE = 11;

	/**
	 * The number of structural features of the '<em>Length One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_ONE_FEATURE_COUNT = REPEATED_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Length One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_ONE_OPERATION_COUNT = REPEATED_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BooleanCountedConsecutiveRepetitionImpl <em>Boolean Counted Consecutive Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.BooleanCountedConsecutiveRepetitionImpl
	 * @see sequence.impl.SequencePackageImpl#getBooleanCountedConsecutiveRepetition()
	 * @generated
	 */
	int BOOLEAN_COUNTED_CONSECUTIVE_REPETITION = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION = REPEATED_SERE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_CONSECUTIVE_REPETITION__COUNT = REPEATED_SERE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Counted Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_CONSECUTIVE_REPETITION_FEATURE_COUNT = REPEATED_SERE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Counted Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_CONSECUTIVE_REPETITION_OPERATION_COUNT = REPEATED_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BooleanConsecutiveRepetitionImpl <em>Boolean Consecutive Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.BooleanConsecutiveRepetitionImpl
	 * @see sequence.impl.SequencePackageImpl#getBooleanConsecutiveRepetition()
	 * @generated
	 */
	int BOOLEAN_CONSECUTIVE_REPETITION = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSECUTIVE_REPETITION__EXPRESSION = REPEATED_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSECUTIVE_REPETITION_FEATURE_COUNT = REPEATED_SERE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSECUTIVE_REPETITION_OPERATION_COUNT = REPEATED_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BooleanCountedNonConsecutiveRepetitionImpl <em>Boolean Counted Non Consecutive Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.BooleanCountedNonConsecutiveRepetitionImpl
	 * @see sequence.impl.SequencePackageImpl#getBooleanCountedNonConsecutiveRepetition()
	 * @generated
	 */
	int BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__EXPRESSION = REPEATED_SERE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__COUNT = REPEATED_SERE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Counted Non Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION_FEATURE_COUNT = REPEATED_SERE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Counted Non Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION_OPERATION_COUNT = REPEATED_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BooleanCountedGotoRepetitionImpl <em>Boolean Counted Goto Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.BooleanCountedGotoRepetitionImpl
	 * @see sequence.impl.SequencePackageImpl#getBooleanCountedGotoRepetition()
	 * @generated
	 */
	int BOOLEAN_COUNTED_GOTO_REPETITION = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_GOTO_REPETITION__EXPRESSION = REPEATED_SERE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_GOTO_REPETITION__COUNT = REPEATED_SERE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Counted Goto Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_GOTO_REPETITION_FEATURE_COUNT = REPEATED_SERE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Counted Goto Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COUNTED_GOTO_REPETITION_OPERATION_COUNT = REPEATED_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SequenceCountedConsecutiveRepetitionImpl <em>Counted Consecutive Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SequenceCountedConsecutiveRepetitionImpl
	 * @see sequence.impl.SequencePackageImpl#getSequenceCountedConsecutiveRepetition()
	 * @generated
	 */
	int SEQUENCE_COUNTED_CONSECUTIVE_REPETITION = 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION = REPEATED_SERE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT = REPEATED_SERE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Counted Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_COUNTED_CONSECUTIVE_REPETITION_FEATURE_COUNT = REPEATED_SERE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Counted Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_COUNTED_CONSECUTIVE_REPETITION_OPERATION_COUNT = REPEATED_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SequenceConsecutiveRepetitionImpl <em>Consecutive Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SequenceConsecutiveRepetitionImpl
	 * @see sequence.impl.SequencePackageImpl#getSequenceConsecutiveRepetition()
	 * @generated
	 */
	int SEQUENCE_CONSECUTIVE_REPETITION = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSECUTIVE_REPETITION__EXPRESSION = REPEATED_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSECUTIVE_REPETITION_FEATURE_COUNT = REPEATED_SERE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Consecutive Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSECUTIVE_REPETITION_OPERATION_COUNT = REPEATED_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BracedSEREImpl <em>Braced SERE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.BracedSEREImpl
	 * @see sequence.impl.SequencePackageImpl#getBracedSERE()
	 * @generated
	 */
	int BRACED_SERE = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACED_SERE__EXPRESSION = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Braced SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACED_SERE_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Braced SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACED_SERE_OPERATION_COUNT = SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.CompoundSEREImpl <em>Compound SERE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.CompoundSEREImpl
	 * @see sequence.impl.SequencePackageImpl#getCompoundSERE()
	 * @generated
	 */
	int COMPOUND_SERE = 19;

	/**
	 * The number of structural features of the '<em>Compound SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERE_FEATURE_COUNT = SIMPLE_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compound SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERE_OPERATION_COUNT = SIMPLE_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BinaryCompoundSEREImpl <em>Binary Compound SERE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.BinaryCompoundSEREImpl
	 * @see sequence.impl.SequencePackageImpl#getBinaryCompoundSERE()
	 * @generated
	 */
	int BINARY_COMPOUND_SERE = 20;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COMPOUND_SERE__LEFT = COMPOUND_SERE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COMPOUND_SERE__RIGHT = COMPOUND_SERE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Compound SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COMPOUND_SERE_FEATURE_COUNT = COMPOUND_SERE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Compound SERE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COMPOUND_SERE_OPERATION_COUNT = COMPOUND_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SEREOrImpl <em>SERE Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SEREOrImpl
	 * @see sequence.impl.SequencePackageImpl#getSEREOr()
	 * @generated
	 */
	int SERE_OR = 21;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_OR__LEFT = BINARY_COMPOUND_SERE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_OR__RIGHT = BINARY_COMPOUND_SERE__RIGHT;

	/**
	 * The number of structural features of the '<em>SERE Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_OR_FEATURE_COUNT = BINARY_COMPOUND_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SERE Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_OR_OPERATION_COUNT = BINARY_COMPOUND_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SEREAndNLMImpl <em>SERE And NLM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SEREAndNLMImpl
	 * @see sequence.impl.SequencePackageImpl#getSEREAndNLM()
	 * @generated
	 */
	int SERE_AND_NLM = 22;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_AND_NLM__LEFT = BINARY_COMPOUND_SERE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_AND_NLM__RIGHT = BINARY_COMPOUND_SERE__RIGHT;

	/**
	 * The number of structural features of the '<em>SERE And NLM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_AND_NLM_FEATURE_COUNT = BINARY_COMPOUND_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SERE And NLM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_AND_NLM_OPERATION_COUNT = BINARY_COMPOUND_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SEREAndLMImpl <em>SERE And LM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SEREAndLMImpl
	 * @see sequence.impl.SequencePackageImpl#getSEREAndLM()
	 * @generated
	 */
	int SERE_AND_LM = 23;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_AND_LM__LEFT = BINARY_COMPOUND_SERE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_AND_LM__RIGHT = BINARY_COMPOUND_SERE__RIGHT;

	/**
	 * The number of structural features of the '<em>SERE And LM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_AND_LM_FEATURE_COUNT = BINARY_COMPOUND_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SERE And LM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_AND_LM_OPERATION_COUNT = BINARY_COMPOUND_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SEREWithinImpl <em>SERE Within</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SEREWithinImpl
	 * @see sequence.impl.SequencePackageImpl#getSEREWithin()
	 * @generated
	 */
	int SERE_WITHIN = 24;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_WITHIN__LEFT = BINARY_COMPOUND_SERE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_WITHIN__RIGHT = BINARY_COMPOUND_SERE__RIGHT;

	/**
	 * The number of structural features of the '<em>SERE Within</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_WITHIN_FEATURE_COUNT = BINARY_COMPOUND_SERE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SERE Within</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERE_WITHIN_OPERATION_COUNT = BINARY_COMPOUND_SERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.CountImpl
	 * @see sequence.impl.SequencePackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 25;

	/**
	 * The feature id for the '<em><b>COUNT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__COUNT = 0;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.RangeImpl
	 * @see sequence.impl.SequencePackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 26;

	/**
	 * The feature id for the '<em><b>COUNT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__COUNT = COUNT__COUNT;

	/**
	 * The feature id for the '<em><b>LOWER BOUND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__LOWER_BOUND = COUNT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HIGHER BOUND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__HIGHER_BOUND = COUNT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = COUNT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = COUNT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link sequence.SequenceTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see sequence.SequenceTerminal
	 * @generated
	 */
	EClass getSequenceTerminal();

	/**
	 * Returns the meta object for class '{@link sequence.OCLExpression <em>OCL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Expression</em>'.
	 * @see sequence.OCLExpression
	 * @generated
	 */
	EClass getOCLExpression();

	/**
	 * Returns the meta object for the attribute '{@link sequence.OCLExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see sequence.OCLExpression#getExpression()
	 * @see #getOCLExpression()
	 * @generated
	 */
	EAttribute getOCLExpression_Expression();

	/**
	 * Returns the meta object for the reference '{@link sequence.OCLExpression#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see sequence.OCLExpression#getContext()
	 * @see #getOCLExpression()
	 * @generated
	 */
	EReference getOCLExpression_Context();

	/**
	 * Returns the meta object for class '{@link sequence.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see sequence.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link sequence.BooleanLiteral#isLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see sequence.BooleanLiteral#isLiteral()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Literal();

	/**
	 * Returns the meta object for class '{@link sequence.NotSequenceTerminal <em>Not Sequence Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Sequence Terminal</em>'.
	 * @see sequence.NotSequenceTerminal
	 * @generated
	 */
	EClass getNotSequenceTerminal();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.NotSequenceTerminal#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see sequence.NotSequenceTerminal#getLiteral()
	 * @see #getNotSequenceTerminal()
	 * @generated
	 */
	EReference getNotSequenceTerminal_Literal();

	/**
	 * Returns the meta object for class '{@link sequence.SERE <em>SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SERE</em>'.
	 * @see sequence.SERE
	 * @generated
	 */
	EClass getSERE();

	/**
	 * Returns the meta object for class '{@link sequence.FusionSERE <em>Fusion SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fusion SERE</em>'.
	 * @see sequence.FusionSERE
	 * @generated
	 */
	EClass getFusionSERE();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.FusionSERE#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see sequence.FusionSERE#getLeft()
	 * @see #getFusionSERE()
	 * @generated
	 */
	EReference getFusionSERE_Left();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.FusionSERE#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see sequence.FusionSERE#getRight()
	 * @see #getFusionSERE()
	 * @generated
	 */
	EReference getFusionSERE_Right();

	/**
	 * Returns the meta object for class '{@link sequence.ConcatenationSERE <em>Concatenation SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenation SERE</em>'.
	 * @see sequence.ConcatenationSERE
	 * @generated
	 */
	EClass getConcatenationSERE();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.ConcatenationSERE#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see sequence.ConcatenationSERE#getLeft()
	 * @see #getConcatenationSERE()
	 * @generated
	 */
	EReference getConcatenationSERE_Left();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.ConcatenationSERE#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see sequence.ConcatenationSERE#getRight()
	 * @see #getConcatenationSERE()
	 * @generated
	 */
	EReference getConcatenationSERE_Right();

	/**
	 * Returns the meta object for class '{@link sequence.SimpleSERE <em>Simple SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple SERE</em>'.
	 * @see sequence.SimpleSERE
	 * @generated
	 */
	EClass getSimpleSERE();

	/**
	 * Returns the meta object for class '{@link sequence.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see sequence.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link sequence.RepeatedSERE <em>Repeated SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeated SERE</em>'.
	 * @see sequence.RepeatedSERE
	 * @generated
	 */
	EClass getRepeatedSERE();

	/**
	 * Returns the meta object for class '{@link sequence.WildCard <em>Wild Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wild Card</em>'.
	 * @see sequence.WildCard
	 * @generated
	 */
	EClass getWildCard();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.WildCard#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see sequence.WildCard#getCount()
	 * @see #getWildCard()
	 * @generated
	 */
	EReference getWildCard_Count();

	/**
	 * Returns the meta object for class '{@link sequence.LengthOne <em>Length One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length One</em>'.
	 * @see sequence.LengthOne
	 * @generated
	 */
	EClass getLengthOne();

	/**
	 * Returns the meta object for class '{@link sequence.BooleanCountedConsecutiveRepetition <em>Boolean Counted Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Counted Consecutive Repetition</em>'.
	 * @see sequence.BooleanCountedConsecutiveRepetition
	 * @generated
	 */
	EClass getBooleanCountedConsecutiveRepetition();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BooleanCountedConsecutiveRepetition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see sequence.BooleanCountedConsecutiveRepetition#getExpression()
	 * @see #getBooleanCountedConsecutiveRepetition()
	 * @generated
	 */
	EReference getBooleanCountedConsecutiveRepetition_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BooleanCountedConsecutiveRepetition#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see sequence.BooleanCountedConsecutiveRepetition#getCount()
	 * @see #getBooleanCountedConsecutiveRepetition()
	 * @generated
	 */
	EReference getBooleanCountedConsecutiveRepetition_Count();

	/**
	 * Returns the meta object for class '{@link sequence.BooleanConsecutiveRepetition <em>Boolean Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Consecutive Repetition</em>'.
	 * @see sequence.BooleanConsecutiveRepetition
	 * @generated
	 */
	EClass getBooleanConsecutiveRepetition();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BooleanConsecutiveRepetition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see sequence.BooleanConsecutiveRepetition#getExpression()
	 * @see #getBooleanConsecutiveRepetition()
	 * @generated
	 */
	EReference getBooleanConsecutiveRepetition_Expression();

	/**
	 * Returns the meta object for class '{@link sequence.BooleanCountedNonConsecutiveRepetition <em>Boolean Counted Non Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Counted Non Consecutive Repetition</em>'.
	 * @see sequence.BooleanCountedNonConsecutiveRepetition
	 * @generated
	 */
	EClass getBooleanCountedNonConsecutiveRepetition();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BooleanCountedNonConsecutiveRepetition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see sequence.BooleanCountedNonConsecutiveRepetition#getExpression()
	 * @see #getBooleanCountedNonConsecutiveRepetition()
	 * @generated
	 */
	EReference getBooleanCountedNonConsecutiveRepetition_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BooleanCountedNonConsecutiveRepetition#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see sequence.BooleanCountedNonConsecutiveRepetition#getCount()
	 * @see #getBooleanCountedNonConsecutiveRepetition()
	 * @generated
	 */
	EReference getBooleanCountedNonConsecutiveRepetition_Count();

	/**
	 * Returns the meta object for class '{@link sequence.BooleanCountedGotoRepetition <em>Boolean Counted Goto Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Counted Goto Repetition</em>'.
	 * @see sequence.BooleanCountedGotoRepetition
	 * @generated
	 */
	EClass getBooleanCountedGotoRepetition();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BooleanCountedGotoRepetition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see sequence.BooleanCountedGotoRepetition#getExpression()
	 * @see #getBooleanCountedGotoRepetition()
	 * @generated
	 */
	EReference getBooleanCountedGotoRepetition_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BooleanCountedGotoRepetition#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see sequence.BooleanCountedGotoRepetition#getCount()
	 * @see #getBooleanCountedGotoRepetition()
	 * @generated
	 */
	EReference getBooleanCountedGotoRepetition_Count();

	/**
	 * Returns the meta object for class '{@link sequence.SequenceCountedConsecutiveRepetition <em>Counted Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counted Consecutive Repetition</em>'.
	 * @see sequence.SequenceCountedConsecutiveRepetition
	 * @generated
	 */
	EClass getSequenceCountedConsecutiveRepetition();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.SequenceCountedConsecutiveRepetition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see sequence.SequenceCountedConsecutiveRepetition#getExpression()
	 * @see #getSequenceCountedConsecutiveRepetition()
	 * @generated
	 */
	EReference getSequenceCountedConsecutiveRepetition_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.SequenceCountedConsecutiveRepetition#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see sequence.SequenceCountedConsecutiveRepetition#getCount()
	 * @see #getSequenceCountedConsecutiveRepetition()
	 * @generated
	 */
	EReference getSequenceCountedConsecutiveRepetition_Count();

	/**
	 * Returns the meta object for class '{@link sequence.SequenceConsecutiveRepetition <em>Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consecutive Repetition</em>'.
	 * @see sequence.SequenceConsecutiveRepetition
	 * @generated
	 */
	EClass getSequenceConsecutiveRepetition();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.SequenceConsecutiveRepetition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see sequence.SequenceConsecutiveRepetition#getExpression()
	 * @see #getSequenceConsecutiveRepetition()
	 * @generated
	 */
	EReference getSequenceConsecutiveRepetition_Expression();

	/**
	 * Returns the meta object for class '{@link sequence.BracedSERE <em>Braced SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Braced SERE</em>'.
	 * @see sequence.BracedSERE
	 * @generated
	 */
	EClass getBracedSERE();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BracedSERE#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see sequence.BracedSERE#getExpression()
	 * @see #getBracedSERE()
	 * @generated
	 */
	EReference getBracedSERE_Expression();

	/**
	 * Returns the meta object for class '{@link sequence.CompoundSERE <em>Compound SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound SERE</em>'.
	 * @see sequence.CompoundSERE
	 * @generated
	 */
	EClass getCompoundSERE();

	/**
	 * Returns the meta object for class '{@link sequence.BinaryCompoundSERE <em>Binary Compound SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Compound SERE</em>'.
	 * @see sequence.BinaryCompoundSERE
	 * @generated
	 */
	EClass getBinaryCompoundSERE();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BinaryCompoundSERE#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see sequence.BinaryCompoundSERE#getLeft()
	 * @see #getBinaryCompoundSERE()
	 * @generated
	 */
	EReference getBinaryCompoundSERE_Left();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.BinaryCompoundSERE#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see sequence.BinaryCompoundSERE#getRight()
	 * @see #getBinaryCompoundSERE()
	 * @generated
	 */
	EReference getBinaryCompoundSERE_Right();

	/**
	 * Returns the meta object for class '{@link sequence.SEREOr <em>SERE Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SERE Or</em>'.
	 * @see sequence.SEREOr
	 * @generated
	 */
	EClass getSEREOr();

	/**
	 * Returns the meta object for class '{@link sequence.SEREAndNLM <em>SERE And NLM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SERE And NLM</em>'.
	 * @see sequence.SEREAndNLM
	 * @generated
	 */
	EClass getSEREAndNLM();

	/**
	 * Returns the meta object for class '{@link sequence.SEREAndLM <em>SERE And LM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SERE And LM</em>'.
	 * @see sequence.SEREAndLM
	 * @generated
	 */
	EClass getSEREAndLM();

	/**
	 * Returns the meta object for class '{@link sequence.SEREWithin <em>SERE Within</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SERE Within</em>'.
	 * @see sequence.SEREWithin
	 * @generated
	 */
	EClass getSEREWithin();

	/**
	 * Returns the meta object for class '{@link sequence.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see sequence.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for the attribute '{@link sequence.Count#getCOUNT <em>COUNT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COUNT</em>'.
	 * @see sequence.Count#getCOUNT()
	 * @see #getCount()
	 * @generated
	 */
	EAttribute getCount_COUNT();

	/**
	 * Returns the meta object for class '{@link sequence.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see sequence.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link sequence.Range#getLOWER_BOUND <em>LOWER BOUND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LOWER BOUND</em>'.
	 * @see sequence.Range#getLOWER_BOUND()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_LOWER_BOUND();

	/**
	 * Returns the meta object for the attribute '{@link sequence.Range#getHIGHER_BOUND <em>HIGHER BOUND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HIGHER BOUND</em>'.
	 * @see sequence.Range#getHIGHER_BOUND()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_HIGHER_BOUND();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SequenceFactory getSequenceFactory();

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
		 * The meta object literal for the '{@link sequence.impl.SequenceTerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SequenceTerminalImpl
		 * @see sequence.impl.SequencePackageImpl#getSequenceTerminal()
		 * @generated
		 */
		EClass SEQUENCE_TERMINAL = eINSTANCE.getSequenceTerminal();

		/**
		 * The meta object literal for the '{@link sequence.impl.OCLExpressionImpl <em>OCL Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.OCLExpressionImpl
		 * @see sequence.impl.SequencePackageImpl#getOCLExpression()
		 * @generated
		 */
		EClass OCL_EXPRESSION = eINSTANCE.getOCLExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_EXPRESSION__EXPRESSION = eINSTANCE.getOCLExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__CONTEXT = eINSTANCE.getOCLExpression_Context();

		/**
		 * The meta object literal for the '{@link sequence.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.BooleanLiteralImpl
		 * @see sequence.impl.SequencePackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__LITERAL = eINSTANCE.getBooleanLiteral_Literal();

		/**
		 * The meta object literal for the '{@link sequence.impl.NotSequenceTerminalImpl <em>Not Sequence Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.NotSequenceTerminalImpl
		 * @see sequence.impl.SequencePackageImpl#getNotSequenceTerminal()
		 * @generated
		 */
		EClass NOT_SEQUENCE_TERMINAL = eINSTANCE.getNotSequenceTerminal();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_SEQUENCE_TERMINAL__LITERAL = eINSTANCE.getNotSequenceTerminal_Literal();

		/**
		 * The meta object literal for the '{@link sequence.impl.SEREImpl <em>SERE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SEREImpl
		 * @see sequence.impl.SequencePackageImpl#getSERE()
		 * @generated
		 */
		EClass SERE = eINSTANCE.getSERE();

		/**
		 * The meta object literal for the '{@link sequence.impl.FusionSEREImpl <em>Fusion SERE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.FusionSEREImpl
		 * @see sequence.impl.SequencePackageImpl#getFusionSERE()
		 * @generated
		 */
		EClass FUSION_SERE = eINSTANCE.getFusionSERE();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUSION_SERE__LEFT = eINSTANCE.getFusionSERE_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUSION_SERE__RIGHT = eINSTANCE.getFusionSERE_Right();

		/**
		 * The meta object literal for the '{@link sequence.impl.ConcatenationSEREImpl <em>Concatenation SERE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.ConcatenationSEREImpl
		 * @see sequence.impl.SequencePackageImpl#getConcatenationSERE()
		 * @generated
		 */
		EClass CONCATENATION_SERE = eINSTANCE.getConcatenationSERE();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCATENATION_SERE__LEFT = eINSTANCE.getConcatenationSERE_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCATENATION_SERE__RIGHT = eINSTANCE.getConcatenationSERE_Right();

		/**
		 * The meta object literal for the '{@link sequence.impl.SimpleSEREImpl <em>Simple SERE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SimpleSEREImpl
		 * @see sequence.impl.SequencePackageImpl#getSimpleSERE()
		 * @generated
		 */
		EClass SIMPLE_SERE = eINSTANCE.getSimpleSERE();

		/**
		 * The meta object literal for the '{@link sequence.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SequenceImpl
		 * @see sequence.impl.SequencePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link sequence.impl.RepeatedSEREImpl <em>Repeated SERE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.RepeatedSEREImpl
		 * @see sequence.impl.SequencePackageImpl#getRepeatedSERE()
		 * @generated
		 */
		EClass REPEATED_SERE = eINSTANCE.getRepeatedSERE();

		/**
		 * The meta object literal for the '{@link sequence.impl.WildCardImpl <em>Wild Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.WildCardImpl
		 * @see sequence.impl.SequencePackageImpl#getWildCard()
		 * @generated
		 */
		EClass WILD_CARD = eINSTANCE.getWildCard();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WILD_CARD__COUNT = eINSTANCE.getWildCard_Count();

		/**
		 * The meta object literal for the '{@link sequence.impl.LengthOneImpl <em>Length One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.LengthOneImpl
		 * @see sequence.impl.SequencePackageImpl#getLengthOne()
		 * @generated
		 */
		EClass LENGTH_ONE = eINSTANCE.getLengthOne();

		/**
		 * The meta object literal for the '{@link sequence.impl.BooleanCountedConsecutiveRepetitionImpl <em>Boolean Counted Consecutive Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.BooleanCountedConsecutiveRepetitionImpl
		 * @see sequence.impl.SequencePackageImpl#getBooleanCountedConsecutiveRepetition()
		 * @generated
		 */
		EClass BOOLEAN_COUNTED_CONSECUTIVE_REPETITION = eINSTANCE.getBooleanCountedConsecutiveRepetition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION = eINSTANCE.getBooleanCountedConsecutiveRepetition_Expression();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_COUNTED_CONSECUTIVE_REPETITION__COUNT = eINSTANCE.getBooleanCountedConsecutiveRepetition_Count();

		/**
		 * The meta object literal for the '{@link sequence.impl.BooleanConsecutiveRepetitionImpl <em>Boolean Consecutive Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.BooleanConsecutiveRepetitionImpl
		 * @see sequence.impl.SequencePackageImpl#getBooleanConsecutiveRepetition()
		 * @generated
		 */
		EClass BOOLEAN_CONSECUTIVE_REPETITION = eINSTANCE.getBooleanConsecutiveRepetition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_CONSECUTIVE_REPETITION__EXPRESSION = eINSTANCE.getBooleanConsecutiveRepetition_Expression();

		/**
		 * The meta object literal for the '{@link sequence.impl.BooleanCountedNonConsecutiveRepetitionImpl <em>Boolean Counted Non Consecutive Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.BooleanCountedNonConsecutiveRepetitionImpl
		 * @see sequence.impl.SequencePackageImpl#getBooleanCountedNonConsecutiveRepetition()
		 * @generated
		 */
		EClass BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION = eINSTANCE.getBooleanCountedNonConsecutiveRepetition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__EXPRESSION = eINSTANCE.getBooleanCountedNonConsecutiveRepetition_Expression();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__COUNT = eINSTANCE.getBooleanCountedNonConsecutiveRepetition_Count();

		/**
		 * The meta object literal for the '{@link sequence.impl.BooleanCountedGotoRepetitionImpl <em>Boolean Counted Goto Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.BooleanCountedGotoRepetitionImpl
		 * @see sequence.impl.SequencePackageImpl#getBooleanCountedGotoRepetition()
		 * @generated
		 */
		EClass BOOLEAN_COUNTED_GOTO_REPETITION = eINSTANCE.getBooleanCountedGotoRepetition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_COUNTED_GOTO_REPETITION__EXPRESSION = eINSTANCE.getBooleanCountedGotoRepetition_Expression();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_COUNTED_GOTO_REPETITION__COUNT = eINSTANCE.getBooleanCountedGotoRepetition_Count();

		/**
		 * The meta object literal for the '{@link sequence.impl.SequenceCountedConsecutiveRepetitionImpl <em>Counted Consecutive Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SequenceCountedConsecutiveRepetitionImpl
		 * @see sequence.impl.SequencePackageImpl#getSequenceCountedConsecutiveRepetition()
		 * @generated
		 */
		EClass SEQUENCE_COUNTED_CONSECUTIVE_REPETITION = eINSTANCE.getSequenceCountedConsecutiveRepetition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__EXPRESSION = eINSTANCE.getSequenceCountedConsecutiveRepetition_Expression();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_COUNTED_CONSECUTIVE_REPETITION__COUNT = eINSTANCE.getSequenceCountedConsecutiveRepetition_Count();

		/**
		 * The meta object literal for the '{@link sequence.impl.SequenceConsecutiveRepetitionImpl <em>Consecutive Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SequenceConsecutiveRepetitionImpl
		 * @see sequence.impl.SequencePackageImpl#getSequenceConsecutiveRepetition()
		 * @generated
		 */
		EClass SEQUENCE_CONSECUTIVE_REPETITION = eINSTANCE.getSequenceConsecutiveRepetition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_CONSECUTIVE_REPETITION__EXPRESSION = eINSTANCE.getSequenceConsecutiveRepetition_Expression();

		/**
		 * The meta object literal for the '{@link sequence.impl.BracedSEREImpl <em>Braced SERE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.BracedSEREImpl
		 * @see sequence.impl.SequencePackageImpl#getBracedSERE()
		 * @generated
		 */
		EClass BRACED_SERE = eINSTANCE.getBracedSERE();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACED_SERE__EXPRESSION = eINSTANCE.getBracedSERE_Expression();

		/**
		 * The meta object literal for the '{@link sequence.impl.CompoundSEREImpl <em>Compound SERE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.CompoundSEREImpl
		 * @see sequence.impl.SequencePackageImpl#getCompoundSERE()
		 * @generated
		 */
		EClass COMPOUND_SERE = eINSTANCE.getCompoundSERE();

		/**
		 * The meta object literal for the '{@link sequence.impl.BinaryCompoundSEREImpl <em>Binary Compound SERE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.BinaryCompoundSEREImpl
		 * @see sequence.impl.SequencePackageImpl#getBinaryCompoundSERE()
		 * @generated
		 */
		EClass BINARY_COMPOUND_SERE = eINSTANCE.getBinaryCompoundSERE();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COMPOUND_SERE__LEFT = eINSTANCE.getBinaryCompoundSERE_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COMPOUND_SERE__RIGHT = eINSTANCE.getBinaryCompoundSERE_Right();

		/**
		 * The meta object literal for the '{@link sequence.impl.SEREOrImpl <em>SERE Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SEREOrImpl
		 * @see sequence.impl.SequencePackageImpl#getSEREOr()
		 * @generated
		 */
		EClass SERE_OR = eINSTANCE.getSEREOr();

		/**
		 * The meta object literal for the '{@link sequence.impl.SEREAndNLMImpl <em>SERE And NLM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SEREAndNLMImpl
		 * @see sequence.impl.SequencePackageImpl#getSEREAndNLM()
		 * @generated
		 */
		EClass SERE_AND_NLM = eINSTANCE.getSEREAndNLM();

		/**
		 * The meta object literal for the '{@link sequence.impl.SEREAndLMImpl <em>SERE And LM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SEREAndLMImpl
		 * @see sequence.impl.SequencePackageImpl#getSEREAndLM()
		 * @generated
		 */
		EClass SERE_AND_LM = eINSTANCE.getSEREAndLM();

		/**
		 * The meta object literal for the '{@link sequence.impl.SEREWithinImpl <em>SERE Within</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SEREWithinImpl
		 * @see sequence.impl.SequencePackageImpl#getSEREWithin()
		 * @generated
		 */
		EClass SERE_WITHIN = eINSTANCE.getSEREWithin();

		/**
		 * The meta object literal for the '{@link sequence.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.CountImpl
		 * @see sequence.impl.SequencePackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '<em><b>COUNT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT__COUNT = eINSTANCE.getCount_COUNT();

		/**
		 * The meta object literal for the '{@link sequence.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.RangeImpl
		 * @see sequence.impl.SequencePackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>LOWER BOUND</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__LOWER_BOUND = eINSTANCE.getRange_LOWER_BOUND();

		/**
		 * The meta object literal for the '<em><b>HIGHER BOUND</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__HIGHER_BOUND = eINSTANCE.getRange_HIGHER_BOUND();

	}

} //SequencePackage
