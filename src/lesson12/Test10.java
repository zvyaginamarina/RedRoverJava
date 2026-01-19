package lesson12;

public class Test10 {

    String s;

    void maxNumber (int i1, int i2, int i3){
        if (i1>i2 && i1>13){
            System.out.println("Max is " + i1);
        } else if (i2>i1 && i2>i3){
            System.out.println("Max is " + i2);
        } else {
            System.out.println("Max is " + i3);
        }
    }

    void abc(){
        String str;
        int a = 11;
        if (a>=10){
            str = "Hi";
        }
        else if (a<10){
            str = "Bye!";
        } else {
            str = null;
        }
        System.out.println(str);

    }
}

class Test10Test{
    public static void main(String[] args) {
        Test10 t = new Test10();
        Test10 t2 = new Test10();
        t.maxNumber(4, 10, 0);

        t.s = "Yello!";
        t2.s = "Yello!";

        if (t.s.equals(t2.s)){
            System.out.println("S is equals");
        }

        t.abc();

        int a = 10;
        int b = 20;
        int maxim = (a>b)?a:b;
        System.out.println(maxim);
    }
    
}
