package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public void insert(Stock stock) {
        pR.save(stock);
    }

    @Override
    public List<Stock> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idStock) {
        pR.deleteById(idStock);

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
