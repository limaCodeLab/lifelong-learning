package com.learning.java.model.entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
public class Seller implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;
    private Department department;

    public Seller(){

    }

    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }
}
