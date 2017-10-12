package com.github.patwakeem.asm.plainobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class CheckResult
{

    @SerializedName("check_id")
    @Expose
    private Integer checkId;
    @SerializedName("result_id")
    @Expose
    private String resultId;
    @SerializedName("time_stamp_utc")
    @Expose
    private String timeStampUtc;
    @SerializedName("url_results")
    @Expose
    private List<UrlResult> urlResults = null;

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public CheckResult withCheckId(Integer checkId) {
        this.checkId = checkId;
        return this;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public CheckResult withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    public String getTimeStampUtc() {
        return timeStampUtc;
    }

    public void setTimeStampUtc(String timeStampUtc) {
        this.timeStampUtc = timeStampUtc;
    }

    public CheckResult withTimeStampUtc(String timeStampUtc) {
        this.timeStampUtc = timeStampUtc;
        return this;
    }

    public List<UrlResult> getUrlResults() {
        return urlResults;
    }

    public void setUrlResults(List<UrlResult> urlResults) {
        this.urlResults = urlResults;
    }

    public CheckResult withUrlResults(List<UrlResult> urlResults) {
        this.urlResults = urlResults;
        return this;
    }


    public int describeContents() {
        return  0;
    }

}