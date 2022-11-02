package pe.edu.upc.demotopstorefinder.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.ReseniaCalificacion;
import pe.edu.upc.demotopstorefinder.entities.Tienda;

import java.util.List;

public interface IReseniaCalificacionRepository extends JpaRepository<ReseniaCalificacion,Integer >{

    @Query("from Tienda t where lower(r.resenia) like lower(concat('%', :resenia,'%'))")
    List<Tienda> buscarReseniaCalificacion(@Param("resenia") String resenia);
}
