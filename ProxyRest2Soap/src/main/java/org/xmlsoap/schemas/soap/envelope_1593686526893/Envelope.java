
package org.xmlsoap.schemas.soap.envelope_1593686526893;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.cdyne.ws.phoneverify.query_1593686526893.CheckPhoneNumberResponse;


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
 *         &lt;element name="Body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ws.cdyne.com/PhoneVerify/query}CheckPhoneNumberResponse"/>
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
    "body"
})
@XmlRootElement(name = "Envelope")
public class Envelope {

    @XmlElement(name = "Body", required = true)
    protected Envelope.Body body;

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
     *         &lt;element ref="{http://ws.cdyne.com/PhoneVerify/query}CheckPhoneNumberResponse"/>
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
        "checkPhoneNumberResponse"
    })
    public static class Body {

        @XmlElement(name = "CheckPhoneNumberResponse", namespace = "http://ws.cdyne.com/PhoneVerify/query", required = true)
        protected CheckPhoneNumberResponse checkPhoneNumberResponse;

        /**
         * Gets the value of the checkPhoneNumberResponse property.
         * 
         * @return
         *     possible object is
         *     {@link CheckPhoneNumberResponse }
         *     
         */
        public CheckPhoneNumberResponse getCheckPhoneNumberResponse() {
            return checkPhoneNumberResponse;
        }

        /**
         * Sets the value of the checkPhoneNumberResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckPhoneNumberResponse }
         *     
         */
        public void setCheckPhoneNumberResponse(CheckPhoneNumberResponse value) {
            this.checkPhoneNumberResponse = value;
        }

    }

}
