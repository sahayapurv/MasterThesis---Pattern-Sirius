/**
 */
package sa_SynthesisUtilize.tests;

import junit.textui.TestRunner;

import sa_SynthesisUtilize.Choice;
import sa_SynthesisUtilize.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChoiceTest extends ControlActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChoiceTest.class);
	}

	/**
	 * Constructs a new Choice test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Choice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Choice getFixture() {
		return (Choice)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createChoice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ChoiceTest
