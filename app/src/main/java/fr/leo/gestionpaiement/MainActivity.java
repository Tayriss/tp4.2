package fr.leo.gestionpaiement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fr.leo.gestionpaiement.R;
import fr.leo.gestionpaiement.ui.main.CarteBleu;
import fr.leo.gestionpaiement.ui.main.Paypal;

public class MainActivity extends AppCompatActivity {
    Button paiementCarte;
    Button paiementPaypal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        paiementCarte = findViewById(R.id.buttonCarte);
        paiementPaypal = findViewById(R.id.buttonPaypal);

        paiementCarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, CarteBleu.newInstance())
                        .commitNow();
            }
        });

        paiementPaypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, Paypal.newInstance())
                        .commitNow();
            }
        });
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CarteBleu.newInstance())
                    .commitNow();
        }
    }

}