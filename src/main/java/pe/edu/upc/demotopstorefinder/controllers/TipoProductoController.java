package pe.edu.upc.demotopstorefinder.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.entities.TipoProducto;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITipoProductoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipoproducto")
public class TipoProductoController {

    @Autowired
    private ITipoProductoService pService;

    @PostMapping
    public void registrar(@RequestBody TipoProducto tp){
        pService.insert(tp);
    }

    @GetMapping
    public List<TipoProducto> listar(){
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id){ pService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody TipoProducto tp){ pService.insert(tp);}

    @PostMapping("/buscar")
    public List<TipoProducto> buscar(@RequestBody TipoProducto p){
        return pService.search(p.getCategoriaNombre());
    }

    @GetMapping("/{id}")
    public Optional<TipoProducto> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
