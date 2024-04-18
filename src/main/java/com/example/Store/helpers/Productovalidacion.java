package com.example.Store.helpers;

import org.springframework.stereotype.Component;

@Component

public class Productovalidacion {

    private EvaluarPatron evaluadorDeCoincidencias = new EvaluarPatron();

    public  boolean validarNombreProducto(String nombre) throws Exception{

        String regex = "^[a-zA-Z ]{1,60}$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(nombre,regex)){

            throw new Exception("nombre no valido, recuerde ingresae solo letras maximo 80 caracteres");
        }

        return true;
    }

    public boolean validarREferencia(String referencia) throws Exception{

        String regex = "^.{1,14}$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(referencia,regex)) {

            throw new Exception("referencia no valida, recuerda ingresar maximo 14 caracteres");

        }

        return true;
    }

    public boolean validsTalla (String talla) throws Exception{

        String regex = "^[a-zA-Z]{1,3}$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(talla,regex)){

            throw new Exception("talla no valida, ingrese solo 3 caracteres");
        }

        return true;
    }

    public boolean validarCantidadBodega (String cantidadBodega) throws Exception{

        String regex = "^\\d*\\.?\\d+$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(cantidadBodega,regex)){

            throw new Exception("valor no valido, revise por favor");
        }

        return true;
    }

    public boolean validarPrecioUnitario (String precioUnitario) throws Exception{

        String regex = "^\\d*\\.?\\d+$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(precioUnitario,regex)){

            throw new Exception("valor no valido, revise por favor");
        }

        return true;
    }

    public boolean validarDescripcion (String descripcion) throws Exception{

        String regex = "^.{1,100}$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(descripcion,regex)){
            throw new Exception("excediste la cantidad de caracteres");
        }

        return true;
    }

    public boolean valirdarFotografia (String fotografia) throws Exception{

        String regex = "^.{1,255}$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(fotografia,regex)){

            throw new Exception("excediste la cantidad de caracteres");

        }

        return true;
    }
}
