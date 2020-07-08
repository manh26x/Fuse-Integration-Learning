
package com.cdyne.ws.phoneverify.query_1593684980923;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="CheckPhoneNumbersResult">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PhoneReturn" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OriginalNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}String">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CleanNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value=""/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Wireless" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "checkPhoneNumbersResult"
})
@XmlRootElement(name = "CheckPhoneNumbersResponse")
public class CheckPhoneNumbersResponse {

    @XmlElement(name = "CheckPhoneNumbersResult", required = true)
    protected CheckPhoneNumbersResponse.CheckPhoneNumbersResult checkPhoneNumbersResult;

    /**
     * Gets the value of the checkPhoneNumbersResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPhoneNumbersResponse.CheckPhoneNumbersResult }
     *     
     */
    public CheckPhoneNumbersResponse.CheckPhoneNumbersResult getCheckPhoneNumbersResult() {
        return checkPhoneNumbersResult;
    }

    /**
     * Sets the value of the checkPhoneNumbersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPhoneNumbersResponse.CheckPhoneNumbersResult }
     *     
     */
    public void setCheckPhoneNumbersResult(CheckPhoneNumbersResponse.CheckPhoneNumbersResult value) {
        this.checkPhoneNumbersResult = value;
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
     *         &lt;element name="PhoneReturn" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OriginalNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}String">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CleanNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value=""/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
        "phoneReturn"
    })
    public static class CheckPhoneNumbersResult {

        @XmlElement(name = "PhoneReturn")
        protected List<CheckPhoneNumbersResponse.CheckPhoneNumbersResult.PhoneReturn> phoneReturn;

        /**
         * Gets the value of the phoneReturn property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneReturn property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneReturn().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CheckPhoneNumbersResponse.CheckPhoneNumbersResult.PhoneReturn }
         * 
         * 
         */
        public List<CheckPhoneNumbersResponse.CheckPhoneNumbersResult.PhoneReturn> getPhoneReturn() {
            if (phoneReturn == null) {
                phoneReturn = new ArrayList<CheckPhoneNumbersResponse.CheckPhoneNumbersResult.PhoneReturn>();
            }
            return this.phoneReturn;
        }

        public void setPhoneReturn(List<CheckPhoneNumbersResponse.CheckPhoneNumbersResult.PhoneReturn> phoneReturn) {
            this.phoneReturn = phoneReturn;
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
         *         &lt;element name="OriginalNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}String">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CleanNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value=""/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
        public static class PhoneReturn {

            @XmlElement(name = "Valid", required = true)
            protected String valid;
            @XmlElement(name = "OriginalNumber")
            protected String originalNumber;
            @XmlElement(name = "CleanNumber", required = true)
            protected String cleanNumber;
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
            public String getOriginalNumber() {
                return originalNumber;
            }

            /**
             * Sets the value of the originalNumber property.
             * 
             */
            public void setOriginalNumber(String value) {
                this.originalNumber = value;
            }

            /**
             * Gets the value of the cleanNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCleanNumber() {
                return cleanNumber;
            }

            /**
             * Sets the value of the cleanNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCleanNumber(String value) {
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

}
