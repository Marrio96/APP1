package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText nombre,dia,mes,anio,cuenta,correo;
    private Calendar fecha;
    private int edad=0;
    private MediaPlayer boton,inicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        nombre=findViewById(R.id.Nom);
        dia=findViewById(R.id.dia);
        mes=findViewById(R.id.mes);
        anio=findViewById(R.id.anio);
        cuenta=findViewById(R.id.num_cuenta);
        correo=findViewById(R.id.email);
        fecha=Calendar.getInstance();
        boton=MediaPlayer.create(this,R.raw.chinese);
        inicio=MediaPlayer.create(this,R.raw.oriental);
        inicio.start();
    }
    public void checar(View view){

        if(nombre.length()==0 ){

            nombre.setError(getResources().getString(R.string.falta1));

        }
        if(dia.length()==0 || Integer.parseInt(dia.getText().toString())<0 || Integer.parseInt(dia.getText().toString())>30){
            dia.setError(getResources().getString(R.string.falta2));

        }
        if(mes.length()==0 || Integer.parseInt(mes.getText().toString())>12 ||  Integer.parseInt(mes.getText().toString())<0){
            mes.setError(getResources().getString(R.string.falta3));

        }
        if(anio.length()==0 ||  Integer.parseInt(anio.getText().toString())<1936 || Integer.parseInt(anio.getText().toString())>fecha.get(Calendar.YEAR)  ){
            anio.setError(getResources().getString(R.string.falta4)+" "+ fecha.get(Calendar.YEAR));

        }
        if(cuenta.length()==0 ||  cuenta.length()<10){
            cuenta.setError(getResources().getString(R.string.falta5));

        }
        if(correo.length()==0 || !Patterns.EMAIL_ADDRESS.matcher(correo.getText().toString()).matches()){
            correo.setError(getResources().getString(R.string.falta6));
        }
        if(nombre.length()!=0 && dia.length()!=0 && Integer.parseInt(dia.getText().toString())>0 && Integer.parseInt(dia.getText().toString())<=30 && mes.length()!=0 &&  Integer.parseInt(mes.getText().toString())<=12 &&  Integer.parseInt(mes.getText().toString())>0 && anio.length()!=0 &&  Integer.parseInt(anio.getText().toString())>=1936 && Integer.parseInt(anio.getText().toString())<=fecha.get(Calendar.YEAR)
        && cuenta.length()!=0 &&  cuenta.length()==10 && correo.length()!=0 && Patterns.EMAIL_ADDRESS.matcher(correo.getText().toString()).matches()){

            siguiente(null);
        }
    }
    public void siguiente(View view){
        calcularedad();
        Intent activity2 = new Intent(this,Main2Activity.class);
        activity2.putExtra("nombre",nombre.getText().toString());
        activity2.putExtra("year",anio.getText().toString());
        activity2.putExtra("Edad",String.valueOf(edad));
        boton.start();
        inicio.stop();
        startActivity(activity2);
        finish();
    }
    private void calcularedad(){
        edad=fecha.get(Calendar.YEAR)-Integer.parseInt(anio.getText().toString());
        if(edad>0)
        {
            if(Integer.parseInt(mes.getText().toString())>fecha.get(Calendar.MONTH))
            {
                edad--;
            }
            if (Integer.parseInt(mes.getText().toString())==fecha.get(Calendar.MONTH))
            {
                if((Integer.parseInt(dia.getText().toString())<fecha.get(Calendar.DAY_OF_MONTH))){
                    edad--;
                }
            }
        }
    }
}
