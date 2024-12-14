package com.Sena.Petshop.persistence.crud;

import com.Sena.Petshop.persistence.entity.Consulta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConsultaCrudRepository extends CrudRepository<Consulta, Integer> {
    List<Consulta> findByIdMascota(Integer idMascota);
    List<Consulta> findByIdVeterinario(Integer idVeterinario);

}
