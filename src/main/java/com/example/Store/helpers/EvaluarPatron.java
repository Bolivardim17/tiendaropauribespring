package com.example.Store.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
