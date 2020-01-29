package factory;

import util.FactoryType;

public class AbstractFactory {
	public Factory getFactory(FactoryType type)
	{
		Factory factory=null;
		switch (type) {
		case ACCOUNT:
			factory=new AccountFactory();
			break;
		case LOGGER:
			factory=new LoggerFactory();
		default:
			factory=new LoggerFactory();
			break;
		}
		return factory;
	}
}
