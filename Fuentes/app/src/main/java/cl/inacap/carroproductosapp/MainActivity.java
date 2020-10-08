package cl.inacap.carroproductosapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import cl.inacap.carroproductosapp.adapters.ProductosArrayAdapter;
import cl.inacap.carroproductosapp.dao.ProductosDAO;
import cl.inacap.carroproductosapp.dao.ProductosDAOLista;
import cl.inacap.carroproductosapp.dto.Producto;

public class MainActivity extends AppCompatActivity {

    private ListView productosLv;
    private List<Producto> productos;
    private ProductosArrayAdapter adaptador;
    private ProductosDAO productosDAO = ProductosDAOLista.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        productos = productosDAO.getAll();
        adaptador = new ProductosArrayAdapter(this,R.layout.productos_list,productos);
        productosLv=findViewById(R.id.productos_lv);
        productosLv.setAdapter(adaptador);

    }
}