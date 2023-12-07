package com.blbulyandavbulyan.gbfinalhoomework.entity.animal.domestic;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Dog extends DomesticAnimal {
    // Additional properties or methods specific to dogs
    // ...

    public Dog(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }
}
