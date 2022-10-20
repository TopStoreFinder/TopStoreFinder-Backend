package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.Duenho;

@Repository
public interface IDuenhoRepository extends JpaRepository<Duenho,Integer> {
}
