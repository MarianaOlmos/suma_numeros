package olmos.mariana.suma_numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Num1, Num2;
    Button Button1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1 = findViewById(R.id.num1);
        Button1 = findViewById(R.id.button1);
        Num2 = findViewById(R.id.num2);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(Num1.getText().toString());
                int valor2 = Integer.parseInt(Num2.getText().toString());
                int result = valor1 + valor2;
                mensajito("La suma es: "+result);

            }
        });
    }
    public void mensajito(String mensaje){

        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}

