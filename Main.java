package ru.geekbrains.seminar_4;


public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(new Employee(1, "Сергеев Дмитрий",
                "+7-926-354-32-21", 5));
        directory.addEmployee(new Employee(2, "Жогов Сергей",
                "+7-926-354-32-22", 4));
        directory.addEmployee(new Employee(3, "Дорничев Станислав",
                "+7-926-354-32-23", 3));
        directory.addEmployee(new Employee(4, "Тог Петр",
                "+7-926-354-32-24", 2));


        System.out.println("\nПОИСК СОТРУДНИКА ПО НОМЕРУ:");
        System.out.println(directory.findByTabelNumber(2).toString().
                replace("[", "").replace("]", ""));


        System.out.println("\nВЫВОД НОМЕРА ТЕЛЕФОНА СОТРУДНИКА ПО ИМЕНИ:");
        System.out.println(directory.findPhoneNumber("Сергеев Дмитрий"));

        System.out.println("\nПОИСК СОТРУДНИКА СТАЖУ:");
        System.out.println(directory.findByExperience(2).toString().
                replace("[", "").replace("]", ""));

        System.out.println("\nДОБАВЛЕНИЕ СОТРУДНИКА:");
        System.out.print(directory.addEmployee(new Employee(5, "Егоров Егор",
                        "+7-926-354-32-25", 1)).toString().
                replace("[", "").replace(",", "").replace("]", ""));
    }
}
