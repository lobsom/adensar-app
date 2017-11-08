package br.com.adensar.adensar_mobile.model;

import java.util.Calendar;

/**
 * Created by willian on 02/11/2017.
 */

public class Equipe {

    private int codEquipe;

    private int codProjeto;

    //no ato do login o servidor informa se a equipe está autorizada a seguir com o levantamento (implementação futura)
    private boolean autorizacao;

    public int getCodEquipe() {
        return codEquipe;
    }

    public void setCodEquipe(int codEquipe) {
        this.codEquipe = codEquipe;
    }

    public int getCodProjeto() {
        return codProjeto;
    }

    public void setCodProjeto(int codProjeto) {
        this.codProjeto = codProjeto;
    }

    public boolean getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(boolean autorizacao) {
        this.autorizacao = autorizacao;
    }
}
