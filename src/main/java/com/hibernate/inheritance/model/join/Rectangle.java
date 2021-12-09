package com.hibernate.inheritance.model.join;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rectangle")
public class Rectangle extends Shape {

    @Column(name = "width")
    private Long width;

    @Column(name = "height")
    private Long height;

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }
}
