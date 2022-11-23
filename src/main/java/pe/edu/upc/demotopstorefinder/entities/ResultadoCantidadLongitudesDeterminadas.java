package pe.edu.upc.demotopstorefinder.entities;

public class ResultadoCantidadLongitudesDeterminadas {

    private String longitud;
    private String latitud;
    private String cantidad;

    public ResultadoCantidadLongitudesDeterminadas(String longitud,String latitud, String cantidad) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.cantidad = cantidad;
    }
    public ResultadoCantidadLongitudesDeterminadas(){}

    public String getLatitud() {
        return latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }


    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
