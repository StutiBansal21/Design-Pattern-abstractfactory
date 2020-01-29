package app;
import account.Account;
import factory.AbstractFactory;
import factory.AccountFactory;
import factory.Factory;
import util.AccountType;
import util.FactoryType;
public class Application {
	
	public static void main(String[] args) {
		
		/*
		 * AbstractFactory absFactory = new AbstractFactory();
		 *  Factory factory = absFactory.getFactory(FactoryType.ACCOUNT); 
		 * Account caccount = factory.getAccount(AccountType.CURRENT); 
		 * caccount.account();
		 */
		
		AccountFactory accFactory = new AccountFactory();
		Account saccount = accFactory.getAccount(AccountType.SAVING);
		saccount.account();
	}

}
