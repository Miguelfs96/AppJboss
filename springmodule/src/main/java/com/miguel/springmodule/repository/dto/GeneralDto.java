package com.miguel.springmodule.repository.dto;

public class GeneralDto {

    private String accion;

    private long id;

    private String email;

    private String name;

    private String number;

    public GeneralDto() {
    }

    public GeneralDto(String accion, long id, String email, String name, String number) {
        this.accion = accion;
        this.id = id;
        this.email = email;
        this.name = name;
        this.number = number;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "GeneralDto{" +
                "accion='" + accion + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
