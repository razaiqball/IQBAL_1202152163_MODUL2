package com.example.tmrazaiqbal.iqbal_1202152163_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class dinein extends AppCompatActivity {
    Spinner meja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);
        setTitle("Dine In");
        meja = findViewById(R.id.nomor_meja);
    }

    public void lihatinmenu2(View view) {
        Toast.makeText(dinein.this, meja.getSelectedItem().toString()+" dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(dinein.this, menu.class));
        finish();
    }
}
