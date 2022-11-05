package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.Comprador;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.repositories.ICompradorRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ICompradorService;

import java.util.List;
import java.util.Optional;

@Service
public class CompradorServiceImpl implements ICompradorService {

    @Autowired
    private ICompradorRepository pR;


    @Override
    public void insert(Comprador comprador) {
        pR.save(comprador);
    }

    @Override
    public List<Comprador> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idComprador) {pR.deleteById(idComprador);}

    @Override
    public List<Comprador> search(String nombre) {

        return pR.buscarNombre(nombre);
    }

    @Override
    public Optional<Comprador> listarId(int idComprador) {
        return pR.findById(idComprador);
    }
}
