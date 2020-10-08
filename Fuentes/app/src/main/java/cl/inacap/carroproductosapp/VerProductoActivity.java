package cl.inacap.carroproductosapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import cl.inacap.carroproductosapp.dto.Producto;

public class VerProductoActivity extends AppCompatActivity {

    private TextView nombreTxt;
    private Toolbar toolbar;
    private ImageView imagenProd;
    private TextView precioProd;
    private TextView descProd;
    private TextView tituloToolbar;
    @Override
    public boolean onSupportNavigateUp() {
            onBackPressed();
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_producto);
        this.toolbar = findViewById(R.id.toolbar);
        this.nombreTxt = findViewById(R.id.nombreProdTxt);
        this.imagenProd = findViewById(R.id.imagen_prod_view);
        this.descProd = findViewById(R.id.desc_prod_view);
        this.precioProd = findViewById(R.id.precio_prod_view);
        this.tituloToolbar = findViewById(R.id.titulo_toolbar);
        this.setSupportActionBar(this.toolbar);
        //Permite ir hacia atras
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //MUESTRA EL ICONO
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);

        if(getIntent()!= null){
            //me enviaron cosas y vengo desde otro activity
            Producto producto = (Producto) getIntent().getSerializableExtra("producto");
            this.tituloToolbar.setText(producto.getNombre());
            this.nombreTxt.setText(producto.getNombre());
            Picasso.get().load(producto.getFoto())
                    .resize(500,500)
                    .centerCrop()
                    .into(this.imagenProd);
            this.descProd.setText(producto.getDescripcion());
            this.precioProd.setText("$"+producto.getPrecio());
        }
    }


}