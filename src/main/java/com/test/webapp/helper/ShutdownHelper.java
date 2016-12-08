package com.test.webapp.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShutdownHelper
{
	private static final Logger log = LoggerFactory.getLogger(ShutdownHelper.class);
	
	public static void closeConnectionPools()
	{
		log.info("Closing opened connection pools...");
	}
	
	public void closeDatabaseConnectionPools()
	{
		log.info("Closing opened database connection pools...");
	}
}
