package br.com.adensar.adensar_mobile.model;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by willian on 02/11/2017.
 */

public class Arvore extends Coleta{

    private int placa;

    private boolean app;

    private String fitossanidade;

    private float altura;

    private double volume;

    private String obs;

    private boolean nId;

    private ArrayList<Fuste> fuste;

    private Especie especie;

    public Arvore() {
        this.placa = 0;
        this.app = false;
        this.fitossanidade = "";
        this.volume = 0;
        this.altura = 0f;
        this.obs ="";
        this.nId = false;
        this.especie = new Especie();
        this.gps = new Gps();
        this.fuste = new ArrayList<>();
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public boolean isApp() {
        return app;
    }

    public void setApp(boolean app) {
        this.app = app;
    }

    public String getFitossanidade() {
        return fitossanidade;
    }

    public void setFitossanidade(String fitossanidade) {
        this.fitossanidade = fitossanidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public double getVolume() {
        calcVolume();
        return volume;
    }

    public boolean isnId() {
        return nId;
    }

    public void setnId(boolean nId) {
        this.nId = nId;
    }


    public ArrayList<Fuste> getFuste() {
        return fuste;
    }

    public Fuste getFuste(int i) {
        return fuste.get(i);
    }

    public int getFusteSize (){
        return fuste.size();
    }

    public void addFuste(Fuste fuste) {
        this.fuste.add(fuste);
    }

    public void remLastFuste() {
        this.fuste.remove(this.fuste.size() - 1);
    }

    public String fustes() {
        String f = "";
        for (int i = 1;i<= this.fuste.size();i++){
            f = Float.toString(this.fuste.get(i).getCap()) + "; ";
        }
        return f;
    }


    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    private void calcVolume() {

        Fuste fuste;
        double parcial = 0;

        for (int i = 0; i< this.fuste.size(); i++){
            fuste = this.fuste.get(i);
            parcial += (Math.PI*(Math.pow(fuste.getDap()/2,2))/40000);
        }
        volume = (parcial*altura)*0.5218;
    }

}