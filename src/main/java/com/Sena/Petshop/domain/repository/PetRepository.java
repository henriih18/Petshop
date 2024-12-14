package com.Sena.Petshop.domain.repository;

import com.Sena.Petshop.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PetRepository extends CrudRepository<Pet, Integer> {
    List<Pet> getAll();

    Optional<List<Pet>> getByVeterinario(int idVeterinario);

    Optional<List<Pet>> getByPropietario(int idPropietario);

    List<Pet> findAll();

    Optional<Pet> getByOwner(int idowner);

    Optional<Pet> getVeterinarian(int idVeterinarian);

    Optional<Pet> getByIdPet(int idPet);

    Pet save(Pet pet);

    void delete(Pet pet);

}
