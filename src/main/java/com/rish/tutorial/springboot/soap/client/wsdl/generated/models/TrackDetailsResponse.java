//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.30 at 08:19:47 PM GST 
//


package com.rish.tutorial.springboot.soap.client.wsdl.generated.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentDetails" type="{http://track.smsaexpress.com/SDMService/}ShipmentDetails" minOccurs="0"/&gt;
 *         &lt;element name="TrackingDetailsList" type="{http://track.smsaexpress.com/SDMService/}ArrayOfTrackingDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackDetailsResponse", propOrder = {
    "requestStatus",
    "shipmentDetails",
    "trackingDetailsList"
})
public class TrackDetailsResponse {

    @XmlElement(name = "RequestStatus")
    protected String requestStatus;
    @XmlElement(name = "ShipmentDetails")
    protected ShipmentDetails shipmentDetails;
    @XmlElement(name = "TrackingDetailsList")
    protected ArrayOfTrackingDetails trackingDetailsList;

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestStatus(String value) {
        this.requestStatus = value;
    }

    /**
     * Gets the value of the shipmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDetails }
     *     
     */
    public ShipmentDetails getShipmentDetails() {
        return shipmentDetails;
    }

    /**
     * Sets the value of the shipmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDetails }
     *     
     */
    public void setShipmentDetails(ShipmentDetails value) {
        this.shipmentDetails = value;
    }

    /**
     * Gets the value of the trackingDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackingDetails }
     *     
     */
    public ArrayOfTrackingDetails getTrackingDetailsList() {
        return trackingDetailsList;
    }

    /**
     * Sets the value of the trackingDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackingDetails }
     *     
     */
    public void setTrackingDetailsList(ArrayOfTrackingDetails value) {
        this.trackingDetailsList = value;
    }

}