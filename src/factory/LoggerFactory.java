package factory;

import logger.DbLogger;
import logger.FileLogger;
import logger.Logger;
import util.LoggerType;

public class LoggerFactory implements Factory{
	public Logger getLogger(LoggerType type)
	{
		Logger logger=null;
		switch (type) {
		case FILE:
			logger=new FileLogger();
			break;
		case DB:
			logger=new DbLogger();
		default:
			logger=new DbLogger();
			break;
		}
		return logger;
	}
}
