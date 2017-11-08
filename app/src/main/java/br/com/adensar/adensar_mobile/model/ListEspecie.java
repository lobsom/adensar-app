package br.com.adensar.adensar_mobile.model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by willian on 08/11/2017.
 */

public class ListEspecie {
    @SerializedName("listaEspecies")
    @Expose
    private ArrayList<Especie> listaEspecies = null;


    public ListEspecie(){
        listaEspecies = new ArrayList<>();
        Especie especieTemp = new Especie();

       /* listaEspecies.add(especieTemp);
        especieTemp.setNomeComum("Pinheiro");
        listaEspecies.add(especieTemp);
        especieTemp.setNomeCientifico("Salgueiro");
        listaEspecies.add(especieTemp);*/
        especieTemp.setCodEspecie(1);
        especieTemp.setNomeComum("abacateiro");
        especieTemp.setNomeCientifico("Persea americana L.");
        especieTemp.setFilotaxia("alternada_espiralada");
        especieTemp.setEspinhos("nao");
        especieTemp.setMargemFolha("inteira");

        listaEspecies.add(especieTemp);

        especieTemp.setCodEspecie(2);
        especieTemp.setNomeComum("acácia");
        especieTemp.setNomeCientifico("Acacia mangium");
        especieTemp.setFilotaxia("alterna");
        especieTemp.setEspinhos("nao");
        especieTemp.setMargemFolha("inteira");

        listaEspecies.add(especieTemp);
        especieTemp.setCodEspecie(3);
        especieTemp.setNomeComum("acerola");
        especieTemp.setNomeCientifico("Malpighia glabra L.");
        especieTemp.setFilotaxia("oposta_distica");
        especieTemp.setEspinhos("sim");
        especieTemp.setMargemFolha("crenada");

        listaEspecies.add(especieTemp);
    }

    public ArrayList<Especie> getListaEspecies() {
        return listaEspecies;
    }

    public void setListaEspecies(ArrayList<Especie> listaEspecies) {
        listaEspecies = listaEspecies;
    }

    public boolean existeEspecie(String nome){
        for (int i = 1; i <= listaEspecies.size(); i++)
            if((listaEspecies.get(i).getNomeCientifico() == nome) || (listaEspecies.get(i).getNomeComum() == nome))
                return true;
        return false;
    }
    public Especie localizaEspecie(String nome){
        int i = 1;
        do{
            i++;
        }while (listaEspecies.get(i).getNomeComum() != nome);

        return listaEspecies.get(i);
    }
    //nome comum e nome cientifico das especies cadastradas
    public static final String[] ESPECIES = new String[] {
            "acerola", "acácia", "abacateiro"
    };

}
