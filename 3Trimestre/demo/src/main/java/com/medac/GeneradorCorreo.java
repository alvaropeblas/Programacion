package com.medac;

import java.util.Random;

public class GeneradorCorreo {
    private static final String[] dominios = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com"};
    private static final String[] nombres = {"juan", "ana", "maria", "pedro", "luis", "carla", "jorge", "laura", "fernando"};
    private static final String[] apellidos = {"perez", "gomez", "garcia", "rodriguez", "fernandez", "sanchez", "lopez"};

    private static final int LONGITUD_NOMBRE = nombres.length;
    private static final int LONGITUD_APELLIDO = apellidos.length;
    private static final int LONGITUD_DOMINIO = dominios.length;

    private static final Random random = new Random();

    /**
     * Generamos correo aleatorio con la Clase Random, dandonos un nombre, apellido, numero hasta el 100 y un dominio. 
     * @return email 
     */
    public  String generarEmail() {
        String nombre = nombres[random.nextInt(LONGITUD_NOMBRE)];
        String apellido = apellidos[random.nextInt(LONGITUD_APELLIDO)];
        String dominio = dominios[random.nextInt(LONGITUD_DOMINIO)];
        int numeroAleatorio = random.nextInt(100);
        String email = nombre + "." + apellido + numeroAleatorio + "@" + dominio;
        return email;
    }
    
}
