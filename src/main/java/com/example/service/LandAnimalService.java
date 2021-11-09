package com.example.service;

import com.example.backend.SQLAnimalRepository;
import com.example.core.dto.AnimalDTO;
import com.example.core.entity.Animal;
import com.example.core.service.AnimalService;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class LandAnimalService implements AnimalService {
    SQLAnimalRepository animalRepository;

    @Override
    public Animal create(AnimalDTO animalDTO) {
        return animalRepository.create(animalDTO);
    }

    @Override
    public List<? extends Animal> getTwoLegsAnimals() {
        return animalRepository.list();
    }

    @Override
    public Animal findById(Long id) {
        return animalRepository.findById(id);
    }


}
