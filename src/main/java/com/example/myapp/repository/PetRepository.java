package com.example.myapp.repository;


import com.example.myapp.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
// Здесь можно добавить дополнительные методы для запросов к базе данных, если необходимо
}
