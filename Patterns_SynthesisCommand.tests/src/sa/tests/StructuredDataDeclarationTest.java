/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.SaFactory;
import sa.StructuredDataDeclaration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredDataDeclarationTest extends DataDeclarationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructuredDataDeclarationTest.class);
	}

	/**
	 * Constructs a new Structured Data Declaration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDataDeclarationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structured Data Declaration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructuredDataDeclaration getFixture() {
		return (StructuredDataDeclaration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createStructuredDataDeclaration());
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

} //StructuredDataDeclarationTest
