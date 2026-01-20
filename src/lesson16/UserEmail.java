package lesson16;

public class UserEmail {

    char c1;
    int i1;

    public void email(String s) {
        for (int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);
            if (c1 == '@') {
                i1 = s.indexOf(i);
                System.out.println(i1);
                System.out.println(c1);
            }
        }

    }

    public static void main(String[] args) {
        UserEmail ue = new UserEmail();
        ue.email("ya@yahoo.com; on@mail.ru; ona@gmail.ru");
    }

}
