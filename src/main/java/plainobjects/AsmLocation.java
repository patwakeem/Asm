package plainobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("unused")
@Getter
@Setter
public class AsmLocation {

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("operator")
    @Expose
    private String operator;
    @SerializedName("browser_name")
    @Expose
    private String browserName;
    @SerializedName("browser_version")
    @Expose
    private String browserVersion;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("location_code")
    @Expose
    private String locationCode;
    @SerializedName("location_tier")
    @Expose
    private String locationTier;
    @SerializedName("region")
    @Expose
    private String region;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationTier() {
        return locationTier;
    }

    public void setLocationTier(String locationTier) {
        this.locationTier = locationTier;
    }

    public void setRegion(String region) { this.region = region; }

    public String getRegion() {
        return region;
    }

    public String getMyLocationString() {

        StringBuilder builder = new StringBuilder();

        if (getLocationTier() == null) {
            setLocationTier("3");
        }

        builder.append("(");
        builder.append(getLocationTier());
        builder.append(") ");

        if (getCity() == null) {
            builder.append(getCountry());
            builder.append(", ");
            builder.append(getRegion());
        } else {
            builder.append(getCountry());
            builder.append(", ");
            builder.append(getCity());

            if (!getOperator().equals("")) {
                builder.append(", ");
                builder.append(getOperator());
            }
        }

        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AsmLocation that = (AsmLocation) o;

        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (browserName != null ? !browserName.equals(that.browserName) : that.browserName != null) return false;
        if (browserVersion != null ? !browserVersion.equals(that.browserVersion) : that.browserVersion != null)
            return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (locationCode != null ? !locationCode.equals(that.locationCode) : that.locationCode != null) return false;
        if (locationTier != null ? !locationTier.equals(that.locationTier) : that.locationTier != null) return false;
        return region != null ? region.equals(that.region) : that.region == null;
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (browserName != null ? browserName.hashCode() : 0);
        result = 31 * result + (browserVersion != null ? browserVersion.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (locationCode != null ? locationCode.hashCode() : 0);
        result = 31 * result + (locationTier != null ? locationTier.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        return result;
    }
}