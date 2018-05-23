/**
 */
package sequence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sequence.SequencePackage
 * @generated
 */
public interface SequenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequenceFactory eINSTANCE = sequence.impl.SequenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OCL Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Expression</em>'.
	 * @generated
	 */
	OCLExpression createOCLExpression();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Not Sequence Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Sequence Terminal</em>'.
	 * @generated
	 */
	NotSequenceTerminal createNotSequenceTerminal();

	/**
	 * Returns a new object of class '<em>Fusion SERE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fusion SERE</em>'.
	 * @generated
	 */
	FusionSERE createFusionSERE();

	/**
	 * Returns a new object of class '<em>Concatenation SERE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concatenation SERE</em>'.
	 * @generated
	 */
	ConcatenationSERE createConcatenationSERE();

	/**
	 * Returns a new object of class '<em>Simple SERE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple SERE</em>'.
	 * @generated
	 */
	SimpleSERE createSimpleSERE();

	/**
	 * Returns a new object of class '<em>Wild Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wild Card</em>'.
	 * @generated
	 */
	WildCard createWildCard();

	/**
	 * Returns a new object of class '<em>Length One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length One</em>'.
	 * @generated
	 */
	LengthOne createLengthOne();

	/**
	 * Returns a new object of class '<em>Boolean Counted Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Counted Consecutive Repetition</em>'.
	 * @generated
	 */
	BooleanCountedConsecutiveRepetition createBooleanCountedConsecutiveRepetition();

	/**
	 * Returns a new object of class '<em>Boolean Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Consecutive Repetition</em>'.
	 * @generated
	 */
	BooleanConsecutiveRepetition createBooleanConsecutiveRepetition();

	/**
	 * Returns a new object of class '<em>Boolean Counted Non Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Counted Non Consecutive Repetition</em>'.
	 * @generated
	 */
	BooleanCountedNonConsecutiveRepetition createBooleanCountedNonConsecutiveRepetition();

	/**
	 * Returns a new object of class '<em>Boolean Counted Goto Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Counted Goto Repetition</em>'.
	 * @generated
	 */
	BooleanCountedGotoRepetition createBooleanCountedGotoRepetition();

	/**
	 * Returns a new object of class '<em>Counted Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counted Consecutive Repetition</em>'.
	 * @generated
	 */
	SequenceCountedConsecutiveRepetition createSequenceCountedConsecutiveRepetition();

	/**
	 * Returns a new object of class '<em>Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consecutive Repetition</em>'.
	 * @generated
	 */
	SequenceConsecutiveRepetition createSequenceConsecutiveRepetition();

	/**
	 * Returns a new object of class '<em>Braced SERE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Braced SERE</em>'.
	 * @generated
	 */
	BracedSERE createBracedSERE();

	/**
	 * Returns a new object of class '<em>Compound SERE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound SERE</em>'.
	 * @generated
	 */
	CompoundSERE createCompoundSERE();

	/**
	 * Returns a new object of class '<em>SERE Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SERE Or</em>'.
	 * @generated
	 */
	SEREOr createSEREOr();

	/**
	 * Returns a new object of class '<em>SERE And NLM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SERE And NLM</em>'.
	 * @generated
	 */
	SEREAndNLM createSEREAndNLM();

	/**
	 * Returns a new object of class '<em>SERE And LM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SERE And LM</em>'.
	 * @generated
	 */
	SEREAndLM createSEREAndLM();

	/**
	 * Returns a new object of class '<em>SERE Within</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SERE Within</em>'.
	 * @generated
	 */
	SEREWithin createSEREWithin();

	/**
	 * Returns a new object of class '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count</em>'.
	 * @generated
	 */
	Count createCount();

	/**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
	Range createRange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SequencePackage getSequencePackage();

} //SequenceFactory
