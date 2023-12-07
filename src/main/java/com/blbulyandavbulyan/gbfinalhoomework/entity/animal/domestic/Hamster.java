package com.blbulyandavbulyan.gbfinalhoomework.entity.animal.domestic;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Hamster extends DomesticAnimal {
    public Hamster(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }
}
