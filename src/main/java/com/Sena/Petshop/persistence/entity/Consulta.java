package com.Sena.Petshop.persistence.entity;

import com.Sena.Petshop.persistence.entity.Mascota;
import com.Sena.Petshop.persistence.entity.Veterinario;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idConsulta;

    @Column(name = "fecha")
    private LocalDateTime fechaConsulta;

    private String descripcion;

    @Column(name = "idMascota")
    private Integer idMascota;

    @Column(name = "idVeterinario")
    private Integer idVeterinario;

    @ManyToOne
    @JoinColumn(name = "idMascota", insertable = false, updatable = false)
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "idVeterinario", insertable = false, updatable = false)
    private Veterinario veterinario;

    // Getters y setters

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public Integer getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Integer idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDateTime fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }
}
