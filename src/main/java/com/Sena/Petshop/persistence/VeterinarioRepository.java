package com.Sena.Petshop.persistence;

import com.Sena.Petshop.persistence.crud.VeterinarioCrudRepository;
import com.Sena.Petshop.persistence.entity.Veterinario;

import java.util.List;

public class VeterinarioRepository {
    private VeterinarioCrudRepository veterinarioCrudRepository;

    public List<Veterinario> getByIdVeterinario(int idVeterinario) {
        return veterinarioCrudRepository.findByIdVeterinario(idVeterinario);
    }

    public Veterinario save(Veterinario veterinario) {
        return veterinarioCrudRepository.save(veterinario);
    }

    public void delete(int idVeterinario) {
        veterinarioCrudRepository.deleteById(idVeterinario);
    }
}

