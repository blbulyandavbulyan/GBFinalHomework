package com.blbulyandavbulyan.gbfinalhoomework.entity.animal.working;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Donkey extends WorkingAnimal {
    public Donkey(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }
}
