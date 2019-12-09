package br.pucgoias.jogovelhaargola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void newGame(View view){
        Intent callDisplay = new Intent(this, Jogo.class);
        startActivity(callDisplay);
    }

    public void encerra(View view){
        Intent encerra = new Intent(Intent.ACTION_MAIN);
        encerra.addCategory(Intent.CATEGORY_HOME);
        encerra.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(encerra);
    }


}
