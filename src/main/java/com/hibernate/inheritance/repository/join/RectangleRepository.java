package com.hibernate.inheritance.repository.join;

import com.hibernate.inheritance.model.join.Rectangle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RectangleRepository extends JpaRepository<Rectangle,Long> {
}
