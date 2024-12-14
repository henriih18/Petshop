package com.Sena.Petshop.persistence.crud;

import com.Sena.Petshop.persistence.entity.Mascota;
import com.Sena.Petshop.persistence.entity.Propietario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface MascotaCrudRepository extends CrudRepository<Mascota, Integer> {
    List<Mascota> findByIdPropietario(Integer idPropietario);
    List<Mascota> findByIdVeterinario(Integer idVeterinario);
    List<Mascota> findAll();
}
