package com.citiustech.mrr.sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MRR implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private Integer counter;
	private com.citiustech.mrr.sample.CMM cmm;
	public MRR() {
	}

	public java.lang.Integer getCounter() {
		return this.counter;
	}

	public void setCounter(java.lang.Integer counter) {
		this.counter = counter;
	}

	public com.citiustech.mrr.sample.CMM getCmm() {
		return this.cmm;
	}

	public void setCmm(com.citiustech.mrr.sample.CMM cmm) {
		this.cmm = cmm;
	}

	public MRR(java.lang.Integer counter, com.citiustech.mrr.sample.CMM cmm) {
		this.counter = counter;
		this.cmm = cmm;
	}

}