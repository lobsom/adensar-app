package br.com.adensar.adensar_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.widget.Toast;

import br.com.adensar.adensar_mobile.model.Arvore;
import br.com.adensar.adensar_mobile.model.Singleton;

public class NovoEspecimeDadosBaseActivity extends AppCompatActivity {

    EditText placa;
    CheckBox app;
    FloatingActionButton btnGps;
    TextView txtGPS;
    Arvore arvore;

    private Singleton singleton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_especime_dados_base);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //obter o singleton
        singleton = Singleton.getInstance( );
        arvore = singleton.getArvore();


        txtGPS = (TextView) findViewById(R.id.gps);
        txtGPS.setText("Selecione a localização...");
        btnGps = (FloatingActionButton) findViewById(R.id.btnGps);
        placa = (EditText) findViewById(R.id.placa);
        app = (CheckBox) findViewById(R.id.chkArvoreEmApp);

        this.placa.setText(Integer.toString(arvore.getPlaca()),TextView.BufferType.EDITABLE);

        //inserir suporte para menu navegacao
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }



    private void pedirPermissoes() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        }
        else
            configurarServico();
    }

    public void configurarServico(){
        try {

            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

            LocationListener locationListener = new LocationListener() {
                public void onLocationChanged(Location location) {atualizar(location);
                }

                public void onStatusChanged(String provider, int status, Bundle extras) { }

                public void onProviderEnabled(String provider) { }

                public void onProviderDisabled(String provider) { }
            };
            locationManager.requestSingleUpdate(LocationManager.GPS_PROVIDER,locationListener, Looper.myLooper());
       }catch(SecurityException ex){
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }



    public void atualizar(Location location)
    {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        txtGPS.setText(latitude+", "+ longitude);
        arvore.setGps(latitude, longitude);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    configurarServico();
                } else {
                    Toast.makeText(this, "O GPS não será coletado!", Toast.LENGTH_LONG).show();
                }
                return;
            }
        }
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
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_btAvancar:


                Intent intent = new Intent(getApplicationContext(), NovoEspecimeIdentificacaoActivity.class);

                //necessário tratativa de erros
                arvore.setPlaca(Integer.parseInt(placa.getText().toString()));
                singleton.setArvore(arvore);

                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void onCheckboxClicked(View view) {
        arvore.setApp(app.isChecked());
    }

    public void onBtnClicked(View view) {

        Toast.makeText(this," Aguarde enquanto o gps é coletado!", Toast.LENGTH_LONG).show();
        txtGPS.setText("Buscando a localização...");
        pedirPermissoes();
    }
}
