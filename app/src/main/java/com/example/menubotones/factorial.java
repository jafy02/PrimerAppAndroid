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

import java.math.BigInteger;

public class factorial extends AppCompatActivity {

    EditText edtFact;
    TextView tvFact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_factorial);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtFact=findViewById(R.id.edtFactorial);
        tvFact=findViewById(R.id.tvFactorial);
    }
    public void CalcularFactorial(View v){
        String sNumero=edtFact.getText().toString();
        if(sNumero.isEmpty()){
            tvFact.setText("Debe de introducir un numero");
        }
        int numero=Integer.parseInt(sNumero);
        if (numero < 0) {
            tvFact.setText("El numero no puede ser negativo");
        }
        BigInteger factorialResult=CalcateFactorial(numero);
        tvFact.setText("El factorial de "+numero+ " es "+ factorialResult);
    }

    private BigInteger CalcateFactorial(int n){
        BigInteger res=BigInteger.ONE;
        for(int i=2;i<=n;i++){
            res=res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

}