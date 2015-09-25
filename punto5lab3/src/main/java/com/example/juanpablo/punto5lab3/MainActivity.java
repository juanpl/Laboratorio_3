package com.example.juanpablo.punto5lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Nombre = (EditText) findViewById(R.id.eNombre);
        final EditText Apellido = (EditText) findViewById(R.id.eApellido);
        final EditText Identificacion = (EditText) findViewById(R.id.eIdentificacion);
        final RadioGroup RG = (RadioGroup) findViewById(R.id.RG);
        Button Capturar=(Button) findViewById(R.id.bCapturar);
        final TextView Informacion = (TextView) findViewById(R.id.eInformacion);
        final CheckBox Pintura= (CheckBox) findViewById(R.id.chPintura);
        final CheckBox Natacion= (CheckBox) findViewById(R.id.chNatacion);
        final CheckBox Video_Juegos= (CheckBox) findViewById(R.id.chVideo);
        final CheckBox Fotografia= (CheckBox) findViewById(R.id.chFotografia);



        Capturar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dia, mes, año;
                String nombre, apellido, sexo = null, hobbi1= null, hobbi2= null, hobbi3= null, hobbi4= null;
                double identificacion;
                nombre = Nombre.getText().toString();
                apellido = Apellido.getText().toString();
                identificacion = Double.parseDouble(Identificacion.getText().toString());



                if(RG.getCheckedRadioButtonId()==R.id.bMasculino){
                    sexo="Masculino";
                }
                else if(RG.getCheckedRadioButtonId()==R.id.bFemenino){
                    sexo="Femenino";
                }

               if (Pintura.isChecked()){
                   hobbi2=" Pintura ";
               }
                else{
                   hobbi2="-";
               }

                if (Natacion.isChecked()){
                    hobbi1=" Natación ";
                }
                else{
                    hobbi1="-";
                }

                if (Fotografia.isChecked()){
                    hobbi3=" Fotografia ";
                }
                else{
                    hobbi3="-";
                }

                if (Video_Juegos.isChecked()){
                    hobbi4=" Video Juegos ";
                }
                else{
                    hobbi4="-";
                }



                Informacion.setText("Los Datos son:\nnombre:"+nombre+"\n"+"Apellido:"+apellido+"\n"+"Identificación:"+identificacion+"\n"+"Sexo:"+sexo+"\n"+"Hobbies:"+hobbi1+hobbi2+hobbi3+hobbi4);

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
