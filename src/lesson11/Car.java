package lesson11;

public class Car {
    String color;
    String engine;
    static int doors;

Car(String color, String engine, int doors){
    this.color = color;
    this.engine = engine;
    this.doors=doors;
}
}

class CarTest{

    public static void changeDoodrs(Car c, int d){
        c.doors = d;
    }

    public static void changeColor(Car c1, Car c2){
        String cc = c2.color;
        c2.color = c1.color;
        c1.color = cc;
    }



    public static void main(String[] args) {
        Car car1 = new Car("black", "v6", 4);
        Car car2 = new Car("white", "v8", 6);

        changeDoodrs(car1, 6);
        System.out.println(car1.doors);

        changeColor(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);

    }
}
