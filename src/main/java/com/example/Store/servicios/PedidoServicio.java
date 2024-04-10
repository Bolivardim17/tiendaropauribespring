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

    public Pedido guardarPedido(){
        return null;
    }

    // consultar usuario en bd por id
    public Pedido buscarPedidoPorId(){
        return null;
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
