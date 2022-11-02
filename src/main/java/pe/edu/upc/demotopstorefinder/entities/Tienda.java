package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;

@Entity
public class Tienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombreTienda", length = 100,nullable = false)
    private String nombreTienda;
    @Column(name="direccionTienda", length = 100,nullable = false)
    private String direccionTienda;
    @Column(name="resenia", length = 100,nullable = false)
    private String resenia;
    @Column(name="calificacion",nullable = false)
    private int calificacion;

    @ManyToOne
    @JoinColumn(name = "id_duenio",nullable = false)
    private Duenho id_duenio;

    @ManyToOne
    @JoinColumn(name = "id_tipopago", nullable = false)
    private TipoPago id_tipopago;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Duenho getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(Duenho id_duenio) {
        this.id_duenio = id_duenio;
    }

    public TipoPago getId_tipopago() {
        return id_tipopago;
    }

    public void setId_tipopago(TipoPago id_tipopago) {
        this.id_tipopago = id_tipopago;
    }

    public Tienda(int id, String nombreTienda, String direccionTienda, String resenia, int calificacion, Duenho id_duenio, TipoPago id_tipopago) {
        this.id = id;
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.resenia = resenia;
        this.calificacion = calificacion;
        this.id_duenio = id_duenio;
        this.id_tipopago = id_tipopago;
    }

    public Tienda() {
    }
}
