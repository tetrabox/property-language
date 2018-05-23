/**
 */
package property.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import property.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see property.PropertyPackage
 * @generated
 */
public class PropertyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PropertyPackage.eINSTANCE;
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
	protected PropertySwitch<Adapter> modelSwitch =
		new PropertySwitch<Adapter>() {
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public <O> Adapter caseUnaryProperty(UnaryProperty<O> object) {
				return createUnaryPropertyAdapter();
			}
			@Override
			public <L, R> Adapter caseBinaryProperty(BinaryProperty<L, R> object) {
				return createBinaryPropertyAdapter();
			}
			@Override
			public Adapter caseBooleanProperty(BooleanProperty object) {
				return createBooleanPropertyAdapter();
			}
			@Override
			public Adapter caseAlwaysProperty(AlwaysProperty object) {
				return createAlwaysPropertyAdapter();
			}
			@Override
			public Adapter caseNeverBooleanProperty(NeverBooleanProperty object) {
				return createNeverBooleanPropertyAdapter();
			}
			@Override
			public Adapter caseNeverSequenceProperty(NeverSequenceProperty object) {
				return createNeverSequencePropertyAdapter();
			}
			@Override
			public Adapter caseSequenceProperty(SequenceProperty object) {
				return createSequencePropertyAdapter();
			}
			@Override
			public Adapter caseSequenceTightProperty(SequenceTightProperty object) {
				return createSequenceTightPropertyAdapter();
			}
			@Override
			public Adapter caseNextEProperty(NextEProperty object) {
				return createNextEPropertyAdapter();
			}
			@Override
			public Adapter caseNextEventAProperty(NextEventAProperty object) {
				return createNextEventAPropertyAdapter();
			}
			@Override
			public Adapter caseEventuallyBooleanProperty(EventuallyBooleanProperty object) {
				return createEventuallyBooleanPropertyAdapter();
			}
			@Override
			public Adapter caseEventuallySequenceProperty(EventuallySequenceProperty object) {
				return createEventuallySequencePropertyAdapter();
			}
			@Override
			public Adapter caseAndProperty(AndProperty object) {
				return createAndPropertyAdapter();
			}
			@Override
			public Adapter caseAbortProperty(AbortProperty object) {
				return createAbortPropertyAdapter();
			}
			@Override
			public Adapter caseOrPropertyBooleanProperty(OrPropertyBooleanProperty object) {
				return createOrPropertyBooleanPropertyAdapter();
			}
			@Override
			public Adapter caseOrBooleanPropertyProperty(OrBooleanPropertyProperty object) {
				return createOrBooleanPropertyPropertyAdapter();
			}
			@Override
			public Adapter caseImpliesProperty(ImpliesProperty object) {
				return createImpliesPropertyAdapter();
			}
			@Override
			public Adapter caseSuffixImplicationProperty(SuffixImplicationProperty object) {
				return createSuffixImplicationPropertyAdapter();
			}
			@Override
			public Adapter caseOverlappingSuffixImplicationProperty(OverlappingSuffixImplicationProperty object) {
				return createOverlappingSuffixImplicationPropertyAdapter();
			}
			@Override
			public Adapter caseEquivalenceProperty(EquivalenceProperty object) {
				return createEquivalencePropertyAdapter();
			}
			@Override
			public Adapter caseUntilProperty(UntilProperty object) {
				return createUntilPropertyAdapter();
			}
			@Override
			public Adapter caseBeforeProperty(BeforeProperty object) {
				return createBeforePropertyAdapter();
			}
			@Override
			public Adapter caseOverlappingUntilProperty(OverlappingUntilProperty object) {
				return createOverlappingUntilPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link property.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.UnaryProperty <em>Unary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.UnaryProperty
	 * @generated
	 */
	public Adapter createUnaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.BinaryProperty <em>Binary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.BinaryProperty
	 * @generated
	 */
	public Adapter createBinaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.BooleanProperty <em>Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.BooleanProperty
	 * @generated
	 */
	public Adapter createBooleanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.AlwaysProperty <em>Always Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.AlwaysProperty
	 * @generated
	 */
	public Adapter createAlwaysPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.NeverBooleanProperty <em>Never Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.NeverBooleanProperty
	 * @generated
	 */
	public Adapter createNeverBooleanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.NeverSequenceProperty <em>Never Sequence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.NeverSequenceProperty
	 * @generated
	 */
	public Adapter createNeverSequencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.SequenceProperty <em>Sequence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.SequenceProperty
	 * @generated
	 */
	public Adapter createSequencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.SequenceTightProperty <em>Sequence Tight Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.SequenceTightProperty
	 * @generated
	 */
	public Adapter createSequenceTightPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.NextEProperty <em>Next EProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.NextEProperty
	 * @generated
	 */
	public Adapter createNextEPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.NextEventAProperty <em>Next Event AProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.NextEventAProperty
	 * @generated
	 */
	public Adapter createNextEventAPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.EventuallyBooleanProperty <em>Eventually Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.EventuallyBooleanProperty
	 * @generated
	 */
	public Adapter createEventuallyBooleanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.EventuallySequenceProperty <em>Eventually Sequence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.EventuallySequenceProperty
	 * @generated
	 */
	public Adapter createEventuallySequencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.AndProperty <em>And Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.AndProperty
	 * @generated
	 */
	public Adapter createAndPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.AbortProperty <em>Abort Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.AbortProperty
	 * @generated
	 */
	public Adapter createAbortPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.OrPropertyBooleanProperty <em>Or Property Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.OrPropertyBooleanProperty
	 * @generated
	 */
	public Adapter createOrPropertyBooleanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.OrBooleanPropertyProperty <em>Or Boolean Property Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.OrBooleanPropertyProperty
	 * @generated
	 */
	public Adapter createOrBooleanPropertyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.ImpliesProperty <em>Implies Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.ImpliesProperty
	 * @generated
	 */
	public Adapter createImpliesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.SuffixImplicationProperty <em>Suffix Implication Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.SuffixImplicationProperty
	 * @generated
	 */
	public Adapter createSuffixImplicationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.OverlappingSuffixImplicationProperty <em>Overlapping Suffix Implication Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.OverlappingSuffixImplicationProperty
	 * @generated
	 */
	public Adapter createOverlappingSuffixImplicationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.EquivalenceProperty <em>Equivalence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.EquivalenceProperty
	 * @generated
	 */
	public Adapter createEquivalencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.UntilProperty <em>Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.UntilProperty
	 * @generated
	 */
	public Adapter createUntilPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.BeforeProperty <em>Before Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.BeforeProperty
	 * @generated
	 */
	public Adapter createBeforePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.OverlappingUntilProperty <em>Overlapping Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.OverlappingUntilProperty
	 * @generated
	 */
	public Adapter createOverlappingUntilPropertyAdapter() {
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

} //PropertyAdapterFactory
