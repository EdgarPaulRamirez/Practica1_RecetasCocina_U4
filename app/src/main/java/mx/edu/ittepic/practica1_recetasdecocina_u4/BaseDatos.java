package mx.edu.ittepic.practica1_recetasdecocina_u4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class BaseDatos extends SQLiteOpenHelper {
    public BaseDatos(Context context, String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);// el equivalente a php my admin "SQLiteOpenHelper"
    }

    @Override
    public void onCreate(SQLiteDatabase db) {//Cronstruye objetos que son capaces de realizar cualquier transaccion
        //Se ejecuta cuando la aplicación (Ejercicio 1) se ejecuta en el celular
        //Sirve para construir en el SQLITE que esta en el CEL las tablas que la APP requiere para funcionar
        //Tambien inserta datos predeterminados
        // Crear estructura de la base de datos e Insert necesarios

        db.execSQL("CREATE TABLE PLATILLO (ID INTEGER PRIMARY KEY, NOMBRE VARCHAR(200), INGREDIENTES VARCHAR(200), PREPARACION VARCHAR(50), OBSERVACIONES VARCHAR(200))");//Funciona para: INSERT, CREATE TABLE, DELETE, UPDATE
        //db.query();// se usa cuando realizamos un SELECT*

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {// aqui es donde se actualiza de forma "grande" en la estructura de base de datos

    }
}
