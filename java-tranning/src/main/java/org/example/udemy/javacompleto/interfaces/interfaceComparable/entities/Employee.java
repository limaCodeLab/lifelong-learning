package org.example.udemy.javacompleto.interfaces.interfaceComparable.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// quando implementamos a interface Comparable, estamos comparandp um objeto com outro objeto da mesma classe/tipo
public class Employee implements Comparable<Employee> {

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}