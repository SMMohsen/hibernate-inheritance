package com.hibernate.inheritance.model.tableperclass;

import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;

@Entity
@Table(name = "bus")
public class Bus extends Vehicle {


    @Column(name = "bus_seats")
    private Long busSeats;


    public Long getBusSeats() {
        return busSeats;
    }

    public void setBusSeats(Long busSeats) {
        this.busSeats = busSeats;
    }
}
