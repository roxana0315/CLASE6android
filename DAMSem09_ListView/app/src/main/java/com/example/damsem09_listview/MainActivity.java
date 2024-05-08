package com.example.damsem09_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    ListView lista;
    List<String> Estudiantes ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("LISTA DE ESTUDIANTES");
        lista=findViewById(R.id.listView);

        Estudiantes=new ArrayList<>();
        Estudiantes.add("Rakauscas");
        Estudiantes.add("Prado");
        Estudiantes.add("Baldeon");
        Estudiantes.add("Vargas");
        Estudiantes.add("Venturi");
        Estudiantes.add("...");

        ArrayAdapter AdaptadorEstudiante=new ArrayAdapter<>(
                this,
                 android.R.layout.simple_list_item_1,Estudiantes
        );
lista.setAdapter(AdaptadorEstudiante);
lista.setOnItemClickListener(this);


    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String nombreEstudiante = Estudiantes.get(position);
        Log.i("DAM","Estudiante Seleccionado:" + nombreEstudiante);
    }
}




