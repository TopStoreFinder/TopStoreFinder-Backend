package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.demotopstorefinder.entities.Stock;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.repositories.IStockRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IStockService;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements IStockService {
    @Autowired
    private IStockRepository pR;
    @Override
    @Transactional
    public boolean insertar(Stock tienda) {
        Stock objTienda = pR.save(tienda);
        if (objTienda == null){
            return false;}
        else{
            return true;}
    }

    @Override
    public List<Stock> list() {
        return pR.findAll();
    }

    @Override
    @Transactional
    public void eliminar(int idTienda) {
        pR.deleteById(idTienda);

    }

    @Override
    public List<Stock> search(String DateTime) {
        return pR.buscarLastUpdateTime(DateTime);
    }

    @Override
    public Optional<Stock> listarId(int idstock) {
        return pR.findById(idstock);
    }
}
