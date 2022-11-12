package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.Stock;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;

import java.util.List;
import java.util.Optional;

public interface IStockService {

    public boolean insertar(Stock tienda);

    List<Stock>list();

    public void eliminar(int idTienda);

    List<Stock>search(String DateTime);

    Optional<Stock> listarId(int idstock);

}
