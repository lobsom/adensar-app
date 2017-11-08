package br.com.adensar.adensar_mobile.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Calendar;
import java.util.Collection;

/**
 * Created by willian on 02/11/2017.
 */

public class Especie extends Registro{

    private boolean eNId;

    @SerializedName("codEspecie")
    @Expose
    private int codEspecie;
    @SerializedName("nomeComum")
    @Expose
    private String nomeComum;
    @SerializedName("nomeCientifico")
    @Expose
    private String nomeCientifico;
    @SerializedName("filotaxia")
    @Expose
    private String filotaxia;
    @SerializedName("espinhos")
    @Expose
    private String espinhos;
    @SerializedName("margemFolha")
    @Expose
    private String margemFolha;

    public Especie() {
        this.codEspecie = 0;
        this.nomeComum = "Default";
        this.nomeCientifico = "Defaultus Default";
        this.filotaxia = "zero";
        this.espinhos = "zero";
        this.margemFolha = "zero";
        this.eNId = false;
    }

    public int getCodEspecie() {
        return codEspecie;
    }

    public void setCodEspecie(int codEspecie) {
        this.codEspecie = codEspecie;
    }

    public String getNomeComum() {
        return nomeComum;
    }

    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getFilotaxia() {
        return filotaxia;
    }

    public void setFilotaxia(String filotaxia) {
        this.filotaxia = filotaxia;
    }

    public String getEspinhos() {
        return espinhos;
    }

    public void setEspinhos(String espinhos) {
        this.espinhos = espinhos;
    }

    public String getMargemFolha() {
        return margemFolha;
    }

    public void setMargemFolha(String margemFolha) {
        this.margemFolha = margemFolha;
    }

    public boolean iseNId() {
        return eNId;
    }

    public void seteNId(boolean eNId) {
        this.eNId = eNId;
    }
}
