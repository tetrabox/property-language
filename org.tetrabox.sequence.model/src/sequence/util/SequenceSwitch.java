/**
 */
package sequence.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sequence.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sequence.SequencePackage
 * @generated
 */
public class SequenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SequencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceSwitch() {
		if (modelPackage == null) {
			modelPackage = SequencePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SequencePackage.SEQUENCE_TERMINAL: {
				SequenceTerminal sequenceTerminal = (SequenceTerminal)theEObject;
				T result = caseSequenceTerminal(sequenceTerminal);
				if (result == null) result = caseSimpleSERE(sequenceTerminal);
				if (result == null) result = caseSERE(sequenceTerminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.OCL_EXPRESSION: {
				OCLExpression oclExpression = (OCLExpression)theEObject;
				T result = caseOCLExpression(oclExpression);
				if (result == null) result = caseSequenceTerminal(oclExpression);
				if (result == null) result = caseSimpleSERE(oclExpression);
				if (result == null) result = caseSERE(oclExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseSequenceTerminal(booleanLiteral);
				if (result == null) result = caseSimpleSERE(booleanLiteral);
				if (result == null) result = caseSERE(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.NOT_SEQUENCE_TERMINAL: {
				NotSequenceTerminal notSequenceTerminal = (NotSequenceTerminal)theEObject;
				T result = caseNotSequenceTerminal(notSequenceTerminal);
				if (result == null) result = caseSequenceTerminal(notSequenceTerminal);
				if (result == null) result = caseSimpleSERE(notSequenceTerminal);
				if (result == null) result = caseSERE(notSequenceTerminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.SERE: {
				SERE sere = (SERE)theEObject;
				T result = caseSERE(sere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.FUSION_SERE: {
				FusionSERE fusionSERE = (FusionSERE)theEObject;
				T result = caseFusionSERE(fusionSERE);
				if (result == null) result = caseSERE(fusionSERE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.CONCATENATION_SERE: {
				ConcatenationSERE concatenationSERE = (ConcatenationSERE)theEObject;
				T result = caseConcatenationSERE(concatenationSERE);
				if (result == null) result = caseSERE(concatenationSERE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.SIMPLE_SERE: {
				SimpleSERE simpleSERE = (SimpleSERE)theEObject;
				T result = caseSimpleSERE(simpleSERE);
				if (result == null) result = caseSERE(simpleSERE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseSimpleSERE(sequence);
				if (result == null) result = caseSERE(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.REPEATED_SERE: {
				RepeatedSERE repeatedSERE = (RepeatedSERE)theEObject;
				T result = caseRepeatedSERE(repeatedSERE);
				if (result == null) result = caseSequence(repeatedSERE);
				if (result == null) result = caseCompoundSERE(repeatedSERE);
				if (result == null) result = caseSimpleSERE(repeatedSERE);
				if (result == null) result = caseSERE(repeatedSERE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.WILD_CARD: {
				WildCard wildCard = (WildCard)theEObject;
				T result = caseWildCard(wildCard);
				if (result == null) result = caseRepeatedSERE(wildCard);
				if (result == null) result = caseSequence(wildCard);
				if (result == null) result = caseCompoundSERE(wildCard);
				if (result == null) result = caseSimpleSERE(wildCard);
				if (result == null) result = caseSERE(wildCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.LENGTH_ONE: {
				LengthOne lengthOne = (LengthOne)theEObject;
				T result = caseLengthOne(lengthOne);
				if (result == null) result = caseRepeatedSERE(lengthOne);
				if (result == null) result = caseSequence(lengthOne);
				if (result == null) result = caseCompoundSERE(lengthOne);
				if (result == null) result = caseSimpleSERE(lengthOne);
				if (result == null) result = caseSERE(lengthOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.BOOLEAN_COUNTED_CONSECUTIVE_REPETITION: {
				BooleanCountedConsecutiveRepetition booleanCountedConsecutiveRepetition = (BooleanCountedConsecutiveRepetition)theEObject;
				T result = caseBooleanCountedConsecutiveRepetition(booleanCountedConsecutiveRepetition);
				if (result == null) result = caseRepeatedSERE(booleanCountedConsecutiveRepetition);
				if (result == null) result = caseSequence(booleanCountedConsecutiveRepetition);
				if (result == null) result = caseCompoundSERE(booleanCountedConsecutiveRepetition);
				if (result == null) result = caseSimpleSERE(booleanCountedConsecutiveRepetition);
				if (result == null) result = caseSERE(booleanCountedConsecutiveRepetition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.BOOLEAN_CONSECUTIVE_REPETITION: {
				BooleanConsecutiveRepetition booleanConsecutiveRepetition = (BooleanConsecutiveRepetition)theEObject;
				T result = caseBooleanConsecutiveRepetition(booleanConsecutiveRepetition);
				if (result == null) result = caseRepeatedSERE(booleanConsecutiveRepetition);
				if (result == null) result = caseSequence(booleanConsecutiveRepetition);
				if (result == null) result = caseCompoundSERE(booleanConsecutiveRepetition);
				if (result == null) result = caseSimpleSERE(booleanConsecutiveRepetition);
				if (result == null) result = caseSERE(booleanConsecutiveRepetition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION: {
				BooleanCountedNonConsecutiveRepetition booleanCountedNonConsecutiveRepetition = (BooleanCountedNonConsecutiveRepetition)theEObject;
				T result = caseBooleanCountedNonConsecutiveRepetition(booleanCountedNonConsecutiveRepetition);
				if (result == null) result = caseRepeatedSERE(booleanCountedNonConsecutiveRepetition);
				if (result == null) result = caseSequence(booleanCountedNonConsecutiveRepetition);
				if (result == null) result = caseCompoundSERE(booleanCountedNonConsecutiveRepetition);
				if (result == null) result = caseSimpleSERE(booleanCountedNonConsecutiveRepetition);
				if (result == null) result = caseSERE(booleanCountedNonConsecutiveRepetition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.BOOLEAN_COUNTED_GOTO_REPETITION: {
				BooleanCountedGotoRepetition booleanCountedGotoRepetition = (BooleanCountedGotoRepetition)theEObject;
				T result = caseBooleanCountedGotoRepetition(booleanCountedGotoRepetition);
				if (result == null) result = caseRepeatedSERE(booleanCountedGotoRepetition);
				if (result == null) result = caseSequence(booleanCountedGotoRepetition);
				if (result == null) result = caseCompoundSERE(booleanCountedGotoRepetition);
				if (result == null) result = caseSimpleSERE(booleanCountedGotoRepetition);
				if (result == null) result = caseSERE(booleanCountedGotoRepetition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION: {
				SequenceCountedConsecutiveRepetition sequenceCountedConsecutiveRepetition = (SequenceCountedConsecutiveRepetition)theEObject;
				T result = caseSequenceCountedConsecutiveRepetition(sequenceCountedConsecutiveRepetition);
				if (result == null) result = caseRepeatedSERE(sequenceCountedConsecutiveRepetition);
				if (result == null) result = caseSequence(sequenceCountedConsecutiveRepetition);
				if (result == null) result = caseCompoundSERE(sequenceCountedConsecutiveRepetition);
				if (result == null) result = caseSimpleSERE(sequenceCountedConsecutiveRepetition);
				if (result == null) result = caseSERE(sequenceCountedConsecutiveRepetition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.SEQUENCE_CONSECUTIVE_REPETITION: {
				SequenceConsecutiveRepetition sequenceConsecutiveRepetition = (SequenceConsecutiveRepetition)theEObject;
				T result = caseSequenceConsecutiveRepetition(sequenceConsecutiveRepetition);
				if (result == null) result = caseRepeatedSERE(sequenceConsecutiveRepetition);
				if (result == null) result = caseSequence(sequenceConsecutiveRepetition);
				if (result == null) result = caseCompoundSERE(sequenceConsecutiveRepetition);
				if (result == null) result = caseSimpleSERE(sequenceConsecutiveRepetition);
				if (result == null) result = caseSERE(sequenceConsecutiveRepetition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.BRACED_SERE: {
				BracedSERE bracedSERE = (BracedSERE)theEObject;
				T result = caseBracedSERE(bracedSERE);
				if (result == null) result = caseSequence(bracedSERE);
				if (result == null) result = caseCompoundSERE(bracedSERE);
				if (result == null) result = caseSimpleSERE(bracedSERE);
				if (result == null) result = caseSERE(bracedSERE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.COMPOUND_SERE: {
				CompoundSERE compoundSERE = (CompoundSERE)theEObject;
				T result = caseCompoundSERE(compoundSERE);
				if (result == null) result = caseSimpleSERE(compoundSERE);
				if (result == null) result = caseSERE(compoundSERE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.BINARY_COMPOUND_SERE: {
				BinaryCompoundSERE binaryCompoundSERE = (BinaryCompoundSERE)theEObject;
				T result = caseBinaryCompoundSERE(binaryCompoundSERE);
				if (result == null) result = caseCompoundSERE(binaryCompoundSERE);
				if (result == null) result = caseSimpleSERE(binaryCompoundSERE);
				if (result == null) result = caseSERE(binaryCompoundSERE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.SERE_OR: {
				SEREOr sereOr = (SEREOr)theEObject;
				T result = caseSEREOr(sereOr);
				if (result == null) result = caseBinaryCompoundSERE(sereOr);
				if (result == null) result = caseCompoundSERE(sereOr);
				if (result == null) result = caseSimpleSERE(sereOr);
				if (result == null) result = caseSERE(sereOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.SERE_AND_NLM: {
				SEREAndNLM sereAndNLM = (SEREAndNLM)theEObject;
				T result = caseSEREAndNLM(sereAndNLM);
				if (result == null) result = caseBinaryCompoundSERE(sereAndNLM);
				if (result == null) result = caseCompoundSERE(sereAndNLM);
				if (result == null) result = caseSimpleSERE(sereAndNLM);
				if (result == null) result = caseSERE(sereAndNLM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.SERE_AND_LM: {
				SEREAndLM sereAndLM = (SEREAndLM)theEObject;
				T result = caseSEREAndLM(sereAndLM);
				if (result == null) result = caseBinaryCompoundSERE(sereAndLM);
				if (result == null) result = caseCompoundSERE(sereAndLM);
				if (result == null) result = caseSimpleSERE(sereAndLM);
				if (result == null) result = caseSERE(sereAndLM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.SERE_WITHIN: {
				SEREWithin sereWithin = (SEREWithin)theEObject;
				T result = caseSEREWithin(sereWithin);
				if (result == null) result = caseBinaryCompoundSERE(sereWithin);
				if (result == null) result = caseCompoundSERE(sereWithin);
				if (result == null) result = caseSimpleSERE(sereWithin);
				if (result == null) result = caseSERE(sereWithin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequencePackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseCount(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceTerminal(SequenceTerminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLExpression(OCLExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Sequence Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Sequence Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotSequenceTerminal(NotSequenceTerminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SERE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SERE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSERE(SERE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fusion SERE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fusion SERE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFusionSERE(FusionSERE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenation SERE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenation SERE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenationSERE(ConcatenationSERE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple SERE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple SERE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSERE(SimpleSERE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeated SERE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeated SERE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatedSERE(RepeatedSERE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wild Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wild Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildCard(WildCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthOne(LengthOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Counted Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Counted Consecutive Repetition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanCountedConsecutiveRepetition(BooleanCountedConsecutiveRepetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Consecutive Repetition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConsecutiveRepetition(BooleanConsecutiveRepetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Counted Non Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Counted Non Consecutive Repetition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanCountedNonConsecutiveRepetition(BooleanCountedNonConsecutiveRepetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Counted Goto Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Counted Goto Repetition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanCountedGotoRepetition(BooleanCountedGotoRepetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counted Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counted Consecutive Repetition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceCountedConsecutiveRepetition(SequenceCountedConsecutiveRepetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consecutive Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consecutive Repetition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceConsecutiveRepetition(SequenceConsecutiveRepetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Braced SERE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Braced SERE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBracedSERE(BracedSERE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound SERE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound SERE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundSERE(CompoundSERE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Compound SERE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Compound SERE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryCompoundSERE(BinaryCompoundSERE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SERE Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SERE Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEREOr(SEREOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SERE And NLM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SERE And NLM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEREAndNLM(SEREAndNLM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SERE And LM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SERE And LM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEREAndLM(SEREAndLM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SERE Within</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SERE Within</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEREWithin(SEREWithin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SequenceSwitch
