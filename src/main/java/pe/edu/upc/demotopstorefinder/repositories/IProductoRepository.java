package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.Producto;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository <Producto, Integer> {

    @Query("from Producto t where lower(t.nombreProducto) like lower(concat('%', :nombreProducto,'%'))")
    List<Producto> buscarProducto(@Param("nombreProducto") String nombreProducto);

}
