
package json_cover_result_list;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Valid",
    "OriginalNumber",
    "CleanNumber",
    "Wireless"
})
public class PhoneReturn {

    @JsonProperty("Valid")
    private String Valid;
    @JsonProperty("OriginalNumber")
    private String OriginalNumber;
    @JsonProperty("CleanNumber")
    private String CleanNumber;
    @JsonProperty("Wireless")
    private String Wireless;

    /**
     * 
     * @return
     *     The Valid
     */
    @JsonProperty("Valid")
    public String getValid() {
        return Valid;
    }

    /**
     * 
     * @param Valid
     *     The Valid
     */
    @JsonProperty("Valid")
    public void setValid(String Valid) {
        this.Valid = Valid;
    }

    /**
     * 
     * @return
     *     The OriginalNumber
     */
    @JsonProperty("OriginalNumber")
    public String getOriginalNumber() {
        return OriginalNumber;
    }

    /**
     * 
     * @param OriginalNumber
     *     The OriginalNumber
     */
    @JsonProperty("OriginalNumber")
    public void setOriginalNumber(String OriginalNumber) {
        this.OriginalNumber = OriginalNumber;
    }

    /**
     * 
     * @return
     *     The CleanNumber
     */
    @JsonProperty("CleanNumber")
    public String getCleanNumber() {
        return CleanNumber;
    }

    /**
     * 
     * @param CleanNumber
     *     The CleanNumber
     */
    @JsonProperty("CleanNumber")
    public void setCleanNumber(String CleanNumber) {
        this.CleanNumber = CleanNumber;
    }

    /**
     * 
     * @return
     *     The Wireless
     */
    @JsonProperty("Wireless")
    public String getWireless() {
        return Wireless;
    }

    /**
     * 
     * @param Wireless
     *     The Wireless
     */
    @JsonProperty("Wireless")
    public void setWireless(String Wireless) {
        this.Wireless = Wireless;
    }

}
