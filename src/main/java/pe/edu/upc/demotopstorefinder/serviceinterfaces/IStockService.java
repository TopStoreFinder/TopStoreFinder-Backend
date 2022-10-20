package pe.edu.upc.demotopstorefinder.serviceinterfaces;

import pe.edu.upc.demotopstorefinder.entities.Stock;

import java.util.List;

public interface IStockService {

    public void insert(Stock stock);

    List<Stock>list();
}
