package com.tig.jackscompany.lostandfound;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Tela3Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3_cadastro);
        EditText txtNomeObjeto = (EditText) findViewById(R.id.txtNomeObj);
        EditText txtEncontrado = (EditText) findViewById(R.id.txtEncontradoEm);
        EditText txtData = (EditText) findViewById(R.id.txtData);
        EditText txtHorario = (EditText) findViewById(R.id.txtHorario);
    }


}
