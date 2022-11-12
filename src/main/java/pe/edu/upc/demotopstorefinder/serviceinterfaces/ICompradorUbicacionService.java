package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.compradorUbicacion;

import java.util.List;
import java.util.Optional;

public interface ICompradorUbicacionService {

    public boolean insertar(compradorUbicacion tienda);

    public void eliminar(int idTienda);

    Optional<compradorUbicacion> listarId(int idTienda);

    List<compradorUbicacion> listar();

}
