package com.Sena.Petshop.persistence.crud;

import com.Sena.Petshop.persistence.entity.Propietario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PropietarioCrudRepository  extends CrudRepository<Propietario, Integer> {
    List<Propietario> findByIdPropietario(int idPropietario);
}
