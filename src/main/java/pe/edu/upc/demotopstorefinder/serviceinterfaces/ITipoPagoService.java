package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;

import java.util.List;
import java.util.Optional;

public interface ITipoPagoService {

    public void insert(TipoPago tipopago);

    List<TipoPago>list();

    public void delete(int idTipo);

    List<TipoPago>search(String categoriaNombre);

    Optional<TipoPago> listarId(int idTienda);
}
