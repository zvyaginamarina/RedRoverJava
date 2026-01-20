package lesson13;

public class Test2 {
    public static void main(String[] args) {
        switch ("monday1"){
            case "monday":
            case "tuesday":
            case "wendsday":
            case "thursday":
            case "friday":
                System.out.println("Working hours until 18:00");
                break;
            case "saturday":
                System.out.println("Working hours until 14:00");
                break;
            case "sunday":
                System.out.println("Not working");
                break;
            default:
                System.out.println("Incorrect day name");
        }
    }

}
