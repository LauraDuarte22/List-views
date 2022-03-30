package co.edu.unipiloto.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ReciclajeActivity extends AppCompatActivity {

    public static final String  EXTRA_RECICLAJEID="reciclajeid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclaje);

        int id=(Integer)getIntent().getExtras().get(EXTRA_RECICLAJEID);
        Reciclaje tipo = Reciclaje.tipos[id];

        TextView name = findViewById(R.id.nombre);
        name.setText(tipo.getTipo());

        TextView description = findViewById(R.id.desciption);
        description.setText(tipo.getDescription());

        ImageView foto = findViewById(R.id.foto);
        foto.setImageResource(tipo.getImageId());
        foto.setContentDescription(tipo.getTipo());
    }
}