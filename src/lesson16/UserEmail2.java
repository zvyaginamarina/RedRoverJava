package lesson16;

public class UserEmail2 {

    String emails = "ya@yahoo.com; on@mail.ru; ona@gmail.ru";

    public void email(String s) {
        char c1;

        for (int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);
            int i1;

            if (c1 == '@') {
                i1 = i + 1;
            }

            if (c1 != '@' && c1 != '.' && c1 != ';') {

            }

        }

    }

}
