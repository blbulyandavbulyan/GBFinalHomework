package com.blbulyandavbulyan.gbfinalhoomework.controller;

import com.blbulyandavbulyan.gbfinalhoomework.entity.Command;
import com.blbulyandavbulyan.gbfinalhoomework.service.CommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/commands")
public class CommandController {

    private final CommandService commandService;
    @GetMapping("/{animalId}")
    public Set<Command> getAnimalCommands(@PathVariable Long animalId){
        return commandService.getAnimalCommands(animalId);
    }
    @PostMapping("/{animalId}")
    public void addCommandForAnimal(@PathVariable Long animalId, @RequestParam Command command){
        commandService.addCommandForAnimal(animalId, command);
    }
}
