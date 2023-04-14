package com.example.rmais;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Ongs extends AppCompatActivity {
    ListView listViewOng;
    Bundle a = new Bundle();

    public void Voltar(View v)
    {
        Intent vol = new Intent(this, Inicial.class);
        startActivity(vol);
    }
    //Página para o Guia
    public void Guia(View v)
    {
        Intent alf = new Intent(this, Guia.class);
        startActivity(alf);
    }

    int[] img = {R.drawable.logoform, R.drawable.logorec};
    String[] nomes = {"Formiguinha", "CBS - Aparas"};
    String[] desc = {"Projeto Caixas Protetoras que visa criar forro térmico feito com caixinhas de leite e suco, para casas de famílias vulneráveis", "Empresa que compra e vende apáras de papéis, papelão e  embalagens de longa vida (caixa Tetra Pak).."};
    public class Adap extends BaseAdapter {
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
        public View getView(int arg0, View arg1, ViewGroup arg2){
            View view = getLayoutInflater().inflate(R.layout.modelo_ong, null);
            ImageView imagem = (ImageView) view.findViewById(R.id.image);
            TextView titulo = (TextView) view.findViewById(R.id.txtName);
            TextView descricao = (TextView) view.findViewById(R.id.txtDes);
            imagem.setImageResource(img[arg0]);
            titulo.setText(nomes[arg0]);
            descricao.setText(desc[arg0]);
            return view;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongs);
        listViewOng = findViewById(R.id.listView);
        listViewOng = (ListView) findViewById(R.id.listView);
        Adap obj = new Adap();
        listViewOng.setAdapter(obj);

        listViewOng.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {
                    case 0:
                        a.putInt("coordenada", 1);
                        break;
                    case 1:
                        a.putInt("coordenada", 2);
                        break;
                    case 2:
                        a.putInt("coordenada", 3);
                        break;
                    default:
                        break;
                }
                Intent ee = new Intent(Ongs.this, MapsActivity.class);
                ee.putExtras(a);
                startActivity(ee);
            }
        });

    }
}