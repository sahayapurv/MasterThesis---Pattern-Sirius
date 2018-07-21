/**
 */
package sa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sa.SaFactory
 * @model kind="package"
 * @generated
 */
public interface SaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.wsn.sa.collorg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "it.univaq.wsn.sa.collorg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SaPackage eINSTANCE = sa.impl.SaPackageImpl.init();

	/**
	 * The meta object id for the '{@link sa.impl.SoftwareArchitectureImpl <em>Software Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.SoftwareArchitectureImpl
	 * @see sa.impl.SaPackageImpl#getSoftwareArchitecture()
	 * @generated
	 */
	int SOFTWARE_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>SA Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__SA_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Software Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Software Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sa.impl.SAElementImpl <em>SA Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.SAElementImpl
	 * @see sa.impl.SaPackageImpl#getSAElement()
	 * @generated
	 */
	int SA_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_ELEMENT__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_ELEMENT__MODES = 2;

	/**
	 * The feature id for the '<em><b>Application Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_ELEMENT__APPLICATION_DATA = 3;

	/**
	 * The number of structural features of the '<em>SA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>SA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sa.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ComponentImpl
	 * @see sa.impl.SaPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = SA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = SA_ELEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MODES = SA_ELEMENT__MODES;

	/**
	 * The feature id for the '<em><b>Application Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__APPLICATION_DATA = SA_ELEMENT__APPLICATION_DATA;

	/**
	 * The feature id for the '<em><b>Has Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HAS_CONTROLLER = SA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = SA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = SA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ControllerImpl
	 * @see sa.impl.SaPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = SA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PORTS = SA_ELEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__MODES = SA_ELEMENT__MODES;

	/**
	 * The feature id for the '<em><b>Application Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__APPLICATION_DATA = SA_ELEMENT__APPLICATION_DATA;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = SA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = SA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.SensorControllerImpl <em>Sensor Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.SensorControllerImpl
	 * @see sa.impl.SaPackageImpl#getSensorController()
	 * @generated
	 */
	int SENSOR_CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CONTROLLER__NAME = SA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CONTROLLER__PORTS = SA_ELEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CONTROLLER__MODES = SA_ELEMENT__MODES;

	/**
	 * The feature id for the '<em><b>Application Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CONTROLLER__APPLICATION_DATA = SA_ELEMENT__APPLICATION_DATA;

	/**
	 * The number of structural features of the '<em>Sensor Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CONTROLLER_FEATURE_COUNT = SA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CONTROLLER_OPERATION_COUNT = SA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.MessagePortImpl <em>Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.MessagePortImpl
	 * @see sa.impl.SaPackageImpl#getMessagePort()
	 * @generated
	 */
	int MESSAGE_PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sa.impl.InMessagePortImpl <em>In Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.InMessagePortImpl
	 * @see sa.impl.SaPackageImpl#getInMessagePort()
	 * @generated
	 */
	int IN_MESSAGE_PORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MESSAGE_PORT__NAME = MESSAGE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Rcv msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MESSAGE_PORT__RCV_MSG = MESSAGE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MESSAGE_PORT_FEATURE_COUNT = MESSAGE_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>In Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MESSAGE_PORT_OPERATION_COUNT = MESSAGE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.OutMessagePortImpl <em>Out Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.OutMessagePortImpl
	 * @see sa.impl.SaPackageImpl#getOutMessagePort()
	 * @generated
	 */
	int OUT_MESSAGE_PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE_PORT__NAME = MESSAGE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Inmsg</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE_PORT__INMSG = MESSAGE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Out Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE_PORT_FEATURE_COUNT = MESSAGE_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Out Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE_PORT_OPERATION_COUNT = MESSAGE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ModeImpl
	 * @see sa.impl.SaPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Behavioural Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__BEHAVIOURAL_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ENTRIES = 2;

	/**
	 * The feature id for the '<em><b>Exits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__EXITS = 3;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sa.impl.InternalControllerImpl <em>Internal Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.InternalControllerImpl
	 * @see sa.impl.SaPackageImpl#getInternalController()
	 * @generated
	 */
	int INTERNAL_CONTROLLER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROLLER__NAME = MODE__NAME;

	/**
	 * The feature id for the '<em><b>Behavioural Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROLLER__BEHAVIOURAL_ELEMENTS = MODE__BEHAVIOURAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROLLER__ENTRIES = MODE__ENTRIES;

	/**
	 * The feature id for the '<em><b>Exits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROLLER__EXITS = MODE__EXITS;

	/**
	 * The number of structural features of the '<em>Internal Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROLLER_FEATURE_COUNT = MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROLLER_OPERATION_COUNT = MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.InitialModeImpl <em>Initial Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.InitialModeImpl
	 * @see sa.impl.SaPackageImpl#getInitialMode()
	 * @generated
	 */
	int INITIAL_MODE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODE__NAME = MODE__NAME;

	/**
	 * The feature id for the '<em><b>Behavioural Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODE__BEHAVIOURAL_ELEMENTS = MODE__BEHAVIOURAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODE__ENTRIES = MODE__ENTRIES;

	/**
	 * The feature id for the '<em><b>Exits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODE__EXITS = MODE__EXITS;

	/**
	 * The number of structural features of the '<em>Initial Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODE_OPERATION_COUNT = MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ExternalModeImpl <em>External Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ExternalModeImpl
	 * @see sa.impl.SaPackageImpl#getExternalMode()
	 * @generated
	 */
	int EXTERNAL_MODE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_MODE__NAME = MODE__NAME;

	/**
	 * The feature id for the '<em><b>Behavioural Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_MODE__BEHAVIOURAL_ELEMENTS = MODE__BEHAVIOURAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_MODE__ENTRIES = MODE__ENTRIES;

	/**
	 * The feature id for the '<em><b>Exits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_MODE__EXITS = MODE__EXITS;

	/**
	 * The number of structural features of the '<em>External Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_MODE_OPERATION_COUNT = MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.BehaviouralElementImpl <em>Behavioural Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.BehaviouralElementImpl
	 * @see sa.impl.SaPackageImpl#getBehaviouralElement()
	 * @generated
	 */
	int BEHAVIOURAL_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Behavioural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavioural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sa.impl.LinkableElementImpl <em>Linkable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.LinkableElementImpl
	 * @see sa.impl.SaPackageImpl#getLinkableElement()
	 * @generated
	 */
	int LINKABLE_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT__NAME = BEHAVIOURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT__OUTGOING = BEHAVIOURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT__IN_ACTION = BEHAVIOURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linkable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT_FEATURE_COUNT = BEHAVIOURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Linkable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT_OPERATION_COUNT = BEHAVIOURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.EventImpl
	 * @see sa.impl.SaPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = LINKABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTGOING = LINKABLE_ELEMENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IN_ACTION = LINKABLE_ELEMENT__IN_ACTION;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = LINKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = LINKABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.EnterModeImpl <em>Enter Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.EnterModeImpl
	 * @see sa.impl.SaPackageImpl#getEnterMode()
	 * @generated
	 */
	int ENTER_MODE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_MODE__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_MODE__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_MODE__IN_ACTION = EVENT__IN_ACTION;

	/**
	 * The number of structural features of the '<em>Enter Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_MODE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enter Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_MODE_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ActionImpl
	 * @see sa.impl.SaPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = LINKABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = LINKABLE_ELEMENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IN_ACTION = LINKABLE_ELEMENT__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING = LINKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = LINKABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = LINKABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ExitModeImpl <em>Exit Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ExitModeImpl
	 * @see sa.impl.SaPackageImpl#getExitMode()
	 * @generated
	 */
	int EXIT_MODE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_MODE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_MODE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_MODE__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_MODE__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Target Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_MODE__TARGET_MODE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exit Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_MODE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exit Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_MODE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.CallAsyncServiceImpl <em>Call Async Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.CallAsyncServiceImpl
	 * @see sa.impl.SaPackageImpl#getCallAsyncService()
	 * @generated
	 */
	int CALL_ASYNC_SERVICE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ASYNC_SERVICE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ASYNC_SERVICE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ASYNC_SERVICE__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ASYNC_SERVICE__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ASYNC_SERVICE__DATA_EXP = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ASYNC_SERVICE__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Async Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ASYNC_SERVICE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call Async Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ASYNC_SERVICE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.CallSyncServiceImpl <em>Call Sync Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.CallSyncServiceImpl
	 * @see sa.impl.SaPackageImpl#getCallSyncService()
	 * @generated
	 */
	int CALL_SYNC_SERVICE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SYNC_SERVICE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SYNC_SERVICE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SYNC_SERVICE__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SYNC_SERVICE__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SYNC_SERVICE__DATA_EXP = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SYNC_SERVICE__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SYNC_SERVICE__DATA_RECIPIENT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Call Sync Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SYNC_SERVICE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Call Sync Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SYNC_SERVICE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StartTimerImpl <em>Start Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StartTimerImpl
	 * @see sa.impl.SaPackageImpl#getStartTimer()
	 * @generated
	 */
	int START_TIMER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Cyclic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__CYCLIC = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__DELAY = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__PERIOD = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Start Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Start Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StopTimerImpl <em>Stop Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StopTimerImpl
	 * @see sa.impl.SaPackageImpl#getStopTimer()
	 * @generated
	 */
	int STOP_TIMER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIMER__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIMER__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIMER__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIMER__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIMER__TIMER = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stop Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIMER_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stop Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIMER_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StoreDataImpl <em>Store Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StoreDataImpl
	 * @see sa.impl.SaPackageImpl#getStoreData()
	 * @generated
	 */
	int STORE_DATA = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA__DATA_RECIPIENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA__DATA_EXP = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA__DATA = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Store Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Store Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ControlActionImpl <em>Control Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ControlActionImpl
	 * @see sa.impl.SaPackageImpl#getControlAction()
	 * @generated
	 */
	int CONTROL_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.SendMessageImpl <em>Send Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.SendMessageImpl
	 * @see sa.impl.SaPackageImpl#getSendMessage()
	 * @generated
	 */
	int SEND_MESSAGE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__DATA_EXP = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__TO_MESSAGE_PORTS = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.BroadcastSendMessageImpl <em>Broadcast Send Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.BroadcastSendMessageImpl
	 * @see sa.impl.SaPackageImpl#getBroadcastSendMessage()
	 * @generated
	 */
	int BROADCAST_SEND_MESSAGE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SEND_MESSAGE__NAME = SEND_MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SEND_MESSAGE__OUTGOING = SEND_MESSAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SEND_MESSAGE__IN_ACTION = SEND_MESSAGE__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SEND_MESSAGE__INCOMING = SEND_MESSAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SEND_MESSAGE__DATA_EXP = SEND_MESSAGE__DATA_EXP;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SEND_MESSAGE__DATA = SEND_MESSAGE__DATA;

	/**
	 * The feature id for the '<em><b>To Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SEND_MESSAGE__TO_MESSAGE_PORTS = SEND_MESSAGE__TO_MESSAGE_PORTS;

	/**
	 * The number of structural features of the '<em>Broadcast Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SEND_MESSAGE_FEATURE_COUNT = SEND_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Broadcast Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SEND_MESSAGE_OPERATION_COUNT = SEND_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.UnicastSendMessageImpl <em>Unicast Send Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.UnicastSendMessageImpl
	 * @see sa.impl.SaPackageImpl#getUnicastSendMessage()
	 * @generated
	 */
	int UNICAST_SEND_MESSAGE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE__NAME = SEND_MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE__OUTGOING = SEND_MESSAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE__IN_ACTION = SEND_MESSAGE__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE__INCOMING = SEND_MESSAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE__DATA_EXP = SEND_MESSAGE__DATA_EXP;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE__DATA = SEND_MESSAGE__DATA;

	/**
	 * The feature id for the '<em><b>To Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE__TO_MESSAGE_PORTS = SEND_MESSAGE__TO_MESSAGE_PORTS;

	/**
	 * The feature id for the '<em><b>Receiver Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE__RECEIVER_NAME = SEND_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unicast Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE_FEATURE_COUNT = SEND_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unicast Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_SEND_MESSAGE_OPERATION_COUNT = SEND_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.MulticastSendMessageImpl <em>Multicast Send Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.MulticastSendMessageImpl
	 * @see sa.impl.SaPackageImpl#getMulticastSendMessage()
	 * @generated
	 */
	int MULTICAST_SEND_MESSAGE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE__NAME = SEND_MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE__OUTGOING = SEND_MESSAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE__IN_ACTION = SEND_MESSAGE__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE__INCOMING = SEND_MESSAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE__DATA_EXP = SEND_MESSAGE__DATA_EXP;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE__DATA = SEND_MESSAGE__DATA;

	/**
	 * The feature id for the '<em><b>To Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE__TO_MESSAGE_PORTS = SEND_MESSAGE__TO_MESSAGE_PORTS;

	/**
	 * The feature id for the '<em><b>Receiver Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE__RECEIVER_NAMES = SEND_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multicast Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE_FEATURE_COUNT = SEND_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multicast Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_SEND_MESSAGE_OPERATION_COUNT = SEND_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.SenseImpl <em>Sense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.SenseImpl
	 * @see sa.impl.SaPackageImpl#getSense()
	 * @generated
	 */
	int SENSE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Declaration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE__DATA_DECLARATION_NAME = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE__DATA_RECIPIENT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.SensePositionImpl <em>Sense Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.SensePositionImpl
	 * @see sa.impl.SaPackageImpl#getSensePosition()
	 * @generated
	 */
	int SENSE_POSITION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Declaration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION__DATA_DECLARATION_NAME = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION__DATA_RECIPIENT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sense Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sense Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.SenseAccelerometerImpl <em>Sense Accelerometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.SenseAccelerometerImpl
	 * @see sa.impl.SaPackageImpl#getSenseAccelerometer()
	 * @generated
	 */
	int SENSE_ACCELEROMETER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_ACCELEROMETER__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_ACCELEROMETER__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_ACCELEROMETER__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_ACCELEROMETER__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Declaration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_ACCELEROMETER__DATA_DECLARATION_NAME = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_ACCELEROMETER__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_ACCELEROMETER__DATA_RECIPIENT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sense Accelerometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_ACCELEROMETER_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sense Accelerometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_ACCELEROMETER_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ActuateImpl <em>Actuate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ActuateImpl
	 * @see sa.impl.SaPackageImpl#getActuate()
	 * @generated
	 */
	int ACTUATE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE__IN_ACTION = ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Data Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE__DATA_EXP = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actuate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actuate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.JoinImpl
	 * @see sa.impl.SaPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = CONTROL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUTGOING = CONTROL_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__IN_ACTION = CONTROL_ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INCOMING = CONTROL_ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = CONTROL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = CONTROL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ForkImpl
	 * @see sa.impl.SaPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = CONTROL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OUTGOING = CONTROL_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__IN_ACTION = CONTROL_ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__INCOMING = CONTROL_ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = CONTROL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = CONTROL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ChoiceImpl
	 * @see sa.impl.SaPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = CONTROL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__OUTGOING = CONTROL_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__IN_ACTION = CONTROL_ACTION__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__INCOMING = CONTROL_ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = CONTROL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = CONTROL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ServiceCallbackImpl <em>Service Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ServiceCallbackImpl
	 * @see sa.impl.SaPackageImpl#getServiceCallback()
	 * @generated
	 */
	int SERVICE_CALLBACK = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALLBACK__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALLBACK__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALLBACK__IN_ACTION = EVENT__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALLBACK__SERVICE_NAME = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALLBACK__CALLED_SERVICE = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALLBACK__DATA_RECIPIENT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALLBACK_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Service Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALLBACK_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ServiceCallImpl <em>Service Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ServiceCallImpl
	 * @see sa.impl.SaPackageImpl#getServiceCall()
	 * @generated
	 */
	int SERVICE_CALL = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__IN_ACTION = EVENT__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__SERVICE_NAME = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__DATA_RECIPIENT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ReceiveMessageImpl <em>Receive Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ReceiveMessageImpl
	 * @see sa.impl.SaPackageImpl#getReceiveMessage()
	 * @generated
	 */
	int RECEIVE_MESSAGE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__IN_ACTION = EVENT__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Data Recipient Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__DATA_RECIPIENT_NAME = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__FROM_MESSAGE_PORTS = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__DATA_RECIPIENT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Receive Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Receive Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.TimerFiredImpl <em>Timer Fired</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.TimerFiredImpl
	 * @see sa.impl.SaPackageImpl#getTimerFired()
	 * @generated
	 */
	int TIMER_FIRED = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FIRED__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FIRED__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FIRED__IN_ACTION = EVENT__IN_ACTION;

	/**
	 * The feature id for the '<em><b>Timer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FIRED__TIMER_NAME = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FIRED__TIMER = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timer Fired</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FIRED_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timer Fired</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FIRED_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.LinkImpl
	 * @see sa.impl.SaPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 38;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Condition Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONDITION_EXP = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 4;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sa.impl.DataDeclarationImpl <em>Data Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.DataDeclarationImpl
	 * @see sa.impl.SaPackageImpl#getDataDeclaration()
	 * @generated
	 */
	int DATA_DECLARATION = 40;

	/**
	 * The feature id for the '<em><b>Data Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__DATA_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Data Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sa.impl.PrimitiveDataDeclarationImpl <em>Primitive Data Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.PrimitiveDataDeclarationImpl
	 * @see sa.impl.SaPackageImpl#getPrimitiveDataDeclaration()
	 * @generated
	 */
	int PRIMITIVE_DATA_DECLARATION = 41;

	/**
	 * The feature id for the '<em><b>Data Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_DECLARATION__DATA_NAME = DATA_DECLARATION__DATA_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_DECLARATION__VALUE = DATA_DECLARATION__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_DECLARATION__NAME = DATA_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_DECLARATION__TYPE = DATA_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_DECLARATION__VALUE_EXP = DATA_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Data Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_DECLARATION_FEATURE_COUNT = DATA_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Data Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_DECLARATION_OPERATION_COUNT = DATA_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StructuredDataDeclarationImpl <em>Structured Data Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StructuredDataDeclarationImpl
	 * @see sa.impl.SaPackageImpl#getStructuredDataDeclaration()
	 * @generated
	 */
	int STRUCTURED_DATA_DECLARATION = 42;

	/**
	 * The feature id for the '<em><b>Data Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_DECLARATION__DATA_NAME = DATA_DECLARATION__DATA_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_DECLARATION__VALUE = DATA_DECLARATION__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_DECLARATION__NAME = DATA_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_DECLARATION__TYPE_EXP = DATA_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_DECLARATION__TYPE = DATA_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structured Data Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_DECLARATION_FEATURE_COUNT = DATA_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structured Data Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_DECLARATION_OPERATION_COUNT = DATA_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StructuredDataTypeImpl <em>Structured Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StructuredDataTypeImpl
	 * @see sa.impl.SaPackageImpl#getStructuredDataType()
	 * @generated
	 */
	int STRUCTURED_DATA_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Structured Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Structured Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sa.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.EnumerationImpl
	 * @see sa.impl.SaPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = STRUCTURED_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = STRUCTURED_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StructureImpl
	 * @see sa.impl.SaPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__NAME = STRUCTURED_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__MEMBERS = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = STRUCTURED_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ExpressionImpl
	 * @see sa.impl.SaPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sa.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ConstantImpl
	 * @see sa.impl.SaPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.IntegerConstImpl <em>Integer Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.IntegerConstImpl
	 * @see sa.impl.SaPackageImpl#getIntegerConst()
	 * @generated
	 */
	int INTEGER_CONST = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONST__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONST__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONST_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONST_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.BooleanConstImpl <em>Boolean Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.BooleanConstImpl
	 * @see sa.impl.SaPackageImpl#getBooleanConst()
	 * @generated
	 */
	int BOOLEAN_CONST = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONST__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONST__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONST_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONST_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.RealConstImpl <em>Real Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.RealConstImpl
	 * @see sa.impl.SaPackageImpl#getRealConst()
	 * @generated
	 */
	int REAL_CONST = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONST__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONST__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONST_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONST_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StringConstImpl <em>String Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StringConstImpl
	 * @see sa.impl.SaPackageImpl#getStringConst()
	 * @generated
	 */
	int STRING_CONST = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONST__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONST__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONST_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONST_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.EnumConstImpl <em>Enum Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.EnumConstImpl
	 * @see sa.impl.SaPackageImpl#getEnumConst()
	 * @generated
	 */
	int ENUM_CONST = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONST__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONST__ENUMERATION = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONST__VALUE = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONST_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONST_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StructureConstImpl <em>Structure Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StructureConstImpl
	 * @see sa.impl.SaPackageImpl#getStructureConst()
	 * @generated
	 */
	int STRUCTURE_CONST = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_CONST__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_CONST__VALUES = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_CONST_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_CONST_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StructureElementImpl <em>Structure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StructureElementImpl
	 * @see sa.impl.SaPackageImpl#getStructureElement()
	 * @generated
	 */
	int STRUCTURE_ELEMENT = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__NAME = STRUCTURED_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__MEMBER = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__VALUE = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_FEATURE_COUNT = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_OPERATION_COUNT = STRUCTURED_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.NullExpImpl <em>Null Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.NullExpImpl
	 * @see sa.impl.SaPackageImpl#getNullExp()
	 * @generated
	 */
	int NULL_EXP = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXP__NAME = EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Null Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.DataRefImpl <em>Data Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.DataRefImpl
	 * @see sa.impl.SaPackageImpl#getDataRef()
	 * @generated
	 */
	int DATA_REF = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REF__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REF__DECLARATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.StructureMemberRefImpl <em>Structure Member Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.StructureMemberRefImpl
	 * @see sa.impl.SaPackageImpl#getStructureMemberRef()
	 * @generated
	 */
	int STRUCTURE_MEMBER_REF = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MEMBER_REF__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MEMBER_REF__STRUCTURE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MEMBER_REF__MEMBER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structure Member Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MEMBER_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structure Member Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MEMBER_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.ArithmeticExprImpl <em>Arithmetic Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.ArithmeticExprImpl
	 * @see sa.impl.SaPackageImpl#getArithmeticExpr()
	 * @generated
	 */
	int ARITHMETIC_EXPR = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arithmetic Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.BooleanExprImpl
	 * @see sa.impl.SaPackageImpl#getBooleanExpr()
	 * @generated
	 */
	int BOOLEAN_EXPR = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.impl.RelationalExprImpl <em>Relational Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.impl.RelationalExprImpl
	 * @see sa.impl.SaPackageImpl#getRelationalExpr()
	 * @generated
	 */
	int RELATIONAL_EXPR = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPR__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPR__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPR__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relational Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sa.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.PrimitiveType
	 * @see sa.impl.SaPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 61;

	/**
	 * The meta object id for the '{@link sa.ArithmeticOp <em>Arithmetic Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.ArithmeticOp
	 * @see sa.impl.SaPackageImpl#getArithmeticOp()
	 * @generated
	 */
	int ARITHMETIC_OP = 62;

	/**
	 * The meta object id for the '{@link sa.BooleanOp <em>Boolean Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.BooleanOp
	 * @see sa.impl.SaPackageImpl#getBooleanOp()
	 * @generated
	 */
	int BOOLEAN_OP = 63;

	/**
	 * The meta object id for the '{@link sa.RelationalOp <em>Relational Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sa.RelationalOp
	 * @see sa.impl.SaPackageImpl#getRelationalOp()
	 * @generated
	 */
	int RELATIONAL_OP = 64;


	/**
	 * Returns the meta object for class '{@link sa.SoftwareArchitecture <em>Software Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Architecture</em>'.
	 * @see sa.SoftwareArchitecture
	 * @generated
	 */
	EClass getSoftwareArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.SoftwareArchitecture#getSAElements <em>SA Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SA Elements</em>'.
	 * @see sa.SoftwareArchitecture#getSAElements()
	 * @see #getSoftwareArchitecture()
	 * @generated
	 */
	EReference getSoftwareArchitecture_SAElements();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.SoftwareArchitecture#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see sa.SoftwareArchitecture#getLinks()
	 * @see #getSoftwareArchitecture()
	 * @generated
	 */
	EReference getSoftwareArchitecture_Links();

	/**
	 * Returns the meta object for class '{@link sa.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see sa.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link sa.Component#getHasController <em>Has Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Controller</em>'.
	 * @see sa.Component#getHasController()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_HasController();

	/**
	 * Returns the meta object for class '{@link sa.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see sa.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for class '{@link sa.SensorController <em>Sensor Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Controller</em>'.
	 * @see sa.SensorController
	 * @generated
	 */
	EClass getSensorController();

	/**
	 * Returns the meta object for class '{@link sa.MessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port</em>'.
	 * @see sa.MessagePort
	 * @generated
	 */
	EClass getMessagePort();

	/**
	 * Returns the meta object for the attribute '{@link sa.MessagePort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sa.MessagePort#getName()
	 * @see #getMessagePort()
	 * @generated
	 */
	EAttribute getMessagePort_Name();

	/**
	 * Returns the meta object for class '{@link sa.InMessagePort <em>In Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Message Port</em>'.
	 * @see sa.InMessagePort
	 * @generated
	 */
	EClass getInMessagePort();

	/**
	 * Returns the meta object for the reference '{@link sa.InMessagePort#getRcv_msg <em>Rcv msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rcv msg</em>'.
	 * @see sa.InMessagePort#getRcv_msg()
	 * @see #getInMessagePort()
	 * @generated
	 */
	EReference getInMessagePort_Rcv_msg();

	/**
	 * Returns the meta object for class '{@link sa.OutMessagePort <em>Out Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Message Port</em>'.
	 * @see sa.OutMessagePort
	 * @generated
	 */
	EClass getOutMessagePort();

	/**
	 * Returns the meta object for the reference list '{@link sa.OutMessagePort#getInmsg <em>Inmsg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inmsg</em>'.
	 * @see sa.OutMessagePort#getInmsg()
	 * @see #getOutMessagePort()
	 * @generated
	 */
	EReference getOutMessagePort_Inmsg();

	/**
	 * Returns the meta object for class '{@link sa.SAElement <em>SA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SA Element</em>'.
	 * @see sa.SAElement
	 * @generated
	 */
	EClass getSAElement();

	/**
	 * Returns the meta object for the attribute '{@link sa.SAElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sa.SAElement#getName()
	 * @see #getSAElement()
	 * @generated
	 */
	EAttribute getSAElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.SAElement#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see sa.SAElement#getPorts()
	 * @see #getSAElement()
	 * @generated
	 */
	EReference getSAElement_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.SAElement#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see sa.SAElement#getModes()
	 * @see #getSAElement()
	 * @generated
	 */
	EReference getSAElement_Modes();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.SAElement#getApplicationData <em>Application Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Data</em>'.
	 * @see sa.SAElement#getApplicationData()
	 * @see #getSAElement()
	 * @generated
	 */
	EReference getSAElement_ApplicationData();

	/**
	 * Returns the meta object for class '{@link sa.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see sa.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the attribute '{@link sa.Mode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sa.Mode#getName()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.Mode#getBehaviouralElements <em>Behavioural Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavioural Elements</em>'.
	 * @see sa.Mode#getBehaviouralElements()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_BehaviouralElements();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.Mode#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see sa.Mode#getEntries()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Entries();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.Mode#getExits <em>Exits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exits</em>'.
	 * @see sa.Mode#getExits()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Exits();

	/**
	 * Returns the meta object for class '{@link sa.InternalController <em>Internal Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Controller</em>'.
	 * @see sa.InternalController
	 * @generated
	 */
	EClass getInternalController();

	/**
	 * Returns the meta object for class '{@link sa.InitialMode <em>Initial Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Mode</em>'.
	 * @see sa.InitialMode
	 * @generated
	 */
	EClass getInitialMode();

	/**
	 * Returns the meta object for class '{@link sa.ExternalMode <em>External Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Mode</em>'.
	 * @see sa.ExternalMode
	 * @generated
	 */
	EClass getExternalMode();

	/**
	 * Returns the meta object for class '{@link sa.EnterMode <em>Enter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enter Mode</em>'.
	 * @see sa.EnterMode
	 * @generated
	 */
	EClass getEnterMode();

	/**
	 * Returns the meta object for class '{@link sa.ExitMode <em>Exit Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Mode</em>'.
	 * @see sa.ExitMode
	 * @generated
	 */
	EClass getExitMode();

	/**
	 * Returns the meta object for the reference '{@link sa.ExitMode#getTargetMode <em>Target Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Mode</em>'.
	 * @see sa.ExitMode#getTargetMode()
	 * @see #getExitMode()
	 * @generated
	 */
	EReference getExitMode_TargetMode();

	/**
	 * Returns the meta object for class '{@link sa.BehaviouralElement <em>Behavioural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioural Element</em>'.
	 * @see sa.BehaviouralElement
	 * @generated
	 */
	EClass getBehaviouralElement();

	/**
	 * Returns the meta object for the attribute '{@link sa.BehaviouralElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sa.BehaviouralElement#getName()
	 * @see #getBehaviouralElement()
	 * @generated
	 */
	EAttribute getBehaviouralElement_Name();

	/**
	 * Returns the meta object for class '{@link sa.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see sa.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference list '{@link sa.Action#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see sa.Action#getIncoming()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Incoming();

	/**
	 * Returns the meta object for class '{@link sa.CallAsyncService <em>Call Async Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Async Service</em>'.
	 * @see sa.CallAsyncService
	 * @generated
	 */
	EClass getCallAsyncService();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.CallAsyncService#getDataExp <em>Data Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Exp</em>'.
	 * @see sa.CallAsyncService#getDataExp()
	 * @see #getCallAsyncService()
	 * @generated
	 */
	EReference getCallAsyncService_DataExp();

	/**
	 * Returns the meta object for the attribute '{@link sa.CallAsyncService#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see sa.CallAsyncService#getData()
	 * @see #getCallAsyncService()
	 * @generated
	 */
	EAttribute getCallAsyncService_Data();

	/**
	 * Returns the meta object for class '{@link sa.CallSyncService <em>Call Sync Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Sync Service</em>'.
	 * @see sa.CallSyncService
	 * @generated
	 */
	EClass getCallSyncService();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.CallSyncService#getDataExp <em>Data Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Exp</em>'.
	 * @see sa.CallSyncService#getDataExp()
	 * @see #getCallSyncService()
	 * @generated
	 */
	EReference getCallSyncService_DataExp();

	/**
	 * Returns the meta object for the attribute '{@link sa.CallSyncService#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see sa.CallSyncService#getData()
	 * @see #getCallSyncService()
	 * @generated
	 */
	EAttribute getCallSyncService_Data();

	/**
	 * Returns the meta object for the reference '{@link sa.CallSyncService#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see sa.CallSyncService#getDataRecipient()
	 * @see #getCallSyncService()
	 * @generated
	 */
	EReference getCallSyncService_DataRecipient();

	/**
	 * Returns the meta object for class '{@link sa.StartTimer <em>Start Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Timer</em>'.
	 * @see sa.StartTimer
	 * @generated
	 */
	EClass getStartTimer();

	/**
	 * Returns the meta object for the attribute '{@link sa.StartTimer#isCyclic <em>Cyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cyclic</em>'.
	 * @see sa.StartTimer#isCyclic()
	 * @see #getStartTimer()
	 * @generated
	 */
	EAttribute getStartTimer_Cyclic();

	/**
	 * Returns the meta object for the attribute '{@link sa.StartTimer#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see sa.StartTimer#getDelay()
	 * @see #getStartTimer()
	 * @generated
	 */
	EAttribute getStartTimer_Delay();

	/**
	 * Returns the meta object for the attribute '{@link sa.StartTimer#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see sa.StartTimer#getPeriod()
	 * @see #getStartTimer()
	 * @generated
	 */
	EAttribute getStartTimer_Period();

	/**
	 * Returns the meta object for class '{@link sa.StopTimer <em>Stop Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Timer</em>'.
	 * @see sa.StopTimer
	 * @generated
	 */
	EClass getStopTimer();

	/**
	 * Returns the meta object for the reference '{@link sa.StopTimer#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer</em>'.
	 * @see sa.StopTimer#getTimer()
	 * @see #getStopTimer()
	 * @generated
	 */
	EReference getStopTimer_Timer();

	/**
	 * Returns the meta object for class '{@link sa.StoreData <em>Store Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Data</em>'.
	 * @see sa.StoreData
	 * @generated
	 */
	EClass getStoreData();

	/**
	 * Returns the meta object for the reference '{@link sa.StoreData#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see sa.StoreData#getDataRecipient()
	 * @see #getStoreData()
	 * @generated
	 */
	EReference getStoreData_DataRecipient();

	/**
	 * Returns the meta object for the containment reference '{@link sa.StoreData#getDataExp <em>Data Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Exp</em>'.
	 * @see sa.StoreData#getDataExp()
	 * @see #getStoreData()
	 * @generated
	 */
	EReference getStoreData_DataExp();

	/**
	 * Returns the meta object for the attribute '{@link sa.StoreData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see sa.StoreData#getData()
	 * @see #getStoreData()
	 * @generated
	 */
	EAttribute getStoreData_Data();

	/**
	 * Returns the meta object for class '{@link sa.ControlAction <em>Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Action</em>'.
	 * @see sa.ControlAction
	 * @generated
	 */
	EClass getControlAction();

	/**
	 * Returns the meta object for class '{@link sa.SendMessage <em>Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message</em>'.
	 * @see sa.SendMessage
	 * @generated
	 */
	EClass getSendMessage();

	/**
	 * Returns the meta object for the containment reference '{@link sa.SendMessage#getDataExp <em>Data Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Exp</em>'.
	 * @see sa.SendMessage#getDataExp()
	 * @see #getSendMessage()
	 * @generated
	 */
	EReference getSendMessage_DataExp();

	/**
	 * Returns the meta object for the attribute '{@link sa.SendMessage#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see sa.SendMessage#getData()
	 * @see #getSendMessage()
	 * @generated
	 */
	EAttribute getSendMessage_Data();

	/**
	 * Returns the meta object for the reference list '{@link sa.SendMessage#getToMessagePorts <em>To Message Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Message Ports</em>'.
	 * @see sa.SendMessage#getToMessagePorts()
	 * @see #getSendMessage()
	 * @generated
	 */
	EReference getSendMessage_ToMessagePorts();

	/**
	 * Returns the meta object for class '{@link sa.BroadcastSendMessage <em>Broadcast Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast Send Message</em>'.
	 * @see sa.BroadcastSendMessage
	 * @generated
	 */
	EClass getBroadcastSendMessage();

	/**
	 * Returns the meta object for class '{@link sa.UnicastSendMessage <em>Unicast Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unicast Send Message</em>'.
	 * @see sa.UnicastSendMessage
	 * @generated
	 */
	EClass getUnicastSendMessage();

	/**
	 * Returns the meta object for the attribute '{@link sa.UnicastSendMessage#getReceiverName <em>Receiver Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Name</em>'.
	 * @see sa.UnicastSendMessage#getReceiverName()
	 * @see #getUnicastSendMessage()
	 * @generated
	 */
	EAttribute getUnicastSendMessage_ReceiverName();

	/**
	 * Returns the meta object for class '{@link sa.MulticastSendMessage <em>Multicast Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multicast Send Message</em>'.
	 * @see sa.MulticastSendMessage
	 * @generated
	 */
	EClass getMulticastSendMessage();

	/**
	 * Returns the meta object for the attribute list '{@link sa.MulticastSendMessage#getReceiverNames <em>Receiver Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Receiver Names</em>'.
	 * @see sa.MulticastSendMessage#getReceiverNames()
	 * @see #getMulticastSendMessage()
	 * @generated
	 */
	EAttribute getMulticastSendMessage_ReceiverNames();

	/**
	 * Returns the meta object for class '{@link sa.Sense <em>Sense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense</em>'.
	 * @see sa.Sense
	 * @generated
	 */
	EClass getSense();

	/**
	 * Returns the meta object for the attribute '{@link sa.Sense#getDataDeclarationName <em>Data Declaration Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Declaration Name</em>'.
	 * @see sa.Sense#getDataDeclarationName()
	 * @see #getSense()
	 * @generated
	 */
	EAttribute getSense_DataDeclarationName();

	/**
	 * Returns the meta object for the attribute '{@link sa.Sense#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see sa.Sense#getData()
	 * @see #getSense()
	 * @generated
	 */
	EAttribute getSense_Data();

	/**
	 * Returns the meta object for the reference '{@link sa.Sense#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see sa.Sense#getDataRecipient()
	 * @see #getSense()
	 * @generated
	 */
	EReference getSense_DataRecipient();

	/**
	 * Returns the meta object for class '{@link sa.SensePosition <em>Sense Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Position</em>'.
	 * @see sa.SensePosition
	 * @generated
	 */
	EClass getSensePosition();

	/**
	 * Returns the meta object for the attribute '{@link sa.SensePosition#getDataDeclarationName <em>Data Declaration Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Declaration Name</em>'.
	 * @see sa.SensePosition#getDataDeclarationName()
	 * @see #getSensePosition()
	 * @generated
	 */
	EAttribute getSensePosition_DataDeclarationName();

	/**
	 * Returns the meta object for the attribute '{@link sa.SensePosition#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see sa.SensePosition#getData()
	 * @see #getSensePosition()
	 * @generated
	 */
	EAttribute getSensePosition_Data();

	/**
	 * Returns the meta object for the reference '{@link sa.SensePosition#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see sa.SensePosition#getDataRecipient()
	 * @see #getSensePosition()
	 * @generated
	 */
	EReference getSensePosition_DataRecipient();

	/**
	 * Returns the meta object for class '{@link sa.SenseAccelerometer <em>Sense Accelerometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Accelerometer</em>'.
	 * @see sa.SenseAccelerometer
	 * @generated
	 */
	EClass getSenseAccelerometer();

	/**
	 * Returns the meta object for the attribute '{@link sa.SenseAccelerometer#getDataDeclarationName <em>Data Declaration Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Declaration Name</em>'.
	 * @see sa.SenseAccelerometer#getDataDeclarationName()
	 * @see #getSenseAccelerometer()
	 * @generated
	 */
	EAttribute getSenseAccelerometer_DataDeclarationName();

	/**
	 * Returns the meta object for the attribute '{@link sa.SenseAccelerometer#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see sa.SenseAccelerometer#getData()
	 * @see #getSenseAccelerometer()
	 * @generated
	 */
	EAttribute getSenseAccelerometer_Data();

	/**
	 * Returns the meta object for the reference '{@link sa.SenseAccelerometer#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see sa.SenseAccelerometer#getDataRecipient()
	 * @see #getSenseAccelerometer()
	 * @generated
	 */
	EReference getSenseAccelerometer_DataRecipient();

	/**
	 * Returns the meta object for class '{@link sa.Actuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuate</em>'.
	 * @see sa.Actuate
	 * @generated
	 */
	EClass getActuate();

	/**
	 * Returns the meta object for the containment reference '{@link sa.Actuate#getDataExp <em>Data Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Exp</em>'.
	 * @see sa.Actuate#getDataExp()
	 * @see #getActuate()
	 * @generated
	 */
	EReference getActuate_DataExp();

	/**
	 * Returns the meta object for the attribute '{@link sa.Actuate#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see sa.Actuate#getData()
	 * @see #getActuate()
	 * @generated
	 */
	EAttribute getActuate_Data();

	/**
	 * Returns the meta object for class '{@link sa.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see sa.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link sa.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see sa.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link sa.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see sa.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link sa.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see sa.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link sa.ServiceCallback <em>Service Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Callback</em>'.
	 * @see sa.ServiceCallback
	 * @generated
	 */
	EClass getServiceCallback();

	/**
	 * Returns the meta object for the attribute '{@link sa.ServiceCallback#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see sa.ServiceCallback#getServiceName()
	 * @see #getServiceCallback()
	 * @generated
	 */
	EAttribute getServiceCallback_ServiceName();

	/**
	 * Returns the meta object for the reference '{@link sa.ServiceCallback#getCalledService <em>Called Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Service</em>'.
	 * @see sa.ServiceCallback#getCalledService()
	 * @see #getServiceCallback()
	 * @generated
	 */
	EReference getServiceCallback_CalledService();

	/**
	 * Returns the meta object for the reference '{@link sa.ServiceCallback#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see sa.ServiceCallback#getDataRecipient()
	 * @see #getServiceCallback()
	 * @generated
	 */
	EReference getServiceCallback_DataRecipient();

	/**
	 * Returns the meta object for class '{@link sa.ServiceCall <em>Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Call</em>'.
	 * @see sa.ServiceCall
	 * @generated
	 */
	EClass getServiceCall();

	/**
	 * Returns the meta object for the attribute '{@link sa.ServiceCall#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see sa.ServiceCall#getServiceName()
	 * @see #getServiceCall()
	 * @generated
	 */
	EAttribute getServiceCall_ServiceName();

	/**
	 * Returns the meta object for the reference '{@link sa.ServiceCall#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see sa.ServiceCall#getDataRecipient()
	 * @see #getServiceCall()
	 * @generated
	 */
	EReference getServiceCall_DataRecipient();

	/**
	 * Returns the meta object for class '{@link sa.ReceiveMessage <em>Receive Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Message</em>'.
	 * @see sa.ReceiveMessage
	 * @generated
	 */
	EClass getReceiveMessage();

	/**
	 * Returns the meta object for the attribute '{@link sa.ReceiveMessage#getDataRecipientName <em>Data Recipient Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Recipient Name</em>'.
	 * @see sa.ReceiveMessage#getDataRecipientName()
	 * @see #getReceiveMessage()
	 * @generated
	 */
	EAttribute getReceiveMessage_DataRecipientName();

	/**
	 * Returns the meta object for the reference list '{@link sa.ReceiveMessage#getFromMessagePorts <em>From Message Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Message Ports</em>'.
	 * @see sa.ReceiveMessage#getFromMessagePorts()
	 * @see #getReceiveMessage()
	 * @generated
	 */
	EReference getReceiveMessage_FromMessagePorts();

	/**
	 * Returns the meta object for the reference '{@link sa.ReceiveMessage#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see sa.ReceiveMessage#getDataRecipient()
	 * @see #getReceiveMessage()
	 * @generated
	 */
	EReference getReceiveMessage_DataRecipient();

	/**
	 * Returns the meta object for class '{@link sa.TimerFired <em>Timer Fired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Fired</em>'.
	 * @see sa.TimerFired
	 * @generated
	 */
	EClass getTimerFired();

	/**
	 * Returns the meta object for the attribute '{@link sa.TimerFired#getTimerName <em>Timer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer Name</em>'.
	 * @see sa.TimerFired#getTimerName()
	 * @see #getTimerFired()
	 * @generated
	 */
	EAttribute getTimerFired_TimerName();

	/**
	 * Returns the meta object for the reference '{@link sa.TimerFired#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer</em>'.
	 * @see sa.TimerFired#getTimer()
	 * @see #getTimerFired()
	 * @generated
	 */
	EReference getTimerFired_Timer();

	/**
	 * Returns the meta object for class '{@link sa.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see sa.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link sa.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sa.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link sa.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sa.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.Link#getConditionExp <em>Condition Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Exp</em>'.
	 * @see sa.Link#getConditionExp()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_ConditionExp();

	/**
	 * Returns the meta object for the attribute '{@link sa.Link#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see sa.Link#getCondition()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Condition();

	/**
	 * Returns the meta object for the attribute '{@link sa.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sa.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for class '{@link sa.LinkableElement <em>Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkable Element</em>'.
	 * @see sa.LinkableElement
	 * @generated
	 */
	EClass getLinkableElement();

	/**
	 * Returns the meta object for the reference list '{@link sa.LinkableElement#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see sa.LinkableElement#getOutgoing()
	 * @see #getLinkableElement()
	 * @generated
	 */
	EReference getLinkableElement_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link sa.LinkableElement#getInAction <em>In Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Action</em>'.
	 * @see sa.LinkableElement#getInAction()
	 * @see #getLinkableElement()
	 * @generated
	 */
	EReference getLinkableElement_InAction();

	/**
	 * Returns the meta object for class '{@link sa.DataDeclaration <em>Data Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Declaration</em>'.
	 * @see sa.DataDeclaration
	 * @generated
	 */
	EClass getDataDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link sa.DataDeclaration#getDataName <em>Data Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Name</em>'.
	 * @see sa.DataDeclaration#getDataName()
	 * @see #getDataDeclaration()
	 * @generated
	 */
	EAttribute getDataDeclaration_DataName();

	/**
	 * Returns the meta object for the attribute '{@link sa.DataDeclaration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sa.DataDeclaration#getValue()
	 * @see #getDataDeclaration()
	 * @generated
	 */
	EAttribute getDataDeclaration_Value();

	/**
	 * Returns the meta object for the attribute '{@link sa.DataDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sa.DataDeclaration#getName()
	 * @see #getDataDeclaration()
	 * @generated
	 */
	EAttribute getDataDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link sa.PrimitiveDataDeclaration <em>Primitive Data Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Declaration</em>'.
	 * @see sa.PrimitiveDataDeclaration
	 * @generated
	 */
	EClass getPrimitiveDataDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link sa.PrimitiveDataDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sa.PrimitiveDataDeclaration#getType()
	 * @see #getPrimitiveDataDeclaration()
	 * @generated
	 */
	EAttribute getPrimitiveDataDeclaration_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.PrimitiveDataDeclaration#getValueExp <em>Value Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Exp</em>'.
	 * @see sa.PrimitiveDataDeclaration#getValueExp()
	 * @see #getPrimitiveDataDeclaration()
	 * @generated
	 */
	EReference getPrimitiveDataDeclaration_ValueExp();

	/**
	 * Returns the meta object for class '{@link sa.StructuredDataDeclaration <em>Structured Data Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Data Declaration</em>'.
	 * @see sa.StructuredDataDeclaration
	 * @generated
	 */
	EClass getStructuredDataDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.StructuredDataDeclaration#getTypeExp <em>Type Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Exp</em>'.
	 * @see sa.StructuredDataDeclaration#getTypeExp()
	 * @see #getStructuredDataDeclaration()
	 * @generated
	 */
	EReference getStructuredDataDeclaration_TypeExp();

	/**
	 * Returns the meta object for the attribute '{@link sa.StructuredDataDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sa.StructuredDataDeclaration#getType()
	 * @see #getStructuredDataDeclaration()
	 * @generated
	 */
	EAttribute getStructuredDataDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link sa.StructuredDataType <em>Structured Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Data Type</em>'.
	 * @see sa.StructuredDataType
	 * @generated
	 */
	EClass getStructuredDataType();

	/**
	 * Returns the meta object for the attribute '{@link sa.StructuredDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sa.StructuredDataType#getName()
	 * @see #getStructuredDataType()
	 * @generated
	 */
	EAttribute getStructuredDataType_Name();

	/**
	 * Returns the meta object for class '{@link sa.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see sa.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute list '{@link sa.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literals</em>'.
	 * @see sa.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link sa.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see sa.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.Structure#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see sa.Structure#getMembers()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Members();

	/**
	 * Returns the meta object for class '{@link sa.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see sa.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link sa.IntegerConst <em>Integer Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Const</em>'.
	 * @see sa.IntegerConst
	 * @generated
	 */
	EClass getIntegerConst();

	/**
	 * Returns the meta object for the attribute '{@link sa.IntegerConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sa.IntegerConst#getValue()
	 * @see #getIntegerConst()
	 * @generated
	 */
	EAttribute getIntegerConst_Value();

	/**
	 * Returns the meta object for class '{@link sa.BooleanConst <em>Boolean Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Const</em>'.
	 * @see sa.BooleanConst
	 * @generated
	 */
	EClass getBooleanConst();

	/**
	 * Returns the meta object for the attribute '{@link sa.BooleanConst#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sa.BooleanConst#isValue()
	 * @see #getBooleanConst()
	 * @generated
	 */
	EAttribute getBooleanConst_Value();

	/**
	 * Returns the meta object for class '{@link sa.RealConst <em>Real Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Const</em>'.
	 * @see sa.RealConst
	 * @generated
	 */
	EClass getRealConst();

	/**
	 * Returns the meta object for the attribute '{@link sa.RealConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sa.RealConst#getValue()
	 * @see #getRealConst()
	 * @generated
	 */
	EAttribute getRealConst_Value();

	/**
	 * Returns the meta object for class '{@link sa.StringConst <em>String Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Const</em>'.
	 * @see sa.StringConst
	 * @generated
	 */
	EClass getStringConst();

	/**
	 * Returns the meta object for the attribute '{@link sa.StringConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sa.StringConst#getValue()
	 * @see #getStringConst()
	 * @generated
	 */
	EAttribute getStringConst_Value();

	/**
	 * Returns the meta object for class '{@link sa.EnumConst <em>Enum Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Const</em>'.
	 * @see sa.EnumConst
	 * @generated
	 */
	EClass getEnumConst();

	/**
	 * Returns the meta object for the reference '{@link sa.EnumConst#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration</em>'.
	 * @see sa.EnumConst#getEnumeration()
	 * @see #getEnumConst()
	 * @generated
	 */
	EReference getEnumConst_Enumeration();

	/**
	 * Returns the meta object for the attribute '{@link sa.EnumConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sa.EnumConst#getValue()
	 * @see #getEnumConst()
	 * @generated
	 */
	EAttribute getEnumConst_Value();

	/**
	 * Returns the meta object for class '{@link sa.StructureConst <em>Structure Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Const</em>'.
	 * @see sa.StructureConst
	 * @generated
	 */
	EClass getStructureConst();

	/**
	 * Returns the meta object for the containment reference list '{@link sa.StructureConst#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see sa.StructureConst#getValues()
	 * @see #getStructureConst()
	 * @generated
	 */
	EReference getStructureConst_Values();

	/**
	 * Returns the meta object for class '{@link sa.StructureElement <em>Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Element</em>'.
	 * @see sa.StructureElement
	 * @generated
	 */
	EClass getStructureElement();

	/**
	 * Returns the meta object for the reference '{@link sa.StructureElement#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see sa.StructureElement#getMember()
	 * @see #getStructureElement()
	 * @generated
	 */
	EReference getStructureElement_Member();

	/**
	 * Returns the meta object for the containment reference '{@link sa.StructureElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see sa.StructureElement#getValue()
	 * @see #getStructureElement()
	 * @generated
	 */
	EReference getStructureElement_Value();

	/**
	 * Returns the meta object for class '{@link sa.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see sa.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link sa.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sa.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the meta object for class '{@link sa.NullExp <em>Null Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Exp</em>'.
	 * @see sa.NullExp
	 * @generated
	 */
	EClass getNullExp();

	/**
	 * Returns the meta object for class '{@link sa.DataRef <em>Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Ref</em>'.
	 * @see sa.DataRef
	 * @generated
	 */
	EClass getDataRef();

	/**
	 * Returns the meta object for the reference '{@link sa.DataRef#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see sa.DataRef#getDeclaration()
	 * @see #getDataRef()
	 * @generated
	 */
	EReference getDataRef_Declaration();

	/**
	 * Returns the meta object for class '{@link sa.StructureMemberRef <em>Structure Member Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Member Ref</em>'.
	 * @see sa.StructureMemberRef
	 * @generated
	 */
	EClass getStructureMemberRef();

	/**
	 * Returns the meta object for the reference '{@link sa.StructureMemberRef#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure</em>'.
	 * @see sa.StructureMemberRef#getStructure()
	 * @see #getStructureMemberRef()
	 * @generated
	 */
	EReference getStructureMemberRef_Structure();

	/**
	 * Returns the meta object for the reference '{@link sa.StructureMemberRef#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see sa.StructureMemberRef#getMember()
	 * @see #getStructureMemberRef()
	 * @generated
	 */
	EReference getStructureMemberRef_Member();

	/**
	 * Returns the meta object for class '{@link sa.ArithmeticExpr <em>Arithmetic Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expr</em>'.
	 * @see sa.ArithmeticExpr
	 * @generated
	 */
	EClass getArithmeticExpr();

	/**
	 * Returns the meta object for the containment reference '{@link sa.ArithmeticExpr#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see sa.ArithmeticExpr#getLeftOperand()
	 * @see #getArithmeticExpr()
	 * @generated
	 */
	EReference getArithmeticExpr_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link sa.ArithmeticExpr#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see sa.ArithmeticExpr#getRightOperand()
	 * @see #getArithmeticExpr()
	 * @generated
	 */
	EReference getArithmeticExpr_RightOperand();

	/**
	 * Returns the meta object for the attribute '{@link sa.ArithmeticExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see sa.ArithmeticExpr#getOperator()
	 * @see #getArithmeticExpr()
	 * @generated
	 */
	EAttribute getArithmeticExpr_Operator();

	/**
	 * Returns the meta object for class '{@link sa.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expr</em>'.
	 * @see sa.BooleanExpr
	 * @generated
	 */
	EClass getBooleanExpr();

	/**
	 * Returns the meta object for the containment reference '{@link sa.BooleanExpr#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see sa.BooleanExpr#getLeftOperand()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EReference getBooleanExpr_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link sa.BooleanExpr#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see sa.BooleanExpr#getRightOperand()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EReference getBooleanExpr_RightOperand();

	/**
	 * Returns the meta object for the attribute '{@link sa.BooleanExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see sa.BooleanExpr#getOperator()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EAttribute getBooleanExpr_Operator();

	/**
	 * Returns the meta object for class '{@link sa.RelationalExpr <em>Relational Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expr</em>'.
	 * @see sa.RelationalExpr
	 * @generated
	 */
	EClass getRelationalExpr();

	/**
	 * Returns the meta object for the containment reference '{@link sa.RelationalExpr#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see sa.RelationalExpr#getLeftOperand()
	 * @see #getRelationalExpr()
	 * @generated
	 */
	EReference getRelationalExpr_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link sa.RelationalExpr#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see sa.RelationalExpr#getRightOperand()
	 * @see #getRelationalExpr()
	 * @generated
	 */
	EReference getRelationalExpr_RightOperand();

	/**
	 * Returns the meta object for the attribute '{@link sa.RelationalExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see sa.RelationalExpr#getOperator()
	 * @see #getRelationalExpr()
	 * @generated
	 */
	EAttribute getRelationalExpr_Operator();

	/**
	 * Returns the meta object for enum '{@link sa.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see sa.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link sa.ArithmeticOp <em>Arithmetic Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Op</em>'.
	 * @see sa.ArithmeticOp
	 * @generated
	 */
	EEnum getArithmeticOp();

	/**
	 * Returns the meta object for enum '{@link sa.BooleanOp <em>Boolean Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Op</em>'.
	 * @see sa.BooleanOp
	 * @generated
	 */
	EEnum getBooleanOp();

	/**
	 * Returns the meta object for enum '{@link sa.RelationalOp <em>Relational Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Op</em>'.
	 * @see sa.RelationalOp
	 * @generated
	 */
	EEnum getRelationalOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SaFactory getSaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sa.impl.SoftwareArchitectureImpl <em>Software Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.SoftwareArchitectureImpl
		 * @see sa.impl.SaPackageImpl#getSoftwareArchitecture()
		 * @generated
		 */
		EClass SOFTWARE_ARCHITECTURE = eINSTANCE.getSoftwareArchitecture();

		/**
		 * The meta object literal for the '<em><b>SA Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ARCHITECTURE__SA_ELEMENTS = eINSTANCE.getSoftwareArchitecture_SAElements();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ARCHITECTURE__LINKS = eINSTANCE.getSoftwareArchitecture_Links();

		/**
		 * The meta object literal for the '{@link sa.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ComponentImpl
		 * @see sa.impl.SaPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Has Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__HAS_CONTROLLER = eINSTANCE.getComponent_HasController();

		/**
		 * The meta object literal for the '{@link sa.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ControllerImpl
		 * @see sa.impl.SaPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '{@link sa.impl.SensorControllerImpl <em>Sensor Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.SensorControllerImpl
		 * @see sa.impl.SaPackageImpl#getSensorController()
		 * @generated
		 */
		EClass SENSOR_CONTROLLER = eINSTANCE.getSensorController();

		/**
		 * The meta object literal for the '{@link sa.impl.MessagePortImpl <em>Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.MessagePortImpl
		 * @see sa.impl.SaPackageImpl#getMessagePort()
		 * @generated
		 */
		EClass MESSAGE_PORT = eINSTANCE.getMessagePort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_PORT__NAME = eINSTANCE.getMessagePort_Name();

		/**
		 * The meta object literal for the '{@link sa.impl.InMessagePortImpl <em>In Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.InMessagePortImpl
		 * @see sa.impl.SaPackageImpl#getInMessagePort()
		 * @generated
		 */
		EClass IN_MESSAGE_PORT = eINSTANCE.getInMessagePort();

		/**
		 * The meta object literal for the '<em><b>Rcv msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_MESSAGE_PORT__RCV_MSG = eINSTANCE.getInMessagePort_Rcv_msg();

		/**
		 * The meta object literal for the '{@link sa.impl.OutMessagePortImpl <em>Out Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.OutMessagePortImpl
		 * @see sa.impl.SaPackageImpl#getOutMessagePort()
		 * @generated
		 */
		EClass OUT_MESSAGE_PORT = eINSTANCE.getOutMessagePort();

		/**
		 * The meta object literal for the '<em><b>Inmsg</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_MESSAGE_PORT__INMSG = eINSTANCE.getOutMessagePort_Inmsg();

		/**
		 * The meta object literal for the '{@link sa.impl.SAElementImpl <em>SA Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.SAElementImpl
		 * @see sa.impl.SaPackageImpl#getSAElement()
		 * @generated
		 */
		EClass SA_ELEMENT = eINSTANCE.getSAElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SA_ELEMENT__NAME = eINSTANCE.getSAElement_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SA_ELEMENT__PORTS = eINSTANCE.getSAElement_Ports();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SA_ELEMENT__MODES = eINSTANCE.getSAElement_Modes();

		/**
		 * The meta object literal for the '<em><b>Application Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SA_ELEMENT__APPLICATION_DATA = eINSTANCE.getSAElement_ApplicationData();

		/**
		 * The meta object literal for the '{@link sa.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ModeImpl
		 * @see sa.impl.SaPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__NAME = eINSTANCE.getMode_Name();

		/**
		 * The meta object literal for the '<em><b>Behavioural Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__BEHAVIOURAL_ELEMENTS = eINSTANCE.getMode_BehaviouralElements();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__ENTRIES = eINSTANCE.getMode_Entries();

		/**
		 * The meta object literal for the '<em><b>Exits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__EXITS = eINSTANCE.getMode_Exits();

		/**
		 * The meta object literal for the '{@link sa.impl.InternalControllerImpl <em>Internal Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.InternalControllerImpl
		 * @see sa.impl.SaPackageImpl#getInternalController()
		 * @generated
		 */
		EClass INTERNAL_CONTROLLER = eINSTANCE.getInternalController();

		/**
		 * The meta object literal for the '{@link sa.impl.InitialModeImpl <em>Initial Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.InitialModeImpl
		 * @see sa.impl.SaPackageImpl#getInitialMode()
		 * @generated
		 */
		EClass INITIAL_MODE = eINSTANCE.getInitialMode();

		/**
		 * The meta object literal for the '{@link sa.impl.ExternalModeImpl <em>External Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ExternalModeImpl
		 * @see sa.impl.SaPackageImpl#getExternalMode()
		 * @generated
		 */
		EClass EXTERNAL_MODE = eINSTANCE.getExternalMode();

		/**
		 * The meta object literal for the '{@link sa.impl.EnterModeImpl <em>Enter Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.EnterModeImpl
		 * @see sa.impl.SaPackageImpl#getEnterMode()
		 * @generated
		 */
		EClass ENTER_MODE = eINSTANCE.getEnterMode();

		/**
		 * The meta object literal for the '{@link sa.impl.ExitModeImpl <em>Exit Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ExitModeImpl
		 * @see sa.impl.SaPackageImpl#getExitMode()
		 * @generated
		 */
		EClass EXIT_MODE = eINSTANCE.getExitMode();

		/**
		 * The meta object literal for the '<em><b>Target Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_MODE__TARGET_MODE = eINSTANCE.getExitMode_TargetMode();

		/**
		 * The meta object literal for the '{@link sa.impl.BehaviouralElementImpl <em>Behavioural Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.BehaviouralElementImpl
		 * @see sa.impl.SaPackageImpl#getBehaviouralElement()
		 * @generated
		 */
		EClass BEHAVIOURAL_ELEMENT = eINSTANCE.getBehaviouralElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOURAL_ELEMENT__NAME = eINSTANCE.getBehaviouralElement_Name();

		/**
		 * The meta object literal for the '{@link sa.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ActionImpl
		 * @see sa.impl.SaPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INCOMING = eINSTANCE.getAction_Incoming();

		/**
		 * The meta object literal for the '{@link sa.impl.CallAsyncServiceImpl <em>Call Async Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.CallAsyncServiceImpl
		 * @see sa.impl.SaPackageImpl#getCallAsyncService()
		 * @generated
		 */
		EClass CALL_ASYNC_SERVICE = eINSTANCE.getCallAsyncService();

		/**
		 * The meta object literal for the '<em><b>Data Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ASYNC_SERVICE__DATA_EXP = eINSTANCE.getCallAsyncService_DataExp();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_ASYNC_SERVICE__DATA = eINSTANCE.getCallAsyncService_Data();

		/**
		 * The meta object literal for the '{@link sa.impl.CallSyncServiceImpl <em>Call Sync Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.CallSyncServiceImpl
		 * @see sa.impl.SaPackageImpl#getCallSyncService()
		 * @generated
		 */
		EClass CALL_SYNC_SERVICE = eINSTANCE.getCallSyncService();

		/**
		 * The meta object literal for the '<em><b>Data Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_SYNC_SERVICE__DATA_EXP = eINSTANCE.getCallSyncService_DataExp();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_SYNC_SERVICE__DATA = eINSTANCE.getCallSyncService_Data();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_SYNC_SERVICE__DATA_RECIPIENT = eINSTANCE.getCallSyncService_DataRecipient();

		/**
		 * The meta object literal for the '{@link sa.impl.StartTimerImpl <em>Start Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StartTimerImpl
		 * @see sa.impl.SaPackageImpl#getStartTimer()
		 * @generated
		 */
		EClass START_TIMER = eINSTANCE.getStartTimer();

		/**
		 * The meta object literal for the '<em><b>Cyclic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TIMER__CYCLIC = eINSTANCE.getStartTimer_Cyclic();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TIMER__DELAY = eINSTANCE.getStartTimer_Delay();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TIMER__PERIOD = eINSTANCE.getStartTimer_Period();

		/**
		 * The meta object literal for the '{@link sa.impl.StopTimerImpl <em>Stop Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StopTimerImpl
		 * @see sa.impl.SaPackageImpl#getStopTimer()
		 * @generated
		 */
		EClass STOP_TIMER = eINSTANCE.getStopTimer();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_TIMER__TIMER = eINSTANCE.getStopTimer_Timer();

		/**
		 * The meta object literal for the '{@link sa.impl.StoreDataImpl <em>Store Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StoreDataImpl
		 * @see sa.impl.SaPackageImpl#getStoreData()
		 * @generated
		 */
		EClass STORE_DATA = eINSTANCE.getStoreData();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_DATA__DATA_RECIPIENT = eINSTANCE.getStoreData_DataRecipient();

		/**
		 * The meta object literal for the '<em><b>Data Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_DATA__DATA_EXP = eINSTANCE.getStoreData_DataExp();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_DATA__DATA = eINSTANCE.getStoreData_Data();

		/**
		 * The meta object literal for the '{@link sa.impl.ControlActionImpl <em>Control Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ControlActionImpl
		 * @see sa.impl.SaPackageImpl#getControlAction()
		 * @generated
		 */
		EClass CONTROL_ACTION = eINSTANCE.getControlAction();

		/**
		 * The meta object literal for the '{@link sa.impl.SendMessageImpl <em>Send Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.SendMessageImpl
		 * @see sa.impl.SaPackageImpl#getSendMessage()
		 * @generated
		 */
		EClass SEND_MESSAGE = eINSTANCE.getSendMessage();

		/**
		 * The meta object literal for the '<em><b>Data Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE__DATA_EXP = eINSTANCE.getSendMessage_DataExp();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE__DATA = eINSTANCE.getSendMessage_Data();

		/**
		 * The meta object literal for the '<em><b>To Message Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE__TO_MESSAGE_PORTS = eINSTANCE.getSendMessage_ToMessagePorts();

		/**
		 * The meta object literal for the '{@link sa.impl.BroadcastSendMessageImpl <em>Broadcast Send Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.BroadcastSendMessageImpl
		 * @see sa.impl.SaPackageImpl#getBroadcastSendMessage()
		 * @generated
		 */
		EClass BROADCAST_SEND_MESSAGE = eINSTANCE.getBroadcastSendMessage();

		/**
		 * The meta object literal for the '{@link sa.impl.UnicastSendMessageImpl <em>Unicast Send Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.UnicastSendMessageImpl
		 * @see sa.impl.SaPackageImpl#getUnicastSendMessage()
		 * @generated
		 */
		EClass UNICAST_SEND_MESSAGE = eINSTANCE.getUnicastSendMessage();

		/**
		 * The meta object literal for the '<em><b>Receiver Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNICAST_SEND_MESSAGE__RECEIVER_NAME = eINSTANCE.getUnicastSendMessage_ReceiverName();

		/**
		 * The meta object literal for the '{@link sa.impl.MulticastSendMessageImpl <em>Multicast Send Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.MulticastSendMessageImpl
		 * @see sa.impl.SaPackageImpl#getMulticastSendMessage()
		 * @generated
		 */
		EClass MULTICAST_SEND_MESSAGE = eINSTANCE.getMulticastSendMessage();

		/**
		 * The meta object literal for the '<em><b>Receiver Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTICAST_SEND_MESSAGE__RECEIVER_NAMES = eINSTANCE.getMulticastSendMessage_ReceiverNames();

		/**
		 * The meta object literal for the '{@link sa.impl.SenseImpl <em>Sense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.SenseImpl
		 * @see sa.impl.SaPackageImpl#getSense()
		 * @generated
		 */
		EClass SENSE = eINSTANCE.getSense();

		/**
		 * The meta object literal for the '<em><b>Data Declaration Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE__DATA_DECLARATION_NAME = eINSTANCE.getSense_DataDeclarationName();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE__DATA = eINSTANCE.getSense_Data();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE__DATA_RECIPIENT = eINSTANCE.getSense_DataRecipient();

		/**
		 * The meta object literal for the '{@link sa.impl.SensePositionImpl <em>Sense Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.SensePositionImpl
		 * @see sa.impl.SaPackageImpl#getSensePosition()
		 * @generated
		 */
		EClass SENSE_POSITION = eINSTANCE.getSensePosition();

		/**
		 * The meta object literal for the '<em><b>Data Declaration Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE_POSITION__DATA_DECLARATION_NAME = eINSTANCE.getSensePosition_DataDeclarationName();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE_POSITION__DATA = eINSTANCE.getSensePosition_Data();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_POSITION__DATA_RECIPIENT = eINSTANCE.getSensePosition_DataRecipient();

		/**
		 * The meta object literal for the '{@link sa.impl.SenseAccelerometerImpl <em>Sense Accelerometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.SenseAccelerometerImpl
		 * @see sa.impl.SaPackageImpl#getSenseAccelerometer()
		 * @generated
		 */
		EClass SENSE_ACCELEROMETER = eINSTANCE.getSenseAccelerometer();

		/**
		 * The meta object literal for the '<em><b>Data Declaration Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE_ACCELEROMETER__DATA_DECLARATION_NAME = eINSTANCE.getSenseAccelerometer_DataDeclarationName();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE_ACCELEROMETER__DATA = eINSTANCE.getSenseAccelerometer_Data();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_ACCELEROMETER__DATA_RECIPIENT = eINSTANCE.getSenseAccelerometer_DataRecipient();

		/**
		 * The meta object literal for the '{@link sa.impl.ActuateImpl <em>Actuate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ActuateImpl
		 * @see sa.impl.SaPackageImpl#getActuate()
		 * @generated
		 */
		EClass ACTUATE = eINSTANCE.getActuate();

		/**
		 * The meta object literal for the '<em><b>Data Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATE__DATA_EXP = eINSTANCE.getActuate_DataExp();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATE__DATA = eINSTANCE.getActuate_Data();

		/**
		 * The meta object literal for the '{@link sa.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.JoinImpl
		 * @see sa.impl.SaPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link sa.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ForkImpl
		 * @see sa.impl.SaPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link sa.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ChoiceImpl
		 * @see sa.impl.SaPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link sa.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.EventImpl
		 * @see sa.impl.SaPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link sa.impl.ServiceCallbackImpl <em>Service Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ServiceCallbackImpl
		 * @see sa.impl.SaPackageImpl#getServiceCallback()
		 * @generated
		 */
		EClass SERVICE_CALLBACK = eINSTANCE.getServiceCallback();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CALLBACK__SERVICE_NAME = eINSTANCE.getServiceCallback_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Called Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CALLBACK__CALLED_SERVICE = eINSTANCE.getServiceCallback_CalledService();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CALLBACK__DATA_RECIPIENT = eINSTANCE.getServiceCallback_DataRecipient();

		/**
		 * The meta object literal for the '{@link sa.impl.ServiceCallImpl <em>Service Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ServiceCallImpl
		 * @see sa.impl.SaPackageImpl#getServiceCall()
		 * @generated
		 */
		EClass SERVICE_CALL = eINSTANCE.getServiceCall();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CALL__SERVICE_NAME = eINSTANCE.getServiceCall_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CALL__DATA_RECIPIENT = eINSTANCE.getServiceCall_DataRecipient();

		/**
		 * The meta object literal for the '{@link sa.impl.ReceiveMessageImpl <em>Receive Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ReceiveMessageImpl
		 * @see sa.impl.SaPackageImpl#getReceiveMessage()
		 * @generated
		 */
		EClass RECEIVE_MESSAGE = eINSTANCE.getReceiveMessage();

		/**
		 * The meta object literal for the '<em><b>Data Recipient Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_MESSAGE__DATA_RECIPIENT_NAME = eINSTANCE.getReceiveMessage_DataRecipientName();

		/**
		 * The meta object literal for the '<em><b>From Message Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE__FROM_MESSAGE_PORTS = eINSTANCE.getReceiveMessage_FromMessagePorts();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE__DATA_RECIPIENT = eINSTANCE.getReceiveMessage_DataRecipient();

		/**
		 * The meta object literal for the '{@link sa.impl.TimerFiredImpl <em>Timer Fired</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.TimerFiredImpl
		 * @see sa.impl.SaPackageImpl#getTimerFired()
		 * @generated
		 */
		EClass TIMER_FIRED = eINSTANCE.getTimerFired();

		/**
		 * The meta object literal for the '<em><b>Timer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_FIRED__TIMER_NAME = eINSTANCE.getTimerFired_TimerName();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_FIRED__TIMER = eINSTANCE.getTimerFired_Timer();

		/**
		 * The meta object literal for the '{@link sa.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.LinkImpl
		 * @see sa.impl.SaPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '<em><b>Condition Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__CONDITION_EXP = eINSTANCE.getLink_ConditionExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__CONDITION = eINSTANCE.getLink_Condition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '{@link sa.impl.LinkableElementImpl <em>Linkable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.LinkableElementImpl
		 * @see sa.impl.SaPackageImpl#getLinkableElement()
		 * @generated
		 */
		EClass LINKABLE_ELEMENT = eINSTANCE.getLinkableElement();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKABLE_ELEMENT__OUTGOING = eINSTANCE.getLinkableElement_Outgoing();

		/**
		 * The meta object literal for the '<em><b>In Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKABLE_ELEMENT__IN_ACTION = eINSTANCE.getLinkableElement_InAction();

		/**
		 * The meta object literal for the '{@link sa.impl.DataDeclarationImpl <em>Data Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.DataDeclarationImpl
		 * @see sa.impl.SaPackageImpl#getDataDeclaration()
		 * @generated
		 */
		EClass DATA_DECLARATION = eINSTANCE.getDataDeclaration();

		/**
		 * The meta object literal for the '<em><b>Data Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DECLARATION__DATA_NAME = eINSTANCE.getDataDeclaration_DataName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DECLARATION__VALUE = eINSTANCE.getDataDeclaration_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DECLARATION__NAME = eINSTANCE.getDataDeclaration_Name();

		/**
		 * The meta object literal for the '{@link sa.impl.PrimitiveDataDeclarationImpl <em>Primitive Data Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.PrimitiveDataDeclarationImpl
		 * @see sa.impl.SaPackageImpl#getPrimitiveDataDeclaration()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_DECLARATION = eINSTANCE.getPrimitiveDataDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_DECLARATION__TYPE = eINSTANCE.getPrimitiveDataDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Value Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_DATA_DECLARATION__VALUE_EXP = eINSTANCE.getPrimitiveDataDeclaration_ValueExp();

		/**
		 * The meta object literal for the '{@link sa.impl.StructuredDataDeclarationImpl <em>Structured Data Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StructuredDataDeclarationImpl
		 * @see sa.impl.SaPackageImpl#getStructuredDataDeclaration()
		 * @generated
		 */
		EClass STRUCTURED_DATA_DECLARATION = eINSTANCE.getStructuredDataDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_DATA_DECLARATION__TYPE_EXP = eINSTANCE.getStructuredDataDeclaration_TypeExp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_DATA_DECLARATION__TYPE = eINSTANCE.getStructuredDataDeclaration_Type();

		/**
		 * The meta object literal for the '{@link sa.impl.StructuredDataTypeImpl <em>Structured Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StructuredDataTypeImpl
		 * @see sa.impl.SaPackageImpl#getStructuredDataType()
		 * @generated
		 */
		EClass STRUCTURED_DATA_TYPE = eINSTANCE.getStructuredDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_DATA_TYPE__NAME = eINSTANCE.getStructuredDataType_Name();

		/**
		 * The meta object literal for the '{@link sa.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.EnumerationImpl
		 * @see sa.impl.SaPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link sa.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StructureImpl
		 * @see sa.impl.SaPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__MEMBERS = eINSTANCE.getStructure_Members();

		/**
		 * The meta object literal for the '{@link sa.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ConstantImpl
		 * @see sa.impl.SaPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link sa.impl.IntegerConstImpl <em>Integer Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.IntegerConstImpl
		 * @see sa.impl.SaPackageImpl#getIntegerConst()
		 * @generated
		 */
		EClass INTEGER_CONST = eINSTANCE.getIntegerConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONST__VALUE = eINSTANCE.getIntegerConst_Value();

		/**
		 * The meta object literal for the '{@link sa.impl.BooleanConstImpl <em>Boolean Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.BooleanConstImpl
		 * @see sa.impl.SaPackageImpl#getBooleanConst()
		 * @generated
		 */
		EClass BOOLEAN_CONST = eINSTANCE.getBooleanConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONST__VALUE = eINSTANCE.getBooleanConst_Value();

		/**
		 * The meta object literal for the '{@link sa.impl.RealConstImpl <em>Real Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.RealConstImpl
		 * @see sa.impl.SaPackageImpl#getRealConst()
		 * @generated
		 */
		EClass REAL_CONST = eINSTANCE.getRealConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_CONST__VALUE = eINSTANCE.getRealConst_Value();

		/**
		 * The meta object literal for the '{@link sa.impl.StringConstImpl <em>String Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StringConstImpl
		 * @see sa.impl.SaPackageImpl#getStringConst()
		 * @generated
		 */
		EClass STRING_CONST = eINSTANCE.getStringConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONST__VALUE = eINSTANCE.getStringConst_Value();

		/**
		 * The meta object literal for the '{@link sa.impl.EnumConstImpl <em>Enum Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.EnumConstImpl
		 * @see sa.impl.SaPackageImpl#getEnumConst()
		 * @generated
		 */
		EClass ENUM_CONST = eINSTANCE.getEnumConst();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_CONST__ENUMERATION = eINSTANCE.getEnumConst_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_CONST__VALUE = eINSTANCE.getEnumConst_Value();

		/**
		 * The meta object literal for the '{@link sa.impl.StructureConstImpl <em>Structure Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StructureConstImpl
		 * @see sa.impl.SaPackageImpl#getStructureConst()
		 * @generated
		 */
		EClass STRUCTURE_CONST = eINSTANCE.getStructureConst();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_CONST__VALUES = eINSTANCE.getStructureConst_Values();

		/**
		 * The meta object literal for the '{@link sa.impl.StructureElementImpl <em>Structure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StructureElementImpl
		 * @see sa.impl.SaPackageImpl#getStructureElement()
		 * @generated
		 */
		EClass STRUCTURE_ELEMENT = eINSTANCE.getStructureElement();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_ELEMENT__MEMBER = eINSTANCE.getStructureElement_Member();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_ELEMENT__VALUE = eINSTANCE.getStructureElement_Value();

		/**
		 * The meta object literal for the '{@link sa.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ExpressionImpl
		 * @see sa.impl.SaPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '{@link sa.impl.NullExpImpl <em>Null Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.NullExpImpl
		 * @see sa.impl.SaPackageImpl#getNullExp()
		 * @generated
		 */
		EClass NULL_EXP = eINSTANCE.getNullExp();

		/**
		 * The meta object literal for the '{@link sa.impl.DataRefImpl <em>Data Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.DataRefImpl
		 * @see sa.impl.SaPackageImpl#getDataRef()
		 * @generated
		 */
		EClass DATA_REF = eINSTANCE.getDataRef();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REF__DECLARATION = eINSTANCE.getDataRef_Declaration();

		/**
		 * The meta object literal for the '{@link sa.impl.StructureMemberRefImpl <em>Structure Member Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.StructureMemberRefImpl
		 * @see sa.impl.SaPackageImpl#getStructureMemberRef()
		 * @generated
		 */
		EClass STRUCTURE_MEMBER_REF = eINSTANCE.getStructureMemberRef();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_MEMBER_REF__STRUCTURE = eINSTANCE.getStructureMemberRef_Structure();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_MEMBER_REF__MEMBER = eINSTANCE.getStructureMemberRef_Member();

		/**
		 * The meta object literal for the '{@link sa.impl.ArithmeticExprImpl <em>Arithmetic Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.ArithmeticExprImpl
		 * @see sa.impl.SaPackageImpl#getArithmeticExpr()
		 * @generated
		 */
		EClass ARITHMETIC_EXPR = eINSTANCE.getArithmeticExpr();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPR__LEFT_OPERAND = eINSTANCE.getArithmeticExpr_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPR__RIGHT_OPERAND = eINSTANCE.getArithmeticExpr_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPR__OPERATOR = eINSTANCE.getArithmeticExpr_Operator();

		/**
		 * The meta object literal for the '{@link sa.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.BooleanExprImpl
		 * @see sa.impl.SaPackageImpl#getBooleanExpr()
		 * @generated
		 */
		EClass BOOLEAN_EXPR = eINSTANCE.getBooleanExpr();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPR__LEFT_OPERAND = eINSTANCE.getBooleanExpr_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPR__RIGHT_OPERAND = eINSTANCE.getBooleanExpr_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPR__OPERATOR = eINSTANCE.getBooleanExpr_Operator();

		/**
		 * The meta object literal for the '{@link sa.impl.RelationalExprImpl <em>Relational Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.impl.RelationalExprImpl
		 * @see sa.impl.SaPackageImpl#getRelationalExpr()
		 * @generated
		 */
		EClass RELATIONAL_EXPR = eINSTANCE.getRelationalExpr();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPR__LEFT_OPERAND = eINSTANCE.getRelationalExpr_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPR__RIGHT_OPERAND = eINSTANCE.getRelationalExpr_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPR__OPERATOR = eINSTANCE.getRelationalExpr_Operator();

		/**
		 * The meta object literal for the '{@link sa.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.PrimitiveType
		 * @see sa.impl.SaPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link sa.ArithmeticOp <em>Arithmetic Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.ArithmeticOp
		 * @see sa.impl.SaPackageImpl#getArithmeticOp()
		 * @generated
		 */
		EEnum ARITHMETIC_OP = eINSTANCE.getArithmeticOp();

		/**
		 * The meta object literal for the '{@link sa.BooleanOp <em>Boolean Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.BooleanOp
		 * @see sa.impl.SaPackageImpl#getBooleanOp()
		 * @generated
		 */
		EEnum BOOLEAN_OP = eINSTANCE.getBooleanOp();

		/**
		 * The meta object literal for the '{@link sa.RelationalOp <em>Relational Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sa.RelationalOp
		 * @see sa.impl.SaPackageImpl#getRelationalOp()
		 * @generated
		 */
		EEnum RELATIONAL_OP = eINSTANCE.getRelationalOp();

	}

} //SaPackage
