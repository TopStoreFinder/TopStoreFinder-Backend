package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.entities.TipoProducto;
import pe.edu.upc.demotopstorefinder.repositories.ITipoProductoRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITipoProductoService;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void delete(int idTipoProducto) {
        pR.deleteById(idTipoProducto);
    }

    @Override
    public List<TipoProducto> search(String categoriaNombre) {
        return pR.buscarCategoriaNombre(categoriaNombre);
    }

    @Override
    public Optional<TipoProducto> listarId(int idTipoProducto) {
        return pR.findById(idTipoProducto);
    }
}
