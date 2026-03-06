import java.util.ArrayList;

public class CurrentAccountFactory implements AccountFactory{
    private ATMCard atm;

    public CurrentAccountFactory(ATMCard atm) {
        this.atm = atm;
    }

    @Override
    public CustomerAccount createAccount(String number, double balance, ArrayList<AccountTransaction> transactions) {
        return new CustomerCurrentAccount(atm, number, balance, transactions);
    }
}
