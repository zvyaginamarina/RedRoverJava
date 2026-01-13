package Lesson5;

public class Human {
String name;
Car3 car;
BankAccount ba;

void info(){
    System.out.println("Name " + name + " car color " + car.color + " balance " + ba.balance);
}
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "John";
        h.car = new Car3("red", "v8");
        h.ba = new BankAccount(125, 2459.9);
        h.info();
    }
}



class Car3 {
Car3(String c, String e){
    color=c;
engine=e;
}
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, double balance2){
    id=id2;
    balance=balance2;
    }
    int id;
    double balance;
}
