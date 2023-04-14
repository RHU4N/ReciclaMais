package com.example.rmais;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Inicial extends AppCompatActivity {
    //Página para o Mapa
    public void Mapa(View v) {
        Intent map = new Intent(this, Ongs.class);
        startActivity(map);
    }

    //Página para o Guia
    public void Guia(View v) {
        Intent alf = new Intent(this, Guia.class);
        startActivity(alf);
    }

    ListView listView;
    Bundle b = new Bundle();
    int[] img = {R.drawable.vaso, R.drawable.planta, R.drawable.pote, R.drawable.tv};
    String[] nomes = {"Porta Trecos", "Vaso de Planta", " Pote PET", "TV para Criança"};

    public class ListImg extends BaseAdapter {
        @Override
        public int getCount() {

            return img.length;

        }

        @Override
        public Object getItem(int arg0) {
            return null;
        }

        @Override
        public long getItemId(int arg0) {
            return 0;
        }

        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {
            View view = getLayoutInflater().inflate(R.layout.modelo_item, null);
            ImageView imagem = (ImageView) view.findViewById(R.id.imagemItem);
            TextView texto = (TextView) view.findViewById(R.id.textoItem);

            imagem.setImageResource(img[arg0]);
            texto.setText(nomes[arg0]);
            return view;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        listView = (ListView) findViewById(R.id.listViewItens);
        ListImg obj = new ListImg();
        listView.setAdapter(obj);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                Inicial.this.getSystemService(Inicial.VIBRATOR_SERVICE);
                v.vibrate(500);

                switch (i) {
                    case (0):
                        b.putInt("valor", 1);

                        break;

                    case (1):

                        b.putInt("valor", 2);
                        break;

                    case (2):

                        b.putInt("valor", 3);
                        break;
                    case (3):

                        b.putInt("valor", 4);
                        break;
                    default:
                        break;
                }

                Intent v1 = new Intent(Inicial.this, Informacao.class);
                v1.putExtras(b);
                startActivity(v1);
            }

        });
    }

}