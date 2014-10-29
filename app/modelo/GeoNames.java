package modelo;

import java.net.URL;
import java.util.List;

/**
 * Created by dirceu on 10/28/14.
 */
public class GeoNames {
    private String fcodeName;
    private String toponymName;
    private String countryCode;
    private String fcl;
    private List<String> fclName;
                private String name;
    private URL wikipedia;
    private Double lng;
    private String fcode;
    private Integer geoNameId;
    private Double lat;
    private Integer population;

    public GeoNames(){

    }
    public GeoNames(String fcodeName, String toponymName, String countryCode, String fcl, List<String> fclName, String name, URL wikipedia, Double lng, String fcode, Integer geoNameId, Double lat, Integer population) {
        this.fcodeName = fcodeName;
        this.toponymName = toponymName;
        this.countryCode = countryCode;
        this.fcl = fcl;
        this.fclName = fclName;
        this.name = name;
        this.wikipedia = wikipedia;
        this.lng = lng;
        this.fcode = fcode;
        this.geoNameId = geoNameId;
        this.lat = lat;
        this.population = population;
    }

    public String getFcodeName() {
        return fcodeName;
    }

    public void setFcodeName(String fcodeName) {
        this.fcodeName = fcodeName;
    }

    public String getToponymName() {
        return toponymName;
    }

    public void setToponymName(String toponymName) {
        this.toponymName = toponymName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFcl() {
        return fcl;
    }

    public void setFcl(String fcl) {
        this.fcl = fcl;
    }

    public List<String> getFclName() {
        return fclName;
    }

    public void setFclName(List<String> fclName) {
        this.fclName = fclName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(URL wikipedia) {
        this.wikipedia = wikipedia;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    public Integer getGeoNameId() {
        return geoNameId;
    }

    public void setGeoNameId(Integer geoNameId) {
        this.geoNameId = geoNameId;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoNames)) return false;

        GeoNames geoNames = (GeoNames) o;

        if (countryCode != null ? !countryCode.equals(geoNames.countryCode) : geoNames.countryCode != null)
            return false;
        if (fcl != null ? !fcl.equals(geoNames.fcl) : geoNames.fcl != null) return false;
        if (fclName != null ? !fclName.equals(geoNames.fclName) : geoNames.fclName != null) return false;
        if (fcode != null ? !fcode.equals(geoNames.fcode) : geoNames.fcode != null) return false;
        if (fcodeName != null ? !fcodeName.equals(geoNames.fcodeName) : geoNames.fcodeName != null) return false;
        if (geoNameId != null ? !geoNameId.equals(geoNames.geoNameId) : geoNames.geoNameId != null) return false;
        if (lat != null ? !lat.equals(geoNames.lat) : geoNames.lat != null) return false;
        if (lng != null ? !lng.equals(geoNames.lng) : geoNames.lng != null) return false;
        if (name != null ? !name.equals(geoNames.name) : geoNames.name != null) return false;
        if (population != null ? !population.equals(geoNames.population) : geoNames.population != null) return false;
        if (toponymName != null ? !toponymName.equals(geoNames.toponymName) : geoNames.toponymName != null)
            return false;
        if (wikipedia != null ? !wikipedia.equals(geoNames.wikipedia) : geoNames.wikipedia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fcodeName.hashCode();
        result = 31 * result + toponymName.hashCode();
        result = 31 * result + countryCode.hashCode();
        result = 31 * result + fcl.hashCode();
        result = 31 * result + fclName.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + wikipedia.hashCode();
        result = 31 * result + lng.hashCode();
        result = 31 * result + fcode.hashCode();
        result = 31 * result + geoNameId.hashCode();
        result = 31 * result + lat.hashCode();
        result = 31 * result + population.hashCode();
        return result;
    }
}
