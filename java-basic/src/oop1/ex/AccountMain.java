package oop1.ex;

public class AccountMain {
    public static void main() {
        Accont account = new Accont();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(20000);
        System.out.println("잔고 : " + account.balance);
    }
}
