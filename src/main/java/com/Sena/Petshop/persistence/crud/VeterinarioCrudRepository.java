package com.Sena.Petshop.persistence.crud;

import com.Sena.Petshop.persistence.entity.Veterinario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VeterinarioCrudRepository extends CrudRepository<Veterinario, Integer> {
    List<Veterinario> findByIdVeterinario(int idveterinario);
}
