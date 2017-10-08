package plainobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class AsmSubGroup {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("checks")
    @Expose
    private List<Integer> checks = new ArrayList<>();

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

    public AsmSubGroup withId(Integer id) {
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

    public AsmSubGroup withName(String name) {
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

    public AsmSubGroup withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     *
     * @return
     *     The checks
     */
    public List<Integer> getChecks() {
        return checks;
    }

    /**
     *
     * @param checks
     *     The checks
     */
    public void setChecks(List<Integer> checks) {
        this.checks = checks;
    }

    public AsmSubGroup withChecks(List<Integer> checks) {
        this.checks = checks;
        return this;
    }
}