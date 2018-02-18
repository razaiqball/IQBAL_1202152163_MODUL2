package com.example.tmrazaiqbal.iqbal_1202152163_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
    RecyclerView rv;
    menuadapter adapter;
    List<pilihanmenu> listmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.list_menu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }
    private void initdata(){
        listmenu.add(new pilihanmenu(R.drawable.bakso_kuah, "Bakso Kuah", 15000, "Daging, Mie, Kuah"));
        listmenu.add(new pilihanmenu(R.drawable.mie_goreng, "Mie Goreng", 13500, "Indomie, Telur, Sawit"));
        listmenu.add(new pilihanmenu(R.drawable.nasi_goreng, "Nasi Goreng", 20000, "Nasi, Bawang, Sosis"));
        listmenu.add(new pilihanmenu(R.drawable.seblak, "Seblak Jebred", 17000, "Kerupuk, Cabe, Garam"));
        listmenu.add(new pilihanmenu(R.drawable.salad, "Salad", 50000, "Kol, Wortel, Jagung"));
        adapter = new menuadapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}