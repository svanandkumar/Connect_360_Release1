package com.ibm.wcm.ods.dto;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClientProfilePscSrc generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
@Entity
@Table(schema = Constant.SCHEMANAME_ODS , name = "CLIENT_PROFILE_PSC_SRC")
public class ClientProfilePscSrc implements java.io.Serializable {

	private BigDecimal clientProfilePscSeqNum;
	private String clientId;
	private String sourceSystemId;
	private String numChldLwseDueToPrbt;
	private String numChldLwseDueToCpo;
	private Date processTs;
	private String livesWithParents;
	private String caseWorker;
	private Set<CpPscProviderSrc> cpPscProviderSrcs = new HashSet<CpPscProviderSrc>(0);
	private Set<CpPscEncounterSrc> cpPscEncounterSrcs = new HashSet<CpPscEncounterSrc>(0);

	public ClientProfilePscSrc() {
	}

	public ClientProfilePscSrc(BigDecimal clientProfilePscSeqNum, String clientId, String sourceSystemId) {
		this.clientProfilePscSeqNum = clientProfilePscSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
	}

	public ClientProfilePscSrc(BigDecimal clientProfilePscSeqNum, String clientId, String sourceSystemId,
			String numChldLwseDueToPrbt, String numChldLwseDueToCpo, Date processTs, String livesWithParents,
			String caseWorker, Set<CpPscProviderSrc> cpPscProviderSrcs, Set<CpPscEncounterSrc> cpPscEncounterSrcs) {
		this.clientProfilePscSeqNum = clientProfilePscSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
		this.numChldLwseDueToPrbt = numChldLwseDueToPrbt;
		this.numChldLwseDueToCpo = numChldLwseDueToCpo;
		this.processTs = processTs;
		this.livesWithParents = livesWithParents;
		this.caseWorker = caseWorker;
		this.cpPscProviderSrcs = cpPscProviderSrcs;
		this.cpPscEncounterSrcs = cpPscEncounterSrcs;
	}

	@Id

	@Column(name = "CLIENT_PROFILE_PSC_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getClientProfilePscSeqNum() {
		return this.clientProfilePscSeqNum;
	}

	public void setClientProfilePscSeqNum(BigDecimal clientProfilePscSeqNum) {
		this.clientProfilePscSeqNum = clientProfilePscSeqNum;
	}

	@Column(name = "CLIENT_ID", nullable = false, length = 60)
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@Column(name = "SOURCE_SYSTEM_ID", nullable = false, length = 40)
	public String getSourceSystemId() {
		return this.sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	@Column(name = "NUM_CHLD_LWSE_DUE_TO_PRBT", length = 256)
	public String getNumChldLwseDueToPrbt() {
		return this.numChldLwseDueToPrbt;
	}

	public void setNumChldLwseDueToPrbt(String numChldLwseDueToPrbt) {
		this.numChldLwseDueToPrbt = numChldLwseDueToPrbt;
	}

	@Column(name = "NUM_CHLD_LWSE_DUE_TO_CPO", length = 256)
	public String getNumChldLwseDueToCpo() {
		return this.numChldLwseDueToCpo;
	}

	public void setNumChldLwseDueToCpo(String numChldLwseDueToCpo) {
		this.numChldLwseDueToCpo = numChldLwseDueToCpo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PROCESS_TS", length = 26)
	public Date getProcessTs() {
		return this.processTs;
	}

	public void setProcessTs(Date processTs) {
		this.processTs = processTs;
	}

	@Column(name = "LIVES_WITH_PARENTS", length = 3)
	public String getLivesWithParents() {
		return this.livesWithParents;
	}

	public void setLivesWithParents(String livesWithParents) {
		this.livesWithParents = livesWithParents;
	}

	@Column(name = "CASE_WORKER", length = 20)
	public String getCaseWorker() {
		return this.caseWorker;
	}

	public void setCaseWorker(String caseWorker) {
		this.caseWorker = caseWorker;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clientProfilePscSrc")
	public Set<CpPscProviderSrc> getCpPscProviderSrcs() {
		return this.cpPscProviderSrcs;
	}

	public void setCpPscProviderSrcs(Set<CpPscProviderSrc> cpPscProviderSrcs) {
		this.cpPscProviderSrcs = cpPscProviderSrcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clientProfilePscSrc")
	public Set<CpPscEncounterSrc> getCpPscEncounterSrcs() {
		return this.cpPscEncounterSrcs;
	}

	public void setCpPscEncounterSrcs(Set<CpPscEncounterSrc> cpPscEncounterSrcs) {
		this.cpPscEncounterSrcs = cpPscEncounterSrcs;
	}

}
