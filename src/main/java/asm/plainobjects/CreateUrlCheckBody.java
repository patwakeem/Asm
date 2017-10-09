package asm.plainobjects;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unused")
public class CreateUrlCheckBody implements CreateCheckBody {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("content_pattern_type")
    @Expose
    private String contentPatternType;
    @SerializedName("content_pattern")
    @Expose
    private String contentPattern;
    @SerializedName("content_pattern_case_sensitive")
    @Expose
    private Boolean contentPatternCaseSensitive;
    @SerializedName("request_method")
    @Expose
    private String requestMethod;
    @SerializedName("post_data")
    @Expose
    private String postData;
    @SerializedName("custom_hdrs")
    @Expose
    private HashMap<String, String> customHdrs;
    @SerializedName("max_redirects")
    @Expose
    private Integer maxRedirects;
    @SerializedName("disable_certificate_verification")
    @Expose
    private Boolean disableCertificateVerification;
    @SerializedName("asm/authentication")
    @Expose
    private Authentication authentication;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
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

    public void setPort(Integer i) {

    }

    public void sanitizeHost() {

    }

    public JsonObject getJson() {
        Gson gson = new Gson();
        JsonParser jsonParser = new JsonParser();
        return jsonParser.parse(gson.toJson(this)).getAsJsonObject();
    }

    public void setTarget(String s) {
        url = s;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentPatternType() {
        return contentPatternType;
    }

    public void setContentPatternType(String contentPatternType) {
        this.contentPatternType = contentPatternType;
    }

    public String getContentPattern() {
        return contentPattern;
    }

    public void setContentPattern(String contentPattern) {
        this.contentPattern = contentPattern;
    }

    public Boolean getContentPatternCaseSensitive() {
        return contentPatternCaseSensitive;
    }

    public void setContentPatternCaseSensitive(Boolean contentPatternCaseSensitive) {
        this.contentPatternCaseSensitive = contentPatternCaseSensitive;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getPostData() {
        return postData;
    }

    public void setPostData(String postData) {
        this.postData = postData;
    }

    public HashMap<String, String> getCustomHdrs() {
        return customHdrs;
    }

    public void setCustomHdrs(HashMap<String, String> customHdrs) {
        this.customHdrs = customHdrs;
    }

    public Integer getMaxRedirects() {
        return maxRedirects;
    }

    public void setMaxRedirects(Integer maxRedirects) {
        this.maxRedirects = maxRedirects;
    }

    public Boolean getDisableCertificateVerification() {
        return disableCertificateVerification;
    }

    public void setDisableCertificateVerification(Boolean disableCertificateVerification) {
        this.disableCertificateVerification = disableCertificateVerification;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}