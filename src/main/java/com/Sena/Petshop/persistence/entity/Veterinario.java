package com.Sena.Petshop.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "veterinario")
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int idVeterinario;

    private String nombre;
    private String apellido;
    private String especialidad;

    @OneToMany(mappedBy = "veterinario")
    private List<Consulta> consultas;

    @OneToMany(mappedBy = "veterinario")
    private List<Mascota> mascotas;

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
