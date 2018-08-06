package com.citiustech.mrr;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * This class was automatically generated by the data modeler tool.
 */
@Table(name = "CMM_CHSE_LST")
@Entity
public class CMM1 implements java.io.Serializable{

    private static final long serialVersionUID = 1L; 

	@Id
	@SequenceGenerator(name = "CMM_ID_GENERATOR", sequenceName = "CMM_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CMM_ID_GENERATOR")
	@Column(name = "CMM_ID")
	private Long cmmId;

	@Column(name = "CMM_CHSE_CD")
	private String cmmChseCd;

	@Column(name = "MEM_ID")
	private Long memId;

	@Column(name = "CMPG_ID")
	private Long cpmgId;

	@Column(name = "CMPG_CD")
	private String cmpgCd;

	@Column(name = "MSR_VER")
	private Integer msrVer;

	@Column(name = "MSR_ID")
	private Long measureId;

	@Column(name = "MSR_CD")
	private String msrCd;

	@Column(name = "SUBMSR_ID")
	private Long submsrId;

	@Column(name = "SUBMSR_CD")
	private String submsrCd;

	@Column(name = "CMM_CHSE_STS_MSTR_ID")
	private Long cmmChseStsId;

	@Column(name = "CMM_CHSE_STS_MSTR_CD")
	private String cmmChseSts;

	@Column(name = "VLD_FRM_DT")
	private Date validFromDate;

	@Column(name = "VLD_TO_DT")
	private Date validToDate;

	@Column(name = "DEL_FLG")
	private Boolean deleted;

	@Column(name = "RAW_CHSE_ID")
	private Long rawChseId;

	@Column(name = "CMM_CHSE_DUE_DT")
	private Date cmmChseDueDt;

    @Column(name = "OVRD_CNT")
	private Long ovrdCnt;

	@Column(name = "RPT_FRM_DT")
	private Date rptFrom;

	@Column(name = "RPT_TO_DT")
	private Date rptTo;

	@Column(name = "ACT_CD")
	private String action;

	@Column(name = "ASSGD_TO_LGN_ID")
	private String assignToUser;

	@Transient
	private List<com.citiustech.mrr.CPMM1> cpmmList;

	@Transient
	private Integer counter;

	@Transient
	private Integer abstracterCounter;

	public CMM1() {
	}

	public Long getCmmId() {
		return cmmId;
	}

	public void setCmmId(Long cmmId) {
		this.cmmId = cmmId;
	}

	public String getCmmChseCd() {
		return cmmChseCd;
	}

	public void setCmmChseCd(String cmmChseCd) {
		this.cmmChseCd = cmmChseCd;
	}

	public Long getMemId() {
		return memId;
	}

	public void setMemId(Long memId) {
		this.memId = memId;
	}

	public Long getCpmgId() {
		return cpmgId;
	}

	public void setCpmgId(Long cpmgId) {
		this.cpmgId = cpmgId;
	}

	public String getCmpgCd() {
		return cmpgCd;
	}

	public void setCmpgCd(String cmpgCd) {
		this.cmpgCd = cmpgCd;
	}

	public Integer getMsrVer() {
		return msrVer;
	}

	public void setMsrVer(Integer msrVer) {
		this.msrVer = msrVer;
	}

	public Long getMeasureId() {
		return measureId;
	}

	public void setMeasureId(Long measureId) {
		this.measureId = measureId;
	}

	public String getMsrCd() {
		return msrCd;
	}

	public void setMsrCd(String msrCd) {
		this.msrCd = msrCd;
	}

	public Long getSubmsrId() {
		return submsrId;
	}

	public void setSubmsrId(Long submsrId) {
		this.submsrId = submsrId;
	}

	public String getSubmsrCd() {
		return submsrCd;
	}

	public void setSubmsrCd(String submsrCd) {
		this.submsrCd = submsrCd;
	}

	public Long getCmmChseStsId() {
		return cmmChseStsId;
	}

	public void setCmmChseStsId(Long cmmChseStsId) {
		this.cmmChseStsId = cmmChseStsId;
	}

	public String getCmmChseSts() {
		return cmmChseSts;
	}

	public void setCmmChseSts(String cmmChseSts) {
		this.cmmChseSts = cmmChseSts;
	}

	public Date getValidFromDate() {
		return validFromDate;
	}

	public void setValidFromDate(Date validFromDate) {
		this.validFromDate = validFromDate;
	}

	public Date getValidToDate() {
		return validToDate;
	}

	public void setValidToDate(Date validToDate) {
		this.validToDate = validToDate;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Long getRawChseId() {
		return rawChseId;
	}

	public void setRawChseId(Long rawChseId) {
		this.rawChseId = rawChseId;
	}

	public Date getCmmChseDueDt() {
		return cmmChseDueDt;
	}

	public void setCmmChseDueDt(Date cmmChseDueDt) {
		this.cmmChseDueDt = cmmChseDueDt;
	}

	public Long getOvrdCnt() {
		return ovrdCnt;
	}

	public void setOvrdCnt(Long ovrdCnt) {
		this.ovrdCnt = ovrdCnt;
	}

	public Date getRptFrom() {
		return rptFrom;
	}

	public void setRptFrom(Date rptFrom) {
		this.rptFrom = rptFrom;
	}

	public Date getRptTo() {
		return rptTo;
	}

	public void setRptTo(Date rptTo) {
		this.rptTo = rptTo;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAssignToUser() {
		return assignToUser;
	}

	public void setAssignToUser(String assignToUser) {
		this.assignToUser = assignToUser;
	}

	public List<com.citiustech.mrr.CPMM1> getCpmmList() {
		return cpmmList;
	}

	public void setCpmmList(List<com.citiustech.mrr.CPMM1> cpmmList) {
		this.cpmmList = cpmmList;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public Integer getAbstracterCounter() {
		return abstracterCounter;
	}

	public void setAbstracterCounter(Integer abstracterCounter) {
		this.abstracterCounter = abstracterCounter;
	}

	public CMM1(Long cmmId, String cmmChseCd, Long memId, Long cpmgId, String cmpgCd, Integer msrVer,
	        Long measureId, String msrCd, Long submsrId, String submsrCd, Long cmmChseStsId,
	        String cmmChseSts, Date validFromDate, Date validToDate, Boolean deleted,
	        Long rawChseId, Date cmmChseDueDt, Long ovrdCnt, Date rptFrom, Date rptTo, String action,
	        String assignToUser, List<com.citiustech.mrr.CPMM1> cpmmList, Integer counter, Integer abstracterCounter) {
		super();
		this.cmmId = cmmId;
		this.cmmChseCd = cmmChseCd;
		this.memId = memId;
		this.cpmgId = cpmgId;
		this.cmpgCd = cmpgCd;
		this.msrVer = msrVer;
		this.measureId = measureId;
		this.msrCd = msrCd;
		this.submsrId = submsrId;
		this.submsrCd = submsrCd;
		this.cmmChseStsId = cmmChseStsId;
		this.cmmChseSts = cmmChseSts;
		this.validFromDate = validFromDate;
		this.validToDate = validToDate;
		this.deleted = deleted;
		this.rawChseId = rawChseId;
		this.cmmChseDueDt = cmmChseDueDt;
		this.ovrdCnt = ovrdCnt;
		this.rptFrom = rptFrom;
		this.rptTo = rptTo;
		this.action = action;
		this.assignToUser = assignToUser;
		this.cpmmList = cpmmList;
		this.counter = counter;
		this.abstracterCounter = abstracterCounter;
	}
}