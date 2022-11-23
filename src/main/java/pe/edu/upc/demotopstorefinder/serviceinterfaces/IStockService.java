package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.*;

import java.util.List;
import java.util.Optional;

public interface IStockService {

    public void insertar(Stock tienda);

    List<Stock>list();

    public void eliminar(int idTienda);

    Optional<Stock> listarId(int idstock);

    List<ResultadoStockPorProducto> BuscarStockPorProducto();
    List<ResultadoStockPorProducto> MostrarStockPorProductoMenor50();

}
