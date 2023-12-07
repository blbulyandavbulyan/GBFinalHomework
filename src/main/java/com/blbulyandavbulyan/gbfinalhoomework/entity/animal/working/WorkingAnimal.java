package com.blbulyandavbulyan.gbfinalhoomework.entity.animal.working;

import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.Animal;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public abstract class WorkingAnimal extends Animal{
    public WorkingAnimal(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }
}
