package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    double topUp (double sum){
       balance += sum;
       return balance;
    }

    double widthdraw (double sum){
        balance -= sum;
        return balance;
    }

   }

class BankAccountTest {

    public static void main(String[] args) {
        
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Marina";
        MyAccount.balance=12.35;

        YourAccount.id=2;
        YourAccount.name="Vadim";
        YourAccount.balance=152.35;

        HisAccount.id=3;
        HisAccount.name="Dima";
        HisAccount.balance=1.35;

        System.out.println(HisAccount.name);

        MyAccount.topUp(100.15);
        HisAccount.widthdraw(52.35);
        MyAccount.widthdraw(15.01);
        System.out.println(MyAccount.balance);
        System.out.println(HisAccount.balance);
    }
 
}
