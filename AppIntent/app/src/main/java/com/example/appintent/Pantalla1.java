package com.example.appintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Pantalla1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla1);
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        // Intent explicito que va a la pantalla2
//        Intent i = new Intent(this, Pantalla2.class);
//        startActivity(i);

        // Intent implicito para ver una web
//        Intent ejemplo = new Intent(Intent.ACTION_VIEW);
//        ejemplo.setData(Uri.parse("https://www.iestubalcain.net"));
//        startActivity(ejemplo);

        // Intent implicito que le pide al sistema enviar un email
        Intent correo = new Intent();
        correo.setAction(Intent.ACTION_SEND);
        correo.putExtra(Intent.EXTRA_TEXT, "Hola mail");
        correo.setType("text/plain");
        startActivity(correo);
    }
}