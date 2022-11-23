package pe.edu.upc.demotopstorefinder.entities;

public class ResultadoStockPorProducto {
    private String Nombre;
    private String Cantidad;

    public ResultadoStockPorProducto() {
    }

    public ResultadoStockPorProducto(String nombre, String cantidad) {
        Nombre = nombre;
        Cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }


}
