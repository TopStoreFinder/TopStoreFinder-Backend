package pe.edu.upc.demotopstorefinder.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.Comprador;
import pe.edu.upc.demotopstorefinder.entities.Tienda;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ICompradorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comprador")
public class CompradorController {
    @Autowired
    private ICompradorService pService;

    @PostMapping
    public void registrar(@RequestBody Comprador tp){
        pService.insert(tp);
    }

    @GetMapping
    public List<Comprador> listar(){
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id){ pService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody Comprador tp){ pService.insert(tp);}

    @PostMapping("/buscar")
    public List<Comprador> buscar(@RequestBody Comprador p){
        return pService.search(p.getNombre());
    }

    @GetMapping("/{id}")
    public Optional<Comprador> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
