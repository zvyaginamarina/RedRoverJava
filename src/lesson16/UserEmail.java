package lesson16;

public class UserEmail {

    char c1;
    int i1;
    int i2;

    public void email(String s) {
        for (int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);

            if (c1 == '@') {
                i1 = i + 1;
            } else if (c == '.') {
                i2 = i;
            }
            String s2 = s.substring(i1, i2);
            System.out.print(s2);
        }

    }

    public static void main(String[] args) {
        UserEmail ue = new UserEmail();
        ue.email("ya@yahoo.com; on@mail.ru; ona@gmail.ru");
    }

}
