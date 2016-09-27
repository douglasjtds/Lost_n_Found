package com.tig.jackscompany.lostandfound;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class Tela3PerdiAlgo extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3_perdi_algo);

        ControladorBanco crud = new ControladorBanco(getBaseContext());
        Cursor cursor = crud.carregaDados();

        String[] nomeCampos = new String[] {ConectarAoBanco.ID, ConectarAoBanco.NOME, ConectarAoBanco.LOCAL};
        int[] idViews = new int[] {R.id.idObj, R.id.nomeObj, R.id.local};

        SimpleCursorAdapter adaptador = new SimpleCursorAdapter(getBaseContext(),
                R.layout.activity_tela3_perdi_algo,cursor,nomeCampos,idViews, 0);
        lista = (ListView)findViewById(R.id.listView);
        lista.setAdapter(adaptador);

    }
}
