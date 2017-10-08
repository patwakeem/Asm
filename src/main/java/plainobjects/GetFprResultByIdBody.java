package plainobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetFprResultByIdBody {

    @SerializedName("result_ids")
    @Expose
    private List<String> resultIds = null;

    public List<String> getResultIds() {
        return resultIds;
    }

    public void setResultIds(List<String> resultIds) {
        this.resultIds = resultIds;
    }

}