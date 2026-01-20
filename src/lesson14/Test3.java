package lesson14;

public class Test3 {
    public static void time(){
        OUTER: for (int hour = 0; hour <24; hour++){
            System.out.println("Outer loop start");
            INNER: for (int minute = 0; minute <60; minute++){
                System.out.println(hour + ":" + minute);
                if(minute == 15){
                    break OUTER;
                }
            }
            System.out.println("Outer loop finish");
        }
        
    }

    public static void main(String[] args) {
        time();
    }

}
