package com.example.juanpablo.punto4lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
        final EditText Base = (EditText) findViewById(R.id.eBase);
        final EditText Altura= (EditText) findViewById(R.id.eAltura);
        final EditText Radio= (EditText)  findViewById(R.id.eRadio);
        final TextView TexBase= (TextView)  findViewById(R.id.textView2);
        final TextView TexAltura= (TextView)  findViewById(R.id.textView3);
        final TextView TexRadio= (TextView)  findViewById(R.id.textView4);
        Button Calcular=(Button) findViewById(R.id.bCalcular);
        final RadioGroup Rd= (RadioGroup) findViewById(R.id.radioGroup);
        final RadioButton RBcirculo= (RadioButton) findViewById(R.id.bCirculo);
        final RadioButton RBcuadrado= (RadioButton) findViewById(R.id.bCuadrado);
        final RadioButton RBtriangulo= (RadioButton) findViewById(R.id.bTriangulo);
        final RadioButton RBrectangulo= (RadioButton) findViewById(R.id.bRectangulo);
        final TextView Respuesta = (TextView) findViewById(R.id.eArea);

        RBcirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TexRadio.setVisibility(View.INVISIBLE);
                Radio.setVisibility(View.INVISIBLE);
                TexBase.setVisibility(View.INVISIBLE);
                Base.setVisibility(View.INVISIBLE);
                TexAltura.setVisibility(View.INVISIBLE);
                Altura.setVisibility(View.INVISIBLE);


                Radio.setVisibility(View.VISIBLE);
                TexRadio.setVisibility(View.VISIBLE);
            }

        });

        RBcuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TexRadio.setVisibility(View.INVISIBLE);
                Radio.setVisibility(View.INVISIBLE);
                TexBase.setVisibility(View.INVISIBLE);
                Base.setVisibility(View.INVISIBLE);
                TexAltura.setVisibility(View.INVISIBLE);
                Altura.setVisibility(View.INVISIBLE);


                TexBase.setVisibility(View.VISIBLE);
                Base.setVisibility(View.VISIBLE);
            }

        });

        RBrectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TexRadio.setVisibility(View.INVISIBLE);
                Radio.setVisibility(View.INVISIBLE);
                TexBase.setVisibility(View.INVISIBLE);
                Base.setVisibility(View.INVISIBLE);
                TexAltura.setVisibility(View.INVISIBLE);
                Altura.setVisibility(View.INVISIBLE);

                TexBase.setVisibility(View.VISIBLE);
                Base.setVisibility(View.VISIBLE);
                Altura.setVisibility(View.VISIBLE);
                TexAltura.setVisibility(View.VISIBLE);
            }

        });

        RBtriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TexRadio.setVisibility(View.INVISIBLE);
                Radio.setVisibility(View.INVISIBLE);
                TexBase.setVisibility(View.INVISIBLE);
                Base.setVisibility(View.INVISIBLE);
                TexAltura.setVisibility(View.INVISIBLE);
                Altura.setVisibility(View.INVISIBLE);


                TexBase.setVisibility(View.VISIBLE);
                Base.setVisibility(View.VISIBLE);
                Altura.setVisibility(View.VISIBLE);
                TexAltura.setVisibility(View.VISIBLE);
            }

        });

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double base=0, altura=0, radio=0, area=0;

                if (Rd.getCheckedRadioButtonId() == R.id.bCirculo) {
                    radio = Double.parseDouble(Radio.getText().toString());
                    area =3.1614*(radio*radio);


                }
                else if (Rd.getCheckedRadioButtonId() == R.id.bCuadrado) {
                    base = Double.parseDouble(Base.getText().toString());
                    area = base*base;



                }
                else if (Rd.getCheckedRadioButtonId() == R.id.bRectangulo) {
                    base = Double.parseDouble(Base.getText().toString());
                    altura = Double.parseDouble(Altura.getText().toString());
                    area = base*altura;


                }
                else if (Rd.getCheckedRadioButtonId() == R.id.bTriangulo) {
                    base = Double.parseDouble(Base.getText().toString());
                    altura = Double.parseDouble(Altura.getText().toString());
                    area = (base*altura)/2;


                }
                Respuesta.setText(String.valueOf(area));

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
