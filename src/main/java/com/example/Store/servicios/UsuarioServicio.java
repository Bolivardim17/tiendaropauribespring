package com.example.Store.servicios;

import com.example.Store.helpers.UsuarioValidacion;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {
    // en los servicios debo inyectar las dependencias de las validaciones y las consultas o repositorios

    @Autowired
    UsuarioValidacion usuarioValidacion;
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    // En el servicio se crea un metodo para cada una de las consultas a realizar en BD
    // guardar usuario

    public Usuario guardarUsuario(){
        return null;
    }

    // consultar usuario en bd por id
    public Usuario buscarUsuarioPorID(){
        return null;
    }

    //consultar todos los usuarios

    public List<Usuario> buscarTodosUsuarios(){
        return null;
    }

    // editar un usuario

    public Usuario editarUsuario(){
        return null;
    }

    // eliminar un usuario
    public Boolean eliminarUsuario(){
        return true;
    }

}
