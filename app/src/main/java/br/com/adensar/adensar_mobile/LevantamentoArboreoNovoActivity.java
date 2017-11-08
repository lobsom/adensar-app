package br.com.adensar.adensar_mobile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LevantamentoArboreoNovoActivity extends AppCompatActivity {

    /*Variaveis Activity*/
    TextView trechoDesignado_id;
    TextView equipe_id;
    Button lebarb_choose;
    TextView txtTudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levantamento_arboreo_novo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        trechoDesignado_id = (TextView) findViewById(R.id.trechoDesignado_id);
        equipe_id = (TextView) findViewById(R.id.equipe_id);
        lebarb_choose = (Button) findViewById(R.id.lebarb_choose);
        txtTudo = (TextView) findViewById(R.id.txtTudo);

        SharedPreferences prefs = getSharedPreferences("REGISTRO", Context.MODE_PRIVATE);
        String restoredText = prefs.getString("arquivo", "Não encontrado");
        if (restoredText != null) {
            String texto = prefs.getString("arquivo", "Não encontrado");//"No name defined" is the default value.

            txtTudo.setText(restoredText);
        }


        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        lebarb_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), EscolherTipoRegistroActivity.class);
                startActivity(intent);
            }
        });

    }



}
