package com.citiustech.mrr.signaleventpoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProvidersBO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "providerId")
	private java.lang.String providerId;
	@org.kie.api.definition.type.Label(value = "parentProcessID")
	private java.lang.String parentProcessID;
	@org.kie.api.definition.type.Label(value = "subProcessID")
	private java.lang.String subProcessID;

	public ProvidersBO() {
	}

	public java.lang.String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(java.lang.String providerId) {
		this.providerId = providerId;
	}

	public java.lang.String getParentProcessID() {
		return this.parentProcessID;
	}

	public void setParentProcessID(java.lang.String parentProcessID) {
		this.parentProcessID = parentProcessID;
	}

	public java.lang.String getSubProcessID() {
		return this.subProcessID;
	}

	public void setSubProcessID(java.lang.String subProcessID) {
		this.subProcessID = subProcessID;
	}

	public ProvidersBO(java.lang.String providerId,
			java.lang.String parentProcessID, java.lang.String subProcessID) {
		this.providerId = providerId;
		this.parentProcessID = parentProcessID;
		this.subProcessID = subProcessID;
	}

}