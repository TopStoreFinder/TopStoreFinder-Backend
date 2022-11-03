package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombreProducto", length = 100,nullable = false)
    private String nombreProducto;
    @Column(name="productoDescripcion", length = 100,nullable = false)
    private String productoDescripcion;
    @Column(name="cantidad", length = 100,nullable = false)
    private String cantidad;
    @Column(name="precioUnidad",nullable = false)
    private int precioUnidad;

    @ManyToOne
    @JoinColumn(name = "categoriaProdcuto",nullable = false)
    private TipoProducto categoriaProdcuto;

    @ManyToOne
    @JoinColumn(name = "id_Stock", nullable = false)
    private Stock id_Stock;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getProductoDescripcion() {
        return productoDescripcion;
    }

    public void setProductoDescripcion(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public TipoProducto getId_tipoproducto() {
        return categoriaProdcuto;
    }

    public void setId_tipoproducto(TipoProducto id_tipoproducto) {
        this.categoriaProdcuto = id_tipoproducto;
    }

    public Stock getId_Stock() {
        return id_Stock;
    }

    public void setId_Stock(Stock id_Stock) {
        this.id_Stock = id_Stock;
    }

    public Producto(int id, String nombreProducto, String productoDescripcion, String cantidad, int precioUnidad, TipoProducto id_tipoproducto, Stock id_Stock) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.productoDescripcion = productoDescripcion;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.categoriaProdcuto = id_tipoproducto;
        this.id_Stock = id_Stock;
    }

    public Producto() {
    }
}
