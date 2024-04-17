package com.example.Store.servicios;

import com.example.Store.helpers.Pedidovalidacion;
import com.example.Store.modelos.Pedido;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PedidoServicio {

    @Autowired
    Pedidovalidacion pedidovalidacion;
    @Autowired
    PedidoRepositorio pedidoRepositorio;

    // En el servicio se crea un metodo para cada una de las consultas a realizar en BD
    // guardar usuario
    public Pedido guardarPedido (Pedido datosPedidos) throws  Exception{
        try {
            if (!pedidovalidacion.validarFechaYHora(datosPedidos.getFechaYHora())){
                throw new Exception("fecha no valida, verifique el el formato");
            }

            return pedidoRepositorio.save(datosPedidos);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Pedido guardarPedido(){
        return null;
    }

    // consultar usuario en bd por id
    public Pedido buscarPedidoPorId(Integer idPedido) throws Exception {
        try {
            if (pedidoRepositorio.findById(idPedido).isPresent()){
                return pedidoRepositorio.findById(idPedido).get();
            }else{
                throw new Exception("pedido no encontrado, verifique su id");
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //consultar todos los usuarios

    public List<Pedido> buscarTodosPedidos(){
        return null;
    }

    // editar un usuario

    public Pedido editarPedido(){
        return null;
    }

    // eliminar un usuario
    public Boolean eliminarPedido(){
        return true;
    }

}
