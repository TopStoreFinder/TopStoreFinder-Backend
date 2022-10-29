package pe.edu.upc.demotopstorefinder.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.Duenho;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IDuenhoService;

import java.util.List;

@RestController
@RequestMapping("/Duenho")
public class DuenhoController {

    @Autowired
   private IDuenhoService pService;

    @PostMapping
    public void registrar (@RequestBody Duenho tp){
        pService.insert(tp);
    }
    @GetMapping
    public List<Duenho> listar(){
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id){ pService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody Duenho tp){ pService.insert(tp);}

    @PostMapping("/buscar")
    public List<Duenho> buscar(@RequestBody Duenho p){
        return pService.search(p.getNombre());
    }

}
