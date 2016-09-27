package com.tig.jackscompany.lostandfound;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2AcheiAlgo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2_achei_algo);
        Button btCadastro = (Button) findViewById(R.id.btCadastroObj);
        Button btAcessoCamera = (Button) findViewById(R.id.buttonGoToCamera);

        btCadastro.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(getBaseContext(), Tela3Cadastro.class);
                startActivity(newIntent);
            }
        });

        btAcessoCamera.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBox();
            }
        });
    }

    public void dialogBox() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Permitir acesso à câmera?");
        alertDialogBuilder.setPositiveButton("Sim",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intentCamera = new Intent("android.media.action.IMAGE_CAPTURE");
                        startActivity(intentCamera);
                    }
                });

        alertDialogBuilder.setNegativeButton("Não",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


}
