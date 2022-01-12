package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automationPractice.GenericUtility.BaseClass;
import com.automationPractice.popRepository.SummaryPage;

public class GettingText {

	@Test
	public void tc1()	
	{
		 System.setProperty("webdriver.chrome.driver", "/home/raramuri/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver = new ChromeDriver();
	  		driver.get("http://automationpractice.com/index.php?id_product=4&controller=product");
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		
		String print = driver.findElement(By.xpath("//h1[text()='Printed Dress']")).getText();
		System.out.println(print);
		
		driver.close();
	}
}