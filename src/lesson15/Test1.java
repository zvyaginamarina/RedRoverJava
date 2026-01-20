package lesson15;

public class Test1 {
    public static void main(String[] args) {
        // int money = 100;

        // while (money>0){
        //     System.out.println("Place bet");
        //     System.out.println("You're loose");
        //     money = money - 10;
        // }
        // System.out.println("You're run out off money");

        boolean b =true;
        int a=1;

        while (b){
            System.out.println(a);
            if (a%3 == 0 && a%5 == 0 && a%15 == 0){
                b = false;
            }
            a++;
        }
    }

}
