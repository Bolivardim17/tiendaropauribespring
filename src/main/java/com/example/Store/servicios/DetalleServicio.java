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
    public Detalle guardarDetalle (Detalle datosDetalle) throws Exception{
        try {
            if (!detallevalidacion.validarCostoTotal(datosDetalle.getCostoTotal())){
                throw new Exception("costo no valido, ingrese valores positivos");
            }
            if (!detallevalidacion.validarcantidadProductos(datosDetalle.getCantidadProductos())){
                throw new Exception("cantidad no valida, verifique que la cantidad sea positiva");
            }
            return detalleRepositorio.save(datosDetalle);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Detalle guardarDetalle(){
        return null;
    }

    // consultar usuario en bd por id
    public Detalle buscarDetallePorId(Integer idDetalle) throws Exception{
        try {
            if (detalleRepositorio.findById(idDetalle).isPresent()){
                return detalleRepositorio.findById(idDetalle).get();
            }else{
                throw new Exception("no encontrado veriofique");
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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
