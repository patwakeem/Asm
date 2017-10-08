package plainobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class FprUrlResults
{

    @SerializedName("check_results")
    @Expose
    private List<CheckResult> checkResults = null;

    public List<CheckResult> getCheckResults() {
        return checkResults;
    }

    public void setCheckResults(List<CheckResult> checkResults) {
        this.checkResults = checkResults;
    }

    public FprUrlResults withCheckResults(List<CheckResult> checkResults) {
        this.checkResults = checkResults;
        return this;
    }

    public List<UrlResult> getUrlResults() {
        try {
            return checkResults.get(0).getUrlResults();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FprUrlResults that = (FprUrlResults) o;

        return checkResults != null ? checkResults.equals(that.checkResults) : that.checkResults == null;
    }

    @Override
    public int hashCode() {
        return checkResults != null ? checkResults.hashCode() : 0;
    }
}
