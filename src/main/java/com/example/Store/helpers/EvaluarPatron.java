package com.example.Store.helpers;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Component

public class EvaluarPatron {
 public EvaluarPatron(){

 }
    public boolean evaluarPatron(String cualquieCadena, String cualquierRegex){

        Pattern patron=Pattern.compile(cualquierRegex);
        Matcher coincidencia=patron.matcher(cualquieCadena);

        if(coincidencia.matches()){
            return true;
        }else{
            return false;
        }

    }
}
