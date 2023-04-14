package com.example.rmais;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Informacao extends AppCompatActivity {
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
    public void Guia(View v)
    {
        Intent alf = new Intent(this, Guia.class);
        startActivity(alf);
    }
    //Página para informações do material
    public void Material(View v)
    {
        Intent mat = new Intent(this,Material.class);
        mat.putExtras(m);
        startActivity(mat);
    }
    ImageView img;
    ImageButton bimg;
    Bundle m = new Bundle();
    TextView texto1, texto2, texto3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacao);
        img = (ImageView) findViewById(R.id.imageView3);
        bimg = (ImageButton) findViewById(R.id.imageButton5);
        texto1 = (TextView) findViewById(R.id.textmaterial);
        texto2 = (TextView) findViewById(R.id.textmodo);
        texto3 = (TextView) findViewById(R.id.textoTitulo);
        Bundle b = getIntent().getExtras();
        int valor = b.getInt("valor");
        switch (valor) {
            //por questão de memória, colocamos apenas 3 Exemplos

            case 1:

                img.setImageResource(R.drawable.img);
                texto1.setText("- 1 Caixa de Leite\n" +
                        "- Tesoura\n" +
                        "- Cola Branca\n" +
                        "- Papel Decorativo (opicional)\n");
                texto2.setText("Lavar e cortar a caixa de leite na medida de 14cm de altura na parte de trás e 10cm de altura na parte da frente. Passar cola ao redor e depois colar o papel decorativo.");
                texto3.setText("Porta Treco");
                bimg.setImageResource(R.drawable.leite);
                m.putInt("valor", 1);

                break;
            case 2:

                img.setImageResource(R.drawable.flores);
                texto1.setText("- Lata\n" +
                        "- Cola Quente\n" +
                        "- Copo\n" +
                        "- Corda com o Modelo\n" +
                        "- Flores");
                texto2.setText("Colocar a corda ao redor da lata, com a cola quente; Colocar o copo dentro da lata;");
                texto3.setText("Latinha");
                bimg.setImageResource(R.drawable.lata);
                m.putInt("valor", 2);
                break;
            case 3:

                img.setImageResource(R.drawable.potegrande);
                texto1.setText("- Garrafa Pet\n" +
                        "O que mais vier na mente :)");
                texto2.setText("Dica bem legal que dá pra fazer com o uso das garrafas PET é um pote artesanal, que pode ser decorado com diversos acessórios, como tecido, EVA, feltro, fitas de cetim, dentre outros, e pode ser utilizado em várias ocasiões, como enfeite de mesas de festas, porta lembrancinhas do chá de bebê, vasos decorativos, para armazenar alimentos, e muito mais.");
                texto3.setText("Pote PET");
                bimg.setImageResource(R.drawable.pet);
                m.putInt("valor", 3);
                break;
            case 4:

                img.setImageResource(R.drawable.tvgrande);
                texto1.setText("- Dois pedaços de cano de meia polegada;\n" +
                        "- Tampinhas de refrigerante;\n" +
                        "- Uma caixa de sapatos, de preferência sapatos de adultos;\n" +
                        "- Duas folhas de papel camurça;\n" +
                        "- Papel ofício ou A4;\n" +
                        "- Uma cola de silicone quente.");
                texto2.setText("Faça um retângulo no centro de sua caixa de sapato, essa será a tela de sua televisão, mas tenha em mente aqui que você também precisará fazer dois furos em cada lateral (topo e base) em que você irá encaixar os canos. Ou seja, quando for cortar sua tela, deixe este espaço para os canos. Passe o papel camurça ao redor de tudo, lembrando de deixar a tela de sua televisão sempre aberta. Os serão encaixados em cada um dos “buraquinhos” que você fez, e as tampinhas serão coladas nas pontas de cada cano. Já o seu “filme” poderá ser desenhado na folha de papel ofício ou A4 que você separou, e enrolada nos dois canos como se fossem um pergaminho.");
                texto3.setText("Tv Criança");
                bimg.setImageResource(R.drawable.papelao);
                m.putInt("valor", 1);
                break;
            default:
                break;
        }
    }
}