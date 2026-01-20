package lesson13;

public class Month {
    static void daysInMonth(int monthNum){
        switch (monthNum){
            // case 1:
            // case 3:
            // case 5:
            // case 7:
            // case 8:
            // case 10:
            // case 12:
            //     System.out.println("31 days in the month");
            //     break;
            // case 4:
            // case 6:
            // case 9:
            // case 11:
            //     System.out.println("30 days in the month");
            //     break;
            // case 2:
            //     System.out.println("28 days in the month");
            //     break;
            // default:
            //     System.out.println("incorrect month");

            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days in the month");
            case 4, 6, 9, 11 -> System.out.println("30 days in the month");
            case 2 -> System.out.println("28 days in the month");
            default -> System.out.println("incorrect month");
        }
    }

    public static void main(String[] args) {
        daysInMonth(2);
        daysInMonth(4);
        daysInMonth(5);
        daysInMonth(13);
    }

}
