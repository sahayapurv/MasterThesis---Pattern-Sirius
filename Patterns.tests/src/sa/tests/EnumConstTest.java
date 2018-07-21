/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.EnumConst;
import sa.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum Const</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumConstTest extends ConstantTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumConstTest.class);
	}

	/**
	 * Constructs a new Enum Const test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enum Const test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumConst getFixture() {
		return (EnumConst)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createEnumConst());
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

} //EnumConstTest
