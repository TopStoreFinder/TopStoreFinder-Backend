package pe.edu.upc.demotopstorefinder.entities;

import javax.persistence.*;

@Entity
@Table(name = "Stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "enStock",nullable = false)
    private int enStock;
    @Column(name = "fecha",length = 30,nullable = false)
    private String fecha;

    public Stock() {
    }

    public Stock(int id, int enStock, String lastUpdateTime) {
        this.id = id;
        this.enStock = enStock;
        fecha = lastUpdateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnStock() {
        return enStock;
    }

    public void setEnStock(int enStock) {
        this.enStock = enStock;
    }

    public String getLastUpdateTime() {
        return fecha;
    }

    public void setLastUpdateTime(String fechaa) {
        fecha = fechaa;
    }
}
