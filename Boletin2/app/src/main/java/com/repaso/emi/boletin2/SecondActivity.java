package com.repaso.emi.boletin2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.activity_second___text_view)TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle parametros = this.getIntent().getExtras(); //Definimos el contenedor de parametros
        String nombre = parametros.getString("nombre"); //Guardamos el parametro nombre en la variable nombre
        textView.setText("¡Hola "+nombre+"!"); //Mostramos el texto
    }
}
