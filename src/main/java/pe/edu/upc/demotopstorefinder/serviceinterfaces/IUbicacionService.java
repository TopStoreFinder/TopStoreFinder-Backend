package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.entities.Ubicacion;

import java.util.List;
import java.util.Optional;

public interface IUbicacionService {

    public void insert(Ubicacion ubicacion);

    List<Ubicacion>list();

    public void delete(int idUbicacion);

    Optional<Ubicacion> ListarId(int idUbicacion);
}
