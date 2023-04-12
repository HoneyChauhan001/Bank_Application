import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("let's create a bank App");
        Scanner ac = new Scanner(System.in);


        Bank sbiBankAccount = new SBIBankAccount(1000,"Honey","Honey@1234");
        sbiBankAccount.addMoney(100);
        sbiBankAccount.withdrawMoney(50);
        int balance = sbiBankAccount.checkBalance();
    }
}