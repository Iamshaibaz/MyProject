package com.automationPractice.GenericUtility;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * this class contains basic configurations annotations of testng
 * 
 * @author shaibaz
 *
 */
public class BaseClass {
	
	
	/*Creating the objects */
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	
	 public static WebDriver driver;
	@BeforeSuite
	public void connectDB() throws SQLException 
	{
		//dLib.ConnectionDB();
		System.out.println("====DC Connection succesfull=======");
		
	}

   @BeforeClass

   public void configBC() throws Throwable

   {
	   //In this step we are launching the chrome
	   System.setProperty("webdriver.chrome.driver", "/home/raramuri/Downloads/chromedriver_linux64/chromedriver"); 
		
	   driver = new ChromeDriver();
	   String URL = fLib.getPropertyKeyValue("url");
	   //In this step we are fetching data from commmon properties
	   driver.get(URL);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   @BeforeMethod
   public void loginToApp() throws Throwable
   {
	 
	  System.out.println("login successful");
    }
   @AfterMethod
   public void logoutofApp()
   {
	  
	  System.out.println("signout successfull");
   }
   @AfterClass
   public void CloseBrowser() {
	driver.close();
	   System.out.println("browser close successfully");
   }
   @AfterSuite
   public void closeDB() throws SQLException
   {
	   //Database connection close
	   System.out.println("dm connection close suceessfully ");
   }
}
