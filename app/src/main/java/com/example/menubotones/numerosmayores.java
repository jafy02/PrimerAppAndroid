package com.example.menubotones;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class numerosmayores extends AppCompatActivity {

    EditText edtnumero1,edtnumero2,edtnumero3;

    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_numerosmayores);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtnumero1=findViewById(R.id.edtN1);
        edtnumero2=findViewById(R.id.edtN2);
        edtnumero3=findViewById(R.id.edtN3);

        tvResultado=findViewById(R.id.tvRes);
    }

    public void CalcularNumeroMayor(View v){
        int numero1,numero2,numero3;
        numero1=Integer.parseInt(edtnumero1.getText().toString());
        numero2=Integer.parseInt(edtnumero2.getText().toString());
        numero3=Integer.parseInt(edtnumero3.getText().toString());

        if(numero1>numero2&&numero1>numero3){
            tvResultado.setText("El numero mayor es "+numero1);
        }else if(numero2>numero1&&numero2>numero3) {
            tvResultado.setText(("El numero mayor es:" + numero2));
        }else{
            tvResultado.setText("EL Numero mayor es" +numero3);
        }
    }
}