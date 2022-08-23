package javaBasic.ejercicioInterfaces;

public class Main {


    static CocheCRUDImpl cocheCRUDImpl = new CocheCRUDImpl();


    public static void main(String[] args) {


        Coche miAuto = new Coche("Ford", "EcoSport", "Gris", 100);

        cocheCRUDImpl.save(miAuto);
        cocheCRUDImpl.findAll();
        cocheCRUDImpl.delete(miAuto);

    }
}
