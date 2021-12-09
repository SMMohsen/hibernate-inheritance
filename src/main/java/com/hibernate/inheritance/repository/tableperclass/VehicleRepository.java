package com.hibernate.inheritance.repository.tableperclass;

import com.hibernate.inheritance.model.tableperclass.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}
