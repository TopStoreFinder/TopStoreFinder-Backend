package pe.edu.upc.demotopstorefinder.entities;

public class ResultadoCantidadReseniaporTienda {

    private String tienda;
    private String cantidadresenia;

    public ResultadoCantidadReseniaporTienda() {
    }

    public ResultadoCantidadReseniaporTienda(String tienda, String cantidadresenia) {
        this.tienda = tienda;
        this.cantidadresenia = cantidadresenia;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getCantidadresenia() {
        return cantidadresenia;
    }

    public void setCantidadresenia(String cantidadresenia) {
        this.cantidadresenia = cantidadresenia;
    }
}
