package br.com.adensar.adensar_mobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class EspecieNaoIndentificadaFilotaxiaActivity extends AppCompatActivity {


    /*Variáveis da Activity*/
    RadioButton filotaxia_alternada_distica_id;
    RadioButton filotaxia_alternada_espiralada_id;
    RadioButton filotaxia_oposta_distica_id;
    RadioButton filotaxia_oposta_cruzada_id;
    RadioButton filotaxia_verticilada_id;
    RadioButton filotaxia_congesta_id;
    Button btConfirmaFilotaxia;
    Button btIncluiImagemFilotaxia;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especie_nao_indentificada_filotaxia);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        filotaxia_alternada_distica_id = (RadioButton) findViewById(R.id.filotaxia_alternada_distica_id);
        filotaxia_alternada_espiralada_id = (RadioButton) findViewById(R.id.filotaxia_alternada_espiralada_id);
        filotaxia_oposta_distica_id = (RadioButton) findViewById(R.id.filotaxia_oposta_distica_id);
        filotaxia_oposta_cruzada_id = (RadioButton) findViewById(R.id.filotaxia_oposta_cruzada_id);
        filotaxia_verticilada_id = (RadioButton) findViewById(R.id.filotaxia_verticilada_id);
        filotaxia_congesta_id = (RadioButton) findViewById(R.id.filotaxia_congesta_id);
        btConfirmaFilotaxia = (Button) findViewById(R.id.btConfirmaFilotaxia);
        btIncluiImagemFilotaxia = (Button) findViewById(R.id.btIncluiImagemFilotaxia);

        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //Implementação do Radio Button
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.filotaxia_alternada_distica_id:
                if (checked)
                    // Filotaxia Alternada Dística
                    break;
            case R.id.filotaxia_alternada_espiralada_id:
                if (checked)
                    // Filotaxia Alternada Espiralada
                    break;
            case R.id.filotaxia_oposta_distica_id:
                if (checked)
                    // Filotaxia Alternada Espiralada
                    break;
            case R.id.filotaxia_oposta_cruzada_id:
                if (checked)
                    // Filotaxia Oposta Cruzada
                    break;
            case R.id.filotaxia_verticilada_id:
                if (checked)
                    // Filotaxia Verticilada
                    break;
            case R.id.filotaxia_congesta_id:
                if (checked)
                    // Filotaxia Congesta
                    break;
        }
    }


}
