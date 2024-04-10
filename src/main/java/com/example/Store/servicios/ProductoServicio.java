package com.example.Store.servicios;

import com.example.Store.helpers.Productovalidacion;
import com.example.Store.modelos.Producto;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductoServicio {
    @Autowired
    Productovalidacion productovalidacion;
    @Autowired
    ProductoRepositorio productoRepositorio;

    // En el servicio se crea un metodo para cada una de las consultas a realizar en BD
    // guardar usuario

    public Producto guardarProducto(){
        return null;
    }

    // consultar usuario en bd por id
    public Producto buscarProductoPorId(){
        return null;
    }

    //consultar todos los usuarios

    public List<Producto> buscarTodosProductos(){
        return null;
    }

    // editar un usuario

    public Producto editarProducto(){
        return null;
    }

    // eliminar un usuario
    public Boolean eliminarProducto(){
        return true;
    }

}
