
package net.webservicex.airport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getAirportInformationByAirportCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getAirportInformationByAirportCodeResult"
})
@XmlRootElement(name = "getAirportInformationByAirportCodeResponse")
public class GetAirportInformationByAirportCodeResponse {

    protected String getAirportInformationByAirportCodeResult;

    /**
     * Ruft den Wert der getAirportInformationByAirportCodeResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAirportInformationByAirportCodeResult() {
        return getAirportInformationByAirportCodeResult;
    }

    /**
     * Legt den Wert der getAirportInformationByAirportCodeResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAirportInformationByAirportCodeResult(String value) {
        this.getAirportInformationByAirportCodeResult = value;
    }

}
