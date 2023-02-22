package es.udc.psi;

import static es.udc.psi.MainActivity.KEY_TEXT_ENVIO;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class segunda_actividad extends AppCompatActivity {

    TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_actividad);

        text_view = findViewById(R.id.text_view);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String text = bundle.getString(KEY_TEXT_ENVIO);
            text_view.setText(text);
        }
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(Activity.RESULT_OK, new Intent().putExtra("button_text", "Botón 1"));
                finish();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(Activity.RESULT_OK, new Intent().putExtra("button_text", "Botón 2"));
                finish();
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(Activity.RESULT_OK, new Intent().putExtra("button_text", "Botón 3"));
                finish();
            }
        });
    }
}
