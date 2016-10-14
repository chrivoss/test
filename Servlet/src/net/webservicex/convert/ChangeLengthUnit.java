
package net.webservicex.convert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="LengthValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromLengthUnit" type="{http://www.webserviceX.NET/}Lengths"/>
 *         &lt;element name="toLengthUnit" type="{http://www.webserviceX.NET/}Lengths"/>
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
    "lengthValue",
    "fromLengthUnit",
    "toLengthUnit"
})
@XmlRootElement(name = "ChangeLengthUnit")
public class ChangeLengthUnit {

    @XmlElement(name = "LengthValue")
    protected double lengthValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Lengths fromLengthUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Lengths toLengthUnit;

    /**
     * Ruft den Wert der lengthValue-Eigenschaft ab.
     * 
     */
    public double getLengthValue() {
        return lengthValue;
    }

    /**
     * Legt den Wert der lengthValue-Eigenschaft fest.
     * 
     */
    public void setLengthValue(double value) {
        this.lengthValue = value;
    }

    /**
     * Ruft den Wert der fromLengthUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Lengths }
     *     
     */
    public Lengths getFromLengthUnit() {
        return fromLengthUnit;
    }

    /**
     * Legt den Wert der fromLengthUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Lengths }
     *     
     */
    public void setFromLengthUnit(Lengths value) {
        this.fromLengthUnit = value;
    }

    /**
     * Ruft den Wert der toLengthUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Lengths }
     *     
     */
    public Lengths getToLengthUnit() {
        return toLengthUnit;
    }

    /**
     * Legt den Wert der toLengthUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Lengths }
     *     
     */
    public void setToLengthUnit(Lengths value) {
        this.toLengthUnit = value;
    }

}
