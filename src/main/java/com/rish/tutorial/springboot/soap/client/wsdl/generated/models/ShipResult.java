//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.30 at 08:19:47 PM GST 
//


package com.rish.tutorial.springboot.soap.client.wsdl.generated.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shipResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shipResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shipInforesu" type="{http://track.smsaexpress.com/SDMService/}ArrayOfShipInfoRes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipResult", propOrder = {
    "shipInforesu"
})
public class ShipResult {

    protected ArrayOfShipInfoRes shipInforesu;

    /**
     * Gets the value of the shipInforesu property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipInfoRes }
     *     
     */
    public ArrayOfShipInfoRes getShipInforesu() {
        return shipInforesu;
    }

    /**
     * Sets the value of the shipInforesu property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipInfoRes }
     *     
     */
    public void setShipInforesu(ArrayOfShipInfoRes value) {
        this.shipInforesu = value;
    }

}
