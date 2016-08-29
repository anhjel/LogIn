package com.protonics.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//------------------------cachando parametros--------------------
        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("iNombre");
        String telefono =  parametros.getString("iTelefono");
        String email =  parametros.getString("iEmail");
        String desc =  parametros.getString("iDesc");
        int np = parametros.getInt("np");
        int np2 = parametros.getInt("np2");
        int np3 = parametros.getInt("np3");

//------------------------ declarando textview--------------------

        TextView tvNombre = (TextView)findViewById(R.id.tvNombre);
        String nombree= "Nombre: " + nombre;
        tvNombre.setText(nombree);
        TextView tvFecha = (TextView)findViewById(R.id.tvFecha);
        String fechaa = "Fecha de nacimiento: " +String.valueOf(np)+"/"+String.valueOf(np2)+"/"+String.valueOf(np3);
        tvFecha.setText(fechaa);
        TextView tvTelefono = (TextView)findViewById(R.id.tvTelefono);
        String telefonoo = "Telefono: " + telefono;
        tvTelefono.setText(telefonoo);
        TextView tvEmail = (TextView)findViewById(R.id.tvEmail);
        String emaill = "Email: " + email;
        tvEmail.setText(emaill);
        TextView tvDesc = (TextView)findViewById(R.id.tvDesc);
        String descc = "Descripción: " + desc;
        tvDesc.setText(descc);
//---------------------------boton regreso--------------------
        final Button bSiguiente = (Button) findViewById(R.id.bRegreso);

        bSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle parametros = getIntent().getExtras();
                String nombre = parametros.getString("iNombre");
                String telefono =  parametros.getString("iTelefono");
                String email =  parametros.getString("iEmail");
                String desc =  parametros.getString("iDesc");
                int np = parametros.getInt("np");
                int np2 = parametros.getInt("np2");
                int np3 = parametros.getInt("np3");

                Intent regreso = new Intent(Main2Activity.this, MainActivity.class);
                regreso.putExtra("regNombre",nombre );
                regreso.putExtra("regTelefono",telefono);
                regreso.putExtra("regEmail" ,email);
                regreso.putExtra("regDesc" ,desc);
                regreso.putExtra("regDP1", np);
                regreso.putExtra("regDP2", np2);
                regreso.putExtra("regDP3", np3);

                startActivity(regreso);
            }
        });

    }
}
