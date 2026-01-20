package lesson15;

public class Clocks {

    public static void showTime(){
        // 
        
        int hour = 0;
        OUTTER:
        while (hour<=6){
            int minute = 0; 
            MIDDLE:
            do {
                int second = 0;

                if(hour>1 && minute % 10 == 0 && minute != 0){
                    break OUTTER;
                }

                INNER:
                while (second <60){
                    System.out.println(hour+":"+minute+":"+second);

                    if (second*hour > minute){
                        continue MIDDLE;
                    }
                    second++;
                }
                minute++;
                
            } while (minute<=59);

            hour++;

        }
    }
        

    public static void main(String[] args) {
        showTime();
    }
}

