package pe.edu.upc.demotopstorefinder.entities;
import javax.persistence.*;

@Entity
public class ReseniaCalificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="qEstrellas", nullable = false)
    private int qEstrellas;

    @Column(name="Resenia", length = 100,nullable = false)
    private String Resenia;

    @ManyToOne
    @JoinColumn(name="Cliente_id",nullable = false)
    private Comprador Cliente_id;

    @ManyToOne
    @JoinColumn(name="Tienda_id",nullable = false)
    private Tienda Tienda_id;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getCantidadEstrellas() {return qEstrellas;}

    public void setCantidadEstrellas(int qEstrellas) {this.qEstrellas = qEstrellas;}

    public String getResenia() {return Resenia;}

    public void setResenia(String Resenia) {this.Resenia = Resenia;}

    public Comprador getClienteID() {return Cliente_id ;}

    public void setClienteID(Comprador Cliente_id ) {this.Cliente_id = Cliente_id;}

    public Tienda getTiendaID() {return Tienda_id;}

    public void setTiendaID(Tienda Tienda_id) {this.Tienda_id = Tienda_id;}

    public ReseniaCalificacion(int id, String resenia, Comprador clienteID, Tienda tiendaID) {
        this.id = id;
        this.qEstrellas = qEstrellas;
        this.Resenia = Resenia;
        this.Cliente_id = Cliente_id;
        this.Tienda_id = Tienda_id;
    }
    public ReseniaCalificacion(){}
}
