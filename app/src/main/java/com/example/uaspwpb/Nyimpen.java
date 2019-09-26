package com.example.uaspwpb;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.IgnoreExtraProperties;
import java.io.Serializable;

import android.os.Bundle;

public class Nyimpen implements Serializable {

    private String Judul;
    private String Deskripsi;

    public Nyimpen(){

    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    @Override
    public String toString() {
        return " "+Judul+"\n"+
                " "+Deskripsi;
    }

    public Nyimpen (String jd, String dk){
        Judul = jd;
        Deskripsi = dk;
    }
}
