package javaBasic.ejercicioTemas789;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjerciciosList {
    public static void main(String[] args) {


        //ArrayList + LinkedList
        ArrayList<String> miArrayList = new ArrayList<String>();
        miArrayList.add("soy");
        miArrayList.add("una");
        miArrayList.add("ArrayList");
        LinkedList<String> miLinkedList = new LinkedList<String>();
        for (String s : miArrayList){
            miLinkedList.add(s);
        }
        for (String s : miArrayList){
            System.out.println(s);
        }
        for (String s : miLinkedList){
            System.out.println(s);
        }

        //Arraylist + bucle de numeros impares
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                continue;
            }else {
                arrayList1.add(i);
            }
        }
        System.out.println(arrayList1);
    }
}
