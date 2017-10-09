package asm.plainobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddGroupBody
{

    @SerializedName("top_group_id")
    @Expose
    private Integer topGroupId;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public AddGroupBody() {
    }

    /**
     *
     * @param topGroupId topgroup id
     * @param name name of group
     */
    public AddGroupBody(Integer topGroupId, String name) {
        super();
        this.topGroupId = topGroupId;
        this.name = name;
    }

    public Integer getTopGroupId() {
        return topGroupId;
    }

    public void setTopGroupId(Integer topGroupId) {
        this.topGroupId = topGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}