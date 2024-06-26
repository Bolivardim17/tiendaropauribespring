package com.example.Store.helpers;

import org.springframework.stereotype.Component;

@Component

public class TipoPrendaValidacion {

    private EvaluarPatron evaluadorDeCoincidencias =  new EvaluarPatron();

    public boolean validarNombre(String nombre) throws Exception{

        String regex = "^[a-zA-Z ]{1,80}$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(nombre,regex)){

            throw new Exception("nombre no valido, recuerde solo poner letras y expacios y maximo 80 caracteres");

        }

        return true;
    }
}
