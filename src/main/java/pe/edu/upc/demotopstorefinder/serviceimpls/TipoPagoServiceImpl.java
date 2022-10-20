package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.repositories.ITipoPagoRepositry;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITipoPagoService;

import java.util.List;

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
}
