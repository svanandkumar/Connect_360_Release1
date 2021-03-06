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
 * Cosdabaccontrolgroup generated by hbm2java
 */
@Entity
@Table(name = "cosdabaccontrolgroup", schema = "system")
public class CosdabaccontrolgroupVO   {

	private BigDecimal controlgroupid;
	private String controlgroupname;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;
	
	
	public CosdabaccontrolgroupVO() {
	}

	public CosdabaccontrolgroupVO(BigDecimal controlgroupid, String controlgroupname) {
		this.controlgroupid = controlgroupid;
		this.controlgroupname = controlgroupname;
	}

	public CosdabaccontrolgroupVO(BigDecimal controlgroupid, String controlgroupname, String createdby, Date createdon,
			String lastupdatedby, Date lastupdatedon /*, Set<Cosdabaccontrolobject> cosdabaccontrolobjects,
			Set<Cosdauthorizationgroup> cosdauthorizationgroups */) {
		this.controlgroupid = controlgroupid;
		this.controlgroupname = controlgroupname;
		this.createdby = createdby;
		this.createdon = createdon;
		this.lastupdatedby = lastupdatedby;
		this.lastupdatedon = lastupdatedon;
		/*this.cosdabaccontrolobjects = cosdabaccontrolobjects;
		this.cosdauthorizationgroups = cosdauthorizationgroups;*/
	}

	@Id

	@Column(name = "controlgroupid", unique = true, nullable = false, scale = 0)
	public BigDecimal getControlgroupid() {
		return this.controlgroupid;
	}

	public void setControlgroupid(BigDecimal controlgroupid) {
		this.controlgroupid = controlgroupid;
	}

	@Column(name = "controlgroupname", nullable = false, length = 30)
	public String getControlgroupname() {
		return this.controlgroupname;
	}

	public void setControlgroupname(String controlgroupname) {
		this.controlgroupname = controlgroupname;
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

	
	
}
