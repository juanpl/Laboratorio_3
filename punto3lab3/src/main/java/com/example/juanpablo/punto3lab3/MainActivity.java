package com.example.juanpablo.punto3lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText notaQuiz = (EditText) findViewById(R.id.editText1);
        final EditText notaExpo = (EditText) findViewById(R.id.editText2);
        final EditText notaLab = (EditText) findViewById(R.id.editText3);
        final EditText notaProF = (EditText) findViewById(R.id.editText4);
        Button Calcular=(Button) findViewById(R.id.button);
        final TextView NotaDef= (TextView) findViewById(R.id.textView6);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double definitiva, notaQ, notaL, notaP, notaE;
                notaQ = Double.parseDouble(notaQuiz.getText().toString())*0.15;
                notaL = Double.parseDouble(notaExpo .getText().toString())*0.40;
                notaP = Double.parseDouble(notaLab.getText().toString())*0.35;
                notaE = Double.parseDouble(notaProF.getText().toString())*0.10;

                definitiva=notaQ+notaL+notaP+notaE;

                NotaDef.setText(String.valueOf(definitiva));






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
