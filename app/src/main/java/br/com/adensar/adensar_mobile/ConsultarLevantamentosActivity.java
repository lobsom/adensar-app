package br.com.adensar.adensar_mobile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import br.com.adensar.adensar_mobile.model.Arvore;
import br.com.adensar.adensar_mobile.model.Especie;
import br.com.adensar.adensar_mobile.model.Singleton;

public class ConsultarLevantamentosActivity extends AppCompatActivity {

    /*Variaveis Activity*/
    TextView placa;
    TextView txtEspecime;
    TextView fuste_id;
    TextView fitossanidade_id;
    TextView txtObservacoes;
    Button levarb_confirmaRegistro;
    Button levarb_cancelarRegistro;

    Arvore arvore;
    Especie especie;

    private Singleton singleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_especime_confirmacao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //obter o singleton
        singleton = Singleton.getInstance();

        arvore = singleton.getArvore();

        Toast.makeText(this, "Valor da placa: " + singleton.getArvore().getPlaca(),Toast.LENGTH_LONG).show();


        Log.d("NovoEspecimeConfirmacao", "Valor da placa: " + singleton.getArvore().getPlaca());


        placa = (TextView) findViewById(R.id.placa);
        txtEspecime = (TextView) findViewById(R.id.txtEspecime);
        fuste_id = (TextView) findViewById(R.id.fuste_id);
        fitossanidade_id = (TextView) findViewById(R.id.fitossanidade_id);
        txtObservacoes = (TextView) findViewById(R.id.txtObservacoes);
        levarb_confirmaRegistro = (Button) findViewById(R.id.levarb_confirmaRegistro);
        levarb_cancelarRegistro = (Button) findViewById(R.id.levarb_cancelarRegistro);

        placa.setText(Integer.toString(singleton.getArvore().getPlaca()));
        fuste_id.setText(Integer.toString(singleton.getArvore().getFusteSize()));
        fitossanidade_id.setText(singleton.getArvore().getFitossanidade());
        txtObservacoes.setText(singleton.getArvore().getObs());
        txtEspecime.setText(singleton.getArvore().getEspecie().getNomeCientifico().toString());

        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void onBtnConfClicked(View view) {
        //adicionar na lista de arvores o objeto arvores com os valores já avaliador pelo usuário;
        singleton.getArvores().add(singleton.getArvore());

        //so para log do json do objeto
        Gson gson = new Gson();
        String userJSONString = gson.toJson(singleton.getArvores());
        SharedPreferences.Editor editor = getSharedPreferences("REGISTRO", MODE_PRIVATE).edit();
        editor.putString("YOURKEY",userJSONString  );
        editor.commit();

        Log.d("Gson", "tree JSON String: "+userJSONString);



//        //criar uma nova instacia da arvore para uma nova avaliaçao
//        auxArvore = new Arvore();
//        singleton.setArvore(auxArvore);


        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void onBtnCancClicked(View view) {
    }

}
