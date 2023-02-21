package es.udc.psi;

import static android.content.Intent.ACTION_SEND;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static String KEY_TEXT_ENVIO = "klalalalakja";
    Button but_compartir;
    Button but_continuar;
    EditText et_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.et_Name);
        but_compartir = findViewById(R.id.button_compartir);
        but_compartir.setOnClickListener(this);

        but_continuar = findViewById(R.id.button_continuar);
        but_continuar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String texto = et_name.getText().toString();
        if(texto.isEmpty()){
            Toast.makeText(getApplicationContext(),R.string.emptyText, Toast.LENGTH_SHORT).show();
        }
        if (v==but_compartir){
            Intent intentSend = new Intent(ACTION_SEND);
            intentSend.setType("text/plain");
            intentSend.putExtra(Intent.EXTRA_TEXT,texto);
            startActivity(intentSend);
        }
        else if (v==but_continuar){
            Intent intent = new Intent(this, segunda_actividad.class);
            //intent.putExtra(Intent.EXTRA_TEXT,texto); En la linea de abajo un ejemplo para hacerlo de otra manera
            intent.putExtra(KEY_TEXT_ENVIO,texto);
            startActivity(intent);
        }
    }


}