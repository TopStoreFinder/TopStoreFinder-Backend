package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.demotopstorefinder.entities.ReseniaCalificacion;
import pe.edu.upc.demotopstorefinder.repositories.IReseniaCalificacionRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IReseniaCalificacionService;

import java.util.List;
import java.util.Optional;

@Service
public class ReseniaCalificacionServiceImpl implements IReseniaCalificacionService {
    @Autowired
    private IReseniaCalificacionRepository dReseniaCalificacion;

    @Override
    @Transactional
    public boolean insertar(ReseniaCalificacion reseniaCalificacion) {
        ReseniaCalificacion objReseniaCalificacion = dReseniaCalificacion.save(reseniaCalificacion);
        if (objReseniaCalificacion == null){
            return false;}
        else{
            return true;}
    }
    @Override
    @Transactional
    public void eliminar(int idReseniaCalificacion) {
        dReseniaCalificacion.deleteById(idReseniaCalificacion);
    }
    @Override
    public Optional<ReseniaCalificacion> listarId(int idReseniaCalificacion) {
        return dReseniaCalificacion.findById(idReseniaCalificacion);
    }

    @Override
    public List<ReseniaCalificacion> listar() {
        return dReseniaCalificacion.findAll();
    }

    @Override
    public List<ReseniaCalificacion> buscarResenia(String resenia) {
        return buscarResenia(resenia);
    }

}
