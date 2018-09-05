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
 * InitloadClientTgt generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
@Entity
@Table(schema = Constant.SCHEMANAME_ODS , name = "INITLOAD_CLIENT_TGT")
public class InitloadClientTgt implements java.io.Serializable {

	private BigDecimal clientTransactionSeqNum;
	private String status;
	private String sourceSystemId;
	private String clientId;
	private String privilegedRecord;
	private String firstName;
	private String lastName;
	private String middleName;
	private Date dob;
	private String ssn;
	private String email;
	private String emailAlt;
	private String ethnicity;
	private String gender;
	private String residentialStatus;
	private String primaryLanguage;
	private String primaryLangAbility;
	private String secondaryLanguage;
	private String secondaryLangAbility;
	private String populationType;
	private String aliasName;
	private Date lastUpdateDatetime;
	private String title;
	private String suffix;
	private String birthlastname;
	private String placeofbirth;
	private String countryofbirth;
	private String gendercomment;
	private String race;
	private String preferredcomm;
	private Set<InitloadClientPhoneTgt> initloadClientPhoneTgts = new HashSet<InitloadClientPhoneTgt>(0);
	private Set<InitloadClientDisabilityTgt> initloadClientDisabilityTgts = new HashSet<InitloadClientDisabilityTgt>(0);
	private Set<InitloadClientDemoTgt> initloadClientDemoTgts = new HashSet<InitloadClientDemoTgt>(0);
	private Set<InitloadClientAddressTgt> initloadClientAddressTgts = new HashSet<InitloadClientAddressTgt>(0);

	public InitloadClientTgt() {
	}

	public InitloadClientTgt(BigDecimal clientTransactionSeqNum, String status, String sourceSystemId, String clientId,
			String firstName, String lastName, Date lastUpdateDatetime) {
		this.clientTransactionSeqNum = clientTransactionSeqNum;
		this.status = status;
		this.sourceSystemId = sourceSystemId;
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdateDatetime = lastUpdateDatetime;
	}

	public InitloadClientTgt(BigDecimal clientTransactionSeqNum, String status, String sourceSystemId, String clientId,
			String privilegedRecord, String firstName, String lastName, String middleName, Date dob, String ssn,
			String email, String emailAlt, String ethnicity, String gender, String residentialStatus,
			String primaryLanguage, String primaryLangAbility, String secondaryLanguage, String secondaryLangAbility,
			String populationType, String aliasName, Date lastUpdateDatetime, String title, String suffix,
			String birthlastname, String placeofbirth, String countryofbirth, String gendercomment, String race,
			String preferredcomm, Set<InitloadClientPhoneTgt> initloadClientPhoneTgts,
			Set<InitloadClientDisabilityTgt> initloadClientDisabilityTgts,
			Set<InitloadClientDemoTgt> initloadClientDemoTgts,
			Set<InitloadClientAddressTgt> initloadClientAddressTgts) {
		this.clientTransactionSeqNum = clientTransactionSeqNum;
		this.status = status;
		this.sourceSystemId = sourceSystemId;
		this.clientId = clientId;
		this.privilegedRecord = privilegedRecord;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.dob = dob;
		this.ssn = ssn;
		this.email = email;
		this.emailAlt = emailAlt;
		this.ethnicity = ethnicity;
		this.gender = gender;
		this.residentialStatus = residentialStatus;
		this.primaryLanguage = primaryLanguage;
		this.primaryLangAbility = primaryLangAbility;
		this.secondaryLanguage = secondaryLanguage;
		this.secondaryLangAbility = secondaryLangAbility;
		this.populationType = populationType;
		this.aliasName = aliasName;
		this.lastUpdateDatetime = lastUpdateDatetime;
		this.title = title;
		this.suffix = suffix;
		this.birthlastname = birthlastname;
		this.placeofbirth = placeofbirth;
		this.countryofbirth = countryofbirth;
		this.gendercomment = gendercomment;
		this.race = race;
		this.preferredcomm = preferredcomm;
		this.initloadClientPhoneTgts = initloadClientPhoneTgts;
		this.initloadClientDisabilityTgts = initloadClientDisabilityTgts;
		this.initloadClientDemoTgts = initloadClientDemoTgts;
		this.initloadClientAddressTgts = initloadClientAddressTgts;
	}

	@Id

	@Column(name = "CLIENT_TRANSACTION_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getClientTransactionSeqNum() {
		return this.clientTransactionSeqNum;
	}

	public void setClientTransactionSeqNum(BigDecimal clientTransactionSeqNum) {
		this.clientTransactionSeqNum = clientTransactionSeqNum;
	}

	@Column(name = "STATUS", nullable = false, length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "SOURCE_SYSTEM_ID", nullable = false, length = 40)
	public String getSourceSystemId() {
		return this.sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	@Column(name = "CLIENT_ID", nullable = false, length = 60)
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@Column(name = "PRIVILEGED_RECORD", length = 20)
	public String getPrivilegedRecord() {
		return this.privilegedRecord;
	}

	public void setPrivilegedRecord(String privilegedRecord) {
		this.privilegedRecord = privilegedRecord;
	}

	@Column(name = "FIRST_NAME", nullable = false, length = 30)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", nullable = false, length = 75)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "MIDDLE_NAME", length = 30)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DOB", length = 10)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "SSN", length = 11)
	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "EMAIL_ALT", length = 100)
	public String getEmailAlt() {
		return this.emailAlt;
	}

	public void setEmailAlt(String emailAlt) {
		this.emailAlt = emailAlt;
	}

	@Column(name = "ETHNICITY", length = 60)
	public String getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	@Column(name = "GENDER", length = 15)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "RESIDENTIAL_STATUS", length = 100)
	public String getResidentialStatus() {
		return this.residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	@Column(name = "PRIMARY_LANGUAGE", length = 60)
	public String getPrimaryLanguage() {
		return this.primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	@Column(name = "PRIMARY_LANG_ABILITY", length = 256)
	public String getPrimaryLangAbility() {
		return this.primaryLangAbility;
	}

	public void setPrimaryLangAbility(String primaryLangAbility) {
		this.primaryLangAbility = primaryLangAbility;
	}

	@Column(name = "SECONDARY_LANGUAGE", length = 60)
	public String getSecondaryLanguage() {
		return this.secondaryLanguage;
	}

	public void setSecondaryLanguage(String secondaryLanguage) {
		this.secondaryLanguage = secondaryLanguage;
	}

	@Column(name = "SECONDARY_LANG_ABILITY", length = 256)
	public String getSecondaryLangAbility() {
		return this.secondaryLangAbility;
	}

	public void setSecondaryLangAbility(String secondaryLangAbility) {
		this.secondaryLangAbility = secondaryLangAbility;
	}

	@Column(name = "POPULATION_TYPE", length = 60)
	public String getPopulationType() {
		return this.populationType;
	}

	public void setPopulationType(String populationType) {
		this.populationType = populationType;
	}

	@Column(name = "ALIAS_NAME", length = 150)
	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DATETIME", nullable = false, length = 26)
	public Date getLastUpdateDatetime() {
		return this.lastUpdateDatetime;
	}

	public void setLastUpdateDatetime(Date lastUpdateDatetime) {
		this.lastUpdateDatetime = lastUpdateDatetime;
	}

	@Column(name = "TITLE", length = 15)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "SUFFIX", length = 20)
	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@Column(name = "BIRTHLASTNAME", length = 65)
	public String getBirthlastname() {
		return this.birthlastname;
	}

	public void setBirthlastname(String birthlastname) {
		this.birthlastname = birthlastname;
	}

	@Column(name = "PLACEOFBIRTH", length = 30)
	public String getPlaceofbirth() {
		return this.placeofbirth;
	}

	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}

	@Column(name = "COUNTRYOFBIRTH", length = 50)
	public String getCountryofbirth() {
		return this.countryofbirth;
	}

	public void setCountryofbirth(String countryofbirth) {
		this.countryofbirth = countryofbirth;
	}

	@Column(name = "GENDERCOMMENT", length = 50)
	public String getGendercomment() {
		return this.gendercomment;
	}

	public void setGendercomment(String gendercomment) {
		this.gendercomment = gendercomment;
	}

	@Column(name = "RACE", length = 128)
	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Column(name = "PREFERREDCOMM", length = 50)
	public String getPreferredcomm() {
		return this.preferredcomm;
	}

	public void setPreferredcomm(String preferredcomm) {
		this.preferredcomm = preferredcomm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "initloadClientTgt")
	public Set<InitloadClientPhoneTgt> getInitloadClientPhoneTgts() {
		return this.initloadClientPhoneTgts;
	}

	public void setInitloadClientPhoneTgts(Set<InitloadClientPhoneTgt> initloadClientPhoneTgts) {
		this.initloadClientPhoneTgts = initloadClientPhoneTgts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "initloadClientTgt")
	public Set<InitloadClientDisabilityTgt> getInitloadClientDisabilityTgts() {
		return this.initloadClientDisabilityTgts;
	}

	public void setInitloadClientDisabilityTgts(Set<InitloadClientDisabilityTgt> initloadClientDisabilityTgts) {
		this.initloadClientDisabilityTgts = initloadClientDisabilityTgts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "initloadClientTgt")
	public Set<InitloadClientDemoTgt> getInitloadClientDemoTgts() {
		return this.initloadClientDemoTgts;
	}

	public void setInitloadClientDemoTgts(Set<InitloadClientDemoTgt> initloadClientDemoTgts) {
		this.initloadClientDemoTgts = initloadClientDemoTgts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "initloadClientTgt")
	public Set<InitloadClientAddressTgt> getInitloadClientAddressTgts() {
		return this.initloadClientAddressTgts;
	}

	public void setInitloadClientAddressTgts(Set<InitloadClientAddressTgt> initloadClientAddressTgts) {
		this.initloadClientAddressTgts = initloadClientAddressTgts;
	}

}