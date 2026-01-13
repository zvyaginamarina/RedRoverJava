package Lesson6;

public class MethodOverLoading {
void show(int i1){
    System.out.println(i1);
}

void show(int a, int b){
    System.out.println(a+b);
}

void show(boolean b1){
    System.out.println(b1);
}

void show(String s1){
    System.out.println(s1);
}
void show(String s, int a){
    System.out.println(s+a);
}
}



class MethodOverLoadingTest {
public static void main(String[] args) {
    MethodOverLoading mO = new MethodOverLoading();
    int a =500;
    mO.show(a);
    boolean b = true;
    mO.show(b);
    String s = "Hello!";
    mO.show(s);
    mO.show(1, 2);
    mO.show("Hello ", 10);
}
    
}
