package com.example.aruboss.hieuhaapp.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.util.AndroidRuntimeException;
import android.util.Log;

import com.example.aruboss.hieuhaapp.entry.Chap;
import com.example.aruboss.hieuhaapp.entry.Story;

import java.io.File;
import java.util.ArrayList;


/**
 * Created by Aru Boss on 29/04/2017.
 */

public class DatabaseHelperSdcard {

    private static final String TAG_LOG ="kimdungDatabase" ;
    public String DATABASE_NAME= "kimdung.db";
    private String TABLE_KIM_DUNG="kimdung";

    private String TABLE_ST_KIM_DUNG="st_kimdung";

    private String COLUMN_ST_ID="stID";
    private String COLUMN_ST_NAME="stName";
    private String COLUMN_AU_ID="auID";
    private String COLUMN_ST_IMAGE="stImage";
    private String COLUMN_ST_DESCRIBE="stDescribe";

    private String COLUM_DE_ID="deID";
    private String COLUMN_DE_NAME="deName";
    private String COLUMN_DE_SOCURE="deSource";
    private String COLUMN_DE_CONTENT="decontent";
    private String COLUMN_DE_DATE="deDate";




    Context context;
    File dbFile;

    private SQLiteDatabase database;
    private SQLiteDatabase.CursorFactory factory;


    public DatabaseHelperSdcard(Context context) {

        this.context = context;

        if (!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            throw new AndroidRuntimeException(
                    "External storage (SD-Card) not mounted");
        } else {

        }

        dbFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath(),DATABASE_NAME);
        Log.d(TAG_LOG, dbFile.getAbsolutePath());
    }
    private synchronized void openDbWord() {
        if (dbFile.exists()) {
            database = SQLiteDatabase.openDatabase(
                    dbFile.getAbsolutePath(), factory, SQLiteDatabase.OPEN_READWRITE);
        }

    }

    public synchronized void closeDbWord() {
        if (database != null) {
            database.close();
            database = null;
        }
    }
    private SQLiteDatabase getDatabase() {
        if (database == null) {
            openDbWord();
        }
        return database;
    }
    public ArrayList<Story> getListSotry() {
        ArrayList<Story> contactList = new ArrayList<>();
        getDatabase();

        Cursor cursor = database.rawQuery("SELECT *  from " + TABLE_KIM_DUNG, null);
        if (cursor.moveToFirst()) {
            do {
                Story contact = new Story();
                contact.setStID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(COLUMN_ST_ID))));
                contact.setStName(cursor.getString(cursor.getColumnIndex(COLUMN_ST_NAME)));
                contact.setStImage(cursor.getString(cursor.getColumnIndex(COLUMN_ST_IMAGE)));
                contact.setStDescribe(cursor.getString(cursor.getColumnIndex(COLUMN_ST_DESCRIBE)));

                // Adding contact to list
                contactList.add(contact);

            } while (cursor.moveToNext());
            // close cursor
            cursor.close();
        }
        return contactList;

    }

    public ArrayList<Chap> getListChapByStID(int id) {
        ArrayList<Chap> contactList = new ArrayList<>();
        getDatabase();

        Cursor cursor = database.rawQuery("SELECT *  from " + TABLE_ST_KIM_DUNG
                +" where "+COLUMN_ST_ID+"= "+Integer.toString(id), null);
        if (cursor.moveToFirst()) {
            do {
                Chap contact = new Chap();
                contact.setDeID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(COLUMN_ST_ID))));
                contact.setDeName(cursor.getString(cursor.getColumnIndex(COLUMN_DE_NAME)));
                contact.setDeSource(cursor.getString(cursor.getColumnIndex(COLUMN_DE_SOCURE)));
                contact.setDeContent(cursor.getString(cursor.getColumnIndex(COLUMN_DE_CONTENT)));
                contact.setStID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(COLUMN_ST_ID))));
                // Adding contact to list
                contactList.add(contact);

            } while (cursor.moveToNext());
            // close cursor
            cursor.close();
        }
        return contactList;

    }
    public ArrayList<Chap> getListChapSearch(String[] string, int stid) {
        ArrayList<Chap> contactList = new ArrayList<>();
        getDatabase();

        Cursor cursor = database.rawQuery("SELECT *  from " + TABLE_ST_KIM_DUNG
                +" where stID="+stid+" and "+COLUMN_DE_CONTENT+" like "+getSearchString(string)+" limit 10", null);
        if (cursor.moveToFirst()) {
            do {
                Chap contact = new Chap();
                contact.setDeID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(COLUMN_ST_ID))));
                contact.setDeName(cursor.getString(cursor.getColumnIndex(COLUMN_DE_NAME)));
                contact.setDeSource(cursor.getString(cursor.getColumnIndex(COLUMN_DE_SOCURE)));
                contact.setDeContent(cursor.getString(cursor.getColumnIndex(COLUMN_DE_CONTENT)));
                contact.setStID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(COLUMN_ST_ID))));
                // Adding contact to list
                contactList.add(contact);

            } while (cursor.moveToNext());
            // close cursor
            cursor.close();
        }
        return contactList;

    }

    private String getSearchString(String[] string) {
        String result="'%";
        for(int i=0;i<string.length;i++){
            if(!string[i].equals("")){
                result = result + string[i]+"%";
            }
        }
        return result+"'";
    }

}
