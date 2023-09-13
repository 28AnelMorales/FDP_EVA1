
package com.mycompany.eva1_8_area_trianguloo;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA1_8_AREA_TRIANGULOO {

    public static void main(String[] args) {
        double area;
        double base;
        double altura;
        Scanner input = new Scanner (System.in);
        System.out.println("introduce la base del triangulo");
        base = input. nextDouble ();
        System.out.println("introduce la altura del triangulo");
        altura = input.nextDouble ();
        area = (base * altura) / 2;
        System.out.println("el area es:");
        System.out.println(area);
  
    }
}
