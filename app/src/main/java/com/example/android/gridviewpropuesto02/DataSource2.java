package com.example.android.gridviewpropuesto02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANDROID on 27/08/2016.
 */
public class DataSource2 {
    static List TAREAS = new ArrayList<Tarea>();

    static{

        TAREAS.add(new Tarea("Tinto","S/.35.99","80",R.drawable.blue));
        TAREAS.add(new Tarea("Borgoña","S/.65.30","50",R.drawable.green));
        TAREAS.add(new Tarea("Semi Seco","S/.55.00","95",R.drawable.red));
        TAREAS.add(new Tarea("Rosé","S/.63.50","102",R.drawable.yellow));
    }
}
