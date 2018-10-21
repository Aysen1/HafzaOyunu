package com.example.aysen.hafzaoyunu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class Giris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        final EditText et = (EditText) findViewById(R.id.et_isim) ;
        ((Button) findViewById(R.id.oyuna_basla)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Giris.this,OyunEkrani.class);
                i.putExtra("mesaj",et.getText().toString());
                startActivity(i);
            }
        });
    }
}
