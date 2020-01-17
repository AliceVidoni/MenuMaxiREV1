package com.example.menmaxi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import entities.Piatto;

public class CustomAdapter extends ArrayAdapter<Piatto> {

    private int resource;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, int resourceId, List<Piatto> objects) {
        super(context,resourceId,objects);
        resource = resourceId;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if (v == null) {
            Log.d("DEBUG","Inflating view");
            v = inflater.inflate(R.layout.piatto_in_menu, null);
        }

        Piatto p = getItem(position);

        Log.d("DEBUG","product p="+p);

        TextView nome;
        TextView ingredienti;
        TextView prezzo;
        ImageView foto;

        nome = (TextView) v.findViewById(R.id.nome);

        Log.d("DEBUG","nameTextView="+nome);

        ingredienti = (TextView) v.findViewById(R.id.ingredienti);
        prezzo=(TextView)v.findViewById(R.id.prezzo);
        foto = (ImageView) v.findViewById(R.id.imageView5);

        foto.setImageDrawable(Drawable.createFromPath("acquam.jpg"));
        nome.setText(p.getNome());
        ingredienti.setText(p.getIngredientiString());
        prezzo.setText(p.getPrezzoString());

        return v;
    }

}
