package ru.geekbrains.seminar_4;

import java.util.ArrayList;
import java.util.List;


public class EmployeeDirectory {
    List<Employee> directory = new ArrayList<>();

    public List<Employee> addEmployee(Employee employee) {
        directory.add(employee);
        return this.directory.stream().toList();
    }

    public List<Employee> findByTabelNumber(int tabelNumber) {
        return this.directory.stream().filter(employee -> employee.tabelNumber == tabelNumber).toList();
    }

    public List<Employee> findByExperience(int experience) {
        return this.directory.stream().filter(employee -> employee.getExperience() == experience).toList();
    }

    public List<String> findPhoneNumber(String name) {
        List<String> result = new ArrayList<>();
        this.directory.forEach(employee -> {
            if (employee.getName().equals(name)) {
                result.add(employee.getPhoneNumber());
            }
        });
        return result;
    }
}
