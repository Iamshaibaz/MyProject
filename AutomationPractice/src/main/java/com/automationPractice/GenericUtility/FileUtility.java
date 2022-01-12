package com.automationPractice.GenericUtility;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class FileUtility {
	
		/**
		 * author @SHAIBAZ
		 */
		/**
		 * This method used to read data from properties and return the value based on key specified 
		 * @param key
		 * @return
		 * @throws Throwable 
		 */
		public String getPropertyKeyValue(String key) throws Throwable	{
			FileInputStream file = new FileInputStream(IpathConstant.PROPERTY_FILEPATH);
			Properties prop = new Properties();
			prop.load(file);
			return prop.getProperty(key);
		}


	}	

