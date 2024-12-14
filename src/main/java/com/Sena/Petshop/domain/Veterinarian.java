package com.Sena.Petshop.domain;

public class Veterinarian {
    private int idVeterinarian;
    private String name;
    private String lastName;
    private String speciality;

    private Consultation consultation;
    private Pet pet;


    public int getIdVeterinarian() {
        return idVeterinarian;
    }

    public void setIdVeterinarian(int idVeterinarian) {
        this.idVeterinarian = idVeterinarian;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
