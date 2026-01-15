package Lesson8;

public class Car {
String color = "blue";
String engine = "v6";
}

class Human{
    String name = "Ivan";
    final Car c = new Car();
    public static void main(String[] args) {
        Human h = new Human();
        // h.c = new Car();
        h.c.color = "red";

    }
}
