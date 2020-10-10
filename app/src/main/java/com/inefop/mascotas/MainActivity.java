package com.inefop.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity<mascotas> extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar();

        listaMascotas = (RecyclerView)findViewById(R.id.rcmasc);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarMascotas();
        inicializarAdaptador();

    }

    private void setSupportActionBar() {
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }


    public void inicializarMascotas(){

        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas(R.drawable.mascota1,"Lara"));
        mascotas.add(new Mascotas(R.drawable.mascota2,"Mar"));
        mascotas.add(new Mascotas(R.drawable.mascota3,"Mimosa"));
        mascotas.add(new Mascotas(R.drawable.mascota4,"Lomi"));
        mascotas.add(new Mascotas(R.drawable.mascota5,"Pomposo"));
    }


}