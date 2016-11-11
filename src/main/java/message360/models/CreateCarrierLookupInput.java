/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 11/11/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCarrierLookupInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5102677390766265225L;
    private String phonenumber;
    private String responseType = "json";
    /** GETTER
     * The number to lookup
     */
    @JsonGetter("phonenumber")
    public String getPhonenumber ( ) { 
        return this.phonenumber;
    }
    
    /** SETTER
     * The number to lookup
     */
    @JsonSetter("phonenumber")
    public void setPhonenumber (String value) { 
        this.phonenumber = value;
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
 