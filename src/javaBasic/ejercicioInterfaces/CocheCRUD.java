package javaBasic.ejercicioInterfaces;

import java.util.List;

public interface CocheCRUD {
    void save (Coche coche);
    void findAll();
    void delete(Coche coche);
}
