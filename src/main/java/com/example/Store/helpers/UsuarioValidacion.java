package com.example.Store.helpers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class UsuarioValidacion {

    private EvaluarPatron evaluadorDeCoincidencias = new EvaluarPatron();
    public boolean validarNombres(String nombres) throws Exception{

        String regex ="^[a-zA-Z\\\\s]{1,50}$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(nombres,regex)){

            throw new Exception("nombre no valido, recuerde solo ingres letras, espacios y maximo 50 caracteres");
        }

        return true;
    }

    public boolean validarCedula(String cedula) throws Exception{

        String regex = "^[0-9]+$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(cedula,regex)){

            throw new Exception("cedula no valida recuerde solo ingresar numeros y maximo 10 caracteres");
        }

        return true;
    }

    public boolean validarCorreo(String correo) throws Exception{

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(correo,regex)){

            throw new Exception("correo invalido por favor intente de nuevo");
        }

        return true;
    }

    public boolean validarSexo(String sexo)throws Exception{

        String regex = "^(masculino|femenino)$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(sexo,regex)){

            throw new Exception("sexo invalido, por favor ingrese masculino o femenino");

        }

        return true;
    }

    public boolean validaCodigo(String codigo)throws Exception{

        String regex = "^\\d{1,6}$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(codigo,regex)){

            throw new Exception("codigo no valido, recuerde ingresar solo numeros y como maximo 6 gracias");

        }

        return true;
    }
}
