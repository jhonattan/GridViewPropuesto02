package com.example.android.gridviewpropuesto02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANDROID on 27/08/2016.
 */
public class DataSource1 {
    static List TAREAS = new ArrayList<Tarea>();

    static{

        TAREAS.add(new Tarea("Cristal","S/.4.00","100",R.drawable.blue));
        TAREAS.add(new Tarea("Pilsen","S/.4.20","150",R.drawable.green));
        TAREAS.add(new Tarea("Cuzqueña","S/.5.00","135",R.drawable.red));
        TAREAS.add(new Tarea("Barena","S/.3.50","112",R.drawable.yellow));
    }
}
