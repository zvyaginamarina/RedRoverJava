package lesson14;

public class Test2 {
    public static void main(String[] args) {
        // for (int i =1; i<=10; i++){
        //     if (i == 7){break;};
        //     System.out.println(i);
        // }

        // for (int i =1; i<=5; i++){
        //     if (i == 3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        for (int i =1; i<=10; i++){
            if (i == 3){
                continue;
            }
            if (i%7 == 0){
                break;
            }
            System.out.println(i);
        }
    }

}
