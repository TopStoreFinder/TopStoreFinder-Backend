package pe.edu.upc.demotopstorefinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotopstorefinder.entities.*;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.IStockService;
import pe.edu.upc.demotopstorefinder.serviceinterfaces.ITipoPagoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private IStockService sService;

    @PostMapping
    public void registrar(@RequestBody Stock s){
        sService.insertar(s);
    }

    @GetMapping
    public List<Stock> listar(){
        return sService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ sService.eliminar(id);}

    @PutMapping
    public void actualizar(@RequestBody Stock s){ sService.insertar(s);}

    @GetMapping("/{id}")
    public Optional<Stock> listarId(@PathVariable("id") Integer id) {
        return sService.listarId(id);
    }

    @GetMapping("/buscarstockporproducto")
    public List<ResultadoStockPorProducto> BuscarStockPorProducto(){
        return sService.BuscarStockPorProducto();
    }

    @GetMapping("/buscarstockporproductomenor50")
    public List<ResultadoStockPorProducto> BuscarStockPorProductoMenor50(){return sService.MostrarStockPorProductoMenor50();
    }
}
