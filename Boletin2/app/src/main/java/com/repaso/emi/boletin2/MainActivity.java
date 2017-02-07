package com.repaso.emi.boletin2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_main___btn_main_activity) Button button;
    @BindView(R.id.activity_second___image_view)ImageView imageView;
    @BindView(R.id.activity_main___edit_text) EditText editText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Define el campo de texto
                String nombre_usuario = editText.getText().toString();

                //Define el bundle
                Bundle parametros = new Bundle();
                parametros.putString("nombre", nombre_usuario);

                //Define la actividad
                Intent i = new Intent(MainActivity.this, SecondActivity.class);

                i.putExtras(parametros);

                //Inicia la actividad
                startActivity(i);

            }
        });








    }
}
