package com.automationPractice.popRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.GenericUtility.BaseClass;
import com.automationPractice.GenericUtility.WebDriverUtility;

public class DressesPage extends BaseClass  {
	
	public DressesPage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
	private WebElement tShirtBtn;

	@FindBy(xpath =  "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line hovered']//span[contains(text(),'Add to cart')]")
	private WebElement addToCartDress;

	@FindBy(xpath = "//span[@title='Close window']")
	private WebElement DrssClsBtn;

	@FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
	private WebElement addTOCartDressImg;

	public WebElement getAddTOCartDressImg() {
		return addTOCartDressImg;
	}
	public WebElement getAddToCartDress() {
		return addToCartDress;
	}
	public WebElement getDrssClsBtn() {
		return DrssClsBtn;
	}
	public WebElement gettShirtBtn() {
		return tShirtBtn;
	}
	
	public void waitForAddtoCartBtn()
	{
		wLib.waitForElementVisibility(driver, addToCartDress);
	}
	public void waitForCloseButton()
	{
		wLib.waitForElementVisibility(driver, DrssClsBtn);
	}
	public void mouseHoverDressImg()
	{
		wLib.mouseHover(driver, addTOCartDressImg);
	}
	
	public void scrollAndaddToCardDress()
	{
		wLib.scrollToWebElement(driver, addToCartDress);
	}
	
	
	

}
