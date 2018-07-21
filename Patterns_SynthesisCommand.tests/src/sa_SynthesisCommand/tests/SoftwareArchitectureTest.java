/**
 */
package sa_SynthesisCommand.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sa_SynthesisCommand.SaFactory;
import sa_SynthesisCommand.SoftwareArchitecture;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Architecture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareArchitectureTest extends TestCase {

	/**
	 * The fixture for this Software Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareArchitecture fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareArchitectureTest.class);
	}

	/**
	 * Constructs a new Software Architecture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareArchitectureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Software Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SoftwareArchitecture fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Software Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareArchitecture getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createSoftwareArchitecture());
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

} //SoftwareArchitectureTest
