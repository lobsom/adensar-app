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
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import br.com.adensar.adensar_mobile.model.Arvore;
import br.com.adensar.adensar_mobile.model.Especie;
import br.com.adensar.adensar_mobile.model.Fuste;
import br.com.adensar.adensar_mobile.model.ListEspecie;
import br.com.adensar.adensar_mobile.model.Singleton;

public class NovoEspecimeIdentificacaoActivity extends AppCompatActivity {
    /*Variáveis da Activity*/
    Button btEspecieNaoIdentificada;
    FloatingActionButton btnDesfazer;
    FloatingActionButton btnAdd;
    AutoCompleteTextView txtEspecie;
    EditText txtCap;
    TextView txtCapTotal;
    EditText txtAltura;
    Arvore arvore;
    int c = 1;
    String temp = "";
    ListEspecie especies;

    private Singleton singleton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_especime_identificacao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //obter o singleton
        singleton = Singleton.getInstance( );
        arvore = singleton.getArvore();

        especies = new ListEspecie();

        btEspecieNaoIdentificada = (Button) findViewById(R.id.btEspecieNaoIdentificada);
        txtCap = (EditText) findViewById(R.id.txtCap);
        txtCapTotal = (TextView) findViewById(R.id.txtCapTotal);
        txtAltura = (EditText) findViewById(R.id.txtAltura);
        btnAdd = (FloatingActionButton) findViewById(R.id.btnAdd);
        btnDesfazer = (FloatingActionButton) findViewById(R.id.btnDesfazer);



        //Teste
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, especies.ESPECIES);
        txtEspecie = findViewById(R.id.txtEspecime);
        txtEspecie.setAdapter(adapter);



        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //como chamar uma activity dinamicamente
        btEspecieNaoIdentificada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                singleton.setArvore(arvore);
                Intent intent = new Intent(getApplicationContext(), EspecieNaoIdentificadaCaracterizacaoActivity.class);
                startActivity(intent);
            }
        });


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
        try {
            arvore.setAltura(Float.parseFloat(txtAltura.getText().toString()));
        }catch (NumberFormatException e){
            Toast.makeText(this, "Favor Informar a altura!", Toast.LENGTH_LONG).show();
            return super.onOptionsItemSelected(item);
        }
            if (arvore.getFusteSize() <= 0){
                Toast.makeText(this, " Informe um valor de circunferência!", Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);
            }
           //arvore.setEspecie(especies.localizaEspecie(txtEspecie.getText().toString()));

            singleton.setArvore(arvore);


            // Handle item selection
            switch (item.getItemId()) {
                case R.id.nav_btAvancar:

                    Intent intent = new Intent(getApplicationContext(), NovoEspecimeAvaliacaoActivity.class);

                    startActivity(intent);
                    return true;

                default:
                    return super.onOptionsItemSelected(item);
            }

            /*if (especies.existeEspecie(txtEspecie.getText().toString()) == true){
                arvore.setEspecie(especies.localizaEspecie(txtEspecie.getText().toString()));
            }*/



    }

    public void onBtnRemClicked(View view) {

        arvore.remLastFuste();
        int carac = 0;
        carac = temp.lastIndexOf(" ");
        String b = temp.substring(0, temp.length() - (temp.length()-carac));
        temp = b;
        txtCapTotal.setText(temp);
        c--;
        if (arvore.getFusteSize() ==0 ){
            btnDesfazer.setVisibility(View.INVISIBLE);
            btnDesfazer.setClickable(false);
        }

    }

    public void onBtnAddClicked(View view) {
        try{
            if (Float.parseFloat(txtCap.getText().toString()) <= 0)
                Toast.makeText(this," Informe um valor de circunferência!", Toast.LENGTH_LONG).show();
            else{
                Fuste fuste = new Fuste();
                fuste.setnDelta(c);
                fuste.setCap(Float.parseFloat(txtCap.getText().toString()));
                arvore.addFuste(fuste);
                txtCap.setText("");
                temp = txtCapTotal.getText().toString()+ " " +Float.toString(fuste.getCap()) + ";";
                txtCapTotal.setText(temp);
                c++;
                if (arvore.getFusteSize() == 1 ){
                    btnDesfazer.setVisibility(View.VISIBLE);
                    btnDesfazer.setClickable(true);
                }
            }
        }catch (NumberFormatException e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }
}
