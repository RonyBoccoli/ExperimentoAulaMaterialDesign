package br.digitalhourse.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Button botaocupom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        botaocupom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cupom aplicado com Sucesso", Toast.LENGTH_LONG);

            }
        });
    }

    public void init(){
        botaocupom = findViewById(R.id.botaocupom);
    }
}
