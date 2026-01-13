package Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id1, String surname1, int age1, double salary1, String department1){
        id1 = id;
        surname1 = surname;
        age1 = age;
        salary1 = salary;
        department1 = department;
    }
    
    double newSalary(double newSalary){
        newSalary = salary *2;
        return newSalary;
    }
}
