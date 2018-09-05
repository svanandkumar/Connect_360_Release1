/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dto;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ibm.gbs.util.Constant;
/**
 * Cosdorgrolejobuser generated by hbm2java
 */
@Entity
@Table(name = "cosdorgrolejobuser", schema = Constant.SCHEMANAME )
public class Cosdorgrolejobuser implements java.io.Serializable {

	private BigDecimal orgrolejobuserid;
	private String username;
	private String rolename;
	private BigDecimal jobid;
	private BigDecimal organisationunitid;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;
	private String rolelevel;
	private String orgName ;

	private String jobName ;
	

	// orgUnitSeq, jobuserSeq
	public Cosdorgrolejobuser() {
	}

	public Cosdorgrolejobuser(BigDecimal orgrolejobuserid) {
		this.orgrolejobuserid = orgrolejobuserid;
	}

	public Cosdorgrolejobuser(BigDecimal orgrolejobuserid, String username, String rolename, BigDecimal jobid,
			BigDecimal organisationunitid, String createdby, Date createdon, String lastupdatedby, Date lastupdatedon) {
		this.orgrolejobuserid = orgrolejobuserid;
		this.username = username;
		this.rolename = rolename;
		this.jobid = jobid;
		this.organisationunitid = organisationunitid;
		this.createdby = createdby;
		this.createdon = createdon;
		this.lastupdatedby = lastupdatedby;
		this.lastupdatedon = lastupdatedon;
	}

	@Id
	@SequenceGenerator(schema = Constant.SCHEMANAME ,name  = "jobuserSeq", sequenceName = "jobuserSeq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="jobuserSeq")	
	@Column(name = "orgrolejobuserid", unique = true, nullable = false, scale = 0)
	public BigDecimal getOrgrolejobuserid() {
		return this.orgrolejobuserid;
	}

	public void setOrgrolejobuserid(BigDecimal orgrolejobuserid) {
		this.orgrolejobuserid = orgrolejobuserid;
	}

	@Column(name = "username", length = 64)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "rolename", length = 50)
	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	@Column(name = "jobid", scale = 0)
	public BigDecimal getJobid() {
		return this.jobid;
	}

	public void setJobid(BigDecimal jobid) {
		this.jobid = jobid;
	}

	@Column(name = "organisationunitid", scale = 0)
	public BigDecimal getOrganisationunitid() {
		return this.organisationunitid;
	}

	public void setOrganisationunitid(BigDecimal organisationunitid) {
		this.organisationunitid = organisationunitid;
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
	
	@Column(name = "rolelevel", length = 40)
	public String getRolelevel() {
		return rolelevel;
	}

	public void setRolelevel(String rolelevel) {
		this.rolelevel = rolelevel;
	}
	
	@Column(name = "orgName", length = 40)
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	@Column(name = "jobName", length = 40)
	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

}