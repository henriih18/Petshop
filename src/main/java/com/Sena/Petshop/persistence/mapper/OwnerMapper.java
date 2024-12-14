package com.Sena.Petshop.persistence.mapper;

import com.Sena.Petshop.domain.Owner;
import com.Sena.Petshop.persistence.entity.Propietario;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OwnerMapper {

    @Mappings({
            @Mapping(source = "idPropietario", target = "idOwner"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "correo", target = "email"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "telefono", target = "phone")

    })

    Owner toOwner(Propietario propietario);
    List<Owner> toOwners(List<Propietario> propietarios);

    @InheritInverseConfiguration
    /*@Mapping(target = "mascotas", ignore = true)*/
    Propietario toPropietario(Owner owner);
}
