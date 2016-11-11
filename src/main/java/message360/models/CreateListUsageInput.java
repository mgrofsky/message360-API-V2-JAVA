/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 11/11/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListUsageInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4761383574993821445L;
    private String productCode = "0";
    private String startDate = "2016-09-06";
    private String endDate = "2016-09-06";
    private String responseType = "json";
    /** GETTER
     * Product Code
     */
    @JsonGetter("ProductCode")
    public String getProductCode ( ) { 
        return this.productCode;
    }
    
    /** SETTER
     * Product Code
     */
    @JsonSetter("ProductCode")
    public void setProductCode (String value) { 
        this.productCode = value;
    }
 
    /** GETTER
     * Start Usage Date
     */
    @JsonGetter("startDate")
    public String getStartDate ( ) { 
        return this.startDate;
    }
    
    /** SETTER
     * Start Usage Date
     */
    @JsonSetter("startDate")
    public void setStartDate (String value) { 
        this.startDate = value;
    }
 
    /** GETTER
     * End Usage Date
     */
    @JsonGetter("endDate")
    public String getEndDate ( ) { 
        return this.endDate;
    }
    
    /** SETTER
     * End Usage Date
     */
    @JsonSetter("endDate")
    public void setEndDate (String value) { 
        this.endDate = value;
    }
 
    /** GETTER
     * Response format, xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response format, xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 