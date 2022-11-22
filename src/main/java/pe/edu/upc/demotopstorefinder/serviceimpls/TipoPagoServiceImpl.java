package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.ResultadoTIendasPorTipoPago;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.repositories.ITipoPagoRepositry;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITipoPagoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TipoPagoServiceImpl implements ITipoPagoService {

    @Autowired
    private ITipoPagoRepositry pR;
    @Override
    public void insert(TipoPago tipopago) {
        pR.save(tipopago);
    }

    @Override
    public List<TipoPago> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idTipo) {
        pR.deleteById(idTipo);
    }

    @Override
    public List<TipoPago> search(String tipo) {
        return pR.buscarTipo(tipo);
    }

    @Override
    public Optional<TipoPago> listarId(int idTienda) {
        return pR.findById(idTienda);
    }

    @Override
    public List<ResultadoTIendasPorTipoPago> BuscarCantidadTiendasPorTipoPago() {
        List<ResultadoTIendasPorTipoPago> lista = new ArrayList<>();
        pR.BuscarCantidadTiendasPorTipoPago().forEach( y -> {
            ResultadoTIendasPorTipoPago re = new ResultadoTIendasPorTipoPago();
            re.setTipopago(y[0]);
            re.setCantidadTiendas(y[1]);
            lista.add(re);
        });


        return lista;
    }
}
