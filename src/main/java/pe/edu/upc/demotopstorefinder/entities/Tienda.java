package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;

@Entity
public class Tienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre", length = 100,nullable = false)
    private String nombre;
    @Column(name="direccion", length = 100,nullable = false)
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_duenho",nullable = false)
    private Duenho id_duenho;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago", nullable = false)
    private TipoPago id_tipo_pago;


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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Duenho getId_duenho() {
        return id_duenho;
    }

    public void setId_duenho(Duenho id_duenho) {
        this.id_duenho = id_duenho;
    }

    public TipoPago getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(TipoPago id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public Tienda(int id, String nombre, String direccion, Duenho id_duenho, TipoPago id_tipo_pago) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.id_duenho = id_duenho;
        this.id_tipo_pago = id_tipo_pago;
    }

    public Tienda() {
    }
}
