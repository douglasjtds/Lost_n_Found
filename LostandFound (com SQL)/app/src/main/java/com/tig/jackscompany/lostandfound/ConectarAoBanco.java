package com.tig.jackscompany.lostandfound;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Douglas on 22/06/2016.
 */
public class ConectarAoBanco extends SQLiteOpenHelper {
    private static final String NOME_BANCO = "bancoApp.db";
    static final String TABELA = "Objetos";
    static final String ID = "_id";
    static final String NOME = "nome";
    static final String LOCAL = "local";
    static final String DATA = "data";
    static final String HORA = "hora";

    public ConectarAoBanco(Context context) {
        super(context, NOME_BANCO, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE"+TABELA+"("
                + ID + "integer primary key autoincrement,"
                + NOME + "text,"
                + LOCAL + "text,"
                + DATA + "text,"
                + HORA + "text" + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(db);
    }
}
