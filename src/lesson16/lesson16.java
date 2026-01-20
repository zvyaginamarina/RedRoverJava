package lesson16;

public class lesson16 {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2);

        String s3 = "Bye";
        String s4 = "Bye";

        System.out.println(s3 == s4);

        System.out.println(s1 == "Hello");
        System.out.println(s3 == "Bye");

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

    }

}
