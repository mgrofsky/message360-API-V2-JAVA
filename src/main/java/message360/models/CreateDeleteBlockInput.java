/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/12/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateDeleteBlockInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5720507159833372894L;
    private String email;
    private String responseType = "json";
    /** GETTER
     * Email address to remove from block list
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Email address to remove from block list
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * Response type format xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type format xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 