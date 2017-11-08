package br.com.adensar.adensar_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import br.com.adensar.adensar_mobile.model.App;
import br.com.adensar.adensar_mobile.model.Arvore;
import br.com.adensar.adensar_mobile.model.Singleton;

public class MainActivity extends AppCompatActivity {

    private Singleton singleton;

    private App auxApp;
    private Arvore auxArvore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("MainActivity","onCreate....");

        //obter um sigleton
        singleton = Singleton.getInstance( );

        //criar uma instancia do objet arvore, para setting do valores nas activity seguinte;
        //para recuperar o objet arvover, observar como foi feito na Activity NovoEspecimeConfirmacaoActivity, linha do toast...
        auxArvore = new Arvore();
        singleton.setArvore(auxArvore);

        //como chamar uma activity dinamicamente
        Button button = (Button) findViewById(R.id.btLevarb_begin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), LevantamentoArboreoNovoActivity.class);
                startActivity(intent);
            }
        });



    }
}
