package org.example.udemy.javacompleto.arraysListasMemory.listas.exercicioLista.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Emplyoee {

    private Integer id;
    private String name;
    private Double salary;

    public Emplyoee() {}

    public Emplyoee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }


    public String toString() {
        return id
                + ", "
                + name
                + ", "
                + String.format("%.2f", salary);
    }
}
