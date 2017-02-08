package com.repaso.emi.boletin2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_main___btn_main_activity) Button button;
    @BindView(R.id.activity_main___edit_text) EditText editText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Define el campo de texto
                String nombre_usuario = editText.getText().toString();//geText coge lo escrito en el editText y .toString lo convierte en una cadena de texto.

                //Define el bundle
              //  Bundle parametros = new Bundle();
               // parametros.putString("nombre", nombre_usuario);

                //Define la actividad
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("cadena", nombre_usuario);

               // i.putExtras(parametros);

                //Inicia la actividad
                startActivity(i);

            }
        });








    }
}
