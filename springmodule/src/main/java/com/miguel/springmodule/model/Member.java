package com.miguel.springmodule.model;

import javax.persistence.*;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String number;

    public Member() {
    }

    public Member(String email, String name, String number) {
        this.email = email;
        this.name = name;
        this.number = number;
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
        return "Member{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
