package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        // Inisialisasi BottomNavigationView
        BottomNavigationView navView = findViewById(R.id.nav_view);

        // Inisialisasi NavController dengan menemukan NavHostFragment yang sesuai
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);

        // Inisialisasi Toolbar sebagai ActionBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Konfigurasi AppBarConfiguration dengan menyertakan setiap tujuan utama
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_beranda, R.id.navigation_riwayat, R.id.navigation_mail, R.id.navigation_profile)
                .build();

        // Mengaitkan ActionBar dengan NavController
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        // Mengaitkan BottomNavigationView dengan NavController
        NavigationUI.setupWithNavController(navView, navController);
    }

    // Override method onSupportNavigateUp() untuk menangani navigasi "Up" (kembali) button
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        return navController.navigateUp()
                || super.onSupportNavigateUp();
    }
}
