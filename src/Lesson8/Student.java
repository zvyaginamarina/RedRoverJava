package Lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        name = name2;
        course = course2;
        count++;
        System.out.println("Student #" + count + " created");
    }

    public static void showCount(){
        System.out.println("Created " + count+ " students");
    }

    void abc(){
        count++;
        a++;
    }

    static void abcd(){
        count++;
        Student s4 = new Student("Zina", 2);
        s4.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student s5 = new Student("Ivan", 4);
        s5.abc();
    }
}

class StudentTest{
    public static void main(String[] args) {
    Student s1 = new Student("Ivan", 2);
    Student s2 = new Student("Petr", 4);
    Student s3 = new Student("Dima", 2);

    System.out.println(s1.name);
    System.out.println(Student.count);
    Student.showCount();
    }
    
}
