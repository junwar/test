package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public ImageButton mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cek apakah ImageButton mulai dapat ditemukan di layout
        mulai = findViewById(R.id.mulai);
        if (mulai != null) {
            // Tambahkan OnClickListener jika ImageButton ditemukan
            mulai.setOnClickListener(this);
        } else {
            // Handle case jika ImageButton tidak dapat ditemukan
            // Misalnya, dengan menampilkan pesan kesalahan atau melakukan tindakan lain
        }
    }

    @Override
    public void onClick(View v) {
        // Cek apakah tombol yang ditekan adalah tombol mulai
        if (v.getId() == R.id.mulai) {
            // Buat intent untuk pindah ke MoveActivity
            Intent moveIntent = new Intent(this, MoveActivity.class);
            // Mulai aktivitas MoveActivity
            startActivity(moveIntent);
        }
    }
}
