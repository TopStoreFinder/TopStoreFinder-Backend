package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.Duenho;

import java.util.List;

@Repository
public interface IDuenhoRepository extends JpaRepository<Duenho,Integer> {
    @Query("from Duenho tp where lower(tp.nombre) like lower(concat('%', :Duenho,'%'))")
    List<Duenho> buscarDuenho(@Param("Duenho") String Duenho);

    @Query(value = "SELECT * FROM duenho d WHERE d.edad >'30' AND d.edad<'65' ORDER by d.edad DESC", nativeQuery = true)
    List<Duenho> buscarEdadDuenho();
}
