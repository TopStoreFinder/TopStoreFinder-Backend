package pe.edu.upc.demotopstorefinder.entities;

public class ResultadoCantidadProductosporcadaTienda {

    private String categorianombre;
    private String cantidad;

    public ResultadoCantidadProductosporcadaTienda() {
    }

    public ResultadoCantidadProductosporcadaTienda(String categorianombre, String cantidad) {
        this.categorianombre = categorianombre;
        this.cantidad = cantidad;
    }

    public String getCategorianombre() {
        return categorianombre;
    }

    public void setCategorianombre(String categorianombre) {
        this.categorianombre = categorianombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
