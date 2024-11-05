package com.example.myapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "owners")
public class Owner {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private int id;


    @Column(name = "name")
    private String name;


    @Column(name = "email")
    private String email;


    @Column(name = "phone")
    private String phone;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }


    // Добавлены сеттеры
    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }
}
