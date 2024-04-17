package com.example.Store.servicios;

import com.example.Store.helpers.Productovalidacion;
import com.example.Store.modelos.Producto;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.IllegalFormatCodePointException;
import java.util.List;

public class ProductoServicio {
    @Autowired
    Productovalidacion productovalidacion;
    @Autowired
    ProductoRepositorio productoRepositorio;

    // En el servicio se crea un metodo para cada una de las consultas a realizar en BD
    // guardar usuario

    public Producto guardarProducto (Producto datosProducto) throws Exception{

        try{

            if (!productovalidacion.validarNombreProducto(datosProducto.getNombreProducto())){
                throw new Exception("NOMBRE VALIDOS, REVISE POR FABOR ");
            }
            if (!productovalidacion.validarREferencia(datosProducto.getReferencia())){
                throw new Exception("Descripcion no valida, revise por favor");
            }
            if (!productovalidacion.validsTalla(datosProducto.getTalla())){
                throw new Exception("Talle no valida, por favor verfique");
            }
            if (!productovalidacion.validarCantidadBodega(datosProducto.getCantidadBodega())){
                throw new Exception("Cantidad no valida, verifique que sus numeros sean positivos");
            }
            if (!productovalidacion.validarPrecioUnitario(datosProducto.getPrecioUnitario())){
                throw new Exception("precio no valido, verifique que sus numeros sean positivos");
            }
            if (!productovalidacion.validarDescripcion(datosProducto.getDescripcion())){
                throw new Exception("error, verifique la cantidad de caracteres");
            }
            if (!productovalidacion.valirdarFotografia(datosProducto.getFotografia())){
                throw new Exception("Cantidad de carateres no valida");
            }
            return productoRepositorio.save(datosProducto);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    public Producto guardarProducto(){
        return null;
    }

    // consultar usuario en bd por id
    public Producto buscarProductoPorId(Integer idProducto)throws Exception {
        try {
            if (productoRepositorio.findById(idProducto).isPresent()){
                return productoRepositorio.findById(idProducto).get();
            }else{
                throw new Exception("Producto no encontrado, por favor verifique");
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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
