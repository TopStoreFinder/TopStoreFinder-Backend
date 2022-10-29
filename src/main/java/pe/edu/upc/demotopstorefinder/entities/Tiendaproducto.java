package pe.edu.upc.demotopstorefinder.entities;


import javax.persistence.*;

@Entity
@Table(name = "Tiendaproducto")
public class Tiendaproducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tiendaid",length = 20,nullable = false)
    private String tiendaid;

    public Tiendaproducto() {
    }

    public Tiendaproducto(int id, String tiendaid) {
        this.id = id;
        this.tiendaid = tiendaid;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gettiendaid() {
        return tiendaid;
    }

    public void settiendaid(String tiendaid) {
        this.tiendaid = tiendaid;
    }
}
