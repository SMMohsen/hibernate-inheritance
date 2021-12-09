package com.hibernate.inheritance.repository.join;

import com.hibernate.inheritance.model.join.Shape;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShapeRepository extends JpaRepository<Shape,Long> {
}
