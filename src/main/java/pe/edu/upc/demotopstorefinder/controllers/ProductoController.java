package pe.edu.upc.demotopstorefinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.Producto;
import pe.edu.upc.demotopstorefinder.entities.ResultadoCantidadProductosporcadaTienda;
import pe.edu.upc.demotopstorefinder.entities.ResultadoTIendasPorTipoPago;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IProductoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private IProductoService pService;

    @PostMapping
    public void registrar(@RequestBody Producto t) {
        pService.insertar(t);
    }

    @PutMapping
    public void modificar(@RequestBody Producto t) {
        pService.insertar(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PutMapping
    public void actualizar(@RequestBody Producto tp){ pService.insertar(tp);}

    @GetMapping
    public List<Producto> listar() {
        return pService.listar();
    }

    @PostMapping("/buscar")
    public List<Producto> buscar(@RequestBody Producto t){
        return pService.buscarProducto(t.getNombreProducto());
    }

    @GetMapping("/{id}")
    public Optional<Producto> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping("/buscarcantidadtiendasporproducto")
    public List<ResultadoCantidadProductosporcadaTienda> ResultadoCantidadProductosporcadaTienda(){
       return pService.BuscarCantidadProductosPorTienda();
}
}
