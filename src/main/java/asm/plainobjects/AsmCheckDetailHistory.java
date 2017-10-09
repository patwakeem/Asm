package asm.plainobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Created by patrick on 12/13/16.
 * WPM Check details POJO.
 */

@SuppressWarnings("unused")
public class AsmCheckDetailHistory
{
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("attempts")
    @Expose
    private Integer attempts;
    @SerializedName("result_code")
    @Expose
    private Integer resultCode;
    @SerializedName("check_id")
    @Expose
    private Integer checkId;
    @SerializedName("timestamp_utc")
    @Expose
    private String timestampUtc;
    @SerializedName("severity")
    @Expose
    private String severity;
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("unit")
    @Expose
    private String unit;

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     *
     * @param identifier
     * The identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     *
     * @return
     * The attempts
     */
    public Integer getAttempts() {
        return attempts;
    }

    /**
     *
     * @param attempts
     * The attempts
     */
    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    /**
     *
     * @return
     * The resultCode
     */
    public Integer getResultCode() {
        return resultCode;
    }

    /**
     *
     * @param resultCode
     * The result_code
     */
    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    /**
     *
     * @return
     * The checkId
     */
    public Integer getCheckId() {
        return checkId;
    }

    /**
     *
     * @param checkId
     * The check_id
     */
    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    /**
     *
     * @return
     * The timestampUtc
     */
    public String getTimestampUtc() {
        return timestampUtc;
    }

    /**
     *
     * @param timestampUtc
     * The timestamp_utc
     */
    public void setTimestampUtc(String timestampUtc) {
        this.timestampUtc = timestampUtc;
    }

    /**
     *
     * @return
     * The severity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     *
     * @param severity
     * The severity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     *
     * @return
     * The value
     */
    public Integer getValue() {
        if (value == null) {
            value = 0;
            return 0;
        } else {
            return value;
        }
    }

    /**
     *
     * @param value
     * The value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     *
     * @return
     * The unit
     */
    public String getUnit() {
        if (unit == null) {
            unit = "ms";
            return unit;
        } else {
            return unit;
        }
    }

    /**
     *
     * @param unit
     * The unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getTimeAsUnixEpoch() {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            return Long.parseLong("" + simpleDateFormat.parse(getTimestampUtc()).getTime());
        } catch (ParseException pe) {
            System.out.println("This should never happen.");
            return -1;
        }
    }

}