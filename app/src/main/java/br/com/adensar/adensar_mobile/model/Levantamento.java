package br.com.adensar.adensar_mobile.model;

import java.util.Calendar;

/**
 * Created by willian on 02/11/2017.
 */

public class Levantamento {

    private int codLev;

    private Calendar dataAbertura;

    private Calendar dataConclusao;

    private Equipe equipe;

    public int getCodLev() {
        return codLev;
    }

    public void setCodLev(int codLev) {
        this.codLev = codLev;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura() {
        this.dataAbertura = Calendar.getInstance();
    }

    public Calendar getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao() {
        this.dataConclusao = Calendar.getInstance();
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
