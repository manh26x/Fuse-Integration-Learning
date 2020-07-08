
package json_list_request;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "string",
    "LicenseKey"
})
public class Jsonlistrequest {

    @JsonProperty("string")
    private List<String> string = new ArrayList<String>();
    @JsonProperty("LicenseKey")
    private String LicenseKey;

    /**
     * 
     * @return
     *     The string
     */
    @JsonProperty("string")
    public List<String> getString() {
        return string;
    }

    /**
     * 
     * @param string
     *     The string
     */
    @JsonProperty("string")
    public void setString(List<String> string) {
        this.string = string;
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
