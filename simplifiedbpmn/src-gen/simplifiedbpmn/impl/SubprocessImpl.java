/**
 */
package simplifiedbpmn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplifiedbpmn.SimplifiedbpmnPackage;
import simplifiedbpmn.Subprocess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprocess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.impl.SubprocessImpl#getProcessRef <em>Process Ref</em>}</li>
 *   <li>{@link simplifiedbpmn.impl.SubprocessImpl#isIsMultiInstance <em>Is Multi Instance</em>}</li>
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
	protected simplifiedbpmn.Process processRef;

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
		return SimplifiedbpmnPackage.Literals.SUBPROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplifiedbpmn.Process getProcessRef() {
		if (processRef != null && processRef.eIsProxy()) {
			InternalEObject oldProcessRef = (InternalEObject) processRef;
			processRef = (simplifiedbpmn.Process) eResolveProxy(oldProcessRef);
			if (processRef != oldProcessRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplifiedbpmnPackage.SUBPROCESS__PROCESS_REF, oldProcessRef, processRef));
			}
		}
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplifiedbpmn.Process basicGetProcessRef() {
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessRef(simplifiedbpmn.Process newProcessRef) {
		simplifiedbpmn.Process oldProcessRef = processRef;
		processRef = newProcessRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedbpmnPackage.SUBPROCESS__PROCESS_REF,
					oldProcessRef, processRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultiInstance() {
		return isMultiInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiInstance(boolean newIsMultiInstance) {
		boolean oldIsMultiInstance = isMultiInstance;
		isMultiInstance = newIsMultiInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedbpmnPackage.SUBPROCESS__IS_MULTI_INSTANCE,
					oldIsMultiInstance, isMultiInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplifiedbpmnPackage.SUBPROCESS__PROCESS_REF:
			if (resolve)
				return getProcessRef();
			return basicGetProcessRef();
		case SimplifiedbpmnPackage.SUBPROCESS__IS_MULTI_INSTANCE:
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
		case SimplifiedbpmnPackage.SUBPROCESS__PROCESS_REF:
			setProcessRef((simplifiedbpmn.Process) newValue);
			return;
		case SimplifiedbpmnPackage.SUBPROCESS__IS_MULTI_INSTANCE:
			setIsMultiInstance((Boolean) newValue);
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
		case SimplifiedbpmnPackage.SUBPROCESS__PROCESS_REF:
			setProcessRef((simplifiedbpmn.Process) null);
			return;
		case SimplifiedbpmnPackage.SUBPROCESS__IS_MULTI_INSTANCE:
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
		case SimplifiedbpmnPackage.SUBPROCESS__PROCESS_REF:
			return processRef != null;
		case SimplifiedbpmnPackage.SUBPROCESS__IS_MULTI_INSTANCE:
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isMultiInstance: ");
		result.append(isMultiInstance);
		result.append(')');
		return result.toString();
	}

} //SubprocessImpl
