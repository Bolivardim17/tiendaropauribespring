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
    public Marca guardarMarca (Marca datosMarca) throws Exception{
        try {
            if (!marcavalidacion.validarnombreMarca(datosMarca.getNombreMarca())){
                throw new Exception("Nombre no valido, verifique por favor");
            }
            if (!marcavalidacion.validarNit(datosMarca.getNit())){
                throw new Exception("nit no valido, solo ingrese numeros");
            }
            if (!marcavalidacion.validarAnoCreacion(datosMarca.getAnoCreacion())){
                throw new Exception("Año no valido, por favor verifique");
            }
            return marcaRepositorio.save(datosMarca);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Marca guardarMarca(){
        return null;
    }

    // consultar usuario en bd por id
    public Marca buscarMarcaPorId(Integer idMarca) throws Exception{
        try {
            if (marcaRepositorio.findById(idMarca).isPresent()){
                return marcaRepositorio.findById(idMarca).get();
            }else{
                throw new Exception("Marca no enocontrada, verifique el id");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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
