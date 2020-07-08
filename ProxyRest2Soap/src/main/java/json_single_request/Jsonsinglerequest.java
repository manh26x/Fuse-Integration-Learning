
package json_single_request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "PhoneNumber",
    "LicenseKey"
})
public class Jsonsinglerequest {

    @JsonProperty("PhoneNumber")
    private String PhoneNumber;
    @JsonProperty("LicenseKey")
    private String LicenseKey;

    /**
     * 
     * @return
     *     The PhoneNumber
     */
    @JsonProperty("PhoneNumber")
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * 
     * @param PhoneNumber
     *     The PhoneNumber
     */
    @JsonProperty("PhoneNumber")
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * 
     * @return
     *     The LicenseKey
     */
    @JsonProperty("LicenseKey")
    public String getLicenseKey() {
        return LicenseKey;
    }

    /**
     * 
     * @param LicenseKey
     *     The LicenseKey
     */
    @JsonProperty("LicenseKey")
    public void setLicenseKey(String LicenseKey) {
        this.LicenseKey = LicenseKey;
    }

}
