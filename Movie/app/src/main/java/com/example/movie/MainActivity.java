package com.example.movie;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchLuca(View view) {
        Log.d(LOG_TAG, "Launching Luca!");
        intent = new Intent(this, Luca.class);
        startActivity(intent);
    }

    public void launchRickandMorty(View view) {
        Log.d(LOG_TAG, "Launching Rick and Morty!");
        intent = new Intent(this, RickandMorty.class);
        startActivity(intent);
    }

    public void launchAwake(View view) {
        Log.d(LOG_TAG, "Launching Awake!");
        intent = new Intent(this, Awake.class);
        startActivity(intent);
    }

    public void launchBartkowiak(View view) {
        Log.d(LOG_TAG, "Launching Bartkowiak!");
        intent = new Intent(this, Bartkowiak.class);
        startActivity(intent);
    }

    public void launchCruella(View view) {
        Log.d(LOG_TAG, "Launching Cruella!");
        intent = new Intent(this, Cruella.class);
        startActivity(intent);
    }

    public void launchBatman(View view) {
        Log.d(LOG_TAG, "Launching Batman!");
        intent = new Intent(this, Batman.class);
        startActivity(intent);
    }

    public void launchAshfall(View view) {
        Log.d(LOG_TAG, "Launching Ashfall!");
        intent = new Intent(this, Ashfall.class);
        startActivity(intent);
    }

    public void launchInfinite(View view) {
        Log.d(LOG_TAG, "Launching Infinite!");
        intent = new Intent(this, Infinite.class);
        startActivity(intent);
    }

}