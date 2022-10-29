package pe.edu.upc.demotopstorefinder.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotopstorefinder.entities.Duenho;
import pe.edu.upc.demotopstorefinder.repositories.IDuenhoRepository;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IDuenhoService;

import java.util.List;

@Service
public class DuenhoServiceImpl implements IDuenhoService {
    @Autowired
    private IDuenhoRepository pR;

    @Override
    public void insert(Duenho duenho) {
        pR.save(duenho);
    }

    @Override
    public List<Duenho> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idDuenho) {
        pR.deleteById(idDuenho);

    }

    @Override
    public List<Duenho> search(String categoriaNombre) {
        return pR.buscarDuenho(categoriaNombre);
    }
}
