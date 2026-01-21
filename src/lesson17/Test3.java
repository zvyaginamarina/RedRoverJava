package lesson17;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        String s1 = new String(sb1);
        System.out.println(s1);

        StringBuffer sb2 = new StringBuffer("456");
        String s2 = new String(sb2);

        System.out.println(s2);
    }

}
