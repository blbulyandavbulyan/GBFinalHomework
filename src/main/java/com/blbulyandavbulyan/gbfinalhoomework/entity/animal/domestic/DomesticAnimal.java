package com.blbulyandavbulyan.gbfinalhoomework.entity.animal.domestic;

import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.Animal;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public abstract class DomesticAnimal extends Animal {
    public DomesticAnimal(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }
}
