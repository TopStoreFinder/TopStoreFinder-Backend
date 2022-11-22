package pe.edu.upc.demotopstorefinder.entities;

public class ResultadoCantidadTiendasPorCadaDuenho {

    private String nombre;
    private String edad;
    private String cantidad;

    public ResultadoCantidadTiendasPorCadaDuenho(String nombre, String edad, String cantidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidad = cantidad;
    }

    public ResultadoCantidadTiendasPorCadaDuenho() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
