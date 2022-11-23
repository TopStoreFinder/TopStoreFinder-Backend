package pe.edu.upc.demotopstorefinder.entities;

public class ResultadoCantidadPreciosDeterminados {

    private String nombre_producto;
    private String precio_unidad;
    private String cantidad;

    public ResultadoCantidadPreciosDeterminados(String nombre_producto, String precio_unidad,String cantidad) {
        this.nombre_producto = nombre_producto;
        this.precio_unidad = precio_unidad;
        this.cantidad = cantidad;
    }
    public ResultadoCantidadPreciosDeterminados(){}

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(String precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}

