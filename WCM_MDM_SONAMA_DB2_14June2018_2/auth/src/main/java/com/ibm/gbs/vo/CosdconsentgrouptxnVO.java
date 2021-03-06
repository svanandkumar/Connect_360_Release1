/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.vo;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cosdconsentgrouptxn generated by hbm2java
 */
@Entity
@Table(name = "cosdconsentgrouptxn", schema = "public")
public class CosdconsentgrouptxnVO   {

	private BigDecimal consentgrouptxnid;
	public BigDecimal getConsentgrouptxnid() {
		return consentgrouptxnid;
	}

	public void setConsentgrouptxnid(BigDecimal consentgrouptxnid) {
		this.consentgrouptxnid = consentgrouptxnid;
	}

	public long getCosdabactransaction() {
		return cosdabactransaction;
	}

	public void setCosdabactransaction(long cosdabactransaction) {
		this.cosdabactransaction = cosdabactransaction;
	}

	public long getCosdconsentgroup() {
		return cosdconsentgroup;
	}

	public void setCosdconsentgroup(long cosdconsentgroup) {
		this.cosdconsentgroup = cosdconsentgroup;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	public Date getLastupdatedon() {
		return lastupdatedon;
	}

	public void setLastupdatedon(Date lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}

	private long cosdabactransaction;
	private long cosdconsentgroup;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;

	public CosdconsentgrouptxnVO() {
	}

	

}
