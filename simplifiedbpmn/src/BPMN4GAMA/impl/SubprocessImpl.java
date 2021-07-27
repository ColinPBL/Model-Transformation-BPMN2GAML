/**
 */
package BPMN4GAMA.impl;

import BPMN4GAMA.BPMN4GAMAPackage;
import BPMN4GAMA.Subprocess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprocess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BPMN4GAMA.impl.SubprocessImpl#getProcessRef <em>Process Ref</em>}</li>
 *   <li>{@link BPMN4GAMA.impl.SubprocessImpl#isIsMultiInstance <em>Is Multi Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprocessImpl extends ActivityImpl implements Subprocess {
	/**
	 * The cached value of the '{@link #getProcessRef() <em>Process Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRef()
	 * @generated
	 * @ordered
	 */
	protected BPMN4GAMA.Process processRef;

	/**
	 * The default value of the '{@link #isIsMultiInstance() <em>Is Multi Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiInstance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTI_INSTANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultiInstance() <em>Is Multi Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiInstance()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiInstance = IS_MULTI_INSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprocessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN4GAMAPackage.Literals.SUBPROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMN4GAMA.Process getProcessRef() {
		if (processRef != null && processRef.eIsProxy()) {
			InternalEObject oldProcessRef = (InternalEObject)processRef;
			processRef = (BPMN4GAMA.Process)eResolveProxy(oldProcessRef);
			if (processRef != oldProcessRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN4GAMAPackage.SUBPROCESS__PROCESS_REF, oldProcessRef, processRef));
			}
		}
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN4GAMA.Process basicGetProcessRef() {
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessRef(BPMN4GAMA.Process newProcessRef) {
		BPMN4GAMA.Process oldProcessRef = processRef;
		processRef = newProcessRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN4GAMAPackage.SUBPROCESS__PROCESS_REF, oldProcessRef, processRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMultiInstance() {
		return isMultiInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMultiInstance(boolean newIsMultiInstance) {
		boolean oldIsMultiInstance = isMultiInstance;
		isMultiInstance = newIsMultiInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN4GAMAPackage.SUBPROCESS__IS_MULTI_INSTANCE, oldIsMultiInstance, isMultiInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN4GAMAPackage.SUBPROCESS__PROCESS_REF:
				if (resolve) return getProcessRef();
				return basicGetProcessRef();
			case BPMN4GAMAPackage.SUBPROCESS__IS_MULTI_INSTANCE:
				return isIsMultiInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMN4GAMAPackage.SUBPROCESS__PROCESS_REF:
				setProcessRef((BPMN4GAMA.Process)newValue);
				return;
			case BPMN4GAMAPackage.SUBPROCESS__IS_MULTI_INSTANCE:
				setIsMultiInstance((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BPMN4GAMAPackage.SUBPROCESS__PROCESS_REF:
				setProcessRef((BPMN4GAMA.Process)null);
				return;
			case BPMN4GAMAPackage.SUBPROCESS__IS_MULTI_INSTANCE:
				setIsMultiInstance(IS_MULTI_INSTANCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BPMN4GAMAPackage.SUBPROCESS__PROCESS_REF:
				return processRef != null;
			case BPMN4GAMAPackage.SUBPROCESS__IS_MULTI_INSTANCE:
				return isMultiInstance != IS_MULTI_INSTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isMultiInstance: ");
		result.append(isMultiInstance);
		result.append(')');
		return result.toString();
	}

} //SubprocessImpl
