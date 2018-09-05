/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.vo;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

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
 * Cosdabacconstraint generated by hbm2java
 */
@Entity
@Table(name = "cosdabacconstraint", schema = "system")
public class CosdabacconstraintVO   {

	private BigDecimal attributeconstraintid;
	private String attributename;
	private String attributevalue;
	private String accessconstrainttype;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;
	private BigDecimal controlgroupid;
	private BigDecimal transactionid;
	

	
	public BigDecimal getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(BigDecimal transactionid) {
		this.transactionid = transactionid;
	}

	public CosdabacconstraintVO() {
	}

	public CosdabacconstraintVO(BigDecimal attributeconstraintid, String attributename, String attributevalue,
			String accessconstrainttype) {
		this.attributeconstraintid = attributeconstraintid;
		this.attributename = attributename;
		this.attributevalue = attributevalue;
		this.accessconstrainttype = accessconstrainttype;
	}

	public CosdabacconstraintVO(BigDecimal attributeconstraintid, String attributename, String attributevalue,
			String accessconstrainttype, String createdby, Date createdon, String lastupdatedby, Date lastupdatedon
			) {
		this.attributeconstraintid = attributeconstraintid;
		this.attributename = attributename;
		this.attributevalue = attributevalue;
		this.accessconstrainttype = accessconstrainttype;
		this.createdby = createdby;
		this.createdon = createdon;
		this.lastupdatedby = lastupdatedby;
		this.lastupdatedon = lastupdatedon;
		
	}

	@Id

	@Column(name = "attributeconstraintid", unique = true, nullable = false, scale = 0)
	public BigDecimal getAttributeconstraintid() {
		return this.attributeconstraintid;
	}

	public void setAttributeconstraintid(BigDecimal attributeconstraintid) {
		this.attributeconstraintid = attributeconstraintid;
	}

	@Column(name = "attributename", nullable = false, length = 30)
	public String getAttributename() {
		return this.attributename;
	}

	public void setAttributename(String attributename) {
		this.attributename = attributename;
	}

	@Column(name = "attributevalue", nullable = false, length = 100)
	public String getAttributevalue() {
		return this.attributevalue;
	}

	public void setAttributevalue(String attributevalue) {
		this.attributevalue = attributevalue;
	}

	@Column(name = "accessconstrainttype", nullable = false, length = 10)
	public String getAccessconstrainttype() {
		return this.accessconstrainttype;
	}

	public void setAccessconstrainttype(String accessconstrainttype) {
		this.accessconstrainttype = accessconstrainttype;
	}

	@Column(name = "createdby", length = 64)
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "createdon", length = 13)
	public Date getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	@Column(name = "lastupdatedby", length = 64)
	public String getLastupdatedby() {
		return this.lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "lastupdatedon", length = 13)
	public Date getLastupdatedon() {
		return this.lastupdatedon;
	}

	public void setLastupdatedon(Date lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}


	
	public BigDecimal getControlgroupid() {
		return controlgroupid;
	}
	public void setControlgroupid(BigDecimal controlgroupid) {
		this.controlgroupid = controlgroupid;
	}

}