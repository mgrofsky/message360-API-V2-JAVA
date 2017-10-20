/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteUnsubscribesInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5169483034058686979L;
    private String email;
    private String responseType = "json";
    /** GETTER
     * The email to remove from the unsubscribe list
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * The email to remove from the unsubscribe list
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
 