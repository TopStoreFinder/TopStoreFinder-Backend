package pe.edu.upc.demotopstorefinder.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.ReseniaCalificacion;
import pe.edu.upc.demotopstorefinder.entities.Tienda;

import java.util.List;

@Repository
public interface IReseniaCalificacionRepository extends JpaRepository<ReseniaCalificacion,Integer >{

    @Query("from ReseniaCalificacion r where lower(r.resenia) like lower(concat('%', :resenia,'%'))")
    List<ReseniaCalificacion> buscarReseniaCalificacion(@Param("resenia") String resenia);
}
