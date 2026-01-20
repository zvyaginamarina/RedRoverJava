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

                if()
                INNER:
                while (second <60){
                    System.out.println(hour+":"+minute+":"+second);

                    if (second*hour > minute){
                        continue MIDDLE;
                    }
                    second++;
                }

                
            } while (true);

        }
    }
        

    public static void main(String[] args) {
        showTime();
    }
}

