package io.nature.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;

    public int getLatestnewCases() {
        return latestnewCases;
    }

    public void setLatestnewCases(int latestnewCases) {
        this.latestnewCases = latestnewCases;
    }

    private int latestnewCases;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
