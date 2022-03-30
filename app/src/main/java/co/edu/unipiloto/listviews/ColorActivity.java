package co.edu.unipiloto.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {
    public static final String  EXTRA_COLORID="colorid";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);


        int id=(Integer)getIntent().getExtras().get(EXTRA_COLORID);
        ColorReciclaje color = ColorReciclaje.colores[id];

        TextView name = findViewById(R.id.nombre);
        name.setText(color.getTipo());

        TextView description = findViewById(R.id.desciption);
        description.setText(color.getDescription());

        ImageView foto = findViewById(R.id.foto);
        foto.setImageResource(color.getImageId());
        foto.setContentDescription(color.getTipo());
    }
}