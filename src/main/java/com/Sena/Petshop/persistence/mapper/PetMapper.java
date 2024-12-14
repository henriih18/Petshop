package com.Sena.Petshop.persistence.mapper;


import com.Sena.Petshop.domain.Pet;
import com.Sena.Petshop.persistence.entity.Mascota;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")


public interface PetMapper {

    @Mappings({
            @Mapping(source = "idMascota", target = "idPet"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "especie", target = "species"),
            @Mapping(source = "edad", target = "age"),
            @Mapping(source = "genero", target = "gender"),
            @Mapping(source = "raza", target = "race"),
            @Mapping(source = "fechaRegistro", target = "date"),
    })
    Pet toPet(Mascota mascota);
    List<Pet> toPets(List<Mascota> mascotas);

    @InheritInverseConfiguration
    /*@Mapping(target = "propietario", ignore = true)
    @Mapping(target = "veterinario", ignore = true)
    @Mapping(target = "consultas", ignore = true)*/
    Mascota mascota(Pet pet);
}
