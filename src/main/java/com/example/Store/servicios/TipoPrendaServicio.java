package com.example.Store.servicios;

import com.example.Store.helpers.TipoproductoValidacion;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.TipoPrendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TipoPrendaServicio {

    @Autowired
    TipoproductoValidacion tipoproductoValidacion;
    @Autowired
    TipoPrendaRepositorio tipoPrendaRepositorio;

    // En el servicio se crea un metodo para cada una de las consultas a realizar en BD
    // guardar usuario

    public TipoPrenda guardarTipoPrenda(){
        return null;
    }

    // consultar usuario en bd por id
    public TipoPrenda buscarTipoPrendaPorId(){
        return null;
    }

    //consultar todos los usuarios

    public List<TipoPrenda> buscarTodosLasPrendas(){
        return null;
    }

    // editar un usuario

    public TipoPrenda editarTipoPrenda(){
        return null;
    }

    // eliminar un usuario
    public Boolean eliminarTipoPrenda(){
        return true;
    }

}
