package com.example.login03102023.actions;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.login03102023.MainActivity;

public class ServicePeliculas {

    private ViewPeliculas view;

    public ServicePeliculas(ViewPeliculas view){
    this.view = view;
}
    void getDatosPeliculas(){
        //Voy a por los datos
        //Viajo a por los datos
        //Threaaads
        //Toast.makeText(MainActivity.getInstance(), "Welcome To Miami!!!", Toast.LENGTH_SHORT).show();
            view.showPeliculas("Los datos han ido bien:");
        
    }
}
