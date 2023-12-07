package com.blbulyandavbulyan.gbfinalhoomework.entity.animal.working;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Horse extends WorkingAnimal {
    public Horse(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }
}
