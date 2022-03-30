package co.edu.unipiloto.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(TopLevel.this, ReciclajeCategoria.class));
                }
                if (i==1){
                    startActivity(new Intent(TopLevel.this, ColorCategoria.class));
                }


            }
        };
        ListView list =(ListView) findViewById(R.id.list_options);
        list.setOnItemClickListener(itemClickListener);
    }
}
