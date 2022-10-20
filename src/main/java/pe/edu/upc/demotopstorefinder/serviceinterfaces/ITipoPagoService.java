package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.TipoPago;

import java.util.List;

public interface ITipoPagoService {

    public void insert(TipoPago tipopago);

    List<TipoPago>list();
}
