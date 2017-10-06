package kurtslucas.com.exemplospinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner estado_civil = (Spinner) findViewById(R.id.spEstado);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.estado_civil,
                android.R.layout.simple_dropdown_item_1line);
        estado_civil.setAdapter(adapter);

        AdapterView.OnItemSelectedListener escolha = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = estado_civil.getSelectedItem().toString();
                Toast.makeText(getBaseContext(), "O item escolhido foi: " + item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        estado_civil.setOnItemSelectedListener(escolha);
    }
}
