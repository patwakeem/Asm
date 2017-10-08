package plainobjects;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AsmTopLevelGroup implements AsmGroup {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("groups")
    @Expose
    private List<AsmSubGroup> groups = new ArrayList<>();

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

    public AsmTopLevelGroup withId(Integer id) {
        this.id = id;
        return this;
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

    public AsmTopLevelGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     *
     * @param rank
     *     The rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public AsmTopLevelGroup withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     *
     * @return
     *     The groups
     */
    public List<AsmSubGroup> getGroups() {
        return groups;
    }

    /**
     *
     * @param groups
     *     The groups
     */
    public void setGroups(List<AsmSubGroup> groups) {
        this.groups = groups;
    }

    public AsmTopLevelGroup withGroups(List<AsmSubGroup> groups) {
        this.groups = groups;
        return this;
    }

}