package pe.edu.upc.demotopstorefinder.serviceinterfaces;


import pe.edu.upc.demotopstorefinder.entities.Comprador;
import pe.edu.upc.demotopstorefinder.entities.Tienda;

import java.util.List;
import java.util.Optional;

public interface ICompradorService {

    public void insert(Comprador comprador);

    List<Comprador>list();

    public void delete(int idComprador);

    List<Comprador>search(String nombre);

    Optional<Comprador> listarId(int idComprador);

}
