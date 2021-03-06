
package com.ibm.mdm.esoa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for client complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="client">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}record">
 *       &lt;sequence>
 *         &lt;element name="AB109FlagList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AB109Flag" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AliasList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Alias" type="{http://client.esoa.mdm.ibm.com/}memlngnm" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AlienRegistrationNumberList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AlienRegistrationNumber" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AlternateEmailList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AlternateEmail" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BirthLastNameList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BirthLastName" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ChildDueDateList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChildDueDate" type="{http://client.esoa.mdm.ibm.com/}memdate" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CircumstancesofDeathList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CircumstancesofDeath" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CitizenshipList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Citizenship" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clientId" type="{http://client.esoa.mdm.ibm.com/}clientId" minOccurs="0"/>
 *         &lt;element name="ClientNameList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClientName" type="{http://client.esoa.mdm.ibm.com/}memlngnm" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClientNameSuffixList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClientNameSuffix" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClientNameTitleList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClientNameTitle" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CountryRegionofBirthList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CountryRegionofBirth" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CurrentLivingArrangementsList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CurrentLivingArrangements" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CurrentWorkExperienceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CurrentWorkExperience" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DateLastWorkedList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DateLastWorked" type="{http://client.esoa.mdm.ibm.com/}memdate" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DateofBirthList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DateofBirth" type="{http://client.esoa.mdm.ibm.com/}memdate" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DateofDeathList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DateofDeath" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DisabilityList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Disability" type="{http://client.esoa.mdm.ibm.com/}memdisabilit" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EducationLevelList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EducationLevel" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmergencyContactList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmergencyContact" type="{http://client.esoa.mdm.ibm.com/}mememcntct" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmploymentStatusList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmploymentStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EnrolledInJobTrainingList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EnrolledInJobTraining" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EnrolledinSchoolList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EnrolledinSchool" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EthnicityList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Ethnicity" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ForeignAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ForeignAddress" type="{http://client.esoa.mdm.ibm.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GenderCommentList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GenderComment" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GenderList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Gender" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GraduatedFromHighSchoolList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GraduatedFromHighSchool" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HistoryofSelfInjuryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HistoryofSelfInjury" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HistoryofViolenceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HistoryofViolence" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HomeAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HomeAddress" type="{http://client.esoa.mdm.ibm.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HomePhoneList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HomePhone" type="{http://client.esoa.mdm.ibm.com/}memphone" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ImmigrationStatusList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ImmigrationStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InterpreterList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Interpreter" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Last4SSNList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Last4SSN" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LastUpdateList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LastUpdate" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LiterateList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Literate" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LivesAtPrimaryAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LivesAtPrimaryAddress" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LivesWithRelationList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LivesWithRelation" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MailingAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MailingAddress" type="{http://client.esoa.mdm.ibm.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaritalStatusList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MaritalStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MilitaryStatusList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MilitaryStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MobilePhoneList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MobilePhone" type="{http://client.esoa.mdm.ibm.com/}memphone" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NbrChildrenUnder18List" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NbrChildrenUnder18" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NbrChildrenUnder5List" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NbrChildrenUnder5" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherAddress" type="{http://client.esoa.mdm.ibm.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherPhoneList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherPhone" type="{http://client.esoa.mdm.ibm.com/}memphone" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaidDaysLast30List" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaidDaysLast30" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PlaceofBirthList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PlaceofBirth" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PopulationTypeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PopulationType" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreferredCommunicationList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreferredCommunication" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PregnancyStatusList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PregnancyStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrimaryEmailAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrimaryEmailAddress" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrimaryLanguageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrimaryLanguage" type="{http://client.esoa.mdm.ibm.com/}memlanguage" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrivilegedRecordList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrivilegedRecord" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProgramParticipationList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProgramParticipation" type="{http://client.esoa.mdm.ibm.com/}memprogram" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RaceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Race" type="{http://client.esoa.mdm.ibm.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RentOrOwnList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RentOrOwn" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResidenceTypeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResidenceType" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResidentialStatusList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResidentialStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SSNList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SSN" type="{http://client.esoa.mdm.ibm.com/}memident" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SchoolNameList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SchoolName" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SecondaryLanguageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SecondaryLanguage" type="{http://client.esoa.mdm.ibm.com/}memlanguage" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpokenLanguageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpokenLanguage" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StatusofCitizenshipList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatusofCitizenship" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TribeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tribe" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VeteranStatusList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VeteranStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VisaTypeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VisaType" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WorkAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WorkAddress" type="{http://client.esoa.mdm.ibm.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WorkPhoneList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WorkPhone" type="{http://client.esoa.mdm.ibm.com/}memphone" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client", propOrder = {
    "ab109FlagList",
    "aliasList",
    "alienRegistrationNumberList",
    "alternateEmailList",
    "birthLastNameList",
    "childDueDateList",
    "circumstancesofDeathList",
    "citizenshipList",
    "clientId",
    "clientNameList",
    "clientNameSuffixList",
    "clientNameTitleList",
    "countryRegionofBirthList",
    "currentLivingArrangementsList",
    "currentWorkExperienceList",
    "dateLastWorkedList",
    "dateofBirthList",
    "dateofDeathList",
    "disabilityList",
    "educationLevelList",
    "emergencyContactList",
    "employmentStatusList",
    "enrolledInJobTrainingList",
    "enrolledinSchoolList",
    "ethnicityList",
    "foreignAddressList",
    "genderCommentList",
    "genderList",
    "graduatedFromHighSchoolList",
    "historyofSelfInjuryList",
    "historyofViolenceList",
    "homeAddressList",
    "homePhoneList",
    "immigrationStatusList",
    "interpreterList",
    "last4SSNList",
    "lastUpdateList",
    "literateList",
    "livesAtPrimaryAddressList",
    "livesWithRelationList",
    "mailingAddressList",
    "maritalStatusList",
    "militaryStatusList",
    "mobilePhoneList",
    "nbrChildrenUnder18List",
    "nbrChildrenUnder5List",
    "otherAddressList",
    "otherPhoneList",
    "paidDaysLast30List",
    "placeofBirthList",
    "populationTypeList",
    "preferredCommunicationList",
    "pregnancyStatusList",
    "primaryEmailAddressList",
    "primaryLanguageList",
    "privilegedRecordList",
    "programParticipationList",
    "raceList",
    "rentOrOwnList",
    "residenceTypeList",
    "residentialStatusList",
    "ssnList",
    "schoolNameList",
    "secondaryLanguageList",
    "spokenLanguageList",
    "statusofCitizenshipList",
    "tribeList",
    "veteranStatusList",
    "visaTypeList",
    "workAddressList",
    "workPhoneList"
})
public class Client
    extends Record
{

    @XmlElement(name = "AB109FlagList")
    protected Client.AB109FlagList ab109FlagList;
    @XmlElement(name = "AliasList")
    protected Client.AliasList aliasList;
    @XmlElement(name = "AlienRegistrationNumberList")
    protected Client.AlienRegistrationNumberList alienRegistrationNumberList;
    @XmlElement(name = "AlternateEmailList")
    protected Client.AlternateEmailList alternateEmailList;
    @XmlElement(name = "BirthLastNameList")
    protected Client.BirthLastNameList birthLastNameList;
    @XmlElement(name = "ChildDueDateList")
    protected Client.ChildDueDateList childDueDateList;
    @XmlElement(name = "CircumstancesofDeathList")
    protected Client.CircumstancesofDeathList circumstancesofDeathList;
    @XmlElement(name = "CitizenshipList")
    protected Client.CitizenshipList citizenshipList;
    protected ClientId clientId;
    @XmlElement(name = "ClientNameList")
    protected Client.ClientNameList clientNameList;
    @XmlElement(name = "ClientNameSuffixList")
    protected Client.ClientNameSuffixList clientNameSuffixList;
    @XmlElement(name = "ClientNameTitleList")
    protected Client.ClientNameTitleList clientNameTitleList;
    @XmlElement(name = "CountryRegionofBirthList")
    protected Client.CountryRegionofBirthList countryRegionofBirthList;
    @XmlElement(name = "CurrentLivingArrangementsList")
    protected Client.CurrentLivingArrangementsList currentLivingArrangementsList;
    @XmlElement(name = "CurrentWorkExperienceList")
    protected Client.CurrentWorkExperienceList currentWorkExperienceList;
    @XmlElement(name = "DateLastWorkedList")
    protected Client.DateLastWorkedList dateLastWorkedList;
    @XmlElement(name = "DateofBirthList")
    protected Client.DateofBirthList dateofBirthList;
    @XmlElement(name = "DateofDeathList")
    protected Client.DateofDeathList dateofDeathList;
    @XmlElement(name = "DisabilityList")
    protected Client.DisabilityList disabilityList;
    @XmlElement(name = "EducationLevelList")
    protected Client.EducationLevelList educationLevelList;
    @XmlElement(name = "EmergencyContactList")
    protected Client.EmergencyContactList emergencyContactList;
    @XmlElement(name = "EmploymentStatusList")
    protected Client.EmploymentStatusList employmentStatusList;
    @XmlElement(name = "EnrolledInJobTrainingList")
    protected Client.EnrolledInJobTrainingList enrolledInJobTrainingList;
    @XmlElement(name = "EnrolledinSchoolList")
    protected Client.EnrolledinSchoolList enrolledinSchoolList;
    @XmlElement(name = "EthnicityList")
    protected Client.EthnicityList ethnicityList;
    @XmlElement(name = "ForeignAddressList")
    protected Client.ForeignAddressList foreignAddressList;
    @XmlElement(name = "GenderCommentList")
    protected Client.GenderCommentList genderCommentList;
    @XmlElement(name = "GenderList")
    protected Client.GenderList genderList;
    @XmlElement(name = "GraduatedFromHighSchoolList")
    protected Client.GraduatedFromHighSchoolList graduatedFromHighSchoolList;
    @XmlElement(name = "HistoryofSelfInjuryList")
    protected Client.HistoryofSelfInjuryList historyofSelfInjuryList;
    @XmlElement(name = "HistoryofViolenceList")
    protected Client.HistoryofViolenceList historyofViolenceList;
    @XmlElement(name = "HomeAddressList")
    protected Client.HomeAddressList homeAddressList;
    @XmlElement(name = "HomePhoneList")
    protected Client.HomePhoneList homePhoneList;
    @XmlElement(name = "ImmigrationStatusList")
    protected Client.ImmigrationStatusList immigrationStatusList;
    @XmlElement(name = "InterpreterList")
    protected Client.InterpreterList interpreterList;
    @XmlElement(name = "Last4SSNList")
    protected Client.Last4SSNList last4SSNList;
    @XmlElement(name = "LastUpdateList")
    protected Client.LastUpdateList lastUpdateList;
    @XmlElement(name = "LiterateList")
    protected Client.LiterateList literateList;
    @XmlElement(name = "LivesAtPrimaryAddressList")
    protected Client.LivesAtPrimaryAddressList livesAtPrimaryAddressList;
    @XmlElement(name = "LivesWithRelationList")
    protected Client.LivesWithRelationList livesWithRelationList;
    @XmlElement(name = "MailingAddressList")
    protected Client.MailingAddressList mailingAddressList;
    @XmlElement(name = "MaritalStatusList")
    protected Client.MaritalStatusList maritalStatusList;
    @XmlElement(name = "MilitaryStatusList")
    protected Client.MilitaryStatusList militaryStatusList;
    @XmlElement(name = "MobilePhoneList")
    protected Client.MobilePhoneList mobilePhoneList;
    @XmlElement(name = "NbrChildrenUnder18List")
    protected Client.NbrChildrenUnder18List nbrChildrenUnder18List;
    @XmlElement(name = "NbrChildrenUnder5List")
    protected Client.NbrChildrenUnder5List nbrChildrenUnder5List;
    @XmlElement(name = "OtherAddressList")
    protected Client.OtherAddressList otherAddressList;
    @XmlElement(name = "OtherPhoneList")
    protected Client.OtherPhoneList otherPhoneList;
    @XmlElement(name = "PaidDaysLast30List")
    protected Client.PaidDaysLast30List paidDaysLast30List;
    @XmlElement(name = "PlaceofBirthList")
    protected Client.PlaceofBirthList placeofBirthList;
    @XmlElement(name = "PopulationTypeList")
    protected Client.PopulationTypeList populationTypeList;
    @XmlElement(name = "PreferredCommunicationList")
    protected Client.PreferredCommunicationList preferredCommunicationList;
    @XmlElement(name = "PregnancyStatusList")
    protected Client.PregnancyStatusList pregnancyStatusList;
    @XmlElement(name = "PrimaryEmailAddressList")
    protected Client.PrimaryEmailAddressList primaryEmailAddressList;
    @XmlElement(name = "PrimaryLanguageList")
    protected Client.PrimaryLanguageList primaryLanguageList;
    @XmlElement(name = "PrivilegedRecordList")
    protected Client.PrivilegedRecordList privilegedRecordList;
    @XmlElement(name = "ProgramParticipationList")
    protected Client.ProgramParticipationList programParticipationList;
    @XmlElement(name = "RaceList")
    protected Client.RaceList raceList;
    @XmlElement(name = "RentOrOwnList")
    protected Client.RentOrOwnList rentOrOwnList;
    @XmlElement(name = "ResidenceTypeList")
    protected Client.ResidenceTypeList residenceTypeList;
    @XmlElement(name = "ResidentialStatusList")
    protected Client.ResidentialStatusList residentialStatusList;
    @XmlElement(name = "SSNList")
    protected Client.SSNList ssnList;
    @XmlElement(name = "SchoolNameList")
    protected Client.SchoolNameList schoolNameList;
    @XmlElement(name = "SecondaryLanguageList")
    protected Client.SecondaryLanguageList secondaryLanguageList;
    @XmlElement(name = "SpokenLanguageList")
    protected Client.SpokenLanguageList spokenLanguageList;
    @XmlElement(name = "StatusofCitizenshipList")
    protected Client.StatusofCitizenshipList statusofCitizenshipList;
    @XmlElement(name = "TribeList")
    protected Client.TribeList tribeList;
    @XmlElement(name = "VeteranStatusList")
    protected Client.VeteranStatusList veteranStatusList;
    @XmlElement(name = "VisaTypeList")
    protected Client.VisaTypeList visaTypeList;
    @XmlElement(name = "WorkAddressList")
    protected Client.WorkAddressList workAddressList;
    @XmlElement(name = "WorkPhoneList")
    protected Client.WorkPhoneList workPhoneList;

    /**
     * Gets the value of the ab109FlagList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.AB109FlagList }
     *     
     */
    public Client.AB109FlagList getAB109FlagList() {
        return ab109FlagList;
    }

    /**
     * Sets the value of the ab109FlagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.AB109FlagList }
     *     
     */
    public void setAB109FlagList(Client.AB109FlagList value) {
        this.ab109FlagList = value;
    }

    /**
     * Gets the value of the aliasList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.AliasList }
     *     
     */
    public Client.AliasList getAliasList() {
        return aliasList;
    }

    /**
     * Sets the value of the aliasList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.AliasList }
     *     
     */
    public void setAliasList(Client.AliasList value) {
        this.aliasList = value;
    }

    /**
     * Gets the value of the alienRegistrationNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.AlienRegistrationNumberList }
     *     
     */
    public Client.AlienRegistrationNumberList getAlienRegistrationNumberList() {
        return alienRegistrationNumberList;
    }

    /**
     * Sets the value of the alienRegistrationNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.AlienRegistrationNumberList }
     *     
     */
    public void setAlienRegistrationNumberList(Client.AlienRegistrationNumberList value) {
        this.alienRegistrationNumberList = value;
    }

    /**
     * Gets the value of the alternateEmailList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.AlternateEmailList }
     *     
     */
    public Client.AlternateEmailList getAlternateEmailList() {
        return alternateEmailList;
    }

    /**
     * Sets the value of the alternateEmailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.AlternateEmailList }
     *     
     */
    public void setAlternateEmailList(Client.AlternateEmailList value) {
        this.alternateEmailList = value;
    }

    /**
     * Gets the value of the birthLastNameList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.BirthLastNameList }
     *     
     */
    public Client.BirthLastNameList getBirthLastNameList() {
        return birthLastNameList;
    }

    /**
     * Sets the value of the birthLastNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.BirthLastNameList }
     *     
     */
    public void setBirthLastNameList(Client.BirthLastNameList value) {
        this.birthLastNameList = value;
    }

    /**
     * Gets the value of the childDueDateList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.ChildDueDateList }
     *     
     */
    public Client.ChildDueDateList getChildDueDateList() {
        return childDueDateList;
    }

    /**
     * Sets the value of the childDueDateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.ChildDueDateList }
     *     
     */
    public void setChildDueDateList(Client.ChildDueDateList value) {
        this.childDueDateList = value;
    }

    /**
     * Gets the value of the circumstancesofDeathList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.CircumstancesofDeathList }
     *     
     */
    public Client.CircumstancesofDeathList getCircumstancesofDeathList() {
        return circumstancesofDeathList;
    }

    /**
     * Sets the value of the circumstancesofDeathList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.CircumstancesofDeathList }
     *     
     */
    public void setCircumstancesofDeathList(Client.CircumstancesofDeathList value) {
        this.circumstancesofDeathList = value;
    }

    /**
     * Gets the value of the citizenshipList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.CitizenshipList }
     *     
     */
    public Client.CitizenshipList getCitizenshipList() {
        return citizenshipList;
    }

    /**
     * Sets the value of the citizenshipList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.CitizenshipList }
     *     
     */
    public void setCitizenshipList(Client.CitizenshipList value) {
        this.citizenshipList = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientId }
     *     
     */
    public ClientId getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientId }
     *     
     */
    public void setClientId(ClientId value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientNameList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.ClientNameList }
     *     
     */
    public Client.ClientNameList getClientNameList() {
        return clientNameList;
    }

    /**
     * Sets the value of the clientNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.ClientNameList }
     *     
     */
    public void setClientNameList(Client.ClientNameList value) {
        this.clientNameList = value;
    }

    /**
     * Gets the value of the clientNameSuffixList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.ClientNameSuffixList }
     *     
     */
    public Client.ClientNameSuffixList getClientNameSuffixList() {
        return clientNameSuffixList;
    }

    /**
     * Sets the value of the clientNameSuffixList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.ClientNameSuffixList }
     *     
     */
    public void setClientNameSuffixList(Client.ClientNameSuffixList value) {
        this.clientNameSuffixList = value;
    }

    /**
     * Gets the value of the clientNameTitleList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.ClientNameTitleList }
     *     
     */
    public Client.ClientNameTitleList getClientNameTitleList() {
        return clientNameTitleList;
    }

    /**
     * Sets the value of the clientNameTitleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.ClientNameTitleList }
     *     
     */
    public void setClientNameTitleList(Client.ClientNameTitleList value) {
        this.clientNameTitleList = value;
    }

    /**
     * Gets the value of the countryRegionofBirthList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.CountryRegionofBirthList }
     *     
     */
    public Client.CountryRegionofBirthList getCountryRegionofBirthList() {
        return countryRegionofBirthList;
    }

    /**
     * Sets the value of the countryRegionofBirthList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.CountryRegionofBirthList }
     *     
     */
    public void setCountryRegionofBirthList(Client.CountryRegionofBirthList value) {
        this.countryRegionofBirthList = value;
    }

    /**
     * Gets the value of the currentLivingArrangementsList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.CurrentLivingArrangementsList }
     *     
     */
    public Client.CurrentLivingArrangementsList getCurrentLivingArrangementsList() {
        return currentLivingArrangementsList;
    }

    /**
     * Sets the value of the currentLivingArrangementsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.CurrentLivingArrangementsList }
     *     
     */
    public void setCurrentLivingArrangementsList(Client.CurrentLivingArrangementsList value) {
        this.currentLivingArrangementsList = value;
    }

    /**
     * Gets the value of the currentWorkExperienceList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.CurrentWorkExperienceList }
     *     
     */
    public Client.CurrentWorkExperienceList getCurrentWorkExperienceList() {
        return currentWorkExperienceList;
    }

    /**
     * Sets the value of the currentWorkExperienceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.CurrentWorkExperienceList }
     *     
     */
    public void setCurrentWorkExperienceList(Client.CurrentWorkExperienceList value) {
        this.currentWorkExperienceList = value;
    }

    /**
     * Gets the value of the dateLastWorkedList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.DateLastWorkedList }
     *     
     */
    public Client.DateLastWorkedList getDateLastWorkedList() {
        return dateLastWorkedList;
    }

    /**
     * Sets the value of the dateLastWorkedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.DateLastWorkedList }
     *     
     */
    public void setDateLastWorkedList(Client.DateLastWorkedList value) {
        this.dateLastWorkedList = value;
    }

    /**
     * Gets the value of the dateofBirthList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.DateofBirthList }
     *     
     */
    public Client.DateofBirthList getDateofBirthList() {
        return dateofBirthList;
    }

    /**
     * Sets the value of the dateofBirthList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.DateofBirthList }
     *     
     */
    public void setDateofBirthList(Client.DateofBirthList value) {
        this.dateofBirthList = value;
    }

    /**
     * Gets the value of the dateofDeathList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.DateofDeathList }
     *     
     */
    public Client.DateofDeathList getDateofDeathList() {
        return dateofDeathList;
    }

    /**
     * Sets the value of the dateofDeathList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.DateofDeathList }
     *     
     */
    public void setDateofDeathList(Client.DateofDeathList value) {
        this.dateofDeathList = value;
    }

    /**
     * Gets the value of the disabilityList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.DisabilityList }
     *     
     */
    public Client.DisabilityList getDisabilityList() {
        return disabilityList;
    }

    /**
     * Sets the value of the disabilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.DisabilityList }
     *     
     */
    public void setDisabilityList(Client.DisabilityList value) {
        this.disabilityList = value;
    }

    /**
     * Gets the value of the educationLevelList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.EducationLevelList }
     *     
     */
    public Client.EducationLevelList getEducationLevelList() {
        return educationLevelList;
    }

    /**
     * Sets the value of the educationLevelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.EducationLevelList }
     *     
     */
    public void setEducationLevelList(Client.EducationLevelList value) {
        this.educationLevelList = value;
    }

    /**
     * Gets the value of the emergencyContactList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.EmergencyContactList }
     *     
     */
    public Client.EmergencyContactList getEmergencyContactList() {
        return emergencyContactList;
    }

    /**
     * Sets the value of the emergencyContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.EmergencyContactList }
     *     
     */
    public void setEmergencyContactList(Client.EmergencyContactList value) {
        this.emergencyContactList = value;
    }

    /**
     * Gets the value of the employmentStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.EmploymentStatusList }
     *     
     */
    public Client.EmploymentStatusList getEmploymentStatusList() {
        return employmentStatusList;
    }

    /**
     * Sets the value of the employmentStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.EmploymentStatusList }
     *     
     */
    public void setEmploymentStatusList(Client.EmploymentStatusList value) {
        this.employmentStatusList = value;
    }

    /**
     * Gets the value of the enrolledInJobTrainingList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.EnrolledInJobTrainingList }
     *     
     */
    public Client.EnrolledInJobTrainingList getEnrolledInJobTrainingList() {
        return enrolledInJobTrainingList;
    }

    /**
     * Sets the value of the enrolledInJobTrainingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.EnrolledInJobTrainingList }
     *     
     */
    public void setEnrolledInJobTrainingList(Client.EnrolledInJobTrainingList value) {
        this.enrolledInJobTrainingList = value;
    }

    /**
     * Gets the value of the enrolledinSchoolList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.EnrolledinSchoolList }
     *     
     */
    public Client.EnrolledinSchoolList getEnrolledinSchoolList() {
        return enrolledinSchoolList;
    }

    /**
     * Sets the value of the enrolledinSchoolList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.EnrolledinSchoolList }
     *     
     */
    public void setEnrolledinSchoolList(Client.EnrolledinSchoolList value) {
        this.enrolledinSchoolList = value;
    }

    /**
     * Gets the value of the ethnicityList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.EthnicityList }
     *     
     */
    public Client.EthnicityList getEthnicityList() {
        return ethnicityList;
    }

    /**
     * Sets the value of the ethnicityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.EthnicityList }
     *     
     */
    public void setEthnicityList(Client.EthnicityList value) {
        this.ethnicityList = value;
    }

    /**
     * Gets the value of the foreignAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.ForeignAddressList }
     *     
     */
    public Client.ForeignAddressList getForeignAddressList() {
        return foreignAddressList;
    }

    /**
     * Sets the value of the foreignAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.ForeignAddressList }
     *     
     */
    public void setForeignAddressList(Client.ForeignAddressList value) {
        this.foreignAddressList = value;
    }

    /**
     * Gets the value of the genderCommentList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.GenderCommentList }
     *     
     */
    public Client.GenderCommentList getGenderCommentList() {
        return genderCommentList;
    }

    /**
     * Sets the value of the genderCommentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.GenderCommentList }
     *     
     */
    public void setGenderCommentList(Client.GenderCommentList value) {
        this.genderCommentList = value;
    }

    /**
     * Gets the value of the genderList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.GenderList }
     *     
     */
    public Client.GenderList getGenderList() {
        return genderList;
    }

    /**
     * Sets the value of the genderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.GenderList }
     *     
     */
    public void setGenderList(Client.GenderList value) {
        this.genderList = value;
    }

    /**
     * Gets the value of the graduatedFromHighSchoolList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.GraduatedFromHighSchoolList }
     *     
     */
    public Client.GraduatedFromHighSchoolList getGraduatedFromHighSchoolList() {
        return graduatedFromHighSchoolList;
    }

    /**
     * Sets the value of the graduatedFromHighSchoolList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.GraduatedFromHighSchoolList }
     *     
     */
    public void setGraduatedFromHighSchoolList(Client.GraduatedFromHighSchoolList value) {
        this.graduatedFromHighSchoolList = value;
    }

    /**
     * Gets the value of the historyofSelfInjuryList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.HistoryofSelfInjuryList }
     *     
     */
    public Client.HistoryofSelfInjuryList getHistoryofSelfInjuryList() {
        return historyofSelfInjuryList;
    }

    /**
     * Sets the value of the historyofSelfInjuryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.HistoryofSelfInjuryList }
     *     
     */
    public void setHistoryofSelfInjuryList(Client.HistoryofSelfInjuryList value) {
        this.historyofSelfInjuryList = value;
    }

    /**
     * Gets the value of the historyofViolenceList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.HistoryofViolenceList }
     *     
     */
    public Client.HistoryofViolenceList getHistoryofViolenceList() {
        return historyofViolenceList;
    }

    /**
     * Sets the value of the historyofViolenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.HistoryofViolenceList }
     *     
     */
    public void setHistoryofViolenceList(Client.HistoryofViolenceList value) {
        this.historyofViolenceList = value;
    }

    /**
     * Gets the value of the homeAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.HomeAddressList }
     *     
     */
    public Client.HomeAddressList getHomeAddressList() {
        return homeAddressList;
    }

    /**
     * Sets the value of the homeAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.HomeAddressList }
     *     
     */
    public void setHomeAddressList(Client.HomeAddressList value) {
        this.homeAddressList = value;
    }

    /**
     * Gets the value of the homePhoneList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.HomePhoneList }
     *     
     */
    public Client.HomePhoneList getHomePhoneList() {
        return homePhoneList;
    }

    /**
     * Sets the value of the homePhoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.HomePhoneList }
     *     
     */
    public void setHomePhoneList(Client.HomePhoneList value) {
        this.homePhoneList = value;
    }

    /**
     * Gets the value of the immigrationStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.ImmigrationStatusList }
     *     
     */
    public Client.ImmigrationStatusList getImmigrationStatusList() {
        return immigrationStatusList;
    }

    /**
     * Sets the value of the immigrationStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.ImmigrationStatusList }
     *     
     */
    public void setImmigrationStatusList(Client.ImmigrationStatusList value) {
        this.immigrationStatusList = value;
    }

    /**
     * Gets the value of the interpreterList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.InterpreterList }
     *     
     */
    public Client.InterpreterList getInterpreterList() {
        return interpreterList;
    }

    /**
     * Sets the value of the interpreterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.InterpreterList }
     *     
     */
    public void setInterpreterList(Client.InterpreterList value) {
        this.interpreterList = value;
    }

    /**
     * Gets the value of the last4SSNList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.Last4SSNList }
     *     
     */
    public Client.Last4SSNList getLast4SSNList() {
        return last4SSNList;
    }

    /**
     * Sets the value of the last4SSNList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.Last4SSNList }
     *     
     */
    public void setLast4SSNList(Client.Last4SSNList value) {
        this.last4SSNList = value;
    }

    /**
     * Gets the value of the lastUpdateList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.LastUpdateList }
     *     
     */
    public Client.LastUpdateList getLastUpdateList() {
        return lastUpdateList;
    }

    /**
     * Sets the value of the lastUpdateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.LastUpdateList }
     *     
     */
    public void setLastUpdateList(Client.LastUpdateList value) {
        this.lastUpdateList = value;
    }

    /**
     * Gets the value of the literateList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.LiterateList }
     *     
     */
    public Client.LiterateList getLiterateList() {
        return literateList;
    }

    /**
     * Sets the value of the literateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.LiterateList }
     *     
     */
    public void setLiterateList(Client.LiterateList value) {
        this.literateList = value;
    }

    /**
     * Gets the value of the livesAtPrimaryAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.LivesAtPrimaryAddressList }
     *     
     */
    public Client.LivesAtPrimaryAddressList getLivesAtPrimaryAddressList() {
        return livesAtPrimaryAddressList;
    }

    /**
     * Sets the value of the livesAtPrimaryAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.LivesAtPrimaryAddressList }
     *     
     */
    public void setLivesAtPrimaryAddressList(Client.LivesAtPrimaryAddressList value) {
        this.livesAtPrimaryAddressList = value;
    }

    /**
     * Gets the value of the livesWithRelationList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.LivesWithRelationList }
     *     
     */
    public Client.LivesWithRelationList getLivesWithRelationList() {
        return livesWithRelationList;
    }

    /**
     * Sets the value of the livesWithRelationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.LivesWithRelationList }
     *     
     */
    public void setLivesWithRelationList(Client.LivesWithRelationList value) {
        this.livesWithRelationList = value;
    }

    /**
     * Gets the value of the mailingAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.MailingAddressList }
     *     
     */
    public Client.MailingAddressList getMailingAddressList() {
        return mailingAddressList;
    }

    /**
     * Sets the value of the mailingAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.MailingAddressList }
     *     
     */
    public void setMailingAddressList(Client.MailingAddressList value) {
        this.mailingAddressList = value;
    }

    /**
     * Gets the value of the maritalStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.MaritalStatusList }
     *     
     */
    public Client.MaritalStatusList getMaritalStatusList() {
        return maritalStatusList;
    }

    /**
     * Sets the value of the maritalStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.MaritalStatusList }
     *     
     */
    public void setMaritalStatusList(Client.MaritalStatusList value) {
        this.maritalStatusList = value;
    }

    /**
     * Gets the value of the militaryStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.MilitaryStatusList }
     *     
     */
    public Client.MilitaryStatusList getMilitaryStatusList() {
        return militaryStatusList;
    }

    /**
     * Sets the value of the militaryStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.MilitaryStatusList }
     *     
     */
    public void setMilitaryStatusList(Client.MilitaryStatusList value) {
        this.militaryStatusList = value;
    }

    /**
     * Gets the value of the mobilePhoneList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.MobilePhoneList }
     *     
     */
    public Client.MobilePhoneList getMobilePhoneList() {
        return mobilePhoneList;
    }

    /**
     * Sets the value of the mobilePhoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.MobilePhoneList }
     *     
     */
    public void setMobilePhoneList(Client.MobilePhoneList value) {
        this.mobilePhoneList = value;
    }

    /**
     * Gets the value of the nbrChildrenUnder18List property.
     * 
     * @return
     *     possible object is
     *     {@link Client.NbrChildrenUnder18List }
     *     
     */
    public Client.NbrChildrenUnder18List getNbrChildrenUnder18List() {
        return nbrChildrenUnder18List;
    }

    /**
     * Sets the value of the nbrChildrenUnder18List property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.NbrChildrenUnder18List }
     *     
     */
    public void setNbrChildrenUnder18List(Client.NbrChildrenUnder18List value) {
        this.nbrChildrenUnder18List = value;
    }

    /**
     * Gets the value of the nbrChildrenUnder5List property.
     * 
     * @return
     *     possible object is
     *     {@link Client.NbrChildrenUnder5List }
     *     
     */
    public Client.NbrChildrenUnder5List getNbrChildrenUnder5List() {
        return nbrChildrenUnder5List;
    }

    /**
     * Sets the value of the nbrChildrenUnder5List property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.NbrChildrenUnder5List }
     *     
     */
    public void setNbrChildrenUnder5List(Client.NbrChildrenUnder5List value) {
        this.nbrChildrenUnder5List = value;
    }

    /**
     * Gets the value of the otherAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.OtherAddressList }
     *     
     */
    public Client.OtherAddressList getOtherAddressList() {
        return otherAddressList;
    }

    /**
     * Sets the value of the otherAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.OtherAddressList }
     *     
     */
    public void setOtherAddressList(Client.OtherAddressList value) {
        this.otherAddressList = value;
    }

    /**
     * Gets the value of the otherPhoneList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.OtherPhoneList }
     *     
     */
    public Client.OtherPhoneList getOtherPhoneList() {
        return otherPhoneList;
    }

    /**
     * Sets the value of the otherPhoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.OtherPhoneList }
     *     
     */
    public void setOtherPhoneList(Client.OtherPhoneList value) {
        this.otherPhoneList = value;
    }

    /**
     * Gets the value of the paidDaysLast30List property.
     * 
     * @return
     *     possible object is
     *     {@link Client.PaidDaysLast30List }
     *     
     */
    public Client.PaidDaysLast30List getPaidDaysLast30List() {
        return paidDaysLast30List;
    }

    /**
     * Sets the value of the paidDaysLast30List property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.PaidDaysLast30List }
     *     
     */
    public void setPaidDaysLast30List(Client.PaidDaysLast30List value) {
        this.paidDaysLast30List = value;
    }

    /**
     * Gets the value of the placeofBirthList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.PlaceofBirthList }
     *     
     */
    public Client.PlaceofBirthList getPlaceofBirthList() {
        return placeofBirthList;
    }

    /**
     * Sets the value of the placeofBirthList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.PlaceofBirthList }
     *     
     */
    public void setPlaceofBirthList(Client.PlaceofBirthList value) {
        this.placeofBirthList = value;
    }

    /**
     * Gets the value of the populationTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.PopulationTypeList }
     *     
     */
    public Client.PopulationTypeList getPopulationTypeList() {
        return populationTypeList;
    }

    /**
     * Sets the value of the populationTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.PopulationTypeList }
     *     
     */
    public void setPopulationTypeList(Client.PopulationTypeList value) {
        this.populationTypeList = value;
    }

    /**
     * Gets the value of the preferredCommunicationList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.PreferredCommunicationList }
     *     
     */
    public Client.PreferredCommunicationList getPreferredCommunicationList() {
        return preferredCommunicationList;
    }

    /**
     * Sets the value of the preferredCommunicationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.PreferredCommunicationList }
     *     
     */
    public void setPreferredCommunicationList(Client.PreferredCommunicationList value) {
        this.preferredCommunicationList = value;
    }

    /**
     * Gets the value of the pregnancyStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.PregnancyStatusList }
     *     
     */
    public Client.PregnancyStatusList getPregnancyStatusList() {
        return pregnancyStatusList;
    }

    /**
     * Sets the value of the pregnancyStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.PregnancyStatusList }
     *     
     */
    public void setPregnancyStatusList(Client.PregnancyStatusList value) {
        this.pregnancyStatusList = value;
    }

    /**
     * Gets the value of the primaryEmailAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.PrimaryEmailAddressList }
     *     
     */
    public Client.PrimaryEmailAddressList getPrimaryEmailAddressList() {
        return primaryEmailAddressList;
    }

    /**
     * Sets the value of the primaryEmailAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.PrimaryEmailAddressList }
     *     
     */
    public void setPrimaryEmailAddressList(Client.PrimaryEmailAddressList value) {
        this.primaryEmailAddressList = value;
    }

    /**
     * Gets the value of the primaryLanguageList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.PrimaryLanguageList }
     *     
     */
    public Client.PrimaryLanguageList getPrimaryLanguageList() {
        return primaryLanguageList;
    }

    /**
     * Sets the value of the primaryLanguageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.PrimaryLanguageList }
     *     
     */
    public void setPrimaryLanguageList(Client.PrimaryLanguageList value) {
        this.primaryLanguageList = value;
    }

    /**
     * Gets the value of the privilegedRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.PrivilegedRecordList }
     *     
     */
    public Client.PrivilegedRecordList getPrivilegedRecordList() {
        return privilegedRecordList;
    }

    /**
     * Sets the value of the privilegedRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.PrivilegedRecordList }
     *     
     */
    public void setPrivilegedRecordList(Client.PrivilegedRecordList value) {
        this.privilegedRecordList = value;
    }

    /**
     * Gets the value of the programParticipationList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.ProgramParticipationList }
     *     
     */
    public Client.ProgramParticipationList getProgramParticipationList() {
        return programParticipationList;
    }

    /**
     * Sets the value of the programParticipationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.ProgramParticipationList }
     *     
     */
    public void setProgramParticipationList(Client.ProgramParticipationList value) {
        this.programParticipationList = value;
    }

    /**
     * Gets the value of the raceList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.RaceList }
     *     
     */
    public Client.RaceList getRaceList() {
        return raceList;
    }

    /**
     * Sets the value of the raceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.RaceList }
     *     
     */
    public void setRaceList(Client.RaceList value) {
        this.raceList = value;
    }

    /**
     * Gets the value of the rentOrOwnList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.RentOrOwnList }
     *     
     */
    public Client.RentOrOwnList getRentOrOwnList() {
        return rentOrOwnList;
    }

    /**
     * Sets the value of the rentOrOwnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.RentOrOwnList }
     *     
     */
    public void setRentOrOwnList(Client.RentOrOwnList value) {
        this.rentOrOwnList = value;
    }

    /**
     * Gets the value of the residenceTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.ResidenceTypeList }
     *     
     */
    public Client.ResidenceTypeList getResidenceTypeList() {
        return residenceTypeList;
    }

    /**
     * Sets the value of the residenceTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.ResidenceTypeList }
     *     
     */
    public void setResidenceTypeList(Client.ResidenceTypeList value) {
        this.residenceTypeList = value;
    }

    /**
     * Gets the value of the residentialStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.ResidentialStatusList }
     *     
     */
    public Client.ResidentialStatusList getResidentialStatusList() {
        return residentialStatusList;
    }

    /**
     * Sets the value of the residentialStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.ResidentialStatusList }
     *     
     */
    public void setResidentialStatusList(Client.ResidentialStatusList value) {
        this.residentialStatusList = value;
    }

    /**
     * Gets the value of the ssnList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.SSNList }
     *     
     */
    public Client.SSNList getSSNList() {
        return ssnList;
    }

    /**
     * Sets the value of the ssnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.SSNList }
     *     
     */
    public void setSSNList(Client.SSNList value) {
        this.ssnList = value;
    }

    /**
     * Gets the value of the schoolNameList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.SchoolNameList }
     *     
     */
    public Client.SchoolNameList getSchoolNameList() {
        return schoolNameList;
    }

    /**
     * Sets the value of the schoolNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.SchoolNameList }
     *     
     */
    public void setSchoolNameList(Client.SchoolNameList value) {
        this.schoolNameList = value;
    }

    /**
     * Gets the value of the secondaryLanguageList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.SecondaryLanguageList }
     *     
     */
    public Client.SecondaryLanguageList getSecondaryLanguageList() {
        return secondaryLanguageList;
    }

    /**
     * Sets the value of the secondaryLanguageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.SecondaryLanguageList }
     *     
     */
    public void setSecondaryLanguageList(Client.SecondaryLanguageList value) {
        this.secondaryLanguageList = value;
    }

    /**
     * Gets the value of the spokenLanguageList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.SpokenLanguageList }
     *     
     */
    public Client.SpokenLanguageList getSpokenLanguageList() {
        return spokenLanguageList;
    }

    /**
     * Sets the value of the spokenLanguageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.SpokenLanguageList }
     *     
     */
    public void setSpokenLanguageList(Client.SpokenLanguageList value) {
        this.spokenLanguageList = value;
    }

    /**
     * Gets the value of the statusofCitizenshipList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.StatusofCitizenshipList }
     *     
     */
    public Client.StatusofCitizenshipList getStatusofCitizenshipList() {
        return statusofCitizenshipList;
    }

    /**
     * Sets the value of the statusofCitizenshipList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.StatusofCitizenshipList }
     *     
     */
    public void setStatusofCitizenshipList(Client.StatusofCitizenshipList value) {
        this.statusofCitizenshipList = value;
    }

    /**
     * Gets the value of the tribeList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.TribeList }
     *     
     */
    public Client.TribeList getTribeList() {
        return tribeList;
    }

    /**
     * Sets the value of the tribeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.TribeList }
     *     
     */
    public void setTribeList(Client.TribeList value) {
        this.tribeList = value;
    }

    /**
     * Gets the value of the veteranStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.VeteranStatusList }
     *     
     */
    public Client.VeteranStatusList getVeteranStatusList() {
        return veteranStatusList;
    }

    /**
     * Sets the value of the veteranStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.VeteranStatusList }
     *     
     */
    public void setVeteranStatusList(Client.VeteranStatusList value) {
        this.veteranStatusList = value;
    }

    /**
     * Gets the value of the visaTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.VisaTypeList }
     *     
     */
    public Client.VisaTypeList getVisaTypeList() {
        return visaTypeList;
    }

    /**
     * Sets the value of the visaTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.VisaTypeList }
     *     
     */
    public void setVisaTypeList(Client.VisaTypeList value) {
        this.visaTypeList = value;
    }

    /**
     * Gets the value of the workAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.WorkAddressList }
     *     
     */
    public Client.WorkAddressList getWorkAddressList() {
        return workAddressList;
    }

    /**
     * Sets the value of the workAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.WorkAddressList }
     *     
     */
    public void setWorkAddressList(Client.WorkAddressList value) {
        this.workAddressList = value;
    }

    /**
     * Gets the value of the workPhoneList property.
     * 
     * @return
     *     possible object is
     *     {@link Client.WorkPhoneList }
     *     
     */
    public Client.WorkPhoneList getWorkPhoneList() {
        return workPhoneList;
    }

    /**
     * Sets the value of the workPhoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client.WorkPhoneList }
     *     
     */
    public void setWorkPhoneList(Client.WorkPhoneList value) {
        this.workPhoneList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AB109Flag" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ab109Flag"
    })
    public static class AB109FlagList {

        @XmlElement(name = "AB109Flag")
        protected List<Memattr> ab109Flag;

        /**
         * Gets the value of the ab109Flag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ab109Flag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAB109Flag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getAB109Flag() {
            if (ab109Flag == null) {
                ab109Flag = new ArrayList<Memattr>();
            }
            return this.ab109Flag;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Alias" type="{http://client.esoa.mdm.ibm.com/}memlngnm" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "alias"
    })
    public static class AliasList {

        @XmlElement(name = "Alias")
        protected List<Memlngnm> alias;

        /**
         * Gets the value of the alias property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alias property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlias().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlngnm }
         * 
         * 
         */
        public List<Memlngnm> getAlias() {
            if (alias == null) {
                alias = new ArrayList<Memlngnm>();
            }
            return this.alias;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AlienRegistrationNumber" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "alienRegistrationNumber"
    })
    public static class AlienRegistrationNumberList {

        @XmlElement(name = "AlienRegistrationNumber")
        protected List<Memattr> alienRegistrationNumber;

        /**
         * Gets the value of the alienRegistrationNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alienRegistrationNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlienRegistrationNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getAlienRegistrationNumber() {
            if (alienRegistrationNumber == null) {
                alienRegistrationNumber = new ArrayList<Memattr>();
            }
            return this.alienRegistrationNumber;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AlternateEmail" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "alternateEmail"
    })
    public static class AlternateEmailList {

        @XmlElement(name = "AlternateEmail")
        protected List<Memattr> alternateEmail;

        /**
         * Gets the value of the alternateEmail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternateEmail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateEmail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getAlternateEmail() {
            if (alternateEmail == null) {
                alternateEmail = new ArrayList<Memattr>();
            }
            return this.alternateEmail;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BirthLastName" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "birthLastName"
    })
    public static class BirthLastNameList {

        @XmlElement(name = "BirthLastName")
        protected List<Memattr> birthLastName;

        /**
         * Gets the value of the birthLastName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the birthLastName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBirthLastName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getBirthLastName() {
            if (birthLastName == null) {
                birthLastName = new ArrayList<Memattr>();
            }
            return this.birthLastName;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ChildDueDate" type="{http://client.esoa.mdm.ibm.com/}memdate" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "childDueDate"
    })
    public static class ChildDueDateList {

        @XmlElement(name = "ChildDueDate")
        protected List<Memdate> childDueDate;

        /**
         * Gets the value of the childDueDate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childDueDate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildDueDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memdate }
         * 
         * 
         */
        public List<Memdate> getChildDueDate() {
            if (childDueDate == null) {
                childDueDate = new ArrayList<Memdate>();
            }
            return this.childDueDate;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CircumstancesofDeath" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "circumstancesofDeath"
    })
    public static class CircumstancesofDeathList {

        @XmlElement(name = "CircumstancesofDeath")
        protected List<Memattr> circumstancesofDeath;

        /**
         * Gets the value of the circumstancesofDeath property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the circumstancesofDeath property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCircumstancesofDeath().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getCircumstancesofDeath() {
            if (circumstancesofDeath == null) {
                circumstancesofDeath = new ArrayList<Memattr>();
            }
            return this.circumstancesofDeath;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Citizenship" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "citizenship"
    })
    public static class CitizenshipList {

        @XmlElement(name = "Citizenship")
        protected List<Memattr> citizenship;

        /**
         * Gets the value of the citizenship property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citizenship property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitizenship().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getCitizenship() {
            if (citizenship == null) {
                citizenship = new ArrayList<Memattr>();
            }
            return this.citizenship;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ClientName" type="{http://client.esoa.mdm.ibm.com/}memlngnm" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clientName"
    })
    public static class ClientNameList {

        @XmlElement(name = "ClientName")
        protected List<Memlngnm> clientName;

        /**
         * Gets the value of the clientName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClientName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlngnm }
         * 
         * 
         */
        public List<Memlngnm> getClientName() {
            if (clientName == null) {
                clientName = new ArrayList<Memlngnm>();
            }
            return this.clientName;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ClientNameSuffix" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clientNameSuffix"
    })
    public static class ClientNameSuffixList {

        @XmlElement(name = "ClientNameSuffix")
        protected List<Memattr> clientNameSuffix;

        /**
         * Gets the value of the clientNameSuffix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientNameSuffix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClientNameSuffix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getClientNameSuffix() {
            if (clientNameSuffix == null) {
                clientNameSuffix = new ArrayList<Memattr>();
            }
            return this.clientNameSuffix;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ClientNameTitle" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clientNameTitle"
    })
    public static class ClientNameTitleList {

        @XmlElement(name = "ClientNameTitle")
        protected List<Memattr> clientNameTitle;

        /**
         * Gets the value of the clientNameTitle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientNameTitle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClientNameTitle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getClientNameTitle() {
            if (clientNameTitle == null) {
                clientNameTitle = new ArrayList<Memattr>();
            }
            return this.clientNameTitle;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CountryRegionofBirth" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "countryRegionofBirth"
    })
    public static class CountryRegionofBirthList {

        @XmlElement(name = "CountryRegionofBirth")
        protected List<Memattr> countryRegionofBirth;

        /**
         * Gets the value of the countryRegionofBirth property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryRegionofBirth property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryRegionofBirth().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getCountryRegionofBirth() {
            if (countryRegionofBirth == null) {
                countryRegionofBirth = new ArrayList<Memattr>();
            }
            return this.countryRegionofBirth;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CurrentLivingArrangements" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currentLivingArrangements"
    })
    public static class CurrentLivingArrangementsList {

        @XmlElement(name = "CurrentLivingArrangements")
        protected List<Memattr> currentLivingArrangements;

        /**
         * Gets the value of the currentLivingArrangements property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the currentLivingArrangements property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCurrentLivingArrangements().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getCurrentLivingArrangements() {
            if (currentLivingArrangements == null) {
                currentLivingArrangements = new ArrayList<Memattr>();
            }
            return this.currentLivingArrangements;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CurrentWorkExperience" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currentWorkExperience"
    })
    public static class CurrentWorkExperienceList {

        @XmlElement(name = "CurrentWorkExperience")
        protected List<Memattr> currentWorkExperience;

        /**
         * Gets the value of the currentWorkExperience property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the currentWorkExperience property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCurrentWorkExperience().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getCurrentWorkExperience() {
            if (currentWorkExperience == null) {
                currentWorkExperience = new ArrayList<Memattr>();
            }
            return this.currentWorkExperience;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DateLastWorked" type="{http://client.esoa.mdm.ibm.com/}memdate" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dateLastWorked"
    })
    public static class DateLastWorkedList {

        @XmlElement(name = "DateLastWorked")
        protected List<Memdate> dateLastWorked;

        /**
         * Gets the value of the dateLastWorked property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateLastWorked property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateLastWorked().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memdate }
         * 
         * 
         */
        public List<Memdate> getDateLastWorked() {
            if (dateLastWorked == null) {
                dateLastWorked = new ArrayList<Memdate>();
            }
            return this.dateLastWorked;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DateofBirth" type="{http://client.esoa.mdm.ibm.com/}memdate" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dateofBirth"
    })
    public static class DateofBirthList {

        @XmlElement(name = "DateofBirth")
        protected List<Memdate> dateofBirth;

        /**
         * Gets the value of the dateofBirth property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateofBirth property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateofBirth().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memdate }
         * 
         * 
         */
        public List<Memdate> getDateofBirth() {
            if (dateofBirth == null) {
                dateofBirth = new ArrayList<Memdate>();
            }
            return this.dateofBirth;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DateofDeath" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dateofDeath"
    })
    public static class DateofDeathList {

        @XmlElement(name = "DateofDeath")
        protected List<Memattr> dateofDeath;

        /**
         * Gets the value of the dateofDeath property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateofDeath property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateofDeath().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getDateofDeath() {
            if (dateofDeath == null) {
                dateofDeath = new ArrayList<Memattr>();
            }
            return this.dateofDeath;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Disability" type="{http://client.esoa.mdm.ibm.com/}memdisabilit" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "disability"
    })
    public static class DisabilityList {

        @XmlElement(name = "Disability")
        protected List<Memdisabilit> disability;

        /**
         * Gets the value of the disability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memdisabilit }
         * 
         * 
         */
        public List<Memdisabilit> getDisability() {
            if (disability == null) {
                disability = new ArrayList<Memdisabilit>();
            }
            return this.disability;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EducationLevel" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "educationLevel"
    })
    public static class EducationLevelList {

        @XmlElement(name = "EducationLevel")
        protected List<Memattr> educationLevel;

        /**
         * Gets the value of the educationLevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the educationLevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEducationLevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getEducationLevel() {
            if (educationLevel == null) {
                educationLevel = new ArrayList<Memattr>();
            }
            return this.educationLevel;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EmergencyContact" type="{http://client.esoa.mdm.ibm.com/}mememcntct" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "emergencyContact"
    })
    public static class EmergencyContactList {

        @XmlElement(name = "EmergencyContact")
        protected List<Mememcntct> emergencyContact;

        /**
         * Gets the value of the emergencyContact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emergencyContact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmergencyContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Mememcntct }
         * 
         * 
         */
        public List<Mememcntct> getEmergencyContact() {
            if (emergencyContact == null) {
                emergencyContact = new ArrayList<Mememcntct>();
            }
            return this.emergencyContact;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EmploymentStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employmentStatus"
    })
    public static class EmploymentStatusList {

        @XmlElement(name = "EmploymentStatus")
        protected List<Memattr> employmentStatus;

        /**
         * Gets the value of the employmentStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employmentStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmploymentStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getEmploymentStatus() {
            if (employmentStatus == null) {
                employmentStatus = new ArrayList<Memattr>();
            }
            return this.employmentStatus;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EnrolledInJobTraining" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enrolledInJobTraining"
    })
    public static class EnrolledInJobTrainingList {

        @XmlElement(name = "EnrolledInJobTraining")
        protected List<Memattr> enrolledInJobTraining;

        /**
         * Gets the value of the enrolledInJobTraining property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enrolledInJobTraining property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnrolledInJobTraining().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getEnrolledInJobTraining() {
            if (enrolledInJobTraining == null) {
                enrolledInJobTraining = new ArrayList<Memattr>();
            }
            return this.enrolledInJobTraining;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EnrolledinSchool" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enrolledinSchool"
    })
    public static class EnrolledinSchoolList {

        @XmlElement(name = "EnrolledinSchool")
        protected List<Memattr> enrolledinSchool;

        /**
         * Gets the value of the enrolledinSchool property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enrolledinSchool property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnrolledinSchool().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getEnrolledinSchool() {
            if (enrolledinSchool == null) {
                enrolledinSchool = new ArrayList<Memattr>();
            }
            return this.enrolledinSchool;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Ethnicity" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ethnicity"
    })
    public static class EthnicityList {

        @XmlElement(name = "Ethnicity")
        protected List<Memattr> ethnicity;

        /**
         * Gets the value of the ethnicity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ethnicity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEthnicity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getEthnicity() {
            if (ethnicity == null) {
                ethnicity = new ArrayList<Memattr>();
            }
            return this.ethnicity;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ForeignAddress" type="{http://client.esoa.mdm.ibm.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "foreignAddress"
    })
    public static class ForeignAddressList {

        @XmlElement(name = "ForeignAddress")
        protected List<Membigattr> foreignAddress;

        /**
         * Gets the value of the foreignAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the foreignAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForeignAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Membigattr }
         * 
         * 
         */
        public List<Membigattr> getForeignAddress() {
            if (foreignAddress == null) {
                foreignAddress = new ArrayList<Membigattr>();
            }
            return this.foreignAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GenderComment" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "genderComment"
    })
    public static class GenderCommentList {

        @XmlElement(name = "GenderComment")
        protected List<Memattr> genderComment;

        /**
         * Gets the value of the genderComment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the genderComment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGenderComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getGenderComment() {
            if (genderComment == null) {
                genderComment = new ArrayList<Memattr>();
            }
            return this.genderComment;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Gender" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gender"
    })
    public static class GenderList {

        @XmlElement(name = "Gender")
        protected List<Memattr> gender;

        /**
         * Gets the value of the gender property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gender property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGender().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getGender() {
            if (gender == null) {
                gender = new ArrayList<Memattr>();
            }
            return this.gender;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GraduatedFromHighSchool" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "graduatedFromHighSchool"
    })
    public static class GraduatedFromHighSchoolList {

        @XmlElement(name = "GraduatedFromHighSchool")
        protected List<Memattr> graduatedFromHighSchool;

        /**
         * Gets the value of the graduatedFromHighSchool property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the graduatedFromHighSchool property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGraduatedFromHighSchool().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getGraduatedFromHighSchool() {
            if (graduatedFromHighSchool == null) {
                graduatedFromHighSchool = new ArrayList<Memattr>();
            }
            return this.graduatedFromHighSchool;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HistoryofSelfInjury" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "historyofSelfInjury"
    })
    public static class HistoryofSelfInjuryList {

        @XmlElement(name = "HistoryofSelfInjury")
        protected List<Memattr> historyofSelfInjury;

        /**
         * Gets the value of the historyofSelfInjury property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the historyofSelfInjury property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHistoryofSelfInjury().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getHistoryofSelfInjury() {
            if (historyofSelfInjury == null) {
                historyofSelfInjury = new ArrayList<Memattr>();
            }
            return this.historyofSelfInjury;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HistoryofViolence" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "historyofViolence"
    })
    public static class HistoryofViolenceList {

        @XmlElement(name = "HistoryofViolence")
        protected List<Memattr> historyofViolence;

        /**
         * Gets the value of the historyofViolence property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the historyofViolence property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHistoryofViolence().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getHistoryofViolence() {
            if (historyofViolence == null) {
                historyofViolence = new ArrayList<Memattr>();
            }
            return this.historyofViolence;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HomeAddress" type="{http://client.esoa.mdm.ibm.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "homeAddress"
    })
    public static class HomeAddressList {

        @XmlElement(name = "HomeAddress")
        protected List<Memlgaddr> homeAddress;

        /**
         * Gets the value of the homeAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the homeAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHomeAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlgaddr }
         * 
         * 
         */
        public List<Memlgaddr> getHomeAddress() {
            if (homeAddress == null) {
                homeAddress = new ArrayList<Memlgaddr>();
            }
            return this.homeAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HomePhone" type="{http://client.esoa.mdm.ibm.com/}memphone" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "homePhone"
    })
    public static class HomePhoneList {

        @XmlElement(name = "HomePhone")
        protected List<Memphone> homePhone;

        /**
         * Gets the value of the homePhone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the homePhone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHomePhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memphone }
         * 
         * 
         */
        public List<Memphone> getHomePhone() {
            if (homePhone == null) {
                homePhone = new ArrayList<Memphone>();
            }
            return this.homePhone;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ImmigrationStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "immigrationStatus"
    })
    public static class ImmigrationStatusList {

        @XmlElement(name = "ImmigrationStatus")
        protected List<Memattr> immigrationStatus;

        /**
         * Gets the value of the immigrationStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the immigrationStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImmigrationStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getImmigrationStatus() {
            if (immigrationStatus == null) {
                immigrationStatus = new ArrayList<Memattr>();
            }
            return this.immigrationStatus;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Interpreter" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "interpreter"
    })
    public static class InterpreterList {

        @XmlElement(name = "Interpreter")
        protected List<Memattr> interpreter;

        /**
         * Gets the value of the interpreter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interpreter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInterpreter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getInterpreter() {
            if (interpreter == null) {
                interpreter = new ArrayList<Memattr>();
            }
            return this.interpreter;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Last4SSN" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "last4SSN"
    })
    public static class Last4SSNList {

        @XmlElement(name = "Last4SSN")
        protected List<Memattr> last4SSN;

        /**
         * Gets the value of the last4SSN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the last4SSN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLast4SSN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getLast4SSN() {
            if (last4SSN == null) {
                last4SSN = new ArrayList<Memattr>();
            }
            return this.last4SSN;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LastUpdate" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lastUpdate"
    })
    public static class LastUpdateList {

        @XmlElement(name = "LastUpdate")
        protected List<Memattr> lastUpdate;

        /**
         * Gets the value of the lastUpdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lastUpdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLastUpdate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getLastUpdate() {
            if (lastUpdate == null) {
                lastUpdate = new ArrayList<Memattr>();
            }
            return this.lastUpdate;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Literate" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "literate"
    })
    public static class LiterateList {

        @XmlElement(name = "Literate")
        protected List<Memattr> literate;

        /**
         * Gets the value of the literate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the literate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLiterate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getLiterate() {
            if (literate == null) {
                literate = new ArrayList<Memattr>();
            }
            return this.literate;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LivesAtPrimaryAddress" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "livesAtPrimaryAddress"
    })
    public static class LivesAtPrimaryAddressList {

        @XmlElement(name = "LivesAtPrimaryAddress")
        protected List<Memattr> livesAtPrimaryAddress;

        /**
         * Gets the value of the livesAtPrimaryAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the livesAtPrimaryAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLivesAtPrimaryAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getLivesAtPrimaryAddress() {
            if (livesAtPrimaryAddress == null) {
                livesAtPrimaryAddress = new ArrayList<Memattr>();
            }
            return this.livesAtPrimaryAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LivesWithRelation" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "livesWithRelation"
    })
    public static class LivesWithRelationList {

        @XmlElement(name = "LivesWithRelation")
        protected List<Memattr> livesWithRelation;

        /**
         * Gets the value of the livesWithRelation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the livesWithRelation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLivesWithRelation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getLivesWithRelation() {
            if (livesWithRelation == null) {
                livesWithRelation = new ArrayList<Memattr>();
            }
            return this.livesWithRelation;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MailingAddress" type="{http://client.esoa.mdm.ibm.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mailingAddress"
    })
    public static class MailingAddressList {

        @XmlElement(name = "MailingAddress")
        protected List<Memlgaddr> mailingAddress;

        /**
         * Gets the value of the mailingAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mailingAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMailingAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlgaddr }
         * 
         * 
         */
        public List<Memlgaddr> getMailingAddress() {
            if (mailingAddress == null) {
                mailingAddress = new ArrayList<Memlgaddr>();
            }
            return this.mailingAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MaritalStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "maritalStatus"
    })
    public static class MaritalStatusList {

        @XmlElement(name = "MaritalStatus")
        protected List<Memattr> maritalStatus;

        /**
         * Gets the value of the maritalStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the maritalStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMaritalStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getMaritalStatus() {
            if (maritalStatus == null) {
                maritalStatus = new ArrayList<Memattr>();
            }
            return this.maritalStatus;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MilitaryStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "militaryStatus"
    })
    public static class MilitaryStatusList {

        @XmlElement(name = "MilitaryStatus")
        protected List<Memattr> militaryStatus;

        /**
         * Gets the value of the militaryStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the militaryStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMilitaryStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getMilitaryStatus() {
            if (militaryStatus == null) {
                militaryStatus = new ArrayList<Memattr>();
            }
            return this.militaryStatus;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MobilePhone" type="{http://client.esoa.mdm.ibm.com/}memphone" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mobilePhone"
    })
    public static class MobilePhoneList {

        @XmlElement(name = "MobilePhone")
        protected List<Memphone> mobilePhone;

        /**
         * Gets the value of the mobilePhone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mobilePhone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMobilePhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memphone }
         * 
         * 
         */
        public List<Memphone> getMobilePhone() {
            if (mobilePhone == null) {
                mobilePhone = new ArrayList<Memphone>();
            }
            return this.mobilePhone;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NbrChildrenUnder18" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nbrChildrenUnder18"
    })
    public static class NbrChildrenUnder18List {

        @XmlElement(name = "NbrChildrenUnder18")
        protected List<Memattr> nbrChildrenUnder18;

        /**
         * Gets the value of the nbrChildrenUnder18 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nbrChildrenUnder18 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNbrChildrenUnder18().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getNbrChildrenUnder18() {
            if (nbrChildrenUnder18 == null) {
                nbrChildrenUnder18 = new ArrayList<Memattr>();
            }
            return this.nbrChildrenUnder18;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NbrChildrenUnder5" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nbrChildrenUnder5"
    })
    public static class NbrChildrenUnder5List {

        @XmlElement(name = "NbrChildrenUnder5")
        protected List<Memattr> nbrChildrenUnder5;

        /**
         * Gets the value of the nbrChildrenUnder5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nbrChildrenUnder5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNbrChildrenUnder5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getNbrChildrenUnder5() {
            if (nbrChildrenUnder5 == null) {
                nbrChildrenUnder5 = new ArrayList<Memattr>();
            }
            return this.nbrChildrenUnder5;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherAddress" type="{http://client.esoa.mdm.ibm.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherAddress"
    })
    public static class OtherAddressList {

        @XmlElement(name = "OtherAddress")
        protected List<Memlgaddr> otherAddress;

        /**
         * Gets the value of the otherAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlgaddr }
         * 
         * 
         */
        public List<Memlgaddr> getOtherAddress() {
            if (otherAddress == null) {
                otherAddress = new ArrayList<Memlgaddr>();
            }
            return this.otherAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherPhone" type="{http://client.esoa.mdm.ibm.com/}memphone" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherPhone"
    })
    public static class OtherPhoneList {

        @XmlElement(name = "OtherPhone")
        protected List<Memphone> otherPhone;

        /**
         * Gets the value of the otherPhone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherPhone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherPhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memphone }
         * 
         * 
         */
        public List<Memphone> getOtherPhone() {
            if (otherPhone == null) {
                otherPhone = new ArrayList<Memphone>();
            }
            return this.otherPhone;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PaidDaysLast30" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paidDaysLast30"
    })
    public static class PaidDaysLast30List {

        @XmlElement(name = "PaidDaysLast30")
        protected List<Memattr> paidDaysLast30;

        /**
         * Gets the value of the paidDaysLast30 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paidDaysLast30 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaidDaysLast30().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getPaidDaysLast30() {
            if (paidDaysLast30 == null) {
                paidDaysLast30 = new ArrayList<Memattr>();
            }
            return this.paidDaysLast30;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PlaceofBirth" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "placeofBirth"
    })
    public static class PlaceofBirthList {

        @XmlElement(name = "PlaceofBirth")
        protected List<Memattr> placeofBirth;

        /**
         * Gets the value of the placeofBirth property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placeofBirth property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlaceofBirth().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getPlaceofBirth() {
            if (placeofBirth == null) {
                placeofBirth = new ArrayList<Memattr>();
            }
            return this.placeofBirth;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PopulationType" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "populationType"
    })
    public static class PopulationTypeList {

        @XmlElement(name = "PopulationType")
        protected List<Memattr> populationType;

        /**
         * Gets the value of the populationType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the populationType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPopulationType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getPopulationType() {
            if (populationType == null) {
                populationType = new ArrayList<Memattr>();
            }
            return this.populationType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PreferredCommunication" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "preferredCommunication"
    })
    public static class PreferredCommunicationList {

        @XmlElement(name = "PreferredCommunication")
        protected List<Memattr> preferredCommunication;

        /**
         * Gets the value of the preferredCommunication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preferredCommunication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreferredCommunication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getPreferredCommunication() {
            if (preferredCommunication == null) {
                preferredCommunication = new ArrayList<Memattr>();
            }
            return this.preferredCommunication;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PregnancyStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pregnancyStatus"
    })
    public static class PregnancyStatusList {

        @XmlElement(name = "PregnancyStatus")
        protected List<Memattr> pregnancyStatus;

        /**
         * Gets the value of the pregnancyStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pregnancyStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPregnancyStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getPregnancyStatus() {
            if (pregnancyStatus == null) {
                pregnancyStatus = new ArrayList<Memattr>();
            }
            return this.pregnancyStatus;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PrimaryEmailAddress" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "primaryEmailAddress"
    })
    public static class PrimaryEmailAddressList {

        @XmlElement(name = "PrimaryEmailAddress")
        protected List<Memattr> primaryEmailAddress;

        /**
         * Gets the value of the primaryEmailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the primaryEmailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrimaryEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getPrimaryEmailAddress() {
            if (primaryEmailAddress == null) {
                primaryEmailAddress = new ArrayList<Memattr>();
            }
            return this.primaryEmailAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PrimaryLanguage" type="{http://client.esoa.mdm.ibm.com/}memlanguage" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "primaryLanguage"
    })
    public static class PrimaryLanguageList {

        @XmlElement(name = "PrimaryLanguage")
        protected List<Memlanguage> primaryLanguage;

        /**
         * Gets the value of the primaryLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the primaryLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrimaryLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlanguage }
         * 
         * 
         */
        public List<Memlanguage> getPrimaryLanguage() {
            if (primaryLanguage == null) {
                primaryLanguage = new ArrayList<Memlanguage>();
            }
            return this.primaryLanguage;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PrivilegedRecord" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "privilegedRecord"
    })
    public static class PrivilegedRecordList {

        @XmlElement(name = "PrivilegedRecord")
        protected List<Memattr> privilegedRecord;

        /**
         * Gets the value of the privilegedRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the privilegedRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrivilegedRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getPrivilegedRecord() {
            if (privilegedRecord == null) {
                privilegedRecord = new ArrayList<Memattr>();
            }
            return this.privilegedRecord;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProgramParticipation" type="{http://client.esoa.mdm.ibm.com/}memprogram" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "programParticipation"
    })
    public static class ProgramParticipationList {

        @XmlElement(name = "ProgramParticipation")
        protected List<Memprogram> programParticipation;

        /**
         * Gets the value of the programParticipation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the programParticipation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProgramParticipation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memprogram }
         * 
         * 
         */
        public List<Memprogram> getProgramParticipation() {
            if (programParticipation == null) {
                programParticipation = new ArrayList<Memprogram>();
            }
            return this.programParticipation;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Race" type="{http://client.esoa.mdm.ibm.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "race"
    })
    public static class RaceList {

        @XmlElement(name = "Race")
        protected List<Membigattr> race;

        /**
         * Gets the value of the race property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the race property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Membigattr }
         * 
         * 
         */
        public List<Membigattr> getRace() {
            if (race == null) {
                race = new ArrayList<Membigattr>();
            }
            return this.race;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RentOrOwn" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rentOrOwn"
    })
    public static class RentOrOwnList {

        @XmlElement(name = "RentOrOwn")
        protected List<Memattr> rentOrOwn;

        /**
         * Gets the value of the rentOrOwn property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rentOrOwn property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRentOrOwn().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getRentOrOwn() {
            if (rentOrOwn == null) {
                rentOrOwn = new ArrayList<Memattr>();
            }
            return this.rentOrOwn;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ResidenceType" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "residenceType"
    })
    public static class ResidenceTypeList {

        @XmlElement(name = "ResidenceType")
        protected List<Memattr> residenceType;

        /**
         * Gets the value of the residenceType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the residenceType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResidenceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getResidenceType() {
            if (residenceType == null) {
                residenceType = new ArrayList<Memattr>();
            }
            return this.residenceType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ResidentialStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "residentialStatus"
    })
    public static class ResidentialStatusList {

        @XmlElement(name = "ResidentialStatus")
        protected List<Memattr> residentialStatus;

        /**
         * Gets the value of the residentialStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the residentialStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResidentialStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getResidentialStatus() {
            if (residentialStatus == null) {
                residentialStatus = new ArrayList<Memattr>();
            }
            return this.residentialStatus;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SSN" type="{http://client.esoa.mdm.ibm.com/}memident" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ssn"
    })
    public static class SSNList {

        @XmlElement(name = "SSN")
        protected List<Memident> ssn;

        /**
         * Gets the value of the ssn property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ssn property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSSN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memident }
         * 
         * 
         */
        public List<Memident> getSSN() {
            if (ssn == null) {
                ssn = new ArrayList<Memident>();
            }
            return this.ssn;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SchoolName" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "schoolName"
    })
    public static class SchoolNameList {

        @XmlElement(name = "SchoolName")
        protected List<Memattr> schoolName;

        /**
         * Gets the value of the schoolName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schoolName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSchoolName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getSchoolName() {
            if (schoolName == null) {
                schoolName = new ArrayList<Memattr>();
            }
            return this.schoolName;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SecondaryLanguage" type="{http://client.esoa.mdm.ibm.com/}memlanguage" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "secondaryLanguage"
    })
    public static class SecondaryLanguageList {

        @XmlElement(name = "SecondaryLanguage")
        protected List<Memlanguage> secondaryLanguage;

        /**
         * Gets the value of the secondaryLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the secondaryLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSecondaryLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlanguage }
         * 
         * 
         */
        public List<Memlanguage> getSecondaryLanguage() {
            if (secondaryLanguage == null) {
                secondaryLanguage = new ArrayList<Memlanguage>();
            }
            return this.secondaryLanguage;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SpokenLanguage" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "spokenLanguage"
    })
    public static class SpokenLanguageList {

        @XmlElement(name = "SpokenLanguage")
        protected List<Memattr> spokenLanguage;

        /**
         * Gets the value of the spokenLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the spokenLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpokenLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getSpokenLanguage() {
            if (spokenLanguage == null) {
                spokenLanguage = new ArrayList<Memattr>();
            }
            return this.spokenLanguage;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StatusofCitizenship" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statusofCitizenship"
    })
    public static class StatusofCitizenshipList {

        @XmlElement(name = "StatusofCitizenship")
        protected List<Memattr> statusofCitizenship;

        /**
         * Gets the value of the statusofCitizenship property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statusofCitizenship property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatusofCitizenship().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getStatusofCitizenship() {
            if (statusofCitizenship == null) {
                statusofCitizenship = new ArrayList<Memattr>();
            }
            return this.statusofCitizenship;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Tribe" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tribe"
    })
    public static class TribeList {

        @XmlElement(name = "Tribe")
        protected List<Memattr> tribe;

        /**
         * Gets the value of the tribe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tribe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTribe().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getTribe() {
            if (tribe == null) {
                tribe = new ArrayList<Memattr>();
            }
            return this.tribe;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VeteranStatus" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "veteranStatus"
    })
    public static class VeteranStatusList {

        @XmlElement(name = "VeteranStatus")
        protected List<Memattr> veteranStatus;

        /**
         * Gets the value of the veteranStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the veteranStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVeteranStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getVeteranStatus() {
            if (veteranStatus == null) {
                veteranStatus = new ArrayList<Memattr>();
            }
            return this.veteranStatus;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VisaType" type="{http://client.esoa.mdm.ibm.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "visaType"
    })
    public static class VisaTypeList {

        @XmlElement(name = "VisaType")
        protected List<Memattr> visaType;

        /**
         * Gets the value of the visaType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the visaType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVisaType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getVisaType() {
            if (visaType == null) {
                visaType = new ArrayList<Memattr>();
            }
            return this.visaType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="WorkAddress" type="{http://client.esoa.mdm.ibm.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "workAddress"
    })
    public static class WorkAddressList {

        @XmlElement(name = "WorkAddress")
        protected List<Memlgaddr> workAddress;

        /**
         * Gets the value of the workAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlgaddr }
         * 
         * 
         */
        public List<Memlgaddr> getWorkAddress() {
            if (workAddress == null) {
                workAddress = new ArrayList<Memlgaddr>();
            }
            return this.workAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="WorkPhone" type="{http://client.esoa.mdm.ibm.com/}memphone" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "workPhone"
    })
    public static class WorkPhoneList {

        @XmlElement(name = "WorkPhone")
        protected List<Memphone> workPhone;

        /**
         * Gets the value of the workPhone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workPhone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkPhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memphone }
         * 
         * 
         */
        public List<Memphone> getWorkPhone() {
            if (workPhone == null) {
                workPhone = new ArrayList<Memphone>();
            }
            return this.workPhone;
        }

    }

}
