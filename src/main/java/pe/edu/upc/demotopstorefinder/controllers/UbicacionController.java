package pe.edu.upc.demotopstorefinder.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.entities.Ubicacion;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IUbicacionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ubicacion")

public class UbicacionController {
    @Autowired
    private IUbicacionService pService;

    @PostMapping
    public void registrar(@RequestBody Ubicacion u){
        pService.insert(u);
    }

    @GetMapping
    public List<Ubicacion> listar(){
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id){ pService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody Ubicacion u){ pService.insert(u);}

    @GetMapping("/{id}")
    public Optional<Ubicacion> buscar(@PathVariable("id") Integer id){
        return pService.ListarId(id);
    }
}
