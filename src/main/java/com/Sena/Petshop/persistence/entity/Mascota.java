package com.Sena.Petshop.persistence.entity;


import com.Sena.Petshop.persistence.entity.Consulta;
import com.Sena.Petshop.persistence.entity.Propietario;
import com.Sena.Petshop.persistence.entity.Veterinario;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idMascota;

    private String nombre;
    private String especie;
    private int edad;
    private String genero;
    private String raza;
    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @Column(name = "idPropietario")
    private Integer idPropietario;

    @Column(name = "idVeterinario")
    private Integer idVeterinario;

    @ManyToOne
    @JoinColumn(name = "idPropietario", insertable = false, updatable = false)
    private Propietario propietario;


    @OneToMany(mappedBy = "mascota")
    private List<Consulta> consultas;

    @ManyToOne
    @JoinColumn(name = "idVeterinario", insertable = false, updatable = false)
    private Veterinario veterinario;

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Integer getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Integer idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}