package com.example.quiz.Util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;



public class PreferenceUtils {

    public static String KEY_USER = "user";
    public static String KEY_PASSWORD = "password";

    public PreferenceUtils(){

    }

    public static boolean saveEmail(String user, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.putString(KEY_USER, user);
        prefsEditor.apply();
        return true;
    }

    public static String getEmail(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(KEY_USER, null);
    }

    public static boolean savePassword(String password, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.putString(KEY_PASSWORD, password);
        prefsEditor.apply();
        return true;
    }

    public static String getPassword(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(KEY_PASSWORD, null);
    }
}
