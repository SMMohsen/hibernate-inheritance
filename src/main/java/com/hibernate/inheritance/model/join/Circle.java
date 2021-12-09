package com.hibernate.inheritance.model.join;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "circle")
public class Circle extends Shape {

    @Column(name = "radius")
    private Long radius;

    public Long getRadius() {
        return radius;
    }

    public void setRadius(Long radius) {
        this.radius = radius;
    }
}
