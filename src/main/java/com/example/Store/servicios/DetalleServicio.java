package com.example.Store.servicios;

import com.example.Store.helpers.Detallevalidacion;
import com.example.Store.modelos.Detalle;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.DetalleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetalleServicio {
    @Autowired
    Detallevalidacion detallevalidacion;
    @Autowired
    DetalleRepositorio detalleRepositorio;
    // En el servicio se crea un metodo para cada una de las consultas a realizar en BD
    // guardar usuario

    public Detalle guardarDetalle(){
        return null;
    }

    // consultar usuario en bd por id
    public Detalle buscarDetallePorId(){
        return null;
    }

    //consultar todos los usuarios

    public List<Detalle> buscarTodosDetalles(){
        return null;
    }

    // editar un usuario

    public Detalle editarDetalle(){
        return null;
    }

    // eliminar un usuario
    public Boolean eliminarDetalle(){
        return true;
    }

}
