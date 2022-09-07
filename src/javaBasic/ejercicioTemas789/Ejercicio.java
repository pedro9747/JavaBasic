package javaBasic.ejercicioTemas789;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio {
    public static void main(String[] args) {

        //fileIn fileOut
        try {
            copiarArchivo("src/javaBasic/ejercicioTemas789/data.txt", "src/javaBasic/ejercicioTemas789/copia.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void copiarArchivo(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

