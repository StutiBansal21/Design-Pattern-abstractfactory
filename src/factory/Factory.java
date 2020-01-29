package factory;

import account.Account;
import connection.Connection;
import logger.Logger;
import util.AccountType;
import util.ConnectionType;
import util.LoggerType;

public interface Factory {
	default public Account getAccount(AccountType type) {
		return null;
	}
	default public Logger getLogger(LoggerType type) {
		return null;
	}
	default public Connection getConnection(ConnectionType type) {
		return null;
	}
}
