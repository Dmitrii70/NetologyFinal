package OOPBasics.Chapter3.Homework;

public class CreditAccount extends Account {
    private long creditLimit;
    public CreditAccount(long creditLimit) {
        super(0);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount <= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= -creditLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            }
            add(amount);
        }
        return false;
    }
}
