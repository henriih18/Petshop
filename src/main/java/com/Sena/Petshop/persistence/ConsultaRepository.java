package com.Sena.Petshop.persistence;

import com.Sena.Petshop.persistence.crud.ConsultaCrudRepository;
import com.Sena.Petshop.persistence.entity.Consulta;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ConsultaRepository {
    private ConsultaCrudRepository consultaCrudRepository;


    public List<Consulta> getAll() {
        return (List<Consulta>) consultaCrudRepository.findAll();
    }

    public List<Consulta> getByIdMascota(int idMascota) {
        return consultaCrudRepository.findByIdMascota(idMascota);
    }

    public List<Consulta> getByIdVeterinario(int idVeterinario) {
        return consultaCrudRepository.findByIdVeterinario(idVeterinario);
    }

    public Optional<Consulta> getByConsulta(int idConsulta) {
        return consultaCrudRepository.findById(idConsulta);
    }

    public Consulta save(Consulta consulta) {
        return consultaCrudRepository.save(consulta);
    }

    public void delete(int idConsulta) {
        consultaCrudRepository.deleteById(idConsulta);
    }


}
