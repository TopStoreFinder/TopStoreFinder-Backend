package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoPago")
public class TipoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tipo",length = 50,nullable = false)
    private String tipo;

    public TipoPago() {
    }

    public TipoPago(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
