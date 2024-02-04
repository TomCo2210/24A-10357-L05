package dev.tomco.a24a_10357_l05.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManagerV2 {

    private static final String DB_FILE = "DB_FILE";
    private SharedPreferences sharedPref;

    public SharedPreferencesManagerV2(Context context) {
        this.sharedPref = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
    }

    public void putInt( String key, int value) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public int getInt( String key, int defaultValue) {
        return sharedPref.getInt(key, defaultValue);
    }

    public  void putString( String key, String value) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public  String getString( String key, String defaultValue) {
        return sharedPref.getString(key, defaultValue);
    }
}
