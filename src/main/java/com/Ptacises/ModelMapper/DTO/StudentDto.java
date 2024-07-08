package com.Ptacises.ModelMapper.DTO;

public class StudentDto {

    int id;
    String name;
    int std;

    public int getId() {
        return id;
    }

    //getter setter
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
