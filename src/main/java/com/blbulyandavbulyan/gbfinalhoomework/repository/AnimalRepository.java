package com.blbulyandavbulyan.gbfinalhoomework.repository;

import com.blbulyandavbulyan.gbfinalhoomework.entity.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}