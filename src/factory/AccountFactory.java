package factory;

import account.Account;
import account.CurrentAccount;
import account.SavingAccount;
import util.AccountType;

public class AccountFactory implements Factory{

	public Account getAccount(AccountType type)
	{
		Account account=null;
		switch (type) {
		case CURRENT:
			account=new CurrentAccount();
			break;
		case SAVING:
			account=new SavingAccount();

		default:
			account=new SavingAccount();
			break;
		}
		
		return account;
	}

	

}
