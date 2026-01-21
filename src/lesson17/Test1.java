package lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.substring(1, 4));
        System.out.println(sb2.subSequence(1, 4));

        System.out.println(sb2.append("! How are you?"));
        System.out.println(sb2);
        System.out.println(sb1.append(new Car()));
        System.out.println(sb4.insert(5, "!!!"));

        StringBuilder sb5 = new StringBuilder(sb2);
        System.out.println(sb5.delete(2, 5));
        System.out.println(sb5.deleteCharAt(0));

    }
}

class Car {
}
