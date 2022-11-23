package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadProductosTipo;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.entities.TipoProducto;

import java.util.List;
import java.util.Optional;

public interface ITipoProductoService {
    public void insert (TipoProducto tipoproducto);

    List<TipoProducto>list();

    public void delete(int idTipoProducto);

    List<TipoProducto>search(String categoriaNombre);

    Optional<TipoProducto> listarId(int idTipoProducto);

    List<ResultadoCantidadProductosTipo> BuscarCantidadProductosTipo();
}
