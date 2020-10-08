package cl.inacap.carroproductosapp.dao;

import java.util.List;

import cl.inacap.carroproductosapp.dto.Producto;

public interface ProductosDAO{
    List<Producto> getAll();
    Producto save(Producto p);

}
