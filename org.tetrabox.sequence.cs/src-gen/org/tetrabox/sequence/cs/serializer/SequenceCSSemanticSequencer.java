/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.sequence.cs.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.tetrabox.sequence.cs.services.SequenceCSGrammarAccess;
import sequence.BooleanConsecutiveRepetition;
import sequence.BooleanCountedConsecutiveRepetition;
import sequence.BooleanCountedGotoRepetition;
import sequence.BooleanCountedNonConsecutiveRepetition;
import sequence.BooleanLiteral;
import sequence.BracedSERE;
import sequence.ConcatenationSERE;
import sequence.Count;
import sequence.FusionSERE;
import sequence.LengthOne;
import sequence.NotSequenceTerminal;
import sequence.OCLExpression;
import sequence.Range;
import sequence.SEREAndLM;
import sequence.SEREAndNLM;
import sequence.SEREOr;
import sequence.SEREWithin;
import sequence.SequenceConsecutiveRepetition;
import sequence.SequenceCountedConsecutiveRepetition;
import sequence.SequencePackage;
import sequence.WildCard;

@SuppressWarnings("all")
public class SequenceCSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SequenceCSGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SequencePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SequencePackage.BOOLEAN_CONSECUTIVE_REPETITION:
				sequence_RepeatedSERE(context, (BooleanConsecutiveRepetition) semanticObject); 
				return; 
			case SequencePackage.BOOLEAN_COUNTED_CONSECUTIVE_REPETITION:
				sequence_RepeatedSERE(context, (BooleanCountedConsecutiveRepetition) semanticObject); 
				return; 
			case SequencePackage.BOOLEAN_COUNTED_GOTO_REPETITION:
				sequence_RepeatedSERE(context, (BooleanCountedGotoRepetition) semanticObject); 
				return; 
			case SequencePackage.BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION:
				sequence_RepeatedSERE(context, (BooleanCountedNonConsecutiveRepetition) semanticObject); 
				return; 
			case SequencePackage.BOOLEAN_LITERAL:
				sequence_SequenceTerminal(context, (BooleanLiteral) semanticObject); 
				return; 
			case SequencePackage.BRACED_SERE:
				sequence_BracedSERE(context, (BracedSERE) semanticObject); 
				return; 
			case SequencePackage.CONCATENATION_SERE:
				sequence_SERE(context, (ConcatenationSERE) semanticObject); 
				return; 
			case SequencePackage.COUNT:
				sequence_Count(context, (Count) semanticObject); 
				return; 
			case SequencePackage.FUSION_SERE:
				sequence_SERE(context, (FusionSERE) semanticObject); 
				return; 
			case SequencePackage.LENGTH_ONE:
				sequence_RepeatedSERE(context, (LengthOne) semanticObject); 
				return; 
			case SequencePackage.NOT_SEQUENCE_TERMINAL:
				sequence_SequenceTerminal(context, (NotSequenceTerminal) semanticObject); 
				return; 
			case SequencePackage.OCL_EXPRESSION:
				sequence_SequenceTerminal(context, (OCLExpression) semanticObject); 
				return; 
			case SequencePackage.RANGE:
				sequence_Range(context, (Range) semanticObject); 
				return; 
			case SequencePackage.SERE_AND_LM:
				sequence_BinaryCompoundSERE(context, (SEREAndLM) semanticObject); 
				return; 
			case SequencePackage.SERE_AND_NLM:
				sequence_BinaryCompoundSERE(context, (SEREAndNLM) semanticObject); 
				return; 
			case SequencePackage.SERE_OR:
				sequence_BinaryCompoundSERE(context, (SEREOr) semanticObject); 
				return; 
			case SequencePackage.SERE_WITHIN:
				sequence_BinaryCompoundSERE(context, (SEREWithin) semanticObject); 
				return; 
			case SequencePackage.SEQUENCE_CONSECUTIVE_REPETITION:
				sequence_RepeatedSERE(context, (SequenceConsecutiveRepetition) semanticObject); 
				return; 
			case SequencePackage.SEQUENCE_COUNTED_CONSECUTIVE_REPETITION:
				sequence_RepeatedSERE(context, (SequenceCountedConsecutiveRepetition) semanticObject); 
				return; 
			case SequencePackage.WILD_CARD:
				sequence_RepeatedSERE(context, (WildCard) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns SEREAndLM
	 *     SERE.ConcatenationSERE_1_1_1 returns SEREAndLM
	 *     SimpleSERE returns SEREAndLM
	 *     CompoundSERE returns SEREAndLM
	 *     BinaryCompoundSERE returns SEREAndLM
	 *
	 * Constraint:
	 *     ((left=RepeatedSERE | left=BracedSERE | left=BinaryCompoundSERE) (right=RepeatedSERE | right=BracedSERE | right=BinaryCompoundSERE))
	 */
	protected void sequence_BinaryCompoundSERE(ISerializationContext context, SEREAndLM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns SEREAndNLM
	 *     SERE.ConcatenationSERE_1_1_1 returns SEREAndNLM
	 *     SimpleSERE returns SEREAndNLM
	 *     CompoundSERE returns SEREAndNLM
	 *     BinaryCompoundSERE returns SEREAndNLM
	 *
	 * Constraint:
	 *     ((left=RepeatedSERE | left=BracedSERE | left=BinaryCompoundSERE) (right=RepeatedSERE | right=BracedSERE | right=BinaryCompoundSERE))
	 */
	protected void sequence_BinaryCompoundSERE(ISerializationContext context, SEREAndNLM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns SEREOr
	 *     SERE.ConcatenationSERE_1_1_1 returns SEREOr
	 *     SimpleSERE returns SEREOr
	 *     CompoundSERE returns SEREOr
	 *     BinaryCompoundSERE returns SEREOr
	 *
	 * Constraint:
	 *     ((left=RepeatedSERE | left=BracedSERE | left=BinaryCompoundSERE) (right=RepeatedSERE | right=BracedSERE | right=BinaryCompoundSERE))
	 */
	protected void sequence_BinaryCompoundSERE(ISerializationContext context, SEREOr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns SEREWithin
	 *     SERE.ConcatenationSERE_1_1_1 returns SEREWithin
	 *     SimpleSERE returns SEREWithin
	 *     CompoundSERE returns SEREWithin
	 *     BinaryCompoundSERE returns SEREWithin
	 *
	 * Constraint:
	 *     ((left=RepeatedSERE | left=BracedSERE | left=BinaryCompoundSERE) (right=RepeatedSERE | right=BracedSERE | right=BinaryCompoundSERE))
	 */
	protected void sequence_BinaryCompoundSERE(ISerializationContext context, SEREWithin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns BracedSERE
	 *     SERE.ConcatenationSERE_1_1_1 returns BracedSERE
	 *     SimpleSERE returns BracedSERE
	 *     Sequence returns BracedSERE
	 *     BracedSERE returns BracedSERE
	 *     CompoundSERE returns BracedSERE
	 *
	 * Constraint:
	 *     expression=SERE
	 */
	protected void sequence_BracedSERE(ISerializationContext context, BracedSERE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.BRACED_SERE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.BRACED_SERE__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBracedSEREAccess().getExpressionSEREParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Count returns Count
	 *
	 * Constraint:
	 *     COUNT=NUMBER
	 */
	protected void sequence_Count(ISerializationContext context, Count semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.COUNT__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.COUNT__COUNT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCountAccess().getCOUNTNUMBERParserRuleCall_0_0(), semanticObject.getCOUNT());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Count returns Range
	 *     Range returns Range
	 *
	 * Constraint:
	 *     (LOWER_BOUND=NUMBER HIGHER_BOUND=NUMBER)
	 */
	protected void sequence_Range(ISerializationContext context, Range semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.RANGE__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.RANGE__LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.RANGE__HIGHER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.RANGE__HIGHER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRangeAccess().getLOWER_BOUNDNUMBERParserRuleCall_0_0(), semanticObject.getLOWER_BOUND());
		feeder.accept(grammarAccess.getRangeAccess().getHIGHER_BOUNDNUMBERParserRuleCall_2_0(), semanticObject.getHIGHER_BOUND());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns BooleanConsecutiveRepetition
	 *     SERE.ConcatenationSERE_1_1_1 returns BooleanConsecutiveRepetition
	 *     SimpleSERE returns BooleanConsecutiveRepetition
	 *     Sequence returns BooleanConsecutiveRepetition
	 *     RepeatedSERE returns BooleanConsecutiveRepetition
	 *     CompoundSERE returns BooleanConsecutiveRepetition
	 *
	 * Constraint:
	 *     expression=SequenceTerminal
	 */
	protected void sequence_RepeatedSERE(ISerializationContext context, BooleanConsecutiveRepetition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.BOOLEAN_CONSECUTIVE_REPETITION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.BOOLEAN_CONSECUTIVE_REPETITION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_3_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns BooleanCountedConsecutiveRepetition
	 *     SERE.ConcatenationSERE_1_1_1 returns BooleanCountedConsecutiveRepetition
	 *     SimpleSERE returns BooleanCountedConsecutiveRepetition
	 *     Sequence returns BooleanCountedConsecutiveRepetition
	 *     RepeatedSERE returns BooleanCountedConsecutiveRepetition
	 *     CompoundSERE returns BooleanCountedConsecutiveRepetition
	 *
	 * Constraint:
	 *     (expression=SequenceTerminal count=Count?)
	 */
	protected void sequence_RepeatedSERE(ISerializationContext context, BooleanCountedConsecutiveRepetition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns BooleanCountedGotoRepetition
	 *     SERE.ConcatenationSERE_1_1_1 returns BooleanCountedGotoRepetition
	 *     SimpleSERE returns BooleanCountedGotoRepetition
	 *     Sequence returns BooleanCountedGotoRepetition
	 *     RepeatedSERE returns BooleanCountedGotoRepetition
	 *     CompoundSERE returns BooleanCountedGotoRepetition
	 *
	 * Constraint:
	 *     (expression=SequenceTerminal count=Count?)
	 */
	protected void sequence_RepeatedSERE(ISerializationContext context, BooleanCountedGotoRepetition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns BooleanCountedNonConsecutiveRepetition
	 *     SERE.ConcatenationSERE_1_1_1 returns BooleanCountedNonConsecutiveRepetition
	 *     SimpleSERE returns BooleanCountedNonConsecutiveRepetition
	 *     Sequence returns BooleanCountedNonConsecutiveRepetition
	 *     RepeatedSERE returns BooleanCountedNonConsecutiveRepetition
	 *     CompoundSERE returns BooleanCountedNonConsecutiveRepetition
	 *
	 * Constraint:
	 *     (expression=SequenceTerminal count=Count)
	 */
	protected void sequence_RepeatedSERE(ISerializationContext context, BooleanCountedNonConsecutiveRepetition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.BOOLEAN_COUNTED_NON_CONSECUTIVE_REPETITION__COUNT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRepeatedSEREAccess().getExpressionSequenceTerminalParserRuleCall_6_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getRepeatedSEREAccess().getCountCountParserRuleCall_6_3_0(), semanticObject.getCount());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns LengthOne
	 *     SERE.ConcatenationSERE_1_1_1 returns LengthOne
	 *     SimpleSERE returns LengthOne
	 *     Sequence returns LengthOne
	 *     RepeatedSERE returns LengthOne
	 *     CompoundSERE returns LengthOne
	 *
	 * Constraint:
	 *     {LengthOne}
	 */
	protected void sequence_RepeatedSERE(ISerializationContext context, LengthOne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns SequenceConsecutiveRepetition
	 *     SERE.ConcatenationSERE_1_1_1 returns SequenceConsecutiveRepetition
	 *     SimpleSERE returns SequenceConsecutiveRepetition
	 *     Sequence returns SequenceConsecutiveRepetition
	 *     RepeatedSERE returns SequenceConsecutiveRepetition
	 *     CompoundSERE returns SequenceConsecutiveRepetition
	 *
	 * Constraint:
	 *     (expression=BracedSERE | expression=RepeatedSERE)
	 */
	protected void sequence_RepeatedSERE(ISerializationContext context, SequenceConsecutiveRepetition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns SequenceCountedConsecutiveRepetition
	 *     SERE.ConcatenationSERE_1_1_1 returns SequenceCountedConsecutiveRepetition
	 *     SimpleSERE returns SequenceCountedConsecutiveRepetition
	 *     Sequence returns SequenceCountedConsecutiveRepetition
	 *     RepeatedSERE returns SequenceCountedConsecutiveRepetition
	 *     CompoundSERE returns SequenceCountedConsecutiveRepetition
	 *
	 * Constraint:
	 *     ((expression=BracedSERE count=Count?) | (expression=RepeatedSERE count=Count?))
	 */
	protected void sequence_RepeatedSERE(ISerializationContext context, SequenceCountedConsecutiveRepetition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns WildCard
	 *     SERE.ConcatenationSERE_1_1_1 returns WildCard
	 *     SimpleSERE returns WildCard
	 *     Sequence returns WildCard
	 *     RepeatedSERE returns WildCard
	 *     CompoundSERE returns WildCard
	 *
	 * Constraint:
	 *     count=Count?
	 */
	protected void sequence_RepeatedSERE(ISerializationContext context, WildCard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE returns ConcatenationSERE
	 *
	 * Constraint:
	 *     (left=SERE_ConcatenationSERE_1_1_1 right=SERE)
	 */
	protected void sequence_SERE(ISerializationContext context, ConcatenationSERE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.CONCATENATION_SERE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.CONCATENATION_SERE__LEFT));
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.CONCATENATION_SERE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.CONCATENATION_SERE__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSEREAccess().getConcatenationSERELeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSEREAccess().getRightSEREParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SERE returns FusionSERE
	 *
	 * Constraint:
	 *     (left=SERE_FusionSERE_1_0_1 right=SERE)
	 */
	protected void sequence_SERE(ISerializationContext context, FusionSERE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.FUSION_SERE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.FUSION_SERE__LEFT));
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.FUSION_SERE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.FUSION_SERE__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSEREAccess().getFusionSERELeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSEREAccess().getRightSEREParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns BooleanLiteral
	 *     SERE.ConcatenationSERE_1_1_1 returns BooleanLiteral
	 *     SimpleSERE returns BooleanLiteral
	 *     SequenceTerminal returns BooleanLiteral
	 *
	 * Constraint:
	 *     literal?='true'?
	 */
	protected void sequence_SequenceTerminal(ISerializationContext context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns NotSequenceTerminal
	 *     SERE.ConcatenationSERE_1_1_1 returns NotSequenceTerminal
	 *     SimpleSERE returns NotSequenceTerminal
	 *     SequenceTerminal returns NotSequenceTerminal
	 *
	 * Constraint:
	 *     literal=SequenceTerminal
	 */
	protected void sequence_SequenceTerminal(ISerializationContext context, NotSequenceTerminal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.NOT_SEQUENCE_TERMINAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.NOT_SEQUENCE_TERMINAL__LITERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSequenceTerminalAccess().getLiteralSequenceTerminalParserRuleCall_0_2_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SERE.FusionSERE_1_0_1 returns OCLExpression
	 *     SERE.ConcatenationSERE_1_1_1 returns OCLExpression
	 *     SimpleSERE returns OCLExpression
	 *     SequenceTerminal returns OCLExpression
	 *
	 * Constraint:
	 *     expression=STRING
	 */
	protected void sequence_SequenceTerminal(ISerializationContext context, OCLExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SequencePackage.Literals.OCL_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencePackage.Literals.OCL_EXPRESSION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSequenceTerminalAccess().getExpressionSTRINGTerminalRuleCall_2_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
}