package com.example.myapp.service;


import com.example.myapp.model.Pet;
import com.example.myapp.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class PetService {


    private final PetRepository petRepository;


    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }


    public Pet getPetById(int id) {
        return petRepository.findById(id).orElse(null);
    }


    public Pet createPet(Pet pet) {
        return petRepository.save(pet);
    }


    public Pet updatePet(Pet pet) {
        return petRepository.save(pet);
    }


    public void deletePet(int id) {
        //petRepository.deleteById((long) id);
        petRepository.deleteById(id);
    }
}
