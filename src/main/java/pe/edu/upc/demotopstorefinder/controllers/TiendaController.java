package pe.edu.upc.demotopstorefinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadTiendasPorCadaDuenho;
import pe.edu.upc.demotopstorefinder.entities.ResultadoTIendasPorTipoPago;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITiendaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tienda")
public class TiendaController {

    @Autowired
    private ITiendaService tService;

    @PostMapping
    public void registrar(@RequestBody Tienda t) {
        tService.insertar(t);
    }

    @PutMapping
    public void modificar(@RequestBody Tienda t) {
        tService.insertar(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tService.eliminar(id);
    }

    @GetMapping
    public List<Tienda> listar() {
        return tService.listar();
    }

    @PostMapping("/buscar")
    public List<Tienda> buscar(@RequestBody String nombre) throws ParseException{
        List<Tienda>listaTienda;
        listaTienda = tService.buscarTienda(nombre);
        return listaTienda;
    }

    @GetMapping("/{id}")
    public Optional<Tienda> listarId(@PathVariable("id") Integer id) {
        return tService.listarId(id);
    }

    @GetMapping("/buscarcantidadtiendasporcadaduenho")

    public List<ResultadoCantidadTiendasPorCadaDuenho> BuscarCantidadTiendasPorCadaDuenho(){
        return tService.buscarCantidadTiendasPorCadaDuenho();
    }
}
