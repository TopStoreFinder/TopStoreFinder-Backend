package pe.edu.upc.demotopstorefinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.Stock;
import pe.edu.upc.demotopstorefinder.entities.TipoPago;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IStockService;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITipoPagoService;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private IStockService sService;

    @PostMapping
    public void registrar(@RequestBody Stock s){
        sService.insert(s);
    }

    @GetMapping
    public List<Stock> listar(){
        return sService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ sService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody Stock s){ sService.insert(s);}

    @PostMapping("/buscar")
    public List<Stock> buscar(@RequestBody Stock p){
        return sService.search(p.getLastUpdateTime());
    }
}
