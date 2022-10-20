package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;

@Entity
@Table(name = "Duenho")
public class Duenho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre",length = 30,nullable = false)
    private String nombre;
    @Column(name = "edad",nullable = false)
    private int edad;
    @Column(name = "direccion",length = 100,nullable = false)
    private String direccion;

    public Duenho() {
    }

    public Duenho(int id, String nombre, int edad, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
