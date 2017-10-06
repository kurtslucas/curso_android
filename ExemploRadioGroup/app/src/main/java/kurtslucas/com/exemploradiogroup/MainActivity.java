package kurtslucas.com.exemploradiogroup;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton masc;
    private RadioButton fem;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masc = (RadioButton) findViewById(R.id.rbMasc);
        fem = (RadioButton) findViewById(R.id.rbFem);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        String sexo = "";
        if (masc.isChecked()){
            sexo = "Masculino";
        }
        if (fem.isChecked()){
            sexo = "Feminino";
        }
        Toast.makeText(getApplicationContext(), "Sexo: " + sexo, Toast.LENGTH_SHORT).show();
    }
}
