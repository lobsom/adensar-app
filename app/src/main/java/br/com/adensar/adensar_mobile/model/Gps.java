package br.com.adensar.adensar_mobile.model;




/**
 * Created by willian on 02/11/2017.
 */

public class Gps {

    private double latitude;
    private double longitude;

    public Gps() {
        this.latitude = 0;
        this.longitude = 0;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
