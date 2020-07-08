
package singe_json_example;

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
public class Singejsonexample {

    @JsonProperty("Valid")
    private boolean Valid;
    @JsonProperty("OriginalNumber")
    private int OriginalNumber;
    @JsonProperty("CleanNumber")
    private int CleanNumber;
    @JsonProperty("Wireless")
    private boolean Wireless;

    /**
     * 
     * @return
     *     The Valid
     */
    @JsonProperty("Valid")
    public boolean isValid() {
        return Valid;
    }

    /**
     * 
     * @param Valid
     *     The Valid
     */
    @JsonProperty("Valid")
    public void setValid(boolean Valid) {
        this.Valid = Valid;
    }

    /**
     * 
     * @return
     *     The OriginalNumber
     */
    @JsonProperty("OriginalNumber")
    public int getOriginalNumber() {
        return OriginalNumber;
    }

    /**
     * 
     * @param OriginalNumber
     *     The OriginalNumber
     */
    @JsonProperty("OriginalNumber")
    public void setOriginalNumber(int OriginalNumber) {
        this.OriginalNumber = OriginalNumber;
    }

    /**
     * 
     * @return
     *     The CleanNumber
     */
    @JsonProperty("CleanNumber")
    public int getCleanNumber() {
        return CleanNumber;
    }

    /**
     * 
     * @param CleanNumber
     *     The CleanNumber
     */
    @JsonProperty("CleanNumber")
    public void setCleanNumber(int CleanNumber) {
        this.CleanNumber = CleanNumber;
    }

    /**
     * 
     * @return
     *     The Wireless
     */
    @JsonProperty("Wireless")
    public boolean isWireless() {
        return Wireless;
    }

    /**
     * 
     * @param Wireless
     *     The Wireless
     */
    @JsonProperty("Wireless")
    public void setWireless(boolean Wireless) {
        this.Wireless = Wireless;
    }

}
