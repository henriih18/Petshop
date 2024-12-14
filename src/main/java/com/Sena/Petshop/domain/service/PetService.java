package com.Sena.Petshop.domain.service;

import com.Sena.Petshop.domain.Pet;
import com.Sena.Petshop.domain.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    public List<Pet> getAll(){
        return petRepository.getAll();
    }

    public Optional<Pet> getByIdPet(int idPet){
        return petRepository.getByIdPet(idPet);
    }

    public Optional<List<Pet>> getByVeterinario (int idVeterinario){
        return petRepository.getByVeterinario(idVeterinario);
    }

    public Optional<List<Pet>> getByPropietario (int idPropietario){
        return petRepository.getByPropietario(idPropietario);
    }

    public Pet save(Pet pet){
        return petRepository.save(pet);
    }

    public boolean delete(int idPet){
        return getByIdPet(idPet).map(pet -> {
            petRepository.delete(pet);
            return true;
        }).orElse(false);
    }


}
