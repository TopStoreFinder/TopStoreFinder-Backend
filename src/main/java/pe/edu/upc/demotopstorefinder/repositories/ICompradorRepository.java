package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.Comprador;


import java.util.List;

@Repository
public interface ICompradorRepository extends JpaRepository<Comprador,Integer> {
    @Query("from Comprador c where lower(c.nombre) like lower(concat('%', :comprador,'%'))")//PERSONALIZA LA BUSQUEDA DE JPQL
    List<Comprador> buscarNombre(@Param("comprador") String comprador);
}
