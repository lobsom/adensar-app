package br.com.adensar.adensar_mobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class EspecieNaoIndentificadaEspinhosActivity extends AppCompatActivity {

    /*Variáveis Activity*/
    RadioButton espinhos_sim_id;
    EditText txtEspinhosDetalhes_id;
    TextView espinhos_observacao_id;
    Button btIncluiImagemEspinho;

    RadioButton aculeos_sim_id;
    EditText txtAculeoDetalhes_id;
    TextView aculeos_observacao_id;
    Button btIncluiImagemAculeo;

    Button btConfirmaEspinho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especie_nao_indentificada_espinhos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        espinhos_sim_id = (RadioButton) findViewById(R.id.espinhos_sim_id);
        txtEspinhosDetalhes_id = (EditText) findViewById(R.id.txtEspinhosDetalhes_id);
        espinhos_observacao_id = (TextView) findViewById(R.id.espinhos_observacao_id);
        btIncluiImagemEspinho = (Button) findViewById(R.id.btIncluiImagemEspinho);

        aculeos_sim_id = (RadioButton) findViewById(R.id.aculeos_sim_id);
        txtAculeoDetalhes_id = (EditText) findViewById(R.id.txtAculeoDetalhes_id);
        aculeos_observacao_id = (TextView) findViewById(R.id.aculeos_observacao_id);
        btIncluiImagemAculeo = (Button) findViewById(R.id.btIncluiImagemAculeo);

        btConfirmaEspinho = (Button) findViewById(R.id.btConfirmaEspinho);

        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    //Implementação do Radio Button Presença Espinho
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.espinhos_sim_id:
                if (checked)
                    // Presença de Espinhos
                    break;
        }

    }

    //Implementação do Radio Button Presença Aculeo
    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.aculeos_sim_id:
                if (checked)
                    // Presença de Aculeos
                    break;
        }

    }


}

