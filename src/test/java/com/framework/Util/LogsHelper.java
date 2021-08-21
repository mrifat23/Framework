package com.framework.Util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogsHelper {
	
private static boolean root=false;
	
	public static Logger getLogs(Class logsVariable){
		if(root){
			return Logger.getLogger(logsVariable);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(logsVariable);
	}
	
}
