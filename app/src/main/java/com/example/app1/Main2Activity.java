package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView Nombre,Edad,nombrehoroscopo;
    private ImageView horoscopo;
    private String Nombres,year;
    private MediaPlayer sonido,boton;
    private int select;
    private String edad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nombrehoroscopo=findViewById(R.id.namehoroscopo);
        Nombre = findViewById(R.id.Name);
        horoscopo = findViewById(R.id.imagen);
        Edad = findViewById(R.id.edad);
        edad=getIntent().getStringExtra("Edad");
        Edad.setText(edad);
        Nombres = getIntent().getStringExtra("nombre");
        year = getIntent().getStringExtra("year");
        select=Integer.parseInt(year);
        Nombre.setText(Nombres);
        escoger(select);
    }
    public void regreso(View view) {
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);

        finish();
    }
    private void escoger(int num)
    {
        if(num==1936 || num==1948 || num==1960 || num==1972 || num==1984 || num==1996 || num==2008){
            horoscopo.setImageResource(R.drawable.rata);
            nombrehoroscopo.setText(getResources().getText(R.string.rata));
            sonido= MediaPlayer.create(this,R.raw.rata);
            sonido.start();
        }
        if(num==1937 || num==1949 || num==1961 || num==1973 || num==1985 || num==1997 || num==2009){
            horoscopo.setImageResource(R.drawable.buey);
            nombrehoroscopo.setText(getResources().getText(R.string.buey));
            sonido= MediaPlayer.create(this,R.raw.buey);
            sonido.start();
        }
        if(num==1938 || num==1950 || num==1962 || num==1974 || num==1986 || num==1998 || num==2009){
            horoscopo.setImageResource(R.drawable.tigre);
            nombrehoroscopo.setText(getResources().getText(R.string.tigre));
            sonido= MediaPlayer.create(this,R.raw.tigre);
            sonido.start();
        }
        if(num==1939 || num==1951 || num==1963 || num==1975 || num==1987 || num==1999 || num==2010){
            horoscopo.setImageResource(R.drawable.conejo);
            nombrehoroscopo.setText(getResources().getText(R.string.conejo));
            sonido= MediaPlayer.create(this,R.raw.rabbit);
            sonido.start();
        }
        if(num==1940 || num==1952 || num==1964 || num==1976 || num==1988 || num==2000 || num==2012){
            horoscopo.setImageResource(R.drawable.dragon);
            nombrehoroscopo.setText(getResources().getText(R.string.dragon));
            sonido= MediaPlayer.create(this,R.raw.dragon);
            sonido.start();
        }
        if(num==1941 || num==1953 || num==1965 || num==1977 || num==1989 || num==2001 || num==2013){
            horoscopo.setImageResource(R.drawable.serpiente);
            nombrehoroscopo.setText(getResources().getText(R.string.serpiente));
            sonido= MediaPlayer.create(this,R.raw.serpiente);
            sonido.start();
        }
        if(num==1942 || num==1954 || num==1966 || num==1978 || num==1990 || num==2002 || num==2014){
            horoscopo.setImageResource(R.drawable.caballo);
            nombrehoroscopo.setText(getResources().getText(R.string.caballo));
            sonido= MediaPlayer.create(this,R.raw.caballo);
            sonido.start();
        }
        if(num==1943 || num==1955 || num==1967 || num==1979 || num==1991 || num==2003 || num==2015){
            horoscopo.setImageResource(R.drawable.cabra);
            nombrehoroscopo.setText(getResources().getText(R.string.cabra));
            sonido= MediaPlayer.create(this,R.raw.cabra);
            sonido.start();
        }
        if(num==1944 || num==1956 || num==1968 || num==1980 || num==1992 || num==2004 || num==2016){
            horoscopo.setImageResource(R.drawable.mono);
            sonido= MediaPlayer.create(this,R.raw.mono);
            nombrehoroscopo.setText(getResources().getText(R.string.mono));
            sonido.start();
        }
        if(num==1945 || num==1957 || num==1969 || num==1981 || num==1993 || num==2005 || num==2017){
            horoscopo.setImageResource(R.drawable.gallo);
            nombrehoroscopo.setText(getResources().getText(R.string.gallo));
            sonido= MediaPlayer.create(this,R.raw.gallo);
            sonido.start();
        }
        if(num==1946 || num==1958 || num==1970 || num==1982 || num==1994 || num==2006 || num==2018){
            horoscopo.setImageResource(R.drawable.perro);
            nombrehoroscopo.setText(getResources().getText(R.string.perro));
            sonido= MediaPlayer.create(this,R.raw.perri);
            sonido.start();
        }
        if(num==1947 || num==1959|| num==1971 || num==1983 || num==1995 || num==2007 || num==2019){
            horoscopo.setImageResource(R.drawable.cerdo);
            nombrehoroscopo.setText(getResources().getText(R.string.cerdo));
            sonido= MediaPlayer.create(this,R.raw.cerdo);
            sonido.start();
        }
    }
}
