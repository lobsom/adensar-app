package br.com.adensar.adensar_mobile.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeans on 07/11/17.
 */

public class Singleton  {

    private static Singleton INSTANCE = new Singleton();

    // other instance variables can be here

    private App app;

    private Arvore arvore;

    private List<Arvore> arvores = new ArrayList<Arvore>();

    private Singleton() {};

    public static Singleton getInstance() {
        return(INSTANCE);
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public Arvore getArvore() {
        return arvore;
    }

    public void setArvore(Arvore arvore) {
        this.arvore = arvore;
    }

    public List<Arvore> getArvores (){
        return this.arvores;
    }
    public void addArvore(Arvore arvore){
        arvores.add(arvore);

    }

    // other instance methods can follow
}