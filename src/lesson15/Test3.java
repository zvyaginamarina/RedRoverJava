package lesson15;

public class Test3 {
    public static void main(String[] args) {
        
    int money = 0;

    do{
        System.out.println("Make your bet");
        System.out.println("You're loose");
        money-=10;
        System.out.println("You have " + money);
    }
    while (money>50);

}
}
