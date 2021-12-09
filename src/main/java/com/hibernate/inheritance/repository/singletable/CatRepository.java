package com.hibernate.inheritance.repository.singletable;

import com.hibernate.inheritance.model.singletable.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat,Long> {
}
