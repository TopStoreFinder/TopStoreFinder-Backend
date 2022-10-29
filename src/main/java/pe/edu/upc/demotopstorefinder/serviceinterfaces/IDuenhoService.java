package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.Duenho;

import java.util.List;

public interface IDuenhoService {

    public void insert(Duenho duenho);

    List<Duenho> list();

    public void delete (int idDuenho);

    List<Duenho>search(String categoriaNombre);
}
