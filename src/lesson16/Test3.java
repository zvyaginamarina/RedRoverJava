package lesson16;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.isBlank());
        String s2 = "     ";
        System.out.println(s2.isBlank());
        String s3 = " ";
        System.out.println(s3.isEmpty());
        String s4 = "";
        System.out.println(s4.isEmpty());
        // String s5 = null;
        // System.out.println(s5.isEmpty());
        String s6 = "    Hello      ";
        System.out.println(s6.strip() + s1);
        System.out.println(s6.stripLeading() + s1);
        System.out.println(s6.stripTrailing() + s1);
    }

}
