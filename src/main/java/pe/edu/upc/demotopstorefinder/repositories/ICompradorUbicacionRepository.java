package pe.edu.upc.demotopstorefinder.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.compradorUbicacion;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ICompradorUbicacionRepository extends JpaRepository<compradorUbicacion, Integer> {

    @Query(value ="SELECT u.longitud, u.latitud,count (c.ubicacionid) FROM comprador_ubicacion c inner join ubicacion u ON u.id = c.ubicacionid where u.longitud>40 OR u.longitud<100 GROUP BY (u.longitud,u.latitud)" ,nativeQuery = true)
    List<String[]> BuscarCantidadLongitudesDeterminadas();
}
