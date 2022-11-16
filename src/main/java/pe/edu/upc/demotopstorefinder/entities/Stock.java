package pe.edu.upc.demotopstorefinder.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "enStock",nullable = false)
    private int enStock;
    @Column(name = "fecha")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fecha;

    public Stock(int id, int enStock, LocalDate fecha) {
        this.id = id;
        this.enStock = enStock;
        this.fecha = fecha;
    }

    public Stock() {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
