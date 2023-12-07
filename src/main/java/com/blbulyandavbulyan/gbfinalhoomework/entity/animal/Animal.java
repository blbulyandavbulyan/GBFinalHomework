package com.blbulyandavbulyan.gbfinalhoomework.entity.animal;

import com.blbulyandavbulyan.gbfinalhoomework.entity.Command;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "animals")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal_type", discriminatorType = DiscriminatorType.STRING)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    @ElementCollection(targetClass = Command.class)
    @JoinTable(
            name = "animal_commands",
            joinColumns = @JoinColumn(name = "animal_id")
    )
    @Enumerated(EnumType.STRING)
    private Set<Command> commands;
    public Animal(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public void addCommand(Command command){
        if(commands == null) commands = new HashSet<>();
        commands.add(command);
    }
}
