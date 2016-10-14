
package net.webservicex.convert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeLengthUnitResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "changeLengthUnitResult"
})
@XmlRootElement(name = "ChangeLengthUnitResponse")
public class ChangeLengthUnitResponse {

    @XmlElement(name = "ChangeLengthUnitResult")
    protected double changeLengthUnitResult;

    /**
     * Ruft den Wert der changeLengthUnitResult-Eigenschaft ab.
     * 
     */
    public double getChangeLengthUnitResult() {
        return changeLengthUnitResult;
    }

    /**
     * Legt den Wert der changeLengthUnitResult-Eigenschaft fest.
     * 
     */
    public void setChangeLengthUnitResult(double value) {
        this.changeLengthUnitResult = value;
    }

}
