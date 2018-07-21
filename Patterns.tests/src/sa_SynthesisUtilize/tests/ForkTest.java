/**
 */
package sa_SynthesisUtilize.tests;

import junit.textui.TestRunner;

import sa_SynthesisUtilize.Fork;
import sa_SynthesisUtilize.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForkTest extends ControlActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForkTest.class);
	}

	/**
	 * Constructs a new Fork test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fork test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Fork getFixture() {
		return (Fork)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createFork());
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

} //ForkTest
