package com.blbulyandavbulyan.gbfinalhoomework.service;

import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.Animal;
import com.blbulyandavbulyan.gbfinalhoomework.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepository;
    public Animal getAnimalById(Long animalId){
        return animalRepository.findById(animalId).orElseThrow();
    }

    public void save(Animal animal){
        animalRepository.save(animal);
    }
    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }
}
