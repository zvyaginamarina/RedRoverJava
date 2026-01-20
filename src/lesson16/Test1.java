package lesson16;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("Hello!");

        int a = s1.length();
        System.out.println(a);

        char c = s1.charAt(0);
        System.out.println(c);

        int b = s1.indexOf('e');
        System.out.println(b);

        int b1 = s1.indexOf("ell");
        System.out.println(b1);

    }

}
