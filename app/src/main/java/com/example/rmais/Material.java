package com.example.rmais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Material extends AppCompatActivity {
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

    ImageView img;
    TextView texto1, texto2, texto3,textoT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);
        img = (ImageView) findViewById(R.id.imageView3);
        texto1 = (TextView) findViewById(R.id.textmaterial);
        texto2 = (TextView) findViewById(R.id.textmaterial2);
        texto3 = (TextView) findViewById(R.id.textmaterial3);
        textoT = (TextView) findViewById(R.id.textoTitulo2);

        Bundle m = getIntent().getExtras();
        int valor = m.getInt("valor");
        switch (valor) {
            //por questão de memória, colocamos apenas 3 Exemplos

            case 1:

                img.setImageResource(R.drawable.lpapel);
                texto1.setText("A reciclagem de papelão é uma importante medida para a conservação ambiental, uma vez que sua produção é responsável por emissões de gases tóxicos e pela derrubada de milhões de árvores.\n" +
                        "Ao reciclar papelão, é possível reduzir significativamente o impacto ambiental e preservar recursos naturais.\n" +
                        "Infelizmente, a taxa de reciclagem de papelão no mundo ainda é baixa, sendo necessário um maior incentivo para aumentar sua efetividade.");
                texto2.setText("\n" +
                        "É importante destacar que somente dois tipos de papelão são recicláveis, o corrugado e o plano.\n" +
                        "O primeiro tipo é amplamente utilizado em embalagens para transporte de materiais, enquanto o segundo é encontrado em embalagens de alimentos congelados, cereais, caixas de sapato, dentre outros.\n" +
                        "Portanto, é fundamental conscientizar a população sobre a importância da reciclagem de papelão e garantir que os materiais sejam descartados de forma adequada para que possam ser reutilizados.\n");
                texto3.setText("Alguns dados sobre a produção de papelão no mundo:\n" +
                        "\n" +
                        "●A Grã-Bretanha produz anualmente em torno de 7 milhões de toneladas de papelão;\n" +
                        "●A reciclagem de papelão, se realizada de maneira consciente e eficiente, pouparia o corte anual de 544.000 árvores somente nos Estados Unidos;\n" +
                        "●Os custos com recursos hídricos e energéticos para a produção de papelão são exorbitantes em todo o mundo;\n" +
                        "●De acordo com estudos recentes, somente 50% das embalagens produzidas em papelão em todo o mundo são recicladas.");
                textoT.setText("Papelão");
                break;
            case 2:

                img.setImageResource(R.drawable.lmetal);
                texto1.setText("Um dos benefícios mais importantes da reciclagem de alumínio é sua capacidade de gerar renda para milhares de brasileiros,\n" +
                        "que vendem as latas para empresas de produção de alumínio que as utilizam para criar novos produtos com menor custo.\n" +
                        "Outro aspecto positivo do alumínio reciclado é que ele possui a mesma qualidade de um produto novo.");
                texto2.setText("Sobre a produção de alumínio, a mineração de bauxita, principal matéria-prima do alumínio,\n" +
                        "e o refino do material para a criação de um novo produto demandam altos gastos com eletricidade.\n" +
                        "Por outro lado, a reciclagem do alumínio consome apenas 5% dessa energia para a produção de novas mercadorias.\n" +
                        "Latarias de aerossol e sprays não são comumente recicladas, pois seu conteúdo é frequentemente considerado um composto orgânico volátil,\n" +
                        "e menos de 1% dessas embalagens são recicladas no Brasil.");
                texto3.setText("O descarte adequado das latas de alumínio inclui separá-las do lixo comum em casa e encaminhá-las para a coleta seletiva,\n" +
                        "evitando que acabem em aterros sanitários. Por outro lado, as latas de aço devem ser descartadas corretamente, especialmente aquelas que contêm produtos tóxicos,\n" +
                        "como tintas, vernizes e solventes, pois podem contaminar o solo e os lençóis freáticos se acabarem em aterros.");
                textoT.setText("Latas");
                break;
            case 3:

                img.setImageResource(R.drawable.lplastico);
                texto1.setText("Um dos principais benefícios da reciclagem de garrafas PET é a sua capacidade de ser reprocessado várias vezes,\n" +
                        "permitindo seu uso contínuo na cadeia produtiva.\n" +
                        "O PET é um material muito utilizado em embalagens, principalmente de refrigerantes,\n" +
                        "e seu uso em grande escala gerou um problema ambiental sério com a quantidade de descarte inadequado.");
                texto2.setText("Para solucionar o problema, é fundamental a coleta e reciclagem de garrafas PET, já que o material pode levar até 750 anos para se decompor na natureza.\n" +
                        "Além disso, a reciclagem das garrafas PET gera empregos nas cooperativas de catadores de lixo reciclável\n" +
                        "e nas empresas que trabalham diretamente com o processo de reciclagem e produção de matéria-prima a partir dessas embalagens.");
                texto3.setText("A reciclagem de garrafas PET não só favorece o meio ambiente, mas também gera benefícios econômicos e sociais, \n" +
                        "ao permitir a reintrodução do material na cadeia produtiva e gerar empregos.\n" +
                        "Por isso, é importante que a população faça a separação correta do lixo e encaminhe as garrafas PET para a coleta seletiva, \n" +
                        "garantindo um destino adequado para o material e contribuindo para a conservação do meio ambiente.");
                textoT.setText("Pet");
                break;
            default:
                break;
        }
    }
}