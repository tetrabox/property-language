/**
 */
package property;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see property.PropertyPackage
 * @generated
 */
public interface PropertyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertyFactory eINSTANCE = property.impl.PropertyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Property</em>'.
	 * @generated
	 */
	BooleanProperty createBooleanProperty();

	/**
	 * Returns a new object of class '<em>Always Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Always Property</em>'.
	 * @generated
	 */
	AlwaysProperty createAlwaysProperty();

	/**
	 * Returns a new object of class '<em>Never Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Never Boolean Property</em>'.
	 * @generated
	 */
	NeverBooleanProperty createNeverBooleanProperty();

	/**
	 * Returns a new object of class '<em>Never Sequence Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Never Sequence Property</em>'.
	 * @generated
	 */
	NeverSequenceProperty createNeverSequenceProperty();

	/**
	 * Returns a new object of class '<em>Sequence Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Property</em>'.
	 * @generated
	 */
	SequenceProperty createSequenceProperty();

	/**
	 * Returns a new object of class '<em>Sequence Tight Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Tight Property</em>'.
	 * @generated
	 */
	SequenceTightProperty createSequenceTightProperty();

	/**
	 * Returns a new object of class '<em>Next EProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next EProperty</em>'.
	 * @generated
	 */
	NextEProperty createNextEProperty();

	/**
	 * Returns a new object of class '<em>Next Event AProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next Event AProperty</em>'.
	 * @generated
	 */
	NextEventAProperty createNextEventAProperty();

	/**
	 * Returns a new object of class '<em>Eventually Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eventually Boolean Property</em>'.
	 * @generated
	 */
	EventuallyBooleanProperty createEventuallyBooleanProperty();

	/**
	 * Returns a new object of class '<em>Eventually Sequence Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eventually Sequence Property</em>'.
	 * @generated
	 */
	EventuallySequenceProperty createEventuallySequenceProperty();

	/**
	 * Returns a new object of class '<em>And Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Property</em>'.
	 * @generated
	 */
	AndProperty createAndProperty();

	/**
	 * Returns a new object of class '<em>Abort Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abort Property</em>'.
	 * @generated
	 */
	AbortProperty createAbortProperty();

	/**
	 * Returns a new object of class '<em>Or Property Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Property Boolean Property</em>'.
	 * @generated
	 */
	OrPropertyBooleanProperty createOrPropertyBooleanProperty();

	/**
	 * Returns a new object of class '<em>Or Boolean Property Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Boolean Property Property</em>'.
	 * @generated
	 */
	OrBooleanPropertyProperty createOrBooleanPropertyProperty();

	/**
	 * Returns a new object of class '<em>Implies Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implies Property</em>'.
	 * @generated
	 */
	ImpliesProperty createImpliesProperty();

	/**
	 * Returns a new object of class '<em>Suffix Implication Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suffix Implication Property</em>'.
	 * @generated
	 */
	SuffixImplicationProperty createSuffixImplicationProperty();

	/**
	 * Returns a new object of class '<em>Overlapping Suffix Implication Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overlapping Suffix Implication Property</em>'.
	 * @generated
	 */
	OverlappingSuffixImplicationProperty createOverlappingSuffixImplicationProperty();

	/**
	 * Returns a new object of class '<em>Equivalence Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalence Property</em>'.
	 * @generated
	 */
	EquivalenceProperty createEquivalenceProperty();

	/**
	 * Returns a new object of class '<em>Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Until Property</em>'.
	 * @generated
	 */
	UntilProperty createUntilProperty();

	/**
	 * Returns a new object of class '<em>Before Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Before Property</em>'.
	 * @generated
	 */
	BeforeProperty createBeforeProperty();

	/**
	 * Returns a new object of class '<em>Overlapping Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overlapping Until Property</em>'.
	 * @generated
	 */
	OverlappingUntilProperty createOverlappingUntilProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PropertyPackage getPropertyPackage();

} //PropertyFactory
