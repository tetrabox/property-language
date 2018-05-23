/**
 */
package sequence.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sequence.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sequence.SequencePackage
 * @generated
 */
public class SequenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SequencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SequencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceSwitch<Adapter> modelSwitch =
		new SequenceSwitch<Adapter>() {
			@Override
			public Adapter caseSequenceTerminal(SequenceTerminal object) {
				return createSequenceTerminalAdapter();
			}
			@Override
			public Adapter caseOCLExpression(OCLExpression object) {
				return createOCLExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseNotSequenceTerminal(NotSequenceTerminal object) {
				return createNotSequenceTerminalAdapter();
			}
			@Override
			public Adapter caseSERE(SERE object) {
				return createSEREAdapter();
			}
			@Override
			public Adapter caseFusionSERE(FusionSERE object) {
				return createFusionSEREAdapter();
			}
			@Override
			public Adapter caseConcatenationSERE(ConcatenationSERE object) {
				return createConcatenationSEREAdapter();
			}
			@Override
			public Adapter caseSimpleSERE(SimpleSERE object) {
				return createSimpleSEREAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseRepeatedSERE(RepeatedSERE object) {
				return createRepeatedSEREAdapter();
			}
			@Override
			public Adapter caseWildCard(WildCard object) {
				return createWildCardAdapter();
			}
			@Override
			public Adapter caseLengthOne(LengthOne object) {
				return createLengthOneAdapter();
			}
			@Override
			public Adapter caseBooleanCountedConsecutiveRepetition(BooleanCountedConsecutiveRepetition object) {
				return createBooleanCountedConsecutiveRepetitionAdapter();
			}
			@Override
			public Adapter caseBooleanConsecutiveRepetition(BooleanConsecutiveRepetition object) {
				return createBooleanConsecutiveRepetitionAdapter();
			}
			@Override
			public Adapter caseBooleanCountedNonConsecutiveRepetition(BooleanCountedNonConsecutiveRepetition object) {
				return createBooleanCountedNonConsecutiveRepetitionAdapter();
			}
			@Override
			public Adapter caseBooleanCountedGotoRepetition(BooleanCountedGotoRepetition object) {
				return createBooleanCountedGotoRepetitionAdapter();
			}
			@Override
			public Adapter caseSequenceCountedConsecutiveRepetition(SequenceCountedConsecutiveRepetition object) {
				return createSequenceCountedConsecutiveRepetitionAdapter();
			}
			@Override
			public Adapter caseSequenceConsecutiveRepetition(SequenceConsecutiveRepetition object) {
				return createSequenceConsecutiveRepetitionAdapter();
			}
			@Override
			public Adapter caseBracedSERE(BracedSERE object) {
				return createBracedSEREAdapter();
			}
			@Override
			public Adapter caseCompoundSERE(CompoundSERE object) {
				return createCompoundSEREAdapter();
			}
			@Override
			public Adapter caseBinaryCompoundSERE(BinaryCompoundSERE object) {
				return createBinaryCompoundSEREAdapter();
			}
			@Override
			public Adapter caseSEREOr(SEREOr object) {
				return createSEREOrAdapter();
			}
			@Override
			public Adapter caseSEREAndNLM(SEREAndNLM object) {
				return createSEREAndNLMAdapter();
			}
			@Override
			public Adapter caseSEREAndLM(SEREAndLM object) {
				return createSEREAndLMAdapter();
			}
			@Override
			public Adapter caseSEREWithin(SEREWithin object) {
				return createSEREWithinAdapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sequence.SequenceTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.SequenceTerminal
	 * @generated
	 */
	public Adapter createSequenceTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.OCLExpression <em>OCL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.OCLExpression
	 * @generated
	 */
	public Adapter createOCLExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.NotSequenceTerminal <em>Not Sequence Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.NotSequenceTerminal
	 * @generated
	 */
	public Adapter createNotSequenceTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.SERE <em>SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.SERE
	 * @generated
	 */
	public Adapter createSEREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.FusionSERE <em>Fusion SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.FusionSERE
	 * @generated
	 */
	public Adapter createFusionSEREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.ConcatenationSERE <em>Concatenation SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.ConcatenationSERE
	 * @generated
	 */
	public Adapter createConcatenationSEREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.SimpleSERE <em>Simple SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.SimpleSERE
	 * @generated
	 */
	public Adapter createSimpleSEREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.RepeatedSERE <em>Repeated SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.RepeatedSERE
	 * @generated
	 */
	public Adapter createRepeatedSEREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.WildCard <em>Wild Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.WildCard
	 * @generated
	 */
	public Adapter createWildCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.LengthOne <em>Length One</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.LengthOne
	 * @generated
	 */
	public Adapter createLengthOneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.BooleanCountedConsecutiveRepetition <em>Boolean Counted Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.BooleanCountedConsecutiveRepetition
	 * @generated
	 */
	public Adapter createBooleanCountedConsecutiveRepetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.BooleanConsecutiveRepetition <em>Boolean Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.BooleanConsecutiveRepetition
	 * @generated
	 */
	public Adapter createBooleanConsecutiveRepetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.BooleanCountedNonConsecutiveRepetition <em>Boolean Counted Non Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.BooleanCountedNonConsecutiveRepetition
	 * @generated
	 */
	public Adapter createBooleanCountedNonConsecutiveRepetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.BooleanCountedGotoRepetition <em>Boolean Counted Goto Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.BooleanCountedGotoRepetition
	 * @generated
	 */
	public Adapter createBooleanCountedGotoRepetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.SequenceCountedConsecutiveRepetition <em>Counted Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.SequenceCountedConsecutiveRepetition
	 * @generated
	 */
	public Adapter createSequenceCountedConsecutiveRepetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.SequenceConsecutiveRepetition <em>Consecutive Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.SequenceConsecutiveRepetition
	 * @generated
	 */
	public Adapter createSequenceConsecutiveRepetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.BracedSERE <em>Braced SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.BracedSERE
	 * @generated
	 */
	public Adapter createBracedSEREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.CompoundSERE <em>Compound SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.CompoundSERE
	 * @generated
	 */
	public Adapter createCompoundSEREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.BinaryCompoundSERE <em>Binary Compound SERE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.BinaryCompoundSERE
	 * @generated
	 */
	public Adapter createBinaryCompoundSEREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.SEREOr <em>SERE Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.SEREOr
	 * @generated
	 */
	public Adapter createSEREOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.SEREAndNLM <em>SERE And NLM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.SEREAndNLM
	 * @generated
	 */
	public Adapter createSEREAndNLMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.SEREAndLM <em>SERE And LM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.SEREAndLM
	 * @generated
	 */
	public Adapter createSEREAndLMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.SEREWithin <em>SERE Within</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.SEREWithin
	 * @generated
	 */
	public Adapter createSEREWithinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SequenceAdapterFactory
