package br.com.adensar.adensar_mobile.model;

/**
 * Created by willian on 02/11/2017.
 */

public class App extends Coleta{

    private String entorno;
    private String vegetacao;
    private String tipoApp;
    private String fatorDegradacao;
    private String especieInvasora;
    private String obs;

    //Constructor
    public App() {
        entorno = "";
        vegetacao = "";
        tipoApp = "";
        fatorDegradacao = "";
        especieInvasora = "";
        obs = "";

    }

    public String getEntorno() {
        return entorno;
    }

    public void setEntorno(String entorno) {
        this.entorno = entorno;
    }

    public String getVegetacao() {
        return vegetacao;
    }

    public void setVegetacao(String vegetacao) {
        this.vegetacao = vegetacao;
    }

    public String getTipoApp() {
        return tipoApp;
    }

    public void setTipoApp(String tipoApp) {
        this.tipoApp = tipoApp;
    }

    public String getFatorDegradacao() {
        return fatorDegradacao;
    }

    public void setFatorDegradacao(String fatorDegradacao) {
        this.fatorDegradacao = fatorDegradacao;
    }

    public String getEspecieInvasora() {
        return especieInvasora;
    }

    public void setEspecieInvasora(String especieInvasora) {
        this.especieInvasora = especieInvasora;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
