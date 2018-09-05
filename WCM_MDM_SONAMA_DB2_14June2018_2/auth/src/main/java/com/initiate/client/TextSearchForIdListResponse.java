
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for textSearchForIdListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textSearchForIdListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdEntitySearchResult" type="{http://client.initiate.com/}idEntitySearchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textSearchForIdListResponse", propOrder = {
    "idEntitySearchResult"
})
public class TextSearchForIdListResponse {

    @XmlElement(name = "IdEntitySearchResult")
    protected List<IdEntitySearchResult> idEntitySearchResult;

    /**
     * Gets the value of the idEntitySearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idEntitySearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdEntitySearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdEntitySearchResult }
     * 
     * 
     */
    public List<IdEntitySearchResult> getIdEntitySearchResult() {
        if (idEntitySearchResult == null) {
            idEntitySearchResult = new ArrayList<IdEntitySearchResult>();
        }
        return this.idEntitySearchResult;
    }

}