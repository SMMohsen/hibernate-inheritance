package com.hibernate.inheritance.repository.join;

import com.hibernate.inheritance.model.join.Circle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircleRepository extends JpaRepository<Circle,Long> {
}
