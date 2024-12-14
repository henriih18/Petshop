package com.Sena.Petshop.web.controller;


import com.Sena.Petshop.domain.Pet;
import com.Sena.Petshop.domain.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping("/all")
    public List<Pet> getAll() {
        return petService.getAll();
    }

    @GetMapping("/{idPet}")
    public Optional<Pet> getById(@PathVariable int idPet) {
        return petService.getByIdPet(idPet);
    }

    @GetMapping("/veterinario/{idVeterinario}")
    public Optional<List<Pet>> getByVeterinario (@PathVariable int idVeterinario){
        return petService.getByVeterinario(idVeterinario);
    }

    @GetMapping("/propietario/{idPropietario}")
    public Optional<List<Pet>> getByPropietario (@PathVariable int idPropietario){
        return petService.getByPropietario(idPropietario);
    }

    @PostMapping
    public Pet save(@RequestBody Pet pet) {
        return petService.save(pet);
    }

    @DeleteMapping("/{idPet}")
    public boolean delete(@PathVariable int idPet) {
        return petService.delete(idPet);
    }



}
