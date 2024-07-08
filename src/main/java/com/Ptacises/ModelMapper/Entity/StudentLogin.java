package com.Ptacises.ModelMapper.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ModelMapperDemo")
public class StudentLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int std;

    public StudentLogin() {
    }

    public StudentLogin(int id, String name, int std) {
        this.id = id;
        this.name = name;
        this.std = std;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }
}
