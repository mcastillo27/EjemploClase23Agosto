package com.mrvn.ejemploclase_23_agosto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class ActivityBoton1 extends AppCompatActivity {

    //declaracion
    private CheckBox Check1;
    private CheckBox Check2;
    private CheckBox Check3;
    private boolean Check_1 = false;
    private boolean Check_2 = false;
    private boolean Check_3 = false;
    private String mensaje= "Se selecciono: \n";
    private int Opciones =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton1);

        this.Check1 = findViewById(R.id.checkBox2);
        this.Check2 = findViewById(R.id.checkBox3);
        this.Check3 = findViewById(R.id.checkBox4);

        //creamos listener para los check
        this.Check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                //Asignamos valor del check
                Check_1 = isChecked;
                if (isChecked) {
                    ActivityBoton1.this.Opciones++;
                }else{
                    ActivityBoton1.this.Opciones--;
                }
            }
        });
        this.Check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                //Asignamos valor del check
                Check_2 = isChecked;
                if (isChecked) {
                    ActivityBoton1.this.Opciones++;
                }else{
                    ActivityBoton1.this.Opciones--;
                }
            }
        });
        this.Check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                //Asignamos valor del check
                Check_3 = isChecked;
                if (isChecked) {
                    ActivityBoton1.this.Opciones++;
                }else{
                    ActivityBoton1.this.Opciones--;
                }
            }
        });
    }
    public void OnclickProcesar(View v){
        //validamos opciones seleccionadas
        if (Check_1) this.mensaje+= " - Opcion Check1 \n";
        if (Check_2) this.mensaje+= " - Opcion Check2 \n";
        if (Check_3) this.mensaje+= " - Opcion Check3 \n";
        //validamos si no selecciono
        if (Opciones>0){
            Toast.makeText(this, this.mensaje, Toast.LENGTH_SHORT).show();
            this.mensaje= "Se selecciono: \n";

        }else{
            Toast.makeText(this,"No Se ha Seleccionado nada", Toast.LENGTH_SHORT).show();
        }
    }
}