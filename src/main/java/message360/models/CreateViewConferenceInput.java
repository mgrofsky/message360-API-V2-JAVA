/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 11/11/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewConferenceInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5125073990161533782L;
    private String conferencesid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier of each conference resource
     */
    @JsonGetter("conferencesid")
    public String getConferencesid ( ) { 
        return this.conferencesid;
    }
    
    /** SETTER
     * The unique identifier of each conference resource
     */
    @JsonSetter("conferencesid")
    public void setConferencesid (String value) { 
        this.conferencesid = value;
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
 