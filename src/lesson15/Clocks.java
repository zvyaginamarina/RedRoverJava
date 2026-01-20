package lesson15;

public class Clocks {

    public static void showTime(){
        // 
        
        int hour = 0;
        OUTTER:
        while (hour<=6){
            int minute = 0; 
            do {
                int second = 0;
                while (second <60){
                    System.out.println(hour+":"+minute+":"+second);

                    if (second*hour > minute){
                        
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

