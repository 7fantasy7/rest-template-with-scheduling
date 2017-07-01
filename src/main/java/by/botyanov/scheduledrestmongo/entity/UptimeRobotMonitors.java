package by.botyanov.scheduledrestmongo.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "stat",
        "pagination",
        "monitors"
})
@Document
public class UptimeRobotMonitors {

    @Id
    private Long id;

    @JsonProperty("stat")
    private String stat;
    @JsonProperty("pagination")
    private Pagination pagination;
    @JsonProperty("monitors")
    private List<Monitor> monitors = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getId() {
        return id;
    }

    public UptimeRobotMonitors setId(Long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("stat")
    public String getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(String stat) {
        this.stat = stat;
    }

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @JsonProperty("monitors")
    public List<Monitor> getMonitors() {
        return monitors;
    }

    @JsonProperty("monitors")
    public void setMonitors(List<Monitor> monitors) {
        this.monitors = monitors;
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
        return "UptimeRobotMonitors{" + "stat='" + stat + '\'' +
                ", pagination=" + pagination +
                ", monitors=" + monitors +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}
