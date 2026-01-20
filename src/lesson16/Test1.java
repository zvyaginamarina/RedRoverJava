package lesson16;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("Helle!  ");

        int a = s1.length();
        System.out.println(a);

        char c = s1.charAt(0);
        System.out.println(c);

        int b = s1.indexOf('e');
        System.out.println(b);

        int b1 = s1.indexOf("ll");
        System.out.println(b1);

        int b2 = s1.indexOf('e', 2);
        System.out.println(b2);

        boolean c1 = s1.startsWith("abc");
        System.out.println(c1);

        boolean c2 = s1.endsWith("le!");
        System.out.println(c2);

        String s2 = s1.substring(3);
        System.out.println(s2);

        String s3 = s1.substring(1, 4);
        System.out.println(s3);

        String s4 = s1.trim();
        System.out.println(s4);

    }

}
