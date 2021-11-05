package com.example.backend;

import com.example.core.dto.AnimalDTO;
import com.example.core.entity.Animal;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SQLAnimalEntity extends PanacheEntity implements Animal {
    public String name;
    public double averageWeight;
    public int numberOfLegs;

    public static Animal fromDTO(AnimalDTO animalDTO){
        return new SQLAnimalEntity(animalDTO.getName(), animalDTO.getAverageWeight(), animalDTO.getNumberOfLegs());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getAverageWeight() {
        return this.averageWeight;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
}
