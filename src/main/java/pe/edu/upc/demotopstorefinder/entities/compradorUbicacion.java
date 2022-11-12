package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;
@Entity
public class compradorUbicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "clienteid",nullable = false)
    private Comprador clienteid;

    @ManyToOne
    @JoinColumn(name = "ubicacionid",nullable = false)
    private Ubicacion ubicacionid;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comprador getClienteid() {
        return clienteid;
    }

    public void setClienteid(Comprador clienteid) {
        this.clienteid = clienteid;
    }

    public Ubicacion getUbicacionid() {
        return ubicacionid;
    }

    public void setUbicacionid(Ubicacion ubicacionid) {
        this.ubicacionid = ubicacionid;
    }

    public compradorUbicacion(int id, Comprador clienteid, Ubicacion ubicacionid) {
        this.id = id;
        this.clienteid = clienteid;
        this.ubicacionid = ubicacionid;
    }

    public compradorUbicacion() {
    }
}
