
package com.cdyne.ws.phoneverify.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CheckPhoneNumberResult">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OriginalNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="CleanNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="Wireless" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "checkPhoneNumberResult"
})
@XmlRootElement(name = "CheckPhoneNumberResponse")
public class CheckPhoneNumberResponse {

    @XmlElement(name = "CheckPhoneNumberResult", required = true)
    protected CheckPhoneNumberResponse.CheckPhoneNumberResult checkPhoneNumberResult;

    /**
     * Gets the value of the checkPhoneNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPhoneNumberResponse.CheckPhoneNumberResult }
     *     
     */
    public CheckPhoneNumberResponse.CheckPhoneNumberResult getCheckPhoneNumberResult() {
        return checkPhoneNumberResult;
    }

    /**
     * Sets the value of the checkPhoneNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPhoneNumberResponse.CheckPhoneNumberResult }
     *     
     */
    public void setCheckPhoneNumberResult(CheckPhoneNumberResponse.CheckPhoneNumberResult value) {
        this.checkPhoneNumberResult = value;
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
     *         &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OriginalNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="CleanNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="Wireless" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "valid",
        "originalNumber",
        "cleanNumber",
        "wireless"
    })
    public static class CheckPhoneNumberResult {

        @XmlElement(name = "Valid", required = true)
        protected String valid;
        @XmlElement(name = "OriginalNumber")
        protected short originalNumber;
        @XmlElement(name = "CleanNumber")
        protected short cleanNumber;
        @XmlElement(name = "Wireless", required = true)
        protected String wireless;

        /**
         * Gets the value of the valid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValid() {
            return valid;
        }

        /**
         * Sets the value of the valid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValid(String value) {
            this.valid = value;
        }

        /**
         * Gets the value of the originalNumber property.
         * 
         */
        public short getOriginalNumber() {
            return originalNumber;
        }

        /**
         * Sets the value of the originalNumber property.
         * 
         */
        public void setOriginalNumber(short value) {
            this.originalNumber = value;
        }

        /**
         * Gets the value of the cleanNumber property.
         * 
         */
        public short getCleanNumber() {
            return cleanNumber;
        }

        /**
         * Sets the value of the cleanNumber property.
         * 
         */
        public void setCleanNumber(short value) {
            this.cleanNumber = value;
        }

        /**
         * Gets the value of the wireless property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWireless() {
            return wireless;
        }

        /**
         * Sets the value of the wireless property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWireless(String value) {
            this.wireless = value;
        }

    }

}
