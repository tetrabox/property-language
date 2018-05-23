/**
 */
package property.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import property.*;

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
 * @see property.PropertyPackage
 * @generated
 */
public class PropertySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertySwitch() {
		if (modelPackage == null) {
			modelPackage = PropertyPackage.eINSTANCE;
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
			case PropertyPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.UNARY_PROPERTY: {
				UnaryProperty<?> unaryProperty = (UnaryProperty<?>)theEObject;
				T result = caseUnaryProperty(unaryProperty);
				if (result == null) result = caseProperty(unaryProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.BINARY_PROPERTY: {
				BinaryProperty<?, ?> binaryProperty = (BinaryProperty<?, ?>)theEObject;
				T result = caseBinaryProperty(binaryProperty);
				if (result == null) result = caseProperty(binaryProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.BOOLEAN_PROPERTY: {
				BooleanProperty booleanProperty = (BooleanProperty)theEObject;
				T result = caseBooleanProperty(booleanProperty);
				if (result == null) result = caseUnaryProperty(booleanProperty);
				if (result == null) result = caseProperty(booleanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.ALWAYS_PROPERTY: {
				AlwaysProperty alwaysProperty = (AlwaysProperty)theEObject;
				T result = caseAlwaysProperty(alwaysProperty);
				if (result == null) result = caseUnaryProperty(alwaysProperty);
				if (result == null) result = caseProperty(alwaysProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.NEVER_BOOLEAN_PROPERTY: {
				NeverBooleanProperty neverBooleanProperty = (NeverBooleanProperty)theEObject;
				T result = caseNeverBooleanProperty(neverBooleanProperty);
				if (result == null) result = caseUnaryProperty(neverBooleanProperty);
				if (result == null) result = caseProperty(neverBooleanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.NEVER_SEQUENCE_PROPERTY: {
				NeverSequenceProperty neverSequenceProperty = (NeverSequenceProperty)theEObject;
				T result = caseNeverSequenceProperty(neverSequenceProperty);
				if (result == null) result = caseUnaryProperty(neverSequenceProperty);
				if (result == null) result = caseProperty(neverSequenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.SEQUENCE_PROPERTY: {
				SequenceProperty sequenceProperty = (SequenceProperty)theEObject;
				T result = caseSequenceProperty(sequenceProperty);
				if (result == null) result = caseUnaryProperty(sequenceProperty);
				if (result == null) result = caseProperty(sequenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.SEQUENCE_TIGHT_PROPERTY: {
				SequenceTightProperty sequenceTightProperty = (SequenceTightProperty)theEObject;
				T result = caseSequenceTightProperty(sequenceTightProperty);
				if (result == null) result = caseUnaryProperty(sequenceTightProperty);
				if (result == null) result = caseProperty(sequenceTightProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.NEXT_EPROPERTY: {
				NextEProperty nextEProperty = (NextEProperty)theEObject;
				T result = caseNextEProperty(nextEProperty);
				if (result == null) result = caseUnaryProperty(nextEProperty);
				if (result == null) result = caseProperty(nextEProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.NEXT_EVENT_APROPERTY: {
				NextEventAProperty nextEventAProperty = (NextEventAProperty)theEObject;
				T result = caseNextEventAProperty(nextEventAProperty);
				if (result == null) result = caseBinaryProperty(nextEventAProperty);
				if (result == null) result = caseProperty(nextEventAProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.EVENTUALLY_BOOLEAN_PROPERTY: {
				EventuallyBooleanProperty eventuallyBooleanProperty = (EventuallyBooleanProperty)theEObject;
				T result = caseEventuallyBooleanProperty(eventuallyBooleanProperty);
				if (result == null) result = caseUnaryProperty(eventuallyBooleanProperty);
				if (result == null) result = caseProperty(eventuallyBooleanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.EVENTUALLY_SEQUENCE_PROPERTY: {
				EventuallySequenceProperty eventuallySequenceProperty = (EventuallySequenceProperty)theEObject;
				T result = caseEventuallySequenceProperty(eventuallySequenceProperty);
				if (result == null) result = caseUnaryProperty(eventuallySequenceProperty);
				if (result == null) result = caseProperty(eventuallySequenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.AND_PROPERTY: {
				AndProperty andProperty = (AndProperty)theEObject;
				T result = caseAndProperty(andProperty);
				if (result == null) result = caseBinaryProperty(andProperty);
				if (result == null) result = caseProperty(andProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.ABORT_PROPERTY: {
				AbortProperty abortProperty = (AbortProperty)theEObject;
				T result = caseAbortProperty(abortProperty);
				if (result == null) result = caseBinaryProperty(abortProperty);
				if (result == null) result = caseProperty(abortProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.OR_PROPERTY_BOOLEAN_PROPERTY: {
				OrPropertyBooleanProperty orPropertyBooleanProperty = (OrPropertyBooleanProperty)theEObject;
				T result = caseOrPropertyBooleanProperty(orPropertyBooleanProperty);
				if (result == null) result = caseBinaryProperty(orPropertyBooleanProperty);
				if (result == null) result = caseProperty(orPropertyBooleanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.OR_BOOLEAN_PROPERTY_PROPERTY: {
				OrBooleanPropertyProperty orBooleanPropertyProperty = (OrBooleanPropertyProperty)theEObject;
				T result = caseOrBooleanPropertyProperty(orBooleanPropertyProperty);
				if (result == null) result = caseBinaryProperty(orBooleanPropertyProperty);
				if (result == null) result = caseProperty(orBooleanPropertyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.IMPLIES_PROPERTY: {
				ImpliesProperty impliesProperty = (ImpliesProperty)theEObject;
				T result = caseImpliesProperty(impliesProperty);
				if (result == null) result = caseBinaryProperty(impliesProperty);
				if (result == null) result = caseProperty(impliesProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.SUFFIX_IMPLICATION_PROPERTY: {
				SuffixImplicationProperty suffixImplicationProperty = (SuffixImplicationProperty)theEObject;
				T result = caseSuffixImplicationProperty(suffixImplicationProperty);
				if (result == null) result = caseBinaryProperty(suffixImplicationProperty);
				if (result == null) result = caseProperty(suffixImplicationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.OVERLAPPING_SUFFIX_IMPLICATION_PROPERTY: {
				OverlappingSuffixImplicationProperty overlappingSuffixImplicationProperty = (OverlappingSuffixImplicationProperty)theEObject;
				T result = caseOverlappingSuffixImplicationProperty(overlappingSuffixImplicationProperty);
				if (result == null) result = caseBinaryProperty(overlappingSuffixImplicationProperty);
				if (result == null) result = caseProperty(overlappingSuffixImplicationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.EQUIVALENCE_PROPERTY: {
				EquivalenceProperty equivalenceProperty = (EquivalenceProperty)theEObject;
				T result = caseEquivalenceProperty(equivalenceProperty);
				if (result == null) result = caseBinaryProperty(equivalenceProperty);
				if (result == null) result = caseProperty(equivalenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.UNTIL_PROPERTY: {
				UntilProperty untilProperty = (UntilProperty)theEObject;
				T result = caseUntilProperty(untilProperty);
				if (result == null) result = caseBinaryProperty(untilProperty);
				if (result == null) result = caseProperty(untilProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.BEFORE_PROPERTY: {
				BeforeProperty beforeProperty = (BeforeProperty)theEObject;
				T result = caseBeforeProperty(beforeProperty);
				if (result == null) result = caseBinaryProperty(beforeProperty);
				if (result == null) result = caseProperty(beforeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertyPackage.OVERLAPPING_UNTIL_PROPERTY: {
				OverlappingUntilProperty overlappingUntilProperty = (OverlappingUntilProperty)theEObject;
				T result = caseOverlappingUntilProperty(overlappingUntilProperty);
				if (result == null) result = caseBinaryProperty(overlappingUntilProperty);
				if (result == null) result = caseProperty(overlappingUntilProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <O> T caseUnaryProperty(UnaryProperty<O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <L, R> T caseBinaryProperty(BinaryProperty<L, R> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanProperty(BooleanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlwaysProperty(AlwaysProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Never Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Never Boolean Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeverBooleanProperty(NeverBooleanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Never Sequence Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Never Sequence Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeverSequenceProperty(NeverSequenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceProperty(SequenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Tight Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Tight Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceTightProperty(SequenceTightProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next EProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next EProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextEProperty(NextEProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Event AProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Event AProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextEventAProperty(NextEventAProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eventually Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eventually Boolean Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventuallyBooleanProperty(EventuallyBooleanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eventually Sequence Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eventually Sequence Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventuallySequenceProperty(EventuallySequenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndProperty(AndProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abort Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abort Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbortProperty(AbortProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Property Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Property Boolean Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrPropertyBooleanProperty(OrPropertyBooleanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Boolean Property Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Boolean Property Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrBooleanPropertyProperty(OrBooleanPropertyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliesProperty(ImpliesProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suffix Implication Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suffix Implication Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuffixImplicationProperty(SuffixImplicationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlapping Suffix Implication Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlapping Suffix Implication Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlappingSuffixImplicationProperty(OverlappingSuffixImplicationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalence Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalence Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalenceProperty(EquivalenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntilProperty(UntilProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Before Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Before Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeforeProperty(BeforeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlapping Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlapping Until Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlappingUntilProperty(OverlappingUntilProperty object) {
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

} //PropertySwitch
