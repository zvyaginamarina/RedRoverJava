package lesson16;

public class Test2 {

    public static void main(String[] args) {
        String s1 = "One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. He lay on his armour-like back, and if he lifted his head a little he could see his brown belly, slightly domed and divided by arches into stiff sections!";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;

        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != ',' && c1 != '.' && c1 != ':' && c1 != '!' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}
