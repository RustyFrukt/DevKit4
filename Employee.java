package ru.geekbrains.seminar_4;

public class Employee {
    int tabelNumber;
    String name;
    String phoneNumber;
    int experience;

    public Employee(int tabelNumber, String name, String phoneNumber, int experience) {
        this.tabelNumber = tabelNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    public int getTabelNumber() {
        return tabelNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "№ сотрудника: " + tabelNumber + "; Имя: " + name + "; Номер телефона: " + phoneNumber +
                "; Стаж (полных лет): " + experience + ".\n";
    }
}
