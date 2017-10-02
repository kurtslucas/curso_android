package kurtslucas.com.exemplotextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
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

        final TextView txt1 = (TextView) findViewById(R.id.txt1);
        final TextView txt2 = (TextView) findViewById(R.id.txt2);
        final TextView txt3 = (TextView) findViewById(R.id.txt3);

        Button btn = (Button) findViewById(R.id.btnMudar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setTextColor(Color.GREEN);
                txt2.setTextColor(Color.BLUE);
                txt3.setTextColor(Color.MAGENTA);
            }
        });
    }
}
