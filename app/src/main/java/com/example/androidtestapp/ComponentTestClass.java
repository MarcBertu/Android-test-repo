package com.example.androidtestapp;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class ComponentTestClass {

    public static class ComponentDataClass {
        private final int statut;
        private final String message;

        public ComponentDataClass(int statut, String message) {
            this.statut = statut;
            this.message = message;
        }

        public int getStatut() {
            return statut;
        }

        public String getMessage() {
            return message;
        }
    }

    public static ComponentDataClass parseFromJson(String jsonString) {
        ComponentDataClass entity = new ComponentDataClass(0, "");

        try {
            JSONObject object = new JSONObject(jsonString);

            if(object.has("statut") && object.has("message")) {
                entity = new ComponentDataClass(object.getInt("statut"), object.getString("message"));
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return entity;
    }

    public static String getJsonStringMocked(Context context) {
        String json = "";
        try (InputStream ins = context.getResources().openRawResource(R.raw.test)) {
            int size = ins.available();
            byte[] buffer = new byte[size];
            ins.read(buffer);
            ins.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return json;
    }
}
