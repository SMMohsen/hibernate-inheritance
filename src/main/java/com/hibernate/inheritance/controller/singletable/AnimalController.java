package com.hibernate.inheritance.controller.singletable;

import com.hibernate.inheritance.model.singletable.Animal;
import com.hibernate.inheritance.model.singletable.Cat;
import com.hibernate.inheritance.model.singletable.Dog;
import com.hibernate.inheritance.service.singletable.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    public void addAnimal(@RequestBody Animal animal) {

        animalService.addAnimal(animal);

    }

    @PostMapping("/dog")
    public void addDog(@RequestBody Dog dog) {

        animalService.addDog(dog);

    }

    @PostMapping("/cat")
    public void addCat(@RequestBody Cat cat) {

        animalService.addAnimal(cat);

    }


    @GetMapping
    public List<Animal> getAllAnimals() {

        return animalService.getAllAnimals();

    }
}
