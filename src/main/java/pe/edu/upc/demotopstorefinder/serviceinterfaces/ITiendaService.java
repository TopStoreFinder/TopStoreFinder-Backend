package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadTiendasPorCadaDuenho;
import pe.edu.upc.demotopstorefinder.entities.Tienda;

import java.util.List;
import java.util.Optional;

public interface ITiendaService {
    public boolean insertar(Tienda tienda);

    public void eliminar(int idTienda);

    Optional<Tienda> listarId(int idTienda);

    List<Tienda> listar();

    List<Tienda> buscarTienda(String nombreTienda);

    List<ResultadoCantidadTiendasPorCadaDuenho> buscarCantidadTiendasPorCadaDuenho();

}


