package com.example.juanpablo.punto2lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Numero1 = (EditText) findViewById(R.id.eNumero1);
        final EditText Numero2 = (EditText) findViewById(R.id.eNumero2);
        Button Calcular = (Button) findViewById(R.id.eCalcular);
        final RadioGroup Rd = (RadioGroup) findViewById(R.id.eRadioGroup);
        final TextView Respuesta = (TextView) findViewById(R.id.eResultado);

        Calcular.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                double resultado = 0, num1, num2;
                num1 = Double.parseDouble(Numero1.getText().toString());
                num2 = Double.parseDouble(Numero2.getText().toString());
                if (Rd.getCheckedRadioButtonId() == R.id.eSuma) {
                    resultado = num1 + num2;

                } else if (Rd.getCheckedRadioButtonId() == R.id.eResta) {
                    resultado = num1 - num2;



                } else if (Rd.getCheckedRadioButtonId() == R.id.eMultiplicación) {
                    resultado = num1 * num2;

                }
                 else if (Rd.getCheckedRadioButtonId() == R.id.eDivision) {
                    resultado = num1/num2;

                }
                Respuesta.setText(String.valueOf(resultado));
            }
        });





    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
