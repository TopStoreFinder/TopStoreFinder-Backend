package pe.edu.upc.demotopstorefinder.entities;

public class ResultadoCantidadProductosTipo {
    private String categoria_nombre;
    private String cantidad;
public ResultadoCantidadProductosTipo(String categoria_nombre,String cantidad){
    this.cantidad =cantidad;
    this.categoria_nombre = categoria_nombre;
}
public ResultadoCantidadProductosTipo(){
}

    public String getCategoria_nombre() {
        return categoria_nombre;
    }

    public void setCategoria_nombre(String categoria_nombre) {
        this.categoria_nombre = categoria_nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
