package com.example.Store.helpers;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component

public class Pedidovalidacion {

    private EvaluarPatron evaluadorDeCoincidencias = new EvaluarPatron();

    public boolean validarFechaYHora (String FechaYHora) throws  Exception{

        String regex = "^\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])$";

        if (!this.evaluadorDeCoincidencias.evaluarPatron(FechaYHora,regex)){

            throw new Exception("por favor ingrese una fecha correcta");

        }
        return true;
    }
}
