import java.util.ArrayList;

public interface AccountFactory {
	public abstract CustomerAccount createAccount(String number, double balance, ArrayList<AccountTransaction> transactions);
}