package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.Tiendaproducto;

import java.util.List;

@Repository
public interface ITiendaproductoRepository extends JpaRepository<Tiendaproducto, Integer> {
    @Query(value ="SELECT p.nombre_producto, p.precio_unidad,\n" +
            "count (t.productoid) FROM tiendaproducto t inner join producto p\n" +
            "ON p.id = t.productoid\n" +
            "where p.precio_unidad > 50 GROUP BY (p.nombre_producto,p.precio_unidad)\n)" ,nativeQuery = true)
    List<String[]> BuscarCantidadPreciosDeterminados();

}
