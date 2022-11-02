package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.demotopstorefinder.entities.Tiendaproducto;
import pe.edu.upc.demotopstorefinder.repositories.ITiendaproductoRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITiendaproductoService;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaproductoServiceImpl implements ITiendaproductoService {
    @Autowired
    private ITiendaproductoRepository pR;

    @Override
    @Transactional
    public boolean insertar(Tiendaproducto tiendaproducto) {
        Tiendaproducto objTiendaproducto = pR.save(tiendaproducto);
        if (objTiendaproducto == null){
            return false;}
        else{
            return true;}
    }

    @Override
    @Transactional
    public void eliminar(int idTiendaproducto) {
        pR.deleteById(idTiendaproducto);

    }

    @Override
    public Optional<Tiendaproducto> listarId(int idTiendaproducto) {
        return pR.findById(idTiendaproducto);
    }

    @Override
    public List<Tiendaproducto> listar() {
        return pR.findAll();
    }

    @Override
    public List<Tiendaproducto> buscarTiendaproducto(String tiendaid) {
        return buscarTiendaproducto(tiendaid);
    }
}
