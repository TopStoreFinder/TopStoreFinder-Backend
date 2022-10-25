package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.TipoProducto;

import java.util.List;

@Repository
public interface ITipoProductoRepository extends JpaRepository<TipoProducto,Integer> {

    @Query("from TipoProducto tp where lower(tp.categoriaNombre) like lower(concat('%', :categoriaNombre,'%'))")//PERSONALIZA LA BUSQUEDA DE JPQL
    List<TipoProducto> buscarCategoriaNombre(@Param("categoriaNombre") String categoriaNombre);
}
