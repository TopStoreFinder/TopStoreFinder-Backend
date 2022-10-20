package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.TipoProducto;

import java.util.List;

public interface ITipoProductoService {
    public void insert (TipoProducto tipoproducto);

    List<TipoProducto>list();
}
