
package org.xmlsoap.schemas.soap.envelope_1593685744697;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.cdyne.ws.phoneverify.query_1593685744697.CheckPhoneNumber;


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
 *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ws.cdyne.com/PhoneVerify/query}CheckPhoneNumber"/>
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
    "header",
    "body"
})
@XmlRootElement(name = "Envelope")
public class Envelope {

    @XmlElement(name = "Header", required = true)
    protected String header;
    @XmlElement(name = "Body", required = true)
    protected Envelope.Body body;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Envelope.Body }
     *     
     */
    public Envelope.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Envelope.Body }
     *     
     */
    public void setBody(Envelope.Body value) {
        this.body = value;
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
     *         &lt;element ref="{http://ws.cdyne.com/PhoneVerify/query}CheckPhoneNumber"/>
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
        "checkPhoneNumber"
    })
    public static class Body {

        @XmlElement(name = "CheckPhoneNumber", namespace = "http://ws.cdyne.com/PhoneVerify/query", required = true)
        protected CheckPhoneNumber checkPhoneNumber;

        /**
         * Gets the value of the checkPhoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link CheckPhoneNumber }
         *     
         */
        public CheckPhoneNumber getCheckPhoneNumber() {
            return checkPhoneNumber;
        }

        /**
         * Sets the value of the checkPhoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckPhoneNumber }
         *     
         */
        public void setCheckPhoneNumber(CheckPhoneNumber value) {
            this.checkPhoneNumber = value;
        }

    }

}
