package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.Ubicacion;
import pe.edu.upc.demotopstorefinder.repositories.IUbicacionRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IUbicacionService;

import java.util.List;
import java.util.Optional;

@Service
public class UbicacionServiceImpl implements IUbicacionService {
    @Autowired
    private IUbicacionRepository pR;

    @Override
    public void insert(Ubicacion ubicacion) {
        pR.save(ubicacion);
    }

    @Override
    public List<Ubicacion> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idUbicacion) {
        pR.deleteById(idUbicacion);
    }

    @Override
    public Optional<Ubicacion> ListarId(int idUbicacion) {
        return pR.findById(idUbicacion);
    }

}
