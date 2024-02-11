package tr.gov.enerji.uygulama9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextUzunluk = findViewById(R.id.editTextUzunluk);
        Button buttonUcgen = findViewById(R.id.buttonUcgen);
        Button buttonKare = findViewById(R.id.buttonKare);
        TextView textViewCevre = findViewById(R.id.textViewCevre);
        buttonUcgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer uzunluk = Integer.parseInt(editTextUzunluk.getText().toString());
                Ucgen ucgen = new Ucgen(uzunluk);
                Integer cevre = ucgen.cevre();
                textViewCevre.setText(cevre.toString());
            }
        });
        buttonKare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer uzunluk = Integer.parseInt(editTextUzunluk.getText().toString());
                Kare kare = new Kare(uzunluk);
                Integer cevre = kare.cevre();
                textViewCevre.setText(cevre.toString());
            }
        });
    }
}