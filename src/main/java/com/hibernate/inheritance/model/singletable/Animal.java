package com.hibernate.inheritance.model.singletable;

import javax.persistence.*;

@Entity
@Table(name = "animals")
@DiscriminatorValue("A")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="animal_type",
        discriminatorType = DiscriminatorType.CHAR)
public class Animal {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
