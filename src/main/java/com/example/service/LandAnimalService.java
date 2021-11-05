package com.example.service;

import com.example.backend.SQLAnimalRepository;
import com.example.core.dto.AnimalDTO;
import com.example.core.entity.Animal;
import com.example.core.service.AnimalService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class LandAnimalService implements AnimalService {
    @Inject
    SQLAnimalRepository animalRepository;

    @Override
    public Animal create(AnimalDTO animalDTO) {
        return animalRepository.create(animalDTO);
    }

    @Override
    public List<Animal> getTwoLegsAnimals() {
        return animalRepository.list();
    }
}
