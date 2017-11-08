package br.com.adensar.adensar_mobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.com.adensar.adensar_mobile.R;

public class LevantamentoArboreoRetomarActivity extends AppCompatActivity {

    /*Variaveis Activity*/
    TextView especimesLocalizados_id;
    TextView appLocalizado_id;
    TextView trechoDesignado_id;
    TextView equipe_id;
    Button levarb_finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levantamento_arboreo_retomar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        especimesLocalizados_id = (TextView) findViewById(R.id.especimesLocalizados_id);
        appLocalizado_id = (TextView) findViewById(R.id.appLocalizado_id);
        trechoDesignado_id = (TextView) findViewById(R.id.trechoDesignado_id);
        equipe_id = (TextView) findViewById(R.id.equipe_id);
        levarb_finish = (Button) findViewById(R.id.levarb_finish);


    }

}
