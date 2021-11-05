package com.example.core.repository;

import com.example.core.dto.AnimalDTO;
import com.example.core.entity.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> list();

    Animal findById(Long id);

    Animal create(AnimalDTO animalDTO);
}
