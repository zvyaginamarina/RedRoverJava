package lesson15;

public class Clocks {

    public static void showTime(){
        OUTTER: for (int hour = 0; hour <=6; hour++){
            INNER1: for (int minute = 0; minute<=59; minute++){
                if (minute%10 == 0 && hour >1 && minute != 0){
                    break OUTTER;
                }
                
                INNER2: for (int second = 0; second<=59; second++){
                    System.out.println(hour+":"+minute+":"+second);
                                           
                    if(second*hour>minute){
                    continue INNER1;
                }
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        showTime();
    }

}
