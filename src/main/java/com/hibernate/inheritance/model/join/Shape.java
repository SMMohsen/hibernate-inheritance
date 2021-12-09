package com.hibernate.inheritance.model.join;

import javax.persistence.*;

@Entity
@Table(name = "shapes")
@Inheritance(strategy = InheritanceType.JOINED)
public class Shape {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
