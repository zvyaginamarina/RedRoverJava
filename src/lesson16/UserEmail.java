package lesson16;

public class UserEmail {

    char c1;
    char c2;

    public void email(String s) {
        int i1 = s.indexOf('@');
        int i2 = s.indexOf('.');
        String s1 = s.substring(i1 + 1, i2);
        System.out.println(s1);

    }

    public static void main(String[] args) {
        UserEmail ue = new UserEmail();
        ue.email("ya@yahoo.com; on@mail.ru; ona@gmail.ru");
    }

}
