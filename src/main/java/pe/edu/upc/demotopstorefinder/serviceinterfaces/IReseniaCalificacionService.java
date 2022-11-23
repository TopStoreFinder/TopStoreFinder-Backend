package pe.edu.upc.demotopstorefinder.serviceinterfaces;
import pe.edu.upc.demotopstorefinder.entities.ReseniaCalificacion;
import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadReseniaporTienda;


import java.util.List;
import java.util.Optional;

public interface IReseniaCalificacionService {
    public boolean insertar(ReseniaCalificacion reseniaCalificacion);

    public void eliminar(int idReseniaCalificacion);

    Optional<ReseniaCalificacion> listarId(int idReseniaCalificacion);

    List<ReseniaCalificacion> listar();

    List<ReseniaCalificacion> buscarResenia(String resenia);

    List<ResultadoCantidadReseniaporTienda> BuscarCantidadReseniasPorTienda();
}