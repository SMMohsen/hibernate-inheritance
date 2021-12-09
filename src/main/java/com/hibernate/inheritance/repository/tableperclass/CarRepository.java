package com.hibernate.inheritance.repository.tableperclass;

import com.hibernate.inheritance.model.tableperclass.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
