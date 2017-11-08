package br.com.adensar.adensar_mobile.model;

/**
 * Created by willian on 02/11/2017.
 */

public class Coleta extends Registro{

    //Classe que implementa o GPS para a coleta de APP e ARVORE

    protected Gps gps;

    public void setLat(double lat){
        gps.setLatitude(lat);
    }
    public void setLon(double lon){
        gps.setLongitude(lon);
    }
    public double getLat() {
        return gps.getLatitude();
    }
    public double getLon() {
        return gps.getLongitude();
    }

    public void setGps(double lat, double lon) {
        gps.setLatitude(lat);
        gps.setLongitude(lon);
    }
}
