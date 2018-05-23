/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.property.cs.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.tetrabox.property.cs.services.PropertyCSGrammarAccess;
import org.tetrabox.sequence.cs.serializer.SequenceCSSemanticSequencer;
import property.AbortProperty;
import property.AlwaysProperty;
import property.AndProperty;
import property.BeforeProperty;
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
import property.PropertyPackage;
import property.SequenceProperty;
import property.SequenceTightProperty;
import property.SuffixImplicationProperty;
import property.UntilProperty;
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
public class PropertyCSSemanticSequencer extends SequenceCSSemanticSequencer {

	@Inject
	private PropertyCSGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PropertyPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PropertyPackage.ABORT_PROPERTY:
				sequence_Property(context, (AbortProperty) semanticObject); 
				return; 
			case PropertyPackage.ALWAYS_PROPERTY:
				sequence_UnaryProperty(context, (AlwaysProperty) semanticObject); 
				return; 
			case PropertyPackage.AND_PROPERTY:
				sequence_Property(context, (AndProperty) semanticObject); 
				return; 
			case PropertyPackage.BEFORE_PROPERTY:
				sequence_BinaryProperty(context, (BeforeProperty) semanticObject); 
				return; 
			case PropertyPackage.BOOLEAN_PROPERTY:
				sequence_UnaryProperty(context, (BooleanProperty) semanticObject); 
				return; 
			case PropertyPackage.DOCUMENT:
				sequence_Document(context, (Document) semanticObject); 
				return; 
			case PropertyPackage.EQUIVALENCE_PROPERTY:
				sequence_BinaryProperty(context, (EquivalenceProperty) semanticObject); 
				return; 
			case PropertyPackage.EVENTUALLY_BOOLEAN_PROPERTY:
				sequence_UnaryProperty(context, (EventuallyBooleanProperty) semanticObject); 
				return; 
			case PropertyPackage.EVENTUALLY_SEQUENCE_PROPERTY:
				sequence_UnaryProperty(context, (EventuallySequenceProperty) semanticObject); 
				return; 
			case PropertyPackage.IMPLIES_PROPERTY:
				sequence_BinaryProperty(context, (ImpliesProperty) semanticObject); 
				return; 
			case PropertyPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case PropertyPackage.NEVER_BOOLEAN_PROPERTY:
				sequence_UnaryProperty(context, (NeverBooleanProperty) semanticObject); 
				return; 
			case PropertyPackage.NEVER_SEQUENCE_PROPERTY:
				sequence_UnaryProperty(context, (NeverSequenceProperty) semanticObject); 
				return; 
			case PropertyPackage.NEXT_EPROPERTY:
				sequence_UnaryProperty(context, (NextEProperty) semanticObject); 
				return; 
			case PropertyPackage.NEXT_EVENT_APROPERTY:
				sequence_BinaryProperty(context, (NextEventAProperty) semanticObject); 
				return; 
			case PropertyPackage.OR_BOOLEAN_PROPERTY_PROPERTY:
				sequence_BinaryProperty(context, (OrBooleanPropertyProperty) semanticObject); 
				return; 
			case PropertyPackage.OR_PROPERTY_BOOLEAN_PROPERTY:
				sequence_Property(context, (OrPropertyBooleanProperty) semanticObject); 
				return; 
			case PropertyPackage.OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY:
				sequence_BinaryProperty(context, (OverlappingSuffixImplicationProperty) semanticObject); 
				return; 
			case PropertyPackage.OVERLAPPING_UNTIL_PROPERTY:
				sequence_BinaryProperty(context, (OverlappingUntilProperty) semanticObject); 
				return; 
			case PropertyPackage.SEQUENCE_PROPERTY:
				sequence_UnaryProperty(context, (SequenceProperty) semanticObject); 
				return; 
			case PropertyPackage.SEQUENCE_TIGHT_PROPERTY:
				sequence_UnaryProperty(context, (SequenceTightProperty) semanticObject); 
				return; 
			case PropertyPackage.SUFFIX_IMPLICATION_PROPERTY:
				sequence_BinaryProperty(context, (SuffixImplicationProperty) semanticObject); 
				return; 
			case PropertyPackage.UNTIL_PROPERTY:
				sequence_Property(context, (UntilProperty) semanticObject); 
				return; 
			}
		else if (epackage == SequencePackage.eINSTANCE)
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
	 *     Property returns BeforeProperty
	 *     BinaryProperty returns BeforeProperty
	 *
	 * Constraint:
	 *     (left=SequenceTerminal right=SequenceTerminal)
	 */
	protected void sequence_BinaryProperty(ISerializationContext context, BeforeProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT));
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_4_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getRightSequenceTerminalParserRuleCall_4_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns EquivalenceProperty
	 *     BinaryProperty returns EquivalenceProperty
	 *
	 * Constraint:
	 *     (left=SequenceTerminal right=SequenceTerminal)
	 */
	protected void sequence_BinaryProperty(ISerializationContext context, EquivalenceProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT));
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_2_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getRightSequenceTerminalParserRuleCall_2_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns ImpliesProperty
	 *     BinaryProperty returns ImpliesProperty
	 *
	 * Constraint:
	 *     (left=SequenceTerminal right=Property)
	 */
	protected void sequence_BinaryProperty(ISerializationContext context, ImpliesProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT));
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_1_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns NextEventAProperty
	 *     BinaryProperty returns NextEventAProperty
	 *
	 * Constraint:
	 *     (left=SequenceTerminal range=Range right=Property)
	 */
	protected void sequence_BinaryProperty(ISerializationContext context, NextEventAProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT));
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.NEXT_EVENT_APROPERTY__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.NEXT_EVENT_APROPERTY__RANGE));
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_7_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getRangeRangeParserRuleCall_7_6_0(), semanticObject.getRange());
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_7_9_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns OrBooleanPropertyProperty
	 *     BinaryProperty returns OrBooleanPropertyProperty
	 *
	 * Constraint:
	 *     (left=SequenceTerminal right=Property)
	 */
	protected void sequence_BinaryProperty(ISerializationContext context, OrBooleanPropertyProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT));
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_0_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns OverlappingSuffixImplicationProperty
	 *     BinaryProperty returns OverlappingSuffixImplicationProperty
	 *
	 * Constraint:
	 *     (left=Sequence right=Property)
	 */
	protected void sequence_BinaryProperty(ISerializationContext context, OverlappingSuffixImplicationProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT));
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getLeftSequenceParserRuleCall_6_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_6_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns OverlappingUntilProperty
	 *     BinaryProperty returns OverlappingUntilProperty
	 *
	 * Constraint:
	 *     (left=SequenceTerminal right=SequenceTerminal)
	 */
	protected void sequence_BinaryProperty(ISerializationContext context, OverlappingUntilProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT));
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getLeftSequenceTerminalParserRuleCall_3_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getRightSequenceTerminalParserRuleCall_3_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns SuffixImplicationProperty
	 *     BinaryProperty returns SuffixImplicationProperty
	 *
	 * Constraint:
	 *     (left=Sequence right=Property)
	 */
	protected void sequence_BinaryProperty(ISerializationContext context, SuffixImplicationProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__LEFT));
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.BINARY_PROPERTY__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getLeftSequenceParserRuleCall_5_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryPropertyAccess().getRightPropertyParserRuleCall_5_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Document returns Document
	 *
	 * Constraint:
	 *     (ownedImports+=Import* ownedProperties+=Property+)
	 */
	protected void sequence_Document(ISerializationContext context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importURI=IMPORT_URI
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportURIIMPORT_URITerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns AbortProperty
	 *
	 * Constraint:
	 *     ((left=UnaryProperty | left=BinaryProperty | left=UnaryProperty | left=BinaryProperty) right=SequenceTerminal)
	 */
	protected void sequence_Property(ISerializationContext context, AbortProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns AndProperty
	 *
	 * Constraint:
	 *     ((left=UnaryProperty | left=BinaryProperty | left=UnaryProperty | left=BinaryProperty) right=Property)
	 */
	protected void sequence_Property(ISerializationContext context, AndProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns OrPropertyBooleanProperty
	 *
	 * Constraint:
	 *     ((left=UnaryProperty | left=BinaryProperty | left=UnaryProperty | left=BinaryProperty) right=Property)
	 */
	protected void sequence_Property(ISerializationContext context, OrPropertyBooleanProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns UntilProperty
	 *
	 * Constraint:
	 *     ((left=UnaryProperty | left=BinaryProperty | left=UnaryProperty | left=BinaryProperty) right=SequenceTerminal)
	 */
	protected void sequence_Property(ISerializationContext context, UntilProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns AlwaysProperty
	 *     UnaryProperty returns AlwaysProperty
	 *
	 * Constraint:
	 *     operand=Property
	 */
	protected void sequence_UnaryProperty(ISerializationContext context, AlwaysProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPropertyAccess().getOperandPropertyParserRuleCall_3_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns BooleanProperty
	 *     UnaryProperty returns BooleanProperty
	 *
	 * Constraint:
	 *     operand=SequenceTerminal
	 */
	protected void sequence_UnaryProperty(ISerializationContext context, BooleanProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_0_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns EventuallyBooleanProperty
	 *     UnaryProperty returns EventuallyBooleanProperty
	 *
	 * Constraint:
	 *     operand=SequenceTerminal
	 */
	protected void sequence_UnaryProperty(ISerializationContext context, EventuallyBooleanProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_7_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns EventuallySequenceProperty
	 *     UnaryProperty returns EventuallySequenceProperty
	 *
	 * Constraint:
	 *     operand=Sequence
	 */
	protected void sequence_UnaryProperty(ISerializationContext context, EventuallySequenceProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_8_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns NeverBooleanProperty
	 *     UnaryProperty returns NeverBooleanProperty
	 *
	 * Constraint:
	 *     operand=SequenceTerminal
	 */
	protected void sequence_UnaryProperty(ISerializationContext context, NeverBooleanProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_4_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns NeverSequenceProperty
	 *     UnaryProperty returns NeverSequenceProperty
	 *
	 * Constraint:
	 *     operand=Sequence
	 */
	protected void sequence_UnaryProperty(ISerializationContext context, NeverSequenceProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_5_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns NextEProperty
	 *     UnaryProperty returns NextEProperty
	 *
	 * Constraint:
	 *     operand=SequenceTerminal
	 */
	protected void sequence_UnaryProperty(ISerializationContext context, NextEProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPropertyAccess().getOperandSequenceTerminalParserRuleCall_6_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns SequenceProperty
	 *     UnaryProperty returns SequenceProperty
	 *
	 * Constraint:
	 *     operand=Sequence
	 */
	protected void sequence_UnaryProperty(ISerializationContext context, SequenceProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_1_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns SequenceTightProperty
	 *     UnaryProperty returns SequenceTightProperty
	 *
	 * Constraint:
	 *     operand=Sequence
	 */
	protected void sequence_UnaryProperty(ISerializationContext context, SequenceTightProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.UNARY_PROPERTY__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPropertyAccess().getOperandSequenceParserRuleCall_2_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
}