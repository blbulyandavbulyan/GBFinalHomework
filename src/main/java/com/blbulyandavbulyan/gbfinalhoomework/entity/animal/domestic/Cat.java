package com.blbulyandavbulyan.gbfinalhoomework.entity.animal.domestic;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Cat extends DomesticAnimal {
    public Cat(String name, LocalDate localDate) {
        super(name, localDate);
    }
}
