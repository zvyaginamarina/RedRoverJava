package Lesson6;

public class Employee {
     public Employee(int id2, String surname2, int age2){
       this(id2, surname2, age2, 0.0);      
     }

    public Employee(String surname3, int age3){
        this(0, surname3, age3, 0.0);
     }

     public Employee(int id4, String surname4, int age4, double salary4){
       id =id4;
       surname = surname4;
       age=age4;
       salary = salary4;
     }

int id;
String surname;
public int age;
double salary;
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rich", 23); 
        Employee emp2 = new Employee("Johnson", 18);
        Employee emp3 = new Employee(13, "Andersen", 35, 1008.57);
        System.out.println(emp1.surname);
        System.out.println(emp2.surname);
        System.out.println(emp3.surname);

    }
}