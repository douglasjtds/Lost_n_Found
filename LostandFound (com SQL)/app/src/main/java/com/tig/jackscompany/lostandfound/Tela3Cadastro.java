package com.tig.jackscompany.lostandfound;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tela3Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3_cadastro);

        Button buttonOK = (Button) findViewById(R.id.buttonOK);

        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControladorBanco crud = new ControladorBanco(getBaseContext());
                EditText txtNomeObjeto = (EditText) findViewById(R.id.txtNomeObj);
                EditText txtEncontrado = (EditText) findViewById(R.id.txtEncontradoEm);
                EditText txtDate = (EditText) findViewById(R.id.txtDate);
                EditText txtHorario = (EditText) findViewById(R.id.txtHorario);
                String nomeString = txtNomeObjeto.getText().toString();
                String localString = txtEncontrado.getText().toString();
                String dataString = txtDate.getText().toString();
                String resultado;

                resultado = crud.insereDado(nomeString,localString,dataString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();

            }
        });

    }
}