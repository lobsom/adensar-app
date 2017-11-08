package br.com.adensar.adensar_mobile;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levantamento_arboreo_novo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        trechoDesignado_id = (TextView) findViewById(R.id.trechoDesignado_id);
        equipe_id = (TextView) findViewById(R.id.equipe_id);
        lebarb_choose = (Button) findViewById(R.id.lebarb_choose);


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
