package com.example.Store.helpers;

import java.time.LocalDate;

public class Marcavalidacion {

    private EvaluarPatron evaluadorDeCoincidencia = new EvaluarPatron();
    public boolean validarnombreMarca (String nombreMarca) throws Exception{
        // no vacio y maximo 50 caracteres con espacios
        String regex = "^[a-zA-Z ]+$";

        if(!this.evaluadorDeCoincidencia.evaluarPatron(nombreMarca,regex)){
            throw new Exception("Revisa el nombre ingresado, ya que solo puede tener letras es espacios");
        }

        if(nombreMarca.length()>50){
            throw new Exception("El numero de caracteres es mayor al permitido");
        }

       return true;
    }

    public boolean validarNit (String nit) throws Exception{
        // no vacio solo numeros long max 10

        String regex = "^[0-9]+$";

        if (!this.evaluadorDeCoincidencia.evaluarPatron(nit,regex)){
            throw new Exception("su edad no es valida, intente de nuevo");
        }

        return true;
    }

    public boolean validarAnoCreacion (String anoCreacion) throws Exception{

        String regex = "^\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])$";

        if (!this.evaluadorDeCoincidencia.evaluarPatron(anoCreacion,regex)){
            throw  new Exception("fecha de nacimiento no valida, ingrese formato años mes y dia ");

        }
        return true;
    }

}
