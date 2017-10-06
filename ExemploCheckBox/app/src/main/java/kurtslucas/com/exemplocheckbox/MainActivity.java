package kurtslucas.com.exemplocheckbox;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox sms;
    private CheckBox email;
    private CheckBox fone;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sms = (CheckBox) findViewById(R.id.ckSMS);
        email = (CheckBox) findViewById(R.id.ckEmail);
        fone = (CheckBox) findViewById(R.id.ckTelefone);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        String msg = "Os itens marcados foram: ";
        if (sms.isChecked())
            msg += "SMS ";
        if (email.isChecked())
            msg += "Email ";
        if (fone.isChecked())
            msg += "Tefefone ";
        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
        dlg.setMessage(msg);
        dlg.setNeutralButton("btnOk", null);
        dlg.show();
    }
}
