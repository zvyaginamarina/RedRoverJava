package Lesson4;

public class Car {

    Car(String color1, String engine1){
color = color1;
engine = engine1;
System.out.println("Created!");
System.out.println("Color "+ color + " engine "+ engine);
    }

    String color = "red";
    String model = new String("BMW");
    String engine = "v6";

}

class CarTest {
    public static void main(String[] args) {
        
    
    //Car Car1 = new Car();
    //Car Car2 = new Car();
    //Car Car3 = Car1;
    //Car2.color = "black";
    //Car3.model = "Suzuki";

    //System.out.print("Color: ");
    //System.out.println(Car3.color);
    //System.out.println(new Car().model);
    //System.out.println("Model: " + Car3.model);

    Car car1 = new Car("red", "v6");
    //System.out.println(car1.color);
    //System.out.println(car1.engine);
     Car car2 = new Car("black", "V8");
     //System.out.println(car2.color);
    //System.out.println(car2.engine);
    
}
}