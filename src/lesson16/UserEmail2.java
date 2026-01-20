package lesson16;

public class UserEmail2 {

    public static void email(String s) {
        // char c1;

        // for (int i = 0; i < s.length(); i++) {
        // c1 = s.charAt(i);
        // int i1;

        // if (c1 == '@') {
        // i1 = i + 1;
        // }

        // if (c1 != '@' && c1 != '.' && c1 != ';') {

        // }

        // }

        int a = 0; // индекс символа @
        int b = 0; // индекс символа .
        int c = 0; // индекс символа ;

        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', a);
            c = s.indexOf(';', b);

            if (c == -1) { // Если это последний email в списке (после него нет ;)
                c = s.length();
            }

            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        String emails = "ya@yahoo.com; on@mail.ru; ona@gmail.ru";
        email(emails);
    }

}
