package com.example.aysen.hafzaoyunu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class OyunEkrani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_ekrani);
        Intent i = getIntent();
        String mesaj = i.getStringExtra("mesaj");
        TextView tv = (TextView) findViewById(R.id.isim_hosgeldin);
        tv.setText("Merhaba "+mesaj+". Oyuna Hoşgeldin.");
    }
}
