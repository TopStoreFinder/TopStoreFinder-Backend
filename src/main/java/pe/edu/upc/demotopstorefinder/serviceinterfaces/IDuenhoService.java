package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.Duenho;
import pe.edu.upc.demotopstorefinder.entities.Tienda;

import java.util.List;
import java.util.Optional;

public interface IDuenhoService {

    public void insert(Duenho duenho);

    List<Duenho> list();

    public void delete (int idDuenho);

    List<Duenho>search(String categoriaNombre);

    Optional<Duenho> listarId(int idduenho);

    List<Duenho>buscarEdadDuenho();
}
