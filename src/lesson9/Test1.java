package lesson9;

public class Test1 {
    int a = 1;
    static int a = 2; //две переменные с одним именем не могут существовать
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }

}
