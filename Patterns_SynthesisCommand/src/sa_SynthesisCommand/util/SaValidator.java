/**
 */
package sa_SynthesisCommand.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import sa_SynthesisCommand.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see sa_SynthesisCommand.SaPackage
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
	public static final String DIAGNOSTIC_SOURCE = "sa_SynthesisCommand";

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
		if (result || diagnostics != null) result &= validateSAElement_NameMustNotContainWhiteSpace(component, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSAElement_NameMustNotContainWhiteSpace(controller, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSAElement_NameMustNotContainWhiteSpace(saElement, diagnostics, context);
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
	 * The cached validation expression for the NameMustNotContainWhiteSpace constraint of '<em>SA Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SA_ELEMENT__NAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION = "name.toString().characters()->select(c : String | c= ' ')->size()=0";

	/**
	 * Validates the NameMustNotContainWhiteSpace constraint of '<em>SA Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAElement_NameMustNotContainWhiteSpace(SAElement saElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SaPackage.Literals.SA_ELEMENT,
				 saElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameMustNotContainWhiteSpace",
				 SA_ELEMENT__NAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateMode_NameMustNotContainWhiteSpace(mode, diagnostics, context);
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
	 * The cached validation expression for the NameMustNotContainWhiteSpace constraint of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODE__NAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION = "name.toString().characters()->select(c : String | c= ' ')->size()=0";

	/**
	 * Validates the NameMustNotContainWhiteSpace constraint of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode_NameMustNotContainWhiteSpace(Mode mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SaPackage.Literals.MODE,
				 mode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameMustNotContainWhiteSpace",
				 MODE__NAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateMode_NameMustNotContainWhiteSpace(initialMode, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateMode_NameMustNotContainWhiteSpace(externalMode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnterMode(EnterMode enterMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enterMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitMode(ExitMode exitMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exitMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviouralElement(BehaviouralElement behaviouralElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behaviouralElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAsyncService(CallAsyncService callAsyncService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callAsyncService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallSyncService(CallSyncService callSyncService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callSyncService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTimer(StartTimer startTimer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startTimer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopTimer(StopTimer stopTimer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stopTimer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreData(StoreData storeData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storeData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlAction(ControlAction controlAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendMessage(SendMessage sendMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSendMessage(BroadcastSendMessage broadcastSendMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(broadcastSendMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnicastSendMessage(UnicastSendMessage unicastSendMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unicastSendMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMulticastSendMessage(MulticastSendMessage multicastSendMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multicastSendMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSense(Sense sense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensePosition(SensePosition sensePosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensePosition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenseAccelerometer(SenseAccelerometer senseAccelerometer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senseAccelerometer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuate(Actuate actuate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(join, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoice(Choice choice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(choice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCallback(ServiceCallback serviceCallback, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceCallback, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCall(ServiceCall serviceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiveMessage(ReceiveMessage receiveMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receiveMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerFired(TimerFired timerFired, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timerFired, diagnostics, context);
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
		return validate_EveryDefaultConstraint(linkableElement, diagnostics, context);
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
