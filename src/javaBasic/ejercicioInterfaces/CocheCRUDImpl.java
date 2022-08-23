package javaBasic.ejercicioInterfaces;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    List<Coche> coches = new ArrayList<Coche>();


    @Override
    public void save(Coche coche) {

        System.out.println("save() implemented");

    }

    @Override
    public void findAll() {

        System.out.println("findAll() implemented");
    }

    @Override
    public void delete(Coche coche) {


        System.out.println("delete() implemented");

    }
}
