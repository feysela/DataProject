package com.datademo.dataproject.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;


    public UnitOfMeasure(String description) {
        this.description = description;
    }

    public UnitOfMeasure() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String uom) {
        this.description = uom;
    }
}
