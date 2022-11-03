package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.Tiendaproducto;

import java.util.List;

@Repository
public interface ITiendaproductoRepository extends JpaRepository<Tiendaproducto, Integer> {

}
