package com.ibm.wcm.ods.vo;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MvVwcosdieClientInd1V generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
//  @Entity
//  @Table(schema = Constant.SCHEMANAME_ODS , name = "MV_VWCOSDIE_CLIENT_IND1_V")
public class MvVwcosdieClientInd1V  {   // implements  java.io.Serializable {

	private String k00;

	public MvVwcosdieClientInd1V() {
	}

	public MvVwcosdieClientInd1V(String k00) {
		this.k00 = k00;
	}

	//  @Id

	//  @Column(name = "K00", length = 42)
	public String getK00() {
		return this.k00;
	}

	public void setK00(String k00) {
		this.k00 = k00;
	}

}