package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.Stock;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;

@Repository
public interface IStockRepository extends JpaRepository<Stock,Integer> {
    Query("from Stock s where lower(s.LastUpdateTime) like lower(concat('%', :LastUpdateTime,'%'))")//PERSONALIZA LA BUSQUEDA DE JPQL
    List<Stock> buscarLastUpdateTime(@Param("LastUpdateTime") String LastUpdateTime);
}
