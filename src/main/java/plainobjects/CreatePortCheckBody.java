package plainobjects;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class CreatePortCheckBody implements CreateCheckBody {

    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("port")
    @Expose
    private Integer port;
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

    public JsonObject getJson() {
        Gson gson = new Gson();
        JsonParser jsonParser = new JsonParser();
        return jsonParser.parse(gson.toJson(this)).getAsJsonObject();
    }

    public void setTarget(String s) {
        server = s;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void sanitizeHost() {
        if (server.trim().startsWith("http://") || server.trim().startsWith("https://")) {
            server = server.trim().replace("http://", "").replace("https://", "");
        } else {
            server = server.trim();
        }
    }
}