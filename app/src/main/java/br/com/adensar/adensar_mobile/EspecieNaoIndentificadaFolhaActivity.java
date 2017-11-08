package br.com.adensar.adensar_mobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class EspecieNaoIndentificadaFolhaActivity extends AppCompatActivity {

    /*Variáveis Activity*/
    RadioButton folha_tipo_bifoliolada_id;
    RadioButton folha_tipo_trifoliolada_id;
    RadioButton folha_tipo_digitada_id;
    RadioButton folha_tipo_palmada_id;
    RadioButton folha_tipo_pinada_id;
    RadioButton folha_tipo_paripinada_id;
    RadioButton folha_tipo_imparipinada_id;
    RadioButton folha_tipo_bipinada_id;
    Button btConfirmaFolha;
    Button btIncluiImagemFolha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especie_nao_indentificada_folha);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        folha_tipo_bifoliolada_id = (RadioButton) findViewById(R.id.folha_tipo_bifoliolada_id);
        folha_tipo_trifoliolada_id = (RadioButton) findViewById(R.id.folha_tipo_trifoliolada_id);
        folha_tipo_digitada_id = (RadioButton) findViewById(R.id.folha_tipo_digitada_id);
        folha_tipo_palmada_id = (RadioButton) findViewById(R.id.folha_tipo_palmada_id);
        folha_tipo_pinada_id = (RadioButton) findViewById(R.id.folha_tipo_pinada_id);
        folha_tipo_paripinada_id = (RadioButton) findViewById(R.id.folha_tipo_paripinada_id);
        folha_tipo_imparipinada_id = (RadioButton) findViewById(R.id.folha_tipo_imparipinada_id);
        folha_tipo_bipinada_id = (RadioButton) findViewById(R.id.folha_tipo_bipinada_id);
        btConfirmaFolha = (Button) findViewById(R.id.btConfirmaFolha);
        btIncluiImagemFolha = (Button) findViewById(R.id.btIncluiImagemFolha);


        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


/*
    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
    }

    //Implementação do Radio Button
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.folha_tipo_bifoliolada_id:
                if (checked)
                    // Folha Bifoliada
                    break;
            case R.id.folha_tipo_trifoliolada_id:
                if (checked)
                    // Folha Trifoliada
                    break;
            case R.id.folha_tipo_digitada_id:
                if (checked)
                    // Folha Digitada
                    break;
            case R.id.folha_tipo_palmada_id:
                if (checked)
                    // Folha Palmada
                    break;
            case R.id.folha_tipo_pinada_id:
                if (checked)
                    // Folha Pinada
                    break;
            case R.id.folha_tipo_paripinada_id:
                if (checked)
                    // Folha Parapinada
                    break;
            case R.id.folha_tipo_imparipinada_id:
                if (checked)
                    // Folha Imparapinada
                    break;
            case R.id.folha_tipo_bipinada_id:
                if (checked)
                    // Folha Bipinada
                    break;
        }
    }



}
