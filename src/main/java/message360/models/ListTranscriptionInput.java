/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListTranscriptionInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5178384379407018828L;
    private String responseType = "json";
    private Integer page;
    private Integer pageSize;
    private StatusEnum status;
    private String dateTranscribed;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Status")
    public StatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Status")
    public void setStatus (StatusEnum value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("DateTranscribed")
    public String getDateTranscribed ( ) { 
        return this.dateTranscribed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("DateTranscribed")
    public void setDateTranscribed (String value) { 
        this.dateTranscribed = value;
    }
 
}
 