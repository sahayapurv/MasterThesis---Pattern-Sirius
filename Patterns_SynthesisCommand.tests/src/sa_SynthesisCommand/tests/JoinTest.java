/**
 */
package sa_SynthesisCommand.tests;

import junit.textui.TestRunner;

import sa_SynthesisCommand.Join;
import sa_SynthesisCommand.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoinTest extends ControlActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JoinTest.class);
	}

	/**
	 * Constructs a new Join test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Join test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Join getFixture() {
		return (Join)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createJoin());
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

} //JoinTest
