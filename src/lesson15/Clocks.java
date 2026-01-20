package lesson15;

public class Clocks {

    public static void showTime(){
        int hour = 0;
        OUTTER:
        while (hour <=6){
            int minute = 0;
            INNER1: 
            do { 
                if (minute%10 == 0 && hour >1 && minute != 0){
                    minute++;
                    break OUTTER;
                }                
            } while (minute<=59);

            int second = 0;
            INNER2:
                while (second<=59){
                    System.out.println(hour+":"+minute+":"+second);
                                           
                    if(second*hour>minute){
                    continue INNER1;
                }}
                second++;
            }
                hour++;
                    
                }
    }
    

    public static void main(String[] args) {
        showTime();
    }

}
