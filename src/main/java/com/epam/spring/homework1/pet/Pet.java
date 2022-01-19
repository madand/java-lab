package com.epam.spring.homework1.pet;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {
    private List<Animal> pets;

    public Pet(List<Animal> pets) {
        this.pets = pets;
    }

    public void printPets() {
        pets.stream()
                .map(Object::getClass)
                .map(Class::getSimpleName)
                .forEach(System.out::println);
    }
}
