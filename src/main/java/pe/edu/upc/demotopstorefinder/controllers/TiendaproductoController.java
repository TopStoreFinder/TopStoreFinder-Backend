package pe.edu.upc.demotopstorefinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadPreciosDeterminados;
import pe.edu.upc.demotopstorefinder.entities.Tiendaproducto;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITiendaproductoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tiendaproducto")
public class TiendaproductoController {
    @Autowired
    private ITiendaproductoService tpService;

    @PostMapping
    public void registrar(@RequestBody Tiendaproducto t) {
        tpService.insertar(t);
    }

    @PutMapping
    public void modificar(@RequestBody Tiendaproducto t) {
        tpService.insertar(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tpService.eliminar(id);
    }

    @GetMapping
    public List<Tiendaproducto> listar() {
        return tpService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Tiendaproducto> listarId(@PathVariable("id") Integer id) {
        return tpService.listarId(id);
    }

    @GetMapping("/buscarcantidadpreciosDeterminados")
    public List<ResultadoCantidadPreciosDeterminados> BuscarCantidadPreciosDeterminados(){
        return tpService.BuscarCantidadPreciosDeterminados();
    }
}
