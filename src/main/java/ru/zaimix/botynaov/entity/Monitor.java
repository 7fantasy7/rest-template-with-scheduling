package ru.zaimix.botynaov.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "friendly_name",
        "url",
        "type",
        "sub_type",
        "keyword_type",
        "keyword_value",
        "http_username",
        "http_password",
        "port",
        "interval",
        "status",
        "create_datetime",
        "monitor_group",
        "is_group_main",
        "logs"
})
public class Monitor {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("friendly_name")
    private String friendlyName;
    @JsonProperty("url")
    private String url;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("sub_type")
    private String subType;
    @JsonProperty("keyword_type")
    private String keywordType;
    @JsonProperty("keyword_value")
    private String keywordValue;
    @JsonProperty("http_username")
    private String httpUsername;
    @JsonProperty("http_password")
    private String httpPassword;
    @JsonProperty("port")
    private String port;
    @JsonProperty("interval")
    private Integer interval;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("create_datetime")
    private Integer createDatetime;
    @JsonProperty("monitor_group")
    private Integer monitorGroup;
    @JsonProperty("is_group_main")
    private Integer isGroupMain;
    @JsonProperty("logs")
    private List<Log> logs = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("friendly_name")
    public String getFriendlyName() {
        return friendlyName;
    }

    @JsonProperty("friendly_name")
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("sub_type")
    public String getSubType() {
        return subType;
    }

    @JsonProperty("sub_type")
    public void setSubType(String subType) {
        this.subType = subType;
    }

    @JsonProperty("keyword_type")
    public String getKeywordType() {
        return keywordType;
    }

    @JsonProperty("keyword_type")
    public void setKeywordType(String keywordType) {
        this.keywordType = keywordType;
    }

    @JsonProperty("keyword_value")
    public String getKeywordValue() {
        return keywordValue;
    }

    @JsonProperty("keyword_value")
    public void setKeywordValue(String keywordValue) {
        this.keywordValue = keywordValue;
    }

    @JsonProperty("http_username")
    public String getHttpUsername() {
        return httpUsername;
    }

    @JsonProperty("http_username")
    public void setHttpUsername(String httpUsername) {
        this.httpUsername = httpUsername;
    }

    @JsonProperty("http_password")
    public String getHttpPassword() {
        return httpPassword;
    }

    @JsonProperty("http_password")
    public void setHttpPassword(String httpPassword) {
        this.httpPassword = httpPassword;
    }

    @JsonProperty("port")
    public String getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(String port) {
        this.port = port;
    }

    @JsonProperty("interval")
    public Integer getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("create_datetime")
    public Integer getCreateDatetime() {
        return createDatetime;
    }

    @JsonProperty("create_datetime")
    public void setCreateDatetime(Integer createDatetime) {
        this.createDatetime = createDatetime;
    }

    @JsonProperty("monitor_group")
    public Integer getMonitorGroup() {
        return monitorGroup;
    }

    @JsonProperty("monitor_group")
    public void setMonitorGroup(Integer monitorGroup) {
        this.monitorGroup = monitorGroup;
    }

    @JsonProperty("is_group_main")
    public Integer getIsGroupMain() {
        return isGroupMain;
    }

    @JsonProperty("is_group_main")
    public void setIsGroupMain(Integer isGroupMain) {
        this.isGroupMain = isGroupMain;
    }

    @JsonProperty("logs")
    public List<Log> getLogs() {
        return logs;
    }

    @JsonProperty("logs")
    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Monitor{" + "id=" + id +
                ", friendlyName='" + friendlyName + '\'' +
                ", url='" + url + '\'' +
                ", type=" + type +
                ", subType='" + subType + '\'' +
                ", keywordType='" + keywordType + '\'' +
                ", keywordValue='" + keywordValue + '\'' +
                ", httpUsername='" + httpUsername + '\'' +
                ", httpPassword='" + httpPassword + '\'' +
                ", port='" + port + '\'' +
                ", interval=" + interval +
                ", status=" + status +
                ", createDatetime=" + createDatetime +
                ", monitorGroup=" + monitorGroup +
                ", isGroupMain=" + isGroupMain +
                ", logs=" + logs +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}
