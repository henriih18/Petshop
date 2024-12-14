package com.Sena.Petshop.persistence.mapper;

import com.Sena.Petshop.domain.Veterinarian;
import com.Sena.Petshop.persistence.entity.Veterinario;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")

public interface VeterinarianMapper {

    @Mappings({
            @Mapping(source = "idVeterinario", target = "idVeterinarian"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "especialidad", target = "speciality")

    })
    Veterinarian toVeterinarian(Veterinario veterinario);
    List<Veterinarian> toVeterinarians(List<Veterinario> veterinario);

    @InheritInverseConfiguration
    /*@Mapping(target = "consultas", ignore = true)
    @Mapping(target = "mascotas", ignore = true)*/
    Veterinario veterinario(Veterinarian veterinarian);
}
