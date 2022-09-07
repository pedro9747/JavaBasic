package javaBasic.ejercicioTemas789;

import java.util.Scanner;

public class TextoAlReves {
    public static void main(String[] args) {
        //imprimir texto al revés
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String cadena = sc.nextLine();
        reverse(cadena);
    }
    public static void reverse(String cadena) {
        String cadenaRev = "";
        for (int i = (cadena.length() - 1); i >= 0; i--) {
            cadenaRev += cadena.charAt(i);
        }
        System.out.println(cadenaRev);
    }
}
