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

    public Usuario guardarUsuario(Usuario datosUsuario) throws Exception {

        try {
            if (usuarioValidacion.validarNombres(datosUsuario.getNombres()) == true) {
                if (usuarioValidacion.validarCedula(datosUsuario.getCedula()) == true) {
                    if (usuarioValidacion.validarCorreo(datosUsuario.getCorreo()) == true) {
                        if (usuarioValidacion.validarSexo(datosUsuario.getSexo()) == true) {
                            if (usuarioValidacion.validaCodigo(datosUsuario.getCodigoPostal())==true){


                                return usuarioRepositorio.save(datosUsuario);

                        }


                    }
                }
            }

        }
            return null;



        }catch (Exception error){
            throw new Exception(error.getMessage());

        }

    }

    // consultar usuario en bd por id
    public Usuario buscarUsuarioPorID(Integer idUsuario) throws Exception{
        try {
            if (usuarioRepositorio.findById(idUsuario).isPresent()){
                return usuarioRepositorio.findById(idUsuario).get();
            }else{
                throw new Exception("usuario no encontrado");
            }

        }catch (Exception error){

            throw new Exception(error.getMessage());

        }
    }

    //consultar todos los usuarios

    public List<Usuario> buscarTodosUsuarios() throws Exception{
           try{
               return usuarioRepositorio.findAll();
           }catch (Exception error){
               throw new Exception(error.getMessage());
           }
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
