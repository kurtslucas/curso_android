package kurtslucas.com.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String msgRetorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText sPeso = (EditText) findViewById(R.id.edtPeso);
        final EditText sAltura = (EditText) findViewById(R.id.edtAltura);
        Button btnCalc = (Button) findViewById(R.id.btnCalcular);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float peso = Float.parseFloat(sPeso.getText().toString());
                float altura = Float.parseFloat(sAltura.getText().toString());
                float imc = peso / (altura * altura);

                if (imc < 17)
                    msgRetorno = "Muito abaixo do peso";
                else if (imc <= 18.49)
                    msgRetorno = "Abaixo do peso";
                else if (imc <= 24.99)
                    msgRetorno = "Peso normal";
                else if (imc <= 29.99)
                    msgRetorno = "Acima do peso";
                else if (imc <= 34.99)
                    msgRetorno = "Obesidade I";
                else if (imc <= 39.99)
                    msgRetorno = "Obesidade II (severa)";
                else if (imc >= 40)
                    msgRetorno = "Obesidade III (mórbida)";

                Toast.makeText(getApplicationContext(), String.valueOf(imc) + ": " + msgRetorno, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
