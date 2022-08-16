/**
 * Para que funcione correctamente el número decimal debe usar coma (,) en lugar de punto (.)
 *
 */

package javaBasic;

import java.util.Scanner;

public class EjercicioIVA {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un precio (si es decimal utilizar coma [,])");
        double precio = teclado.nextDouble();


        System.out.println("El precio final con IVA (21%) es de " + precioIVA(precio));

    }

    static double precioIVA(double precio){
        return precio*1.21;
    }

}
