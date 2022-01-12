package com.automationPractice.GenericUtility;

import java.util.Random;
import java.util.Date;



public class JavaUtility {
	public int getRandomData()
	{
		Random random = new Random();
		int ran = random.nextInt(1000);
		return ran;
	}


/*author @shaibaz
 * 
 *
 */
  //**  this method is used to generate currrentdat   @return currentdate **/

public static String getCurrentDate()
{
	Date date = new Date();
	String currentdate = date.toString();
	return currentdate;
}


public static String getSystemDate() {
	Date date = new Date();
	return date.toString().replaceAll(" ","_").replace(":", "_");
	
}}