package pe.edu.upc.demotopstorefinder.serviceinterfaces;


import pe.edu.upc.demotopstorefinder.entities.Comprador;

import java.util.List;

public interface ICompradorService {

    public void insert(Comprador comprador);

    List<Comprador>list();

    public void delete(int idComprador);

    List<Comprador>search(String nombre);

}
