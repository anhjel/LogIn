package com.protonics.login;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//-------------------------------obteniendo valores EditText, Pickers--------------------------------------
        final NumberPicker np = (NumberPicker) findViewById(R.id.pickerFecha1);
        np.setMinValue(1);
        np.setMaxValue(31);
        np.setWrapSelectorWheel(true);
        final NumberPicker np2 = (NumberPicker) findViewById(R.id.pickerFecha2);
        np2.setMinValue(1);
        np2.setMaxValue(12);
        np2.setWrapSelectorWheel(true);
        final NumberPicker np3 = (NumberPicker) findViewById(R.id.pickerFecha3);
        np3.setMinValue(1990);
        np3.setMaxValue(2016);
        np3.setWrapSelectorWheel(true);
        final TextInputLayout etNombre = (TextInputLayout) findViewById(R.id.etNombre);
        EditText tilNombre = (EditText) findViewById(R.id.tilNombre);
        final TextInputLayout etTelefono = (TextInputLayout) findViewById(R.id.etTelefono);
        EditText tilTelefono = (EditText) findViewById(R.id.tilTelefono);
        final TextInputLayout etEmail = (TextInputLayout) findViewById(R.id.etEmail);
        EditText tilEmail = (EditText) findViewById(R.id.tilEmail);
        final TextInputLayout etDesc = (TextInputLayout) findViewById(R.id.etDesc);
        EditText tilDesc = (EditText) findViewById(R.id.tilDesc);
        final Button bSiguiente = (Button) findViewById(R.id.bSiguiente);
//-----------------------------------------------------

        Bundle parametrosReg = getIntent().getExtras();

        if (parametrosReg != null ){
            String nombreReg = parametrosReg.getString("regNombre");
            tilNombre.setText(nombreReg);
            String telefonoReg = parametrosReg.getString("regTelefono");
            tilTelefono.setText(telefonoReg);
            String emailReg = parametrosReg.getString("regEmail");
            tilEmail.setText(emailReg);
            String descReg = parametrosReg.getString("regDesc");
            tilDesc.setText(descReg);
            int dp1 = parametrosReg.getInt("regDP1");
            np.setValue(dp1);
            int dp2 = parametrosReg.getInt("regDP2");
            np2.setValue(dp2);
            int dp3 = parametrosReg.getInt("regDP3");
            np3.setValue(dp3);

           bSiguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String sNombre = etNombre.getEditText().getText().toString();
                    String sTelefono = etTelefono.getEditText().getText().toString();
                    String sEmail = etEmail.getEditText().getText().toString();
                    String sDesc = etDesc.getEditText().getText().toString();
                    int r = np.getValue();
                    int r2 = np2.getValue();
                    int r3 = np3.getValue();

                    Intent cambio = new Intent(MainActivity.this, Main2Activity.class);
                    cambio.putExtra("np",r);
                    cambio.putExtra("np2",r2);
                    cambio.putExtra("np3",r3);
                    cambio.putExtra("iNombre",sNombre );
                    cambio.putExtra("iTelefono", sTelefono);
                    cambio.putExtra("iEmail", sEmail);
                    cambio.putExtra("iDesc", sDesc);

                    startActivity(cambio);
                }
            });
        }
        else{
            bSiguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String sNombre = etNombre.getEditText().getText().toString();
                    String sTelefono = etTelefono.getEditText().getText().toString();
                    String sEmail = etEmail.getEditText().getText().toString();
                    String sDesc = etDesc.getEditText().getText().toString();
                    int r = np.getValue();
                    int r2 = np2.getValue();
                    int r3 = np3.getValue();

                    Intent cambio = new Intent(MainActivity.this, Main2Activity.class);
                    cambio.putExtra("np",r);
                    cambio.putExtra("np2",r2);
                    cambio.putExtra("np3",r3);
                    cambio.putExtra("iNombre",sNombre );
                    cambio.putExtra("iTelefono", sTelefono);
                    cambio.putExtra("iEmail", sEmail);
                    cambio.putExtra("iDesc", sDesc);

                    startActivity(cambio);
                }
            });
        }
    }
}

