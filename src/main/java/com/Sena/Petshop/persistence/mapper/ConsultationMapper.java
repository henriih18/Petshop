package com.Sena.Petshop.persistence.mapper;

import com.Sena.Petshop.domain.Consultation;
import com.Sena.Petshop.persistence.entity.Consulta;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ConsultationMapper {

    @Mappings({
            @Mapping(source = "idConsulta", target = "idConsultation"),
            @Mapping(source = "fechaConsulta", target = "consultationDate"),
            @Mapping(source = "descripcion", target = "description"),

    })
    Consultation toConsultation(Consulta consulta);
    List<Consultation> toConsultations(List<Consulta> consultas);

    @InheritInverseConfiguration
    /*@Mapping(target = "mascota", ignore = true)
    @Mapping(target = "veterinario", ignore = true)*/
    Consulta consulta (Consultation consultation);
}
