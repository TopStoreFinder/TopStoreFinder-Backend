package pe.edu.upc.demotopstorefinder.entities;
import javax.persistence.*;

@Entity
public class ReseniaCalificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cantestrellas", nullable = false)
    private int cantestrellas;

    @Column(name = "resenia", length = 100, nullable = false)
    private String resenia;

    @ManyToOne
    @JoinColumn(name = "clienteid", nullable = false)
    private Comprador clienteid;

    @ManyToOne
    @JoinColumn(name = "tiendaid", nullable = false)
    private Tienda tiendaid;

    public ReseniaCalificacion(int id, int cantestrellas, String resenia, Comprador clienteid, Tienda tiendaid) {
        this.id = id;
        this.cantestrellas = cantestrellas;
        this.resenia = resenia;
        this.clienteid = clienteid;
        this.tiendaid = tiendaid;
    }

    public ReseniaCalificacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantestrellas() {
        return cantestrellas;
    }

    public void setCantestrellas(int cantestrellas) {
        this.cantestrellas = cantestrellas;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public Comprador getClienteid() {
        return clienteid;
    }

    public void setClienteid(Comprador clienteid) {
        this.clienteid = clienteid;
    }

    public Tienda getTiendaid() {
        return tiendaid;
    }

    public void setTiendaid(Tienda tiendaid) {
        this.tiendaid = tiendaid;
    }
}
