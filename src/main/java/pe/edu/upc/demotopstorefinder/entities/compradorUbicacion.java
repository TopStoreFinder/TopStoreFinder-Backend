package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;
@Entity
public class compradorUbicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "clienteid",nullable = false)
    private Duenho clienteid;

    @ManyToOne
    @JoinColumn(name = "ubicacionid",nullable = false)
    private Duenho ubicacionid;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Duenho getClienteid() {
        return clienteid;
    }

    public void setClienteid(Duenho clienteid) {
        this.clienteid = clienteid;
    }

    public Duenho getUbicacionid() {
        return ubicacionid;
    }

    public void setUbicacionid(Duenho ubicacionid) {
        this.ubicacionid = ubicacionid;
    }

    public compradorUbicacion(int id, Duenho clienteid, Duenho ubicacionid) {
        this.id = id;
        this.clienteid = clienteid;
        this.ubicacionid = ubicacionid;
    }

    public compradorUbicacion() {
    }
}
