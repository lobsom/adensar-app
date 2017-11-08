package br.com.adensar.adensar_mobile.model;

import java.util.Calendar;

/**
 * Created by willian on 02/11/2017.
 */

//Classe criada para a facil manipulação do tipo data no sistema

public class Registro {

    protected Calendar dataRegistro;

    public Calendar getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro() {
        this.dataRegistro = Calendar.getInstance();
    }
}
