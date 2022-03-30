package co.edu.unipiloto.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ReciclajeCategoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclaje_categoria);

        ArrayAdapter<Reciclaje> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Reciclaje.tipos);

        ListView listView = (ListView)findViewById(R.id.list_reclicaje);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(ReciclajeCategoria.this,ReciclajeActivity.class);
                intent.putExtra(ReciclajeActivity.EXTRA_RECICLAJEID,(int) l);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}
