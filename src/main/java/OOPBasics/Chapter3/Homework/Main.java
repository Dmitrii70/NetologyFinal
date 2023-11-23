package OOPBasics.Chapter3.Homework;

public class Main {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(1000);
        CreditAccount creditAccount = new CreditAccount(500);

        System.out.println(creditAccount.transfer(simpleAccount, 500));
        System.out.println(simpleAccount.transfer(creditAccount, 300));

        System.out.println("Сумма на простом счете составляет: " + simpleAccount.getBalance());
        System.out.println("Сумма на кредитном счете составляет: " + creditAccount.getBalance());
    }
}
