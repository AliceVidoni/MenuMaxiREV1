package com.example.menmaxi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import entities.Piatto;
import managers.MenuSingleton;

public class CategoriaSelezionata extends AppCompatActivity {

    public ListView listView;
    public TextView txtcategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_selezionata);
        txtcategoria=findViewById(R.id.textview);


      /* Bundle datipassati = getIntent().getExtras();
        String categoria = datipassati.getString("categoria");

        txtcategoria.setText(categoria);

        Collection<Piatto> piatti=MenuSingleton.getInstance().getMenu().getPiatti(categoria);

        listView = (ListView)findViewById(R.id.mylistview);

        CustomAdapter customAdapter =
                new CustomAdapter(this, R.layout.piatto_in_menu, new List<Piatto>() {
                    @Override
                    public int size() {
                        return 0;
                    }

                    @Override
                    public boolean isEmpty() {
                        return false;
                    }

                    @Override
                    public boolean contains(@Nullable Object o) {
                        return false;
                    }

                    @NonNull
                    @Override
                    public Iterator<Piatto> iterator() {
                        return null;
                    }

                    @NonNull
                    @Override
                    public Object[] toArray() {
                        return new Object[0];
                    }

                    @NonNull
                    @Override
                    public <T> T[] toArray(@NonNull T[] a) {
                        return null;
                    }

                    @Override
                    public boolean add(Piatto piatto) {
                        return false;
                    }

                    @Override
                    public boolean remove(@Nullable Object o) {
                        return false;
                    }

                    @Override
                    public boolean containsAll(@NonNull Collection<?> c) {
                        return false;
                    }

                    @Override
                    public boolean addAll(@NonNull Collection<? extends Piatto> c) {
                        return false;
                    }

                    @Override
                    public boolean addAll(int index, @NonNull Collection<? extends Piatto> c) {
                        return false;
                    }

                    @Override
                    public boolean removeAll(@NonNull Collection<?> c) {
                        return false;
                    }

                    @Override
                    public boolean retainAll(@NonNull Collection<?> c) {
                        return false;
                    }

                    @Override
                    public void clear() {

                    }

                    @Override
                    public Piatto get(int index) {
                        return null;
                    }

                    @Override
                    public Piatto set(int index, Piatto element) {
                        return null;
                    }

                    @Override
                    public void add(int index, Piatto element) {

                    }

                    @Override
                    public Piatto remove(int index) {
                        return null;
                    }

                    @Override
                    public int indexOf(@Nullable Object o) {
                        return 0;
                    }

                    @Override
                    public int lastIndexOf(@Nullable Object o) {
                        return 0;
                    }

                    @NonNull
                    @Override
                    public ListIterator<Piatto> listIterator() {
                        return null;
                    }

                    @NonNull
                    @Override
                    public ListIterator<Piatto> listIterator(int index) {
                        return null;
                    }

                    @NonNull
                    @Override
                    public List<Piatto> subList(int fromIndex, int toIndex) {
                        return null;
                    }
                });

        listView.setAdapter(customAdapter);


        for (Piatto p: piatti) {
            customAdapter.add(p);
        }


         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String  str  = listView.getItemAtPosition(position).toString();
                // Show Toast
                Toast.makeText(getApplicationContext(),
                        "Click su posizione n."+position+": " +str, Toast.LENGTH_LONG)
                        .show();
            }
        }); */

    }

    public void scegliCategoria(View v) {
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
