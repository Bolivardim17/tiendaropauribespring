package com.example.Store.helpers;

import org.springframework.stereotype.Component;

@Component

public class Detallevalidacion {

    private EvaluarPatron evaluadorDeCoincidencia = new EvaluarPatron();

    public boolean validarCostoTotal (Integer costoTotal) throws Exception{
        // no vacio solo numeros positivos
        String regex = "^[0-9]+(\\.[0-9]+)?$";

        if (costoTotal<0){
            throw new Exception("valor ingresado no valido, debe ser positivo o el campo esta vacio");
        }

        return true;

    }

    public boolean validarcantidadProductos (Integer cantidadProductos) throws Exception{
        //obligatorio solo numeros positivos


        if (cantidadProductos <0){
            throw new Exception("valor ingresado no valido, debe ser positivo o el campo esta vacio");
        }

        return true;
    }
}
