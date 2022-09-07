package javaBasic.ejercicioTemas789;

import java.util.Vector;

public class EjercicioVector {
    public static void main(String[] args) {


        //vector
        Vector<String> miVector = new Vector<String>(5, 3);
        miVector.add("Este");
        miVector.add("es");
        miVector.add("un");
        miVector.add("nuevo");
        miVector.add("vector");
        miVector.remove(1);
        miVector.remove(2);
        System.out.println(miVector);
        /*Los vectores funcionan como arrays no estáticos, es decir que se les pueden ir agregando elementos continuamente.
          Tienen una capacidad inicial por defecto de 10 a la cual cada vez que la superamos, se le agregan otros 10 lugares.
          El problema está en que en realidad cada vez que se supera la capacidad, se debe crear un nuevo array con capacidad
          mayor, a la cual se le copiarán los datos del array "viejo".
          Por lo tanto si partimos de un Vector de 10 elementos y terminamos con uno de 1000, habrá que realizar la operación
          de copiar y pegar arrays 100 veces, lo cual puede llegar a demandar mucho costo informático.
         */
    }
}
