package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.Ubicacion;
import pe.edu.upc.demotopstorefinder.repositories.IUbicacionRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IUbicacionService;

import java.util.List;

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
}
