package com.example.android.gridviewpropuesto02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //código nuestro
        Bundle bundle = getIntent().getExtras();
        int dato = bundle.getInt("id");


        ListView list = (ListView) findViewById(R.id.listView);
        TextView titulo = (TextView) findViewById(R.id.lbl_titulo);


        ArrayAdapter adaptador;
        switch (dato){
            case 0: adaptador = new TareaArrayAdapter<Tarea>(this, DataSource1.TAREAS); titulo.setText("Cervezas"); break;
            case 1: adaptador = new TareaArrayAdapter<Tarea>(this, DataSource2.TAREAS); titulo.setText("Vinos");break;
            default: adaptador = null;
        }

        list.setAdapter(adaptador);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Tarea t = (Tarea) parent.getItemAtPosition(position);

                //Toast.makeText(getApplicationContext(),
                //        t.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void salir(View v) {
        finish();
    }

}
