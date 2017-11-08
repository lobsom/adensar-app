package br.com.adensar.adensar_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class EscolherTipoRegistroActivity extends AppCompatActivity {

    /*Variaveis Activity*/
    Button registrar_arvore_id;
    Button registrar_app_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_tipo_registro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        registrar_arvore_id = (Button) findViewById(R.id.registrar_arvore_id);
        registrar_app_id = (Button) findViewById(R.id.registrar_app_id);

        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //como chamar uma activity dinamicamente
        Button registrar_arvore = (Button) findViewById(R.id.registrar_arvore_id);
        registrar_arvore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), NovoEspecimeDadosBaseActivity.class);
                startActivity(intent);
            }
        });

        //como chamar uma activity dinamicamente
        Button registrar_app = (Button) findViewById(R.id.registrar_app_id);
        registrar_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), RegistrarAppActivity.class);
                startActivity(intent);
            }
        });
    }

}
