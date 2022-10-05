package com.example.appciclovidaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ejemplo", "Estoy onCreate");
    }


    //onCreate onStart(), onResume(), onPause(), onStop(), onDestroy()
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Ejemplo", "Estoy onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Ejemplo", "Estoy onResume");
    }

    @Override
    protected void  onPause(){
        super.onPause();
        Log.i("Ejemplo", "Estoy onPause");
    }

    @Override
    protected void  onStop(){
        super.onStop();
        Log.i("Ejemplo", "Estoy onStop");
    }


    @Override
    protected
    void  onDestroy(){
        super.onDestroy();
        Log.i("Ejemplo", "Estoy onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ejemplo", "Estoy onRestart");
    }
}