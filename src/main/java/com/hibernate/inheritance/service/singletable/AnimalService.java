package com.hibernate.inheritance.service.singletable;

import com.hibernate.inheritance.model.singletable.Animal;
import com.hibernate.inheritance.model.singletable.Cat;
import com.hibernate.inheritance.model.singletable.Dog;
import com.hibernate.inheritance.repository.singletable.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    /*

    * bit fall of this method :
     you should handle null columns
     you can not define constraint on top of columns of sub-class

     */

    @Autowired
    private AnimalRepository animalRepository;


    public void addAnimal(Animal animal) {

        animalRepository.save(animal);

    }

    public void addCat(Cat cat) {

        animalRepository.save(cat);

    }

    public void addDog(Dog dog) {

        animalRepository.save(dog);

    }

    public List<Animal> getAllAnimals() {

        return animalRepository.findAll();

    }


}
