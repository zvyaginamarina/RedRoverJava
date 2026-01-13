package Lesson5;

public class Car2 {
String color;
String engine;
int speed;

int speedUp(int newSpeed) {
    speed += newSpeed;
    return speed;
}

int speedDown(int newSpeed){
    speed -= newSpeed;
    return speed;
}

void showInfo(){
    System.out.println("Color: " + color + "; " + "Engine: " + engine + "; " + "Speed: " + speed);
}
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "White";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();
        c1.speedUp(20);
        c1.showInfo();
        c1.speedDown(80);
        c1.showInfo();
    }

    
}
