package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;

@Entity
@Table(name = "Ubicacion")
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "longitud",nullable = false)
    private int longitud;
    @Column(name = "latitud",nullable = false)
    private int latitud;

    public Ubicacion() {
    }

    public Ubicacion(int id, int longitud, int latitud) {
        this.id = id;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }
}
