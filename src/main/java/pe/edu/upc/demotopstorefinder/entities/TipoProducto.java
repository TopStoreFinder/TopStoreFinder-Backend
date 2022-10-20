package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoProducto")
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "categoriaNombre",length = 50,nullable = false)
    private String categoriaNombre;

    public TipoProducto() {
    }

    public TipoProducto(int id, String categoriaNombre) {
        this.id = id;
        this.categoriaNombre = categoriaNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoriaNombre() {
        return categoriaNombre;
    }

    public void setCategoriaNombre(String categoriaNombre) {
        this.categoriaNombre = categoriaNombre;
    }
}
