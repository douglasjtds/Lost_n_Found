package com.tig.jackscompany.lostandfound;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Douglas on 22/06/2016.
 */
public class ControladorBanco {
    private SQLiteDatabase db;
    private ConectarAoBanco banco;

    public ControladorBanco(Context context){
        banco = new ConectarAoBanco(context);
    }

    public String insereDado(String nome, String local, String data){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(ConectarAoBanco.NOME , nome);
        valores.put(ConectarAoBanco.LOCAL, local);
        valores.put(ConectarAoBanco.DATA, data);

        resultado = db.insert(ConectarAoBanco.TABELA, null, valores);
        db.close();

        if (resultado ==-1) {
            return "Erro ao inserir objteto";
        } else {
            return "Objeto cadastrado com sucesso";
        }


    }

    public Cursor carregaDados(){
        Cursor cursor;
        String[] campos =  {banco.ID,banco.NOME,banco.LOCAL};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELA, campos, null, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public Cursor carregaDadoById(int id){
        Cursor cursor;
        String[] campos =  {banco.ID,banco.NOME,banco.LOCAL,banco.DATA};
        String where = ConectarAoBanco.ID + "=" + id;
        db = banco.getReadableDatabase();
        cursor = db.query(ConectarAoBanco.TABELA,campos,where, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
}
