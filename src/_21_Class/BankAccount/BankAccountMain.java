package _21_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
//        bankAccount.deposit(-4000);
        bankAccount.withdraw(1100);
//        bankAccount.withdraw(15000);
        bankAccount.withdraw(15000);
//        bankAccount.getBalance();//값이 없어서 안됨
        System.out.println(bankAccount.getBalance());


    }




}
