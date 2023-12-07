package com.blbulyandavbulyan.gbfinalhoomework.service;

import com.blbulyandavbulyan.gbfinalhoomework.entity.Command;
import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.Animal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class CommandService {

    private final AnimalService animalService;
    public void addCommandForAnimal(Long animalId, Command command){
        Animal animal = animalService.getAnimalById(animalId);
        animal.addCommand(command);
        animalService.save(animal);
    }

    public Set<Command> getAnimalCommands(Long animalId) {
        return animalService.getAnimalById(animalId).getCommands();
    }
}
