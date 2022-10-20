package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.TipoProducto;
import pe.edu.upc.demotopstorefinder.repositories.ITipoProductoRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITipoProductoService;

import java.util.List;

@Service
public class TipoProductoServiceImpl implements ITipoProductoService {
    @Autowired
    private ITipoProductoRepository pR;

    @Override
    public void insert(TipoProducto tipoproducto) {
        pR.save(tipoproducto);
    }

    @Override
    public List<TipoProducto> list() {
        return pR.findAll();
    }
}
