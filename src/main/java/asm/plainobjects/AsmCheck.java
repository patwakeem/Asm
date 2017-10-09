package asm.plainobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

@SuppressWarnings("unused")
public class AsmCheck
{

    @SerializedName("check_type")
    @Expose
    private String checkType;
    @SerializedName("last_result_details")
    @Expose
    private HashMap lastResultDetails;
    @SerializedName("timestamp_utc")
    @Expose
    private String timestampUtc;
    @SerializedName("scheduled_exclusion")
    @Expose
    private String scheduledExclusion;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("severity")
    @Expose
    private String severity;
    @SerializedName("check_symbol")
    @Expose
    private String checkSymbol;
    @SerializedName("sla_percent_current_month")
    @Expose
    private Double slaPercentCurrentMonth;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("target_sla")
    @Expose
    private Double targetSla;
    @SerializedName("scheduled_inclusion")
    @Expose
    private String scheduledInclusion;
    @SerializedName("check_type_name")
    @Expose
    private String checkTypeName;
    @SerializedName("interval_seconds")
    @Expose
    private Integer intervalSeconds;
    @SerializedName("check_type_api")
    @Expose
    private String checkTypeApi;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("threshold_e")
    @Expose
    private Integer thresholdE;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("threshold_w")
    @Expose
    private Integer thresholdW;

    /**
     *
     * @return
     *     The checkType
     */
    public String getCheckType() {
        return checkType;
    }

    /**
     *
     * @param checkType
     *     The check_type
     */
    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    /**
     *
     * @return
     *     The lastResultDetails
     */
    public HashMap getLastResultDetails() {
        return lastResultDetails;
    }

    /**
     *
     * @param lastResultDetails
     *     The last_result_details
     */
    public void setLastResultDetails(HashMap lastResultDetails) {
        this.lastResultDetails = lastResultDetails;
    }

    /**
     *
     * @return
     *     The timestampUtc
     */
    public String getTimestampUtc() {
        return timestampUtc;
    }

    /**
     *
     * @param timestampUtc
     *     The timestamp_utc
     */
    public void setTimestampUtc(String timestampUtc) {
        this.timestampUtc = timestampUtc;
    }

    /**
     *
     * @return
     *     The scheduledExclusion
     */
    public String getScheduledExclusion() {
        return scheduledExclusion;
    }

    /**
     *
     * @param scheduledExclusion
     *     The scheduled_exclusion
     */
    public void setScheduledExclusion(String scheduledExclusion) {
        this.scheduledExclusion = scheduledExclusion;
    }

    /**
     *
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     *
     * @param countryCode
     *     The country_code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     *
     * @return
     *     The guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     *
     * @param guid
     *     The guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     *
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     *
     * @param unit
     *     The unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     *
     * @return
     *     The severity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     *
     * @param severity
     *     The severity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     *
     * @return
     *     The checkSymbol
     */
    public String getCheckSymbol() {
        return checkSymbol;
    }

    /**
     *
     * @param checkSymbol
     *     The check_symbol
     */
    public void setCheckSymbol(String checkSymbol) {
        this.checkSymbol = checkSymbol;
    }

    /**
     *
     * @return
     *     The slaPercentCurrentMonth
     */
    public Double getSlaPercentCurrentMonth() {
        return slaPercentCurrentMonth;
    }

    /**
     *
     * @param slaPercentCurrentMonth
     *     The sla_percent_current_month
     */
    public void setSlaPercentCurrentMonth(Double slaPercentCurrentMonth) {
        this.slaPercentCurrentMonth = slaPercentCurrentMonth;
    }

    /**
     *
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     *     The targetSla
     */
    public Double getTargetSla() {
        return targetSla;
    }

    /**
     *
     * @param targetSla
     *     The target_sla
     */
    public void setTargetSla(Double targetSla) {
        this.targetSla = targetSla;
    }

    /**
     *
     * @return
     *     The scheduledInclusion
     */
    public String getScheduledInclusion() {
        return scheduledInclusion;
    }

    /**
     *
     * @param scheduledInclusion
     *     The scheduled_inclusion
     */
    public void setScheduledInclusion(String scheduledInclusion) {
        this.scheduledInclusion = scheduledInclusion;
    }

    /**
     *
     * @return
     *     The checkTypeName
     */
    public String getCheckTypeName() {
        return checkTypeName;
    }

    /**
     *
     * @param checkTypeName
     *     The check_type_name
     */
    public void setCheckTypeName(String checkTypeName) {
        this.checkTypeName = checkTypeName;
    }

    /**
     *
     * @return
     *     The intervalSeconds
     */
    public Integer getIntervalSeconds() {
        return intervalSeconds;
    }

    /**
     *
     * @param intervalSeconds
     *     The interval_seconds
     */
    public void setIntervalSeconds(Integer intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }

    /**
     *
     * @return
     *     The checkTypeApi
     */
    public String getCheckTypeApi() {
        return checkTypeApi;
    }

    /**
     *
     * @param checkTypeApi
     *     The check_type_api
     */
    public void setCheckTypeApi(String checkTypeApi) {
        this.checkTypeApi = checkTypeApi;
    }

    /**
     *
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     *     The thresholdE
     */
    public Integer getThresholdE() {
        return thresholdE;
    }

    /**
     *
     * @param thresholdE
     *     The threshold_e
     */
    public void setThresholdE(Integer thresholdE) {
        this.thresholdE = thresholdE;
    }

    /**
     *
     * @return
     *     The enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     *
     * @param enabled
     *     The enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     *
     * @return
     *     The value
     */
    public Integer getValue() {
        if (value == null) {
            return 0;
        } else {
            return value;
        }
    }

    /**
     *
     * @param value
     *     The value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     *
     * @return
     *     The thresholdW
     */
    public Integer getThresholdW() {
        return thresholdW;
    }

    /**
     *
     * @param thresholdW
     *     The threshold_w
     */
    public void setThresholdW(Integer thresholdW) {
        this.thresholdW = thresholdW;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AsmCheck asmCheck = (AsmCheck) o;

        if (id != null ? !id.equals(asmCheck.id) : asmCheck.id != null) return false;
        return url != null ? url.equals(asmCheck.url) : asmCheck.url == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}