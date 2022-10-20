package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comprador")
public class Comprador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre",length = 30, nullable = false)
    private String nombre;
    @Column(name = "apellido",length = 30,nullable = false)
    private String apellido;
    @Column(name = "ciudad_id",nullable = false)
    private int ciudad_id;

    public Comprador() {
    }

    public Comprador(int id, String nombre, String apellido, int ciudad_id) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad_id = ciudad_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(int ciudad_id) {
        this.ciudad_id = ciudad_id;
    }
}
