import java.util.ArrayList;

public class DepositAccountFactory implements AccountFactory {

    private double interestRate;

    public DepositAccountFactory(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public CustomerAccount createAccount(String number, double balance, ArrayList<AccountTransaction> transactions) {
        return new CustomerDepositAccount(interestRate, number, balance, transactions);
    }
}