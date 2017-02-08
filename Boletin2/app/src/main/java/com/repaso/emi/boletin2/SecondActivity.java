package com.repaso.emi.boletin2;

        import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.widget.ImageView;
        import android.widget.TextView;

import butterknife.BindView;
        import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.activity_second___text_view)TextView textView;
    @BindView(R.id.activity_second___image_view)ImageView imageView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);


        Intent i = this.getIntent();
        String recibir = i.getStringExtra("cadena");
        Log.d("HOLA", "" + recibir);

        //Bundle parametros = this.getIntent().getExtras(); //Definimos el contenedor de parametros
        //String nombre = parametros.getString("nombre"); //Guardamos el parametro nombre en la variable nombre
        textView.setText(recibir); //Mostramos el texto
    }
}
