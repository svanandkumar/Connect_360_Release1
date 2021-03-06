
package com.initiate.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ClientName"/>
 *     &lt;enumeration value="HomeAddress"/>
 *     &lt;enumeration value="OtherAddress"/>
 *     &lt;enumeration value="HomePhone"/>
 *     &lt;enumeration value="OtherPhone"/>
 *     &lt;enumeration value="SSN"/>
 *     &lt;enumeration value="DateofBirth"/>
 *     &lt;enumeration value="Gender"/>
 *     &lt;enumeration value="PrimaryEmailAddress"/>
 *     &lt;enumeration value="LastUpdate"/>
 *     &lt;enumeration value="WorkPhone"/>
 *     &lt;enumeration value="AlternateEmail"/>
 *     &lt;enumeration value="ResidentialStatus"/>
 *     &lt;enumeration value="Ethnicity"/>
 *     &lt;enumeration value="PrivilegedRecord"/>
 *     &lt;enumeration value="MailingAddress"/>
 *     &lt;enumeration value="WorkAddress"/>
 *     &lt;enumeration value="MobilePhone"/>
 *     &lt;enumeration value="PrimaryLanguage"/>
 *     &lt;enumeration value="SecondaryLanguage"/>
 *     &lt;enumeration value="ProgramParticipation"/>
 *     &lt;enumeration value="Disability"/>
 *     &lt;enumeration value="Alias"/>
 *     &lt;enumeration value="PopulationType"/>
 *     &lt;enumeration value="AB109Flag"/>
 *     &lt;enumeration value="Last4SSN"/>
 *     &lt;enumeration value="MaritalStatus"/>
 *     &lt;enumeration value="MilitaryStatus"/>
 *     &lt;enumeration value="ImmigrationStatus"/>
 *     &lt;enumeration value="AlienRegistrationNumber"/>
 *     &lt;enumeration value="ForeignAddress"/>
 *     &lt;enumeration value="DateofDeath"/>
 *     &lt;enumeration value="GraduatedFromHighSchool"/>
 *     &lt;enumeration value="EducationLevel"/>
 *     &lt;enumeration value="EnrolledinSchool"/>
 *     &lt;enumeration value="Literate"/>
 *     &lt;enumeration value="EmploymentStatus"/>
 *     &lt;enumeration value="PaidDaysLast30"/>
 *     &lt;enumeration value="EnrolledInJobTraining"/>
 *     &lt;enumeration value="EmergencyContact"/>
 *     &lt;enumeration value="LivesAtPrimaryAddress"/>
 *     &lt;enumeration value="ResidenceType"/>
 *     &lt;enumeration value="RentOrOwn"/>
 *     &lt;enumeration value="LivesWithRelation"/>
 *     &lt;enumeration value="CurrentLivingArrangements"/>
 *     &lt;enumeration value="NbrChildrenUnder18"/>
 *     &lt;enumeration value="NbrChildrenUnder5"/>
 *     &lt;enumeration value="CurrentWorkExperience"/>
 *     &lt;enumeration value="DateLastWorked"/>
 *     &lt;enumeration value="CircumstancesofDeath"/>
 *     &lt;enumeration value="SpokenLanguage"/>
 *     &lt;enumeration value="PregnancyStatus"/>
 *     &lt;enumeration value="ChildDueDate"/>
 *     &lt;enumeration value="HistoryofViolence"/>
 *     &lt;enumeration value="Citizenship"/>
 *     &lt;enumeration value="StatusofCitizenship"/>
 *     &lt;enumeration value="Interpreter"/>
 *     &lt;enumeration value="HistoryofSelfInjury"/>
 *     &lt;enumeration value="VeteranStatus"/>
 *     &lt;enumeration value="Tribe"/>
 *     &lt;enumeration value="VisaType"/>
 *     &lt;enumeration value="SchoolName"/>
 *     &lt;enumeration value="MaritalStat"/>
 *     &lt;enumeration value="ServiceStream"/>
 *     &lt;enumeration value="CaseManager"/>
 *     &lt;enumeration value="IsSecured"/>
 *     &lt;enumeration value="IsSecuredReason"/>
 *     &lt;enumeration value="RoleStatus"/>
 *     &lt;enumeration value="RoleStatusReason"/>
 *     &lt;enumeration value="PartyIdentifier"/>
 *     &lt;enumeration value="PartyIdentifierType"/>
 *     &lt;enumeration value="NameType"/>
 *     &lt;enumeration value="ClientNameSuffix"/>
 *     &lt;enumeration value="ClientNameTitle"/>
 *     &lt;enumeration value="ContactUsage"/>
 *     &lt;enumeration value="ContactType"/>
 *     &lt;enumeration value="ContactTypeDescription"/>
 *     &lt;enumeration value="PrimaryMobilePhone"/>
 *     &lt;enumeration value="AlternateMobilePhone"/>
 *     &lt;enumeration value="HomeFax"/>
 *     &lt;enumeration value="WorkFax"/>
 *     &lt;enumeration value="HomeEmail"/>
 *     &lt;enumeration value="WorkEmail"/>
 *     &lt;enumeration value="ResidentialAddress"/>
 *     &lt;enumeration value="PostalAddress"/>
 *     &lt;enumeration value="PersonalAddress"/>
 *     &lt;enumeration value="Primacy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientAttribute")
@XmlEnum
public enum ClientAttribute {

    @XmlEnumValue("ClientName")
    CLIENT_NAME("ClientName"),
    @XmlEnumValue("HomeAddress")
    HOME_ADDRESS("HomeAddress"),
    @XmlEnumValue("OtherAddress")
    OTHER_ADDRESS("OtherAddress"),
    @XmlEnumValue("HomePhone")
    HOME_PHONE("HomePhone"),
    @XmlEnumValue("OtherPhone")
    OTHER_PHONE("OtherPhone"),
    SSN("SSN"),
    @XmlEnumValue("DateofBirth")
    DATEOF_BIRTH("DateofBirth"),
    @XmlEnumValue("Gender")
    GENDER("Gender"),
    @XmlEnumValue("PrimaryEmailAddress")
    PRIMARY_EMAIL_ADDRESS("PrimaryEmailAddress"),
    @XmlEnumValue("LastUpdate")
    LAST_UPDATE("LastUpdate"),
    @XmlEnumValue("WorkPhone")
    WORK_PHONE("WorkPhone"),
    @XmlEnumValue("AlternateEmail")
    ALTERNATE_EMAIL("AlternateEmail"),
    @XmlEnumValue("ResidentialStatus")
    RESIDENTIAL_STATUS("ResidentialStatus"),
    @XmlEnumValue("Ethnicity")
    ETHNICITY("Ethnicity"),
    @XmlEnumValue("PrivilegedRecord")
    PRIVILEGED_RECORD("PrivilegedRecord"),
    @XmlEnumValue("MailingAddress")
    MAILING_ADDRESS("MailingAddress"),
    @XmlEnumValue("WorkAddress")
    WORK_ADDRESS("WorkAddress"),
    @XmlEnumValue("MobilePhone")
    MOBILE_PHONE("MobilePhone"),
    @XmlEnumValue("PrimaryLanguage")
    PRIMARY_LANGUAGE("PrimaryLanguage"),
    @XmlEnumValue("SecondaryLanguage")
    SECONDARY_LANGUAGE("SecondaryLanguage"),
    @XmlEnumValue("ProgramParticipation")
    PROGRAM_PARTICIPATION("ProgramParticipation"),
    @XmlEnumValue("Disability")
    DISABILITY("Disability"),
    @XmlEnumValue("Alias")
    ALIAS("Alias"),
    @XmlEnumValue("PopulationType")
    POPULATION_TYPE("PopulationType"),
    @XmlEnumValue("AB109Flag")
    AB_109_FLAG("AB109Flag"),
    @XmlEnumValue("Last4SSN")
    LAST_4_SSN("Last4SSN"),
    @XmlEnumValue("MaritalStatus")
    MARITAL_STATUS("MaritalStatus"),
    @XmlEnumValue("MilitaryStatus")
    MILITARY_STATUS("MilitaryStatus"),
    @XmlEnumValue("ImmigrationStatus")
    IMMIGRATION_STATUS("ImmigrationStatus"),
    @XmlEnumValue("AlienRegistrationNumber")
    ALIEN_REGISTRATION_NUMBER("AlienRegistrationNumber"),
    @XmlEnumValue("ForeignAddress")
    FOREIGN_ADDRESS("ForeignAddress"),
    @XmlEnumValue("DateofDeath")
    DATEOF_DEATH("DateofDeath"),
    @XmlEnumValue("GraduatedFromHighSchool")
    GRADUATED_FROM_HIGH_SCHOOL("GraduatedFromHighSchool"),
    @XmlEnumValue("EducationLevel")
    EDUCATION_LEVEL("EducationLevel"),
    @XmlEnumValue("EnrolledinSchool")
    ENROLLEDIN_SCHOOL("EnrolledinSchool"),
    @XmlEnumValue("Literate")
    LITERATE("Literate"),
    @XmlEnumValue("EmploymentStatus")
    EMPLOYMENT_STATUS("EmploymentStatus"),
    @XmlEnumValue("PaidDaysLast30")
    PAID_DAYS_LAST_30("PaidDaysLast30"),
    @XmlEnumValue("EnrolledInJobTraining")
    ENROLLED_IN_JOB_TRAINING("EnrolledInJobTraining"),
    @XmlEnumValue("EmergencyContact")
    EMERGENCY_CONTACT("EmergencyContact"),
    @XmlEnumValue("LivesAtPrimaryAddress")
    LIVES_AT_PRIMARY_ADDRESS("LivesAtPrimaryAddress"),
    @XmlEnumValue("ResidenceType")
    RESIDENCE_TYPE("ResidenceType"),
    @XmlEnumValue("RentOrOwn")
    RENT_OR_OWN("RentOrOwn"),
    @XmlEnumValue("LivesWithRelation")
    LIVES_WITH_RELATION("LivesWithRelation"),
    @XmlEnumValue("CurrentLivingArrangements")
    CURRENT_LIVING_ARRANGEMENTS("CurrentLivingArrangements"),
    @XmlEnumValue("NbrChildrenUnder18")
    NBR_CHILDREN_UNDER_18("NbrChildrenUnder18"),
    @XmlEnumValue("NbrChildrenUnder5")
    NBR_CHILDREN_UNDER_5("NbrChildrenUnder5"),
    @XmlEnumValue("CurrentWorkExperience")
    CURRENT_WORK_EXPERIENCE("CurrentWorkExperience"),
    @XmlEnumValue("DateLastWorked")
    DATE_LAST_WORKED("DateLastWorked"),
    @XmlEnumValue("CircumstancesofDeath")
    CIRCUMSTANCESOF_DEATH("CircumstancesofDeath"),
    @XmlEnumValue("SpokenLanguage")
    SPOKEN_LANGUAGE("SpokenLanguage"),
    @XmlEnumValue("PregnancyStatus")
    PREGNANCY_STATUS("PregnancyStatus"),
    @XmlEnumValue("ChildDueDate")
    CHILD_DUE_DATE("ChildDueDate"),
    @XmlEnumValue("HistoryofViolence")
    HISTORYOF_VIOLENCE("HistoryofViolence"),
    @XmlEnumValue("Citizenship")
    CITIZENSHIP("Citizenship"),
    @XmlEnumValue("StatusofCitizenship")
    STATUSOF_CITIZENSHIP("StatusofCitizenship"),
    @XmlEnumValue("Interpreter")
    INTERPRETER("Interpreter"),
    @XmlEnumValue("HistoryofSelfInjury")
    HISTORYOF_SELF_INJURY("HistoryofSelfInjury"),
    @XmlEnumValue("VeteranStatus")
    VETERAN_STATUS("VeteranStatus"),
    @XmlEnumValue("Tribe")
    TRIBE("Tribe"),
    @XmlEnumValue("VisaType")
    VISA_TYPE("VisaType"),
    @XmlEnumValue("SchoolName")
    SCHOOL_NAME("SchoolName"),
    @XmlEnumValue("MaritalStat")
    MARITAL_STAT("MaritalStat"),
    @XmlEnumValue("ServiceStream")
    SERVICE_STREAM("ServiceStream"),
    @XmlEnumValue("CaseManager")
    CASE_MANAGER("CaseManager"),
    @XmlEnumValue("IsSecured")
    IS_SECURED("IsSecured"),
    @XmlEnumValue("IsSecuredReason")
    IS_SECURED_REASON("IsSecuredReason"),
    @XmlEnumValue("RoleStatus")
    ROLE_STATUS("RoleStatus"),
    @XmlEnumValue("RoleStatusReason")
    ROLE_STATUS_REASON("RoleStatusReason"),
    @XmlEnumValue("PartyIdentifier")
    PARTY_IDENTIFIER("PartyIdentifier"),
    @XmlEnumValue("PartyIdentifierType")
    PARTY_IDENTIFIER_TYPE("PartyIdentifierType"),
    @XmlEnumValue("NameType")
    NAME_TYPE("NameType"),
    @XmlEnumValue("ClientNameSuffix")
    CLIENT_NAME_SUFFIX("ClientNameSuffix"),
    @XmlEnumValue("ClientNameTitle")
    CLIENT_NAME_TITLE("ClientNameTitle"),
    @XmlEnumValue("ContactUsage")
    CONTACT_USAGE("ContactUsage"),
    @XmlEnumValue("ContactType")
    CONTACT_TYPE("ContactType"),
    @XmlEnumValue("ContactTypeDescription")
    CONTACT_TYPE_DESCRIPTION("ContactTypeDescription"),
    @XmlEnumValue("PrimaryMobilePhone")
    PRIMARY_MOBILE_PHONE("PrimaryMobilePhone"),
    @XmlEnumValue("AlternateMobilePhone")
    ALTERNATE_MOBILE_PHONE("AlternateMobilePhone"),
    @XmlEnumValue("HomeFax")
    HOME_FAX("HomeFax"),
    @XmlEnumValue("WorkFax")
    WORK_FAX("WorkFax"),
    @XmlEnumValue("HomeEmail")
    HOME_EMAIL("HomeEmail"),
    @XmlEnumValue("WorkEmail")
    WORK_EMAIL("WorkEmail"),
    @XmlEnumValue("ResidentialAddress")
    RESIDENTIAL_ADDRESS("ResidentialAddress"),
    @XmlEnumValue("PostalAddress")
    POSTAL_ADDRESS("PostalAddress"),
    @XmlEnumValue("PersonalAddress")
    PERSONAL_ADDRESS("PersonalAddress"),
    @XmlEnumValue("Primacy")
    PRIMACY("Primacy");
    private final String value;

    ClientAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientAttribute fromValue(String v) {
        for (ClientAttribute c: ClientAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
