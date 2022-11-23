package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.Stock;

import java.util.List;

@Repository
public interface IStockRepository extends JpaRepository<Stock,Integer> {


    @Query(value ="select p.nombre_producto,s.en_stock from producto p inner join stock s on p.id_stock = s.id" ,nativeQuery = true)
    List<String[]> MostrarStockPorProducto();

    @Query(value ="select p.nombre_producto,s.en_stock from producto p inner join stock s on p.id_stock = s.id where s.en_stock < 50" ,nativeQuery = true)
    List<String[]> MostrarStockPorProductoMenor50();

}
