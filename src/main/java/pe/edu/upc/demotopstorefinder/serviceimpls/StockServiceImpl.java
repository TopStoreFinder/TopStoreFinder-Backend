package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.Stock;
import pe.edu.upc.demotopstorefinder.repositories.IStockRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IStockService;

import java.util.List;

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
}
