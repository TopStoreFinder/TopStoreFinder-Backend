package pe.edu.upc.demotopstorefinder.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.Producto;
import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadProductosporcadaTienda;
import pe.edu.upc.demotopstorefinder.repositories.IProductoRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IProductoService;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository pProducto;

    @Override
    @Transactional
    public boolean insertar(Producto producto) {
        Producto objProducto = pProducto.save(producto);
        if (objProducto == null){
            return false;}
        else{
            return true;}
    }

    @Override
    @Transactional
    public void eliminar(int idProducto) {
        pProducto.deleteById(idProducto);
    }
    @Override
    public Optional<Producto> listarId(int idProducto) {
        return pProducto.findById(idProducto);
    }

    @Override
    public List<Producto> listar() {
        return pProducto.findAll();
    }

    @Override
    public List<Producto> buscarProducto(String NombreProducto) {
        return buscarProducto(NombreProducto);
    }
    @Override
    public List<ResultadoCantidadProductosporcadaTienda> BuscarCantidadProductosPorTienda() {
        List<ResultadoCantidadProductosporcadaTienda> lista = new ArrayList<>();
        pProducto.BuscarCantidadProductosPorTienda().forEach( y -> {
            ResultadoCantidadProductosporcadaTienda re = new ResultadoCantidadProductosporcadaTienda();
            re.setCategorianombre(y[0]);
            re.setCantidad(y[1]);
            lista.add(re);
        });



        return lista;
    }

}
