package com.example.cipasoldschool.actividad1.actividadunidad3desarrollodeapps.util;

import java.util.ArrayList;
import java.util.List;

public class MessageVerification {
    private static List<String> validarEntrada(String userEmail, String password){
        List<String> mensajes = new ArrayList<>();
        if(userEmail.isEmpty()){
            mensajes.add("* Campo Email Vacio");
        }
        if(password.isEmpty()){
            mensajes.add("* Campo Password Vacio");
        }
        return mensajes;
    }
    public  static String mostrarMensajeError(String userEmail,String password){
        List<String> mensajes = validarEntrada(userEmail,password);
        String errores="";
        for(String mensaje:mensajes){
            errores +=mensaje+"\n";
        }
        return errores.trim();
    }
}
