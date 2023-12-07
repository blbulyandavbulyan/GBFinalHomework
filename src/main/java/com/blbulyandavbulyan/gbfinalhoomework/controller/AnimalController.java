package com.blbulyandavbulyan.gbfinalhoomework.controller;

import com.blbulyandavbulyan.gbfinalhoomework.dto.AnimalDTO;
import com.blbulyandavbulyan.gbfinalhoomework.dto.CreateAnimalDto;
import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.domestic.Cat;
import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.domestic.Dog;
import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.domestic.Hamster;
import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.working.Camel;
import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.working.Donkey;
import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.working.Horse;
import com.blbulyandavbulyan.gbfinalhoomework.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/animals")
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<AnimalDTO> getAllAnimals() {
        return animalService.getAllAnimals().stream()
                .map(animal -> new AnimalDTO(animal.getClass().getSimpleName(), animal.getName(), animal.getDateOfBirth()))
                .toList();
    }

    @PostMapping("/cats")
    public void createCat(@RequestBody CreateAnimalDto createAnimalDto) {
        animalService.save(new Cat(createAnimalDto.name(), createAnimalDto.dateOfBirth()));
    }
    @PostMapping("/dogs")
    public void createDog(@RequestBody CreateAnimalDto createAnimalDto) {
        animalService.save(new Dog(createAnimalDto.name(), createAnimalDto.dateOfBirth()));
    }
    @PostMapping("/hamsters")
    public void createHamster(@RequestBody CreateAnimalDto createAnimalDto) {
        animalService.save(new Hamster(createAnimalDto.name(), createAnimalDto.dateOfBirth()));
    }

    @PostMapping("/horses")
    public void createHorse(@RequestBody CreateAnimalDto createAnimalDto) {
        animalService.save(new Horse(createAnimalDto.name(), createAnimalDto.dateOfBirth()));
    }

    @PostMapping("/camels")
    public void createCamel(@RequestBody CreateAnimalDto createAnimalDto) {
        animalService.save(new Camel(createAnimalDto.name(), createAnimalDto.dateOfBirth()));
    }

    @PostMapping("/donkeys")
    public void createDonkey(@RequestBody CreateAnimalDto createAnimalDto) {
        animalService.save(new Donkey(createAnimalDto.name(), createAnimalDto.dateOfBirth()));
    }
}
