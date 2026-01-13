package Lesson4;

public class Employee {
Employee(int id, String surname, int age, double salary){
    this.id = id;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
};

int id;
String surname;
int age;
double salary;

double newSalary(){
    salary *= 2;
    return salary;
};
};

class EmployeeTest {
    public static void main(String[] args) {
    Employee emp1 = new Employee(1, "Petrov", 38, 10500.5);
    Employee emp2 = new Employee(2, "Danilov", 22, 8395.01);

        emp1.newSalary();
        emp2.newSalary();

        System.out.println(emp1.salary);
        System.out.println(emp2.salary);

    }
    

    
}


