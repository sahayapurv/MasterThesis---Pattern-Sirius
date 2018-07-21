/**
 */
package sa.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import sa.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see sa.SaPackage
 * @generated
 */
public class SaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SaValidator INSTANCE = new SaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "sa";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SaPackage.SOFTWARE_ARCHITECTURE:
				return validateSoftwareArchitecture((SoftwareArchitecture)value, diagnostics, context);
			case SaPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case SaPackage.CONTROLLER:
				return validateController((Controller)value, diagnostics, context);
			case SaPackage.MESSAGE_PORT:
				return validateMessagePort((MessagePort)value, diagnostics, context);
			case SaPackage.IN_MESSAGE_PORT:
				return validateInMessagePort((InMessagePort)value, diagnostics, context);
			case SaPackage.OUT_MESSAGE_PORT:
				return validateOutMessagePort((OutMessagePort)value, diagnostics, context);
			case SaPackage.SA_ELEMENT:
				return validateSAElement((SAElement)value, diagnostics, context);
			case SaPackage.MODE:
				return validateMode((Mode)value, diagnostics, context);
			case SaPackage.INITIAL_MODE:
				return validateInitialMode((InitialMode)value, diagnostics, context);
			case SaPackage.EXTERNAL_MODE:
				return validateExternalMode((ExternalMode)value, diagnostics, context);
			case SaPackage.INTERNAL_CONTROLLER:
				return validateInternalController((InternalController)value, diagnostics, context);
			case SaPackage.ENTER_MODE:
				return validateEnterMode((EnterMode)value, diagnostics, context);
			case SaPackage.EXIT_MODE:
				return validateExitMode((ExitMode)value, diagnostics, context);
			case SaPackage.BEHAVIOURAL_ELEMENT:
				return validateBehaviouralElement((BehaviouralElement)value, diagnostics, context);
			case SaPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case SaPackage.CALL_ASYNC_SERVICE:
				return validateCallAsyncService((CallAsyncService)value, diagnostics, context);
			case SaPackage.CALL_SYNC_SERVICE:
				return validateCallSyncService((CallSyncService)value, diagnostics, context);
			case SaPackage.START_TIMER:
				return validateStartTimer((StartTimer)value, diagnostics, context);
			case SaPackage.STOP_TIMER:
				return validateStopTimer((StopTimer)value, diagnostics, context);
			case SaPackage.STORE_DATA:
				return validateStoreData((StoreData)value, diagnostics, context);
			case SaPackage.CONTROL_ACTION:
				return validateControlAction((ControlAction)value, diagnostics, context);
			case SaPackage.SEND_MESSAGE:
				return validateSendMessage((SendMessage)value, diagnostics, context);
			case SaPackage.BROADCAST_SEND_MESSAGE:
				return validateBroadcastSendMessage((BroadcastSendMessage)value, diagnostics, context);
			case SaPackage.UNICAST_SEND_MESSAGE:
				return validateUnicastSendMessage((UnicastSendMessage)value, diagnostics, context);
			case SaPackage.MULTICAST_SEND_MESSAGE:
				return validateMulticastSendMessage((MulticastSendMessage)value, diagnostics, context);
			case SaPackage.SENSE:
				return validateSense((Sense)value, diagnostics, context);
			case SaPackage.SENSE_POSITION:
				return validateSensePosition((SensePosition)value, diagnostics, context);
			case SaPackage.SENSE_ACCELEROMETER:
				return validateSenseAccelerometer((SenseAccelerometer)value, diagnostics, context);
			case SaPackage.ACTUATE:
				return validateActuate((Actuate)value, diagnostics, context);
			case SaPackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case SaPackage.FORK:
				return validateFork((Fork)value, diagnostics, context);
			case SaPackage.CHOICE:
				return validateChoice((Choice)value, diagnostics, context);
			case SaPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case SaPackage.SERVICE_CALLBACK:
				return validateServiceCallback((ServiceCallback)value, diagnostics, context);
			case SaPackage.SERVICE_CALL:
				return validateServiceCall((ServiceCall)value, diagnostics, context);
			case SaPackage.RECEIVE_MESSAGE:
				return validateReceiveMessage((ReceiveMessage)value, diagnostics, context);
			case SaPackage.TIMER_FIRED:
				return validateTimerFired((TimerFired)value, diagnostics, context);
			case SaPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case SaPackage.LINKABLE_ELEMENT:
				return validateLinkableElement((LinkableElement)value, diagnostics, context);
			case SaPackage.DATA_DECLARATION:
				return validateDataDeclaration((DataDeclaration)value, diagnostics, context);
			case SaPackage.PRIMITIVE_DATA_DECLARATION:
				return validatePrimitiveDataDeclaration((PrimitiveDataDeclaration)value, diagnostics, context);
			case SaPackage.STRUCTURED_DATA_DECLARATION:
				return validateStructuredDataDeclaration((StructuredDataDeclaration)value, diagnostics, context);
			case SaPackage.STRUCTURED_DATA_TYPE:
				return validateStructuredDataType((StructuredDataType)value, diagnostics, context);
			case SaPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case SaPackage.STRUCTURE:
				return validateStructure((Structure)value, diagnostics, context);
			case SaPackage.CONSTANT:
				return validateConstant((Constant)value, diagnostics, context);
			case SaPackage.INTEGER_CONST:
				return validateIntegerConst((IntegerConst)value, diagnostics, context);
			case SaPackage.BOOLEAN_CONST:
				return validateBooleanConst((BooleanConst)value, diagnostics, context);
			case SaPackage.REAL_CONST:
				return validateRealConst((RealConst)value, diagnostics, context);
			case SaPackage.STRING_CONST:
				return validateStringConst((StringConst)value, diagnostics, context);
			case SaPackage.ENUM_CONST:
				return validateEnumConst((EnumConst)value, diagnostics, context);
			case SaPackage.STRUCTURE_CONST:
				return validateStructureConst((StructureConst)value, diagnostics, context);
			case SaPackage.STRUCTURE_ELEMENT:
				return validateStructureElement((StructureElement)value, diagnostics, context);
			case SaPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case SaPackage.NULL_EXP:
				return validateNullExp((NullExp)value, diagnostics, context);
			case SaPackage.DATA_REF:
				return validateDataRef((DataRef)value, diagnostics, context);
			case SaPackage.STRUCTURE_MEMBER_REF:
				return validateStructureMemberRef((StructureMemberRef)value, diagnostics, context);
			case SaPackage.ARITHMETIC_EXPR:
				return validateArithmeticExpr((ArithmeticExpr)value, diagnostics, context);
			case SaPackage.BOOLEAN_EXPR:
				return validateBooleanExpr((BooleanExpr)value, diagnostics, context);
			case SaPackage.RELATIONAL_EXPR:
				return validateRelationalExpr((RelationalExpr)value, diagnostics, context);
			case SaPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case SaPackage.ARITHMETIC_OP:
				return validateArithmeticOp((ArithmeticOp)value, diagnostics, context);
			case SaPackage.BOOLEAN_OP:
				return validateBooleanOp((BooleanOp)value, diagnostics, context);
			case SaPackage.RELATIONAL_OP:
				return validateRelationalOp((RelationalOp)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareArchitecture(SoftwareArchitecture softwareArchitecture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softwareArchitecture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAElement_SAElementNameMustBeUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAElement_NameMustNotBeEmpty(component, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController(Controller controller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controller, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAElement_SAElementNameMustBeUnique(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAElement_NameMustNotBeEmpty(controller, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessagePort(MessagePort messagePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messagePort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInMessagePort(InMessagePort inMessagePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inMessagePort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutMessagePort(OutMessagePort outMessagePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outMessagePort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAElement(SAElement saElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(saElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(saElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(saElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(saElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(saElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(saElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(saElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(saElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(saElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAElement_SAElementNameMustBeUnique(saElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAElement_NameMustNotBeEmpty(saElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SAElementNameMustBeUnique constraint of '<em>SA Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SA_ELEMENT__SA_ELEMENT_NAME_MUST_BE_UNIQUE__EEXPRESSION = "SoftwareArchitecture.allInstances().SAElements->select(s : SAElement | s.name = self.name)->size() = 1";

	/**
	 * Validates the SAElementNameMustBeUnique constraint of '<em>SA Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAElement_SAElementNameMustBeUnique(SAElement saElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SaPackage.Literals.SA_ELEMENT,
				 saElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SAElementNameMustBeUnique",
				 SA_ELEMENT__SA_ELEMENT_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NameMustNotBeEmpty constraint of '<em>SA Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SA_ELEMENT__NAME_MUST_NOT_BE_EMPTY__EEXPRESSION = "name <> ''";

	/**
	 * Validates the NameMustNotBeEmpty constraint of '<em>SA Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAElement_NameMustNotBeEmpty(SAElement saElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SaPackage.Literals.SA_ELEMENT,
				 saElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameMustNotBeEmpty",
				 SA_ELEMENT__NAME_MUST_NOT_BE_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode(Mode mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validateMode_ModeNameMustBeUnique(mode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ModeNameMustBeUnique constraint of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODE__MODE_NAME_MUST_BE_UNIQUE__EEXPRESSION = "SAElement.allInstances().modes->select(s : Mode | s.name = self.name)->size() = 1";

	/**
	 * Validates the ModeNameMustBeUnique constraint of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode_ModeNameMustBeUnique(Mode mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SaPackage.Literals.MODE,
				 mode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModeNameMustBeUnique",
				 MODE__MODE_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialMode(InitialMode initialMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(initialMode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(initialMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(initialMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(initialMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(initialMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(initialMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(initialMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(initialMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(initialMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateMode_ModeNameMustBeUnique(initialMode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalMode(ExternalMode externalMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalMode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateMode_ModeNameMustBeUnique(externalMode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalController(InternalController internalController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalController, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalController, diagnostics, context);
		if (result || diagnostics != null) result &= validateMode_ModeNameMustBeUnique(internalController, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnterMode(EnterMode enterMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enterMode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enterMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enterMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enterMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enterMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enterMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enterMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enterMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enterMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(enterMode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitMode(ExitMode exitMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exitMode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exitMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exitMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exitMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exitMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exitMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exitMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exitMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exitMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(exitMode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviouralElement(BehaviouralElement behaviouralElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviouralElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviouralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviouralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviouralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviouralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviouralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviouralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviouralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviouralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(behaviouralElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the BehaviouralElementNameMustBeUnique constraint of '<em>Behavioural Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BEHAVIOURAL_ELEMENT__BEHAVIOURAL_ELEMENT_NAME_MUST_BE_UNIQUE__EEXPRESSION = "Mode.allInstances().behaviouralElements->select(s : BehaviouralElement | s.name = self.name)->size() = 1";

	/**
	 * Validates the BehaviouralElementNameMustBeUnique constraint of '<em>Behavioural Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviouralElement_BehaviouralElementNameMustBeUnique(BehaviouralElement behaviouralElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SaPackage.Literals.BEHAVIOURAL_ELEMENT,
				 behaviouralElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "BehaviouralElementNameMustBeUnique",
				 BEHAVIOURAL_ELEMENT__BEHAVIOURAL_ELEMENT_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(action, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAsyncService(CallAsyncService callAsyncService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callAsyncService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callAsyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callAsyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callAsyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callAsyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callAsyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callAsyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callAsyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callAsyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(callAsyncService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallSyncService(CallSyncService callSyncService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callSyncService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callSyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callSyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callSyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callSyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callSyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callSyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callSyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callSyncService, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(callSyncService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTimer(StartTimer startTimer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startTimer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(startTimer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopTimer(StopTimer stopTimer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stopTimer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stopTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stopTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stopTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stopTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stopTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stopTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stopTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stopTimer, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(stopTimer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreData(StoreData storeData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storeData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storeData, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(storeData, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlAction(ControlAction controlAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(controlAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendMessage(SendMessage sendMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendMessage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(sendMessage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSendMessage(BroadcastSendMessage broadcastSendMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(broadcastSendMessage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(broadcastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(broadcastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(broadcastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(broadcastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(broadcastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(broadcastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(broadcastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(broadcastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(broadcastSendMessage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnicastSendMessage(UnicastSendMessage unicastSendMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unicastSendMessage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(unicastSendMessage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMulticastSendMessage(MulticastSendMessage multicastSendMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multicastSendMessage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multicastSendMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(multicastSendMessage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSense(Sense sense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sense, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sense, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sense, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sense, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sense, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sense, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sense, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sense, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sense, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(sense, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensePosition(SensePosition sensePosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensePosition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sensePosition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensePosition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensePosition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sensePosition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensePosition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensePosition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensePosition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensePosition, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(sensePosition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenseAccelerometer(SenseAccelerometer senseAccelerometer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(senseAccelerometer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(senseAccelerometer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(senseAccelerometer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(senseAccelerometer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(senseAccelerometer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(senseAccelerometer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(senseAccelerometer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(senseAccelerometer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(senseAccelerometer, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(senseAccelerometer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuate(Actuate actuate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actuate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actuate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actuate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actuate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actuate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actuate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actuate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actuate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actuate, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(actuate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(join, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(join, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fork, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(fork, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoice(Choice choice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(choice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(choice, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(event, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCallback(ServiceCallback serviceCallback, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceCallback, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceCallback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceCallback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceCallback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceCallback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceCallback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceCallback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceCallback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceCallback, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(serviceCallback, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCall(ServiceCall serviceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(serviceCall, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiveMessage(ReceiveMessage receiveMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(receiveMessage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(receiveMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(receiveMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(receiveMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(receiveMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(receiveMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(receiveMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(receiveMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(receiveMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(receiveMessage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerFired(TimerFired timerFired, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timerFired, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timerFired, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timerFired, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timerFired, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timerFired, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timerFired, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timerFired, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timerFired, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timerFired, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(timerFired, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkableElement(LinkableElement linkableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralElement_BehaviouralElementNameMustBeUnique(linkableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataDeclaration(DataDeclaration dataDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveDataDeclaration(PrimitiveDataDeclaration primitiveDataDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveDataDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredDataDeclaration(StructuredDataDeclaration structuredDataDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredDataDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredDataType(StructuredDataType structuredDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructure(Structure structure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerConst(IntegerConst integerConst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerConst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanConst(BooleanConst booleanConst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanConst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealConst(RealConst realConst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realConst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringConst(StringConst stringConst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringConst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumConst(EnumConst enumConst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumConst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureConst(StructureConst structureConst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureConst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureElement(StructureElement structureElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullExp(NullExp nullExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRef(DataRef dataRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMemberRef(StructureMemberRef structureMemberRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMemberRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArithmeticExpr(ArithmeticExpr arithmeticExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arithmeticExpr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpr(BooleanExpr booleanExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanExpr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalExpr(RelationalExpr relationalExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationalExpr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArithmeticOp(ArithmeticOp arithmeticOp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOp(BooleanOp booleanOp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalOp(RelationalOp relationalOp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SaValidator
