package org.example;

import java.util.List;

public class Traveller {

    private String travellerName;
    private List<String> places;

    public Traveller() {
        ;
    }

    public Traveller(String travellerName, List<String> places) {
        this.travellerName = travellerName;
        this.places = places;
    }

    public String getTravellerName() {
        return travellerName;
    }

    public void setTravellerName(String travellerName) {
        this.travellerName = travellerName;
    }

    public List<String> getPlaces() {
        return places;
    }

    public void setPlaces(List<String> places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "travellerName='" + travellerName + '\'' +
                ", places=" + places +
                '}';
    }
}
