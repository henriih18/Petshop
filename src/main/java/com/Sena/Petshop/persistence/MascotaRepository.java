package com.Sena.Petshop.persistence;

import com.Sena.Petshop.domain.Pet;
import com.Sena.Petshop.domain.repository.PetRepository;
import com.Sena.Petshop.persistence.crud.MascotaCrudRepository;
import com.Sena.Petshop.persistence.entity.Mascota;
import com.Sena.Petshop.persistence.mapper.PetMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class MascotaRepository  implements PetRepository {
    private MascotaCrudRepository mascotaCrudRepository;

    private PetMapper mapper;


    @Override
    public List<Pet> getAll() {
        List<Mascota> mascotas = mascotaCrudRepository.findAll();
        return mapper.toPets(mascotas);
    }

    @Override
    public Optional<List<Pet>> getByPropietario(int idPropietario){
        List<Mascota> mascotas = mascotaCrudRepository.findByIdPropietario(idPropietario);
    return Optional.of(mapper.toPets(mascotas));
    }

    @Override
    public Optional<List<Pet>> getByVeterinario(int idVeterinario){
        List<Mascota> mascotas = mascotaCrudRepository.findByIdVeterinario(idVeterinario);
        return Optional.of(mapper.toPets(mascotas));
    }


    /*public Mascota save(Mascota mascota) {
        return mascotaCrudRepository.save(mascota);
    }

    public void delete(int idMascota) {
        mascotaCrudRepository.deleteById(idMascota);
    }*/


    @Override
    public <S extends Pet> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Pet> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Pet> findAll() {
        return List.of();
    }

    @Override
    public Iterable<Pet> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {


    }

    @Override
    public Optional<Pet> getByOwner(int idOwner) {
        return Optional.empty();
    }

    @Override
    public Optional<Pet> getVeterinarian(int idVeterinarian) {
        return Optional.empty();
    }

    @Override
    public Optional<Pet> getByIdPet(int idPet) {
        return Optional.empty();
    }

    @Override
    public Pet save(Pet pet) {
        return null;
    }

    @Override
    public void delete(Pet pet) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Pet> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
