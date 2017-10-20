/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GroupCallInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5093332833681953719L;
    private String from;
    private String to;
    private String url;
    private String responseType = "json";
    private String groupConfirmKey;
    private AudioFormatEnum groupConfirmFile;
    private HttpActionEnum method;
    private String statusCallBackUrl;
    private HttpActionEnum statusCallBackMethod;
    private String fallBackUrl;
    private HttpActionEnum fallBackMethod;
    private String heartBeatUrl;
    private HttpActionEnum heartBeatMethod;
    private Integer timeout;
    private String playDtmf;
    private String hideCallerId;
    private Boolean record;
    private String recordCallBackUrl;
    private HttpActionEnum recordCallBackMethod;
    private Boolean transcribe;
    private String transcribeCallBackUrl;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
    /** GETTER
     * Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
     */
    @JsonGetter("GroupConfirmKey")
    public String getGroupConfirmKey ( ) { 
        return this.groupConfirmKey;
    }
    
    /** SETTER
     * Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
     */
    @JsonSetter("GroupConfirmKey")
    public void setGroupConfirmKey (String value) { 
        this.groupConfirmKey = value;
    }
 
    /** GETTER
     * Specify the audio file you want to play when the called party picks up the call
     */
    @JsonGetter("GroupConfirmFile")
    public AudioFormatEnum getGroupConfirmFile ( ) { 
        return this.groupConfirmFile;
    }
    
    /** SETTER
     * Specify the audio file you want to play when the called party picks up the call
     */
    @JsonSetter("GroupConfirmFile")
    public void setGroupConfirmFile (AudioFormatEnum value) { 
        this.groupConfirmFile = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Method")
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Method")
    public void setMethod (HttpActionEnum value) { 
        this.method = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("StatusCallBackUrl")
    public String getStatusCallBackUrl ( ) { 
        return this.statusCallBackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("StatusCallBackUrl")
    public void setStatusCallBackUrl (String value) { 
        this.statusCallBackUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("StatusCallBackMethod")
    public HttpActionEnum getStatusCallBackMethod ( ) { 
        return this.statusCallBackMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("StatusCallBackMethod")
    public void setStatusCallBackMethod (HttpActionEnum value) { 
        this.statusCallBackMethod = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("FallBackUrl")
    public String getFallBackUrl ( ) { 
        return this.fallBackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("FallBackUrl")
    public void setFallBackUrl (String value) { 
        this.fallBackUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("FallBackMethod")
    public HttpActionEnum getFallBackMethod ( ) { 
        return this.fallBackMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("FallBackMethod")
    public void setFallBackMethod (HttpActionEnum value) { 
        this.fallBackMethod = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HeartBeatUrl")
    public String getHeartBeatUrl ( ) { 
        return this.heartBeatUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HeartBeatUrl")
    public void setHeartBeatUrl (String value) { 
        this.heartBeatUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HeartBeatMethod")
    public HttpActionEnum getHeartBeatMethod ( ) { 
        return this.heartBeatMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HeartBeatMethod")
    public void setHeartBeatMethod (HttpActionEnum value) { 
        this.heartBeatMethod = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Timeout")
    public Integer getTimeout ( ) { 
        return this.timeout;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Timeout")
    public void setTimeout (Integer value) { 
        this.timeout = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PlayDtmf")
    public String getPlayDtmf ( ) { 
        return this.playDtmf;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PlayDtmf")
    public void setPlayDtmf (String value) { 
        this.playDtmf = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HideCallerId")
    public String getHideCallerId ( ) { 
        return this.hideCallerId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HideCallerId")
    public void setHideCallerId (String value) { 
        this.hideCallerId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Record")
    public Boolean getRecord ( ) { 
        return this.record;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Record")
    public void setRecord (Boolean value) { 
        this.record = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RecordCallBackUrl")
    public String getRecordCallBackUrl ( ) { 
        return this.recordCallBackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RecordCallBackUrl")
    public void setRecordCallBackUrl (String value) { 
        this.recordCallBackUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RecordCallBackMethod")
    public HttpActionEnum getRecordCallBackMethod ( ) { 
        return this.recordCallBackMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RecordCallBackMethod")
    public void setRecordCallBackMethod (HttpActionEnum value) { 
        this.recordCallBackMethod = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Transcribe")
    public Boolean getTranscribe ( ) { 
        return this.transcribe;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Transcribe")
    public void setTranscribe (Boolean value) { 
        this.transcribe = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TranscribeCallBackUrl")
    public String getTranscribeCallBackUrl ( ) { 
        return this.transcribeCallBackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TranscribeCallBackUrl")
    public void setTranscribeCallBackUrl (String value) { 
        this.transcribeCallBackUrl = value;
    }
 
}
 