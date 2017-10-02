package kurtslucas.com.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener{

    private ImageView imagem;
    private int[] imagens = {R.drawable.goku, R.drawable.goku2};
    private int cont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = (ImageView) findViewById(R.id.img1);
        final Button btn = (Button) findViewById(R.id.btnTrocar);
        cont = 1;
        btn.setOnClickListener(this);
    }

    public void onClick(View v) {
        imagem.setImageResource(imagens[cont]);
        if (cont == 0)
            cont = 1;
        else
            cont = 0;
    }
}
