package com.tig.jackscompany.lostandfound;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2PerdiAlgo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2_perdi_algo);

        Button btList = (Button) findViewById(R.id.buttonsearch);
        Button btsearch = (Button) findViewById(R.id.btSearch);

        btList.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(getBaseContext(), Tela3PerdiAlgo.class);
                startActivity(newIntent);
            }
        });

        btsearch.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(getBaseContext(), Tela4PerdiAlgo.class);
                startActivity(newIntent);
            }
        });

    }
}
