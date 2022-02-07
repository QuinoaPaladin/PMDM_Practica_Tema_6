package es.studium.myfilmingapp;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detalles extends AppCompatActivity
{
    ImageView iv;
    String posicion;
    int tipo;
    TextView titulo;
    TextView director;
    TextView reparto;
    TextView clasificacion;
    TextView sinopsis;
    TextView temporadas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliado);

        iv = (ImageView) findViewById(R.id.iv_pasada);
        titulo = (TextView) findViewById(R.id.tv_titulo);
        director = (TextView) findViewById(R.id.tv_director);
        reparto = (TextView) findViewById(R.id.tv_reparto);
        clasificacion = (TextView) findViewById(R.id.tv_clasificacion);
        sinopsis = (TextView) findViewById(R.id.tv_sinopsis);
        temporadas = (TextView) findViewById(R.id.tv_temporadas);

        Intent intentAnime = getIntent();
        posicion = intentAnime.getStringExtra("posicion");
        tipo = intentAnime.getIntExtra("tipo", 0 );

        if(tipo == 0)
        {
            if(posicion.equals("El castillo ambulante"))
            {
                iv.setImageResource(R.drawable.castillo);

                titulo.setText(R.string.castillo_titulo);
                director.setText(R.string.castillo_director);
                reparto.setText(R.string.castillo_reparto);
                clasificacion.setText(R.string.castillo_clasificacion);
                sinopsis.setText(R.string.castillo_sinopsis);
                temporadas.setText("");

            }
            else if(posicion.equals("El viaje de Chihiro"))
            {
                iv.setImageResource(R.drawable.viaje);

                titulo.setText(R.string.viaje_titulo);
                director.setText(R.string.viaje_director);
                reparto.setText(R.string.viaje_reparto);
                clasificacion.setText(R.string.viaje_clasificacion);
                sinopsis.setText(R.string.viaje_sinopsis);
                temporadas.setText("");
            }
            else if(posicion.equals("La princesa Mononoke"))
            {
                iv.setImageResource(R.drawable.princesa);

                titulo.setText(R.string.princesa_titulo);
                director.setText(R.string.princesa_director);
                reparto.setText(R.string.princesa_reparto);
                clasificacion.setText(R.string.princesa_clasificacion);
                sinopsis.setText(R.string.princesa_sinopsis);
                temporadas.setText("");
            }
            else if(posicion.equals("Porco Rosso"))
            {
                iv.setImageResource(R.drawable.porco);

                titulo.setText(R.string.porco_titulo);
                director.setText(R.string.porco_director);
                reparto.setText(R.string.porco_reparto);
                clasificacion.setText(R.string.porco_clasificacion);
                sinopsis.setText(R.string.porco_sinopsis);
                temporadas.setText("");
            }
            else if(posicion.equals("Nicky la aprendiz de bruja"))
            {
                iv.setImageResource(R.drawable.nicky);

                titulo.setText(R.string.nicky_titulo);
                director.setText(R.string.nicky_director);
                reparto.setText(R.string.nicky_reparto);
                clasificacion.setText(R.string.nicky_clasificacion);
                sinopsis.setText(R.string.nicky_sinopsis);
                temporadas.setText("");
            }
        }
        else if(tipo == 1)
        {
            if(posicion.equals("Naruto"))
            {
                iv.setImageResource(R.drawable.naruto);

                titulo.setText(R.string.naruto_titulo);
                director.setText(R.string.naruto_director);
                reparto.setText(R.string.naruto_reparto);
                clasificacion.setText(R.string.naruto_clasificacion);
                sinopsis.setText(R.string.naruto_sinopsis);
                temporadas.setText(R.string.naruto_temporadas);
            }
            else if(posicion.equals("Shingeki no Kyojin"))
            {
                iv.setImageResource(R.drawable.aot);

                titulo.setText(R.string.aot_titulo);
                director.setText(R.string.aot_director);
                reparto.setText(R.string.aot_reparto);
                clasificacion.setText(R.string.aot_clasificacion);
                sinopsis.setText(R.string.aot_sinopsis);
                temporadas.setText(R.string.aot_temporadas);
            }
            else if(posicion.equals("Demon Slayer"))
            {
                iv.setImageResource(R.drawable.demon);

                titulo.setText(R.string.demon_titulo);
                director.setText(R.string.demon_director);
                reparto.setText(R.string.demon_reparto);
                clasificacion.setText(R.string.demon_clasificacion);
                sinopsis.setText(R.string.demon_sinopsis);
                temporadas.setText(R.string.demon_temporadas);
            }
            else if(posicion.equals("Gintama"))
            {
                iv.setImageResource(R.drawable.gintama);

                titulo.setText(R.string.gintama_titulo);
                director.setText(R.string.gintama_director);
                reparto.setText(R.string.gintama_reparto);
                clasificacion.setText(R.string.gintama_clasificacion);
                sinopsis.setText(R.string.gintama_sinopsis);
                temporadas.setText(R.string.gintama_temporadas);
            }
            else if(posicion.equals("Jujutsu Kaisen"))
            {
                iv.setImageResource(R.drawable.jujutsu);

                titulo.setText(R.string.jjs_titulo);
                director.setText(R.string.jjs_director);
                reparto.setText(R.string.jjs_reparto);
                clasificacion.setText(R.string.jjs_clasificacion);
                sinopsis.setText(R.string.jjs_sinopsis);
                temporadas.setText(R.string.jjs_temporadas);
            }
        }
    }
}