package Lesson8;

public class Calculation {

    static double multiple(double a, double b, double c){
        return a*b*c;
    }

    static void division(int a1, int b1){
        System.out.println(a1/b1 + "  " + a1%b1);
    }
}

class CalculationTest{
    public static void main(String[] args) {
        // Calculation calc = new Calculation();
        // calc.multiple(2,3,4);
        Calculation.multiple(2,3,4);
        System.out.println(Calculation.multiple(2,3,4));

        // calc.division(13, 3);
        Calculation.division(13,3);
    }
    
    
}
