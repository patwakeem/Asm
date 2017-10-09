package asm.plainobjects;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class CreateBrowserCheckBody implements CreateCheckBody {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("monitor_groups_ids")
    @Expose
    private List<Integer> monitorGroupsIds = null;
    @SerializedName("interval_seconds")
    @Expose
    private Integer intervalSeconds;
    @SerializedName("max_attempts")
    @Expose
    private Integer maxAttempts;
    @SerializedName("location_code")
    @Expose
    private String locationCode;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTarget(String t) {
        this.url = t;
    }

    @Override
    public void sanitizeHost() {
    }

    @Override
    public JsonObject getJson() {
        Gson gson = new Gson();
        JsonParser jsonParser = new JsonParser();
        return jsonParser.parse(gson.toJson(this)).getAsJsonObject();
    }

    public List<Integer> getMonitorGroupsIds() {
        return monitorGroupsIds;
    }

    public void setMonitorGroupsIds(List<Integer> monitorGroupsIds) {
        this.monitorGroupsIds = monitorGroupsIds;
    }

    public Integer getIntervalSeconds() {
        return intervalSeconds;
    }

    public void setIntervalSeconds(Integer intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }

    public Integer getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    @Override
    public void setPort(Integer i) {
    }

    public int describeContents() {
        return 0;
    }
}