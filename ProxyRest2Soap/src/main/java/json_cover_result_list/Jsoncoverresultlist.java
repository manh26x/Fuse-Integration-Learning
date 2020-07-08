
package json_cover_result_list;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "PhoneReturn"
})
public class Jsoncoverresultlist {

    @JsonProperty("PhoneReturn")
    private List<json_cover_result_list.PhoneReturn> PhoneReturn = new ArrayList<json_cover_result_list.PhoneReturn>();

    /**
     * 
     * @return
     *     The PhoneReturn
     */
    @JsonProperty("PhoneReturn")
    public List<json_cover_result_list.PhoneReturn> getPhoneReturn() {
        return PhoneReturn;
    }

    /**
     * 
     * @param PhoneReturn
     *     The PhoneReturn
     */
    @JsonProperty("PhoneReturn")
    public void setPhoneReturn(List<json_cover_result_list.PhoneReturn> PhoneReturn) {
        this.PhoneReturn = PhoneReturn;
    }

}
