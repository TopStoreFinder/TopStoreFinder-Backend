package pe.edu.upc.demotopstorefinder.entities;


import javax.persistence.*;

@Entity
@Table(name = "Tiendaproducto")
public class Tiendaproducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "tienda_id",nullable = false)
    private Tienda tienda_id;

    @ManyToOne
    @JoinColumn(name = "productoid",nullable = false)
    private Producto productoid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tienda getTiendaid() {
        return tienda_id;
    }

    public void setTiendaid(Tienda tiendaid) {
        this.tienda_id = tiendaid;
    }

    public Producto getProductoid() {
        return productoid;
    }

    public void setProductoid(Producto productoid) {
        this.productoid = productoid;
    }

    public Tiendaproducto(int id, Tienda tiendaid, Producto productoid) {
        this.id = id;
        this.tienda_id = tiendaid;
        this.productoid = productoid;
    }

    public Tiendaproducto() {
    }
}
