import java.text.DecimalFormat;

public class Account {
    private long userId;
    private DecimalFormat balance;

    public Account(long userId, DecimalFormat balance) {
        this.userId = userId;
        this.balance = balance;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public DecimalFormat getBalance() {
        return balance;
    }

    public void setBalance(DecimalFormat balance) {
        this.balance = balance;
    }
}
