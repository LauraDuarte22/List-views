package co.edu.unipiloto.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ColorCategoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_categoria);


        ArrayAdapter<ColorReciclaje> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                ColorReciclaje.colores);

        ListView listView = (ListView)findViewById(R.id.list_reclicaje);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(ColorCategoria.this,ColorActivity.class);
                intent.putExtra(ColorActivity.EXTRA_COLORID,(int) l);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
    }
