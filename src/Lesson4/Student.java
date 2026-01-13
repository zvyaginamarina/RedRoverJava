package Lesson4;

public class Student {

    public Student(int cardNumber2, String name2, String surname2, int educationYear2, double mathMidGrade2, double econMidGrade2, double forengLangMidGrade2) {
        cardNumber = cardNumber2;
        name = name2;
        surname = surname2;
        educationYear = educationYear2;
        mathMidGrade = mathMidGrade2;
        econMidGrade = econMidGrade2;
        forengLangMidGrade = forengLangMidGrade2;
    } 

    public Student(int cardNumber2, String name2, String surname2, int educationYear2) {
        this(cardNumber2, name2, surname2, educationYear2, 0.0, 0.0, 0.0);
    }

    public Student() { }

int cardNumber;
String name;
String surname;
int educationYear;
double mathMidGrade;
double econMidGrade;
double forengLangMidGrade;

double studentAvgGrade (){
    double studentMidGrade = (mathMidGrade + econMidGrade + forengLangMidGrade)/3;
    return studentMidGrade;
}
    void showAvgGrade(){
        System.out.println(studentAvgGrade());
    }

}

class StudentTest {
    
   public static void main(String[] args) {

    Student student1 = new Student(1234, "Mike", "Brandon", 2024, 4.1, 4.9, 4.8);

    Student student2 = new Student(5678, "Andy", "Walles", 2024);
    student2.mathMidGrade = 3.6;
    student2.econMidGrade = 3.9;
    student2.forengLangMidGrade = 3.0;

    Student student3 = new Student();
    student3.cardNumber = 9012;
    student3.name = "Hanna";
    student3.surname = "Cotton";
    student3.educationYear = 2024;
    student3.mathMidGrade = 5.0;
    student3.econMidGrade = 4.9;
    student3.forengLangMidGrade = 5.0; 

        
//    Student student1 = new Student();
//    Student student2 = new Student();
//    Student student3 = new Student();

//    student1.cardNumber = 1234;
//    student1.name = "Mike";
//    student1.surname = "Brandon";
//    student1.educationYear = 2024;
//    student1.mathMidGrade = 4.1;
//    student1.econMidGrade = 4.9;
//    student1.forengLangMidGrade = 4.8;

    double student1MidGrade = (student1.mathMidGrade + student1.econMidGrade + student1.forengLangMidGrade)/3;

    // student2.cardNumber = 5678;
    // student2.name = "Andy";
    // student2.surname = "Walles";
    // student2.educationYear = 2024;
    // student2.mathMidGrade = 3.6;
    // student2.econMidGrade = 3.9;
    // student2.forengLangMidGrade = 3.0;

    double student2MidGrade = (student2.mathMidGrade + student2.econMidGrade + student2.forengLangMidGrade)/3;

    // student3.cardNumber = 9012;
    // student3.name = "Hanna";
    // student3.surname = "Cotton";
    // student3.educationYear = 2024;
    // student3.mathMidGrade = 5.0;
    // student3.econMidGrade = 4.9;
    // student3.forengLangMidGrade = 5.0;

    // student1.showAvgGrade();
    // student2.showAvgGrade();
    // student3.showAvgGrade();
    double student3MidGrade = (student3.mathMidGrade + student3.econMidGrade + student3.forengLangMidGrade)/3;

    System.out.println("Средняя оценка " + student1.name + " " + student1.surname + ", обучающегося в " + student1.educationYear + ", равна " + student1MidGrade);
    System.out.println("Средняя оценка " + student2.name + " " + student2.surname + ", обучающегося в " + student2.educationYear + ", равна " + student2MidGrade);
    System.out.println("Средняя оценка " + student3.name + " " + student3.surname + ", обучающегося в " + student3.educationYear + ", равна " + student3MidGrade);
}
}