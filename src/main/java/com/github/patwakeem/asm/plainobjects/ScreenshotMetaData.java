package com.github.patwakeem.asm.plainobjects;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScreenshotMetaData {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("index")
    @Expose
    private Integer index;
    @SerializedName("timestamp_utc")
    @Expose
    private String timestampUtc;
    @SerializedName("image_type")
    @Expose
    private String imageType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getTimestampUtc() {
        return timestampUtc;
    }

    public void setTimestampUtc(String timestampUtc) {
        this.timestampUtc = timestampUtc;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }
}