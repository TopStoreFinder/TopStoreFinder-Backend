package pe.edu.upc.demotopstorefinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;

import java.util.List;

@Repository
public interface ITipoPagoRepositry extends JpaRepository<TipoPago,Integer> {

    @Query("from TipoPago tp where lower(tp.tipo) like lower(concat('%', :tipoPago,'%'))")//PERSONALIZA LA BUSQUEDA DE JPQL
    List<TipoPago> buscarTipo(@Param("tipoPago") String tipoPago);

    @Query(value ="SELECT tp.tipo as TipoPago, count(t.id_tipo_pago) as cantidadTiendas from tipo_pago tp inner join tienda t on tp.id = t.id_tipo_pago group by tp.tipo" ,nativeQuery = true)
    List<String[]> BuscarCantidadTiendasPorTipoPago();
}
