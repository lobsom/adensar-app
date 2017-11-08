package br.com.adensar.adensar_mobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class EspecieNaoIndentificadaFolhaMargemActivity extends AppCompatActivity {

    /*Variáveis Activity*/
    RadioButton folha_margem_inteira_id;
    RadioButton folha_margem_bilobada_id;
    RadioButton folha_margem_crenada_id;
    RadioButton folha_margem_dentada_id;
    RadioButton folha_margem_espinhosa_id;
    RadioButton folha_margem_fendida_id;
    RadioButton folha_margem_laciniada_id;
    RadioButton folha_margem_lobada_id;
    RadioButton folha_margem_ondulada_id;
    RadioButton folha_margem_revoluta_id;
    RadioButton folha_margem_serreada_id;
    RadioButton folha_margem_trilobada_id;
    RadioButton folha_margem_tetralobada_id;

    Button btConfirmaFolhaMargem;
    Button btIncluiImagemFolhaMargem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especie_nao_indentificada_folha_margem);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        folha_margem_inteira_id = (RadioButton) findViewById(R.id.folha_margem_inteira_id);
        folha_margem_bilobada_id = (RadioButton) findViewById(R.id.folha_margem_bilobada_id);
        folha_margem_crenada_id = (RadioButton) findViewById(R.id.folha_margem_crenada_id);
        folha_margem_dentada_id = (RadioButton) findViewById(R.id.folha_margem_dentada_id);
        folha_margem_espinhosa_id = (RadioButton) findViewById(R.id.folha_margem_espinhosa_id);
        folha_margem_fendida_id = (RadioButton) findViewById(R.id.folha_margem_fendida_id);
        folha_margem_laciniada_id = (RadioButton) findViewById(R.id.folha_margem_laciniada_id);
        folha_margem_lobada_id = (RadioButton) findViewById(R.id.folha_margem_lobada_id);
        folha_margem_ondulada_id = (RadioButton) findViewById(R.id.folha_margem_ondulada_id);
        folha_margem_revoluta_id = (RadioButton) findViewById(R.id.folha_margem_revoluta_id);
        folha_margem_serreada_id = (RadioButton) findViewById(R.id.folha_margem_serreada_id);
        folha_margem_trilobada_id = (RadioButton) findViewById(R.id.folha_margem_trilobada_id);
        folha_margem_tetralobada_id = (RadioButton) findViewById(R.id.folha_margem_tetralobada_id);


        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //Implementação do Radio Button
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.folha_margem_inteira_id:
                if (checked)
                    // Margem Inteira
                    break;
            case R.id.folha_margem_bilobada_id:
                if (checked)
                    // Margem Bifoliada
                    break;
            case R.id.folha_margem_crenada_id:
                if (checked)
                    // Margem Crenada
                    break;
            case R.id.folha_margem_dentada_id:
                if (checked)
                    // Margem Dentada
                    break;
            case R.id.folha_margem_espinhosa_id:
                if (checked)
                    // Margem Espinhosa
                    break;
            case R.id.folha_margem_fendida_id:
                if (checked)
                    // Margem Fendida
                    break;
            case R.id.folha_margem_laciniada_id:
                if (checked)
                    // Margem Lacinada
                    break;
            case R.id.folha_margem_lobada_id:
                if (checked)
                    // Margem Lobada
                    break;
            case R.id.folha_margem_ondulada_id:
                if (checked)
                    // Margem Ondulada
                    break;
            case R.id.folha_margem_revoluta_id:
                if (checked)
                    // Margem Revoluta
                    break;
            case R.id.folha_margem_serreada_id:
                if (checked)
                    // Margem Serreada
                    break;
            case R.id.folha_margem_trilobada_id:
                if (checked)
                    // Margem Trilobada
                    break;
            case R.id.folha_margem_tetralobada_id:
                if (checked)
                    // Margem Tetralobada
                    break;
        }
    }



}

