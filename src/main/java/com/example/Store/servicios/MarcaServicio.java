package com.example.Store.servicios;

import com.example.Store.helpers.Marcavalidacion;
import com.example.Store.modelos.Marca;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MarcaServicio {
    @Autowired
    Marcavalidacion marcavalidacion;
    @Autowired
    MarcaRepositorio marcaRepositorio;

    // En el servicio se crea un metodo para cada una de las consultas a realizar en BD
    // guardar usuario

    public Marca guardarMarca(){
        return null;
    }

    // consultar usuario en bd por id
    public Marca buscarMarcaPorId(){
        return null;
    }

    //consultar todos los usuarios

    public List<Marca> buscarTodasMarcas(){
        return null;
    }

    // editar un usuario

    public Marca editarMarca(){
        return null;
    }

    // eliminar un usuario
    public Boolean eliminarMarca(){
        return true;
    }
}
