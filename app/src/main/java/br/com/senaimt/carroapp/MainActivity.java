package br.com.senaimt.carroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import br.com.senaimt.dao.SQLHelper;

public class MainActivity extends AppCompatActivity {

    SQLHelper helper;
    Button btnNovo;
    Button btnListar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new SQLHelper(this);

        btnNovo = findViewById(R.id.btnNovo);
        btnListar = findViewById(R.id.btnListar);

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
     Intent intent = new Intent(getApplicationContext(), NovoCarroActivity.class);
      startActivity(intent);
            }
        });

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent intent =  new Intent(getApplicationContext(), ListarCarroActivity.class);
        startActivity(intent);
            }
        });


    }
}