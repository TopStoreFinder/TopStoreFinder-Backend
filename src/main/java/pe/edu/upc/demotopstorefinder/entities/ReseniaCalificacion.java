package pe.edu.upc.demotopstorefinder.entities;
import javax.persistence.*;

@Entity
public class ReseniaCalificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="cantidadEstrellas", nullable = false)
    private int cantidadEstrellas;

    @Column(name="resenia", length = 100,nullable = false)
    private String resenia;

    @ManyToOne
    @JoinColumn(name="clienteID",nullable = false)
    private Comprador clienteID;

    @ManyToOne
    @JoinColumn(name="tiendaID",nullable = false)
    private Tienda tiendaID;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getCantidadEstrellas() {return cantidadEstrellas;}

    public void setCantidadEstrellas(int cantidadEstrellas) {this.cantidadEstrellas = cantidadEstrellas;}

    public String getResenia() {return resenia;}

    public void setResenia(String resenia) {this.resenia = resenia;}

    public Comprador getClienteID() {return clienteID;}

    public void setClienteID(Comprador clienteID) {this.clienteID = clienteID;}

    public Tienda getTiendaID() {return tiendaID;}

    public void setTiendaID(Tienda tiendaID) {this.tiendaID = tiendaID;}

    public ReseniaCalificacion(int id, String resenia, Comprador clienteID, Tienda tiendaID) {
        this.id = id;
        this.cantidadEstrellas = cantidadEstrellas;
        this.resenia = resenia;
        this.clienteID = clienteID;
        this.tiendaID = tiendaID;
    }
    public ReseniaCalificacion(){}
}
