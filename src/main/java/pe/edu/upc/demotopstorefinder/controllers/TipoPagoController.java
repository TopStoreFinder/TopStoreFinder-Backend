package pe.edu.upc.demotopstorefinder.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITipoPagoService;

import java.util.List;

@RestController
@RequestMapping("/tipopago")
public class TipoPagoController {
    @Autowired
    private ITipoPagoService pService;

    @PostMapping
    public void registrar(@RequestBody TipoPago tp){
        pService.insert(tp);
    }

    @GetMapping
    public List<TipoPago> listar(){
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id){ pService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody TipoPago tp){ pService.insert(tp);}

    @PostMapping("/buscar")
    public List<TipoPago> buscar(@RequestBody TipoPago p){
        return pService.search(p.getTipo());
    }
}
