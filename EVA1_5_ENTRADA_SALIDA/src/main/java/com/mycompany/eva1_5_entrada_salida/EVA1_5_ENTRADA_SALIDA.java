

package com.mycompany.eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA1_5_ENTRADA_SALIDA {

    public static void main(String[] args) {
        System.out.println();
        Scanner palabrota = new Scanner (System.in);
        String apellido;
        String nombre;
        String control;
        String carrera;
        int semestre;
        System.out.println("indica tus apellidos");
        apellido = palabrota.nextLine ();
        System.out.println("indica tu nombre");
        nombre = palabrota.nextLine ();
        System.out.println("indica tu número de control");
        control = palabrota.nextLine ();
        System.out.println("indica tu carrera");
        carrera = palabrota.nextLine();
        System.out.println("indica tu semestre");
        semestre = palabrota.nextInt ();
         System.out.println(apellido);
         System.out.println(nombre);
         System.out.println(control);
         System.out.println(carrera);
         System.out.println(semestre);
    }
}
