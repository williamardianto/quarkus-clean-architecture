package com.example.core.service;

import com.example.core.dto.AnimalDTO;
import com.example.core.entity.Animal;

import java.util.List;

public interface AnimalService {
    Animal create(AnimalDTO animalDTO);
    List<? extends Animal> getTwoLegsAnimals();
    Animal findById(Long id);
}
