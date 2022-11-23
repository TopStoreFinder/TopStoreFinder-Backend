package pe.edu.upc.demotopstorefinder.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.*;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IReseniaCalificacionService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reseniacalificacion")
public class ReseniaCalificacionController {

    @Autowired
    private IReseniaCalificacionService rService;

    @PostMapping
    public void registrar(@RequestBody ReseniaCalificacion r) {
        rService.insertar(r);
    }

    @PutMapping
    public void modificar(@RequestBody ReseniaCalificacion r) {
        rService.insertar(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rService.eliminar(id);
    }

    @GetMapping
    public List<ReseniaCalificacion> listar() {
        return rService.listar();
    }

    @PostMapping("/buscar")
    public List<ReseniaCalificacion> buscar(@RequestBody ReseniaCalificacion r){
        return rService.buscarResenia(r.getResenia());
    }

    @GetMapping("/{id}")
    public Optional<ReseniaCalificacion> listarId(@PathVariable("id") Integer id) {
        return rService.listarId(id);
    }

    @GetMapping("/BuscarCantidadReseniasPorTienda")
    public List<ResultadoCantidadReseniaporTienda> ResultadoCantidadReseniaporTienda(){
        return rService.BuscarCantidadReseniasPorTienda();
    }
}
