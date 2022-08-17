package javaBasic;

public class EjercicioArrayToString {
    public static void main(String[] args) {
        // Programa que imprima en un String los nombres de un Array

        String[] nombres = {"Juan", "Jose", "Paula"};
        imprimirNombres(nombres);

    }

    static void imprimirNombres(String[] nombres){
        String nombresStr = "";
        for(String nombre : nombres){
            nombresStr += nombre + " ";
        }
        System.out.println(nombresStr);
    }
}
