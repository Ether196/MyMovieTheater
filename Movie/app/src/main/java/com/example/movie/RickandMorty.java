package com.example.movie;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RickandMorty extends AppCompatActivity{

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    Intent intent;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.rickandmorty);
        }

    public void backToMain(View view) {
        Log.d(LOG_TAG, "Back to main screen");
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
