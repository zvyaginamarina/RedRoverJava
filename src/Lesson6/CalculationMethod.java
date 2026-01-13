package Lesson6;

public class CalculationMethod {

    int sum(int a1, int a2, int a3, int a4){
        return a1 + a2 + a3 + a4;
    }

    int sum(int b1, int b2, int b3){
        return b1+b2+b3;
    } 

    int sum(int c1, int c2){
        return c1 + c2;
    }

    int sum(int d1){
        return d1;
    }

    int sum(){
        return 0;
    }
}

class CalculationMethodTest{
    public static void main(String[] args) {
        CalculationMethod cm = new CalculationMethod();
        System.out.println(cm.sum());
        System.out.println(cm.sum(2));
        System.out.println(cm.sum(2, 3));
        System.out.println(cm.sum(2, 4, 5));
        System.out.println(cm.sum(2, 5, 6, 7));
    }
}
