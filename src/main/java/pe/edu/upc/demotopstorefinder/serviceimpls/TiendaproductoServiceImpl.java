package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadPreciosDeterminados;
import pe.edu.upc.demotopstorefinder.entities.Tiendaproducto;
import pe.edu.upc.demotopstorefinder.repositories.ITiendaproductoRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITiendaproductoService;

import java.util.ArrayList;
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
    public List<ResultadoCantidadPreciosDeterminados> BuscarCantidadPreciosDeterminados() {
        List<ResultadoCantidadPreciosDeterminados> lista = new ArrayList<>();
        pR.BuscarCantidadPreciosDeterminados().forEach( y -> {
            ResultadoCantidadPreciosDeterminados re = new ResultadoCantidadPreciosDeterminados();
            re.setNombre_producto(y[0]);
            re.setPrecio_unidad(y[1]);
            re.setCantidad(y[2]);
            lista.add(re);
        });


        return lista;
    }


}
