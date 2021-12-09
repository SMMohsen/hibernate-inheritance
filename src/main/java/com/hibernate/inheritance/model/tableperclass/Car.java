package com.hibernate.inheritance.model.tableperclass;

import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car extends Vehicle {

    @Column(name = "engine")
    private String engine;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
