package com.mrvn.ejemploclase_23_agosto;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView label3;
    private TextView label4;
    private Button boton1;
    //private Button boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //iniciando variables
        this.label3 = findViewById(R.id.label1);
        this.label4 = findViewById(R.id.label2);
        this.boton1 = findViewById(R.id.boton1);
        //this.boton2 = findViewById(R.id.boton2);

        //Metodo (1)
        this.boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creamos intent
                Intent frmCheck = new Intent(MainActivity.this, ActivityBoton1.class);
                startActivity(frmCheck);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        //validamos que tecla preciono el usuario
        if (event.KEYCODE_C == keyCode){
            this.label3.setTextColor(Color.BLUE);
            this.label3.setText("Programacion");
            this.label4.setTextColor(Color.RED);
            this.label4.setText("Agosto");

        }
        return false;
    }
    public void onClick(View v){
        //creamos intent
        Intent frmCheck = new Intent(this, ActivityBoton2.class);
        startActivity(frmCheck);

    }

}
