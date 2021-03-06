package com.capestone.android.smartmap;

import java.util.List;

/**
 * Created by Akinyele on 1/29/2017.
 */

public class Room  extends Vertex{
    /**
     * Constructs a new Address object set to the given Locale and with all
     * other fields initialized to null or false.
     *
     * @param locale
     */

    private final String id;
    private  final String rmName;
    private double mLatitude;
    private double mLongitude;
    private List<String> Description;
    private double floor;
    private boolean known;
    private double familiarity;
    //private string imageName;


    public Room(String id, String rmName, double mLatitude, double mLongitude) {
        super(id, rmName, mLatitude, mLatitude, "ROOM");
        this.rmName = rmName;
        this.id = id;
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
    }


    public void setLat( Double Lat){
        this.mLatitude = Lat;
    }


    public void setLng( Double Lng){
        this.mLongitude = Lng;
    }

    public double getLat(){
        return this.mLatitude;
    }

    public double getLng(){
        return this.mLongitude;
    }


    public double getFloor() {
        return floor;
    }

    public void setFloor(double floor) {
        this.floor = floor;
    }

    public boolean isKnown() {
        return known;
    }

    public void setKnown(boolean known) {
        this.known = known;
    }

    public double getFamiliarity() {
        return familiarity;
    }

    public void setFamiliarity(double familiarity) {
        this.familiarity = familiarity;
    }

    public List<String> getDescription() {
        return Description;
    }

    public void setDescription(List<String> description) {
        Description = description;
    }

    public String getRmName() {
        return rmName;
    }

    @Override
    public String getId() {
        return id;
    }
}
