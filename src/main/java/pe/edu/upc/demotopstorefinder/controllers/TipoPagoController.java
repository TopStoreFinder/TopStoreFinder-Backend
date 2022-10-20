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
}
