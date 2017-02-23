package com.example.ameza.contactost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recycler;
    RecyclerView.Adapter adaptador;
    RecyclerView.LayoutManager lmanager;
    Toolbar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionbar = (Toolbar) findViewById(R.id.miActioBar);
        setSupportActionBar(actionbar);





        List<Mascota> items = new ArrayList<>();

        items.add(new Mascota(R.drawable.mascota1,"Fido","5"));
        items.add(new Mascota(R.drawable.mascota2,"Brandon","8"));
        items.add(new Mascota(R.drawable.mascota3,"Charlie","4"));
        items.add(new Mascota(R.drawable.mascota4,"Max","2"));
        items.add(new Mascota(R.drawable.mascota5,"Zack","9"));
        items.add(new Mascota(R.drawable.mascota6,"El Maykol","3"));
        items.add(new Mascota(R.drawable.mascota7,"Gardfield","4"));

/*
        items.add(new Mascota(R.drawable.angel,"Angel Beats"));
        items.add(new Mascota(R.drawable.death,"Death Note"));
        items.add(new Mascota(R.drawable.fate,"Fate Stay Night"));
        items.add(new Mascota(R.drawable.nhk,"Welcome to the NHK"));
        items.add(new Mascota(R.drawable.suzumiya,"Suzumiya Haruhi"));
*/
        recycler = (RecyclerView) findViewById(R.id.rvLista);
        recycler.setHasFixedSize(true);

        lmanager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lmanager);

        adaptador = new ListaAdapter(items);
        recycler.setAdapter(adaptador);


    }
}
