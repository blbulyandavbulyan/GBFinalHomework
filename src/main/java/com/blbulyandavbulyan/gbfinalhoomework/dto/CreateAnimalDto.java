package com.blbulyandavbulyan.gbfinalhoomework.dto;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.blbulyandavbulyan.gbfinalhoomework.entity.animal.Animal}
 */
public record CreateAnimalDto(String name, LocalDate dateOfBirth) implements Serializable {
}