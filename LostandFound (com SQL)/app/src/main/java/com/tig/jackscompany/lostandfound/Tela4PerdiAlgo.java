package com.tig.jackscompany.lostandfound;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Douglas on 22/06/2016.
 */
public class Tela4PerdiAlgo extends Activity {

        EditText nome;
        EditText local;
        EditText data;
        Button alterar;
        Button deletar;
        Cursor cursor;
        ControladorBanco crud;
        String codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4_perdi_algo);

        codigo = this.getIntent().getStringExtra("codigo");

        crud = new ControladorBanco(getBaseContext());

        nome = (EditText)findViewById(R.id.editText4);
        local = (EditText)findViewById(R.id.editText5);
        data = (EditText)findViewById(R.id.editText6);

        alterar = (Button)findViewById(R.id.button2);

        cursor = crud.carregaDadoById(Integer.parseInt(codigo));
        nome.setText(cursor.getString(cursor.getColumnIndexOrThrow(ConectarAoBanco.NOME)));
        local.setText(cursor.getString(cursor.getColumnIndexOrThrow(ConectarAoBanco.LOCAL)));
        data.setText(cursor.getString(cursor.getColumnIndexOrThrow(ConectarAoBanco.DATA)));

    }

}
