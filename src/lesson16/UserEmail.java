package lesson16;

public class UserEmail {
    int i1;

    public void email(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);

            if (c1 == '@') {
                i1 = i + 1;
                char c2 = s.charAt(i1);
            } else if (c1 == '.') {
                int i2 = i;
                String s2 = s.substring(i1, i2);
                System.out.println();
                System.out.print(s2);
            }
        }
    }

    public static void main(String[] args) {
        UserEmail ue = new UserEmail();
        ue.email("ya@yahoo.com; on@mail.ru; ona@gmail.ru");
    }
}
