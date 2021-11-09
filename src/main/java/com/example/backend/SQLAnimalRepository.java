package com.example.backend;

import com.example.core.dto.AnimalDTO;
import com.example.core.entity.Animal;
import com.example.core.repository.AnimalRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SQLAnimalRepository implements AnimalRepository {
    @Inject
    AnimalPanacheRepository animalPanacheRepository;

    @Override
    public List<? extends Animal> list() {
        return animalPanacheRepository.listAll();
    }

    @Override
    public Animal findById(Long id) {
        return animalPanacheRepository.findById(id);
    }

    @Override
    @Transactional
    public Animal create(AnimalDTO animalDTO) {
        Animal animal = SQLAnimalEntity.fromDTO(animalDTO);
        animalPanacheRepository.persist((SQLAnimalEntity) animal);
        return animal;
    }
}
