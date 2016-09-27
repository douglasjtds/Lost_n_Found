package com.tig.jackscompany.lostandfound;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Tela3PerdiAlgo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3_perdi_algo);

        EditText txtNomedoObjeto = (EditText) findViewById(R.id.txtNomeDoObjeto);

        Button btSearchOk = (Button) findViewById(R.id.btnsearchok);
    }
}
