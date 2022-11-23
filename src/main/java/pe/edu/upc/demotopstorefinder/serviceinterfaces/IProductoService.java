package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.Producto;
import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadProductosporcadaTienda;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public boolean insertar(Producto producto);

    public void eliminar(int idProducto);

    Optional<Producto> listarId(int idProducto);

    List<Producto> listar();

    List<Producto> buscarProducto(String NombreProducto);

    List<ResultadoCantidadProductosporcadaTienda> BuscarCantidadProductosPorTienda();

}
