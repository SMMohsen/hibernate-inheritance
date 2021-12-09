package com.hibernate.inheritance.repository.singletable;

import com.hibernate.inheritance.model.singletable.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog,Long> {
}
