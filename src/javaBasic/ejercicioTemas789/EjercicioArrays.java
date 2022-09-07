package javaBasic.ejercicioTemas789;

public class EjercicioArrays {
    public static void main(String[] args) {
        //array unidimensional
        String [] palabras = {"Hola", "como", "estas"};
        for(String palabra: palabras){
            System.out.println(palabra);
        }

        //array bidimensional
        int[][] arrayBidi = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;
        arrayBidi[1][0] = 11;
        arrayBidi[1][1] = 22;
        arrayBidi[1][2] = 33;
        arrayBidi[1][3] = 44;
        for(int i = 0; i< arrayBidi.length; i++){
            for(int j = 0; j<arrayBidi[i].length; j++){
                System.out.println("En la posición " + i + ", " + j + " el valor es: " + arrayBidi[i][j]);
            }
        }
    }

}
