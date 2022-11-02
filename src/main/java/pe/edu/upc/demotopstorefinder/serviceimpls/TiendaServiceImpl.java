package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.repositories.ITiendaRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITiendaService;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaServiceImpl implements ITiendaService {

    @Autowired
    private ITiendaRepository dTienda;

    @Override
    @Transactional
    public boolean insertar(Tienda tienda) {
        Tienda objTienda = dTienda.save(tienda);
        if (objTienda == null){
            return false;}
        else{
            return true;}
    }

    @Override
    @Transactional
    public void eliminar(int idTienda) {
        dTienda.deleteById(idTienda);

    }

    @Override
    public Optional<Tienda> listarId(int idTienda) {
        return dTienda.findById(idTienda);
    }

    @Override
    public List<Tienda> listar() {
        return dTienda.findAll();
    }

    @Override
    public List<Tienda> buscarTienda(String nombreTienda) {
        return buscarTienda(nombreTienda);
    }
}
