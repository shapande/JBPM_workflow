package com.citiustech.mrr.sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ABSPROV implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ABSPROV_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "ABSPROV_ID_GENERATOR", sequenceName = "ABSPROV_ID_SEQ")
	@javax.persistence.Column(name ="ABS_PROV_ID")
	private java.lang.Long absProvId;

	@javax.persistence.Column(name = "CMM_ID")
	private java.lang.Long cmmId;

	@javax.persistence.Column(name = "CPMM_ID")
	private java.lang.Long cpmmId;

	@javax.persistence.Column(name = "STATUS")
	private java.lang.String status;

	public ABSPROV() {
	}

	public java.lang.Long getAbsProvId() {
		return this.absProvId;
	}

	public void setAbsProvId(java.lang.Long absProvId) {
		this.absProvId = absProvId;
	}

	public java.lang.Long getCmmId() {
		return this.cmmId;
	}

	public void setCmmId(java.lang.Long cmmId) {
		this.cmmId = cmmId;
	}

	public java.lang.Long getCpmmId() {
		return this.cpmmId;
	}

	public void setCpmmId(java.lang.Long cpmmId) {
		this.cpmmId = cpmmId;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public ABSPROV(java.lang.Long absProvId, java.lang.Long cmmId,
			java.lang.Long cpmmId, java.lang.String status) {
		this.absProvId = absProvId;
		this.cmmId = cmmId;
		this.cpmmId = cpmmId;
		this.status = status;
	}

}