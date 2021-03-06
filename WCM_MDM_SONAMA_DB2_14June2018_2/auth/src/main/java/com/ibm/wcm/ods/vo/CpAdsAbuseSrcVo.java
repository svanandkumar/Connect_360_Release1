package com.ibm.wcm.ods.vo;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
/**
 * CpAdsAbuseSrc generated by hbm2java
 */
import com.ibm.gbs.util.Constant;
import com.ibm.wcm.ods.dto.ClientProfileAdsSrc; 
//  @Entity
//  @Table(schema = Constant.SCHEMANAME_ODS , name = "CP_ADS_ABUSE_SRC")
public class CpAdsAbuseSrcVo  {   // implements  java.io.Serializable {

	private BigDecimal cpAdsAbuseSeqNum;
	private ClientProfileAdsSrc clientProfileAdsSrc;
	private String itemAbusedPriority;
	private String abuseHistory;

	public CpAdsAbuseSrcVo() {
	}

	public CpAdsAbuseSrcVo(BigDecimal cpAdsAbuseSeqNum, ClientProfileAdsSrc clientProfileAdsSrc) {
		this.cpAdsAbuseSeqNum = cpAdsAbuseSeqNum;
		this.clientProfileAdsSrc = clientProfileAdsSrc;
	}

	public CpAdsAbuseSrcVo(BigDecimal cpAdsAbuseSeqNum, ClientProfileAdsSrc clientProfileAdsSrc,
			String itemAbusedPriority, String abuseHistory) {
		this.cpAdsAbuseSeqNum = cpAdsAbuseSeqNum;
		this.clientProfileAdsSrc = clientProfileAdsSrc;
		this.itemAbusedPriority = itemAbusedPriority;
		this.abuseHistory = abuseHistory;
	}

	//  @Id

	//  @Column(name = "CP_ADS_ABUSE_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getCpAdsAbuseSeqNum() {
		return this.cpAdsAbuseSeqNum;
	}

	public void setCpAdsAbuseSeqNum(BigDecimal cpAdsAbuseSeqNum) {
		this.cpAdsAbuseSeqNum = cpAdsAbuseSeqNum;
	}

	//  @ManyToOne(fetch = FetchType.LAZY)
	//  @JoinColumn(name = "CLIENT_PROFILE_ADS_SEQ_NUM", nullable = false)
	public ClientProfileAdsSrc getClientProfileAdsSrc() {
		return this.clientProfileAdsSrc;
	}

	public void setClientProfileAdsSrc(ClientProfileAdsSrc clientProfileAdsSrc) {
		this.clientProfileAdsSrc = clientProfileAdsSrc;
	}

	//  @Column(name = "ITEM_ABUSED_PRIORITY", length = 60)
	public String getItemAbusedPriority() {
		return this.itemAbusedPriority;
	}

	public void setItemAbusedPriority(String itemAbusedPriority) {
		this.itemAbusedPriority = itemAbusedPriority;
	}

	//  @Column(name = "ABUSE_HISTORY", length = 60)
	public String getAbuseHistory() {
		return this.abuseHistory;
	}

	public void setAbuseHistory(String abuseHistory) {
		this.abuseHistory = abuseHistory;
	}

}
