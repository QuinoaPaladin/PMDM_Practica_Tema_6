package es.studium.myfilmingapp;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PelisAdapter extends RecyclerView.Adapter<PelisAdapter.PelisViewHolder>
{
    private List<Anime> items;

    public static class PelisViewHolder extends RecyclerView.ViewHolder
    {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;
        public TextView visitas;


        public PelisViewHolder(View v)
        {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);
            visitas = (TextView) v.findViewById(R.id.visitas);

        }
    }

    public PelisAdapter(List<Anime> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public PelisViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.anime_card, viewGroup, false);
        final PelisViewHolder holder = new PelisViewHolder(v);
        return  holder;
    }

    @Override
    public void onBindViewHolder(PelisViewHolder viewHolder,  int i) {

        viewHolder.imagen.setImageResource(items.get(i).getimagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.visitas.setText("Visitas:"+String.valueOf(items.get(i).getVisitas()));
        viewHolder.imagen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                    Intent intentPeli = new Intent(v.getContext(), Detalles.class);
                    intentPeli.putExtra("posicion", viewHolder.nombre.getText());
                    intentPeli.putExtra("tipo", 0);
                    v.getContext().startActivity(intentPeli);
            }
            });

}}
