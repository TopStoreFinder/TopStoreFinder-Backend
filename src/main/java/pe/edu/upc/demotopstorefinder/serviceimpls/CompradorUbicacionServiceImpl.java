package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadLongitudesDeterminadas;
import pe.edu.upc.demotopstorefinder.entities.compradorUbicacion;
import pe.edu.upc.demotopstorefinder.repositories.ICompradorUbicacionRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ICompradorUbicacionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompradorUbicacionServiceImpl implements ICompradorUbicacionService {

    @Autowired
    private ICompradorUbicacionRepository dTienda;

    @Override
    @Transactional
    public boolean insertar(compradorUbicacion tienda) {
        compradorUbicacion objTienda = dTienda.save(tienda);
        if (objTienda == null){
            return false;}
        else{
            return true;}
    }

    @Override
    public List<compradorUbicacion> listar() {
        return dTienda.findAll();
    }

    @Override
    @Transactional
    public void eliminar(int idTienda) {
        dTienda.deleteById(idTienda);

    }

    @Override
    public Optional<compradorUbicacion> listarId(int idTienda) {
        return dTienda.findById(idTienda);
    }

    @Override
    public List<ResultadoCantidadLongitudesDeterminadas> BuscarCantidadLongitudesDeterminadas() {
        List<ResultadoCantidadLongitudesDeterminadas> lista = new ArrayList<>();
        dTienda.BuscarCantidadLongitudesDeterminadas().forEach( y -> {
            ResultadoCantidadLongitudesDeterminadas re = new ResultadoCantidadLongitudesDeterminadas();
            re.setLongitud(y[0]);
            re.setLatitud(y[1]);
            re.setCantidad(y[2]);
            lista.add(re);
        });


        return lista;
    }
}
