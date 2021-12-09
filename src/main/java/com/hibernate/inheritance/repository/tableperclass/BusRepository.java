package com.hibernate.inheritance.repository.tableperclass;

import com.hibernate.inheritance.model.tableperclass.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus,Long> {
}
