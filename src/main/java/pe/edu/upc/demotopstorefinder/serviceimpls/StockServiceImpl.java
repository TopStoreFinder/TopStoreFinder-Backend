package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.demotopstorefinder.entities.Stock;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.repositories.IStockRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IStockService;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements IStockService {
    @Autowired
    private IStockRepository pR;
    @Override
    public void insertar(Stock tipopago) {
        pR.save(tipopago);
    }

    @Override
    public List<Stock> list() {
        return pR.findAll();
    }

    @Override
    public void eliminar(int idTipo) {
        pR.deleteById(idTipo);
    }
    @Override
    public Optional<Stock> listarId(int idstock) {
        return pR.findById(idstock);
    }
}
