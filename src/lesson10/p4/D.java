package lesson10.p4;

import lesson10.p1.*;
import lesson10.p1.p2.*;
import lesson10.p1.p2.p3.*;
import static lesson10.p1.p2.B.*;
import lesson10.p4.p5.*;

public class D {
    public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    E e = new E();

    System.out.println(a.b + " " + a.a);
    System.out.println(B.b1 + " " + b.a1);
    System.out.println(c.b2 + " " + c.a2);
    System.out.println(e.b3 + " " + e.a3);

    }
    

}
