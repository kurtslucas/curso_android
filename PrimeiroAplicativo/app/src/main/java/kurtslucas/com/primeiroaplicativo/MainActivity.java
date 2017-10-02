package kurtslucas.com.primeiroaplicativo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button ok;
    private EditText texto;
    private String faixa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = (Button) findViewById(R.id.btnOk);
        texto = (EditText) findViewById(R.id.edtText);

        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int idade = 2017 - Integer.parseInt(texto.getText().toString());
        if (idade < 12)
            faixa = "criança";
        else if (idade < 18)
            faixa = "adolescente";
        else
            faixa = "adulto";

        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
        dlg.setMessage("Você é um(a) " + faixa);
        dlg.setNeutralButton("ok", null);
        dlg.show();
    }
}
