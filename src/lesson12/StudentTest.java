package lesson12;

import lesson11.Student;

public class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan",4,9.99);
        Student st2 = new Student("Ivani",4,9.99);
        compareStudents(st1, st2);
        compareStudentsByParams(st1, st2);

    }

    public static void compareStudents(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Students are similar");
        } else {
            System.out.println("Students are different");
        }
    }

    public static void compareStudentsByParams(Student st1, Student st2){
        if (st1.name.equals(st2.name)){
            if (st1.course == st2.course){
                if (st1.grade == st2.grade){
                    System.out.println("Students are similar");
                } else {
            System.out.println("Students are different");
            }} else {
            System.out.println("Students are different");
        }} else {
            System.out.println("Students are different");
        }
    }

}
