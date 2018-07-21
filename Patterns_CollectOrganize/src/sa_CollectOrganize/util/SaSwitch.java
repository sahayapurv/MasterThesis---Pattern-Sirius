/**
 */
package sa_CollectOrganize.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sa_CollectOrganize.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sa_CollectOrganize.SaPackage
 * @generated
 */
public class SaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaSwitch() {
		if (modelPackage == null) {
			modelPackage = SaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SaPackage.SOFTWARE_ARCHITECTURE: {
				SoftwareArchitecture softwareArchitecture = (SoftwareArchitecture)theEObject;
				T result = caseSoftwareArchitecture(softwareArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseSAElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = caseSAElement(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.SENSOR_CONTROLLER: {
				SensorController sensorController = (SensorController)theEObject;
				T result = caseSensorController(sensorController);
				if (result == null) result = caseSAElement(sensorController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.MESSAGE_PORT: {
				MessagePort messagePort = (MessagePort)theEObject;
				T result = caseMessagePort(messagePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.IN_MESSAGE_PORT: {
				InMessagePort inMessagePort = (InMessagePort)theEObject;
				T result = caseInMessagePort(inMessagePort);
				if (result == null) result = caseMessagePort(inMessagePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.OUT_MESSAGE_PORT: {
				OutMessagePort outMessagePort = (OutMessagePort)theEObject;
				T result = caseOutMessagePort(outMessagePort);
				if (result == null) result = caseMessagePort(outMessagePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.SA_ELEMENT: {
				SAElement saElement = (SAElement)theEObject;
				T result = caseSAElement(saElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.MODE: {
				Mode mode = (Mode)theEObject;
				T result = caseMode(mode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.INTERNAL_CONTROLLER: {
				InternalController internalController = (InternalController)theEObject;
				T result = caseInternalController(internalController);
				if (result == null) result = caseMode(internalController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.INITIAL_MODE: {
				InitialMode initialMode = (InitialMode)theEObject;
				T result = caseInitialMode(initialMode);
				if (result == null) result = caseMode(initialMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.EXTERNAL_MODE: {
				ExternalMode externalMode = (ExternalMode)theEObject;
				T result = caseExternalMode(externalMode);
				if (result == null) result = caseMode(externalMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.ENTER_MODE: {
				EnterMode enterMode = (EnterMode)theEObject;
				T result = caseEnterMode(enterMode);
				if (result == null) result = caseEvent(enterMode);
				if (result == null) result = caseLinkableElement(enterMode);
				if (result == null) result = caseBehaviouralElement(enterMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.EXIT_MODE: {
				ExitMode exitMode = (ExitMode)theEObject;
				T result = caseExitMode(exitMode);
				if (result == null) result = caseAction(exitMode);
				if (result == null) result = caseLinkableElement(exitMode);
				if (result == null) result = caseBehaviouralElement(exitMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.BEHAVIOURAL_ELEMENT: {
				BehaviouralElement behaviouralElement = (BehaviouralElement)theEObject;
				T result = caseBehaviouralElement(behaviouralElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseLinkableElement(action);
				if (result == null) result = caseBehaviouralElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.CALL_ASYNC_SERVICE: {
				CallAsyncService callAsyncService = (CallAsyncService)theEObject;
				T result = caseCallAsyncService(callAsyncService);
				if (result == null) result = caseAction(callAsyncService);
				if (result == null) result = caseLinkableElement(callAsyncService);
				if (result == null) result = caseBehaviouralElement(callAsyncService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.CALL_SYNC_SERVICE: {
				CallSyncService callSyncService = (CallSyncService)theEObject;
				T result = caseCallSyncService(callSyncService);
				if (result == null) result = caseAction(callSyncService);
				if (result == null) result = caseLinkableElement(callSyncService);
				if (result == null) result = caseBehaviouralElement(callSyncService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.START_TIMER: {
				StartTimer startTimer = (StartTimer)theEObject;
				T result = caseStartTimer(startTimer);
				if (result == null) result = caseAction(startTimer);
				if (result == null) result = caseLinkableElement(startTimer);
				if (result == null) result = caseBehaviouralElement(startTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.STOP_TIMER: {
				StopTimer stopTimer = (StopTimer)theEObject;
				T result = caseStopTimer(stopTimer);
				if (result == null) result = caseAction(stopTimer);
				if (result == null) result = caseLinkableElement(stopTimer);
				if (result == null) result = caseBehaviouralElement(stopTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.STORE_DATA: {
				StoreData storeData = (StoreData)theEObject;
				T result = caseStoreData(storeData);
				if (result == null) result = caseAction(storeData);
				if (result == null) result = caseLinkableElement(storeData);
				if (result == null) result = caseBehaviouralElement(storeData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.CONTROL_ACTION: {
				ControlAction controlAction = (ControlAction)theEObject;
				T result = caseControlAction(controlAction);
				if (result == null) result = caseAction(controlAction);
				if (result == null) result = caseLinkableElement(controlAction);
				if (result == null) result = caseBehaviouralElement(controlAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.SEND_MESSAGE: {
				SendMessage sendMessage = (SendMessage)theEObject;
				T result = caseSendMessage(sendMessage);
				if (result == null) result = caseAction(sendMessage);
				if (result == null) result = caseLinkableElement(sendMessage);
				if (result == null) result = caseBehaviouralElement(sendMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.BROADCAST_SEND_MESSAGE: {
				BroadcastSendMessage broadcastSendMessage = (BroadcastSendMessage)theEObject;
				T result = caseBroadcastSendMessage(broadcastSendMessage);
				if (result == null) result = caseSendMessage(broadcastSendMessage);
				if (result == null) result = caseAction(broadcastSendMessage);
				if (result == null) result = caseLinkableElement(broadcastSendMessage);
				if (result == null) result = caseBehaviouralElement(broadcastSendMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.UNICAST_SEND_MESSAGE: {
				UnicastSendMessage unicastSendMessage = (UnicastSendMessage)theEObject;
				T result = caseUnicastSendMessage(unicastSendMessage);
				if (result == null) result = caseSendMessage(unicastSendMessage);
				if (result == null) result = caseAction(unicastSendMessage);
				if (result == null) result = caseLinkableElement(unicastSendMessage);
				if (result == null) result = caseBehaviouralElement(unicastSendMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.MULTICAST_SEND_MESSAGE: {
				MulticastSendMessage multicastSendMessage = (MulticastSendMessage)theEObject;
				T result = caseMulticastSendMessage(multicastSendMessage);
				if (result == null) result = caseSendMessage(multicastSendMessage);
				if (result == null) result = caseAction(multicastSendMessage);
				if (result == null) result = caseLinkableElement(multicastSendMessage);
				if (result == null) result = caseBehaviouralElement(multicastSendMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.SENSE: {
				Sense sense = (Sense)theEObject;
				T result = caseSense(sense);
				if (result == null) result = caseAction(sense);
				if (result == null) result = caseLinkableElement(sense);
				if (result == null) result = caseBehaviouralElement(sense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.SENSE_POSITION: {
				SensePosition sensePosition = (SensePosition)theEObject;
				T result = caseSensePosition(sensePosition);
				if (result == null) result = caseAction(sensePosition);
				if (result == null) result = caseLinkableElement(sensePosition);
				if (result == null) result = caseBehaviouralElement(sensePosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.SENSE_ACCELEROMETER: {
				SenseAccelerometer senseAccelerometer = (SenseAccelerometer)theEObject;
				T result = caseSenseAccelerometer(senseAccelerometer);
				if (result == null) result = caseAction(senseAccelerometer);
				if (result == null) result = caseLinkableElement(senseAccelerometer);
				if (result == null) result = caseBehaviouralElement(senseAccelerometer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.ACTUATE: {
				Actuate actuate = (Actuate)theEObject;
				T result = caseActuate(actuate);
				if (result == null) result = caseAction(actuate);
				if (result == null) result = caseLinkableElement(actuate);
				if (result == null) result = caseBehaviouralElement(actuate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseControlAction(join);
				if (result == null) result = caseAction(join);
				if (result == null) result = caseLinkableElement(join);
				if (result == null) result = caseBehaviouralElement(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.FORK: {
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = caseControlAction(fork);
				if (result == null) result = caseAction(fork);
				if (result == null) result = caseLinkableElement(fork);
				if (result == null) result = caseBehaviouralElement(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseControlAction(choice);
				if (result == null) result = caseAction(choice);
				if (result == null) result = caseLinkableElement(choice);
				if (result == null) result = caseBehaviouralElement(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseLinkableElement(event);
				if (result == null) result = caseBehaviouralElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.SERVICE_CALLBACK: {
				ServiceCallback serviceCallback = (ServiceCallback)theEObject;
				T result = caseServiceCallback(serviceCallback);
				if (result == null) result = caseEvent(serviceCallback);
				if (result == null) result = caseLinkableElement(serviceCallback);
				if (result == null) result = caseBehaviouralElement(serviceCallback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.SERVICE_CALL: {
				ServiceCall serviceCall = (ServiceCall)theEObject;
				T result = caseServiceCall(serviceCall);
				if (result == null) result = caseEvent(serviceCall);
				if (result == null) result = caseLinkableElement(serviceCall);
				if (result == null) result = caseBehaviouralElement(serviceCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.RECEIVE_MESSAGE: {
				ReceiveMessage receiveMessage = (ReceiveMessage)theEObject;
				T result = caseReceiveMessage(receiveMessage);
				if (result == null) result = caseEvent(receiveMessage);
				if (result == null) result = caseLinkableElement(receiveMessage);
				if (result == null) result = caseBehaviouralElement(receiveMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.TIMER_FIRED: {
				TimerFired timerFired = (TimerFired)theEObject;
				T result = caseTimerFired(timerFired);
				if (result == null) result = caseEvent(timerFired);
				if (result == null) result = caseLinkableElement(timerFired);
				if (result == null) result = caseBehaviouralElement(timerFired);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.LINKABLE_ELEMENT: {
				LinkableElement linkableElement = (LinkableElement)theEObject;
				T result = caseLinkableElement(linkableElement);
				if (result == null) result = caseBehaviouralElement(linkableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.DATA_DECLARATION: {
				DataDeclaration dataDeclaration = (DataDeclaration)theEObject;
				T result = caseDataDeclaration(dataDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.PRIMITIVE_DATA_DECLARATION: {
				PrimitiveDataDeclaration primitiveDataDeclaration = (PrimitiveDataDeclaration)theEObject;
				T result = casePrimitiveDataDeclaration(primitiveDataDeclaration);
				if (result == null) result = caseDataDeclaration(primitiveDataDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.STRUCTURED_DATA_DECLARATION: {
				StructuredDataDeclaration structuredDataDeclaration = (StructuredDataDeclaration)theEObject;
				T result = caseStructuredDataDeclaration(structuredDataDeclaration);
				if (result == null) result = caseDataDeclaration(structuredDataDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.STRUCTURED_DATA_TYPE: {
				StructuredDataType structuredDataType = (StructuredDataType)theEObject;
				T result = caseStructuredDataType(structuredDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseStructuredDataType(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.STRUCTURE: {
				Structure structure = (Structure)theEObject;
				T result = caseStructure(structure);
				if (result == null) result = caseStructuredDataType(structure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseExpression(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.INTEGER_CONST: {
				IntegerConst integerConst = (IntegerConst)theEObject;
				T result = caseIntegerConst(integerConst);
				if (result == null) result = caseConstant(integerConst);
				if (result == null) result = caseExpression(integerConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.BOOLEAN_CONST: {
				BooleanConst booleanConst = (BooleanConst)theEObject;
				T result = caseBooleanConst(booleanConst);
				if (result == null) result = caseConstant(booleanConst);
				if (result == null) result = caseExpression(booleanConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.REAL_CONST: {
				RealConst realConst = (RealConst)theEObject;
				T result = caseRealConst(realConst);
				if (result == null) result = caseConstant(realConst);
				if (result == null) result = caseExpression(realConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.STRING_CONST: {
				StringConst stringConst = (StringConst)theEObject;
				T result = caseStringConst(stringConst);
				if (result == null) result = caseConstant(stringConst);
				if (result == null) result = caseExpression(stringConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.ENUM_CONST: {
				EnumConst enumConst = (EnumConst)theEObject;
				T result = caseEnumConst(enumConst);
				if (result == null) result = caseConstant(enumConst);
				if (result == null) result = caseExpression(enumConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.STRUCTURE_CONST: {
				StructureConst structureConst = (StructureConst)theEObject;
				T result = caseStructureConst(structureConst);
				if (result == null) result = caseConstant(structureConst);
				if (result == null) result = caseExpression(structureConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.STRUCTURE_ELEMENT: {
				StructureElement structureElement = (StructureElement)theEObject;
				T result = caseStructureElement(structureElement);
				if (result == null) result = caseStructuredDataType(structureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.NULL_EXP: {
				NullExp nullExp = (NullExp)theEObject;
				T result = caseNullExp(nullExp);
				if (result == null) result = caseExpression(nullExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.DATA_REF: {
				DataRef dataRef = (DataRef)theEObject;
				T result = caseDataRef(dataRef);
				if (result == null) result = caseExpression(dataRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.STRUCTURE_MEMBER_REF: {
				StructureMemberRef structureMemberRef = (StructureMemberRef)theEObject;
				T result = caseStructureMemberRef(structureMemberRef);
				if (result == null) result = caseExpression(structureMemberRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.ARITHMETIC_EXPR: {
				ArithmeticExpr arithmeticExpr = (ArithmeticExpr)theEObject;
				T result = caseArithmeticExpr(arithmeticExpr);
				if (result == null) result = caseExpression(arithmeticExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.BOOLEAN_EXPR: {
				BooleanExpr booleanExpr = (BooleanExpr)theEObject;
				T result = caseBooleanExpr(booleanExpr);
				if (result == null) result = caseExpression(booleanExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SaPackage.RELATIONAL_EXPR: {
				RelationalExpr relationalExpr = (RelationalExpr)theEObject;
				T result = caseRelationalExpr(relationalExpr);
				if (result == null) result = caseExpression(relationalExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareArchitecture(SoftwareArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorController(SensorController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessagePort(MessagePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Message Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInMessagePort(InMessagePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Message Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutMessagePort(OutMessagePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAElement(SAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalController(InternalController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialMode(InitialMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalMode(ExternalMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enter Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enter Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterMode(EnterMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitMode(ExitMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioural Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioural Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviouralElement(BehaviouralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Async Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Async Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallAsyncService(CallAsyncService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Sync Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Sync Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallSyncService(CallSyncService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartTimer(StartTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopTimer(StopTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreData(StoreData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlAction(ControlAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendMessage(SendMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Send Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastSendMessage(BroadcastSendMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unicast Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unicast Send Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnicastSendMessage(UnicastSendMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multicast Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multicast Send Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulticastSendMessage(MulticastSendMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSense(Sense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensePosition(SensePosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Accelerometer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Accelerometer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseAccelerometer(SenseAccelerometer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuate(Actuate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFork(Fork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallback(ServiceCallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCall(ServiceCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveMessage(ReceiveMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer Fired</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Fired</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimerFired(TimerFired object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkableElement(LinkableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDeclaration(DataDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Data Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Data Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDataDeclaration(PrimitiveDataDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Data Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Data Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDataDeclaration(StructuredDataDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDataType(StructuredDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConst(IntegerConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConst(BooleanConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealConst(RealConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConst(StringConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumConst(EnumConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureConst(StructureConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureElement(StructureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullExp(NullExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRef(DataRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Member Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Member Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMemberRef(StructureMemberRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpr(ArithmeticExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpr(BooleanExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalExpr(RelationalExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SaSwitch
