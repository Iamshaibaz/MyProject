package com.automationPractice.GenericUtility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {
	public void waitUntillPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void waitForElementVisibility(WebDriver driver ,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	/*
	 * this method wait for the element to be clicked 
	 * @param element
	 * @throws throwable
	 */
public void waitAndClick(WebElement element)throws InterruptedException
{
	int count = 0;
	while(count<40) {
		try {
			element.click();
			break;
		}
		catch(Throwable e)
		{
			Thread.sleep(1000);
			count++;
			
		}
	}
}

/*this methods enable user to handle dropdown using visible text
@param element
@param option*/
public void SelectOption(WebElement element, String option) {
	Select select = new Select(element);
	select.selectByVisibleText(option);
}
/*
 * this method will perform mouse over action @param driver @param element
 */
public void SelectOption(WebElement element,int index)
{
	Select select = new Select(element);
	select.selectByIndex(index);
}/*this method will perform mouse over action
@param driver	
@param element
*/public void mouseHover(WebDriver driver,WebElement element)
{
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
	
	
}/*this method performs right  click operation
@param driver
@param element
*/


public void rightClick(WebDriver driver,WebElement element)
{
	Actions act = new Actions(driver);
	act.contextClick(element).perform();
	
}/*
this methods help to switch from one window to another @param driver
@param partialWinTitle
*/
public void switchToWindow(WebDriver driver , String partialWinTitle) {
 Set<String> window = driver.getWindowHandles();
	Iterator<String>it = window.iterator();
	while(it.hasNext()) {
		String winId = it.next();
		String title = driver.switchTo().window(winId).getTitle();
		if(title.contains(partialWinTitle))
		{
			break;
		}
	}
	
}
public void acceptAlert(WebDriver driver)
{
	driver.switchTo().alert().accept();
	/*cancel alert	,@param driver*/
}
public void cancelAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();	
}/*this method used for scrolling action in a webpage
@param driver
@param element	
*/
public void scrollToWebElement(WebDriver driver, WebElement element)
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
//int y = element.getLocation().getY();
//	WebElement element = driver.findElement(By.xpath("(//(i[@title='Rename' and ng-click='editCampaignName($index)'])[1]"));
//js.executeScript("window.scrollBy(0,"+y+")", element);
js.executeScript("arguments[0].click()",element );
}
public void switchFrame(WebDriver driver ,int index) {
	driver.switchTo().frame(index);
}
public void swtichFrame(WebDriver driver ,WebElement element)
{
	driver.switchTo().frame(element);
	
}
public void switchFrame(WebDriver driver,String idOrName) {
	driver.switchTo().frame(idOrName);
}
public String takeScreenshot(WebDriver driver,String screenshotName)throws Throwable {
	String screenshotPath="./screenshot/"+screenshotName+JavaUtility.getCurrentDate()+".PNG";
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(screenshotPath);
	Files.copy(src,dest);
	return screenshotPath;
}
public void pressEnterKey() throws Throwable{
	Robot rc = new Robot();
	rc.keyPress(KeyEvent.VK_ENTER);
	rc.keyPress(KeyEvent.VK_ENTER);

}
}