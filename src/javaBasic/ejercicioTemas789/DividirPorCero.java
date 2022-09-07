package javaBasic.ejercicioTemas789;

import java.util.Scanner;

public class DividirPorCero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //dividir por 0
        System.out.println("Introduce 2 números para dividirlos: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        dividePorCero(a, b);

        sc.close();
    }
    public static void dividePorCero(int a, int b) throws ArithmeticException{
        try{
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }
}
