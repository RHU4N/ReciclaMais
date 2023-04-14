package com.example.rmais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Guia extends AppCompatActivity {
    public void Voltar(View v)
    {
        Intent vol = new Intent(this, Inicial.class);
        startActivity(vol);
    }
    //Página para o Mapa
    public void Mapa(View v)
    {
        Intent map = new Intent(this, Ongs.class);
        startActivity(map);
    }
    //Página para o Guia
    public void Guia(View v)
    {
        Intent alf = new Intent(this, Guia.class);
        startActivity(alf);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);
    }
}