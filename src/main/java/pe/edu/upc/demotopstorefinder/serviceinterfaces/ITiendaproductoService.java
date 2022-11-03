package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.Tiendaproducto;

import java.util.List;
import java.util.Optional;

public interface ITiendaproductoService {

    public boolean insertar(Tiendaproducto tiendaproducto);

    public void eliminar(int idTiendaproducto);

    Optional<Tiendaproducto> listarId(int idTiendaproducto);

    List<Tiendaproducto> listar();

}
