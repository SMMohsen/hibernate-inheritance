package com.hibernate.inheritance.repository.singletable;

import com.hibernate.inheritance.model.singletable.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {
}
