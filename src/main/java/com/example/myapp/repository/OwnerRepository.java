package com.example.myapp.repository;


import com.example.myapp.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
// Здесь можно добавить дополнительные методы для запросов к базе данных, если необходимо
}
