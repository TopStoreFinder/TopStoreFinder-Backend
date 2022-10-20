package pe.edu.upc.demotopstorefinder.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.entities.TipoProducto;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITipoProductoService;

import java.util.List;

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
}
