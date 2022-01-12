package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automationPractice.GenericUtility.ExcelUtility;

public class Tc1 {
	
	@Test
	public void tc1() throws Throwable	
	{
		 System.setProperty("webdriver.chrome.driver", "/home/raramuri/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
  		driver.get("https://www.google.com/");
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		
  		 
 		
  		ExcelUtility eLib= new ExcelUtility();
  		String txt = eLib.getExelData("Sheet1", 2, 2);
  		System.out.println(txt);
  		
  		//clicking dresses
  		//driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
  		
  		//selecting the dress
  		//driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
  		
  		//clicking on tshirt
  		//driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
  		//selecting tshirt
  	//	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
  		
  		//after adding tshirt closing the popup
  		//driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
  		
  		
  		//clicking on proceed to checkout
  		//driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
  		//driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	
  	driver.close();
  		
  		
	}

}






//*[@id="block_top_menu"]/ul/li[2]/a