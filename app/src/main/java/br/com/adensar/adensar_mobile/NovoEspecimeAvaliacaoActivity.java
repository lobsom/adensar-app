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
import android.widget.EditText;
import android.widget.Spinner;

import br.com.adensar.adensar_mobile.model.Arvore;
import br.com.adensar.adensar_mobile.model.Singleton;

public class NovoEspecimeAvaliacaoActivity extends AppCompatActivity {

    /*Variáveis da Activity*/
    Spinner Fitossanidade_spinner_id;
    EditText txtObservacoes;
    EditText fitossanidade;

    Arvore arvore;
    private Singleton singleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_especime_avaliacao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Fitossanidade_spinner_id = (Spinner) findViewById(R.id.Fitossanidade_spinner_id);
        txtObservacoes = (EditText) findViewById(R.id.txtObservacoes);
        fitossanidade = (EditText) findViewById(R.id.fitossanidade);


        //obter o singleton
        singleton = Singleton.getInstance( );
        arvore = singleton.getArvore();

        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    /*Implementação da Navegação "Avançar" no header do APP*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_navegacao_avancar_app_header, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        arvore.setFitossanidade(fitossanidade.getText().toString());
        arvore.setObs(txtObservacoes.getText().toString());
        singleton.setArvore(arvore);
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_btAvancar:

                Intent intent = new Intent(getApplicationContext(), NovoEspecimeConfirmacaoActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
