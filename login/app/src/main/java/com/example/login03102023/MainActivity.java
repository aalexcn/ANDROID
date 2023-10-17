package com.example.login03102023;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login03102023.actions.ServicePeliculas;
import com.example.login03102023.actions.ViewPeliculas;

public class MainActivity extends AppCompatActivity
                            implements ViewPeliculas {
            private EditText edtEmail;
            private EditText edtPassword;
            private Button btnLogin;


    private ServicePeliculas sPeliculas = new ServicePeliculas(this);
    private static MainActivity mainActivity = null;

    public static MainActivity getInstance() {
        return mainActivity;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        initComponents();
    }
    private void initComponents(){
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

    }


    @Override
    public void showPeliculas(String messagge) {

    }
}