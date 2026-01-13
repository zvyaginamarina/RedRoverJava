package Lesson5;

public class Test20 {

    int sum(int a, int b, int c){
        int result = a+b+c;
        return result;
    }


int average (int a1, int b1, int c1){
    int result2 = sum(a1, b1, c1)/3;
    return result2;
}
}

class Test21 {
public static void main(String[] args) {
    Test20 t = new Test20();
    int threNumSum = t.sum(1, 2, 3);
    System.out.println(threNumSum);
    System.out.println(t.sum(11,10,15));

    System.out.println(t.average(20,40,60));
}
}

