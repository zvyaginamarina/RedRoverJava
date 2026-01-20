package lesson16;

public class UserEmail {

    char c1;
    int i1;

    public void email(String s) {
        for (int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);

            if (c1 == '@') {
                String s2 = s.substring(i + 1);
                System.out.println(s2);
            }
            // System.out.print(c1);
        }

    }

    public static void main(String[] args) {
        UserEmail ue = new UserEmail();
        ue.email("ya@yahoo.com; on@mail.ru; ona@gmail.ru");
    }

}
