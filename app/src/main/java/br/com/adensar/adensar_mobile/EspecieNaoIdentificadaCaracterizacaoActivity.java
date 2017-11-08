package br.com.adensar.adensar_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class EspecieNaoIdentificadaCaracterizacaoActivity extends AppCompatActivity {

    /*Variáveis da Activity*/
    Button btFilotaxia;
    Button btEspinho;
    Button btFolha;
    Button btFolhaMargem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especie_nao_identificada_caracterizacao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //chamar activity FILOTAXIA dinamicamente
        btFilotaxia = (Button) findViewById(R.id.enid_filotaxia);
        btFilotaxia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), EspecieNaoIndentificadaFilotaxiaActivity.class);
                startActivity(intent);
            }
        });

        // chamar activity ESPINHOS dinamicamente
        btEspinho = (Button) findViewById(R.id.enid_espinho);
        btEspinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), EspecieNaoIndentificadaEspinhosActivity.class);
                startActivity(intent);
            }
        });

        // chamar activity FOLHA dinamicamente
        btFolha = (Button) findViewById(R.id.enid_folha);
        btFolha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), EspecieNaoIndentificadaFolhaActivity.class);
                startActivity(intent);
            }
        });

        // chamar activity FOLHA MARGEM dinamicamente
        btFolhaMargem = (Button) findViewById(R.id.enid_folha_margem);
        btFolhaMargem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), EspecieNaoIndentificadaFolhaMargemActivity.class);
                startActivity(intent);
            }
        });
    }
}
