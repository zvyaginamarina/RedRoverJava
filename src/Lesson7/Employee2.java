package Lesson7;

public class Employee2 {
    public String surname;
    int id;
    private double salary;

    public void showParams(String a){
        surname = a;
        System.out.println(surname);
    }

    public void showParams(int b){
        id = b;
        System.out.println(id);
    }

    public void showSalary(){
        System.out.println(salary);
    }

    public Employee2(int id2, String surname2) {
        id = id2;
        surname = surname2;
    }

    Employee2(String surname2) {
        this(0, surname2);
    }

    private Employee2(int id2, String surname2, double salary2){
        id = id2;
        surname = surname2;
        salary = salary2;
    }
}

class Employee2Test{
    public static void main(String[] args) {
    Employee2 emp1 = new Employee2(1, "Ivanov");
    Employee2 emp2 = new Employee2("Petrov");
    // Employee2 emp3 = new Employee2(2, "Sidorov", 500.00);

    emp1.showParams(emp1.surname);
    System.out.println(emp1.id);
    emp2.showParams(emp2.id);
    System.out.println(emp2.surname);
    emp1.showSalary();
    }
    
}
