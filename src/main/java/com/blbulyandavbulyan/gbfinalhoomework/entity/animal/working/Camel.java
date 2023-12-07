package com.blbulyandavbulyan.gbfinalhoomework.entity.animal.working;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Camel extends WorkingAnimal {
    public Camel(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }
}
