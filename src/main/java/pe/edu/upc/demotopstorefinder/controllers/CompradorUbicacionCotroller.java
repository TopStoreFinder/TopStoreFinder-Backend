package pe.edu.upc.demotopstorefinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.compradorUbicacion;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ICompradorUbicacionService;


import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compradorubicacion")
public class CompradorUbicacionCotroller {
    @Autowired
    private ICompradorUbicacionService tService;

    @PostMapping
    public void registrar(@RequestBody compradorUbicacion t) {
        tService.insertar(t);
    }

    @PutMapping
    public void modificar(@RequestBody compradorUbicacion t) {
        tService.insertar(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tService.eliminar(id);
    }

    @GetMapping
    public List<compradorUbicacion> listar() {
        return tService.listar();
    }


    @GetMapping("/{id}")
    public Optional<compradorUbicacion> listarId(@PathVariable("id") Integer id) {
        return tService.listarId(id);
    }
}
