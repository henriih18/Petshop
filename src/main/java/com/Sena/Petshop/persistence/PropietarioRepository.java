package com.Sena.Petshop.persistence;

import com.Sena.Petshop.persistence.crud.PropietarioCrudRepository;
import com.Sena.Petshop.persistence.entity.Propietario;

import java.util.List;

public class PropietarioRepository {
    private PropietarioCrudRepository propietarioCrudRepository;


    public List<Propietario> getByIdPropietario(int idPropietario) {
        return propietarioCrudRepository.findByIdPropietario(idPropietario);
    }

    public Propietario save(Propietario propietario) {
        return propietarioCrudRepository.save(propietario);
    }

    public void delete(int idPropietario) {
        propietarioCrudRepository.deleteById(idPropietario);
    }

}
