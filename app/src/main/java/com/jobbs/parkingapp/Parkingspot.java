package com.jobbs.parkingapp;

public class Parkingspot {
    private int id;
    private int occ;

    public Parkingspot(){

    }
    public Parkingspot(int id, int occ) {
        this.id = id;
        this.occ = occ;
    }

    public int getOcc() {
        return occ;
    }

    public void setOcc(int occ) {
        this.occ = occ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
