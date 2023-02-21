package es.udc.psi;

import static es.udc.psi.MainActivity.KEY_TEXT_ENVIO;

import android.os.Bundle;
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
            //String text = bundle.getString(KEY_TEXT_ENVIO, getString(R.string.default_text)); Esto valdria si se crea el recurso default_text
            text_view.setText(text);
        }

    }

}
