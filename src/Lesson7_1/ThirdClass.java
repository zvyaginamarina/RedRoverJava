package Lesson7_1;

// import Lesson7.Employee1;

public class ThirdClass extends Lesson7.Employee1 {
    // public static void main(String[] args) {
    // Lesson7.Employee1 emp = new Lesson7.Employee1(500);
    // System.out.println(emp.salary);
    // emp.doubleSalary();
    // }

    public ThirdClass(double salary) {
        super(salary);
    }

    public static void main(String[] args) {
        ThirdClass tc = new ThirdClass(500);

        System.out.println(tc.salary); 
        tc.doubleSalary();
    }
}

