package Lesson8;

public class CircleCalc {

    static final double PI = 3.14;

    double circleSquare(double r){
        double sq = r * r * PI;
        return sq;
    }

    static double circleLenth(double r){
        double l = 2 * PI * r;
        return l;
    }

    void showInfo(double r){
        System.out.println("Radius is " + r);
        System.out.println("Square is " + circleSquare(r));
        System.out.println("Length is " + circleLenth(r));
    }
}

class CircleCalcTest{
    public static void main(String[] args) {
        CircleCalc cc = new CircleCalc();
        System.out.println(cc.circleSquare(5));
        System.out.println(CircleCalc.circleLenth(5));
        cc.showInfo(5);
    }    
}
