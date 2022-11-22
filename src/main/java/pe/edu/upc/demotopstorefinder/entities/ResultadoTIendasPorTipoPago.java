package pe.edu.upc.demotopstorefinder.entities;

public class ResultadoTIendasPorTipoPago {

    private String tipopago;
    private String cantidadTiendas;

    public ResultadoTIendasPorTipoPago(String tipopago, String cantidadTiendas) {
        this.tipopago = tipopago;
        this.cantidadTiendas = cantidadTiendas;
    }

    public ResultadoTIendasPorTipoPago() {
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }

    public String getCantidadTiendas() {
        return cantidadTiendas;
    }

    public void setCantidadTiendas(String cantidadTiendas) {
        this.cantidadTiendas = cantidadTiendas;
    }
}
