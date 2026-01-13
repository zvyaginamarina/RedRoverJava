package Lesson7;

public class Employee1 {
    protected double salary;

    protected void doubleSalary(){
        double result = salary*2;
        System.out.println("New salary = " + result);
    }

    protected Employee1(double salary2) {
        salary = salary2;
    }
public static void main(String[] args) {
    Employee1 emp = new Employee1(500);
    System.out.println(emp.salary);
    emp.doubleSalary();
}
}

class Employee1Test{
    public static void main(String[] args) {
        Employee1 emp = new Employee1(500);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}