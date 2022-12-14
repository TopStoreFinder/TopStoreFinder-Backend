package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.Tienda;

import java.util.List;

@Repository
public interface ITiendaRepository extends JpaRepository<Tienda,Integer> {

    @Query("from Tienda t where lower(t.nombre) like lower(concat('%', :nombre,'%'))")
    List<Tienda> buscarTienda(@Param("nombre") String nombre);

    @Query(value ="SELECT d.nombre,d.edad,count(t.id_duenho) from tienda t inner join duenho d ON d.id = t.id_duenho where d.edad>40 GROUP by  (d.nombre,d.edad)" ,nativeQuery = true)
    List<String[]> BuscarCantidadTiendasPorCadaDuenho();
}
