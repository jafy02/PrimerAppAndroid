package com.example.menubotones;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class areacalcular extends AppCompatActivity {



    private EditText EDTBASE,EDTALTURA;
    private TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_area);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EDTBASE=findViewById(R.id.edtBase);
        EDTALTURA=findViewById(R.id.edtAltura);
        tvResultado=findViewById(R.id.textViewResultado);

    }

    private void CalcularArea(){
        String base=EDTBASE.getText().toString();
        String altura=EDTALTURA.getText().toString();

        if(!base.isEmpty()&&!altura.isEmpty()){
            double nBase=Double.parseDouble(base);
            double nAlta =Double.parseDouble(altura);

            double nArea=(nBase* nAlta)/2;
            tvResultado.setText("El area es: " + nArea);
            Toast.makeText(this,"El area es: "+nArea,Toast.LENGTH_LONG).show();

        }

    }
    public void Areatriangulo(View v){
        CalcularArea();
    }
}