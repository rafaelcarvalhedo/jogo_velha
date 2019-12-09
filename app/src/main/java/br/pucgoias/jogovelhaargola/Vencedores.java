package br.pucgoias.jogovelhaargola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Vencedores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vencedores);

        TextView winner = (TextView) findViewById(R.id.txtNomeVencerdor);
        winner.setText(getIntent().getStringExtra("winner"));
    }

    public void newGame(View view){
//        Intent callNewGame = new Intent(this, Jogadores.class);
//        startActivity(callNewGame);
    }

}
