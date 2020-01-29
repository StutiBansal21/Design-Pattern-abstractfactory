package factory;

import connection.Connection;
import connection.Mysql;
import connection.Oracle;
import util.ConnectionType;

public class ConnectionFactory implements Factory {
	public Connection getConnection(ConnectionType type)
	{
		Connection connection=null;
		switch (type) {
		case MYSQL:
			connection=new Mysql();
			break;
		case ORACLE:
			connection =new Oracle();
		default:
			connection=new Oracle();
			break;
		}
		return connection;
	}
}
