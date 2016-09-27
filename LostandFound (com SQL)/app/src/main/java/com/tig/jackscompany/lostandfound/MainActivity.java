package com.tig.jackscompany.lostandfound;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonF = (Button) findViewById(R.id.btnFound);
        Button buttonL = (Button) findViewById(R.id.btnLost);

        buttonF.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(getBaseContext(), Tela2AcheiAlgo.class);
                startActivity(newIntent);
            }
        });

        buttonL.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(getBaseContext(), Tela2PerdiAlgo.class);
                startActivity(newIntent);
            }
        });
    }


}
