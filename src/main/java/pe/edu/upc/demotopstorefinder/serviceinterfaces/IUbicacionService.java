package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.Ubicacion;

import java.util.List;

public interface IUbicacionService {

    public void insert(Ubicacion ubicacion);

    List<Ubicacion>list();
}
