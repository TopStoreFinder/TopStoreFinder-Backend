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
    @Column(name = "LastUpdateTime")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate LastUpdateTime;

    public Stock() {
    }

    public Stock(int id, int enStock, LocalDate lastUpdateTime) {
        this.id = id;
        this.enStock = enStock;
        LastUpdateTime = lastUpdateTime;
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

    public LocalDate ObtenerLastUpdateTime() {
        return LastUpdateTime;
    }

    public void setLastUpdateTime(LocalDate lastUpdateTime) {
        LastUpdateTime = lastUpdateTime;
    }
}