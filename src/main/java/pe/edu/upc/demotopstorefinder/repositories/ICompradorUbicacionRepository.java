package pe.edu.upc.demotopstorefinder.repositories;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.compradorUbicacion;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ICompradorUbicacionRepository extends JpaRepository<compradorUbicacion, Integer> {


}
